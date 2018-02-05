package edu.kit.ipd.sdq.kamp4aps4req.software;


import decisions.DecisionRepository;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractKAMP4aPS4ReqModificationRepository;
import options.OptionRepository;
import requirements.ReqRepository;

/**
 * Sub class of APSReqArchitectureVersion, representing the software side
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureVersion extends APSReqArchitectureVersion {

	/**
	 * Represents architecture version of the software
	 */
	private IECArchitectureVersion iecArchitectureVersion;
	
	/**
	 * Constructor
	 * @param name Name of Architecture Version
	 * @param requirementsRepository Requirements Repository
	 * @param decisionRepository Decision Repository
	 * @param optionRepository Option Repository
	 * @param modificationMarksRepository Modification marks Repository
	 * @param iecArchitectureVersion Architecture Version of the software in the system
	 */
	public APSReqSoftwareArchitectureVersion(String name, ReqRepository requirementsRepository, DecisionRepository decisionRepository,
			OptionRepository optionRepository, AbstractKAMP4aPS4ReqModificationRepository<?> modificationMarksRepository,
			IECArchitectureVersion iecArchitectureVersion) {
		
		super(name, requirementsRepository, decisionRepository, optionRepository, modificationMarksRepository);
		this.setIecArchitectureVersion(iecArchitectureVersion);
		
	}
	
	
	public IECArchitectureVersion getIecArchitectureVersion() {
		return iecArchitectureVersion;
	}
	
	public void setIecArchitectureVersion(IECArchitectureVersion iecArchitectureVersion) {
		this.iecArchitectureVersion = iecArchitectureVersion;
	}
}


