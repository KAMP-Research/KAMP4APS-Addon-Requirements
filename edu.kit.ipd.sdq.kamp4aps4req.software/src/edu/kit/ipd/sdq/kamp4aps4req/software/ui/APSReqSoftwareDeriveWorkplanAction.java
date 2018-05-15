package edu.kit.ipd.sdq.kamp4aps4req.software.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.software.derivation.APSReqSoftwareDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4iec.core.derivation.IECEnrichedWorkplanDerivation;

public class APSReqSoftwareDeriveWorkplanAction extends AbstractDeriveWorkplanAction<APSReqSoftwareArchitectureVersion> {

	public APSReqSoftwareDeriveWorkplanAction() {
		this.setWorkplanDerivation(new APSReqSoftwareDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new IECEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSReqSoftwareArchitectureVersionPersistency());
		
	}
	
}
