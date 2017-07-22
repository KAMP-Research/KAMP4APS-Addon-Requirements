/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_ChangeModule;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Change Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_ChangeModuleImpl#getOldModules <em>Old Modules</em>}</li>
 *   <li>{@link apsoptions.impl.xPPU_ChangeModuleImpl#getNewModules <em>New Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_ChangeModuleImpl extends xPPU_OptionImpl implements xPPU_ChangeModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_ChangeModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_CHANGE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Module> getOldModules() {
		return (EList<Module>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_MODULE__OLD_MODULES, ApsoptionsPackage.Literals.XPPU_CHANGE_MODULE__OLD_MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Module> getNewModules() {
		return (EList<Module>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_MODULE__NEW_MODULES, ApsoptionsPackage.Literals.XPPU_CHANGE_MODULE__NEW_MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__OLD_MODULES:
				return getOldModules();
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__NEW_MODULES:
				return getNewModules();
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
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__OLD_MODULES:
				getOldModules().clear();
				getOldModules().addAll((Collection<? extends Module>)newValue);
				return;
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__NEW_MODULES:
				getNewModules().clear();
				getNewModules().addAll((Collection<? extends Module>)newValue);
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
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__OLD_MODULES:
				getOldModules().clear();
				return;
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__NEW_MODULES:
				getNewModules().clear();
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
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__OLD_MODULES:
				return !getOldModules().isEmpty();
			case ApsoptionsPackage.XPPU_CHANGE_MODULE__NEW_MODULES:
				return !getNewModules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_ChangeModuleImpl
