package edu.kit.ipd.sdq.kamp4aps4req.core;

import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksFactory;
import requirements.Requirement;
import options.Option;
import relations.DependencyObject;
import relations.TraceableObject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.cdo.common.CDOCommonSession.Options;
import org.eclipse.emf.ecore.EObject;

import decisions.Decision;

/**
 * The super class of the change Propagation for KAMP4aPS4Req.
 * Refined by hardware and software subclasses.
 * 
 * 1. determines a seed population of affected components (resp. provided roles)
 * 2. calculates in iterations:
 *    a) inter-component propagation
 *    b) intra-component propagation
 * 3. generates internal modification marks for affected elements
 * 
 * - elements which were already part of a seed population are not further investigated
 * 
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqChangePropagationAnalysis<T extends AbstractAPSReqArchitectureVersion> implements AbstractChangePropagationAnalysis<T> {

	protected APSReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies;
	
	protected Collection<Requirement> markedRequirements;
	protected Collection<Decision> markedDecisions;
	protected Collection<Option> markedOptions;
	
	@Override
	public void runChangePropagationAnalysis(T version) {
		// Create only one modification mark per element in this step
		Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep = 
				new HashMap<EObject, AbstractModification<?, EObject>>();
		
		this.prepareAnalysis(version);
		this.calculateRequirementsToArchitecturePropagation(version, elementsMarkedInThisStep);
	}
	
	private void prepareAnalysis(T version) {
		this.setChangePropagationDueToSpecificationDependencies(
				edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksFactory.
				eINSTANCE.createAPSReqChangePropagationDueToSpecificationDependencies());
		version.getModificationMarkRepository().getChangePropagationSteps().add(
				this.getChangePropagationDueToSpecificationDependencies());
		this.setMarkedRequirements(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, Requirement.class));
		this.setMarkedDecisions(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, Decision.class));
		this.setMarkedOptions(ArchitectureModelLookup.lookUpMarkedObjectsOfAType(
				version, Option.class));
		
	}

	public void calculateRequirementsToArchitecturePropagation(T version, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// 1 Requirement -> Requirement (depend)
		Map<Requirement, Set<DependencyObject>> requirementsToBeMarked = APSReqArchitectureModelLookup.
				lookUpObjectsDependOnObjects(this.getMarkedRequirements(), Requirement.class);
		this.createAndAddRequirementModifications(requirementsToBeMarked, elementsMarkedInThisStep);		
		// 2 Requirement -> Decision/Option (trigger, resolve, couldResolve)
		calculateAndMarkRequirementToDecisionAndOptionPropagation(elementsMarkedInThisStep);
		// 3 Decision -> Decision (depend)
		Map<Decision, Set<DependencyObject>> decisionsToBeMarked = APSReqArchitectureModelLookup.
				lookUpObjectsDependOnObjects(this.getMarkedDecisions(), Decision.class);
		this.createAndAddDecisionModifications(decisionsToBeMarked, elementsMarkedInThisStep);		
		// 4 Option -> Option (depend)
		Map<Option, Set<DependencyObject>> optionsToBeMarked = APSReqArchitectureModelLookup.
				lookUpObjectsDependOnObjects(this.getMarkedOptions(), Option.class);
		this.createAndAddOptionModifications(optionsToBeMarked, elementsMarkedInThisStep);
		// 5 Decision -> Architecture/Business process (select an option)
		// calculateAndMarkDecisionToArchitectureAndBusinessProcessPropagation(version, elementsMarkedInThisStep);
		// 6 Option -> Architecture/Business process
		// calculateAndMarkOptionToArchitectureAndBusinessProcessPropagation(version, elementsMarkedInThisStep);
				
		//Remove step if it contains no element
				if (this.getChangePropagationDueToSpecificationDependencies().eContents().isEmpty()) {
					version.getModificationMarkRepository().getChangePropagationSteps().remove(
							this.getChangePropagationDueToSpecificationDependencies());
				}
	}
	
	protected void calculateAndMarkRequirementToDecisionAndOptionPropagation(
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		// I Requirement -> Decision (trigger, resolve, couldResolve)
		Map<Decision, Set<EObject>> decisionsToBeMarked = new HashMap<Decision, Set<EObject>>();
		MapUtil.putOrAddToMap(decisionsToBeMarked, APSReqArchitectureModelLookup.
				lookUpDecisionsTriggeredByTriggerObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(decisionsToBeMarked, APSReqArchitectureModelLookup.
				lookUpDecisionsResolvingResolveObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(decisionsToBeMarked, APSReqArchitectureModelLookup.
				lookUpDecisionsCouldBeResolvingResolveObjects(this.getMarkedRequirements()));
		this.createAndAddDecisionModifications(decisionsToBeMarked, elementsMarkedInThisStep);
		// II Requirement -> Option (trigger, resolve, couldResolve)
		Map<Option, Set<EObject>> optionsToBeMarked = new HashMap<Option, Set<EObject>>();
		MapUtil.putOrAddToMap(optionsToBeMarked, APSReqArchitectureModelLookup.
				lookUpOptionsTriggeredByTriggerObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(optionsToBeMarked, APSReqArchitectureModelLookup.
				lookUpOptionsResolvingResolveObjects(this.getMarkedRequirements()));
		MapUtil.putOrAddToMap(optionsToBeMarked, APSReqArchitectureModelLookup.
				lookUpOptionsCouldBeResolvingResolveObjects(this.getMarkedRequirements()));
		this.createAndAddOptionModifications(optionsToBeMarked, elementsMarkedInThisStep);	
	}
	
	private <S extends EObject> void createAndAddRequirementModifications(Map<Requirement, Set<S>> requirementsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(requirementsToBeMarked, elementsMarkedInThisStep);
		for(Map.Entry<Requirement, Set<S>> requirementToBeMarkedEntry: 
				requirementsToBeMarked.entrySet()) {
			Requirement requirement = requirementToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(requirement)) {
				elementsMarkedInThisStep.get(requirement).getCausingElements().
					addAll(requirementToBeMarkedEntry.getValue());
			} else {
				APSReqModifyRequirement modifyRequirement = ModificationmarksFactory.
						eINSTANCE.createAPSReqModifyRequirement();
				modifyRequirement.setToolderived(true);
				modifyRequirement.setAffectedElement(requirement);
				modifyRequirement.getCausingElements().addAll(requirementToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(requirement, modifyRequirement);
				this.getMarkedRequirements().add(requirement);
				this.getChangePropagationDueToSpecificationDependencies().
					getRequirementModifications().add(modifyRequirement);
			}
		}
	}
	
	private <S extends EObject> void createAndAddDecisionModifications(Map<Decision, Set<S>> decisionsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(decisionsToBeMarked, elementsMarkedInThisStep);
		for(Map.Entry<Decision, Set<S>> decisionToBeMarkedEntry: 
				decisionsToBeMarked.entrySet()) {
			Decision decision = decisionToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(decision)) {
				elementsMarkedInThisStep.get(decision).getCausingElements().
					addAll(decisionToBeMarkedEntry.getValue());
			} else {
				APSReqModifyDecision modifyDecision = ModificationmarksFactory.eINSTANCE.createAPSReqModifyDecision();
				modifyDecision.setToolderived(true);
				modifyDecision.setAffectedElement(decision);
				modifyDecision.getCausingElements().addAll(decisionToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(decision, modifyDecision);
				this.getMarkedDecisions().add(decision);
				this.getChangePropagationDueToSpecificationDependencies().
					getDecisionModifications().add(modifyDecision);
			}
		}
	}
	
	private <S extends EObject> void createAndAddOptionModifications(Map<Option, Set<S>> optionsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		filterCircularCauses(optionsToBeMarked, elementsMarkedInThisStep);
		for(Map.Entry<Option, Set<S>> optionToBeMarkedEntry: 
				optionsToBeMarked.entrySet()) {
			Option option = optionToBeMarkedEntry.getKey();
			if (elementsMarkedInThisStep.containsKey(option)) {
				elementsMarkedInThisStep.get(option).getCausingElements().
					addAll(optionToBeMarkedEntry.getValue());
			} else {
				APSReqModifyOption modifyOption = ModificationmarksFactory.eINSTANCE.createAPSReqModifyOption();
				modifyOption.setToolderived(true);
				modifyOption.setAffectedElement(option);
				modifyOption.getCausingElements().addAll(optionToBeMarkedEntry.getValue());
				
				elementsMarkedInThisStep.put(option, modifyOption);
				this.getMarkedOptions().add(option);
				this.getChangePropagationDueToSpecificationDependencies().
					getOptionModifications().add(modifyOption);
			}
		}
	}
	
	/**
	 * The specification propagation is calculated forwards and backwards. If an 
	 * element 2 was marked because of an element 1 in the forward propagation, it
	 * would be misleading to create a modification of element 1 just because of the 
	 * opposite reference from element 2 in the backward propagation (king of circular 
	 * reference). Therefore, this method checks all causes for a potentially
	 * modified element and finds out if these causes belong the existing 
	 * modifications that were caused by the potentially modified element. If so, 
	 * the cause is removed (and if there are no causes left, then the whole entry).
	 */
	private static <S extends EObject, T extends TraceableObject> void filterCircularCauses(
			Map<T, Set<S>> objectsToBeMarked,
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		Map<T, Set<S>> circularMarks = new HashMap<T, Set<S>>();
		for (Map.Entry<T, Set<S>> objectsToBeMarkedEntry: 
				objectsToBeMarked.entrySet()) {
			for (S causingObject: objectsToBeMarkedEntry.getValue()) {
				if (elementsMarkedInThisStep.containsKey(causingObject) &&
						elementsMarkedInThisStep.get(causingObject).getCausingElements().
						contains(objectsToBeMarkedEntry.getKey())) {
					MapUtil.putOrAddToMap(circularMarks, objectsToBeMarkedEntry.getKey(), causingObject);
				}
			}
		}
		MapUtil.removeAllFromMap(objectsToBeMarked, circularMarks);
	}

	public Collection<Requirement> getMarkedRequirements() {
		return markedRequirements;
	}

	public void setMarkedRequirements(Collection<Requirement> markedRequirements) {
		this.markedRequirements = markedRequirements;
	}

	public Collection<Decision> getMarkedDecisions() {
		return markedDecisions;
	}

	public void setMarkedDecisions(Collection<Decision> markedDecisions) {
		this.markedDecisions = markedDecisions;
	}

	public Collection<Option> getMarkedOptions() {
		return markedOptions;
	}

	public void setMarkedOptions(Collection<Option> markedOptions) {
		this.markedOptions = markedOptions;
	}

	public APSReqChangePropagationDueToSpecificationDependencies getChangePropagationDueToSpecificationDependencies() {
		return changePropagationDueToSpecificationDependencies;
	}

	public void setChangePropagationDueToSpecificationDependencies(
			APSReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies) {
		this.changePropagationDueToSpecificationDependencies = changePropagationDueToSpecificationDependencies;
	}
}
