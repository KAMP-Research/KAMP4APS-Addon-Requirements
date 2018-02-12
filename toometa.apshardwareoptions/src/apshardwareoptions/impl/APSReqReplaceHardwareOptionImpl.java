/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqReplaceHardwareOption;
import apshardwareoptions.ApshardwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceHardwareOptionImpl#getOldEntity <em>Old Entity</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceHardwareOptionImpl#getNewEntity <em>New Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceHardwareOptionImpl<T extends Entity> extends APSReqHardwareOptionImpl<T> implements APSReqReplaceHardwareOption<T> {
	/**
	 * The cached value of the '{@link #getOldEntity() <em>Old Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldEntity()
	 * @generated
	 * @ordered
	 */
	protected T oldEntity;

	/**
	 * The cached value of the '{@link #getNewEntity() <em>New Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEntity()
	 * @generated
	 * @ordered
	 */
	protected T newEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceHardwareOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REPLACE_HARDWARE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getOldEntity() {
		if (oldEntity != null && oldEntity.eIsProxy()) {
			InternalEObject oldOldEntity = (InternalEObject)oldEntity;
			oldEntity = (T)eResolveProxy(oldOldEntity);
			if (oldEntity != oldOldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY, oldOldEntity, oldEntity));
			}
		}
		return oldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetOldEntity() {
		return oldEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldEntity(T newOldEntity) {
		T oldOldEntity = oldEntity;
		oldEntity = newOldEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY, oldOldEntity, oldEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getNewEntity() {
		if (newEntity != null && newEntity.eIsProxy()) {
			InternalEObject oldNewEntity = (InternalEObject)newEntity;
			newEntity = (T)eResolveProxy(oldNewEntity);
			if (newEntity != oldNewEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY, oldNewEntity, newEntity));
			}
		}
		return newEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetNewEntity() {
		return newEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEntity(T newNewEntity) {
		T oldNewEntity = newEntity;
		newEntity = newNewEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY, oldNewEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY:
				if (resolve) return getOldEntity();
				return basicGetOldEntity();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY:
				if (resolve) return getNewEntity();
				return basicGetNewEntity();
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY:
				setOldEntity((T)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY:
				setNewEntity((T)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY:
				setOldEntity((T)null);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY:
				setNewEntity((T)null);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY:
				return oldEntity != null;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY:
				return newEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceHardwareOptionImpl
