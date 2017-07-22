package edu.kit.ipd.sdq.kamp4aps4req.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractDeriveWorkplanAction;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.EnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.core.derivation.APSReqDifferenceCalculation;

public class APSReqDeriveWorkplanAction extends AbstractDeriveWorkplanAction<APSReqArchitectureVersion> {

	public APSReqDeriveWorkplanAction() {
		setWorkplanDerivation(new APSReqDifferenceCalculation());
		setEnrichedWorkplanDerivation(new EnrichedWorkplanDerivation());
		setArchitectureVersionPersistency(new APSReqArchitectureVersionPersistency());
	}

}
