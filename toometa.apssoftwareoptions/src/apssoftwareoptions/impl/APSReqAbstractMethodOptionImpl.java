/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;
import apssoftwareoptions.APSReqAbstractMethodOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Abstract Method Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqAbstractMethodOptionImpl#getAbstractMethods <em>Abstract Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqAbstractMethodOptionImpl extends APSReqOptionImpl implements APSReqAbstractMethodOption {
	/**
	 * The cached value of the '{@link #getAbstractMethods() <em>Abstract Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAbstractMethod> abstractMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqAbstractMethodOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_ABSTRACT_METHOD_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAbstractMethod> getAbstractMethods() {
		if (abstractMethods == null) {
			abstractMethods = new EObjectResolvingEList<IECAbstractMethod>(IECAbstractMethod.class, this, ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_METHOD_OPTION__ABSTRACT_METHODS);
		}
		return abstractMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_METHOD_OPTION__ABSTRACT_METHODS:
				return getAbstractMethods();
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
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_METHOD_OPTION__ABSTRACT_METHODS:
				getAbstractMethods().clear();
				getAbstractMethods().addAll((Collection<? extends IECAbstractMethod>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_METHOD_OPTION__ABSTRACT_METHODS:
				getAbstractMethods().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_METHOD_OPTION__ABSTRACT_METHODS:
				return abstractMethods != null && !abstractMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqAbstractMethodOptionImpl
