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
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.core.AbstractKAMP4IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
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
		
		String internalIECFieldOfActivityFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalIecRepositoryFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY;
		String internalConfigurationFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION;
		String internalIECModFilePath = filename + "." + AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_MODIFICATIONMARK;

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
		
		IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository = (IECFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, internalIECFieldOfActivityFilePath, loadResourceSet);
		Repository iecRepository = (Repository)loadEmfModelFromResource(folderpath, internalIecRepositoryFilePath, loadResourceSet);
		Configuration configuration = (Configuration)loadEmfModelFromResource(folderpath, internalConfigurationFilePath, loadResourceSet);
		IECModificationRepository iecModificationMarkRepository = (IECModificationRepository)loadEmfModelFromResource(folderpath, internalIECModFilePath, loadResourceSet);
		
		return new APSReqHardwareArchitectureVersion(versionname, fieldOfActivityRepository, aPSPlant, 
				deploymentContextRepository, iecRepository, configuration,
				iecFieldOfActivityRepository, iecModificationMarkRepository, requirementRepository, decisionRepository, optionRepository, modificationMarkRepository);
		
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
		
		IFile internalIECFieldOfActivityFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalIECRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY);
		IFile internalConfigurationFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION);
		IFile internalIECModFile = FileAndFolderManagement.retrieveFileWithExtension(folder, AbstractKAMP4IECArchitectureVersionPersistency.FILEEXTENSION_MODIFICATIONMARK);
		
		FieldOfActivityAnnotationRepository fieldOfActivityRepository = null;
		Plant apsPlant = null;
		DeploymentContextRepository deploymentContextRepository = null;
		
		ReqRepository reqRepository = null;
		DecisionRepository decisionRepository = null;
		OptionRepository optionRepository = null;
		APSReqHardwareModificationRepository modificationMarksRepository = null;
		
		IECFieldOfActivityAnnotationsRepository iecFieldOfActivityRepository = null;
		Repository iecRepository = null;
		Configuration configuration = null;
		IECModificationRepository iecModificationMarkRepository = null;
		
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
		
		if (internalIECFieldOfActivityFile != null && internalIECFieldOfActivityFile.exists())
			iecFieldOfActivityRepository = (IECFieldOfActivityAnnotationsRepository) loadEmfModelFromResource(internalIECFieldOfActivityFile.getFullPath().toString(), null, loadResourceSet);
		if (internalIECRepositoryFile != null && internalIECRepositoryFile.exists())
			iecRepository = (Repository)loadEmfModelFromResource(internalIECRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalConfigurationFile != null && internalConfigurationFile.exists())
			configuration = (Configuration)loadEmfModelFromResource(internalConfigurationFile.getFullPath().toString(), null, loadResourceSet);
		if (internalIECModFile != null && internalIECModFile.exists())
			iecModificationMarkRepository = (IECModificationRepository) loadEmfModelFromResource(internalIECModFile.getFullPath().toString(), null, loadResourceSet);

		
		return new APSReqHardwareArchitectureVersion(versionname, fieldOfActivityRepository, apsPlant, 
				deploymentContextRepository, iecRepository, configuration,
				iecFieldOfActivityRepository, iecModificationMarkRepository, reqRepository, decisionRepository, optionRepository, modificationMarksRepository);
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, APSReqHardwareArchitectureVersion version) {
		APSArchitectureVersionPersistency.savePCMAndKAMP4APSModels(targetDirectoryPath, filename, version);
		saveAPSReqModels(targetDirectoryPath, filename, version);
	}
	
}
