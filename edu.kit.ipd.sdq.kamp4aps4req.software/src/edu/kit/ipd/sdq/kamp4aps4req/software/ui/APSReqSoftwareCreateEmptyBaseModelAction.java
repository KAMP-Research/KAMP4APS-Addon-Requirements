package edu.kit.ipd.sdq.kamp4aps4req.software.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.software.APSReqSoftwareArchitectureVersionPersistency;

/**
 * Calls Architecture model factory to create empty model
 * @author Timo Maier
 *
 */
public class APSReqSoftwareCreateEmptyBaseModelAction extends AbstractCreateEmptyBaseModelAction<APSReqSoftwareArchitectureVersion> {

	public APSReqSoftwareCreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new APSReqSoftwareArchitectureVersionPersistency());
	}
	
	@Override
	protected APSReqSoftwareArchitectureVersion createArchitectureVersion() {
		return APSReqSoftwareArchitectureModelFactoryFacade.createEmptySoftwareModel("architecturemodel");
	}
}
