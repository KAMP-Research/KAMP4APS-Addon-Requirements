/**
 */
package apssoftwareoptions.impl;

import apssoftwareoptions.APSReqRemoveSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Remove Software Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqRemoveSoftwareOptionImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqRemoveSoftwareOptionImpl<T extends IECComponent> extends APSReqSoftwareOptionImpl<T> implements APSReqRemoveSoftwareOption<T> {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<T> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqRemoveSoftwareOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_REMOVE_SOFTWARE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<T>(IECComponent.class, this, ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION__COMPONENTS:
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
			case ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends T>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION__COMPONENTS:
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
			case ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqRemoveSoftwareOptionImpl
