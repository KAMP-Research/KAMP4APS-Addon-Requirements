package edu.kit.ipd.sdq.kamp4aps4req.ui;

import edu.kit.ipd.sdq.kamp.ui.AbstractCreateEmptyBaseModelAction;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureModelFactoryFacade;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersionPersistency;

public class APSReqCreateEmptyBaseModelAction extends AbstractCreateEmptyBaseModelAction<APSReqArchitectureVersion> {

	public APSReqCreateEmptyBaseModelAction() {
		this.setArchitectureVersionPersistency(new APSReqArchitectureVersionPersistency());
	}
	
	@Override
	protected APSReqArchitectureVersion createArchitectureVersion() {
		return APSReqArchitectureModelFactoryFacade.createEmptyAPSReqModel("architecturemodel");
	}

}
