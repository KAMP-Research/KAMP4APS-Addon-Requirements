package edu.kit.ipd.sdq.kamp4aps4req.derivation;

import edu.kit.ipd.sdq.kamp.derivation.AbstractDifferenceCalculation;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractAPSReqDifferenceCalculation<T extends AbstractAPSReqArchitectureVersion<?>> extends AbstractDifferenceCalculation<T>{

	private final APSReqInternalModificationDerivation internalModificationDerivation = new APSReqInternalModificationDerivation();
	
	@Override
	public abstract List<Activity> deriveWorkplan(T baseVersion, T TargetVersion);
	
	
}
