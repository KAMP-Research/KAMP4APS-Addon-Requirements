package edu.kit.ipd.sdq.kamp4aps4req.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import apsoptions.xPPU_ChangeComponent;
import apsoptions.xPPU_ChangeInterface;
import apsoptions.xPPU_ChangeModule;
import apsoptions.xPPU_ChangeStructure;
import apsoptions.xPPU_IntroduceNewComponent;
import apsoptions.xPPU_IntroduceNewInterface;
import apsoptions.xPPU_IntroduceNewModule;
import apsoptions.xPPU_IntroduceNewStructure;
import apsoptions.xPPU_RemoveComponent;
import apsoptions.xPPU_RemoveInterface;
import apsoptions.xPPU_RemoveModule;
import apsoptions.xPPU_RemoveStructure;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import options.Option;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.TriggerObject;
import requirements.Requirement;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public class APSReqArchitectureModelLookup {
	// Inherited from KAMP4Req
	public static Map<Decision, Set<CouldResolveObject>> lookUpDecisionsCouldBeResolvingResolveObjects(
			Collection<? extends CouldResolveObject> objectsToBeResolved) {
		Map<Decision, Set<CouldResolveObject>> results = new HashMap<Decision, Set<CouldResolveObject>>();

		for (CouldResolveObject objectToBeResolved : objectsToBeResolved) {
			for (CouldResolveObject resolvingObject : objectToBeResolved.getCouldBeResolvedBy()) {
				if (resolvingObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) resolvingObject, objectToBeResolved);
				}
			}
		}

		return results;
	}

	// Inherited from KAMP4Req
	public static Map<Decision, Set<ResolveObject>> lookUpDecisionsResolvingResolveObjects(
			Collection<? extends ResolveObject> objectsToBeResolved) {
		Map<Decision, Set<ResolveObject>> results = new HashMap<Decision, Set<ResolveObject>>();

		for (ResolveObject objectToBeResolved : objectsToBeResolved) {
			for (ResolveObject resolvingObject : objectToBeResolved.getResolvedBy()) {
				if (resolvingObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) resolvingObject, objectToBeResolved);
				}
			}
		}

		return results;
	}

	// Inherited from KAMP4Req
	public static Map<Decision, Set<TriggerObject>> lookUpDecisionsTriggeredByTriggerObjects(
			Collection<? extends TriggerObject> triggers) {
		Map<Decision, Set<TriggerObject>> results = new HashMap<Decision, Set<TriggerObject>>();

		for (TriggerObject trigger : triggers) {
			for (TriggerObject triggeredObject : trigger.getTriggerOf()) {
				if (triggeredObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) triggeredObject, trigger);
				}
			}
		}

		return results;
	}

	/**
	 * Finds all DependencyObjects which at least one of the DependencyObjects
	 * passed as a parameter directly or indirectly (transitive closure) depends
	 * on and that have a certain type (or one of its sub-types). The causes
	 * (dependent objects) are stored as the value of the map, the affected
	 * objects are the keys.
	 */
	@SuppressWarnings("unchecked")
	// Inherited from KAMP4Req
	public static <T extends DependencyObject> Map<T, Set<DependencyObject>> lookUpObjectsAnotherObjectDependsOn(
			Collection<? extends DependencyObject> targetDependencyObjects, Class<T> dependencyObjectClass) {
		Map<T, Set<DependencyObject>> results = new HashMap<T, Set<DependencyObject>>();
		List<DependencyObject> dependenciesToVisit = new LinkedList<DependencyObject>(targetDependencyObjects);

		while (!dependenciesToVisit.isEmpty()) {
			DependencyObject targetDependencyObject = dependenciesToVisit.remove(0);
			for (DependencyObject sourceDependencyObject : targetDependencyObject.getDependsOn()) {
				if (dependencyObjectClass.isAssignableFrom(sourceDependencyObject.getClass())) {
					// Analyze each object only once, but always update causes
					if (!dependenciesToVisit.contains(sourceDependencyObject)
							&& !results.containsKey(sourceDependencyObject)) {
						dependenciesToVisit.add(sourceDependencyObject);
					}
					MapUtil.putOrAddToMap(results, (T) sourceDependencyObject, targetDependencyObject);
				}
			}
		}

		return results;
	}

	/**
	 * Finds all DependencyObjects that are directly or indirectly (transitive
	 * closure) dependent on at least on of the DependencyObject passed as a
	 * parameter and that have a certain type (or one of its sub-types). The
	 * causing objects are the values of the map, the affected objects are the
	 * keys.
	 */
	@SuppressWarnings("unchecked")
	// Inherited from KAMP4Req
	public static <T extends DependencyObject> Map<T, Set<DependencyObject>> lookUpObjectsDependOnObjects(
			Collection<? extends DependencyObject> sourceDependencyObjects, Class<T> dependencyObjectsClass) {
		Map<T, Set<DependencyObject>> results = new HashMap<T, Set<DependencyObject>>();
		List<DependencyObject> dependenciesToVisit = new LinkedList<DependencyObject>(sourceDependencyObjects);

		while (!dependenciesToVisit.isEmpty()) {
			DependencyObject sourceDependencyObject = dependenciesToVisit.remove(0);
			for (DependencyObject targetDependencyObject : sourceDependencyObject.getHasDependents()) {
				if (dependencyObjectsClass.isAssignableFrom(targetDependencyObject.getClass())) {
					// Analyse each object only once, but always update causes
					if (!dependenciesToVisit.contains(targetDependencyObject)
							&& !results.containsKey(targetDependencyObject)) {
						dependenciesToVisit.add(targetDependencyObject);
					}
					MapUtil.putOrAddToMap(results, (T) targetDependencyObject, sourceDependencyObject);
				}
			}
		}

		return results;
	}

	// Inherited from KAMP4Req
	public static Map<Option, Set<CouldResolveObject>> lookUpOptionsCouldBeResolvingResolveObjects(
			Collection<? extends CouldResolveObject> objectsToBeResolved) {
		Map<Option, Set<CouldResolveObject>> results = new HashMap<Option, Set<CouldResolveObject>>();

		for (CouldResolveObject objectToBeResolved : objectsToBeResolved) {
			for (CouldResolveObject resolvingObject : objectToBeResolved.getCouldBeResolvedBy()) {
				if (resolvingObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) resolvingObject, objectToBeResolved);
				}
			}
		}

		return results;
	}

	// Inherited from KAMP4Req
	public static Map<Option, Set<ResolveObject>> lookUpOptionsResolvingResolveObjects(
			Collection<? extends ResolveObject> objectsToBeResolved) {
		Map<Option, Set<ResolveObject>> results = new HashMap<Option, Set<ResolveObject>>();

		for (ResolveObject objectToBeResolved : objectsToBeResolved) {
			for (ResolveObject resolvingObject : objectToBeResolved.getResolvedBy()) {
				if (resolvingObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) resolvingObject, objectToBeResolved);
				}
			}
		}

		return results;
	}

	// Inherited from KAMP4Req
	public static Map<Option, Set<TriggerObject>> lookUpOptionsTriggeredByTriggerObjects(
			Collection<? extends TriggerObject> triggers) {
		Map<Option, Set<TriggerObject>> results = new HashMap<Option, Set<TriggerObject>>();

		for (TriggerObject trigger : triggers) {
			for (TriggerObject triggeredObject : trigger.getTriggerOf()) {
				if (triggeredObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) triggeredObject, trigger);
				}
			}
		}

		return results;
	}

	// Inherited from KAMP4Req
	public static Map<Requirement, Set<TriggerObject>> lookUpRequirementsTriggeringTriggerObjects(
			Collection<? extends TriggerObject> triggeredObjects) {
		Map<Requirement, Set<TriggerObject>> results = new HashMap<Requirement, Set<TriggerObject>>();

		for (TriggerObject triggeredObject : triggeredObjects) {
			for (TriggerObject trigger : triggeredObject.getTriggeredBy()) {
				if (trigger instanceof Requirement) {
					MapUtil.putOrAddToMap(results, (Requirement) trigger, triggeredObject);
				}
			}
		}

		return results;
	}

	public static Map<Component, Set<Decision>> lookUpXPPUComponentsReferencedByDecisions(
			APSReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Component, Set<Decision>> results = new HashMap<Component, Set<Decision>>();
		for (Decision decision : decisions) {
			for (SelectionObject selection : decision.getSelected()) {
				if (selection instanceof Option) {
					for (Component component : version.getXPPUPlant().getComponentRepository()
							.getAllComponentsInPlant()) {
						if (isXPPUComponentReferencedByOption(component, (Option) selection)) {
							MapUtil.putOrAddToMap(results, component, decision);
						}
					}
				}
			}
		}

		return results;
	}

	public static Map<Component, Set<Option>> lookUpXPPUComponentsReferencedByOptions(APSReqArchitectureVersion version,
			Collection<? extends Option> options) {
		Map<Component, Set<Option>> results = new HashMap<Component, Set<Option>>();
		for (Option option : options) {

			for (Component component : version.getXPPUPlant().getComponentRepository().getAllComponentsInPlant()) {
				if (isXPPUComponentReferencedByOption(component, option)) {
					MapUtil.putOrAddToMap(results, component, option);
				}
			}
		}

		return results;
	}

	public static Map<Interface, Set<Decision>> lookUpXPPUInterfacesReferencedByDecisions(
			APSReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Interface, Set<Decision>> results = new HashMap<Interface, Set<Decision>>();

		for (Decision decision : decisions) {
			for (SelectionObject selection : decision.getSelected()) {
				if (selection instanceof Option) {
					for (Interface interfac : version.getXPPUPlant().getInterfaceRepository()
							.getAllInterfacesInPlant()) {
						if (interfac instanceof Interface
								&& isXPPUInterfaceReferencedByOption(interfac, (Option) selection)) {
							MapUtil.putOrAddToMap(results, interfac, decision);
						}
					}
				}
			}
		}

		return results;
	}

	public static Map<Interface, Set<Option>> lookUpXPPUInterfacesReferencedByOptions(APSReqArchitectureVersion version,
			Collection<? extends Option> options) {
		Map<Interface, Set<Option>> results = new HashMap<Interface, Set<Option>>();

		for (Option option : options) {
			for (Interface interfac : version.getXPPUPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
				if (interfac instanceof Interface && isXPPUInterfaceReferencedByOption(interfac, option)) {
					MapUtil.putOrAddToMap(results, interfac, option);
				}
			}
		}

		return results;
	}

	public static Map<Module, Set<Decision>> lookUpXPPUModulesReferencedByDecisions(APSReqArchitectureVersion version,
			Collection<? extends Decision> decisions) {
		Map<Module, Set<Decision>> results = new HashMap<Module, Set<Decision>>();

		for (Decision decision : decisions) {
			for (SelectionObject selection : decision.getSelected()) {
				if (selection instanceof Option) {
					for (Module module : version.getXPPUPlant().getModuleRepository().getAllModulesInPlant()) {
						if (isXPPUModuleReferencedByOption(module, (Option) selection)) {
							MapUtil.putOrAddToMap(results, module, decision);
						}
					}
				}
			}
		}

		return results;
	}

	public static Map<Module, Set<Option>> lookUpXPPUModulesReferencedByOptions(APSReqArchitectureVersion version,
			Collection<? extends Option> options) {
		Map<Module, Set<Option>> results = new HashMap<Module, Set<Option>>();

		for (Option option : options) {
			for (Module module : version.getXPPUPlant().getModuleRepository().getAllModulesInPlant()) {
				if (isXPPUModuleReferencedByOption(module, option)) {
					MapUtil.putOrAddToMap(results, module, option);
				}
			}
		}

		return results;
	}

	public static Map<Structure, Set<Decision>> lookUpXPPUStructuresReferencedByDecisions(
			APSReqArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Structure, Set<Decision>> results = new HashMap<Structure, Set<Decision>>();

		for (Decision decision : decisions) {
			for (SelectionObject selection : decision.getSelected()) {
				if (selection instanceof Option) {
					for (Structure structure : version.getXPPUPlant().getStructures()) {
						if (isXPPUStructureReferencedByOption(structure, (Option) selection)) {
							MapUtil.putOrAddToMap(results, structure, decision);
						}
					}
				}
			}
		}

		return results;
	}

	public static Map<Structure, Set<Option>> lookUpXPPUStructuresReferencedByOptions(APSReqArchitectureVersion version,
			Collection<? extends Option> options) {
		Map<Structure, Set<Option>> results = new HashMap<Structure, Set<Option>>();

		for (Option option : options) {
			for (Structure structure : version.getXPPUPlant().getStructures()) {
				if (isXPPUStructureReferencedByOption(structure, option)) {
					MapUtil.putOrAddToMap(results, structure, option);
				}
			}
		}

		return results;
	}

	private static boolean isXPPUInterfaceReferencedByChangeOption(Interface interfac, Option option) {
		if (option instanceof xPPU_ChangeInterface) {
			xPPU_ChangeInterface xppuOption = (xPPU_ChangeInterface) option;
			// consider only the old ones, not the new ones (forward
			// propagation)
			return xppuOption.getOldInterfaces().contains(interfac);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUInterfaceReferencedByIntroduceOption(Interface interfac, Option option) {
		if (option instanceof xPPU_IntroduceNewInterface) {
			xPPU_IntroduceNewInterface xppuOption = (xPPU_IntroduceNewInterface) option;
			return xppuOption.getInterfaces().contains(interfac);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUInterfaceReferencedByOption(Interface interfac, Option option) {
		return isXPPUInterfaceReferencedByIntroduceOption(interfac, option)
				|| isXPPUInterfaceReferencedByChangeOption(interfac, option)
				|| isXPPUInterfaceReferencedByRemoveOption(interfac, option);
	}

	private static boolean isXPPUInterfaceReferencedByRemoveOption(Interface interfac, Option option) {
		if (option instanceof xPPU_RemoveInterface) {
			xPPU_RemoveInterface xppuOption = (xPPU_RemoveInterface) option;
			return xppuOption.getInterfaces().contains(interfac);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUComponentReferencedByChangeOption(Component component, Option option) {
		if (option instanceof xPPU_ChangeComponent) {
			xPPU_ChangeComponent xppuOption = (xPPU_ChangeComponent) option;
			// consider only the old ones, not the new ones (forward
			// propagation)
			return xppuOption.getOldComponents().contains(component);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUComponentReferencedByIntroduceOption(Component component, Option option) {
		if (option instanceof xPPU_IntroduceNewComponent) {
			xPPU_IntroduceNewComponent xppuOption = (xPPU_IntroduceNewComponent) option;
			return xppuOption.getComponents().contains(component);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUComponentReferencedByOption(Component component, Option option) {
		return isXPPUComponentReferencedByIntroduceOption(component, option)
				|| isXPPUComponentReferencedByChangeOption(component, option)
				|| isXPPUComponentReferencedByRemoveOption(component, option);
	}

	private static boolean isXPPUComponentReferencedByRemoveOption(Component component, Option option) {
		if (option instanceof xPPU_RemoveComponent) {
			xPPU_RemoveComponent xppuOption = (xPPU_RemoveComponent) option;
			return xppuOption.getComponents().contains(component);
		}
		else {
			return false;
		}

	}

	private static boolean isXPPUModuleReferencedByChangeOption(Module module, Option option) {
		if (option instanceof xPPU_ChangeModule) {
			xPPU_ChangeModule xppuOption = (xPPU_ChangeModule) option;
			// consider only the old ones, not the new ones (forward
			// propagation)
			return xppuOption.getOldModules().contains(module);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUModuleReferencedByIntroduceOption(Module module, Option option) {
		if (option instanceof xPPU_IntroduceNewModule) {
			xPPU_IntroduceNewModule xppuOption = (xPPU_IntroduceNewModule) option;
			return xppuOption.getModules().contains(module);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUModuleReferencedByOption(Module module, Option option) {
		return isXPPUModuleReferencedByIntroduceOption(module, option)
				|| isXPPUModuleReferencedByChangeOption(module, option)
				|| isXPPUModuleReferencedByRemoveOption(module, option);
	}

	private static boolean isXPPUModuleReferencedByRemoveOption(Module module, Option option) {
		if (option instanceof xPPU_RemoveModule) {
			xPPU_RemoveModule xppuOption = (xPPU_RemoveModule) option;
			return xppuOption.getModules().contains(module);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUStructureReferencedByChangeOption(Structure structure, Option option) {
		if (option instanceof xPPU_ChangeStructure) {
			xPPU_ChangeStructure xppuOption = (xPPU_ChangeStructure) option;
			// consider only the old ones, not the new ones (forward
			// propagation)
			return xppuOption.getOldStructures().contains(structure);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUStructureReferencedByIntroduceOption(Structure structure, Option option) {
		if (option instanceof xPPU_IntroduceNewStructure) {
			xPPU_IntroduceNewStructure xppuOption = (xPPU_IntroduceNewStructure) option;
			return xppuOption.getStructures().contains(structure);
		}
		else {
			return false;
		}
	}

	private static boolean isXPPUStructureReferencedByOption(Structure structure, Option option) {
		return isXPPUStructureReferencedByIntroduceOption(structure, option)
				|| isXPPUStructureReferencedByChangeOption(structure, option)
				|| isXPPUStructureReferencedByRemoveOption(structure, option);
	}

	private static boolean isXPPUStructureReferencedByRemoveOption(Structure structure, Option option) {
		if (option instanceof xPPU_RemoveStructure) {
			xPPU_RemoveStructure xppuOption = (xPPU_RemoveStructure) option;
			return xppuOption.getStructures().contains(structure);
		}
		else {
			return false;
		}
	}
}
