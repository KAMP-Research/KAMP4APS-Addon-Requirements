package edu.kit.ipd.sdq.kamp4aps4req.software;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import apssoftwareoptions.APSReqConfigurationOption;
import apssoftwareoptions.APSReqFunctionBlockOption;
import apssoftwareoptions.APSReqFunctionOption;
import apssoftwareoptions.APSReqGlobalVariableOption;
import apssoftwareoptions.APSReqIECInterfaceOption;
import apssoftwareoptions.APSReqIECMethodOption;
import apssoftwareoptions.APSReqIECPropertyOption;
import apssoftwareoptions.APSReqProgramOption;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import options.Option;
import relations.SelectionObject;

/**
 * 
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureModelLookup extends APSReqArchitectureModelLookup {

	//TODO: Abstract Property / Method lookup
	
	
	/*	########################################################################################################################
	 * 	#  FUNCTIONBLOCK LOOKUP SECTION  #######################################################################################
	 *  ########################################################################################################################              
	 */
	
	/**
	 * Looks up FunctionBlocks which are referenced by changed options
	 * @param version The architecture version to work with
	 * @param options Changed Options
	 * @return Map with Options and the FunctionBlocks they reference 
	 */
	public static Map<FunctionBlock, Set<Option>> lookUpFunctionBlocksReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<FunctionBlock, Set<Option>> results = new HashMap<FunctionBlock, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqFunctionBlockOption) {
				for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
					if (isFunctionBlockReferencedByOption(functionBlockRepo,  (APSReqFunctionBlockOption) option)) {
						MapUtil.putOrAddToMap(results, functionBlockRepo, option);
					}
				}
			}
		}
		return results;
	}
	
	
	/**
	 * Looks up FunctionBlocks which are referenced by changed Decisions
	 * @param version The Architecture version to work with
	 * @param decisions Changed Decisions
	 * @return Map with Decisions and the FunctionBlocks they reference 
	 */
	public static Map<FunctionBlock, Set<Decision>> lookUpFunctionBlocksReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<FunctionBlock, Set<Decision>> results = new HashMap<FunctionBlock, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqFunctionBlockOption) {
					for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
						if (isFunctionBlockReferencedByOption(functionBlockRepo, (APSReqFunctionBlockOption) selection)) {
							MapUtil.putOrAddToMap(results, functionBlockRepo, decision);
						}
					}
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Checks if a FunctionBlock is referenced by any option
	 * @param functionBlock FunctionBlock to check
	 * @param option Changed Option
	 * @return True if referenced, false otherwise
	 */
	private static boolean isFunctionBlockReferencedByOption(FunctionBlock functionBlock, 
			APSReqFunctionBlockOption option) {
		for (FunctionBlock functionBlocks : option.getFunctionBlocks()) {
			if (functionBlocks.equals(functionBlock)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	#  FUNCTION LOOKUP SECTION  ############################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<Function, Set<Option>> lookUpFunctionsReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Function, Set<Option>> results = new HashMap<Function, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqFunctionOption) {
				for (Function functionRepo : version.getIECRepository().getContainsFunction()) {
					if (isFunctionReferencedByOption(functionRepo,  (APSReqFunctionOption) option)) {
						MapUtil.putOrAddToMap(results, functionRepo, option);
					}
				}
			}
		}
		return results;
	}
	
	
	public static Map<Function, Set<Decision>> lookUpFunctionsReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Function, Set<Decision>> results = new HashMap<Function, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqFunctionOption) {
					for (Function functionRepo : version.getIECRepository().getContainsFunction()) {
						if (isFunctionReferencedByOption(functionRepo, (APSReqFunctionOption) selection)) {
							MapUtil.putOrAddToMap(results, functionRepo, decision);
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isFunctionReferencedByOption(Function function, 
			APSReqFunctionOption option) {
		for (Function functions : option.getFunctions()) {
			if (function.equals(functions)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	#  GLOBAL VARIABLE LOOKUP SECTION  #####################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<GlobalVariable, Set<Option>> lookUpGlobalVariablesReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<GlobalVariable, Set<Option>> results = new HashMap<GlobalVariable, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqGlobalVariableOption) {
				for (GlobalVariable globalVariableRepo : version.getIECRepository().getContainsGlobalVariable()) {
					if (isGlobalVariableReferencedByOption(globalVariableRepo,  (APSReqGlobalVariableOption) option)) {
						MapUtil.putOrAddToMap(results, globalVariableRepo, option);
					}
				}
			}
		}
		return results;
	}
	
	
	public static Map<GlobalVariable, Set<Decision>> lookUpGlobalVariablesReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<GlobalVariable, Set<Decision>> results = new HashMap<GlobalVariable, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqGlobalVariableOption) {
					for (GlobalVariable globalVariableRepo : version.getIECRepository().getContainsGlobalVariable()) {
						if (isGlobalVariableReferencedByOption(globalVariableRepo, (APSReqGlobalVariableOption) selection)) {
							MapUtil.putOrAddToMap(results, globalVariableRepo, decision);
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isGlobalVariableReferencedByOption(GlobalVariable globalVariable, 
			APSReqGlobalVariableOption option) {
		for (GlobalVariable globalVariables : option.getGlobalVariables()) {
			if (globalVariable.equals(globalVariables)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	#  IECINTERFACE LOOKUP SECTION  ###########################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<IECInterface, Set<Option>> lookUpIECInterfacesReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<IECInterface, Set<Option>> results = new HashMap<IECInterface, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqIECInterfaceOption) {
				for (IECInterface iecInterfaceRepo : version.getIECRepository().getContainsInterface()) {
					if (isIECInterfaceReferencedByOption(iecInterfaceRepo,  (APSReqIECInterfaceOption) option)) {
						MapUtil.putOrAddToMap(results, iecInterfaceRepo, option);
					}
				}
			}
		}
		return results;
	}
	
	
	public static Map<IECInterface, Set<Decision>> lookUpIECInterfacesReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<IECInterface, Set<Decision>> results = new HashMap<IECInterface, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqIECInterfaceOption) {
					for (IECInterface iecInterfaceRepo : version.getIECRepository().getContainsInterface()) {
						if (isIECInterfaceReferencedByOption(iecInterfaceRepo, (APSReqIECInterfaceOption) selection)) {
							MapUtil.putOrAddToMap(results, iecInterfaceRepo, decision);
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isIECInterfaceReferencedByOption(IECInterface iecInterface, 
			APSReqIECInterfaceOption option) {
		for (IECInterface iecInterfaces : option.getIecInterfaces()) {
			if (iecInterface.equals(iecInterfaces)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	# METHOD LOOKUP SECTION  ###############################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<IsMethod, Set<Option>> lookUpIECMethodsReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<IsMethod, Set<Option>> results = new HashMap<IsMethod, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqIECMethodOption) {
				for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
					for (IsMethod methodRepo : programRepo.getCallsMethod()) {
						if (isIECMethodReferencedByOption(methodRepo, (APSReqIECMethodOption) option)) {
						MapUtil.putOrAddToMap(results, methodRepo, option);
					}
					}
				}
			}
		}
		return results;
	}
	
	
	public static Map<IsMethod, Set<Decision>> lookUpIECMethodsReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<IsMethod, Set<Decision>> results = new HashMap<IsMethod, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqIECMethodOption) {
					for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
						for (IsMethod methodRepo : programRepo.getCallsMethod()) {
							if (isIECMethodReferencedByOption(methodRepo, (APSReqIECMethodOption) selection)) {
								MapUtil.putOrAddToMap(results, methodRepo, decision);
							}
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isIECMethodReferencedByOption(IsMethod iecMethod, 
			APSReqIECMethodOption option) {
		for (IsMethod iecMethods : option.getIecMethods()) {
			if (iecMethod.equals(iecMethods)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	#  PROPERTY LOOKUP SECTION  ############################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<IsProperty, Set<Option>> lookUpIECPropertiesReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<IsProperty, Set<Option>> results = new HashMap<IsProperty, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqIECPropertyOption) {
				for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
					for (IsProperty readProperties : programRepo.getReadsProperty()) {
						if (isIECPropertyReferencedByOption(readProperties,  (APSReqIECPropertyOption) option)) {
							MapUtil.putOrAddToMap(results, readProperties, option);
						}
					}
					for (IsProperty writeProperties : programRepo.getWritesProperty()) {
						if (isIECPropertyReferencedByOption(writeProperties,  (APSReqIECPropertyOption) option)) {
							MapUtil.putOrAddToMap(results, writeProperties, option);
						}
					}
				}
			}
		}
		return results;
	}
	
	
	public static Map<IsProperty, Set<Decision>> lookUpIECPropertiesReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<IsProperty, Set<Decision>> results = new HashMap<IsProperty, Set<Decision>>();
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqIECPropertyOption) {
					// check properties which are read and written by each Program
					for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
						for(IsProperty readProperties : programRepo.getWritesProperty()) {
							if (isIECPropertyReferencedByOption(readProperties, (APSReqIECPropertyOption) selection)) {
								MapUtil.putOrAddToMap(results, readProperties, decision);
							}
						}
						for (IsProperty writeProperties : programRepo.getWritesProperty()) {
							if (isIECPropertyReferencedByOption(writeProperties, (APSReqIECPropertyOption) selection)) {
								MapUtil.putOrAddToMap(results, writeProperties, decision);
							}
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isIECPropertyReferencedByOption(IsProperty iecProperty, 
			APSReqIECPropertyOption option) {
		for (IsProperty iecProperties : option.getIecProperties()) {
			if (iecProperty.equals(iecProperties)) {
				return true;
			}
		}
		return false;
	}
	
	/*	########################################################################################################################
	 * 	#  CONFIGURATION LOOKUP SECTION  ############################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<Configuration, Set<Option>> lookUpConfigurationReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Configuration, Set<Option>> results = new HashMap<Configuration, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqConfigurationOption) {
				APSReqConfigurationOption configurationOption = (APSReqConfigurationOption) option;
				if (configurationOption.getConfiguration().equals(version.getConfiguration())) {
						MapUtil.putOrAddToMap(results, configurationOption.getConfiguration(), configurationOption);
				}
			}
		}
		return results;
	}
	
	public static Map<Configuration, Set<Decision>> lookUpConfigurationReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Configuration, Set<Decision>> results = new HashMap<Configuration, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqConfigurationOption) {
					APSReqConfigurationOption configurationOption = (APSReqConfigurationOption) selection;
					if (configurationOption.getConfiguration().equals(version.getConfiguration())) {
						MapUtil.putOrAddToMap(results, version.getConfiguration(), decision);
					}
				}
			}
		}
		return results;
	}
	
	
	/*	########################################################################################################################
	 * 	#  PROGRAM LOOKUP SECTION  ############################################################################################
	 *  ########################################################################################################################              
	 */
	
	public static Map<Program, Set<Option>> lookUpProgramReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<Program, Set<Option>> results = new HashMap<Program, Set<Option>>();
		for (Option option: options) {
			if (option instanceof APSReqProgramOption) {
				APSReqProgramOption programOption = (APSReqProgramOption) option;
				for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
					if (programRepo.equals(programOption.getProgram())) {
						MapUtil.putOrAddToMap(results, programRepo, programOption);
					}
				}
			}
		}
		return results;
	}
	
	public static Map<Program, Set<Decision>> lookUpProgramReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<Program, Set<Decision>> results = new HashMap<Program, Set<Decision>>();
		
		for (Decision decision: decisions) {
			for (SelectionObject selection: decision.getSelected()) {
				if (selection instanceof APSReqProgramOption) {
					APSReqProgramOption programOption = (APSReqProgramOption) selection;
					for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
						if (programOption.getProgram().equals(programRepo)) {
							MapUtil.putOrAddToMap(results, programRepo, decision);
						}
					}
				}
			}
		}
		return results;
	}

}
