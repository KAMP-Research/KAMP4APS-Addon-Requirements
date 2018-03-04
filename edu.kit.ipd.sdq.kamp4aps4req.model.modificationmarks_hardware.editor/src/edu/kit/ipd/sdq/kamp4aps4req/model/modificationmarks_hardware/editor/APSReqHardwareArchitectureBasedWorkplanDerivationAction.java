package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.editor;

import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation.APSReqHardwareDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation.APSReqHardwareEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.editor.AbstractAPSReqArchitectureBasedWorkplanDerivation;

/**
 *@generated NOT
 */
public class APSReqHardwareArchitectureBasedWorkplanDerivationAction extends AbstractAPSReqArchitectureBasedWorkplanDerivation<APSReqHardwareArchitectureVersion> {

	public APSReqHardwareArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new APSReqHardwareDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new APSReqHardwareEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSReqHardwareArchitectureVersionPersistency());
	}
	
}
