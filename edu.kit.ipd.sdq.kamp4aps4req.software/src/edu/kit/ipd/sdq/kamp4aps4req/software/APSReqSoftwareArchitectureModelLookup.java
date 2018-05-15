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
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import options.Option;
import relations.SelectionObject;

/**
 * Lookup methods for option/decision to architecture propagation
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureModelLookup extends APSReqArchitectureModelLookup {

	
	/**
	 * Checks which IECComponents are referenced by Options.
	 * Depending on the Option Type, sub-routines are called, returning a map with 
	 * referenced IECComponents.
	 * All Maps are merged into one.
	 * @param version
	 * @param options
	 * @return Map containing IECComponents (key) and the Options they are referenced by (value)
	 */
	public static Map<IECComponent, Set<Option>> lookupIECComponentsReferencedByOptions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Option> options) {
		Map<IECComponent, Set<Option>> results = new HashMap<IECComponent, Set<Option>>();
		
		for (Option optionRepository : options) {
			if (optionRepository instanceof APSReqConfigurationOption) {
				// there is only one configuration, no extra map needed
				if (version.getConfiguration().equals(((APSReqConfigurationOption) optionRepository).getConfiguration())) {
					MapUtil.putOrAddToMap(results, version.getConfiguration(), optionRepository);
				}
			} else if (optionRepository instanceof APSReqProgramOption) {
				Map<Program, Set<Option>> mapToAdd = lookupProgramReferencedByOption(
						version,(APSReqProgramOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd);
			} else if (optionRepository instanceof APSReqFunctionOption) {
				Map<Function, Set<Option>> mapToAdd = lookupFunctionsReferencedByOption(
						version,(APSReqFunctionOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd);
			} else if (optionRepository instanceof APSReqFunctionBlockOption) {
				Map<FunctionBlock, Set<Option>> mapToAdd = lookupFunctionBlocksReferencedByOption(
						version, (APSReqFunctionBlockOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd);
			} else if (optionRepository instanceof APSReqGlobalVariableOption) {
				Map<GlobalVariable, Set<Option>> mapToAdd = lookupGlobalVariablesReferencedByOption(
						version, (APSReqGlobalVariableOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd);
			} else if (optionRepository instanceof APSReqIECInterfaceOption) {
				Map<IECInterface, Set<Option>> mapToAdd = lookupIECInterfacesReferencedByOption(
						version, (APSReqIECInterfaceOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd);
			} else if (optionRepository instanceof APSReqIECMethodOption) {
				Map<IECComponent, Set<Option>> mapToAdd = lookupIECMethodsReferencedByOption(
						version, (APSReqIECMethodOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd); 
			} else if (optionRepository instanceof APSReqIECPropertyOption) {
				Map<IECComponent, Set<Option>> mapToAdd = lookupIECPropertiesReferencedByOption(
						version, (APSReqIECPropertyOption) optionRepository);
				MapUtil.putOrAddToMap(results, mapToAdd);
			}
		}
		return results;
	}
	
	/**
	 * Checks which IECComponents are referenced by Decisions.
	 * Lookup-methods of each IECComponent are not called (like above for options) because they
	 * return a map with options instead of decisions
	 * @param version
	 * @param options
	 * @return Map containing IECComponents (key) and the Decisions they are referenced by (value)
	 */
	public static Map<IECComponent, Set<Decision>> lookupIECComponentsReferencedByDecisions(
			APSReqSoftwareArchitectureVersion version, Collection<? extends Decision> decisions) {
		Map<IECComponent, Set<Decision>> results = new HashMap<IECComponent, Set<Decision>>();

		for (Decision decisionRepository : decisions) {
			for (SelectionObject selection : decisionRepository.getSelected())
				if (selection instanceof APSReqConfigurationOption) {
					if (isIECComponentReferencedByOption(version.getConfiguration(), (APSReqConfigurationOption)selection)) {
						MapUtil.putOrAddToMap(results, version.getConfiguration(), decisionRepository);
					}
				} else if (selection instanceof APSReqProgramOption) {
					for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
						if (isIECComponentReferencedByOption(programRepo, (APSReqProgramOption)selection)) {
							MapUtil.putOrAddToMap(results, programRepo, decisionRepository);
						}
					}
				} else if (selection instanceof APSReqFunctionOption) {
					for (Function functionRepo : version.getIECRepository().getContainsFunction()) {
						if (isIECComponentReferencedByOption(functionRepo, (APSReqFunctionOption)selection)) {
							MapUtil.putOrAddToMap(results, functionRepo, decisionRepository);
						}
					}
				} else if (selection instanceof APSReqFunctionBlockOption) {
					for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
						if (isIECComponentReferencedByOption(functionBlockRepo, (APSReqFunctionBlockOption)selection)) {
							MapUtil.putOrAddToMap(results, functionBlockRepo, decisionRepository);
						}
					}
				} else if (selection instanceof APSReqGlobalVariableOption) {
					// check repo first
					for (GlobalVariable globalVarRepo : version.getIECRepository().getContainsGlobalVariable()) {
						if (isIECComponentReferencedByOption(globalVarRepo, (APSReqGlobalVariableOption)selection)) {
							MapUtil.putOrAddToMap(results, globalVarRepo, decisionRepository);
						}
					}
					// then programs
					for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
						for (GlobalVariable globalVarsInProgram : programRepo.getDeclaresGlobalVariable()) {
							if (isIECComponentReferencedByOption(globalVarsInProgram, (APSReqGlobalVariableOption)selection)) {
								MapUtil.putOrAddToMap(results, globalVarsInProgram, decisionRepository);
							}
						}
					}
				} else if (selection instanceof APSReqIECInterfaceOption) {
					for (IECInterface iecInterfaceRepo : version.getIECRepository().getContainsInterface()) {
						if (isIECComponentReferencedByOption(iecInterfaceRepo, (APSReqIECInterfaceOption)selection)) {
							MapUtil.putOrAddToMap(results, iecInterfaceRepo, decisionRepository);
						}
					}
				} else if (selection instanceof APSReqIECMethodOption) {
					// check FunctionBlocks for IECMethods
					for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
						for (IECMethod methodRepo : functionBlockRepo.getHasMethod()) {
							if (isIECComponentReferencedByOption(methodRepo, (APSReqIECMethodOption)selection)) {
								MapUtil.putOrAddToMap(results, methodRepo, decisionRepository);
							}
						}
					}
					// check IECInterfaces for AbstractMethods
					for (IECInterface interfaceRepo : version.getIECRepository().getContainsInterface()) {
						for (IECAbstractMethod methodRepo : interfaceRepo.getHasMethod()) {
							if (isIECComponentReferencedByOption(methodRepo, (APSReqIECMethodOption)selection)) {
								MapUtil.putOrAddToMap(results, methodRepo, decisionRepository);
							}
						}
					}
				} else if (selection instanceof APSReqIECPropertyOption) {
					// check FunctionBlocks for IECProperties
					for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
						for (IECProperty iecPropertyRepo : functionBlockRepo.getHasProperty()) {
							if (isIECComponentReferencedByOption(iecPropertyRepo, (APSReqIECPropertyOption)selection)) {
								MapUtil.putOrAddToMap(results, iecPropertyRepo, decisionRepository);
							}
						}
					}
					// check IECInterfaces for AbstractProperties
					for (IECInterface interfaceRepo : version.getIECRepository().getContainsInterface()) {
						for (IECAbstractProperty abstractPropertyRepo : interfaceRepo.getHasProperty()) {
							if (isIECComponentReferencedByOption(abstractPropertyRepo, (APSReqIECPropertyOption)selection)) {
								MapUtil.putOrAddToMap(results, abstractPropertyRepo, decisionRepository);
							}
						}
					}
				}
		}
		return results;
	}


	
	private static Map<Program, Set<Option>> lookupProgramReferencedByOption(APSReqSoftwareArchitectureVersion version,
			APSReqProgramOption option) {
		Map<Program, Set<Option>> results = new HashMap<Program, Set<Option>>();
		for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
			if (programRepo.equals(option.getProgram())) {
				MapUtil.putOrAddToMap(results, programRepo, option);
			}
		}
		return results;
	}
	
	private static Map<FunctionBlock, Set<Option>> lookupFunctionBlocksReferencedByOption(
			APSReqSoftwareArchitectureVersion version, APSReqFunctionBlockOption option) {
		Map<FunctionBlock, Set<Option>> results = new HashMap<FunctionBlock, Set<Option>>();
		for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
			if (isIECComponentReferencedByOption(functionBlockRepo, option)) {
				MapUtil.putOrAddToMap(results, functionBlockRepo, option);
			}
		}
		return results;
		
		
	}
	
	private static Map<Function, Set<Option>> lookupFunctionsReferencedByOption(
			APSReqSoftwareArchitectureVersion version, APSReqFunctionOption option) {
		Map<Function, Set<Option>> results = new HashMap<Function, Set<Option>>();
		for (Function functionRepo : version.getIECRepository().getContainsFunction()) {
			if (isIECComponentReferencedByOption(functionRepo, option)) {
				MapUtil.putOrAddToMap(results, functionRepo, option);
			}
		}
		return results;
	}
	
	private static Map<GlobalVariable, Set<Option>> lookupGlobalVariablesReferencedByOption(
			APSReqSoftwareArchitectureVersion version, APSReqGlobalVariableOption option) {
		Map<GlobalVariable, Set<Option>> results = new HashMap<GlobalVariable, Set<Option>>();
		// check for global vars in the IECRepository
		for (GlobalVariable globalVariableRepo : version.getIECRepository().getContainsGlobalVariable()) {
			if (isIECComponentReferencedByOption(globalVariableRepo, option)) {
				MapUtil.putOrAddToMap(results, globalVariableRepo, option);
			}
		}
		// now check for global vars in Programs
		for (Program programRepo : version.getConfiguration().getInstantiatesProgram()) {
			for (GlobalVariable globalVarInProgram : programRepo.getDeclaresGlobalVariable()) {
				if (isIECComponentReferencedByOption(globalVarInProgram, option)) {
					MapUtil.putOrAddToMap(results, globalVarInProgram, option);
				}
			}
		}
		return results;
	}
	
	private static Map<IECInterface, Set<Option>> lookupIECInterfacesReferencedByOption(
			APSReqSoftwareArchitectureVersion version, APSReqIECInterfaceOption option) {
		Map<IECInterface, Set<Option>> results = new HashMap<IECInterface, Set<Option>>();
		for (IECInterface iecInterfaceRepo : version.getIECRepository().getContainsInterface()) {
			if (isIECComponentReferencedByOption(iecInterfaceRepo, option)) {
				MapUtil.putOrAddToMap(results, iecInterfaceRepo, option);
			}
		}
		return results;
	}
	
	private static Map<IECComponent, Set<Option>> lookupIECMethodsReferencedByOption(
			APSReqSoftwareArchitectureVersion version, APSReqIECMethodOption option) {
		Map<IECComponent, Set<Option>> results = new HashMap<IECComponent, Set<Option>>();
		// switch order of for loops to distinguish between AbstractMethod and IECMethod
		for (IsMethod referencedByOption : option.getIecMethods()) {
			if (referencedByOption instanceof IECMethod) {
				// IECMethods are contained in FunctionBlocks
				for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
					for (IECMethod methodRepo : functionBlockRepo.getHasMethod()) {
						if (methodRepo.equals(referencedByOption)) {
							MapUtil.putOrAddToMap(results, methodRepo, option);
						}
					}
				}
			} else if (referencedByOption instanceof IECAbstractMethod) {
				// AbstractMethods are contained in IECInterfaces
				for (IECInterface interfaceRepo : version.getIECRepository().getContainsInterface()) {
					for (IECAbstractMethod abstractMethodRepo : interfaceRepo.getHasMethod()) {
						if (abstractMethodRepo.equals(referencedByOption)) {
							MapUtil.putOrAddToMap(results, abstractMethodRepo, option);
						}
					}
				}
			}
		}
		return results;
	}
	
	private static Map<IECComponent, Set<Option>> lookupIECPropertiesReferencedByOption(
			APSReqSoftwareArchitectureVersion version, APSReqIECPropertyOption option) {
		Map<IECComponent, Set<Option>> results = new HashMap<IECComponent, Set<Option>>();
		// switch order of for loops to distinguish between AbstractMethod and IECMethod
		for (IsProperty referencedByOption : option.getIecProperties()) {
			if (referencedByOption instanceof IECProperty) {
				// IECProperties are contained in FunctionBlocks
				for (FunctionBlock functionBlockRepo : version.getIECRepository().getContainsFunctionBlock()) {
					for (IECProperty propertyRepo : functionBlockRepo.getHasProperty()) {
						if (propertyRepo.equals(referencedByOption)) {
							MapUtil.putOrAddToMap(results, propertyRepo, option);
						}
					}
				}
			} else if (referencedByOption instanceof IECAbstractProperty) {
				// AbstractProperties are contained in IECInterfaces
				for (IECInterface interfaceRepo : version.getIECRepository().getContainsInterface()) {
					for (IECAbstractProperty abstractPropertyRepo : interfaceRepo.getHasProperty()) {
						if (abstractPropertyRepo.equals(referencedByOption)) {
							MapUtil.putOrAddToMap(results, abstractPropertyRepo, option);
						}
					}
				}
			}
		}
		return results;
	}
	
	private static boolean isIECComponentReferencedByOption(IECComponent iecComponent, Option option) {
		
		if (option instanceof APSReqConfigurationOption) {
			if (iecComponent.equals(((APSReqConfigurationOption)option).getConfiguration())) {
				return true;
			}
		} else if (option instanceof APSReqProgramOption) {
				if (iecComponent.equals(((APSReqProgramOption)option).getProgram())) {
					return true;
				}
		} else if (option instanceof APSReqFunctionOption) {
			for (Function functionRepo : (((APSReqFunctionOption)option).getFunctions())) {
				if (iecComponent.equals(functionRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqFunctionBlockOption) {
			for (FunctionBlock functionBlockRepo : (((APSReqFunctionBlockOption)option).getFunctionBlocks())) {
				if (iecComponent.equals(functionBlockRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqGlobalVariableOption) {
			for (GlobalVariable globalVariableRepo : (((APSReqGlobalVariableOption)option).getGlobalVariables())) {
				if (iecComponent.equals(globalVariableRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqIECInterfaceOption) {
			for (IECInterface iecInterfaceRepo : (((APSReqIECInterfaceOption)option).getIecInterfaces())) {
				if (iecComponent.equals(iecInterfaceRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqIECMethodOption) {
			for (IsMethod iecMethodRepo : (((APSReqIECMethodOption)option).getIecMethods())) {
				if (iecComponent.equals(iecMethodRepo)) {
					return true;
				}
			}
		} else if (option instanceof APSReqIECPropertyOption) {
			for (IsProperty iecPropertyRepo : (((APSReqIECPropertyOption)option).getIecProperties())) {
				if (iecComponent.equals(iecPropertyRepo)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
//  ########################################################################################################################
//	########################################################################################################################
//  ########################################################################################################################
	
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
