package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
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
	public static AbstractAPSReqArchitectureVersion createEmptyHardwareModel(String name) {
		APSArchitectureVersion apsModel = APSReqHardwareArchitectureModelFactoryFacade.createAPSArchitectureVersion(name);
		ReqRepository reqRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		DecisionRepository decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		OptionRepository optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		APSReqHardwareModificationRepository repository = APSReqHardwareArchitectureModelFactoryFacade.createModificationRepository();
		return new APSReqHardwareArchitectureVersion(name, reqRepository, decisionRepository, optionRepository, repository,
				apsModel);
	}
	
	
	public static APSArchitectureVersion createAPSArchitectureVersion(String name) {
		return APSArchitectureModelFactoryFacade.createEmptyModel(name);
	}
	
	public static APSReqHardwareModificationRepository createModificationRepository() {
		return Modificationmarks_hardwareFactory.eINSTANCE.createAPSReqHardwareModificationRepository();
	}
}
