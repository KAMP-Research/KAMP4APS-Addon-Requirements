package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractChangePropagationAction;
import edu.kit.ipd.sdq.kamp.propagation.AbstractChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;

/**
 * Adapter class. Implementation in subclasses.
 * @generated NOT
 */
public abstract class AbstractAPSReqChangePropagationAction<T extends AbstractAPSReqArchitectureVersion<?>> extends AbstractChangePropagationAction<T> {

	@Override
	public abstract AbstractArchitectureVersionPersistency<T> createArchitectureVersionPersistency();
	
	@Override
	public abstract AbstractChangePropagationAnalysis<T> createChangePropagationAnalysis();
}
