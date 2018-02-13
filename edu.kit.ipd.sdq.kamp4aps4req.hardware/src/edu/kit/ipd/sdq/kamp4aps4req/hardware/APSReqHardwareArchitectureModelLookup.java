package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelLookup;
import options.Option;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import apshardwareoptions.*;
import apshardwareoptions.APSReqHardwareOption;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;


public class APSReqHardwareArchitectureModelLookup extends APSReqArchitectureModelLookup {

	private APSArchitectureModelLookup apsArchitectureModelLookup;
	
	
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
	public static Map<Structure, Set<APSReqHardwareOption>> lookUpStructuresReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Structure, Set<APSReqHardwareOption>> results = new HashMap<Structure, Set<APSReqHardwareOption>>();
		for (Option option: options) {
			if (option instanceof APSReqStructureHardwareOption) {
				for (Structure structureRepository : version.getApsArchitectureVersion().getAPSPlant().getStructures()) {
					if (isStructureReferencedByOption(structureRepository, (APSReqStructureHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, structureRepository, (APSReqHardwareOption) option);
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
	public static Map<Module, Set<APSReqHardwareOption>> lookUpModulesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption> options) {
		Map<Module, Set<APSReqHardwareOption>> results = new HashMap<Module, Set<APSReqHardwareOption>>();
		for (APSReqHardwareOption option: options) {
			if (option instanceof APSReqModuleHardwareOption) {
				for (Module moduleRepository : version.getApsArchitectureVersion().getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
					if (isModuleReferencedByOption(moduleRepository, (APSReqModuleHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, moduleRepository, (APSReqHardwareOption) option);
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
	public static Map<Component, Set<APSReqHardwareOption>> lookUpComponentsReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption> options) {
		Map<Component, Set<APSReqHardwareOption>> results = new HashMap<Component, Set<APSReqHardwareOption>>();
		for (APSReqHardwareOption option: options) {
			if (option instanceof APSReqComponentHardwareOption) {
				for (Component componentRepository : version.getApsArchitectureVersion().getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
					if (isComponentReferencedByOption(componentRepository, (APSReqComponentHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, componentRepository, (APSReqHardwareOption) option);
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
	public static Map<Interface, Set<APSReqHardwareOption>> lookUpInterfacesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption> options) {
		Map<Interface, Set<APSReqHardwareOption>> results = new HashMap<Interface, Set<APSReqHardwareOption>>();
		for (APSReqHardwareOption option: options) {
			if (option instanceof APSReqInterfaceHardwareOption) {
				for (Interface interfaceRepository : version.getApsArchitectureVersion().getAPSPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
					if (isInterfaceReferencedByOption(interfaceRepository, (APSReqInterfaceHardwareOption) option)) {
						MapUtil.putOrAddToMap(results, interfaceRepository, (APSReqHardwareOption) option);
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
	
}
