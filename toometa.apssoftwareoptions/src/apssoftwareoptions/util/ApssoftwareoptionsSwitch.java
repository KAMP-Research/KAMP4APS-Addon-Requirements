/**
 */
package apssoftwareoptions.util;

import apsoptions.APSReqOption;

import apssoftwareoptions.*;

import de.uka.ipd.sdq.identifier.Identifier;

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
public class ApssoftwareoptionsSwitch<T> extends Switch<T> {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApssoftwareoptionsPackage.APS_REQ_PROGRAM_OPTION: {
				APSReqProgramOption apsReqProgramOption = (APSReqProgramOption)theEObject;
				T result = caseAPSReqProgramOption(apsReqProgramOption);
				if (result == null) result = caseAPSReqOption(apsReqProgramOption);
				if (result == null) result = caseOption(apsReqProgramOption);
				if (result == null) result = caseTraceableObject(apsReqProgramOption);
				if (result == null) result = caseRelationObject(apsReqProgramOption);
				if (result == null) result = caseConflictObject(apsReqProgramOption);
				if (result == null) result = caseDuplicationObject(apsReqProgramOption);
				if (result == null) result = caseDependencyObject(apsReqProgramOption);
				if (result == null) result = caseParentalObject(apsReqProgramOption);
				if (result == null) result = caseTriggerObject(apsReqProgramOption);
				if (result == null) result = caseResolveObject(apsReqProgramOption);
				if (result == null) result = caseAlternativeObject(apsReqProgramOption);
				if (result == null) result = caseCouldResolveObject(apsReqProgramOption);
				if (result == null) result = caseStakeholderObject(apsReqProgramOption);
				if (result == null) result = caseSelectionObject(apsReqProgramOption);
				if (result == null) result = caseIdentifier(apsReqProgramOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION: {
				APSReqFunctionOption apsReqFunctionOption = (APSReqFunctionOption)theEObject;
				T result = caseAPSReqFunctionOption(apsReqFunctionOption);
				if (result == null) result = caseAPSReqOption(apsReqFunctionOption);
				if (result == null) result = caseOption(apsReqFunctionOption);
				if (result == null) result = caseTraceableObject(apsReqFunctionOption);
				if (result == null) result = caseRelationObject(apsReqFunctionOption);
				if (result == null) result = caseConflictObject(apsReqFunctionOption);
				if (result == null) result = caseDuplicationObject(apsReqFunctionOption);
				if (result == null) result = caseDependencyObject(apsReqFunctionOption);
				if (result == null) result = caseParentalObject(apsReqFunctionOption);
				if (result == null) result = caseTriggerObject(apsReqFunctionOption);
				if (result == null) result = caseResolveObject(apsReqFunctionOption);
				if (result == null) result = caseAlternativeObject(apsReqFunctionOption);
				if (result == null) result = caseCouldResolveObject(apsReqFunctionOption);
				if (result == null) result = caseStakeholderObject(apsReqFunctionOption);
				if (result == null) result = caseSelectionObject(apsReqFunctionOption);
				if (result == null) result = caseIdentifier(apsReqFunctionOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION: {
				APSReqFunctionBlockOption apsReqFunctionBlockOption = (APSReqFunctionBlockOption)theEObject;
				T result = caseAPSReqFunctionBlockOption(apsReqFunctionBlockOption);
				if (result == null) result = caseAPSReqOption(apsReqFunctionBlockOption);
				if (result == null) result = caseOption(apsReqFunctionBlockOption);
				if (result == null) result = caseTraceableObject(apsReqFunctionBlockOption);
				if (result == null) result = caseRelationObject(apsReqFunctionBlockOption);
				if (result == null) result = caseConflictObject(apsReqFunctionBlockOption);
				if (result == null) result = caseDuplicationObject(apsReqFunctionBlockOption);
				if (result == null) result = caseDependencyObject(apsReqFunctionBlockOption);
				if (result == null) result = caseParentalObject(apsReqFunctionBlockOption);
				if (result == null) result = caseTriggerObject(apsReqFunctionBlockOption);
				if (result == null) result = caseResolveObject(apsReqFunctionBlockOption);
				if (result == null) result = caseAlternativeObject(apsReqFunctionBlockOption);
				if (result == null) result = caseCouldResolveObject(apsReqFunctionBlockOption);
				if (result == null) result = caseStakeholderObject(apsReqFunctionBlockOption);
				if (result == null) result = caseSelectionObject(apsReqFunctionBlockOption);
				if (result == null) result = caseIdentifier(apsReqFunctionBlockOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_CONFIGURATION_OPTION: {
				APSReqConfigurationOption apsReqConfigurationOption = (APSReqConfigurationOption)theEObject;
				T result = caseAPSReqConfigurationOption(apsReqConfigurationOption);
				if (result == null) result = caseAPSReqOption(apsReqConfigurationOption);
				if (result == null) result = caseOption(apsReqConfigurationOption);
				if (result == null) result = caseTraceableObject(apsReqConfigurationOption);
				if (result == null) result = caseRelationObject(apsReqConfigurationOption);
				if (result == null) result = caseConflictObject(apsReqConfigurationOption);
				if (result == null) result = caseDuplicationObject(apsReqConfigurationOption);
				if (result == null) result = caseDependencyObject(apsReqConfigurationOption);
				if (result == null) result = caseParentalObject(apsReqConfigurationOption);
				if (result == null) result = caseTriggerObject(apsReqConfigurationOption);
				if (result == null) result = caseResolveObject(apsReqConfigurationOption);
				if (result == null) result = caseAlternativeObject(apsReqConfigurationOption);
				if (result == null) result = caseCouldResolveObject(apsReqConfigurationOption);
				if (result == null) result = caseStakeholderObject(apsReqConfigurationOption);
				if (result == null) result = caseSelectionObject(apsReqConfigurationOption);
				if (result == null) result = caseIdentifier(apsReqConfigurationOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION: {
				APSReqIECMethodOption apsReqIECMethodOption = (APSReqIECMethodOption)theEObject;
				T result = caseAPSReqIECMethodOption(apsReqIECMethodOption);
				if (result == null) result = caseAPSReqOption(apsReqIECMethodOption);
				if (result == null) result = caseOption(apsReqIECMethodOption);
				if (result == null) result = caseTraceableObject(apsReqIECMethodOption);
				if (result == null) result = caseRelationObject(apsReqIECMethodOption);
				if (result == null) result = caseConflictObject(apsReqIECMethodOption);
				if (result == null) result = caseDuplicationObject(apsReqIECMethodOption);
				if (result == null) result = caseDependencyObject(apsReqIECMethodOption);
				if (result == null) result = caseParentalObject(apsReqIECMethodOption);
				if (result == null) result = caseTriggerObject(apsReqIECMethodOption);
				if (result == null) result = caseResolveObject(apsReqIECMethodOption);
				if (result == null) result = caseAlternativeObject(apsReqIECMethodOption);
				if (result == null) result = caseCouldResolveObject(apsReqIECMethodOption);
				if (result == null) result = caseStakeholderObject(apsReqIECMethodOption);
				if (result == null) result = caseSelectionObject(apsReqIECMethodOption);
				if (result == null) result = caseIdentifier(apsReqIECMethodOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_GLOBAL_VARIABLE_OPTION: {
				APSReqGlobalVariableOption apsReqGlobalVariableOption = (APSReqGlobalVariableOption)theEObject;
				T result = caseAPSReqGlobalVariableOption(apsReqGlobalVariableOption);
				if (result == null) result = caseAPSReqOption(apsReqGlobalVariableOption);
				if (result == null) result = caseOption(apsReqGlobalVariableOption);
				if (result == null) result = caseTraceableObject(apsReqGlobalVariableOption);
				if (result == null) result = caseRelationObject(apsReqGlobalVariableOption);
				if (result == null) result = caseConflictObject(apsReqGlobalVariableOption);
				if (result == null) result = caseDuplicationObject(apsReqGlobalVariableOption);
				if (result == null) result = caseDependencyObject(apsReqGlobalVariableOption);
				if (result == null) result = caseParentalObject(apsReqGlobalVariableOption);
				if (result == null) result = caseTriggerObject(apsReqGlobalVariableOption);
				if (result == null) result = caseResolveObject(apsReqGlobalVariableOption);
				if (result == null) result = caseAlternativeObject(apsReqGlobalVariableOption);
				if (result == null) result = caseCouldResolveObject(apsReqGlobalVariableOption);
				if (result == null) result = caseStakeholderObject(apsReqGlobalVariableOption);
				if (result == null) result = caseSelectionObject(apsReqGlobalVariableOption);
				if (result == null) result = caseIdentifier(apsReqGlobalVariableOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION: {
				APSReqIECPropertyOption apsReqIECPropertyOption = (APSReqIECPropertyOption)theEObject;
				T result = caseAPSReqIECPropertyOption(apsReqIECPropertyOption);
				if (result == null) result = caseAPSReqOption(apsReqIECPropertyOption);
				if (result == null) result = caseOption(apsReqIECPropertyOption);
				if (result == null) result = caseTraceableObject(apsReqIECPropertyOption);
				if (result == null) result = caseRelationObject(apsReqIECPropertyOption);
				if (result == null) result = caseConflictObject(apsReqIECPropertyOption);
				if (result == null) result = caseDuplicationObject(apsReqIECPropertyOption);
				if (result == null) result = caseDependencyObject(apsReqIECPropertyOption);
				if (result == null) result = caseParentalObject(apsReqIECPropertyOption);
				if (result == null) result = caseTriggerObject(apsReqIECPropertyOption);
				if (result == null) result = caseResolveObject(apsReqIECPropertyOption);
				if (result == null) result = caseAlternativeObject(apsReqIECPropertyOption);
				if (result == null) result = caseCouldResolveObject(apsReqIECPropertyOption);
				if (result == null) result = caseStakeholderObject(apsReqIECPropertyOption);
				if (result == null) result = caseSelectionObject(apsReqIECPropertyOption);
				if (result == null) result = caseIdentifier(apsReqIECPropertyOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION: {
				APSReqIECInterfaceOption apsReqIECInterfaceOption = (APSReqIECInterfaceOption)theEObject;
				T result = caseAPSReqIECInterfaceOption(apsReqIECInterfaceOption);
				if (result == null) result = caseAPSReqOption(apsReqIECInterfaceOption);
				if (result == null) result = caseOption(apsReqIECInterfaceOption);
				if (result == null) result = caseTraceableObject(apsReqIECInterfaceOption);
				if (result == null) result = caseRelationObject(apsReqIECInterfaceOption);
				if (result == null) result = caseConflictObject(apsReqIECInterfaceOption);
				if (result == null) result = caseDuplicationObject(apsReqIECInterfaceOption);
				if (result == null) result = caseDependencyObject(apsReqIECInterfaceOption);
				if (result == null) result = caseParentalObject(apsReqIECInterfaceOption);
				if (result == null) result = caseTriggerObject(apsReqIECInterfaceOption);
				if (result == null) result = caseResolveObject(apsReqIECInterfaceOption);
				if (result == null) result = caseAlternativeObject(apsReqIECInterfaceOption);
				if (result == null) result = caseCouldResolveObject(apsReqIECInterfaceOption);
				if (result == null) result = caseStakeholderObject(apsReqIECInterfaceOption);
				if (result == null) result = caseSelectionObject(apsReqIECInterfaceOption);
				if (result == null) result = caseIdentifier(apsReqIECInterfaceOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Program Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Program Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqProgramOption(APSReqProgramOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Function Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Function Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqFunctionOption(APSReqFunctionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Function Block Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Function Block Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqFunctionBlockOption(APSReqFunctionBlockOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Configuration Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Configuration Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqConfigurationOption(APSReqConfigurationOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req IEC Method Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req IEC Method Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIECMethodOption(APSReqIECMethodOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Global Variable Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Global Variable Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqGlobalVariableOption(APSReqGlobalVariableOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req IEC Property Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req IEC Property Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIECPropertyOption(APSReqIECPropertyOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req IEC Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req IEC Interface Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIECInterfaceOption(APSReqIECInterfaceOption object) {
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
	public T caseIdentifier(Identifier object) {
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
	public T caseRelationObject(RelationObject object) {
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
	public T caseConflictObject(ConflictObject object) {
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
	public T caseDuplicationObject(DuplicationObject object) {
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
	public T caseDependencyObject(DependencyObject object) {
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
	public T caseParentalObject(ParentalObject object) {
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
	public T caseTriggerObject(TriggerObject object) {
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
	public T caseResolveObject(ResolveObject object) {
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
	public T caseAlternativeObject(AlternativeObject object) {
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
	public T caseCouldResolveObject(CouldResolveObject object) {
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
	public T caseStakeholderObject(StakeholderObject object) {
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
	public T caseSelectionObject(SelectionObject object) {
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
	public T caseTraceableObject(TraceableObject object) {
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
	public T caseOption(Option object) {
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

} //ApssoftwareoptionsSwitch
