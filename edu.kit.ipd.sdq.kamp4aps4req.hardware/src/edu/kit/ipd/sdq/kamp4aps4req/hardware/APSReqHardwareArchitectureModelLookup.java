package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelLookup;
import options.Option;
import relations.SelectionObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import apshardwareoptions.*;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;


public class APSReqHardwareArchitectureModelLookup extends APSReqArchitectureModelLookup {

	
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
			if (option instanceof APSReqStructureHardwareOption) {
				for (Structure structureRepository : version.getApsArchitectureVersion().getAPSPlant().getStructures()) {
					if (isStructureReferencedByOption(structureRepository, (APSReqStructureHardwareOption) option)) {
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
			APSReqStructureHardwareOption option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewStructureOption) {
			result = isStructureReferencedByIntroduceNewOption(structure, (APSReqIntroduceNewStructureOption) option);
		} else if (option instanceof APSReqChangeStructureOption) {
			result = isStructureReferencedByChangeOption(structure, (APSReqChangeStructureOption) option);
		} else if (option instanceof APSReqReplaceStructureOption) {
			result = isStructureReferencedByReplaceOption(structure, (APSReqReplaceStructureOption) option);
		} else if (option instanceof APSReqRemoveStructureOption) {
			result = isStructureReferencedByRemoveOption(structure, (APSReqRemoveStructureOption) option);
		}
		return result;
	}
	
	/**
	 * Checks if a structure is affected by an "introduce new" option
	 * @param structure The structure to check on
	 * @param option The option which is changed
	 * @return True, if the structure is affected by the option, false otherwise
	 */
	private static boolean isStructureReferencedByIntroduceNewOption(
			Structure structure, APSReqIntroduceNewStructureOption option) {
		for (Structure structures : option.getStructures()) {
			if (structures.equals(structure)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if a structure is affected by an "remove" option
	 * @param structure The structure to check on
	 * @param option The option which is changed
	 * @return True, if the structure is affected by the option, false otherwise
	 */
	private static boolean isStructureReferencedByRemoveOption(
			Structure structure, APSReqRemoveStructureOption option) {
		for (Structure structures : option.getStructures()) {
			if (structures.equals(structure)) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * Checks if a structure is affected by an "replace" option
	 * @param structure The structure to check on
	 * @param option The option which is changed
	 * @return True, if the structure is affected by the option, false otherwise
	 */
	private static boolean isStructureReferencedByReplaceOption(
			Structure structure, APSReqReplaceStructureOption option) {
		if (option.getNewStructure().equals(structure) || option.getOldStructure().equals(structure)) {
			return true;
		} else {
			return false;
			}
	}
	
	/**
	 * Checks if a structure is affected by an "change" option
	 * @param structure The structure to check on
	 * @param option The option which is changed
	 * @return True, if the structure is affected by the option, false otherwise
	 */
	private static  boolean isStructureReferencedByChangeOption(
			Structure structure, APSReqChangeStructureOption option) {
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
				if (selection instanceof APSReqStructureHardwareOption) {
					for (Structure structure : version.getApsArchitectureVersion().getAPSPlant().getStructures()) {
						if (structure instanceof Structure && isStructureReferencedByOption(
								structure, (APSReqStructureHardwareOption) selection)) {
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
			if (option instanceof APSReqModuleHardwareOption) {
				for (Module moduleRepository : version.getApsArchitectureVersion().getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
					if (isModuleReferencedByOption(moduleRepository, (APSReqModuleHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, moduleRepository, option);
					}
				}
			}
		}
		
		return results;
	}

	private static boolean isModuleReferencedByOption(Module module, 
			APSReqModuleHardwareOption option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewModuleOption) {
			result = isModuleReferencedByIntroduceNewOption(module, (APSReqIntroduceNewModuleOption) option);
		} else if (option instanceof APSReqChangeModuleOption) {
			result = isModuleReferencedByChangeOption(module, (APSReqChangeModuleOption) option);
		} else if (option instanceof APSReqReplaceModuleOption) {
			result = isModuleReferencedByReplaceOption(module, (APSReqReplaceModuleOption) option);
		} else if (option instanceof APSReqRemoveModuleOption) {
			result = isModuleReferencedByRemoveOption(module, (APSReqRemoveModuleOption) option);
		}
		return result;
	}
	
	private static boolean isModuleReferencedByIntroduceNewOption(
			Module module, APSReqIntroduceNewModuleOption option) {
		for (Module modules : option.getModules()) {
			if (modules.equals(module)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isModuleReferencedByReplaceOption(
			Module module, APSReqReplaceModuleOption option) {
		if (option.getNewModule().equals(module) || option.getOldModule().equals(module)) {
			return true;
		}
		return false;
	}
	
	private static boolean isModuleReferencedByChangeOption(
			Module module, APSReqChangeModuleOption option) {
		for (Module modules : option.getModules()) {
			if (modules.equals(module)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isModuleReferencedByRemoveOption(
			Module module, APSReqRemoveModuleOption option) {
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
				if (selection instanceof APSReqModuleHardwareOption) {
					for (Module module : version.getApsArchitectureVersion().getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
						if (module instanceof Module && isModuleReferencedByOption(
								module, (APSReqModuleHardwareOption) selection)) {
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
			if (option instanceof APSReqComponentHardwareOption) {
				for (Component componentRepository : version.getApsArchitectureVersion().getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
					if (isComponentReferencedByOption(componentRepository, (APSReqComponentHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, componentRepository, option);
					}
				}
			}
		}
		
		return results;
	}
	
	private static boolean isComponentReferencedByOption(Component component, 
			APSReqComponentHardwareOption option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewComponentOption) {
			result = isComponentReferencedByIntroduceNewOption(component, (APSReqIntroduceNewComponentOption) option);
		}  else if (option instanceof APSReqReplaceComponentOption) {
			result = isComponentReferencedByReplaceOption(component, (APSReqReplaceComponentOption) option);
		} else if (option instanceof APSReqRemoveComponentOption) {
			result = isComponentReferencedByRemoveOption(component, (APSReqRemoveComponentOption) option);
		}
		return result;
	}
	
	private static boolean isComponentReferencedByIntroduceNewOption(
			Component component, APSReqIntroduceNewComponentOption option) {
		for (Component components : option.getComponents()) {
			if (components.equals(component)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isComponentReferencedByReplaceOption(
			Component component, APSReqReplaceComponentOption option) {
		if (option.getNewComponent().equals(component) || option.getOldComponent().equals(component)) {
			return true;
		}
		return false;
	}
	
	private static boolean isComponentReferencedByRemoveOption(
			Component component, APSReqRemoveComponentOption option) {
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
				if (selection instanceof APSReqComponentHardwareOption) {
					for (Component component : version.getApsArchitectureVersion().getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
						if (component instanceof Component && isComponentReferencedByOption(
								component, (APSReqComponentHardwareOption) selection)) {
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
			if (option instanceof APSReqInterfaceHardwareOption) {
				for (Interface interfaceRepository : version.getApsArchitectureVersion().getAPSPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
					if (isInterfaceReferencedByOption(interfaceRepository, (APSReqInterfaceHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, interfaceRepository, option);
					}
				}
			}
		}
		
		return results;
	}

	private static boolean isInterfaceReferencedByOption(Interface interfac, 
			APSReqInterfaceHardwareOption option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewInterfaceOption) {
			result = isInterfaceReferencedByIntroduceNewOption(interfac, (APSReqIntroduceNewInterfaceOption) option);
		} else if (option instanceof APSReqChangeInterfaceOption) {
			result = isInterfaceReferencedByChangeOption(interfac, (APSReqChangeInterfaceOption) option);
		} else if (option instanceof APSReqReplaceInterfaceOption) {
			result = isInterfaceReferencedByReplaceOption(interfac, (APSReqReplaceInterfaceOption) option);
		} else if (option instanceof APSReqRemoveInterfaceOption) {
			result = isInterfaceReferencedByRemoveOption(interfac, (APSReqRemoveInterfaceOption) option);
		}
		return result;
	}
	
	private static boolean isInterfaceReferencedByIntroduceNewOption(
			Interface interfac, APSReqIntroduceNewInterfaceOption option) {
		for (Interface interfaces : option.getInterfaces()) {
			if (interfaces.equals(interfac)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isInterfaceReferencedByReplaceOption(
			Interface interfac, APSReqReplaceInterfaceOption option) {
		if (option.getNewInterface().equals(interfac) || option.getOldInterface().equals(interfac)) {
			return true;
		}
		return false;
	}
	
	private static boolean isInterfaceReferencedByChangeOption(
			Interface interfac, APSReqChangeInterfaceOption option) {
		for (Interface interfaces : option.getInterfaces()) {
			if (interfaces.equals(interfac)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isInterfaceReferencedByRemoveOption(
			Interface interfac, APSReqRemoveInterfaceOption option) {
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
				if (selection instanceof APSReqInterfaceHardwareOption) {
					for (Interface interfac : version.getApsArchitectureVersion().getAPSPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
						if (interfac instanceof Interface && isInterfaceReferencedByOption(
								interfac, (APSReqInterfaceHardwareOption) selection)) {
							MapUtil.putOrAddToMap(results, interfac, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
}
