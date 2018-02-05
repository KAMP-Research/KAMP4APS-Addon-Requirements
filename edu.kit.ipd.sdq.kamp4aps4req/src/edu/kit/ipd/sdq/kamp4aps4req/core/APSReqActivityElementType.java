package edu.kit.ipd.sdq.kamp4aps4req.core;

import org.eclipse.emf.ecore.EObject;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.workplan.AbstractActivityElementType;
import options.Option;
import requirements.Requirement;



public enum APSReqActivityElementType implements AbstractActivityElementType {

		DECISION(Decision.class),
		OPTION(Option.class),
		REQUIREMENT(Requirement.class);
	
	
		private final String name;
		private final Class<?> clazz;
		
		private APSReqActivityElementType(Class<?> clazz) {
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
		
		public static APSReqActivityElementType getActivityTypeForObject(EObject object) {
			for (APSReqActivityElementType type: APSReqActivityElementType.values()) {
				if (type.getElementClass().isAssignableFrom(object.getClass())) {
					return type;
				}
			}
			return null;
		}
}
