package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareModificationRepository;
import requirements.ReqRepository;
import decisions.DecisionRepository;
import apsoptions.APSReqOptionRepository;

/**
 * This class provides loading and saving mechanism for models.
 * Uses the APS-specific classes from KAMP4aPS
 * @author Timo Maier
 *
 */
public class APSReqHardwareArchitectureVersionPersistency extends AbstractAPSReqArchitectureVersionPersistency<APSReqHardwareArchitectureVersion> {


	// Represents the APS specific models
	private APSArchitectureVersionPersistency apsArchitectureVersionPersistency;
	
	
	public APSReqHardwareArchitectureVersionPersistency() {
		this.setApsArchitectureVersionPersistency(new APSArchitectureVersionPersistency());
	}
	
	@Override
	public APSReqHardwareArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		String requirementsFilePath = filename + "." + FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + FILEEXTENSION_OPTIONS;
		String modificationMarksFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		
		ReqRepository requirementRepository = (ReqRepository)loadEmfModelFromResource(folderpath, requirementsFilePath, loadResourceSet);
		DecisionRepository decisionRepository = (DecisionRepository)loadEmfModelFromResource(folderpath, decisionsFilePath, loadResourceSet);
		APSReqOptionRepository optionRepository = (APSReqOptionRepository)loadEmfModelFromResource(folderpath, optionsFilePath, loadResourceSet);
		APSReqHardwareModificationRepository modificationMarkRepository = (APSReqHardwareModificationRepository)loadEmfModelFromResource(folderpath, 
				modificationMarksFilePath, loadResourceSet);
		
		// load the APS model
		APSArchitectureVersion apsArchitectureVersion = apsArchitectureVersionPersistency.load(folderpath, filename, versionname);
				
		return new APSReqHardwareArchitectureVersion(versionname, requirementRepository, decisionRepository, optionRepository, modificationMarkRepository, apsArchitectureVersion);
		
	}


	public APSArchitectureVersionPersistency getApsArchitectureVersionPersistency() {
		return apsArchitectureVersionPersistency;
	}


	public void setApsArchitectureVersionPersistency(APSArchitectureVersionPersistency apsArchitectureVersionPersistency) {
		this.apsArchitectureVersionPersistency = apsArchitectureVersionPersistency;
	}
	
}
