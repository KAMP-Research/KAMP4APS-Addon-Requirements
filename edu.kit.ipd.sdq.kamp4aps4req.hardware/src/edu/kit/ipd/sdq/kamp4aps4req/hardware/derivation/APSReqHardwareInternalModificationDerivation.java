package edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSInternalModificationDerivation;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps4req.derivation.AbstractAPSReqInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqModifyEntity;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;

import relations.TraceableObject;

/**
 * Internal Modification derivation for the hardware, uses the internal mod. derivation of KAMP4aPS
 * @author Timo Maier
 *
 */
public class APSReqHardwareInternalModificationDerivation extends AbstractAPSReqInternalModificationDerivation {
	
	
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
			} else if (causingElement instanceof Entity) {
				Entity causingEntity = (Entity) causingElement;
				causingElementNames.add(causingEntity.eClass().
						getName() + " \"" + causingEntity.getName() + "\"");
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
		Activity result = APSInternalModificationDerivation.createModificationActivity(
				modification, causingElementNames, activityElementType);
		if (result != null) {
			return result;
		} else if (modification instanceof APSReqModifyTraceableObject<?>) {
			TraceableObject traceableObject = ((APSReqModifyTraceableObject<?>) modification).
					getAffectedElement();
			String elementName = getElementNameForTraceableObject(traceableObject);
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					traceableObject, elementName, causingElementNames, BasicActivity.MODIFY, 
					"Modify " + traceableObject.eClass().getName() + " " + elementName + ".");
		} else if (modification instanceof APSReqModifyEntity) {
			Entity entity = ((APSReqModifyEntity)modification).getAffectedElement();
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					entity, entity.getName(), causingElementNames, BasicActivity.MODIFY, 
					"Modify " + entity.eClass().getName() + " " + entity.getName() + ".");
		} else {
			return null;
		}
	}
	

	
	/**
	 * 
	 * @param targetVersion
	 * @return
	 */
	public List<Activity> deriveInternalModifications(APSReqHardwareArchitectureVersion targetVersion) {
		List<Activity> activityList = new LinkedList<Activity>();
		for (ChangePropagationStep currentPropagationStep: targetVersion.
				getModificationMarkRepository().getChangePropagationSteps()) {
			if (currentPropagationStep instanceof APSReqHardwareChangePropagationDueToSpecificationDependencies) {
				APSReqHardwareChangePropagationDueToSpecificationDependencies cp =
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) currentPropagationStep;
				this.deriveTraceableObjectModifications(cp.getRequirementModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getDecisionModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getOptionModifications(), activityList);
				this.deriveEntityModifications(cp.getEntityModifications(), activityList);
			}
		}
		return activityList;
	}
	
	private void deriveEntityModifications(Collection<APSReqModifyEntity> modifications, 
			List<Activity> activityList) {
		for (APSReqModifyEntity modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					APSReqHardwareActivityElementType.ENTITY));
		}
	}

	
}
