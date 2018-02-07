package edu.kit.ipd.sdq.kamp4aps4req.software;

import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwareFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareModificationRepository;
import options.OptionRepository;
import options.OptionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;

/**
 * Class loading the software model, including the IEC architecture version
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureModelFactoryFacade {

	/**
	 * Creates necessary repositories and creates an architecture version
	 * @param name Name of the architecture version
	 * @return Software architecture version
	 */
	public static AbstractAPSReqArchitectureVersion createEmptyHardwareModel(String name) {
		IECArchitectureVersion apsModel = APSReqSoftwareArchitectureModelFactoryFacade.createIECArchitectureVersion(name);
		ReqRepository reqRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		DecisionRepository decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		OptionRepository optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		APSReqSoftwareModificationRepository repository = APSReqSoftwareArchitectureModelFactoryFacade.createModificationRepository();
		return new APSReqSoftwareArchitectureVersion(name, reqRepository, decisionRepository, optionRepository, repository,
				apsModel);
	}
	
	
	public static IECArchitectureVersion createIECArchitectureVersion(String name) {
		return IECArchitectureModelFactoryFacade.createEmptyModel(name);
	}
	
	public static APSReqSoftwareModificationRepository createModificationRepository() {
		return Modificationmarks_softwareFactory.eINSTANCE.createAPSReqSoftwareModificationRepository();
	}
}
