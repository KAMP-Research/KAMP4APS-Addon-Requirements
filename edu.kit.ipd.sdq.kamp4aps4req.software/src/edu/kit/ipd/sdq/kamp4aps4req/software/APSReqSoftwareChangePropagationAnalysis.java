package edu.kit.ipd.sdq.kamp4aps4req.software;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyIECComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwareFactory;
import edu.kit.ipd.sdq.kamp4iec.core.IECChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;
import options.Option;
import relations.TraceableObject;

/**
 * Change Propagation Analysis of KAMP4aPS4Req for the software part.
 * Uses the KAMP4IEC change propagation analysis.
 * 
 * @author Timo Maier
 * 
 */
public class APSReqSoftwareChangePropagationAnalysis extends AbstractAPSReqChangePropagationAnalysis<APSReqSoftwareArchitectureVersion> {
	
	private IECChangePropagationAnalysis iecChangePropagationAnalysis;
	

	@Override
	/**
	 * Runs the change propagation analysis.
	 * @param version The software architecture version
	 */
	public void runChangePropagationAnalysis(APSReqSoftwareArchitectureVersion version) {
		// Create only one modification mark per element in this step
		Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?, EObject>>();
				
		// Preparation
		this.prepareAnalysis(version);
		
		// Calculate Req to architecture propagation
		this.calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
		
		// Run IEC-Specific Change Propagation Analysis
		this.getIecChangePropagationAnalysis().runChangePropagationAnalysis(version);
	}
	
	protected void prepareAnalysis(APSReqSoftwareArchitectureVersion version) {
		this.setIecChangePropagationAnalysis(new IECChangePropagationAnalysis());
		// set the software subclass to take care of IECComponent modifications
		this.setChangePropagationDueToSpecificationDependencies(
				Modificationmarks_softwareFactory.eINSTANCE.createAPSReqSoftwareChangePropagationDueToSpecificationDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps().add(this.getChangePropagationDueToSpecificationDependencies());
		super.prepareAnalysis(version);
	}
	
	@Override
	/**
	 * Calculates Requirements change propagation to the (software) architecture
	 * @param version Architecture Version
	 * @param elementsMarkedInThisStep Marked elements
	 */
	public void calculateRequirementsToArchitecturePropagation(APSReqSoftwareArchitectureVersion version, 
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
	

	private void calculateAndMarkOptionToArchitecturePropagation(APSReqSoftwareArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// Option -> IECComponent
		Map<IECComponent, Set<Option>> iecComponentsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookupIECComponentsReferencedByOptions(version, this.getMarkedOptions());
		createAndAddIECComponentModifications(iecComponentsToBeMarked, elementsMarkedInThisStep);
	}		
				
		/*	
				
		// I Option -> Configuration
		Map<Configuration, Set<Option>> configurationToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpConfigurationReferencedByOptions(version, this.getMarkedOptions());
		createAndAddConfigurationModifications(configurationToBeMarked, elementsMarkedInThisStep);
		// II Option -> Program
		Map<Program, Set<Option>> programToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpProgramReferencedByOptions(version, this.getMarkedOptions());
		createAndAddProgramModifications(programToBeMarked, elementsMarkedInThisStep);
		// III Option -> FunctionBlock
		Map<FunctionBlock, Set<Option>> functionBlocksToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpFunctionBlocksReferencedByOptions(version, this.getMarkedOptions());
		createAndAddFunctionBlockModifications(functionBlocksToBeMarked, elementsMarkedInThisStep);
		// IV Option -> Function
		Map<Function, Set<Option>> functionsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpFunctionsReferencedByOptions(version, this.getMarkedOptions());
		createAndAddFunctionModifications(functionsToBeMarked, elementsMarkedInThisStep);
		// V Option -> GlobalVariable
		Map<GlobalVariable, Set<Option>> globalVariablesToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpGlobalVariablesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddGlobalVariableModifications(globalVariablesToBeMarked, elementsMarkedInThisStep);
		// VI Option -> IECInterface
		Map<IECInterface, Set<Option>> iecInterfacesToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpIECInterfacesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddInterfaceModifications(iecInterfacesToBeMarked, elementsMarkedInThisStep);
		// VII Option -> IECMethod
		Map<IsMethod, Set<Option>> iecMethodsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpIECMethodsReferencedByOptions(version, this.getMarkedOptions());
		createAndAddIECMethodModifications(iecMethodsToBeMarked, elementsMarkedInThisStep);
		// VIII Option -> IECProperty
		Map<IsProperty, Set<Option>> iecPropertiesToBeMarked = APSReqSoftwareArchitectureModelLookup.
			lookUpIECPropertiesReferencedByOptions(version, this.getMarkedOptions());
		createAndAddIECPropertyModifications(iecPropertiesToBeMarked, elementsMarkedInThisStep);
		
		*/
	
	private void calculateAndMarkDecisionToArchitecturePropagation(APSReqSoftwareArchitectureVersion version,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		
		// Decision -> IECComponent
		Map<IECComponent, Set<Decision>> iecComponentsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookupIECComponentsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddIECComponentModifications(iecComponentsToBeMarked, elementsMarkedInThisStep);
	}	
			
		/*
		// I Decision -> Configuration
		Map<Configuration, Set<Decision>> configurationToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpConfigurationReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddConfigurationModifications(configurationToBeMarked, elementsMarkedInThisStep);
		// II Decision -> Program
		Map<Program, Set<Decision>> programToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpProgramReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddProgramModifications(programToBeMarked, elementsMarkedInThisStep);
		// III Decision -> FunctionBlock
		Map<FunctionBlock, Set<Decision>> functionBlocksToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpFunctionBlocksReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddFunctionBlockModifications(functionBlocksToBeMarked, elementsMarkedInThisStep);
		// IV Decision -> Function
		Map<Function, Set<Decision>> functionsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpFunctionsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddFunctionModifications(functionsToBeMarked, elementsMarkedInThisStep);
		// V Decision -> GlobalVariable
		Map<GlobalVariable, Set<Decision>> globalVariablesToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpGlobalVariablesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddGlobalVariableModifications(globalVariablesToBeMarked, elementsMarkedInThisStep);
		// VI Decision -> IECInterface
		Map<IECInterface, Set<Decision>> iecInterfacesToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpIECInterfacesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddInterfaceModifications(iecInterfacesToBeMarked, elementsMarkedInThisStep);
		// VII Decision -> IECMethod
		Map<IECMethod, Set<Decision>> iecMethodsToBeMarked = APSReqSoftwareArchitectureModelLookup.
				lookUpIECMethodsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddIECMethodModifications(iecMethodsToBeMarked, elementsMarkedInThisStep);
		// VIII Decision -> AbstractMethod
		Map<IECAbstractMethod, Set<Decision>> abstractMethodsToBeMarked = APSReqSoftwareArchitectureModelLookup.
			lookUpAbstractMethodsReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddAbstractMethodModifications(abstractMethodsToBeMarked, elementsMarkedInThisStep);
		// IX Decision -> IECProperty
		Map<IECProperty, Set<Decision>> iecPropertiesToBeMarked = APSReqSoftwareArchitectureModelLookup.
			lookUpIECPropertiesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddIECPropertyModifications(iecPropertiesToBeMarked, elementsMarkedInThisStep);
		// X Decision -> AbstractProperty
		Map<IECAbstractProperty, Set<Decision>> abstractPropertiesToBeMarked = APSReqSoftwareArchitectureModelLookup.
			lookUpAbstractPropertiesReferencedByDecisions(version, this.getMarkedDecisions());
		createAndAddAbstractPropertyModifications(abstractPropertiesToBeMarked, elementsMarkedInThisStep);
		
		*/
	
	private <T extends TraceableObject> void createAndAddConfigurationModifications(
			Map<Configuration, Set<T>> configurationsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Configuration, Set<T>> configurationsToBeMarkedEntry : configurationsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(configurationsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(configurationsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(configurationsToBeMarkedEntry.getValue());
			} else {
				IECModifyConfiguration modifyConfiguration = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyConfiguration();
				modifyConfiguration.setToolderived(true);
				modifyConfiguration.setAffectedElement(configurationsToBeMarkedEntry.getKey());
				modifyConfiguration.getCausingElements().addAll(configurationsToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(configurationsToBeMarkedEntry.getKey(), modifyConfiguration);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getConfigurationModifications().add(modifyConfiguration);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddProgramModifications(
			Map<Program, Set<T>> programsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Program, Set<T>> programsToBeMarkedEntry: programsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(programsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(programsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(programsToBeMarkedEntry.getValue());
			} else {
				IECModifyProgram modifyProgram = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyProgram();
				modifyProgram.setToolderived(true);
				modifyProgram.setAffectedElement(programsToBeMarkedEntry.getKey());
				modifyProgram.getCausingElements().addAll(programsToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(programsToBeMarkedEntry.getKey(), modifyProgram);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getProgramModifications().add(modifyProgram);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddFunctionBlockModifications(
			Map<FunctionBlock, Set<T>> functionBlocksToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<FunctionBlock, Set<T>> functionBlocksToBeMarkedEntry: functionBlocksToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(functionBlocksToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(functionBlocksToBeMarkedEntry.getKey()).
						getCausingElements().addAll(functionBlocksToBeMarkedEntry.getValue());
			} else {
				IECModifyFunctionBlock modifyFunctionBlock = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyFunctionBlock();
				modifyFunctionBlock.setToolderived(true);
				modifyFunctionBlock.setAffectedElement(functionBlocksToBeMarkedEntry.getKey());
				modifyFunctionBlock.getCausingElements().addAll(functionBlocksToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(functionBlocksToBeMarkedEntry.getKey(), modifyFunctionBlock);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getFunctionBlockModifications().add(modifyFunctionBlock);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddFunctionModifications(
			Map<Function, Set<T>> functionsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<Function, Set<T>> functionsToBeMarkedEntry: functionsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(functionsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(functionsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(functionsToBeMarkedEntry.getValue());
			} else {
				IECModifyFunction modifyFunctionBlock = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyFunction();
				modifyFunctionBlock.setToolderived(true);
				modifyFunctionBlock.setAffectedElement(functionsToBeMarkedEntry.getKey());
				modifyFunctionBlock.getCausingElements().addAll(functionsToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(functionsToBeMarkedEntry.getKey(), modifyFunctionBlock);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getFunctionModifications().add(modifyFunctionBlock);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddGlobalVariableModifications(
			Map<GlobalVariable, Set<T>> globalVariablesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<GlobalVariable, Set<T>> globalVariablesToBeMarkedEntry : globalVariablesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(globalVariablesToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(globalVariablesToBeMarkedEntry.getKey()).
						getCausingElements().addAll(globalVariablesToBeMarkedEntry.getValue());
			} else {
				IECModifyGlobalVariable modifyGlobalVariable = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyGlobalVariable();
				modifyGlobalVariable.setToolderived(true);
				modifyGlobalVariable.setAffectedElement(globalVariablesToBeMarkedEntry.getKey());
				modifyGlobalVariable.getCausingElements().addAll(globalVariablesToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(globalVariablesToBeMarkedEntry.getKey(), modifyGlobalVariable);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getGlobalVariableModifications().add(modifyGlobalVariable);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddInterfaceModifications(
			Map<IECInterface, Set<T>> iecInterfacesToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<IECInterface, Set<T>> iecInterfacesToBeMarkedEntry: iecInterfacesToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(iecInterfacesToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(iecInterfacesToBeMarkedEntry.getKey()).
						getCausingElements().addAll(iecInterfacesToBeMarkedEntry.getValue());
			} else {
				IECModifyInterface modifyIECInterface = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyInterface();
				modifyIECInterface.setToolderived(true);
				modifyIECInterface.setAffectedElement(iecInterfacesToBeMarkedEntry.getKey());
				modifyIECInterface.getCausingElements().addAll(iecInterfacesToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(iecInterfacesToBeMarkedEntry.getKey(), modifyIECInterface);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getIecInterfaceModifications().add(modifyIECInterface);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddIECMethodModifications(
			Map<IECMethod, Set<T>> iecMethodsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<IECMethod, Set<T>> iecMethodsToBeMarkedEntry: iecMethodsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(iecMethodsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(iecMethodsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(iecMethodsToBeMarkedEntry.getValue());
			} else {
				IECModifyMethod modifyIECMethod = 
						IECModificationmarksFactory.eINSTANCE.createIECModifyMethod();
				modifyIECMethod.setToolderived(true);
				modifyIECMethod.setAffectedElement(iecMethodsToBeMarkedEntry.getKey());
				modifyIECMethod.getCausingElements().addAll(iecMethodsToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(iecMethodsToBeMarkedEntry.getKey(), modifyIECMethod);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getIecMethodModifications().add(modifyIECMethod);
			}
		}
	}
	
	private <T extends TraceableObject> void createAndAddIECComponentModifications(
			Map<IECComponent, Set<T>> iecComponentsToBeMarked, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		for (Map.Entry<IECComponent, Set<T>> iecComponentsToBeMarkedEntry: iecComponentsToBeMarked.entrySet()) {
			if (elementsMarkedInThisStep.containsKey(iecComponentsToBeMarkedEntry.getKey())) {
				elementsMarkedInThisStep.get(iecComponentsToBeMarkedEntry.getKey()).
						getCausingElements().addAll(iecComponentsToBeMarkedEntry.getValue());
			} else {
				APSReqModifyIECComponent modifyIECComponent = 
						Modificationmarks_softwareFactory.eINSTANCE.createAPSReqModifyIECComponent();
				modifyIECComponent.setToolderived(true);
				modifyIECComponent.setAffectedElement(iecComponentsToBeMarkedEntry.getKey());
				modifyIECComponent.getCausingElements().addAll(iecComponentsToBeMarkedEntry.getValue());
			
				elementsMarkedInThisStep.put(iecComponentsToBeMarkedEntry.getKey(), modifyIECComponent);
				APSReqSoftwareChangePropagationDueToSpecificationDependencies softwareChanges = 
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) 
						this.getChangePropagationDueToSpecificationDependencies();
				softwareChanges.getIecComponentModifications().add(modifyIECComponent);
			}
		}
	}
	
	
	
	

	public IECChangePropagationAnalysis getIecChangePropagationAnalysis() {
		return iecChangePropagationAnalysis;
	}

	public void setIecChangePropagationAnalysis(IECChangePropagationAnalysis iecChangePropagationAnalysis) {
		this.iecChangePropagationAnalysis = iecChangePropagationAnalysis;
	}
	
}
