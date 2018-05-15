/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;

import apssoftwareoptions.APSReqFunctionOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.Function;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Function Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqFunctionOptionImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqFunctionOptionImpl extends APSReqOptionImpl implements APSReqFunctionOption {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqFunctionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_FUNCTION_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectResolvingEList<Function>(Function.class, this, ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION__FUNCTIONS:
				return getFunctions();
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
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION__FUNCTIONS:
				getFunctions().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION__FUNCTIONS:
				return functions != null && !functions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqFunctionOptionImpl
