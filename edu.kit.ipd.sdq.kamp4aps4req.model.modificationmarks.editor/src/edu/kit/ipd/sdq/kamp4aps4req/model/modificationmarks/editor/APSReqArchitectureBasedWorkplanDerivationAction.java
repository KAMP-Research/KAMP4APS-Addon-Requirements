package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.EnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.core.derivation.APSReqDifferenceCalculation;

/**
 * @generated NOT
 */
public class APSReqArchitectureBasedWorkplanDerivationAction
		extends AbstractArchitectureBasedWorkplanDerivationAction<APSReqArchitectureVersion> {

	public APSReqArchitectureBasedWorkplanDerivationAction() {
		setWorkplanDerivation(new APSReqDifferenceCalculation());
		setEnrichedWorkplanDerivation(new EnrichedWorkplanDerivation());
		setArchitectureVersionPersistency(new APSReqArchitectureVersionPersistency());
	}

}
