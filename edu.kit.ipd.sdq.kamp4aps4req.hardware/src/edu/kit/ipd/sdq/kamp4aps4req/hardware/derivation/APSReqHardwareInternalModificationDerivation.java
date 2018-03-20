package edu.kit.ipd.sdq.kamp4aps4req.hardware.derivation;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp.workplan.Activity;
import edu.kit.ipd.sdq.kamp.workplan.BasicActivity;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.core.APSActivityType;
import edu.kit.ipd.sdq.kamp4aps.core.derivation.APSInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps4req.core.APSReqActivityElementType;
import edu.kit.ipd.sdq.kamp4aps4req.derivation.AbstractAPSReqInternalModificationDerivation;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.APSReqHardwareArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import relations.TraceableObject;

/**
 * Internal Modification derivation for the hardware, uses the internal mod. derivation of KAMP4aPS
 * @author Timo Maier
 *
 */
public class APSReqHardwareInternalModificationDerivation extends AbstractAPSReqInternalModificationDerivation {
	
	
	/**
	 * Gets names of elements which cause Modification
	 * @param modification Modification caused by elements returned
	 * @return List with Strings representing names of elements causing the modification
	 */
	public List<String> getCausingElementsNames(AbstractModification<?,?> modification) {
		List<String> causingElementNames = new LinkedList<String>();
		for (Object causingElement: modification.getCausingElements()) {
			if (causingElement instanceof TraceableObject) {
				TraceableObject causingTraceableObject = (TraceableObject) causingElement;
				causingElementNames.add(causingTraceableObject.eClass().getName() + " \"" + 
						getElementNameForTraceableObject(causingTraceableObject) + "\"");
			} else if (causingElement instanceof Structure) {
				Structure causingStructure = (Structure) causingElement;
				causingElementNames.add(causingStructure.eClass().
						getName() + " \"" + causingStructure.getName() + "\"");
			} else if (causingElement instanceof Module) {
				Module causingModule = (Module) causingElement;
				causingElementNames.add(causingModule.eClass().
						getName() + " \"" + causingModule.getName() + "\"");
			} else if (causingElement instanceof Component) {
				Component causingComponent = (Component) causingElement;
				causingElementNames.add(causingComponent.eClass().
						getName() + " \"" + causingComponent.getName() + "\"");
			} else if (causingElement instanceof Interface) {
				Interface causingInterface = (Interface) causingElement;
				causingElementNames.add(causingInterface.eClass().
						getName() + " \"" + causingInterface.getName() + "\"");
			}
		}
		return causingElementNames;
	}
	
	/**
	 * 
	 * @param modification
	 * @param causingElementNames
	 * @param activityElementType
	 * @return
	 */
	public Activity createModificationActivity(AbstractModification<?,?> 
	modification, List<String> causingElementNames, AbstractActivityElementType activityElementType) {
		Activity result = APSInternalModificationDerivation.createModificationActivity(
				modification, causingElementNames, activityElementType);
		if (result != null) {
			return result;
		} else if (modification instanceof APSReqModifyTraceableObject<?>) {
			TraceableObject traceableObject = ((APSReqModifyTraceableObject<?>) modification).
					getAffectedElement();
			String elementName = getElementNameForTraceableObject(traceableObject);
			return new Activity(APSActivityType.INTERNALMODIFICATIONMARK, activityElementType, 
					traceableObject, elementName, causingElementNames, BasicActivity.MODIFY, 
					"Modify " + traceableObject.eClass().getName() + " " + elementName + ".");
		} else {
			return null;
		}
	}
	

	
	/**
	 * 
	 * @param targetVersion
	 * @return
	 */
	public List<Activity> deriveInternalModifications(APSReqHardwareArchitectureVersion targetVersion) {
		List<Activity> activityList = new LinkedList<Activity>();
		for (ChangePropagationStep currentPropagationStep: targetVersion.
				getModificationMarkRepository().getChangePropagationSteps()) {
			if (currentPropagationStep instanceof APSReqHardwareChangePropagationDueToSpecificationDependencies) {
				APSReqHardwareChangePropagationDueToSpecificationDependencies cp =
						(APSReqHardwareChangePropagationDueToSpecificationDependencies) currentPropagationStep;
				this.deriveTraceableObjectModifications(cp.getRequirementModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getDecisionModifications(), activityList);
				this.deriveTraceableObjectModifications(cp.getOptionModifications(), activityList);
				this.deriveStructureModifications(cp.getStructureModifications(), activityList);
				this.deriveComponentModifications(cp.getComponentModifications(), activityList);
				this.deriveModuleModifications(cp.getModuleModifications(), activityList);
				this.deriveInterfaceModifications(cp.getInterfaceModifications(), activityList);
			}
		}
		return activityList;
	}
	
	private void deriveStructureModifications(Collection<ModifyStructure<Structure>> modifications, 
			List<Activity> activityList) {
		for (ModifyStructure<Structure> modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					APSActivityElementType.STRUCTURE));
		}
	}
	
	private void deriveModuleModifications(Collection<ModifyModule<Module>> modifications, 
			List<Activity> activityList) {
		for (ModifyModule<Module> modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					APSActivityElementType.MODULE));
		}
	}
	
	private void deriveComponentModifications(Collection<ModifyComponent<Component>> modifications, 
			List<Activity> activityList) {
		for (ModifyComponent<Component> modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					APSActivityElementType.COMPONENT));
		}
	}
	
	private void deriveInterfaceModifications(Collection<ModifyInterface<Interface>> modifications, 
			List<Activity> activityList) {
		for (ModifyInterface<Interface> modification: modifications) {
			activityList.add(createModificationActivity(modification, 
					APSActivityElementType.INTERFACE));
		}
	}


	
}
