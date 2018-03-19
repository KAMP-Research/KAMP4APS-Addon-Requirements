package edu.kit.ipd.sdq.kamp4aps4req.software;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import decisions.DecisionRepository;
import edu.kit.ipd.sdq.kamp.util.FileAndFolderManagement;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareModificationRepository;
import edu.kit.ipd.sdq.kamp4iec.core.IECArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Repository;
import edu.kit.ipd.sdq.kamp4iec.model.IECFieldOfActivityAnnotations.IECFieldOfActivityAnnotationsRepository;
import options.OptionRepository;
import requirements.ReqRepository;

/**
 * Provides loading and saving of models.
 * @author Timo Maier
 *
 */
public class APSReqSoftwareArchitectureVersionPersistency extends AbstractAPSReqArchitectureVersionPersistency<APSReqSoftwareArchitectureVersion> {

	@Override
	public APSReqSoftwareArchitectureVersion load(String folderpath, String filename, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		String iecRepoFilePath = filename + "." + IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY;
		String configurationFilePath = filename + "." + IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION;
		String fieldOfActivityFilePath = filename + "." + IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS;
		
		String requirementsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_OPTIONS;
		String modificationMarksFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		
		// load IEC specific models
		Repository iecRepository = (Repository)loadEmfModelFromResource(folderpath, iecRepoFilePath, loadResourceSet);
		Configuration configuration = (Configuration)loadEmfModelFromResource(folderpath, configurationFilePath, loadResourceSet);
		IECFieldOfActivityAnnotationsRepository fieldOfActivityAnnotation = 
				(IECFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(folderpath, fieldOfActivityFilePath, loadResourceSet);
		
		ReqRepository requirementRepository = (ReqRepository)loadEmfModelFromResource(folderpath, requirementsFilePath, loadResourceSet);
		DecisionRepository decisionRepository = 
				(DecisionRepository)loadEmfModelFromResource(folderpath, decisionsFilePath, loadResourceSet);
		OptionRepository optionRepository = (OptionRepository)loadEmfModelFromResource(folderpath, optionsFilePath, loadResourceSet);
		APSReqSoftwareModificationRepository modificationRepository = 
				(APSReqSoftwareModificationRepository)loadEmfModelFromResource(folderpath, modificationMarksFilePath, loadResourceSet);
		
		return new APSReqSoftwareArchitectureVersion(versionname, iecRepository, configuration, fieldOfActivityAnnotation, 
				requirementRepository, decisionRepository, optionRepository, modificationRepository);
	}
	
	@Override
	public APSReqSoftwareArchitectureVersion load(IContainer folder, String versionname) {
		ResourceSet loadResourceSet = new ResourceSetImpl();
		
		IFile iecRepoFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder, IECArchitectureVersionPersistency.FILEEXTENSION_REPOSITORY);
		IFile configurationFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder, IECArchitectureVersionPersistency.FILEEXTENSION_CONFIGURATION);
		IFile fieldOfActitivyAnnotationFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder,IECArchitectureVersionPersistency.FILEEXTENSION_FIELDOFACTIVITYANNOTATIONS);
		
		IFile requirementsFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder, AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_REQUIREMENTS);
		IFile decisionsFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder, AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_DECISIONS);
		IFile optionsFile = FileAndFolderManagement.retrieveFileWithExtension(
				folder, AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_OPTIONS);
		IFile modificationMarkFile = FileAndFolderManagement.retrieveFileWithExtension(folder, FILEEXTENSION_MODIFICATIONMARK);
		
		Repository iecRepository = null;
		Configuration configuration = null;
		IECFieldOfActivityAnnotationsRepository fieldOfActivityAnnotations = null;
		ReqRepository reqRepository = null;
		DecisionRepository decisionRepository = null;
		OptionRepository optionRepository = null;
		APSReqSoftwareModificationRepository modificationMarksRepository = null;
		
		if (iecRepoFile != null && iecRepoFile.exists()) {
			iecRepository = (Repository)loadEmfModelFromResource(
					iecRepoFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (configurationFile != null && configurationFile.exists()) {
			configuration = (Configuration)loadEmfModelFromResource(
					configurationFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (fieldOfActitivyAnnotationFile != null && fieldOfActitivyAnnotationFile.exists()) {
			fieldOfActivityAnnotations = (IECFieldOfActivityAnnotationsRepository)loadEmfModelFromResource(
					fieldOfActitivyAnnotationFile.getFullPath().toString(), null, loadResourceSet);
		}
		
		
		if (requirementsFile != null && requirementsFile.exists()) {
			reqRepository = (ReqRepository)loadEmfModelFromResource(
					requirementsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (decisionsFile != null && decisionsFile.exists()) {
			decisionRepository = (DecisionRepository)loadEmfModelFromResource(
					decisionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (optionsFile != null && optionsFile.exists()) {
			optionRepository = (OptionRepository)loadEmfModelFromResource(
					optionsFile.getFullPath().toString(), null, loadResourceSet);
		}
		if (modificationMarkFile != null && modificationMarkFile.exists()) {
			modificationMarksRepository = (APSReqSoftwareModificationRepository)
					loadEmfModelFromResource(modificationMarkFile.getFullPath().toString(), null, loadResourceSet);
		}
		
		return new APSReqSoftwareArchitectureVersion(versionname, iecRepository, configuration, fieldOfActivityAnnotations, 
				reqRepository, decisionRepository, optionRepository, modificationMarksRepository);
		
	}
	
	@Override
	public void save(String targetDirectoryPath, String filename, APSReqSoftwareArchitectureVersion version) {
		IECArchitectureVersionPersistency.saveKAMPModels(targetDirectoryPath, filename, version);
		saveAPSReqModels(targetDirectoryPath, filename, version);
	}
}
