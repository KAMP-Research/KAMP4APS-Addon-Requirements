package edu.kit.ipd.sdq.kamp4aps4req.core;

import org.eclipse.core.resources.IContainer;


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
	
}
