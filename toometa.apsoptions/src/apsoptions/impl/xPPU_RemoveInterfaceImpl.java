/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_RemoveInterface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Remove Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_RemoveInterfaceImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_RemoveInterfaceImpl extends xPPU_OptionImpl implements xPPU_RemoveInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_RemoveInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_REMOVE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> getInterfaces() {
		return (EList<Interface>)eDynamicGet(ApsoptionsPackage.XPPU_REMOVE_INTERFACE__INTERFACES, ApsoptionsPackage.Literals.XPPU_REMOVE_INTERFACE__INTERFACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_REMOVE_INTERFACE__INTERFACES:
				return getInterfaces();
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
			case ApsoptionsPackage.XPPU_REMOVE_INTERFACE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
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
			case ApsoptionsPackage.XPPU_REMOVE_INTERFACE__INTERFACES:
				getInterfaces().clear();
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
			case ApsoptionsPackage.XPPU_REMOVE_INTERFACE__INTERFACES:
				return !getInterfaces().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_RemoveInterfaceImpl