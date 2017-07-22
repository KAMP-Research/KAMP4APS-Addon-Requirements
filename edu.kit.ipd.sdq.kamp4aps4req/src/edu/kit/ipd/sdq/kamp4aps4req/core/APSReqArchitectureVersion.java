package edu.kit.ipd.sdq.kamp4aps4req.core;

import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;

/**
 * This class adds support for the requirements-related repositories for
 * requirements/options/decisions as fields.
 */
public class APSReqArchitectureVersion extends ArchitectureVersion {

	private ReqRepository requirementsRepository;
	private DecisionRepository decisionRepository;
	private OptionRepository optionRepository;

	public APSReqArchitectureVersion(ArchitectureVersionParams params, ReqRepository requirementsRepository,
			DecisionRepository decisionRepository, OptionRepository optionRepository) {

		super(params);
		if (requirementsRepository == null) {
			requirementsRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		}
		this.setRequirementsRepository(requirementsRepository);
		if (decisionRepository == null) {
			decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		}
		this.setDecisionRepository(decisionRepository);
		if (optionRepository == null) {
			optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		}
		this.setOptionRepository(optionRepository);
	}

	public ReqRepository getRequirementsRepository() {
		return requirementsRepository;
	}

	public void setRequirementsRepository(ReqRepository requirementsRepository) {
		this.requirementsRepository = requirementsRepository;
	}

	public DecisionRepository getDecisionRepository() {
		return decisionRepository;
	}

	public void setDecisionRepository(DecisionRepository decisionRepository) {
		this.decisionRepository = decisionRepository;
	}

	public OptionRepository getOptionRepository() {
		return optionRepository;
	}

	public void setOptionRepository(OptionRepository optionRepository) {
		this.optionRepository = optionRepository;
	}

}
