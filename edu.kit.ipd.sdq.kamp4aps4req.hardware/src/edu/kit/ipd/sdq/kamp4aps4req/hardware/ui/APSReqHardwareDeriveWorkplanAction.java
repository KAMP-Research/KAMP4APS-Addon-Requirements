package edu.kit.ipd.sdq.kamp4aps4req.hardware.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation.APSReqHardwareDifferenceCalculation;

/**
 * 
 * @author Timo Maier
 *
 */
public class APSReqHardwareDeriveWorkplanAction extends AbstractDeriveWorkplanAction<APSReqHardwareArchitectureVersion> {

	public APSReqHardwareDeriveWorkplanAction() {
		this.setWorkplanDerivation(new APSReqHardwareDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new APSEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSReqHardwareArchitectureVersionPersistency());
		
	}
}
