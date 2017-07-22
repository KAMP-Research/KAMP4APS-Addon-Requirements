package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure;

/**
 * @generated NOT
 */
public class APSReqLabelCustomizing {

	public static String customize(APSReqModifyModule modifyModule) {
		if (modifyModule.getAffectedElement() == null) {
			return "(Please select a module!)";
		}
		else if (modifyModule.getAffectedElement().getId() != null) {
			return "\"" + modifyModule.getAffectedElement().getId() + "\"";
		}
		else {
			return "";
		}
	}

	public static String customize(APSReqModifyComponent modifyComponent) {
		if (modifyComponent.getAffectedElement() == null) {
			return "(Please select a component!)";
		}
		else if (modifyComponent.getAffectedElement().getId() != null) {
			return "\"" + modifyComponent.getAffectedElement().getId() + "\"";
		}
		else {
			return "";
		}
	}

	public static String customize(APSReqModifyInterface modifyInterface) {
		if (modifyInterface.getAffectedElement() == null) {
			return "(Please select a interface!)";
		}
		else if (modifyInterface.getAffectedElement().getId() != null) {
			return "\"" + modifyInterface.getAffectedElement().getId() + "\"";
		}
		else {
			return "";
		}
	}

	public static String customize(APSReqModifyStructure modifyStructure) {
		if (modifyStructure.getAffectedElement() == null) {
			return "(Please select a structure!)";
		}
		else if (modifyStructure.getAffectedElement().getId() != null) {
			return "\"" + modifyStructure.getAffectedElement().getId() + "\"";
		}
		else {
			return "";
		}
	}

	public static String customize(APSReqModifyDecision modifyDecision) {
		if (modifyDecision.getAffectedElement() == null) {
			return "(Please select a decision!)";
		}
		else if (modifyDecision.getAffectedElement().getDescription() != null) {
			return "\"" + modifyDecision.getAffectedElement().getDescription() + "\"";
		}
		else {
			return "with id \"" + modifyDecision.getAffectedElement().getId() + "\"";
		}
	}

	public static String customize(APSReqModifyOption modifyOption) {
		if (modifyOption.getAffectedElement() == null) {
			return "(Please select an option!)";
		}
		else if (modifyOption.getAffectedElement().getDescription() != null) {
			return "\"" + modifyOption.getAffectedElement().getDescription() + "\"";
		}
		else {
			return "with id \"" + modifyOption.getAffectedElement().getId() + "\"";
		}
	}

	public static String customize(APSReqModifyRequirement modifyRequirement) {
		if (modifyRequirement.getAffectedElement() == null) {
			return "(Please select a requirement!)";
		}
		else if (modifyRequirement.getAffectedElement().getSpecification() != null) {
			return "\"" + modifyRequirement.getAffectedElement().getSpecification() + "\"";
		}
		else {
			return "with id \"" + modifyRequirement.getAffectedElement().getId() + "\"";
		}
	}

}
