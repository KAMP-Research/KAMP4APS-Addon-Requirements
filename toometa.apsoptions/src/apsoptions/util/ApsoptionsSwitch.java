/**
 */
package apsoptions.util;

import apsoptions.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see apsoptions.ApsoptionsPackage
 * @generated
 */
public class ApsoptionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApsoptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsoptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ApsoptionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApsoptionsPackage.APS_REQ_INTRODUE_NEW_OPTION: {
				APSReqIntrodueNewOption apsReqIntrodueNewOption = (APSReqIntrodueNewOption)theEObject;
				T result = caseAPSReqIntrodueNewOption(apsReqIntrodueNewOption);
				if (result == null) result = caseAPSReqOption(apsReqIntrodueNewOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.APS_REQ_REMOVE_OPTION: {
				APSReqRemoveOption apsReqRemoveOption = (APSReqRemoveOption)theEObject;
				T result = caseAPSReqRemoveOption(apsReqRemoveOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.APS_REQ_REPLACE_OPTION: {
				APSReqReplaceOption apsReqReplaceOption = (APSReqReplaceOption)theEObject;
				T result = caseAPSReqReplaceOption(apsReqReplaceOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.APS_REQ_CHANGE_OPTION: {
				APSReqChangeOption apsReqChangeOption = (APSReqChangeOption)theEObject;
				T result = caseAPSReqChangeOption(apsReqChangeOption);
				if (result == null) result = caseAPSReqOption(apsReqChangeOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.APS_REQ_OPTION: {
				APSReqOption apsReqOption = (APSReqOption)theEObject;
				T result = caseAPSReqOption(apsReqOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.APS_REQ_OPTION_REPOSITORY: {
				APSReqOptionRepository apsReqOptionRepository = (APSReqOptionRepository)theEObject;
				T result = caseAPSReqOptionRepository(apsReqOptionRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introdue New Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introdue New Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIntrodueNewOption(APSReqIntrodueNewOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqRemoveOption(APSReqRemoveOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqReplaceOption(APSReqReplaceOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqChangeOption(APSReqChangeOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqOption(APSReqOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Option Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Option Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqOptionRepository(APSReqOptionRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApsoptionsSwitch
