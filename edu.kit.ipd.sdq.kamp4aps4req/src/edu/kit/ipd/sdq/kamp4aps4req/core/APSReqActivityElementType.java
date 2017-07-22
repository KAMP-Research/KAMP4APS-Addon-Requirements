package edu.kit.ipd.sdq.kamp4aps4req.core;

import org.eclipse.emf.ecore.EObject;

import decisions.Decision;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import options.Option;
import requirements.Requirement;
import xPPU.ComponentRepository.Component;
import xPPU.InterfaceRepository.Interface;
import xPPU.ModuleRepository.Module;
import xPPU.StructureRepository.Structure;

public enum APSReqActivityElementType implements AbstractActivityElementType {

		DECISION(Decision.class),
		OPTION(Option.class),
		REQUIREMENT(Requirement.class),
		COMPONENT(Component.class),
		INTERFACE(Interface.class),
		STRUCTURE(Structure.class),
		MODULE(Module.class);

	private final Class<?> clazz;
	private final String name;

	private APSReqActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		name = clazz.getSimpleName();
	}

	@Override
	public Class<?> getElementClass() {
		return clazz;
	}

	@Override
	public String getName() {
		return name;
	}

	public static APSReqActivityElementType getActivityTypeForObject(EObject object) {
		for (APSReqActivityElementType type : APSReqActivityElementType.values()) {
			if (type.getElementClass().isAssignableFrom(object.getClass())) {
				return type;
			}
		}
		return null;
	}

}
