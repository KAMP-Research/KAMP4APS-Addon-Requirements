package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqChangePropagationAnalysis;

/**
 * @generated NOT
 */
public class APSReqChangePropagationAction extends AbstractChangePropagationAction<APSReqArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<APSReqArchitectureVersion> createChangePropagationAnalysis() {
		return new APSReqChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<APSReqArchitectureVersion> createArchitectureVersionPersistency() {
		return new APSReqArchitectureVersionPersistency();
	}

}
