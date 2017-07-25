package edu.kit.ipd.sdq.kamp4aps4req.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps.core.ChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure;
import options.Option;
import relations.DependencyObject;
import relations.TraceableObject;
import requirements.Requirement;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

/**
 * The change propagation analysis of KAMP4APS4Req:
 * <ol>
 * <li>determines a seed population of affected components</li>
 * <li>calculates propagation</li>
 * <li>generates internal modification marks for affected elements</li>
 * </ol>
 *
 * @author Max Peters
 */
public class APSReqChangePropagationAnalysis implements AbstractChangePropagationAnalysis<APSReqArchitectureVersion> {

	private ChangePropagationAnalysis changePropagationAnalysis;

	private APSReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies;

	private Collection<Decision> markedDecisions;
	private Collection<Option> markedOptions;
	private Collection<Requirement> markedRequirements;

	// Inherited from KAMP4Req
	@Override
	public void runChangePropagationAnalysis(APSReqArchitectureVersion version) {

		// Create only one modification mark per element in this propagation
		// step
		Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep = new HashMap<EObject, AbstractModification<?, EObject>>();

		prepareAnalysis(version);

		calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
		getChangePropagationAnalysis().runChangePropagationAnalysis(version);
	}

	// Inherited from KAMP4Req
	private void prepareAnalysis(APSReqArchitectureVersion version) {
		setChangePropagationAnalysis(new ChangePropagationAnalysis());
		setAPSReqChangePropagationDueToSpecificationDependencies(
				APSReqModificationmarksFactory.eINSTANCE.createAPSReqChangePropagationDueToSpecificationDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps()
				.add(getAPSReqChangePropagationDueToSpecificationDependencies());
		setMarkedRequirements(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Requirement.class));
		setMarkedDecisions(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Decision.class));
		setMarkedOptions(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(version, Option.class));
	}

	// Inherited from KAMP4Req, modified step 5 and 6
	public void calculateRequirementsToArchitecturePropagation(APSReqArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// 1 Requirement -> Requirement (depend)
		Map<Requirement, Set<DependencyObject>> requirementsToBeMarked = APSReqArchitectureModelLookup
				.lookUpObjectsDependOnObjects(getMarkedRequirements(), Requirement.class);
		this.createAndAddRequirementModifications(requirementsToBeMarked, elementsMarkedInThisStep);
		// 2 Requirement -> Decision/Option (trigger, resolve, couldResolve)
		calculateAndMarkRequirementToDecisionAndOptionPropagation(elementsMarkedInThisStep);
		// 3 Decision -> Decision (depend)
		Map<Decision, Set<DependencyObject>> decisionsToBeMarked = APSReqArchitectureModelLookup
				.lookUpObjectsDependOnObjects(getMarkedDecisions(), Decision.class);
		this.createAndAddDecisionModifications(decisionsToBeMarked, elementsMarkedInThisStep);
		// 4 Option -> Option (depend)
		Map<Option, Set<DependencyObject>> optionsToBeMarked = APSReqArchitectureModelLookup
				.lookUpObjectsDependOnObjects(getMarkedOptions(), Option.class);
		this.createAndAddOptionModifications(optionsToBeMarked, elementsMarkedInThisStep);
		// 5 Decision -> AutomatedProductionSystems
		calculateAndMarkDecisionToAutomatedProductionSystemsPropagation(version, elementsMarkedInThisStep);
		// 6 Option -> AutomatedProductionSystems
		calculateAndMarkOptionToAutomatedProductionSystemsPropagation(version, elementsMarkedInThisStep);
		// Remove step if it contains no element
		if (getAPSReqChangePropagationDueToSpecificationDependencies().eContents().isEmpty()) {
			version.getModificationMarkRepository().getChangePropagationSteps()
					.remove(getAPSReqChangePropagationDueToSpecificationDependencies());
		}
	}

	protected void calculateAndMarkDecisionToAutomatedProductionSystemsPropagation(APSReqArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Decision -> Component
		Map<Component, Set<Decision>> componentsToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUComponentsReferencedByDecisions(version, getMarkedDecisions());
		createAndAddXPPUComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// II Decision -> Interface
		Map<Interface, Set<Decision>> interfacesToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUInterfacesReferencedByDecisions(version, getMarkedDecisions());
		createAndAddXPPUInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		// III Decision -> Structure
		Map<Structure, Set<Decision>> structuresToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUStructuresReferencedByDecisions(version, getMarkedDecisions());
		createAndAddXPPUStructureModifications(structuresToBeMarked, elementsMarkedInThisStep);
		// IV Decision -> Module
		Map<Module, Set<Decision>> modulesToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUModulesReferencedByDecisions(version, getMarkedDecisions());
		createAndAddXPPUModuleModifications(modulesToBeMarked, elementsMarkedInThisStep);
	}

	protected void calculateAndMarkOptionToAutomatedProductionSystemsPropagation(APSReqArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Option -> Component
		Map<Component, Set<Option>> componentsToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUComponentsReferencedByOptions(version, getMarkedOptions());
		createAndAddXPPUComponentModifications(componentsToBeMarked, elementsMarkedInThisStep);
		// II Option -> Interface
		Map<Interface, Set<Option>> interfacesToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUInterfacesReferencedByOptions(version, getMarkedOptions());
		createAndAddXPPUInterfaceModifications(interfacesToBeMarked, elementsMarkedInThisStep);
		// III Option -> Structure
		Map<Structure, Set<Option>> structuresToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUStructuresReferencedByOptions(version, getMarkedOptions());
		createAndAddXPPUStructureModifications(structuresToBeMarked, elementsMarkedInThisStep);
		// IV Option -> Module
		Map<Module, Set<Option>> modulesToBeMarked = APSReqArchitectureModelLookup
				.lookUpXPPUModulesReferencedByOptions(version, getMarkedOptions());
		createAndAddXPPUModuleModifications(modulesToBeMarked, elementsMarkedInThisStep);
	}

	// Inherited from KAMP4Req
	protected void calculateAndMarkRequirementToDecisionAndOptionPropagation(
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Requirement -> Decision (trigger, resolve, couldResolve)
		Map<Decision, Set<EObject>> decisionsToBeMarked = new HashMap<Decision, Set<EObject>>();
		MapUtil.putOrAddToMap(decisionsToBeMarked,
				APSReqArchitectureModelLookup.lookUpDecisionsTriggeredByTriggerObjects(getMarkedRequirements()));
		MapUtil.putOrAddToMap(decisionsToBeMarked,
				APSReqArchitectureModelLookup.lookUpDecisionsResolvingResolveObjects(getMarkedRequirements()));
		MapUtil.putOrAddToMap(decisionsToBeMarked,
				APSReqArchitectureModelLookup.lookUpDecisionsCouldBeResolvingResolveObjects(getMarkedRequirements()));
		this.createAndAddDecisionModifications(decisionsToBeMarked, elementsMarkedInThisStep);
		// II Requirement -> Option (trigger, resolve, couldResolve)
		Map<Option, Set<EObject>> optionsToBeMarked = new HashMap<Option, Set<EObject>>();
		MapUtil.putOrAddToMap(optionsToBeMarked,
				APSReqArchitectureModelLookup.lookUpOptionsTriggeredByTriggerObjects(getMarkedRequirements()));
		MapUtil.putOrAddToMap(optionsToBeMarked,
				APSReqArchitectureModelLookup.lookUpOptionsResolvingResolveObjects(getMarkedRequirements()));
		MapUtil.putOrAddToMap(optionsToBeMarked,
				APSReqArchitectureModelLookup.lookUpOptionsCouldBeResolvingResolveObjects(getMarkedRequirements()));
		this.createAndAddOptionModifications(optionsToBeMarked, elementsMarkedInThisStep);
	}

	// Inherited from KAMP4Req
	private <S extends EObject> void createAndAddDecisionModifications(Map<Decision, Set<S>> decisionsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(decisionsToBeMarked, elementsMarkedInThisStep);
		for (Map.Entry<Decision, Set<S>> decisionToBeMarkedEntry : decisionsToBeMarked.entrySet()) {
			Decision decision = decisionToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(decision)) {
				elementsMarkedInThisStep.get(decision).getCausingElements().addAll(decisionToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyDecision modifyDecision = APSReqModificationmarksFactory.eINSTANCE
						.createAPSReqModifyDecision();
				modifyDecision.setToolderived(true);
				modifyDecision.setAffectedElement(decision);
				modifyDecision.getCausingElements().addAll(decisionToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(decision, modifyDecision);
				getMarkedDecisions().add(decision);
				getAPSReqChangePropagationDueToSpecificationDependencies().getDecisionModifications()
						.add(modifyDecision);
			}
		}
	}

	// Inherited from KAMP4Req
	private <S extends EObject> void createAndAddOptionModifications(Map<Option, Set<S>> optionsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(optionsToBeMarked, elementsMarkedInThisStep);
		for (Map.Entry<Option, Set<S>> optionToBeMarkedEntry : optionsToBeMarked.entrySet()) {
			Option option = optionToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(option)) {
				elementsMarkedInThisStep.get(option).getCausingElements().addAll(optionToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyOption modifyOption = APSReqModificationmarksFactory.eINSTANCE.createAPSReqModifyOption();
				modifyOption.setToolderived(true);
				modifyOption.setAffectedElement(option);
				modifyOption.getCausingElements().addAll(optionToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(option, modifyOption);
				getMarkedOptions().add(option);
				getAPSReqChangePropagationDueToSpecificationDependencies().getOptionModifications().add(modifyOption);
			}
		}
	}

	// Inherited from KAMP4Req
	private <S extends EObject> void createAndAddRequirementModifications(
			Map<Requirement, Set<S>> requirementsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(requirementsToBeMarked, elementsMarkedInThisStep);
		for (Map.Entry<Requirement, Set<S>> requirementToBeMarkedEntry : requirementsToBeMarked.entrySet()) {
			Requirement requirement = requirementToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(requirement)) {
				elementsMarkedInThisStep.get(requirement).getCausingElements()
						.addAll(requirementToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyRequirement modifyRequirement = APSReqModificationmarksFactory.eINSTANCE
						.createAPSReqModifyRequirement();
				modifyRequirement.setToolderived(true);
				modifyRequirement.setAffectedElement(requirement);
				modifyRequirement.getCausingElements().addAll(requirementToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(requirement, modifyRequirement);
				getMarkedRequirements().add(requirement);
				getAPSReqChangePropagationDueToSpecificationDependencies().getRequirementModifications()
						.add(modifyRequirement);
			}
		}
	}

	private <T extends TraceableObject> void createAndAddXPPUComponentModifications(
			Map<Component, Set<T>> componentsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Component, Set<T>> componentToBeMarkedEntry : componentsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(componentToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(componentToBeMarkedEntry.getKey()).getCausingElements()
						.addAll(componentToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyComponent modifyComponent = APSReqModificationmarksFactory.eINSTANCE
						.createAPSReqModifyComponent();
				modifyComponent.setToolderived(true);
				modifyComponent.setAffectedElement(componentToBeMarkedEntry.getKey());
				modifyComponent.getCausingElements().addAll(componentToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(componentToBeMarkedEntry.getKey(), modifyComponent);
				getAPSReqChangePropagationDueToSpecificationDependencies().getComponentModifications()
						.add(modifyComponent);
			}
		}
	}

	private <T extends TraceableObject> void createAndAddXPPUInterfaceModifications(
			Map<Interface, Set<T>> interfacesToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Interface, Set<T>> interfaceToBeMarkedEntry : interfacesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(interfaceToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(interfaceToBeMarkedEntry.getKey()).getCausingElements()
						.addAll(interfaceToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyInterface modifyInterface = APSReqModificationmarksFactory.eINSTANCE
						.createAPSReqModifyInterface();
				modifyInterface.setToolderived(true);
				modifyInterface.setAffectedElement(interfaceToBeMarkedEntry.getKey());
				modifyInterface.getCausingElements().addAll(interfaceToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(interfaceToBeMarkedEntry.getKey(), modifyInterface);
				getAPSReqChangePropagationDueToSpecificationDependencies().getInterfaceModifications()
						.add(modifyInterface);
			}
		}
	}

	private <T extends TraceableObject> void createAndAddXPPUStructureModifications(
			Map<Structure, Set<T>> structuresToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Structure, Set<T>> structureToBeMarkedEntry : structuresToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(structureToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(structureToBeMarkedEntry.getKey()).getCausingElements()
						.addAll(structureToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyStructure modifyStructure = APSReqModificationmarksFactory.eINSTANCE
						.createAPSReqModifyStructure();
				modifyStructure.setToolderived(true);
				modifyStructure.setAffectedElement(structureToBeMarkedEntry.getKey());
				modifyStructure.getCausingElements().addAll(structureToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(structureToBeMarkedEntry.getKey(), modifyStructure);
				getAPSReqChangePropagationDueToSpecificationDependencies().getStructureModifications()
						.add(modifyStructure);
			}
		}
	}

	private <T extends TraceableObject> void createAndAddXPPUModuleModifications(Map<Module, Set<T>> modulesToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Module, Set<T>> moduleToBeMarkedEntry : modulesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(moduleToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(moduleToBeMarkedEntry.getKey()).getCausingElements()
						.addAll(moduleToBeMarkedEntry.getValue());
			}
			else {
				APSReqModifyModule modifyModule = APSReqModificationmarksFactory.eINSTANCE.createAPSReqModifyModule();
				modifyModule.setToolderived(true);
				modifyModule.setAffectedElement(moduleToBeMarkedEntry.getKey());
				modifyModule.getCausingElements().addAll(moduleToBeMarkedEntry.getValue());

				elementsMarkedInThisStep.put(moduleToBeMarkedEntry.getKey(), modifyModule);
				getAPSReqChangePropagationDueToSpecificationDependencies().getModuleModifications().add(modifyModule);
			}
		}
	}

	private APSReqChangePropagationDueToSpecificationDependencies getAPSReqChangePropagationDueToSpecificationDependencies() {
		return changePropagationDueToSpecificationDependencies;
	}

	private ChangePropagationAnalysis getChangePropagationAnalysis() {
		return changePropagationAnalysis;
	}

	private Collection<Decision> getMarkedDecisions() {
		return markedDecisions;
	}

	private Collection<Option> getMarkedOptions() {
		return markedOptions;
	}

	private Collection<Requirement> getMarkedRequirements() {
		return markedRequirements;
	}

	private void setAPSReqChangePropagationDueToSpecificationDependencies(
			APSReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies) {
		this.changePropagationDueToSpecificationDependencies = changePropagationDueToSpecificationDependencies;
	}

	private void setChangePropagationAnalysis(ChangePropagationAnalysis changePropagationAnalysis) {
		this.changePropagationAnalysis = changePropagationAnalysis;
	}

	private void setMarkedDecisions(Collection<Decision> markedDecisions) {
		this.markedDecisions = markedDecisions;
	}

	private void setMarkedOptions(Collection<Option> markedOptions) {
		this.markedOptions = markedOptions;
	}

	private void setMarkedRequirements(Collection<Requirement> markedRequirements) {
		this.markedRequirements = markedRequirements;
	}

	/**
	 * The specification propagation is calculated forwards and backwards. If an
	 * element 2 was marked because of an element 1 in the forward propagation,
	 * it would be misleading to create a modification of element 1 just because
	 * of the opposite reference from element 2 in the backward propagation
	 * (king of circular reference). Therefore, this method checks all causes
	 * for a potentially modified element and finds out if these causes belong
	 * the existing modifications that were caused by the potentially modified
	 * element. If so, the cause is removed (and if there are no causes left,
	 * then the whole entry).
	 */
	// Inherited from KAMP4Req
	private static <S extends EObject, T extends TraceableObject> void filterCircularCauses(
			Map<T, Set<S>> objectsToBeMarked, Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		Map<T, Set<S>> circularMarks = new HashMap<T, Set<S>>();
		for (Map.Entry<T, Set<S>> objectsToBeMarkedEntry : objectsToBeMarked.entrySet()) {
			for (S causingObject : objectsToBeMarkedEntry.getValue()) {
				if (elementsMarkedInThisStep.containsKey(causingObject) && elementsMarkedInThisStep.get(causingObject)
						.getCausingElements().contains(objectsToBeMarkedEntry.getKey())) {
					MapUtil.putOrAddToMap(circularMarks, objectsToBeMarkedEntry.getKey(), causingObject);
				}
			}
		}
		MapUtil.removeAllFromMap(objectsToBeMarked, circularMarks);
	}

}
