package edu.kit.ipd.sdq.kamp4aps4req.hardware;


import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.DataType;

import apshardwareoptions.APSReqHardwareOption;
import apsoptions.APSReqOption;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import options.Option;
import relations.TraceableObject;

/**
 * Change Propagation Analysis of KAMP4aPS4Req for the hardware part.
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
		// Preparation
		this.setApsChangePropagationAnalysis(new APSChangePropagationAnalysis());
		
		// Run KAMP4aPS4Req Change Propagation Analysis
		super.runChangePropagationAnalysis(version);
		
		// IEC-Specific Change Propagation Analysis
		this.getApsChangePropagationAnalysis().runChangePropagationAnalysis(version.getApsArchitectureVersion());
		
		// Update
	}
	
	protected void calculateAndMarkOptionToArchitecturePropagation(APSReqHardwareArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Option -> Structure
		Map<Structure, Set<APSReqHardwareOption>> structuresToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpStructuresReferencedByOptions(version, this.getMarkedOptions());
		createAndAddStructureModifications(structuresToBeMarked, elementsMarkedInThisStep);
		// II Option -> Module
		Map<Module, Set<Option>> interfacesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpModulesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		// III Option -> Component
		Map<Component, Set<Decision>> componentsToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpComponentsReferencedByOptions(version, this.getMarkedDecisions());
		createAndAddComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// IV Option -> Interface
		Map<Interface, Set<APSReqHardwareOption<Interface>>> entitiesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpInterfacesReferencedByOptions(version, (Collection<APSReqHardwareOption<Interface>>) this.getMarkedOptions());
		createAndAddEntityModifications(entitiesToBeMarked, elementsMarkedInThisStep);
	}
	
	private <T extends TraceableObject> void createAndAddStructureModifications(
			Map<Structure, Set<T>> structuresToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Structure, Set<T>> structuresToBeMarkedEntry: structuresToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(structuresToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(structuresToBeMarkedEntry.getKey()).
						getCausingElements().addAll(structuresToBeMarkedEntry.getValue());
			} else {
				ModifyStructure<Structure> modifyStructure = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyStructure();
				modifyStructure.setToolderived(true);
				modifyStructure.setAffectedElement(structuresToBeMarkedEntry.getKey());
				modifyStructure.getCausingElements().addAll(structuresToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(structuresToBeMarkedEntry.getKey(), modifyStructure);
				this.getApsChangePropagationDueToSpecificationDependencies().
						getStructureModifications().add(modifyStructure);
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
