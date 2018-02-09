package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelLookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import apshardwareoptions.APSReqChangeHardwareOption;
import apshardwareoptions.APSReqIntroduceNewHardwareOption;
import apshardwareoptions.APSReqRemoveHardwareOption;
import apshardwareoptions.APSReqReplaceHardwareOption;
import apshardwareoptions.APSReqHardwareOption;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import org.eclipse.emf.common.util.EList;

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
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption> options) {
		Map<Structure, Set<APSReqHardwareOption>> results = new HashMap<Structure, Set<APSReqHardwareOption>>();
		
		for (APSReqHardwareOption option: options) {
			for (Structure structureRepository : version.getApsArchitectureVersion().getAPSPlant().getStructures()) {
				if (isStructureReferencedByOption(structureRepository, option)) {
					MapUtil.putOrAddToMap(results, structureRepository, option);
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
			APSReqHardwareOption option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewHardwareOption) {
			result = isStructureReferencedByIntroduceNewOption(structure, (APSReqIntroduceNewHardwareOption) option);
		} else if (option instanceof APSReqChangeHardwareOption) {
			result = isStructureReferencedByChangeOption(structure, (APSReqChangeHardwareOption) option);
		} else if (option instanceof APSReqReplaceHardwareOption) {
			result = isStructureReferencedByReplaceOption(structure, (APSReqReplaceHardwareOption) option);
		} else if (option instanceof APSReqRemoveHardwareOption) {
			result = isStructureReferencedByRemoveOption(structure, (APSReqRemoveHardwareOption) option);
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
			Structure structure, APSReqIntroduceNewHardwareOption<Structure> option) {
		for (Structure structures : option.getEntities()) {
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
			Structure structure, APSReqRemoveHardwareOption<Structure> option) {
		for (Structure structures : option.getEntities()) {
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
			Structure structure, APSReqReplaceHardwareOption<Structure> option) {
		if (option.getNewEntity().equals(structure) || option.getOldEntity().equals(structure)) {
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
	private static boolean isStructureReferencedByChangeOption(
			Structure structure, APSReqChangeHardwareOption<Structure> option) {
		for (Structure structures : option.getEntities()) {
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
	
	public static Map<Module, Set<APSReqHardwareOption>> lookUpModulesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption> options) {
		Map<Module, Set<APSReqHardwareOption>> results = new HashMap<Module, Set<APSReqHardwareOption>>();
		
		for (APSReqHardwareOption option: options) {
			for (Module moduleRepository : version.getApsArchitectureVersion().getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
				if (isModuleReferencedByOption(moduleRepository, option)) {
					MapUtil.putOrAddToMap(results, moduleRepository, option);
				}
			}
		}
		
		return results;
	}
	
	private static boolean isModuleReferencedByOption(Module module, 
			APSReqHardwareOption option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewHardwareOption) {
			result = isModuleReferencedByIntroduceNewOption(module, (APSReqIntroduceNewHardwareOption) option);
		} else if (option instanceof APSReqChangeHardwareOption) {
			result = isModuleReferencedByChangeOption(module, (APSReqChangeHardwareOption) option);
		} else if (option instanceof APSReqReplaceHardwareOption) {
			result = isModuleReferencedByReplaceOption(module, (APSReqReplaceHardwareOption) option);
		} else if (option instanceof APSReqRemoveHardwareOption) {
			result = isModuleReferencedByRemoveOption(module, (APSReqRemoveHardwareOption) option);
		}
		return result;
	}
	
	
	private static boolean isModuleReferencedByIntroduceNewOption(
			Module module, APSReqIntroduceNewHardwareOption<Module> option) {
		for (Module modules : option.getEntities()) {
			if (modules.equals(module)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isModuleReferencedByReplaceOption(
			Module module, APSReqReplaceHardwareOption<Module> option) {
		if (option.getNewEntity().equals(module) || option.getOldEntity().equals(module)) {
			return true;
		}
		return false;
	}
	
	private static boolean isModuleReferencedByChangeOption(
			Module module, APSReqChangeHardwareOption<Module> option) {
		for (Module modules : option.getEntities()) {
			if (modules.equals(module)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isModuleReferencedByRemoveOption(
			Module module, APSReqRemoveHardwareOption<Module> option) {
		for (Module modules : option.getEntities()) {
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
	
	
	/*	########################################################################################################################
	 * 	#  INTERFACE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	
	
	
	
	
}
