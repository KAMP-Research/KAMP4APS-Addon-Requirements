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
		
		/*
		
		// I Option -> Structure
		Map<Structure, Set<Option>> structuresToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpStructuresReferencedByOptions(version, this.getMarkedOptions());
		createAndAddEntityModifications(structuresToBeMarked, elementsMarkedInThisStep);
		// II Option -> Module
		Map<Module, Set<Option>> modulesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpModulesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddModuleModifications(modulesToBeMarked, elementsMarkedInThisStep);
		// III Option -> Component
		Map<Component, Set<Option>> componentsToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpComponentsReferencedByOptions(version, this.getMarkedOptions());
		createAndAddComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// IV Option -> Interface
		Map<Interface, Set<Option>> interfacesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpInterfacesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		
		*/
	
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
	
	
		/*
		// I Decision -> Structure
		Map<Structure, Set<Decision>> structuresToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpStructuresReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddStructureModifications(structuresToBeMarked, elementsMarkedInThisStep);
		// II Decision -> Module
		Map<Module, Set<Decision>> modulesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpModulesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddModuleModifications(modulesToBeMarked, elementsMarkedInThisStep);
		// III Decision -> Component
		Map<Component, Set<Decision>> componentsToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpComponentsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// IV Decision -> Interface
		Map<Interface, Set<Decision>> interfacesToBeMarked = APSReqHardwareArchitectureModelLookup.
				lookUpInterfacesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		*/
	
	// new entity modifications
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
	
	/*
	
	private <T extends TraceableObject, S extends Entity> void createAndAddStructureModifications(
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
				//  cast to hardware change propagation step (set in prepareAnalysis so we can be sure of conversion)
				APSReqHardwareChangePropagationDueToSpecificationDependencies hardwareChanges = 
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) this.getChangePropagationDueToSpecificationDependencies();
				hardwareChanges.getStructureModifications().add(modifyStructure);
			}
		}
	}

	private <T extends TraceableObject> void createAndAddModuleModifications(
			Map<Module, Set<T>> modulesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Module, Set<T>> modulesToBeMarkedEntry: modulesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(modulesToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(modulesToBeMarkedEntry.getKey()).
						getCausingElements().addAll(modulesToBeMarkedEntry.getValue());
			} else {
				ModifyModule<Module> modifyModule = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyModule();
				modifyModule.setToolderived(true);
				modifyModule.setAffectedElement(modulesToBeMarkedEntry.getKey());
				modifyModule.getCausingElements().addAll(modulesToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(modulesToBeMarkedEntry.getKey(), modifyModule);
				APSReqHardwareChangePropagationDueToSpecificationDependencies hardwareChanges = 
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) this.getChangePropagationDueToSpecificationDependencies();
				hardwareChanges.getModuleModifications().add(modifyModule);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddComponentModifications(
			Map<Component, Set<T>> componentsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Component, Set<T>> componentsToBeMarkedEntry: componentsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(componentsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(componentsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(componentsToBeMarkedEntry.getValue());
			} else {
				ModifyComponent<Component> modifyComponent = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyComponent();
				modifyComponent.setToolderived(true);
				modifyComponent.setAffectedElement(componentsToBeMarkedEntry.getKey());
				modifyComponent.getCausingElements().addAll(componentsToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(componentsToBeMarkedEntry.getKey(), modifyComponent);
				APSReqHardwareChangePropagationDueToSpecificationDependencies hardwareChanges = 
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) this.getChangePropagationDueToSpecificationDependencies();
				hardwareChanges.getComponentModifications().add(modifyComponent);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddInterfaceModifications(
			Map<Interface, Set<T>> interfacesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Interface, Set<T>> interfacesToBeMarkedEntry: interfacesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(interfacesToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(interfacesToBeMarkedEntry.getKey()).
						getCausingElements().addAll(interfacesToBeMarkedEntry.getValue());
			} else {
				ModifyInterface<Interface> modifyInterface = KAMP4aPSModificationmarksFactory.eINSTANCE.createModifyInterface();
				modifyInterface.setToolderived(true);
				modifyInterface.setAffectedElement(interfacesToBeMarkedEntry.getKey());
				modifyInterface.getCausingElements().addAll(interfacesToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(interfacesToBeMarkedEntry.getKey(), modifyInterface);
				APSReqHardwareChangePropagationDueToSpecificationDependencies hardwareChanges = 
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) this.getChangePropagationDueToSpecificationDependencies();
				hardwareChanges.getInterfaceModifications().add(modifyInterface);
			}
		}
	}
	
	*/
	

	public APSChangePropagationAnalysis getApsChangePropagationAnalysis() {
		return apsChangePropagationAnalysis;
	}

	public void setApsChangePropagationAnalysis(APSChangePropagationAnalysis apsChangePropagationAnalysis) {
		this.apsChangePropagationAnalysis = apsChangePropagationAnalysis;
	}
	
}
