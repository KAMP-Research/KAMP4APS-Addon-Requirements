package edu.kit.ipd.sdq.kamp4aps4req.hardware.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersionPersistency;

/**
 * Calls Architecture model factory to create empty model
 * @author Timo Maier
 *
 */
public class APSReqHardwareCreateEmptyBaseModelAction extends AbstractCreateEmptyBaseModelAction<APSReqHardwareArchitectureVersion> {

	public APSReqHardwareCreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new APSReqHardwareArchitectureVersionPersistency());
	}
	
	@Override
	protected APSReqHardwareArchitectureVersion createArchitectureVersion() {
		return APSReqHardwareArchitectureModelFactoryFacade.createEmptyHardwareModel("architecturemodel");
	}
}
