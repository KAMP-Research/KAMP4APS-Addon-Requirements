/**
 */
package apsoptions.impl;

import apsoptions.APSReqOption;
import apsoptions.APSReqOptionContainer;
import apsoptions.ApsoptionsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Option Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.APSReqOptionContainerImpl#getApsreqoption <em>Apsreqoption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqOptionContainerImpl extends MinimalEObjectImpl.Container implements APSReqOptionContainer {
	/**
	 * The cached value of the '{@link #getApsreqoption() <em>Apsreqoption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApsreqoption()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqOption> apsreqoption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqOptionContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.APS_REQ_OPTION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqOption> getApsreqoption() {
		if (apsreqoption == null) {
			apsreqoption = new EObjectContainmentWithInverseEList<APSReqOption>(APSReqOption.class, this, ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION, ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY);
		}
		return apsreqoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getApsreqoption()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION:
				return ((InternalEList<?>)getApsreqoption()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION:
				return getApsreqoption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION:
				getApsreqoption().clear();
				getApsreqoption().addAll((Collection<? extends APSReqOption>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION:
				getApsreqoption().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION:
				return apsreqoption != null && !apsreqoption.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqOptionContainerImpl
