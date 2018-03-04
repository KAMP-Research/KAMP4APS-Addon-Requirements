package edu.kit.ipd.sdq.kamp4aps4req.derivation;

import java.util.LinkedList;
import java.util.List;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider.APSReqLabelCustomizing;
import options.Option;
import relations.TraceableObject;
import requirements.Requirement;

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
