package edu.kit.ipd.sdq.kamp4aps4req.software;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
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
	public static APSReqSoftwareArchitectureVersion createEmptyHardwareModel(String name) {
		Repository iecRepository = IECRepositoryFactory.eINSTANCE.createRepository();
		Configuration configuration = IECModelFactory.eINSTANCE.createConfiguration();
		IECFieldOfActivityAnnotationsRepository fieldOfActivityRepository = 
				IECFieldOfActivityAnnotationsFactory.eINSTANCE.createIECFieldOfActivityAnnotationsRepository();

		ReqRepository reqRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		DecisionRepository decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		OptionRepository optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		APSReqSoftwareModificationRepository modificationRepository = 
				APSReqSoftwareArchitectureModelFactoryFacade.createModificationRepository();
		return new APSReqSoftwareArchitectureVersion(name, iecRepository, configuration, fieldOfActivityRepository, 
				reqRepository, decisionRepository, optionRepository, modificationRepository);
	}
	
	public static APSReqSoftwareModificationRepository createModificationRepository() {
		return Modificationmarks_softwareFactory.eINSTANCE.createAPSReqSoftwareModificationRepository();
	}
}
