package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareChangePropagationAnalysis;

/**
 * 
 * @generated NOT
 */
public class APSReqSoftwareChangePropagationAction extends AbstractChangePropagationAction<APSReqSoftwareArchitectureVersion> {

	@Override
	protected AbstractChangePropagationAnalysis<APSReqSoftwareArchitectureVersion> createChangePropagationAnalysis() {
		return new APSReqSoftwareChangePropagationAnalysis();
	}

	@Override
	protected AbstractArchitectureVersionPersistency<APSReqSoftwareArchitectureVersion> createArchitectureVersionPersistency() {
		return new APSReqSoftwareArchitectureVersionPersistency();
	}
}
