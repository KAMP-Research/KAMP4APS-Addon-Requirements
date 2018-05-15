package edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.editor;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.editor.AbstractArchitectureBasedWorkplanDerivationAction;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSEnrichedWorkplanDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersionPersistency;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation.APSReqHardwareDifferenceCalculation;

/**
 * 
 * @generated NOT
 */
public class APSReqHardwareArchitectureBasedWorkplanDerivationAction extends AbstractArchitectureBasedWorkplanDerivationAction<APSReqHardwareArchitectureVersion> {

	public APSReqHardwareArchitectureBasedWorkplanDerivationAction() {
		this.setWorkplanDerivation(new APSReqHardwareDifferenceCalculation());
		this.setEnrichedWorkplanDerivation(new APSEnrichedWorkplanDerivation());
		this.setArchitectureVersionPersistency(new APSReqHardwareArchitectureVersionPersistency());
		
	}
	
	
}
