package edu.kit.ipd.sdq.kamp4aps4req.core;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersionPersistency;

/**
 * Abstract super class of the classes providing loading and saving of models
 * for hardware and software
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqArchitectureVersionPersistency<T extends AbstractArchitectureVersion<?>> extends AbstractArchitectureVersionPersistency<T> {

	public static final String FILEEXTENSION_REQUIREMENTS = "requirements";
	public static final String FILEEXTENSION_DECISIONS = "decisions";
	public static final String FILEEXTENSION_OPTIONS = "options";

	/**
	 * Saves the APS Req related models to file
	 * @param targetDirectoryPath Path of file to save to
	 * @param filename Filename
	 * @param version Architecture version to save
	 */
	public static void saveAPSReqModels(String targetDirectoryPath, String filename, APSReqArchitectureVersion version) {
		ResourceSet resourceSet = new ResourceSetImpl();
		
		String requirementsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_REQUIREMENTS;
		String decisionsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_DECISIONS;
		String optionsFilePath = filename + "." + AbstractAPSReqArchitectureVersionPersistency.FILEEXTENSION_OPTIONS;
		
		if (version.getRequirementsRepository() != null) {
			saveEmfModelToResource(version.getRequirementsRepository(), targetDirectoryPath, requirementsFilePath, resourceSet);
		}
		if (version.getDecisionRepository() != null) {
			saveEmfModelToResource(version.getDecisionRepository(), targetDirectoryPath, decisionsFilePath, resourceSet);
		}
		if (version.getOptionRepository() != null) {
			saveEmfModelToResource(version.getOptionRepository(), targetDirectoryPath, optionsFilePath, resourceSet);
		}
	}
}
