package edu.kit.ipd.sdq.kamp4aps4req.hardware;

import org.eclipse.emf.ecore.EObject;

import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

public enum APSReqHardwareActivityElementType implements AbstractActivityElementType {

	ENTITY(Entity.class);


	private final String name;
	private final Class<?> clazz;
	
	private APSReqHardwareActivityElementType(Class<?> clazz) {
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
	
	public static APSReqHardwareActivityElementType getActivityTypeForObject(EObject object) {
		if (ENTITY.getElementClass().isAssignableFrom(object.getClass())) {
			return ENTITY;
		}
		return null;
	}
}
