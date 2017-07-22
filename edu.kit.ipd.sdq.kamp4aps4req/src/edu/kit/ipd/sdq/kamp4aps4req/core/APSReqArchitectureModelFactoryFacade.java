package edu.kit.ipd.sdq.kamp4aps4req.core;

import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;
import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;

public class APSReqArchitectureModelFactoryFacade {

	public static APSReqArchitectureVersion createEmptyAPSReqModel(String name) {
		ArchitectureVersionParams params = new ArchitectureVersionParams();
		params.name = name;
		params.fieldOfActivityRepository = ArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		params.modificationMarkRepository = ArchitectureModelFactoryFacade.createKAPSModificationMarkRepository();
		params.deploymentContextRepository = ArchitectureModelFactoryFacade.createDeploymentContextRepository();
		ReqRepository requirementRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		DecisionRepository decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		OptionRepository optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		return new APSReqArchitectureVersion(params, requirementRepository, decisionRepository, optionRepository);
	}

	public static APSReqModificationRepository createAPSReqModificationmarksRepository() {
		APSReqModificationRepository repository = APSReqModificationmarksFactory.eINSTANCE
				.createAPSReqModificationRepository();

		APSReqSeedModifications seedModifications = APSReqModificationmarksFactory.eINSTANCE
				.createAPSReqSeedModifications();
		repository.setSeedModifications(seedModifications);

		return repository;
	}

}
