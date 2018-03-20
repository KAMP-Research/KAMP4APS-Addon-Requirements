package edu.kit.ipd.sdq.kamp4aps4req.derivation;

import java.util.Collection;
import java.util.List;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;
import options.Option;
import relations.TraceableObject;
import requirements.Requirement;

/**
 * Abstract Superclass of the internal mod. derivation for HW and SW, which use KAMP4aPS resp. KAMP4IEC
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqInternalModificationDerivation {
	

	protected static String getElementNameForTraceableObject(TraceableObject object) {
		if (object instanceof Requirement) {
			return "\"" + ((Requirement)object).getSpecification() + "\"";
		} else if (object instanceof Decision) {
			return "\"" + ((Decision)object).getDescription() + "\"";
		} else if (object instanceof Option) {
			return "\"" + ((Option)object).getDescription() + "\"";
		} else {
			return null;
		}
	}
	
	protected void deriveTraceableObjectModifications(Collection<? extends APSReqModifyTraceableObject<?>> modifications, 
			List<Activity> activityList) {
		for (APSReqModifyTraceableObject<?> modification: modifications) {
			activityList.add(this.createModificationActivity(modification, 
					APSReqActivityElementType.getActivityTypeForObject(modification.getAffectedElement())));
		}
	}
	
	/**
	 * 
	 * @param modification
	 * @param activityElementType
	 * @return
	 */
	public Activity createModificationActivity(AbstractModification<?,?>  
		modification, AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = this.getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}
	
	protected abstract Activity createModificationActivity(AbstractModification<?,?> modification, 
			List<String> causingElementNames, AbstractActivityElementType activityElementType);
	
	protected abstract List<String> getCausingElementsNames(AbstractModification<?,?> modification);
	
}
