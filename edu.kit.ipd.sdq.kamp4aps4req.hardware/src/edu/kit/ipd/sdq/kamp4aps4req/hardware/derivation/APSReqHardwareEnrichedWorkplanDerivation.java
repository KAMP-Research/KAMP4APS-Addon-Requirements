package edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation;

import java.util.List;

import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.derivation.AbstractAPSReqEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;

/**
 * This class serves as an adapter and calculates the enriched workplan by calling the 
 * derivation algorithm of the underlying APS system (KAMP4aPS).
 * @author Timo Maier
 *
 */
public class APSReqHardwareEnrichedWorkplanDerivation extends AbstractAPSReqEnrichedWorkplanDerivation<APSReqHardwareArchitectureVersion> {

	private APSEnrichedWorkplanDerivation apsEnrichedWorkplanDerivation;
	
	public APSReqHardwareEnrichedWorkplanDerivation() {
		this.setApsEnrichedWorkplanDerivation(new APSEnrichedWorkplanDerivation());
	}
	
	@Override
	public List<Activity> deriveEnrichedWorkplan(APSReqHardwareArchitectureVersion baseArchitectureVersion,
			APSReqHardwareArchitectureVersion subVersion, List<Activity> baseActivityList) {
		return this.getApsEnrichedWorkplanDerivation().deriveEnrichedWorkplan(baseArchitectureVersion.getApsArchitectureVersion(), 
				subVersion.getApsArchitectureVersion(), baseActivityList);
	}

	public APSEnrichedWorkplanDerivation getApsEnrichedWorkplanDerivation() {
		return apsEnrichedWorkplanDerivation;
	}

	public void setApsEnrichedWorkplanDerivation(APSEnrichedWorkplanDerivation apsEnrichedWorkplanDerivation) {
		this.apsEnrichedWorkplanDerivation = apsEnrichedWorkplanDerivation;
	}
	
}
