/**
 */
package apshardwareoptions.util;

import apshardwareoptions.*;

import apsoptions.APSReqOption;

import archoptions.ArchOption;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

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
 * @see apshardwareoptions.ApshardwareoptionsPackage
 * @generated
 */
public class ApshardwareoptionsSwitch<T1> extends Switch<T1> {
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApshardwareoptionsPackage.APS_REQ_HARDWARE_OPTION: {
				APSReqHardwareOption<?> apsReqHardwareOption = (APSReqHardwareOption<?>)theEObject;
				T1 result = caseAPSReqHardwareOption(apsReqHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqHardwareOption);
				if (result == null) result = caseArchOption(apsReqHardwareOption);
				if (result == null) result = caseOption(apsReqHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqHardwareOption);
				if (result == null) result = caseRelationObject(apsReqHardwareOption);
				if (result == null) result = caseConflictObject(apsReqHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqHardwareOption);
				if (result == null) result = caseParentalObject(apsReqHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqHardwareOption);
				if (result == null) result = caseResolveObject(apsReqHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqHardwareOption);
				if (result == null) result = caseIdentifier(apsReqHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION: {
				APSReqIntroduceNewHardwareOption<?> apsReqIntroduceNewHardwareOption = (APSReqIntroduceNewHardwareOption<?>)theEObject;
				T1 result = caseAPSReqIntroduceNewHardwareOption(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseArchOption(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseOption(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseRelationObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseConflictObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseParentalObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseResolveObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqIntroduceNewHardwareOption);
				if (result == null) result = caseIdentifier(apsReqIntroduceNewHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_HARDWARE_OPTION: {
				APSReqRemoveHardwareOption<?> apsReqRemoveHardwareOption = (APSReqRemoveHardwareOption<?>)theEObject;
				T1 result = caseAPSReqRemoveHardwareOption(apsReqRemoveHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqRemoveHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveHardwareOption);
				if (result == null) result = caseArchOption(apsReqRemoveHardwareOption);
				if (result == null) result = caseOption(apsReqRemoveHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseRelationObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseConflictObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseParentalObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseResolveObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqRemoveHardwareOption);
				if (result == null) result = caseIdentifier(apsReqRemoveHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_HARDWARE_OPTION: {
				APSReqChangeHardwareOption<?> apsReqChangeHardwareOption = (APSReqChangeHardwareOption<?>)theEObject;
				T1 result = caseAPSReqChangeHardwareOption(apsReqChangeHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqChangeHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqChangeHardwareOption);
				if (result == null) result = caseArchOption(apsReqChangeHardwareOption);
				if (result == null) result = caseOption(apsReqChangeHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqChangeHardwareOption);
				if (result == null) result = caseRelationObject(apsReqChangeHardwareOption);
				if (result == null) result = caseConflictObject(apsReqChangeHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqChangeHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqChangeHardwareOption);
				if (result == null) result = caseParentalObject(apsReqChangeHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqChangeHardwareOption);
				if (result == null) result = caseResolveObject(apsReqChangeHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqChangeHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqChangeHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqChangeHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqChangeHardwareOption);
				if (result == null) result = caseIdentifier(apsReqChangeHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION: {
				APSReqReplaceHardwareOption<?> apsReqReplaceHardwareOption = (APSReqReplaceHardwareOption<?>)theEObject;
				T1 result = caseAPSReqReplaceHardwareOption(apsReqReplaceHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqReplaceHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceHardwareOption);
				if (result == null) result = caseArchOption(apsReqReplaceHardwareOption);
				if (result == null) result = caseOption(apsReqReplaceHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseRelationObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseConflictObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseParentalObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseResolveObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqReplaceHardwareOption);
				if (result == null) result = caseIdentifier(apsReqReplaceHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseAPSReqHardwareOption(APSReqHardwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseAPSReqIntroduceNewHardwareOption(APSReqIntroduceNewHardwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseAPSReqRemoveHardwareOption(APSReqRemoveHardwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseAPSReqChangeHardwareOption(APSReqChangeHardwareOption<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Entity> T1 caseAPSReqReplaceHardwareOption(APSReqReplaceHardwareOption<T> object) {
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

} //ApshardwareoptionsSwitch
