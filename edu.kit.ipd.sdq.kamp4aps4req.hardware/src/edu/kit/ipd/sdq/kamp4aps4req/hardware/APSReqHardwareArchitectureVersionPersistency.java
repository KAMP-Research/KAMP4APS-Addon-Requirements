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
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion.APSReqHardwareArchitectureVersionParams;
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
	
	private APSReqHardwareArchitectureVersionParams archParams = new APSReqHardwareArchitectureVersionParams();
	
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
		/*
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
		*/
		archParams.fieldOfActivityRepository = 
				(FieldOfActivityAnnotationRepository)loadEmfModelFromResource(folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		archParams.aPSPlant = (Plant)loadEmfModelFromResource(folderpath, plantFilePath, loadResourceSet);
		archParams.deploymentContextRepository = 
				(DeploymentContextRepository)loadEmfModelFromResource(folderpath, deploymenContextFilePath, loadResourceSet);
		
		archParams.reqRepository = (ReqRepository)loadEmfModelFromResource(folderpath, requirementsFilePath, loadResourceSet);
		archParams.decisionRepository = (DecisionRepository)loadEmfModelFromResource(folderpath, decisionsFilePath, loadResourceSet);
		archParams.optionRepository = (OptionRepository)loadEmfModelFromResource(folderpath, optionsFilePath, loadResourceSet);
		archParams.modificationMarkRepository = (APSReqHardwareModificationRepository)loadEmfModelFromResource(folderpath, 
				modificationMarksFilePath, loadResourceSet);
		
		archParams.iecFieldOfActivityRepository = (IECFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, internalIECFieldOfActivityFilePath, loadResourceSet);
		archParams.iecRepository = (Repository)loadEmfModelFromResource(folderpath, internalIecRepositoryFilePath, loadResourceSet);
		archParams.configuration = (Configuration)loadEmfModelFromResource(folderpath, internalConfigurationFilePath, loadResourceSet);
		archParams.iecModificationMarkRepository = (IECModificationRepository)loadEmfModelFromResource(folderpath, internalIECModFilePath, loadResourceSet);
		
		return new APSReqHardwareArchitectureVersion(archParams);
		
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
		
		/*
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
		*/
		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists()) {
			archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository)loadEmfModelFromResource(
					fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (apsPlantFile != null && apsPlantFile.exists()) {
			archParams.aPSPlant = (Plant)loadEmfModelFromResource(apsPlantFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (deploymentContextFile != null && deploymentContextFile.exists()) {
			archParams.deploymentContextRepository = (DeploymentContextRepository)loadEmfModelFromResource(deploymentContextFile.getFullPath().toString(), 
					null, loadResourceSet);
		}
		
		
		if (requirementsFile != null && requirementsFile.exists()) {
			archParams.reqRepository = (ReqRepository)loadEmfModelFromResource(requirementsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (decisionsFile != null && decisionsFile.exists()) {
			archParams.decisionRepository = (DecisionRepository)loadEmfModelFromResource(decisionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (apsOptionsFile != null && apsOptionsFile.exists()) {
			archParams.optionRepository = (OptionRepository)loadEmfModelFromResource(apsOptionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (modificationMarksFile != null && modificationMarksFile.exists()) {
			archParams.modificationMarkRepository = (APSReqHardwareModificationRepository)
					loadEmfModelFromResource(modificationMarksFile.getFullPath().toString(), null, loadResourceSet);
		}
		
		if (internalIECFieldOfActivityFile != null && internalIECFieldOfActivityFile.exists())
			archParams.iecFieldOfActivityRepository = (IECFieldOfActivityAnnotationsRepository) loadEmfModelFromResource(internalIECFieldOfActivityFile.getFullPath().toString(), null, loadResourceSet);
		if (internalIECRepositoryFile != null && internalIECRepositoryFile.exists())
			archParams.iecRepository = (Repository)loadEmfModelFromResource(internalIECRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		if (internalConfigurationFile != null && internalConfigurationFile.exists())
			archParams.configuration = (Configuration)loadEmfModelFromResource(internalConfigurationFile.getFullPath().toString(), null, loadResourceSet);
		if (internalIECModFile != null && internalIECModFile.exists())
			archParams.iecModificationMarkRepository = (IECModificationRepository) loadEmfModelFromResource(internalIECModFile.getFullPath().toString(), null, loadResourceSet);

		
		return new APSReqHardwareArchitectureVersion(archParams);
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, APSReqHardwareArchitectureVersion version) {
		APSArchitectureVersionPersistency.savePCMAndKAMP4APSModels(targetDirectoryPath, filename, version);
		saveAPSReqModels(targetDirectoryPath, filename, version);
	}
	
}
