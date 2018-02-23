/**
 */
package apshardwareoptions.util;

import apshardwareoptions.*;

import apsoptions.APSReqChangeOption;
import apsoptions.APSReqIntrodueNewOption;
import apsoptions.APSReqOption;
import apsoptions.APSReqRemoveOption;
import apsoptions.APSReqReplaceOption;
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
 * @see apshardwareoptions.ApshardwareoptionsPackage
 * @generated
 */
public class ApshardwareoptionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApshardwareoptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApshardwareoptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ApshardwareoptionsPackage.eINSTANCE;
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
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_ENTITITES: {
				APSReqIntroduceNewEntitites apsReqIntroduceNewEntitites = (APSReqIntroduceNewEntitites)theEObject;
				T result = caseAPSReqIntroduceNewEntitites(apsReqIntroduceNewEntitites);
				if (result == null) result = caseAPSReqIntrodueNewOption(apsReqIntroduceNewEntitites);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewEntitites);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES: {
				APSReqRemoveEntities apsReqRemoveEntities = (APSReqRemoveEntities)theEObject;
				T result = caseAPSReqRemoveEntities(apsReqRemoveEntities);
				if (result == null) result = caseAPSReqRemoveOption(apsReqRemoveEntities);
				if (result == null) result = caseAPSReqOption(apsReqRemoveEntities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES: {
				APSReqReplaceEntities apsReqReplaceEntities = (APSReqReplaceEntities)theEObject;
				T result = caseAPSReqReplaceEntities(apsReqReplaceEntities);
				if (result == null) result = caseAPSReqReplaceOption(apsReqReplaceEntities);
				if (result == null) result = caseAPSReqOption(apsReqReplaceEntities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_ENTITIES: {
				APSReqChangeEntities apsReqChangeEntities = (APSReqChangeEntities)theEObject;
				T result = caseAPSReqChangeEntities(apsReqChangeEntities);
				if (result == null) result = caseAPSReqChangeOption(apsReqChangeEntities);
				if (result == null) result = caseAPSReqOption(apsReqChangeEntities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Entitites</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Entitites</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIntroduceNewEntitites(APSReqIntroduceNewEntitites object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqRemoveEntities(APSReqRemoveEntities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqReplaceEntities(APSReqReplaceEntities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Entities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Entities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqChangeEntities(APSReqChangeEntities object) {
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

} //ApshardwareoptionsSwitch
