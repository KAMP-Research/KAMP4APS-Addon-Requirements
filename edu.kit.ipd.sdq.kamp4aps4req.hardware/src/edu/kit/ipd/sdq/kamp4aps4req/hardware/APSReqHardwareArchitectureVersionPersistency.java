package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
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
		APSArchitectureVersion apsArchitectureVersion = this.getApsArchitectureVersionPersistency().load(folderpath, filename, versionname);
				
		return new APSReqHardwareArchitectureVersion(versionname, requirementRepository, decisionRepository, optionRepository, modificationMarkRepository, apsArchitectureVersion);
		
	}
	
	@Override
	public APSReqHardwareArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		IFile requirementsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REQUIREMENTS);
		IFile decisionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_DECISIONS);
		IFile apsOptionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_OPTIONS);
		IFile modificationMarksFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		
		ReqRepository reqRepository = null;
		DecisionRepository decisionRepository = null;
		APSReqOptionRepository optionRepository = null;
		APSReqHardwareModificationRepository modificationMarksRepository = null;
		
		if (requirementsFile != null && requirementsFile.exists()) {
			reqRepository = (ReqRepository)loadEmfModelFromResource(requirementsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (decisionsFile != null && decisionsFile.exists()) {
			decisionRepository = (DecisionRepository)loadEmfModelFromResource(decisionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (apsOptionsFile != null && apsOptionsFile.exists()) {
			optionRepository = (APSReqOptionRepository)loadEmfModelFromResource(apsOptionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (modificationMarksFile != null && modificationMarksFile.exists()) {
			modificationMarksRepository = (APSReqHardwareModificationRepository)loadEmfModelFromResource(modificationMarksFile.getFullPath().toString(), null, loadResourceSet);
		}
		
		// load the APS model
		APSArchitectureVersion apsArchitectureVersion = this.getApsArchitectureVersionPersistency().load(folder, versionname);
				
		
		return new APSReqHardwareArchitectureVersion(versionname, reqRepository, decisionRepository, optionRepository, modificationMarksRepository, apsArchitectureVersion);
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, APSReqHardwareArchitectureVersion version) {
		saveAPSReqModels(targetDirectoryPath, filename, (AbstractAPSReqArchitectureVersion<?>) version);
		// save APS model
		this.getApsArchitectureVersionPersistency().save(targetDirectoryPath, filename, version.getApsArchitectureVersion());
		
	}

	

	public APSArchitectureVersionPersistency getApsArchitectureVersionPersistency() {
		return apsArchitectureVersionPersistency;
	}


	public void setApsArchitectureVersionPersistency(APSArchitectureVersionPersistency apsArchitectureVersionPersistency) {
		this.apsArchitectureVersionPersistency = apsArchitectureVersionPersistency;
	}
	
}
