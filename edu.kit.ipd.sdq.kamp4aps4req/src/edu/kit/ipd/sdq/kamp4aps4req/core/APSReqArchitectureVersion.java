package edu.kit.ipd.sdq.kamp4aps4req.core;

import decisions.DecisionRepository;
import options.OptionRepository;
import requirements.ReqRepository;

/**
 * Interface to classify hardware and software architecture versions as APSReq versions
 * @author Timo Maier
 *
 */
public interface APSReqArchitectureVersion {

	public OptionRepository getOptionRepository();
	
	public DecisionRepository getDecisionRepository();
	
	public ReqRepository getRequirementsRepository();
}
