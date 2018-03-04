package edu.kit.ipd.sdq.kamp4aps4req.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;

/**
 * Abstract adapter class
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqCreateEmptyBaseModelAction<T extends AbstractAPSReqArchitectureVersion<?>> extends AbstractCreateEmptyBaseModelAction<T> {

	@Override
	protected abstract T createArchitectureVersion();
	
}
