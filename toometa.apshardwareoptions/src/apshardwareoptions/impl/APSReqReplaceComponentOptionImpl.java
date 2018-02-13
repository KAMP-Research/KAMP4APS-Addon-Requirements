/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqReplaceComponentOption;
import apshardwareoptions.ApshardwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Component Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceComponentOptionImpl#getOldComponent <em>Old Component</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceComponentOptionImpl#getNewComponent <em>New Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceComponentOptionImpl extends APSReqComponentHardwareOptionImpl implements APSReqReplaceComponentOption {
	/**
	 * The cached value of the '{@link #getOldComponent() <em>Old Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldComponent()
	 * @generated
	 * @ordered
	 */
	protected Component oldComponent;

	/**
	 * The cached value of the '{@link #getNewComponent() <em>New Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewComponent()
	 * @generated
	 * @ordered
	 */
	protected Component newComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceComponentOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REPLACE_COMPONENT_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getOldComponent() {
		if (oldComponent != null && oldComponent.eIsProxy()) {
			InternalEObject oldOldComponent = (InternalEObject)oldComponent;
			oldComponent = (Component)eResolveProxy(oldOldComponent);
			if (oldComponent != oldOldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT, oldOldComponent, oldComponent));
			}
		}
		return oldComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetOldComponent() {
		return oldComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldComponent(Component newOldComponent) {
		Component oldOldComponent = oldComponent;
		oldComponent = newOldComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT, oldOldComponent, oldComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getNewComponent() {
		if (newComponent != null && newComponent.eIsProxy()) {
			InternalEObject oldNewComponent = (InternalEObject)newComponent;
			newComponent = (Component)eResolveProxy(oldNewComponent);
			if (newComponent != oldNewComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT, oldNewComponent, newComponent));
			}
		}
		return newComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetNewComponent() {
		return newComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewComponent(Component newNewComponent) {
		Component oldNewComponent = newComponent;
		newComponent = newNewComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT, oldNewComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT:
				if (resolve) return getOldComponent();
				return basicGetOldComponent();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT:
				setOldComponent((Component)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT:
				setNewComponent((Component)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT:
				setOldComponent((Component)null);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT:
				setNewComponent((Component)null);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT:
				return oldComponent != null;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT:
				return newComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceComponentOptionImpl
