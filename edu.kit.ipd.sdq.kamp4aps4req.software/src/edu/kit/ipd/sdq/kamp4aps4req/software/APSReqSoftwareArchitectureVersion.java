package edu.kit.ipd.sdq.kamp4aps4req.software;

import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;

import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;

/**
 * Enhanced architecture version of IEC
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureVersion extends IECArchitectureVersion implements APSReqArchitectureVersion {

	private ReqRepository requirementsRepository;
	private DecisionRepository decisionRepository;
	private OptionRepository optionRepository;
	
	public static class APSReqSoftwareArchitectureVersionParams extends ArchitectureVersionParams {
		
		public String name;
		public APSReqSoftwareModificationRepository modificationMarkRepository;
		
		public Repository iecRepository;
		public Configuration configuration;
		public IECFieldOfActivityAnnotationsRepository fieldOfActivityRepository;
		
		public ReqRepository reqRepository;
		public DecisionRepository decisionRepository;
		public OptionRepository optionRepository;

	}
	
	/**
	 * Constructor
	 * @param name Name of Architecture Version
	 * @param requirementsRepository Requirements Repository
	 * @param decisionRepository Decision Repository
	 * @param optionRepository Option Repository
	 * @param modificationMarksRepository Modification marks Repository
	 * @param iecArchitectureVersion Architecture Version of the software in the system
	 */
	public APSReqSoftwareArchitectureVersion(APSReqSoftwareArchitectureVersionParams archParams) {
		super(archParams);
		if (requirementsRepository == null) {
			requirementsRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		}
		this.setRequirementsRepository(archParams.reqRepository);
		if (decisionRepository == null) {
			decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		}
		this.setDecisionRepository(archParams.decisionRepository);
		if (optionRepository == null) {
			optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		}
		this.setOptionRepository(archParams.optionRepository);
	}
	/*
	public APSReqSoftwareArchitectureVersion(String name, Repository iecRepository, Configuration configuration,
			IECFieldOfActivityAnnotationsRepository fieldOfActivityRepository, ReqRepository requirementsRepository, 
			DecisionRepository decisionRepository, OptionRepository optionRepository, 
			APSReqSoftwareModificationRepository modificationMarksRepository) {
		super(name, iecRepository, configuration, fieldOfActivityRepository, modificationMarksRepository);
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
	*/

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


