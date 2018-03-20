package edu.kit.ipd.sdq.kamp4aps4req.software;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

public enum APSReqSoftwareActivityElementType implements AbstractActivityElementType {

	IECCOMPONENT(IECComponent.class);
	
	private final String name;
	private final Class<?> clazz;
	
	private APSReqSoftwareActivityElementType(Class<?> clazz) {
		this.clazz = clazz;
		this.name = clazz.getSimpleName();
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public Class<?> getElementClass() {
		return clazz;
	}
	
	public static APSReqSoftwareActivityElementType getActivityTypeForObject(EObject object) {
		if (IECCOMPONENT.getElementClass().isAssignableFrom(object.getClass())) {
			return IECCOMPONENT;
		}
		return null;
	}
	
}
