/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_IntroduceNewComponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Introduce New Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_IntroduceNewComponentImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_IntroduceNewComponentImpl extends xPPU_OptionImpl implements xPPU_IntroduceNewComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_IntroduceNewComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_INTRODUCE_NEW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Component> getComponents() {
		return (EList<Component>)eDynamicGet(ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS, ApsoptionsPackage.Literals.XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS:
				return getComponents();
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS:
				getComponents().clear();
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS:
				return !getComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_IntroduceNewComponentImpl
