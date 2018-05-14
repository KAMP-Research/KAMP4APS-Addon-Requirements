package edu.kit.ipd.sdq.kamp4aps4req.software;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqModifyIECComponent;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.core.IECChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import options.Option;
import relations.TraceableObject;

/**
 * Change Propagation Analysis of KAMP4aPS4Req for the software part.
 * Uses the KAMP4IEC change propagation analysis.
 * 
 * @author Timo Maier
 * 
 */
public class APSReqSoftwareChangePropagationAnalysis extends AbstractAPSReqChangePropagationAnalysis<APSReqSoftwareArchitectureVersion> {
	
	private IECChangePropagationAnalysis iecChangePropagationAnalysis;
	

	@Override
	/**
	 * Runs the change propagation analysis.
	 * @param version The software architecture version
	 */
	public void runChangePropagationAnalysis(APSReqSoftwareArchitectureVersion version) {
		// Create only one modification mark per element in this step
		Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?, EObject>>();
				
		// Preparation
		this.prepareAnalysis(version);
		
		// Calculate Req to architecture propagation
		this.calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
		
		// add new seed modifications resulting from previous step
		this.addIECSeedModifications(version);
		
		// Run IEC-Specific Change Propagation Analysis
		this.getIecChangePropagationAnalysis().runChangePropagationAnalysis(version);
	}
	
	protected void prepareAnalysis(APSReqSoftwareArchitectureVersion version) {
		this.setIecChangePropagationAnalysis(new IECChangePropagationAnalysis());
		// set the software subclass to take care of IECComponent modifications
		this.setChangePropagationDueToSpecificationDependencies(
				APSReqSoftwareModificationmarksFactory.eINSTANCE.createAPSReqSoftwareChangePropagationDueToSpecificationDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps().add(this.getChangePropagationDueToSpecificationDependencies());
		super.prepareAnalysis(version);
	}
	
	@Override
	/**
	 * Calculates Requirements change propagation to the (software) architecture
	 * @param version Architecture Version
	 * @param elementsMarkedInThisStep Marked elements
	 */
	public void calculateRequirementsToArchitecturePropagation(APSReqSoftwareArchitectureVersion version, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		super.calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
		// 5 Decision -> Architecture (select an option)
		calculateAndMarkDecisionToArchitecturePropagation(version, elementsMarkedInThisStep);
		// 6 Option -> Architecture
		calculateAndMarkOptionToArchitecturePropagation(version, elementsMarkedInThisStep);
				
		//Remove step if it contains no element
		if (this.getChangePropagationDueToSpecificationDependencies().eContents().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps().remove(
					this.getChangePropagationDueToSpecificationDependencies());
		}
	}
	

	private void calculateAndMarkOptionToArchitecturePropagation(APSReqSoftwareArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// Option -> IECComponent
		Map<IECComponent, Set<Option>> iecComponentsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookupIECComponentsReferencedByOptions(version, this.getMarkedOptions());
		createAndAddIECComponentModifications(iecComponentsToBeMarked, elementsMarkedInThisStep);
	}		

	
	private void calculateAndMarkDecisionToArchitecturePropagation(APSReqSoftwareArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// Decision -> IECComponent
		Map<IECComponent, Set<Decision>> iecComponentsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookupIECComponentsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddIECComponentModifications(iecComponentsToBeMarked, elementsMarkedInThisStep);
	}	


	private <T extends TraceableObject> void createAndAddIECComponentModifications(
			Map<IECComponent, Set<T>> iecComponentsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<IECComponent, Set<T>> iecComponentsToBeMarkedEntry: iecComponentsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(iecComponentsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(iecComponentsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(iecComponentsToBeMarkedEntry.getValue());
			} else {
				APSReqModifyIECComponent modifyIECComponent = 
						APSReqSoftwareModificationmarksFactory.eINSTANCE.createAPSReqModifyIECComponent();
				modifyIECComponent.setToolderived(true);
				modifyIECComponent.setAffectedElement(iecComponentsToBeMarkedEntry.getKey());
				modifyIECComponent.getCausingElements().addAll(iecComponentsToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(iecComponentsToBeMarkedEntry.getKey(), modifyIECComponent);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getIecComponentModifications().add(modifyIECComponent);
			}
		}
	}
	
	/**
	 * Adds the affected element of each "Modify IECComponent" to the seed modifications to be used in the 
	 * IEC change propagation analysis
	 * @param version
	 */	
	private void addIECSeedModifications(APSReqSoftwareArchitectureVersion version) {
		Collection<IECComponent> seedModifications = iecChangePropagationAnalysis.getSeedModifications();
	
		
		APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
				(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
				this.getChangePropagationDueToSpecificationDependencies();
		for (APSReqModifyIECComponent iecComponent : softwareChanges.getIecComponentModifications()) {
			if (iecComponent.getAffectedElement() != null) {
				if (!seedModifications.contains(iecComponent.getAffectedElement())) {
					seedModifications.add(iecComponent.getAffectedElement());
				}
			}
		}
	}

	public IECChangePropagationAnalysis getIecChangePropagationAnalysis() {
		return iecChangePropagationAnalysis;
	}

	public void setIecChangePropagationAnalysis(IECChangePropagationAnalysis iecChangePropagationAnalysis) {
		this.iecChangePropagationAnalysis = iecChangePropagationAnalysis;
	}
	
}
