package edu.kit.ipd.sdq.kamp4aps4req.derivation;

import decisions.Decision;
import options.Option;
import relations.TraceableObject;
import requirements.Requirement;

/**
 * Superclass of the internal mod. derivation for HW and SW, which use KAMP4aPS resp. KAMP4IEC
 * @author Timo Maier
 *
 */
public class APSReqInternalModificationDerivation {
	

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
	

	
}
