/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_IntroduceNewModule;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Introduce New Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_IntroduceNewModuleImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_IntroduceNewModuleImpl extends xPPU_OptionImpl implements xPPU_IntroduceNewModule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_IntroduceNewModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_INTRODUCE_NEW_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Module> getModules() {
		return (EList<Module>)eDynamicGet(ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE__MODULES, ApsoptionsPackage.Literals.XPPU_INTRODUCE_NEW_MODULE__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE__MODULES:
				return getModules();
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE__MODULES:
				getModules().clear();
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE__MODULES:
				return !getModules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_IntroduceNewModuleImpl
