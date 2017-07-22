/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_ChangeComponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Change Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_ChangeComponentImpl#getOldComponents <em>Old Components</em>}</li>
 *   <li>{@link apsoptions.impl.xPPU_ChangeComponentImpl#getNewComponents <em>New Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_ChangeComponentImpl extends xPPU_OptionImpl implements xPPU_ChangeComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_ChangeComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_CHANGE_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getOldComponents() {
		return (EList<Component>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_COMPONENT__OLD_COMPONENTS, ApsoptionsPackage.Literals.XPPU_CHANGE_COMPONENT__OLD_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getNewComponents() {
		return (EList<Component>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_COMPONENT__NEW_COMPONENTS, ApsoptionsPackage.Literals.XPPU_CHANGE_COMPONENT__NEW_COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__OLD_COMPONENTS:
				return getOldComponents();
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__NEW_COMPONENTS:
				return getNewComponents();
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
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__OLD_COMPONENTS:
				getOldComponents().clear();
				getOldComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__NEW_COMPONENTS:
				getNewComponents().clear();
				getNewComponents().addAll((Collection<? extends Component>)newValue);
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
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__OLD_COMPONENTS:
				getOldComponents().clear();
				return;
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__NEW_COMPONENTS:
				getNewComponents().clear();
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
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__OLD_COMPONENTS:
				return !getOldComponents().isEmpty();
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT__NEW_COMPONENTS:
				return !getNewComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_ChangeComponentImpl
