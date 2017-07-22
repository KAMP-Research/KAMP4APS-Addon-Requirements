package edu.kit.ipd.sdq.kamp4aps4req.core.derivation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.ActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.InternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;
import options.Option;
import relations.TraceableObject;
import requirements.Requirement;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public class APSReqInternalModificationDerivation {

	public static List<String> getCausingElementsNames(AbstractModification<?, ?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement : modification.getCausingElements()) {
			if (causingElement instanceof Component) {
				Component causingComponent = (Component) causingElement;
				causingElementNames.add(causingComponent.eClass().getName() + " \"" + causingComponent.getId() + "\"");
			}
			else if (causingElement instanceof Module) {
				Module causingModule = (Module) causingElement;
				causingElementNames.add(causingModule.eClass().getName() + " \"" + causingModule.getId() + "\"");
			}
			else if (causingElement instanceof Interface) {
				Interface causingInterface = (Interface) causingElement;
				causingElementNames.add(causingInterface.eClass().getName() + " \"" + causingInterface.getId() + "\"");
			}
			else if (causingElement instanceof Structure) {
				Structure causingStructure = (Structure) causingElement;
				causingElementNames.add(causingStructure.eClass().getName() + " \"" + causingStructure.getId() + "\"");
			}
			else if (causingElement instanceof TraceableObject) {
				TraceableObject causingTraceableObject = (TraceableObject) causingElement;
				causingElementNames.add(causingTraceableObject.eClass().getName() + " \""
						+ getElementNameForTraceableObject(causingTraceableObject) + "\"");
			}
		}
		return causingElementNames;
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			List<String> causingElementNames, AbstractActivityElementType activityElementType) {
		Activity result = InternalModificationDerivation.createModificationActivity(modification, causingElementNames,
				activityElementType);
		if (result != null) {
			return result;
		}
		else if (modification instanceof APSReqModifyTraceableObject<?>) {
			TraceableObject traceableObject = ((APSReqModifyTraceableObject<?>) modification).getAffectedElement();
			String elementName = getElementNameForTraceableObject(traceableObject);
			return new Activity(ActivityType.INTERNALMODIFICATIONMARK, activityElementType, traceableObject,
					elementName, causingElementNames, BasicActivity.MODIFY,
					"Modify " + traceableObject.eClass().getName() + " " + elementName + ".");
		}
		else {
			return null;
		}
	}

	public static Activity createModificationActivity(AbstractModification<?, ?> modification,
			AbstractActivityElementType activityElementType) {
		List<String> causingElementNames = getCausingElementsNames(modification);
		return createModificationActivity(modification, causingElementNames, activityElementType);
	}

	protected static String getElementNameForTraceableObject(TraceableObject object) {
		if (object instanceof Requirement) {
			return "\"" + ((Requirement) object).getSpecification() + "\"";
		}
		else if (object instanceof Decision) {
			return "\"" + ((Decision) object).getDescription() + "\"";
		}
		else if (object instanceof Option) {
			return "\"" + ((Option) object).getDescription() + "\"";
		}
		else {
			return null;
		}
	}

	public List<Activity> deriveInternalModifications(APSReqArchitectureVersion targetVersion) {
		List<Activity> activityList = new LinkedList<Activity>();
		for (ChangePropagationStep currentPropagationStep : targetVersion.getModificationMarkRepository()
				.getChangePropagationSteps()) {
			if (currentPropagationStep instanceof APSReqChangePropagationDueToSpecificationDependencies) {
				APSReqChangePropagationDueToSpecificationDependencies cp = (APSReqChangePropagationDueToSpecificationDependencies) currentPropagationStep;
				deriveTraceableObjectModifications(cp.getRequirementModifications(), activityList);
				deriveTraceableObjectModifications(cp.getDecisionModifications(), activityList);
				deriveTraceableObjectModifications(cp.getOptionModifications(), activityList);
				deriveComponentModifications(cp.getComponentModifications(), activityList);
				deriveInterfaceModifications(cp.getInterfaceModifications(), activityList);
				deriveStructureModifications(cp.getStructureModifications(), activityList);
				deriveModuleModifications(cp.getModuleModifications(), activityList);
			}
		}
		return activityList;
	}

	private void deriveTraceableObjectModifications(Collection<? extends APSReqModifyTraceableObject<?>> modifications,
			List<Activity> activityList) {
		for (APSReqModifyTraceableObject<?> modification : modifications) {
			activityList.add(createModificationActivity(modification,
					APSReqActivityElementType.getActivityTypeForObject(modification.getAffectedElement())));
		}
	}

	private void deriveComponentModifications(Collection<APSReqModifyComponent> modifications,
			List<Activity> activityList) {
		for (APSReqModifyComponent modification : modifications) {
			activityList.add(createModificationActivity(modification, APSReqActivityElementType.COMPONENT));
		}
	}

	private void deriveInterfaceModifications(Collection<APSReqModifyInterface> modifications,
			List<Activity> activityList) {
		for (APSReqModifyInterface modification : modifications) {
			activityList.add(createModificationActivity(modification, APSReqActivityElementType.INTERFACE));
		}
	}

	private void deriveStructureModifications(Collection<APSReqModifyStructure> modifications,
			List<Activity> activityList) {
		for (APSReqModifyStructure modification : modifications) {
			activityList.add(createModificationActivity(modification, APSReqActivityElementType.STRUCTURE));
		}
	}

	private void deriveModuleModifications(Collection<APSReqModifyModule> modifications, List<Activity> activityList) {
		for (APSReqModifyModule modification : modifications) {
			activityList.add(createModificationActivity(modification, APSReqActivityElementType.MODULE));
		}
	}
}
