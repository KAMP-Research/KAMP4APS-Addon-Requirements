/**
 */
package apssoftwareoptions.impl;

import apssoftwareoptions.APSReqReplaceSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Software Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqReplaceSoftwareOptionImpl#getOldComponent <em>Old Component</em>}</li>
 *   <li>{@link apssoftwareoptions.impl.APSReqReplaceSoftwareOptionImpl#getNewComponent <em>New Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceSoftwareOptionImpl<T extends IECComponent> extends APSReqSoftwareOptionImpl implements APSReqReplaceSoftwareOption<T> {
	/**
	 * The cached value of the '{@link #getOldComponent() <em>Old Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldComponent()
	 * @generated
	 * @ordered
	 */
	protected T oldComponent;

	/**
	 * The cached value of the '{@link #getNewComponent() <em>New Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewComponent()
	 * @generated
	 * @ordered
	 */
	protected T newComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceSoftwareOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_REPLACE_SOFTWARE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getOldComponent() {
		if (oldComponent != null && oldComponent.eIsProxy()) {
			InternalEObject oldOldComponent = (InternalEObject)oldComponent;
			oldComponent = (T)eResolveProxy(oldOldComponent);
			if (oldComponent != oldOldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT, oldOldComponent, oldComponent));
			}
		}
		return oldComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetOldComponent() {
		return oldComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldComponent(T newOldComponent) {
		T oldOldComponent = oldComponent;
		oldComponent = newOldComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT, oldOldComponent, oldComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getNewComponent() {
		if (newComponent != null && newComponent.eIsProxy()) {
			InternalEObject oldNewComponent = (InternalEObject)newComponent;
			newComponent = (T)eResolveProxy(oldNewComponent);
			if (newComponent != oldNewComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT, oldNewComponent, newComponent));
			}
		}
		return newComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetNewComponent() {
		return newComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewComponent(T newNewComponent) {
		T oldNewComponent = newComponent;
		newComponent = newNewComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT, oldNewComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT:
				if (resolve) return getOldComponent();
				return basicGetOldComponent();
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT:
				if (resolve) return getNewComponent();
				return basicGetNewComponent();
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
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT:
				setOldComponent((T)newValue);
				return;
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT:
				setNewComponent((T)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT:
				setOldComponent((T)null);
				return;
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT:
				setNewComponent((T)null);
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
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT:
				return oldComponent != null;
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT:
				return newComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceSoftwareOptionImpl
