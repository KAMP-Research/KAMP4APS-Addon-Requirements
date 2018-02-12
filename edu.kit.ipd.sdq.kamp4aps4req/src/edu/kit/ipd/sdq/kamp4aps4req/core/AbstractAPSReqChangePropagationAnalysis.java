package edu.kit.ipd.sdq.kamp4aps4req.core;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksFactory;
import requirements.Requirement;
import options.Option;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
public class AbstractAPSReqChangePropagationAnalysis<T extends AbstractAPSReqArchitectureVersion> implements AbstractChangePropagationAnalysis<T> {

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
		

	}

	public void calculateRequirementsToArchitecturePropagation(T version, 
			Map<EObject, AbstractModification<?, EObject>> elementsMarkedInThisStep) {
		
	}

	public APSReqChangePropagationDueToSpecificationDependencies getChangePropagationDueToSpecificationDependencies() {
		return changePropagationDueToSpecificationDependencies;
	}

	public void setChangePropagationDueToSpecificationDependencies(
			APSReqChangePropagationDueToSpecificationDependencies changePropagationDueToSpecificationDependencies) {
		this.changePropagationDueToSpecificationDependencies = changePropagationDueToSpecificationDependencies;
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
}
