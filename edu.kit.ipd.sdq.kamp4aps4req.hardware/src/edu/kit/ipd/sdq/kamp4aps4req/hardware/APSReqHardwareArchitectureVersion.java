package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import decisions.DecisionRepository;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractKAMP4aPS4ReqModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;
import options.OptionRepository;
import requirements.ReqRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;

/**
 * Sub class of APSReqArchitectureVersion, representing the software side
 * @author Timo Maier
 *
 */
public class APSReqHardwareArchitectureVersion extends AbstractAPSReqArchitectureVersion<APSReqHardwareModificationRepository> {

	/**
	 * Represents architecture version of the hardware
	 */
	private APSArchitectureVersion apsArchitectureVersion;
	
	/**
	 * Constructor
	 * @param name Name of Architecture Version
	 * @param requirementsRepository Requirements Repository
	 * @param decisionRepository Decision Repository
	 * @param optionRepository Option Repository
	 * @param modificationMarksRepository Modification marks Repository
	 * @param iecArchitectureVersion Architecture Version of the software in the system
	 */
	public APSReqHardwareArchitectureVersion(String name, ReqRepository requirementsRepository, DecisionRepository decisionRepository,
			OptionRepository optionRepository, 
			APSReqHardwareModificationRepository modificationMarksRepository,
			APSArchitectureVersion apsArchitectureVersion) {
		
		super(name, requirementsRepository, decisionRepository, optionRepository, modificationMarksRepository);
		this.setApsArchitectureVersion(apsArchitectureVersion);
	}

	public APSArchitectureVersion getApsArchitectureVersion() {
		return apsArchitectureVersion;
	}

	public void setApsArchitectureVersion(APSArchitectureVersion apsArchitectureVersion) {
		this.apsArchitectureVersion = apsArchitectureVersion;
	}
	
}
