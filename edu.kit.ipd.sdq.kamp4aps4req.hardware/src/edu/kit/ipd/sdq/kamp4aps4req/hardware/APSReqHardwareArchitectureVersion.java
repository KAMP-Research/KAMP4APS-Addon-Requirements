package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import options.OptionRepository;
import options.OptionsFactory;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationRepository;
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
	
	public static class APSReqHardwareArchitectureVersionParams extends ArchitectureVersionParams {
		public String name;
		public APSReqHardwareModificationRepository modificationMarkRepository;
		
		public FieldOfActivityAnnotationRepository fieldOfActivityRepository;
		public DeploymentContextRepository deploymentContextRepository;
		public Plant aPSPlant;

		public IECModificationRepository iecModificationMarkRepository;
		public Repository iecRepository;
		public Configuration configuration;
		public IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository;
		
		public ReqRepository reqRepository;
		public DecisionRepository decisionRepository;
		public OptionRepository optionRepository;
	}
	
	public APSReqHardwareArchitectureVersion(APSReqHardwareArchitectureVersionParams archParams) {
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
	// Constructor for merged version of aps & iec
	public APSReqHardwareArchitectureVersion(String name, FieldOfActivityAnnotationRepository fieldOfActivityRepository,
			Plant aPSPlant, DeploymentContextRepository deploymentContextRepository, Repository iecRepository, 
			Configuration configuration, IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository,
			IECModificationRepository iecModificationMarkRepository,
			ReqRepository requirementsRepository, DecisionRepository decisionRepository,
			OptionRepository optionRepository, 
			APSReqHardwareModificationRepository modificationMarksRepository) {
		super(name, fieldOfActivityRepository, modificationMarksRepository, aPSPlant, deploymentContextRepository, iecRepository,
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
