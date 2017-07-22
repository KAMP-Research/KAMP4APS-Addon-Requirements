package edu.kit.ipd.sdq.kamp4aps4req.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import DeploymentContext.DeploymentContextRepository;
import decisions.DecisionRepository;
import decisions.DecisionsPackage;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps.core.ArchitectureVersion.ArchitectureVersionParams;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;
import fieldofactivityannotations.FieldOfActivityAnnotationRepository;
import options.OptionRepository;
import options.OptionsPackage;
import requirements.ReqRepository;
import requirements.RequirementsPackage;
import xPPU.Plant;

public class APSReqArchitectureVersionPersistency
		extends AbstractArchitectureVersionPersistency<APSReqArchitectureVersion> {

	public static final String FILEEXTENSION_REQUIREMENTS = "requirements";
	public static final String FILEEXTENSION_DECISIONS = "decisions";
	public static final String FILEEXTENSION_OPTIONS = "options";
	public static final String FILEEXTENSION_REPOSITORY = "repository";
	public static final String FILEEXTENSION_SYSTEM = "system";
	public static final String FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS = "fieldofactivityannotations";
	public static final String FILEEXTENSION_XPPU = "xppu";
	public static final String FILEEXTENSION_DEPLOYMENTCONTEXT = "deploymentcontext";

	@Override
	public APSReqArchitectureVersion load(String folderpath, String filename, String versionname) {
		ArchitectureVersionParams archParams = new ArchitectureVersionParams();
		ResourceSet loadResourceSet = new ResourceSetImpl();
		String fieldOfActivityRepositoryFilePath = filename + "." + FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String xppufilePath = filename + "." + FILEEXTENSION_XPPU;
		String requirementsFilePath = filename + "." + FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + FILEEXTENSION_OPTIONS;

		archParams.name = versionname;
		archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository) loadEmfModelFromResource(
				folderpath, fieldOfActivityRepositoryFilePath, loadResourceSet);
		archParams.modificationMarkRepository = (AbstractKAPSModificationRepository<?>) loadEmfModelFromResource(
				folderpath, internalModFilePath, loadResourceSet);
		archParams.xPPUPlant = (Plant) loadEmfModelFromResource(folderpath, xppufilePath, loadResourceSet);
		archParams.deploymentContextRepository = (DeploymentContextRepository) loadEmfModelFromResource(folderpath,
				internalModFilePath, loadResourceSet);
		ReqRepository requirementRepostory = (ReqRepository) loadEmfModelFromResource(folderpath, requirementsFilePath,
				loadResourceSet);
		DecisionRepository decisionRepository = (DecisionRepository) loadEmfModelFromResource(folderpath,
				decisionsFilePath, loadResourceSet);
		OptionRepository optionRepository = (OptionRepository) loadEmfModelFromResource(folderpath, optionsFilePath,
				loadResourceSet);

		return new APSReqArchitectureVersion(archParams, requirementRepostory, decisionRepository, optionRepository);
	}

	@Override
	public APSReqArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		ArchitectureVersionParams archParams = new ArchitectureVersionParams();
		archParams.fieldOfActivityRepository = null;
		archParams.modificationMarkRepository = null;
		archParams.xPPUPlant = null;
		archParams.deploymentContextRepository = null;
		archParams.name = versionname;
		ReqRepository requirementRepository = null;
		DecisionRepository decisionRepository = null;
		OptionRepository optionRepository = null;

		IFile fieldOfActivityRepositoryFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		IFile internalModFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_MODIFICATIONMARK);
		IFile xppufile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_XPPU);
		IFile deploymentContextFile = FileAndFolderManagement.retrieveFileWithExtension(folder,
				FILEEXTENSION_DEPLOYMENTCONTEXT);
		IFile requirementsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_REQUIREMENTS);
		IFile decisionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_DECISIONS);
		IFile optionsFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_OPTIONS);

		if (fieldOfActivityRepositoryFile != null && fieldOfActivityRepositoryFile.exists()) {
			archParams.fieldOfActivityRepository = (FieldOfActivityAnnotationRepository) loadEmfModelFromResource(
					fieldOfActivityRepositoryFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (internalModFile != null && internalModFile.exists()) {
			archParams.modificationMarkRepository = (AbstractKAPSModificationRepository<?>) loadEmfModelFromResource(
					internalModFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (xppufile != null && xppufile.exists()) {
			archParams.xPPUPlant = (Plant) loadEmfModelFromResource(xppufile.getFullPath().toString(), null,
					loadResourceSet);
		}
		if (deploymentContextFile != null && deploymentContextFile.exists()) {
			archParams.deploymentContextRepository = (DeploymentContextRepository) loadEmfModelFromResource(
					deploymentContextFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (requirementsFile != null && requirementsFile.exists()) {
			requirementRepository = (ReqRepository) loadEmfModelFromResource(requirementsFile.getFullPath().toString(),
					null, loadResourceSet);
		}
		if (decisionsFile != null && decisionsFile.exists()) {
			decisionRepository = (DecisionRepository) loadEmfModelFromResource(decisionsFile.getFullPath().toString(),
					null, loadResourceSet);
		}
		if (optionsFile != null && optionsFile.exists()) {
			optionRepository = (OptionRepository) loadEmfModelFromResource(optionsFile.getFullPath().toString(), null,
					loadResourceSet);
		}

		return new APSReqArchitectureVersion(archParams, requirementRepository, decisionRepository, optionRepository);
	}

	@Override
	public void save(String targetDirectoryPath, String filename, APSReqArchitectureVersion version) {
		savePCMAndKAMP4APSModels(targetDirectoryPath, filename, version);
		saveRequirementsModel(targetDirectoryPath, filename, version);
	}

	public static void saveRequirementsModel(String targetDirectoryPath, String filename,
			APSReqArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();

		String requirementsFilePath = filename + "." + FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + FILEEXTENSION_OPTIONS;

		if (version.getRequirementsRepository() != null) {
			saveEmfModelToResource(version.getRequirementsRepository(), targetDirectoryPath, requirementsFilePath,
					resourceSet);
		}
		if (version.getDecisionRepository() != null) {
			saveEmfModelToResource(version.getDecisionRepository(), targetDirectoryPath, decisionsFilePath,
					resourceSet);
		}
		if (version.getOptionRepository() != null) {
			saveEmfModelToResource(version.getOptionRepository(), targetDirectoryPath, optionsFilePath, resourceSet);
		}
	}

	@Override
	protected void registerEPackages(ResourceSet resourceSet) {
		registerRequirementsPackages(resourceSet);
	}

	public static void registerRequirementsPackages(ResourceSet resourceSet) {
		resourceSet.getPackageRegistry().put(APSReqModificationmarksPackage.eNS_URI,
				APSReqModificationmarksPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(RequirementsPackage.eNS_URI, RequirementsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(DecisionsPackage.eNS_URI, DecisionsPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OptionsPackage.eNS_URI, OptionsPackage.eINSTANCE);
	}

	public static void savePCMAndKAMP4APSModels(String targetDirectoryPath, String filename,
			ArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		String internalModFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		String fieldOfActivityRepositoryFilePath = filename + "." + FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		String programsFilePath = filename + "." + FILEEXTENSION_DEPLOYMENTCONTEXT;
		String xppuFilePath = filename + "." + FILEEXTENSION_XPPU;

		if (version.getModificationMarkRepository() != null) {
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, internalModFilePath,
					resourceSet);
		}
		if (version.getFieldOfActivityRepository() != null) {
			saveEmfModelToResource(version.getFieldOfActivityRepository(), targetDirectoryPath,
					fieldOfActivityRepositoryFilePath, resourceSet);
		}
		if (version.getDeploymentContextRepository() != null) {
			saveEmfModelToResource(version.getDeploymentContextRepository(), targetDirectoryPath, programsFilePath,
					resourceSet);
		}
		if (version.getXPPUPlant() != null) {
			saveEmfModelToResource(version.getXPPUPlant(), targetDirectoryPath, xppuFilePath, resourceSet);
		}
	}
}
