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
import apsoptions.APSReqOption;
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
	public static <T extends Entity> Map<Structure, Set<APSReqHardwareOption<T>>> lookUpStructuresReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption<T>> options, Class<T> entityType) {
		Map<Structure, Set<APSReqHardwareOption<Structure>>> results = new HashMap<Structure, Set<APSReqHardwareOption<Structure>>>();
		for (APSReqHardwareOption<T> option: options) {
			if (entityType.getClass() == Structure.class) {
			
			}
			if (option.)
			for (T structureRepository : version.getApsArchitectureVersion().getAPSPlant().getStructures()) {
				if (isStructureReferencedByOption(structureRepository, (APSReqHardwareOption) option)) {
					MapUtil.putOrAddToMap(results, structureRepository, (APSReqHardwareOption) option);
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
	private static <T extends Entity> boolean isStructureReferencedByOption(T entity, 
			APSReqHardwareOption<T> option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewHardwareOption) {
			result = isStructureReferencedByIntroduceNewOption(entity, (APSReqIntroduceNewHardwareOption<T>) option);
		} else if (option instanceof APSReqChangeHardwareOption) {
			result = isStructureReferencedByChangeOption(entity, (APSReqChangeHardwareOption<T>) option);
		} else if (option instanceof APSReqReplaceHardwareOption) {
			result = isStructureReferencedByReplaceOption(entity, (APSReqReplaceHardwareOption<T>) option);
		} else if (option instanceof APSReqRemoveHardwareOption) {
			result = isStructureReferencedByRemoveOption(entity, (APSReqRemoveHardwareOption<T>) option);
		}
		return result;
	}
	
	/**
	 * Checks if a structure is affected by an "introduce new" option
	 * @param structure The structure to check on
	 * @param option The option which is changed
	 * @return True, if the structure is affected by the option, false otherwise
	 */
	private static <T extends Entity> boolean isStructureReferencedByIntroduceNewOption(
			T entity, APSReqIntroduceNewHardwareOption<T> option) {
		for (T entities : option.getEntities()) {
			if (entities.equals(entity)) {
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
	private static <T extends Entity> boolean isStructureReferencedByRemoveOption(
			T entity, APSReqRemoveHardwareOption<T> option) {
		for (T entities : option.getEntities()) {
			if (entities.equals(entity)) {
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
	private static <T extends Entity> boolean isStructureReferencedByReplaceOption(
			T entity, APSReqReplaceHardwareOption<T> option) {
		if (option.getNewEntity().equals(entity) || option.getOldEntity().equals(entity)) {
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
	private static <T extends Entity> boolean isStructureReferencedByChangeOption(
			T entity, APSReqChangeHardwareOption<T> option) {
		for (T entities : option.getEntities()) {
			if (entities.equals(entity)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	#  MODULE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<Module, Set<APSReqHardwareOption<Module>>> lookUpModulesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption<Module>> options) {
		Map<Module, Set<APSReqHardwareOption<Module>>> results = new HashMap<Module, Set<APSReqHardwareOption<Module>>>();
		
		for (APSReqHardwareOption<Module> option: options) {
			for (Module moduleRepository : version.getApsArchitectureVersion().getAPSPlant().getModuleRepository().getAllModulesInPlant()) {
				if (isModuleReferencedByOption(moduleRepository, option)) {
					MapUtil.putOrAddToMap(results, moduleRepository, option);
				}
			}
		}
		
		return results;
	}
	
	private static boolean isModuleReferencedByOption(Module module, 
			APSReqHardwareOption<Module> option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewHardwareOption) {
			result = isModuleReferencedByIntroduceNewOption(module, (APSReqIntroduceNewHardwareOption<Module>) option);
		} else if (option instanceof APSReqChangeHardwareOption) {
			result = isModuleReferencedByChangeOption(module, (APSReqChangeHardwareOption<Module>) option);
		} else if (option instanceof APSReqReplaceHardwareOption) {
			result = isModuleReferencedByReplaceOption(module, (APSReqReplaceHardwareOption<Module>) option);
		} else if (option instanceof APSReqRemoveHardwareOption) {
			result = isModuleReferencedByRemoveOption(module, (APSReqRemoveHardwareOption<Module>) option);
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
	
	/**
	 * Looks up Components which are referenced by changed options
	 * @param version The Architecture version to work with
	 * @param options Changed Options
	 * @return Map with Options and the Components they reference 
	 */
	public static Map<Component, Set<APSReqHardwareOption<Component>>> lookUpComponentsReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption<Component>> options) {
		Map<Component, Set<APSReqHardwareOption<Component>>> results = new HashMap<Component, Set<APSReqHardwareOption<Component>>>();
		
		for (APSReqHardwareOption<Component> option: options) {
			for (Component componentRepository : version.getApsArchitectureVersion().getAPSPlant().getComponentRepository().getAllComponentsInPlant()) {
				if (isComponentReferencedByOption(componentRepository, option)) {
					MapUtil.putOrAddToMap(results, componentRepository, option);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Checks if a Component is referenced by any of the possible option types
	 * @param component Component to check on
	 * @param option Changed Option
	 * @return True if referenced, false otherwise
	 */
	private static boolean isComponentReferencedByOption(Component component, 
			APSReqHardwareOption<Component> option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewHardwareOption) {
			result = isComponentReferencedByIntroduceNewOption(component, (APSReqIntroduceNewHardwareOption<Component>) option);
		} else if (option instanceof APSReqChangeHardwareOption) {
			result = isComponentReferencedByChangeOption(component, (APSReqChangeHardwareOption<Component>) option);
		} else if (option instanceof APSReqReplaceHardwareOption) {
			result = isComponentReferencedByReplaceOption(component, (APSReqReplaceHardwareOption<Component>) option);
		} else if (option instanceof APSReqRemoveHardwareOption) {
			result = isComponentReferencedByRemoveOption(component, (APSReqRemoveHardwareOption<Component>) option);
		}
		return result;
	}
	
	/**
	 * Checks if an Component is affected by an "introduce new" option
	 * @param Component The Component to check on
	 * @param option The option which is changed
	 * @return True, if the Component is affected by the option, false otherwise
	 */
	private static boolean isComponentReferencedByIntroduceNewOption(
			Component component, APSReqIntroduceNewHardwareOption<Component> option) {
		for (Component components : option.getEntities()) {
			if (components.equals(component)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if an Component is affected by an "remove" option
	 * @param Component The Component to check on
	 * @param option The option which is changed
	 * @return True, if the Component is affected by the option, false otherwise
	 */
	private static boolean isComponentReferencedByRemoveOption(
			Component component, APSReqRemoveHardwareOption<Component> option) {
		for (Component components : option.getEntities()) {
			if (components.equals(component)) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * Checks if a Component is affected by an "replace" option
	 * @param Component The Component to check on
	 * @param option The option which is changed
	 * @return True, if the Component is affected by the option, false otherwise
	 */
	private static boolean isComponentReferencedByReplaceOption(
			Component component, APSReqReplaceHardwareOption<Component> option) {
		if (option.getNewEntity().equals(component) || option.getOldEntity().equals(component)) {
			return true;
		} else {
			return false;
			}
	}
	
	/**
	 * Checks if a Component is affected by an "change" option
	 * @param Component The Component to check on
	 * @param option The option which is changed
	 * @return True, if the Component is affected by the option, false otherwise
	 */
	private static boolean isComponentReferencedByChangeOption(
			Component component, APSReqChangeHardwareOption<Component> option) {
		for (Component components : option.getEntities()) {
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
	public static Map<Interface, Set<APSReqHardwareOption<Interface>>> lookUpInterfacesReferencedByOptions(
			APSReqHardwareArchitectureVersion version, Collection<? extends APSReqHardwareOption<Interface>> options) {
		Map<Interface, Set<APSReqHardwareOption<Interface>>> results = new HashMap<Interface, Set<APSReqHardwareOption<Interface>>>();
		
		for (APSReqHardwareOption<Interface> option: options) {
			for (Interface interfaceRepository : version.getApsArchitectureVersion().getAPSPlant().getInterfaceRepository().getAllInterfacesInPlant()) {
				if (isInterfaceReferencedByOption(interfaceRepository, option)) {
					MapUtil.putOrAddToMap(results, interfaceRepository, option);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Checks if an interface is referenced by any of the possible option types
	 * @param interface Interface to check on
	 * @param option Changed Option
	 * @return True if referenced, false otherwise
	 */
	private static boolean isInterfaceReferencedByOption(Interface apsinterface, 
			APSReqHardwareOption<Interface> option) {
		boolean result = false;
		if (option instanceof APSReqIntroduceNewHardwareOption) {
			result = isInterfaceReferencedByIntroduceNewOption(apsinterface, (APSReqIntroduceNewHardwareOption<Interface>) option);
		} else if (option instanceof APSReqChangeHardwareOption) {
			result = isInterfaceReferencedByChangeOption(apsinterface, (APSReqChangeHardwareOption<Interface>) option);
		} else if (option instanceof APSReqReplaceHardwareOption) {
			result = isInterfaceReferencedByReplaceOption(apsinterface, (APSReqReplaceHardwareOption<Interface>) option);
		} else if (option instanceof APSReqRemoveHardwareOption) {
			result = isInterfaceReferencedByRemoveOption(apsinterface, (APSReqRemoveHardwareOption<Interface>) option);
		}
		return result;
	}
	
	/**
	 * Checks if an Interface is affected by an "introduce new" option
	 * @param interface The interface to check on
	 * @param option The option which is changed
	 * @return True, if the interface is affected by the option, false otherwise
	 */
	private static boolean isInterfaceReferencedByIntroduceNewOption(
			Interface apsInterface, APSReqIntroduceNewHardwareOption<Interface> option) {
		for (Interface apsInterfaces : option.getEntities()) {
			if (apsInterfaces.equals(apsInterface)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Checks if an Interface is affected by an "remove" option
	 * @param interface The interface to check on
	 * @param option The option which is changed
	 * @return True, if the interface is affected by the option, false otherwise
	 */
	private static boolean isInterfaceReferencedByRemoveOption(
			Interface apsInterface, APSReqRemoveHardwareOption<Interface> option) {
		for (Interface apsInterfaces : option.getEntities()) {
			if (apsInterfaces.equals(apsInterface)) {
				return true;
			}
		}
		return false;

	}
	
	/**
	 * Checks if an Interface is affected by an "replace" option
	 * @param interface The interface to check on
	 * @param option The option which is changed
	 * @return True, if the interface is affected by the option, false otherwise
	 */
	private static boolean isInterfaceReferencedByReplaceOption(
			Interface apsInterface, APSReqReplaceHardwareOption<Interface> option) {
		if (option.getNewEntity().equals(apsInterface) || option.getOldEntity().equals(apsInterface)) {
			return true;
		} else {
			return false;
			}
	}
	
	/**
	 * Checks if an Interface is affected by an "change" option
	 * @param interface The interface to check on
	 * @param option The option which is changed
	 * @return True, if the interface is affected by the option, false otherwise
	 */
	private static boolean isInterfaceReferencedByChangeOption(
			Interface apsInterface, APSReqChangeHardwareOption<Interface> option) {
		for (Interface interfaces : option.getEntities()) {
			if (interfaces.equals(apsInterface)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
