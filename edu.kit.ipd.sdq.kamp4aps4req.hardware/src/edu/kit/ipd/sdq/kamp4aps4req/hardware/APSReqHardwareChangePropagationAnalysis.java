package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import decisions.Decision;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqModifyEntity;
import options.Option;
import relations.TraceableObject;


/**
 * Change Propagation Analysis of KAMP4aPS4Req for the hardware module.
 * Uses the KAMP4aPS change propagation analysis.
 * 
 * @author Timo Maier
 *
 */
public class APSReqHardwareChangePropagationAnalysis extends AbstractAPSReqChangePropagationAnalysis<APSReqHardwareArchitectureVersion> {

	private APSChangePropagationAnalysis apsChangePropagationAnalysis;


	@Override
	/**
	 * Runs the change propagation analysis.
	 * @param version The hardware architecture version
	 */
	public void runChangePropagationAnalysis(APSReqHardwareArchitectureVersion version) {
		// Create only one modification mark per element in this step
		Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?, EObject>>();
		
		// Preparation
		this.prepareAnalysis(version);
		
		// Calculate Req to Architecture propagation
		this.calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
		
		// Run APS-Specific Change Propagation Analysis
		this.getApsChangePropagationAnalysis().runChangePropagationAnalysis(version);
	}
	
	protected void prepareAnalysis(APSReqHardwareArchitectureVersion version) {
		this.setApsChangePropagationAnalysis(new APSChangePropagationAnalysis());
		// set the hardware subclass to take care of Structure/Module/Component/Interface modifications
		this.setChangePropagationDueToSpecificationDependencies(
				APSReqHardwareModificationmarksFactory.eINSTANCE.createAPSReqHardwareChangePropagationDueToSpecificationDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps().add(
				this.getChangePropagationDueToSpecificationDependencies());
		super.prepareAnalysis(version);
	}
	
	@Override
	/**
	 * Calculates Requirements change propagation to the (hardware) architecture
	 * @param version Architecture Version
	 * @param elementsMarkedInThisStep Marked elements
	 */
	public void calculateRequirementsToArchitecturePropagation(APSReqHardwareArchitectureVersion version, 
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
	
	/**
	 * Calculates the propagation of Option changes to the architecture
	 * @param version The Architecture Version to work with
	 * @param elementsMarkedInThisStep Marked elements
	 */
	private void calculateAndMarkOptionToArchitecturePropagation(APSReqHardwareArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// Option -> Entity
		Map<Entity, Set<Option>> entitiesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpEntitiesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddEntityModifications(entitiesToBeMarked, elementsMarkedInThisStep);
	}
	
	/**
	 * Calculates the propagation of Decision changes to the architecture
	 * @param version The Architecture Version to work with
	 * @param elementsMarkedInThisStep Marked elements
	 */
	private void calculateAndMarkDecisionToArchitecturePropagation(
			APSReqHardwareArchitectureVersion version, Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Decision -> Entity
		Map<Entity, Set<Decision>> entitiesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpEntitiesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddEntityModifications(entitiesToBeMarked, elementsMarkedInThisStep);
	}

	private <T extends TraceableObject> void createAndAddEntityModifications(
			Map<Entity, Set<T>> entitiesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Entity, Set<T>> entitiesToBeMarkedEntry: entitiesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(entitiesToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(entitiesToBeMarkedEntry.getKey()).
						getCausingElements().addAll(entitiesToBeMarkedEntry.getValue());
			} else {
				APSReqModifyEntity modifyEntity = APSReqHardwareModificationmarksFactory.eINSTANCE.createAPSReqModifyEntity();
				modifyEntity.setToolderived(true);
				modifyEntity.setAffectedElement(entitiesToBeMarkedEntry.getKey());
				modifyEntity.getCausingElements().addAll(entitiesToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(entitiesToBeMarkedEntry.getKey(), modifyEntity);
				//  cast to hardware change propagation step (set in prepareAnalysis so we can be sure of conversion)
				APSReqHardwareChangePropagationDueToSpecificationDependencies hardwareChanges = 
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) this.getChangePropagationDueToSpecificationDependencies();
				hardwareChanges.getEntityModifications().add(modifyEntity);
			}
		}
	}
	
	public APSChangePropagationAnalysis getApsChangePropagationAnalysis() {
		return apsChangePropagationAnalysis;
	}

	public void setApsChangePropagationAnalysis(APSChangePropagationAnalysis apsChangePropagationAnalysis) {
		this.apsChangePropagationAnalysis = apsChangePropagationAnalysis;
	}
	
}