package edu.kit.ipd.sdq.kamp4aps4req.software;

import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryFactory;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion.APSReqSoftwareArchitectureVersionParams;


import options.OptionsFactory;

import requirements.RequirementsFactory;

import decisions.DecisionsFactory;

/**
 * Class loading the software model, including the IEC architecture version
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureModelFactoryFacade {

	private static APSReqSoftwareArchitectureVersionParams archParams = new APSReqSoftwareArchitectureVersionParams();
	
	/**
	 * Creates necessary repositories and creates an architecture version
	 * @param name Name of the architecture version
	 * @return Software architecture version
	 */
	public static APSReqSoftwareArchitectureVersion createEmptySoftwareModel(String name) {
		archParams.iecRepository = IECRepositoryFactory.eINSTANCE.createRepository();
		archParams.configuration = IECModelFactory.eINSTANCE.createConfiguration();
		archParams.fieldOfActivityRepository = 
				IECFieldOfActivityAnnotationsFactory.eINSTANCE.createIECFieldOfActivityAnnotationsRepository();

		archParams.reqRepository = RequirementsFactory.eINSTANCE.createReqRepository();
		archParams.decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
		archParams.optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
		archParams.modificationMarkRepository = 
				APSReqSoftwareArchitectureModelFactoryFacade.createModificationRepository();
		
		return new APSReqSoftwareArchitectureVersion(archParams);
	}
	
	public static APSReqSoftwareModificationRepository createModificationRepository() {
		return APSReqSoftwareModificationmarksFactory.eINSTANCE.createAPSReqSoftwareModificationRepository();
	}
}
