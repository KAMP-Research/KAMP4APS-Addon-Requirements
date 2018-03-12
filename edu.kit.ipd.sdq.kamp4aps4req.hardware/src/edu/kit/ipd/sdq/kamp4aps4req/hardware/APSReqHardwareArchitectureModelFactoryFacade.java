package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsFactory;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwareFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareModificationRepository;
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
		return new APSReqHardwareArchitectureVersion(name, fieldOfActivityRepository, modificationMarksRepository, 
				deploymentContextRepository, apsPlant, reqRepository, decisionRepository, optionRepository);
	}
	
	public static APSReqHardwareModificationRepository createModificationRepository() {
		return Modificationmarks_hardwareFactory.eINSTANCE.createAPSReqHardwareModificationRepository();
	}
}
