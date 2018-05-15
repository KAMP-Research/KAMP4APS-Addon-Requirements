package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelLookup;
import options.Option;
import relations.SelectionObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import apshardwareoptions.APSReqComponentOption;
import apshardwareoptions.APSReqInterfaceOption;
import apshardwareoptions.APSReqModuleOption;
import apshardwareoptions.APSReqStructureOption;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;


public class APSReqHardwareArchitectureModelLookup extends APSReqArchitectureModelLookup {

	
	
	
	public static Map<Entity, Set<Option>> lookUpEntitiesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Entity, Set<Option>> results = new HashMap<Entity, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqStructureOption) {
				for (Structure structureRepository : version.getAPSPlant().getStructures()) {
					if (isEntityReferencedByOption(structureRepository,  (APSReqStructureOption) option)) {
						MapUtil.putOrAddToMap(results, structureRepository, option);
					}
				}
			} else if (option instanceof APSReqModuleOption) {
				if (version.getAPSPlant().getModuleRepository() != null) {
					for (Module moduleRepository : version.getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
						if (isEntityReferencedByOption(moduleRepository,  (APSReqModuleOption) option)) {
							MapUtil.putOrAddToMap(results, moduleRepository, option);
						}
					}
				}
			} else if (option instanceof APSReqComponentOption) {
				if (version.getAPSPlant().getComponentRepository() != null) {
					for (Component componentRepository : version.getAPSPlant().getComponentRepository()
							.getAllComponentsInPlant()) {
						if (isEntityReferencedByOption(componentRepository,  (APSReqComponentOption) option)) {
							MapUtil.putOrAddToMap(results, componentRepository, option);
						}
					}
				}
			} else if (option instanceof APSReqInterfaceOption) {
				if (version.getAPSPlant().getInterfaceRepository() != null) {
					for (Interface interfaceRepository : version.getAPSPlant().getInterfaceRepository().
							getAllInterfacesInPlant()) {
						if (isEntityReferencedByOption(interfaceRepository,  (APSReqInterfaceOption) option)) {
							MapUtil.putOrAddToMap(results, interfaceRepository, option);
						}
					}
				}
			}
		}
		return results;
	}
	
	public static Map<Entity, Set<Decision>> lookUpEntitiesReferencedByDecisions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Entity, Set<Decision>> results = new HashMap<Entity, Set<Decision>>();
		
		for (Decision decisionRepository : decisions) {
			for (SelectionObject selection : decisionRepository.getSelected()) {
				if (selection instanceof APSReqStructureOption) {
					for (Structure structureRepository : version.getAPSPlant().getStructures()) {
						if (isEntityReferencedByOption(structureRepository,  (APSReqStructureOption) selection)) {
							MapUtil.putOrAddToMap(results, structureRepository, decisionRepository);
						}
					}
				} else if (selection instanceof APSReqModuleOption) {
					if (version.getAPSPlant().getModuleRepository() != null) {
						for (Module moduleRepository : version.getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
							if (isEntityReferencedByOption(moduleRepository,  (APSReqModuleOption) selection)) {
								MapUtil.putOrAddToMap(results, moduleRepository, decisionRepository);
							}
						}
					}
				} else if (selection instanceof APSReqComponentOption) {
					if (version.getAPSPlant().getComponentRepository() != null) {
						for (Component componentRepository : version.getAPSPlant().getComponentRepository()
								.getAllComponentsInPlant()) {
							if (isEntityReferencedByOption(componentRepository,  (APSReqComponentOption) selection)) {
								MapUtil.putOrAddToMap(results, componentRepository, decisionRepository);
							}
						}
					}
				} else if (selection instanceof APSReqInterfaceOption) {
					if (version.getAPSPlant().getInterfaceRepository() != null) {
						for (Interface interfaceRepository : version.getAPSPlant().getInterfaceRepository().
								getAllInterfacesInPlant()) {
							if (isEntityReferencedByOption(interfaceRepository,  (APSReqInterfaceOption) selection)) {
								MapUtil.putOrAddToMap(results, interfaceRepository, decisionRepository);
							}
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isEntityReferencedByOption(Entity entity, Option option) {
		if (option instanceof APSReqStructureOption) {
			for (Structure structureRepo : ((APSReqStructureOption)option).getStructures()) {
				if (entity.equals(structureRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqModuleOption) {
			for (Module moduleRepo : ((APSReqModuleOption)option).getModules()) {
				if (entity.equals(moduleRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqComponentOption) {
			for (Component componentRepo : ((APSReqComponentOption)option).getComponents()) {
				if (entity.equals(componentRepo)) {
					System.out.println(option.getId() + "Component");
					return true;
				}
			}
		} else if (option instanceof APSReqInterfaceOption) {
			for (Interface interfaceRepo : ((APSReqInterfaceOption)option).getInterfaces()) {
				if (entity.equals(interfaceRepo)) {
					return true;
				}
			}
		}
		return false;
	}

/*	########################################################################################################################
	OLD METHODS
	########################################################################################################################
*/	
	
	/*	########################################################################################################################
	 * 	#  STRUCTURE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	/**
	 * Looks up Structures which are referenced by changed options
	 * @param version The Architecture version to work with
	 * @param options Changed Options
	 * @return Map with Options and the Structures they reference 
	 */
	public static Map<Structure, Set<Option>> lookUpStructuresReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Structure, Set<Option>> results = new HashMap<Structure, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqStructureOption) {
				for (Structure structureRepository : version.getAPSPlant().getStructures()) {
					if (isStructureReferencedByOption(structureRepository,  (APSReqStructureOption) option)) {
						MapUtil.putOrAddToMap(results, structureRepository, option);
					}
				}
			}
		}
		return results;
	}
	
	/**
	 * Checks if a structure is referenced by any of the possible option types
	 * @param structure Structure to check on
	 * @param option Changed Option
	 * @return True if referenced, false otherwise
	 */
	private static boolean isStructureReferencedByOption(Structure structure, 
			APSReqStructureOption option) {
		for (Structure structures : option.getStructures()) {
			if (structures.equals(structure)) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * Looks up Structures which are referenced by changed Decisions
	 * @param version The Architecture version to work with
	 * @param decisions Changed Decisions
	 * @return Map with Decisions and the Structures they reference 
	 */
	public static Map<Structure, Set<Decision>> lookUpStructuresReferencedByDecisions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Structure, Set<Decision>> results = new HashMap<Structure, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqStructureOption) {
					for (Structure structure : version.getAPSPlant().getStructures()) {
						if (isStructureReferencedByOption(structure, (APSReqStructureOption) selection)) {
							MapUtil.putOrAddToMap(results, structure, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	/*	########################################################################################################################
	 * 	#  MODULE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	/**
	 * Looks up Modules which are referenced by changed options
	 * @param version The Architecture version to work with
	 * @param options Changed Options
	 * @return Map with Options and the Modules they reference 
	 */
	public static Map<Module, Set<Option>> lookUpModulesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Module, Set<Option>> results = new HashMap<Module, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqModuleOption) {
				for (Module moduleRepository : version.getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
					if (isModuleReferencedByOption(moduleRepository, (APSReqModuleOption) option)) {
						MapUtil.putOrAddToMap(results, moduleRepository, option);
					}
				}
			}
		}
		
		return results;
	}

	private static boolean isModuleReferencedByOption(Module module, 
			APSReqModuleOption option) {
		for (Module modules : option.getModules()) {
			if (modules.equals(module)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Looks up Modules which are referenced by changed Decisions
	 * @param version The Architecture version to work with
	 * @param decisions Changed Decisions
	 * @return Map with Decisions and the Modules they reference 
	 */
	public static Map<Module, Set<Decision>> lookUpModulesReferencedByDecisions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Module, Set<Decision>> results = new HashMap<Module, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqModuleOption) {
					for (Module module : version.getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
						if (isModuleReferencedByOption(module, (APSReqModuleOption) selection)) {
							MapUtil.putOrAddToMap(results, module, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	/*	########################################################################################################################
	 * 	#  COMPONENT LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	/**
	 * Looks up Components which are referenced by changed options
	 * @param version The Architecture version to work with
	 * @param options Changed Options
	 * @return Map with Options and the Components they reference 
	 */
	public static Map<Component, Set<Option>> lookUpComponentsReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Component, Set<Option>> results = new HashMap<Component, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqComponentOption) {
				for (Component componentRepository : version.getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
					if (isComponentReferencedByOption(componentRepository, (APSReqComponentOption) option)) {
						MapUtil.putOrAddToMap(results, componentRepository, option);
					}
				}
			}
		}
		
		return results;
	}
	
	private static boolean isComponentReferencedByOption(Component component, 
			APSReqComponentOption option) {
		for (Component components : option.getComponents()) {
			if (components.equals(component)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Looks up Components which are referenced by changed Decisions
	 * @param version The Architecture version to work with
	 * @param decisions Changed Decisions
	 * @return Map with Decisions and the Components they reference 
	 */
	public static Map<Component, Set<Decision>> lookUpComponentsReferencedByDecisions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Component, Set<Decision>> results = new HashMap<Component, Set<Decision>>();
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqComponentOption) {
					for (Component component : version.getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
						if (isComponentReferencedByOption(component, (APSReqComponentOption) selection)) {
							MapUtil.putOrAddToMap(results, component, decision);
						}
					}
				}
			}
		}
		return results;
	}
	
	
	/*	########################################################################################################################
	 * 	#  INTERFACE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	/**
	 * Looks up Interfaces which are referenced by changed options
	 * @param version The Architecture version to work with
	 * @param options Changed Options
	 * @return Map with Options and the Interfaces they reference 
	 */
	public static Map<Interface, Set<Option>> lookUpInterfacesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Interface, Set<Option>> results = new HashMap<Interface, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqInterfaceOption) {
				for (Interface interfaceRepository : version.getAPSPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
					if (isInterfaceReferencedByOption(interfaceRepository, (APSReqInterfaceOption) option)) {
						MapUtil.putOrAddToMap(results, interfaceRepository, option);
					}
				}
			}
		}
		
		return results;
	}

	private static boolean isInterfaceReferencedByOption(Interface interfac, 
			APSReqInterfaceOption option) {
		for (Interface interfaces : option.getInterfaces()) {
			if (interfaces.equals(interfac)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Looks up Interfaces which are referenced by changed Decisions
	 * @param version The Architecture version to work with
	 * @param decisions Changed Decisions
	 * @return Map with Decisions and the Interfaces they reference 
	 */
	public static Map<Interface, Set<Decision>> lookUpInterfacesReferencedByDecisions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Interface, Set<Decision>> results = new HashMap<Interface, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqInterfaceOption) {
					for (Interface interfac : version.getAPSPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
						if (isInterfaceReferencedByOption(interfac, (APSReqInterfaceOption) selection)) {
							MapUtil.putOrAddToMap(results, interfac, decision);
						}
					}
				}
			}
		}
		return results;
	}
}
