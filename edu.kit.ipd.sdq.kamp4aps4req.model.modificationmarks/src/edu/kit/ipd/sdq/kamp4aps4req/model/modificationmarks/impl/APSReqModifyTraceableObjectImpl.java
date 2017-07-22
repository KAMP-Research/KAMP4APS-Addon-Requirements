/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractModificationImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import relations.TraceableObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>APS Req
 * Modify Traceable Object</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class APSReqModifyTraceableObjectImpl<T extends TraceableObject>
		extends AbstractModificationImpl<T, EObject> implements APSReqModifyTraceableObject<T> {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected APSReqModifyTraceableObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APSReqModificationmarksPackage.Literals.APS_REQ_MODIFY_TRACEABLE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> This is specialized for the
	 * more specific type known in this context.
	 * 
	 * @generated
	 */
	@Override
	public void setAffectedElement(T newAffectedElement) {
		super.setAffectedElement(newAffectedElement);
	}

} // APSReqModifyTraceableObjectImpl
