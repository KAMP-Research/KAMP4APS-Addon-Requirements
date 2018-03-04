package edu.kit.ipd.sdq.kamp4aps4req.hardware.ui;

import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation.APSReqHardwareDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation.APSReqHardwareEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.ui.AbstractAPSReqDeriveWorkplanAction;

/**
 * 
 * @author Timo Maier
 *
 */
public class APSReqHardwareDeriveWorkplanAction extends AbstractAPSReqDeriveWorkplanAction<APSReqHardwareArchitectureVersion> {

	public APSReqHardwareDeriveWorkplanAction() {
		this.setWorkplanDerivation(new APSReqHardwareDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new APSReqHardwareEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSReqHardwareArchitectureVersionPersistency());
		
	}
}
