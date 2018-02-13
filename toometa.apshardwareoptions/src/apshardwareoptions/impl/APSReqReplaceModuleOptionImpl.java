/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqReplaceModuleOption;
import apshardwareoptions.ApshardwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Module Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceModuleOptionImpl#getOldModule <em>Old Module</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceModuleOptionImpl#getNewModule <em>New Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceModuleOptionImpl extends APSReqModuleHardwareOptionImpl implements APSReqReplaceModuleOption {
	/**
	 * The cached value of the '{@link #getOldModule() <em>Old Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldModule()
	 * @generated
	 * @ordered
	 */
	protected Module oldModule;

	/**
	 * The cached value of the '{@link #getNewModule() <em>New Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewModule()
	 * @generated
	 * @ordered
	 */
	protected Module newModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceModuleOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REPLACE_MODULE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getOldModule() {
		if (oldModule != null && oldModule.eIsProxy()) {
			InternalEObject oldOldModule = (InternalEObject)oldModule;
			oldModule = (Module)eResolveProxy(oldOldModule);
			if (oldModule != oldOldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE, oldOldModule, oldModule));
			}
		}
		return oldModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetOldModule() {
		return oldModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldModule(Module newOldModule) {
		Module oldOldModule = oldModule;
		oldModule = newOldModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE, oldOldModule, oldModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getNewModule() {
		if (newModule != null && newModule.eIsProxy()) {
			InternalEObject oldNewModule = (InternalEObject)newModule;
			newModule = (Module)eResolveProxy(oldNewModule);
			if (newModule != oldNewModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE, oldNewModule, newModule));
			}
		}
		return newModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetNewModule() {
		return newModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewModule(Module newNewModule) {
		Module oldNewModule = newModule;
		newModule = newNewModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE, oldNewModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE:
				if (resolve) return getOldModule();
				return basicGetOldModule();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE:
				if (resolve) return getNewModule();
				return basicGetNewModule();
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE:
				setOldModule((Module)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE:
				setNewModule((Module)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE:
				setOldModule((Module)null);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE:
				setNewModule((Module)null);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE:
				return oldModule != null;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE:
				return newModule != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceModuleOptionImpl
