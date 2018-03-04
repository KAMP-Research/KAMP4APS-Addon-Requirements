package edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation;

import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;
import edu.kit.ipd.sdq.kamp4aps4req.derivation.APSReqInternalModificationDerivation;
import relations.TraceableObject;

public class APSReqHardwareInternalModificationDerivation extends APSReqInternalModificationDerivation {
	
	
	/**
	 * Gets names of elements which cause Modification
	 * @param modification Modification caused by elements returned
	 * @return List with Strings representing names of elements causing the modification
	 */
	public static List<String> getCausingElementsNames(AbstractModification<?,?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement: modification.getCausingElements()) {
			if (causingElement instanceof TraceableObject) {
				TraceableObject causingTraceableObject = (TraceableObject) causingElement;
				causingElementNames.add(causingTraceableObject.eClass().getName() + " \"" + 
						getElementNameForTraceableObject(causingTraceableObject) + "\"");
			} else if (causingElement instanceof Structure) {
				Structure causingStructure = (Structure) causingElement;
				causingElementNames.add(causingStructure.eClass().
						getName() + " \"" + causingStructure.getName() + "\"");
			}
		}
		return causingElementNames;
	}
	
}
