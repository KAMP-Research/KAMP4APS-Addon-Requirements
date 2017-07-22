/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_ChangeInterface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Change Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_ChangeInterfaceImpl#getOldInterfaces <em>Old Interfaces</em>}</li>
 *   <li>{@link apsoptions.impl.xPPU_ChangeInterfaceImpl#getNewInterfaces <em>New Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_ChangeInterfaceImpl extends xPPU_OptionImpl implements xPPU_ChangeInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_ChangeInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_CHANGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getOldInterfaces() {
		return (EList<Interface>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_INTERFACE__OLD_INTERFACES, ApsoptionsPackage.Literals.XPPU_CHANGE_INTERFACE__OLD_INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getNewInterfaces() {
		return (EList<Interface>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_INTERFACE__NEW_INTERFACES, ApsoptionsPackage.Literals.XPPU_CHANGE_INTERFACE__NEW_INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__OLD_INTERFACES:
				return getOldInterfaces();
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__NEW_INTERFACES:
				return getNewInterfaces();
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
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__OLD_INTERFACES:
				getOldInterfaces().clear();
				getOldInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__NEW_INTERFACES:
				getNewInterfaces().clear();
				getNewInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__OLD_INTERFACES:
				getOldInterfaces().clear();
				return;
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__NEW_INTERFACES:
				getNewInterfaces().clear();
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
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__OLD_INTERFACES:
				return !getOldInterfaces().isEmpty();
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE__NEW_INTERFACES:
				return !getNewInterfaces().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_ChangeInterfaceImpl
