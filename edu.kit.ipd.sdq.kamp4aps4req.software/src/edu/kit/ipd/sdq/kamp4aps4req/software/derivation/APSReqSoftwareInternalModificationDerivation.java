package edu.kit.ipd.sdq.kamp4aps4req.software.derivation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps4req.derivation.AbstractAPSReqInternalModificationDerivation;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyIECComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECActivityType;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;
import relations.TraceableObject;

/**
 * Internal Modification derivation for the software, uses the internal mod. derivation of KAMP4IEC
 * @author Timo Maier
 *
 */
public class APSReqSoftwareInternalModificationDerivation extends AbstractAPSReqInternalModificationDerivation {

	/**
	 * Gets names of elements which cause Modification
	 * @param modification Modification caused by elements returned
	 * @return List with Strings representing names of elements causing the modification
	 */
	public List<String> getCausingElementsNames(AbstractModification<?,?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement: modification.getCausingElements()) {
			if (causingElement instanceof TraceableObject) {
				TraceableObject causingTraceableObject = (TraceableObject) causingElement;
				causingElementNames.add(causingTraceableObject.eClass().getName() + " \"" + 
						getElementNameForTraceableObject(causingTraceableObject) + "\"");
			} else if (causingElement instanceof IECComponent) {
				IECComponent causingIECComponent = (IECComponent) causingElement;
				causingElementNames.add(causingIECComponent.eClass().
						getName() + " \"" + causingIECComponent.getName() + "\"");
			}
		}
		return causingElementNames;
	}
	
	/**
	 * 
	 * @param modification
	 * @param causingElementNames
	 * @param activityElementType
	 * @return
	 */
	public Activity createModificationActivity(AbstractModification<?,?> 
	modification, List<String> causingElementNames, AbstractActivityElementType activityElementType) {
		Activity result = IECInternalModificationDerivation.createModificationActivity(
				modification, causingElementNames, activityElementType);
		if (result != null) {
			return result;
		} else if (modification instanceof APSReqModifyTraceableObject<?>) {
			TraceableObject traceableObject = ((APSReqModifyTraceableObject<?>) modification).
					getAffectedElement();
			String elementName = getElementNameForTraceableObject(traceableObject);
			return new Activity(IECActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					traceableObject, elementName, causingElementNames, BasicActivity.MODIFY, 
					"Modify " + traceableObject.eClass().getName() + " " + elementName + ".");
		} else if (modification instanceof APSReqModifyIECComponent){
			IECComponent iecComponent = ((APSReqModifyIECComponent)modification).getAffectedElement();
			return new Activity(IECActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					iecComponent, iecComponent.getName(), causingElementNames, BasicActivity.MODIFY, 
					"Modify " + iecComponent.eClass().getName() + " " + iecComponent.getName() + ".");
		} else {
			return null;
		}
	}
	
	
	/**
	 * 
	 * @param targetVersion
	 * @return
	 */
	public List<Activity> deriveInternalModifications(APSReqSoftwareArchitectureVersion targetVersion) {
		List<Activity> activityList = new LinkedList<Activity>();
		for (ChangePropagationStep currentPropagationStep: targetVersion.
				getModificationMarkRepository().getChangePropagationSteps()) {
			if (currentPropagationStep instanceof APSReqSoftwareChangePropagationDueToSpecificationDependencies) {
				APSReqSoftwareChangePropagationDueToSpecificationDependencies cp =
						(APSReqSoftwareChangePropagationDueToSpecificationDependencies) currentPropagationStep;
				this.deriveTraceableObjectModifications(cp.getRequirementModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getDecisionModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getOptionModifications(), activityList);
				this.deriveIECComponentModifications(cp.getIecComponentModifications(), activityList);
			}
		}
		return activityList;
	}
	
	private void deriveIECComponentModifications(Collection<APSReqModifyIECComponent> modifications, 
			List<Activity> activityList) {
		for (APSReqModifyIECComponent modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					APSReqSoftwareActivityElementType.IECCOMPONENT));
		}
	}
}
