/**
 */
package apssoftwareoptions.util;

import apsoptions.APSReqOption;

import apssoftwareoptions.*;

import archoptions.ArchOption;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import options.Option;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import relations.AlternativeObject;
import relations.ConflictObject;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.DuplicationObject;
import relations.ParentalObject;
import relations.RelationObject;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.StakeholderObject;
import relations.TraceableObject;
import relations.TriggerObject;

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
 * @see apssoftwareoptions.ApssoftwareoptionsPackage
 * @generated
 */
public class ApssoftwareoptionsSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApssoftwareoptionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApssoftwareoptionsSwitch() {
		if (modelPackage == null) {
			modelPackage = ApssoftwareoptionsPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION: {
				APSReqSoftwareOption<?> apsReqSoftwareOption = (APSReqSoftwareOption<?>)theEObject;
				T1 result = caseAPSReqSoftwareOption(apsReqSoftwareOption);
				if (result == null) result = caseAPSReqOption(apsReqSoftwareOption);
				if (result == null) result = caseArchOption(apsReqSoftwareOption);
				if (result == null) result = caseOption(apsReqSoftwareOption);
				if (result == null) result = caseTraceableObject(apsReqSoftwareOption);
				if (result == null) result = caseRelationObject(apsReqSoftwareOption);
				if (result == null) result = caseConflictObject(apsReqSoftwareOption);
				if (result == null) result = caseDuplicationObject(apsReqSoftwareOption);
				if (result == null) result = caseDependencyObject(apsReqSoftwareOption);
				if (result == null) result = caseParentalObject(apsReqSoftwareOption);
				if (result == null) result = caseTriggerObject(apsReqSoftwareOption);
				if (result == null) result = caseResolveObject(apsReqSoftwareOption);
				if (result == null) result = caseAlternativeObject(apsReqSoftwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqSoftwareOption);
				if (result == null) result = caseStakeholderObject(apsReqSoftwareOption);
				if (result == null) result = caseSelectionObject(apsReqSoftwareOption);
				if (result == null) result = caseIdentifier(apsReqSoftwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_CHANGE_SOFTWARE_OPTION: {
				APSReqChangeSoftwareOption<?> apsReqChangeSoftwareOption = (APSReqChangeSoftwareOption<?>)theEObject;
				T1 result = caseAPSReqChangeSoftwareOption(apsReqChangeSoftwareOption);
				if (result == null) result = caseAPSReqSoftwareOption(apsReqChangeSoftwareOption);
				if (result == null) result = caseAPSReqOption(apsReqChangeSoftwareOption);
				if (result == null) result = caseArchOption(apsReqChangeSoftwareOption);
				if (result == null) result = caseOption(apsReqChangeSoftwareOption);
				if (result == null) result = caseTraceableObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseRelationObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseConflictObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseDuplicationObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseDependencyObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseParentalObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseTriggerObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseResolveObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseAlternativeObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseStakeholderObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseSelectionObject(apsReqChangeSoftwareOption);
				if (result == null) result = caseIdentifier(apsReqChangeSoftwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION: {
				APSReqRemoveSoftwareOption<?> apsReqRemoveSoftwareOption = (APSReqRemoveSoftwareOption<?>)theEObject;
				T1 result = caseAPSReqRemoveSoftwareOption(apsReqRemoveSoftwareOption);
				if (result == null) result = caseAPSReqSoftwareOption(apsReqRemoveSoftwareOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveSoftwareOption);
				if (result == null) result = caseArchOption(apsReqRemoveSoftwareOption);
				if (result == null) result = caseOption(apsReqRemoveSoftwareOption);
				if (result == null) result = caseTraceableObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseRelationObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseConflictObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseDuplicationObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseDependencyObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseParentalObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseTriggerObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseResolveObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseAlternativeObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseStakeholderObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseSelectionObject(apsReqRemoveSoftwareOption);
				if (result == null) result = caseIdentifier(apsReqRemoveSoftwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION: {
				APSReqReplaceSoftwareOption<?> apsReqReplaceSoftwareOption = (APSReqReplaceSoftwareOption<?>)theEObject;
				T1 result = caseAPSReqReplaceSoftwareOption(apsReqReplaceSoftwareOption);
				if (result == null) result = caseAPSReqSoftwareOption(apsReqReplaceSoftwareOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceSoftwareOption);
				if (result == null) result = caseArchOption(apsReqReplaceSoftwareOption);
				if (result == null) result = caseOption(apsReqReplaceSoftwareOption);
				if (result == null) result = caseTraceableObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseRelationObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseConflictObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseDuplicationObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseDependencyObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseParentalObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseTriggerObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseResolveObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseAlternativeObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseStakeholderObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseSelectionObject(apsReqReplaceSoftwareOption);
				if (result == null) result = caseIdentifier(apsReqReplaceSoftwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_INTRODUCE_NEW_SOFTWARE_OPTION: {
				APSReqIntroduceNewSoftwareOption<?> apsReqIntroduceNewSoftwareOption = (APSReqIntroduceNewSoftwareOption<?>)theEObject;
				T1 result = caseAPSReqIntroduceNewSoftwareOption(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseAPSReqSoftwareOption(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseArchOption(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseOption(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseTraceableObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseRelationObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseConflictObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseDuplicationObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseDependencyObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseParentalObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseTriggerObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseResolveObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseAlternativeObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseStakeholderObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseSelectionObject(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = caseIdentifier(apsReqIntroduceNewSoftwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Software Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseAPSReqSoftwareOption(APSReqSoftwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Software Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECComponent> T1 caseAPSReqChangeSoftwareOption(APSReqChangeSoftwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Software Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECComponent> T1 caseAPSReqRemoveSoftwareOption(APSReqRemoveSoftwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Software Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECComponent> T1 caseAPSReqReplaceSoftwareOption(APSReqReplaceSoftwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Software Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends IECComponent> T1 caseAPSReqIntroduceNewSoftwareOption(APSReqIntroduceNewSoftwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationObject(RelationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConflictObject(ConflictObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplication Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDuplicationObject(DuplicationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDependencyObject(DependencyObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parental Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParentalObject(ParentalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTriggerObject(TriggerObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResolveObject(ResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAlternativeObject(AlternativeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Could Resolve Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCouldResolveObject(CouldResolveObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStakeholderObject(StakeholderObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSelectionObject(SelectionObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTraceableObject(TraceableObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arch Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arch Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArchOption(ArchOption object) {
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
	public <T> T1 caseAPSReqOption(APSReqOption<T> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ApssoftwareoptionsSwitch
