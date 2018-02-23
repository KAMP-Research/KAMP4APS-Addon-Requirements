/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqReplaceInterfaceOption;
import apshardwareoptions.ApshardwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Interface Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceInterfaceOptionImpl#getOldInterface <em>Old Interface</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceInterfaceOptionImpl#getNewInterface <em>New Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceInterfaceOptionImpl extends APSReqInterfaceHardwareOptionImpl implements APSReqReplaceInterfaceOption {
	/**
	 * The cached value of the '{@link #getOldInterface() <em>Old Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface oldInterface;

	/**
	 * The cached value of the '{@link #getNewInterface() <em>New Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface newInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceInterfaceOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REPLACE_INTERFACE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getOldInterface() {
		if (oldInterface != null && oldInterface.eIsProxy()) {
			InternalEObject oldOldInterface = (InternalEObject)oldInterface;
			oldInterface = (Interface)eResolveProxy(oldOldInterface);
			if (oldInterface != oldOldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE, oldOldInterface, oldInterface));
			}
		}
		return oldInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetOldInterface() {
		return oldInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldInterface(Interface newOldInterface) {
		Interface oldOldInterface = oldInterface;
		oldInterface = newOldInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE, oldOldInterface, oldInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getNewInterface() {
		if (newInterface != null && newInterface.eIsProxy()) {
			InternalEObject oldNewInterface = (InternalEObject)newInterface;
			newInterface = (Interface)eResolveProxy(oldNewInterface);
			if (newInterface != oldNewInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE, oldNewInterface, newInterface));
			}
		}
		return newInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetNewInterface() {
		return newInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewInterface(Interface newNewInterface) {
		Interface oldNewInterface = newInterface;
		newInterface = newNewInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE, oldNewInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE:
				if (resolve) return getOldInterface();
				return basicGetOldInterface();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE:
				if (resolve) return getNewInterface();
				return basicGetNewInterface();
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE:
				setOldInterface((Interface)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE:
				setNewInterface((Interface)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE:
				setOldInterface((Interface)null);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE:
				setNewInterface((Interface)null);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE:
				return oldInterface != null;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE:
				return newInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceInterfaceOptionImpl
