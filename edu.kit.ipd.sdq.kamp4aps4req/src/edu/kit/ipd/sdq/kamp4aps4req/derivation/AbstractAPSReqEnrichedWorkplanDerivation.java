package edu.kit.ipd.sdq.kamp4aps4req.derivation;

import java.util.List;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.workplan.AbstractEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp.workplan.Activity;

/**
 * Abstract super class of the adapter classes for KAMP4aPS and KAMP4IEC (for enriched workplan derivation)
 * @author Timo
 *
 * @param <T>
 */
public abstract class AbstractAPSReqEnrichedWorkplanDerivation<T extends AbstractArchitectureVersion<?>> implements AbstractEnrichedWorkplanDerivation<T> {

	@Override
	public abstract List<Activity> deriveEnrichedWorkplan(T baseArchitectureVersion,
			T subVersion, List<Activity> baseActivityList);
}
