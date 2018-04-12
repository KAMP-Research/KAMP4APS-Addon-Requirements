package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;

/**
 * Class loading the hardware model, including the APS-Architecture version
 * @author Timo Maier
 *
 */
public class APSReqHardwareArchitectureModelFactoryFacade {

	/**
	 * Creates necessary repositories and creates an architecture version
	 * @param name Name of the architecture version
	 * @return Hardware architecture version
	 */
	public static APSReqHardwareArchitectureVersion createEmptyHardwareModel(String name) {
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = APSArchitectureModelFactoryFacade.createFieldOfActivityAnnotationsRepository();
		DeploymentContextRepository deploymentContextRepository = APSArchitectureModelFactoryFacade.createDeploymentContextRepository();
		Plant apsPlant = apsFactory.eINSTANCE.createPlant();
		ReqRepository reqRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		DecisionRepository decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		OptionRepository optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		APSReqHardwareModificationRepository modificationMarksRepository = APSReqHardwareArchitectureModelFactoryFacade.createModificationRepository();
		
		Repository iecRepository = IECRepositoryFactory.eINSTANCE.createRepository();
		Configuration configuration = IECModelFactory.eINSTANCE.createConfiguration();
		IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository = 
				IECFieldOfActivityAnnotationsFactory.eINSTANCE.createIECFieldOfActivityAnnotationsRepository();
		IECModificationRepository iecModificationRepository = IECModificationmarksFactory.eINSTANCE.createIECModificationRepository();
		
		return new APSReqHardwareArchitectureVersion(name, fieldOfActivityRepository, apsPlant, 
				deploymentContextRepository, iecRepository, 
				configuration, iecFieldOfActivityRepository,
				iecModificationRepository, reqRepository, decisionRepository, optionRepository, modificationMarksRepository);
	}
	
	public static APSReqHardwareModificationRepository createModificationRepository() {
		return APSReqHardwareModificationmarksFactory.eINSTANCE.createAPSReqHardwareModificationRepository();
	}
}
