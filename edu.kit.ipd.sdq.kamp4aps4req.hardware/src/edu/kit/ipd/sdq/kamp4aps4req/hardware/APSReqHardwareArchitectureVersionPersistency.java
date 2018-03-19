package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps.core.APSArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps.model.DeploymentContext.DeploymentContextRepository;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.Plant;
import edu.kit.ipd.sdq.kamp4aps.model.fieldofactivityannotations.FieldOfActivityAnnotationRepository;

import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareModificationRepository;
import requirements.ReqRepository;
import decisions.DecisionRepository;
import options.OptionRepository;

/**
 * This class provides loading and saving mechanism for models.
 * Uses the APS-specific classes from KAMP4aPS
 * @author Timo Maier
 *
 */
public class APSReqHardwareArchitectureVersionPersistency extends AbstractAPSReqArchitectureVersionPersistency<APSReqHardwareArchitectureVersion> {
	
	@Override
	public APSReqHardwareArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		String fieldOfActivityRepositoryFilePath = filename + "." + APSArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String deploymenContextFilePath = filename + "." + APSArchitectureVersionPersistency.FILEEXTENSION_DEPLOYMENTCONTEXT;
		String plantFilePath = filename + "." + APSArchitectureVersionPersistency.FILEEXTENSION_APS;
		String requirementsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_OPTIONS;
		String modificationMarksFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;

		// load the APS-related models
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = 
				(FieldOfActivityAnnotationRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		Plant aPSPlant = (Plant)loadEmfModelFromResource(folderpath, plantFilePath, loadResourceSet);
		DeploymentContextRepository deploymentContextRepository = 
				(DeploymentContextRepository)loadEmfModelFromResource(folderpath, deploymenContextFilePath, loadResourceSet);
		
		ReqRepository requirementRepository = (ReqRepository)loadEmfModelFromResource(folderpath, requirementsFilePath, loadResourceSet);
		DecisionRepository decisionRepository = (DecisionRepository)loadEmfModelFromResource(folderpath, decisionsFilePath, loadResourceSet);
		OptionRepository optionRepository = (OptionRepository)loadEmfModelFromResource(folderpath, optionsFilePath, loadResourceSet);
		APSReqHardwareModificationRepository modificationMarkRepository = (APSReqHardwareModificationRepository)loadEmfModelFromResource(folderpath, 
				modificationMarksFilePath, loadResourceSet);
				
		return new APSReqHardwareArchitectureVersion(versionname, fieldOfActivityRepository, modificationMarkRepository, 
				deploymentContextRepository, aPSPlant, requirementRepository, decisionRepository, optionRepository);
		
	}
	
	@Override
	public APSReqHardwareArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder, APSArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile apsPlantFile = FileAndFolderManagement.retrieveFileWithExtension(folder, APSArchitectureVersionPersistency.FILEEXTENSION_APS);
		IFile deploymentContextFile = FileAndFolderManagement.retrieveFileWithExtension(folder, APSArchitectureVersionPersistency.FILEEXTENSION_DEPLOYMENTCONTEXT);
		IFile requirementsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_REQUIREMENTS);
		IFile decisionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_DECISIONS);
		IFile apsOptionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_OPTIONS);
		IFile modificationMarksFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = null;
		Plant apsPlant = null;
		DeploymentContextRepository deploymentContextRepository = null;
		
		ReqRepository reqRepository = null;
		DecisionRepository decisionRepository = null;
		OptionRepository optionRepository = null;
		APSReqHardwareModificationRepository modificationMarksRepository = null;
		
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists()) {
			fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(
					fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (apsPlantFile != null && apsPlantFile.exists()) {
			apsPlant = (Plant)loadEmfModelFromResource(apsPlantFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (deploymentContextFile != null && deploymentContextFile.exists()) {
			deploymentContextRepository = (DeploymentContextRepository)loadEmfModelFromResource(deploymentContextFile.getFullPath().toString(), 
					null, loadResourceSet);
		}
		
		
		if (requirementsFile != null && requirementsFile.exists()) {
			reqRepository = (ReqRepository)loadEmfModelFromResource(requirementsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (decisionsFile != null && decisionsFile.exists()) {
			decisionRepository = (DecisionRepository)loadEmfModelFromResource(decisionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (apsOptionsFile != null && apsOptionsFile.exists()) {
			optionRepository = (OptionRepository)loadEmfModelFromResource(apsOptionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (modificationMarksFile != null && modificationMarksFile.exists()) {
			modificationMarksRepository = (APSReqHardwareModificationRepository)
					loadEmfModelFromResource(modificationMarksFile.getFullPath().toString(), null, loadResourceSet);
		}
		
		return new APSReqHardwareArchitectureVersion(versionname, fieldOfActivityRepository, modificationMarksRepository, 
				deploymentContextRepository, apsPlant, reqRepository, decisionRepository, optionRepository);
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, APSReqHardwareArchitectureVersion version) {
		APSArchitectureVersionPersistency.savePCMAndKAMP4APSModels(targetDirectoryPath, filename, version);
		saveAPSReqModels(targetDirectoryPath, filename, version);
	}
	
}
