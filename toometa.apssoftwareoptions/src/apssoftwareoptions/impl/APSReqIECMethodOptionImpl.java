/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;

import apssoftwareoptions.APSReqIECMethodOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsMethod;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req IEC Method Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqIECMethodOptionImpl#getIecMethods <em>Iec Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqIECMethodOptionImpl extends APSReqOptionImpl implements APSReqIECMethodOption {
	/**
	 * The cached value of the '{@link #getIecMethods() <em>Iec Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<IsMethod> iecMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqIECMethodOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_IEC_METHOD_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsMethod> getIecMethods() {
		if (iecMethods == null) {
			iecMethods = new EObjectResolvingEList<IsMethod>(IsMethod.class, this, ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION__IEC_METHODS);
		}
		return iecMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION__IEC_METHODS:
				return getIecMethods();
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION__IEC_METHODS:
				getIecMethods().clear();
				getIecMethods().addAll((Collection<? extends IsMethod>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION__IEC_METHODS:
				getIecMethods().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION__IEC_METHODS:
				return iecMethods != null && !iecMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqIECMethodOptionImpl
