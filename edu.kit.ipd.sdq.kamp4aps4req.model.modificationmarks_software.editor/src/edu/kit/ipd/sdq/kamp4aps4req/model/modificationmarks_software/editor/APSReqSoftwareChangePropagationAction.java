package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion;

/**
 * @generated NOT
 */
public class APSReqSoftwareChangePropagationAction extends AbstractChangePropagationAction<APSReqSoftwareArchitectureVersion> {

	@Override
	public AbstractChangePropagationAnalysis<APSReqSoftwareArchitectureVersion> createChangePropagationAnalysis() {
		return new APSReqSoftwareChangePropagationAnalysis();
	}

	@Override
	public AbstractArchitectureVersionPersistency<APSReqSoftwareArchitectureVersion> createArchitectureVersionPersistency() {
		return new APSReqSoftwareArchitectureVersionPersistency();
	}
	
}
