package edu.kit.ipd.sdq.kamp4aps4req.core;

import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;

/**
 * Abstract super class of the classes providing loading and saving of models
 * for hardware and software
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqArchitectureVersionPersistency<T extends AbstractAPSReqArchitectureVersion<?>> extends AbstractArchitectureVersionPersistency<T> {

	public static final String FILEEXTENSION_REQUIREMENTS = "requirements";
	public static final String FILEEXTENSION_DECISIONS = "decisions";
	public static final String FILEEXTENSION_OPTIONS = "apsoptions";
	
	@Override
	public abstract T load(String folderpath, String filename, String versionname);
		
	
	@Override
	public abstract T load(IContainer folder, String versionname);
	
	@Override
	public abstract void save(String targetDirectoryPath, String filename, T version);
	
	/**
	 * Saves the APS Req related models to a file
	 * @param targetDirectoryPath Path of file to save to
	 * @param filename Filename
	 * @param version Architecture version to save
	 */
	public static void saveAPSReqModels(String targetDirectoryPath, String filename, AbstractAPSReqArchitectureVersion<?> version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		String requirementsFilePath = filename + "." + FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + FILEEXTENSION_OPTIONS;
		String modificationMarksFilePath = filename + "." + FILEEXTENSION_MODIFICATIONMARK;
		
		if (version.getRequirementsRepository() != null) {
			saveEmfModelToResource(version.getRequirementsRepository(), targetDirectoryPath, requirementsFilePath, resourceSet);
		}
		if (version.getDecisionRepository() != null) {
			saveEmfModelToResource(version.getDecisionRepository(), targetDirectoryPath, decisionsFilePath, resourceSet);
		}
		if (version.getOptionRepository() != null) {
			saveEmfModelToResource(version.getOptionRepository(), targetDirectoryPath, optionsFilePath, resourceSet);
		}
		if (version.getModificationMarkRepository() != null) {
			saveEmfModelToResource(version.getModificationMarkRepository(), targetDirectoryPath, modificationMarksFilePath, resourceSet);
		}
	}
	
}
