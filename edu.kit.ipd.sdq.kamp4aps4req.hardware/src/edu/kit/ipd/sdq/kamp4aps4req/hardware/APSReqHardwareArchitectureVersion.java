package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import options.OptionRepository;
import options.OptionsFactory;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import requirements.ReqRepository;
import requirements.RequirementsFactory;

/**
 * Hardware Architecture Version enhancing APS Architecture Version
 * @author Timo Maier
 *
 */
public class APSReqHardwareArchitectureVersion extends APSArchitectureVersion implements APSReqArchitectureVersion {

	private ReqRepository requirementsRepository;
	private DecisionRepository decisionRepository;
	private OptionRepository optionRepository;
	
	/*
	public APSReqHardwareArchitectureVersion(String name, FieldOfActivityAnnotationRepository fieldOfActivityRepository,
			APSReqHardwareModificationRepository modificationMarksRepository, DeploymentContextRepository deploymentContextRepository,
			Plant aPSPlant, ReqRepository requirementsRepository, DecisionRepository decisionRepository,
			OptionRepository optionRepository) {
		super(name, fieldOfActivityRepository, modificationMarksRepository, deploymentContextRepository, aPSPlant, null, null, null, null);
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
	
	// Constructor for merged version of aps & iec
	public APSReqHardwareArchitectureVersion(String name, FieldOfActivityAnnotationRepository fieldOfActivityRepository,
			Plant aPSPlant, DeploymentContextRepository deploymentContextRepository, Repository iecRepository, 
			Configuration configuration, IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository,
			IECModificationRepository iecModificationMarkRepository,
			ReqRepository requirementsRepository, DecisionRepository decisionRepository,
			OptionRepository optionRepository, 
			APSReqHardwareModificationRepository modificationMarksRepository) {
		super(name, fieldOfActivityRepository, modificationMarksRepository, deploymentContextRepository, aPSPlant, iecRepository,
				configuration, iecFieldOfActivityRepository, iecModificationMarkRepository);
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
