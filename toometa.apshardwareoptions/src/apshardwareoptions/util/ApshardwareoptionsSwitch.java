/**
 */
package apshardwareoptions.util;

import apshardwareoptions.*;

import apsoptions.APSReqOption;

import archoptions.ArchOption;

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
			case ApshardwareoptionsPackage.APS_REQ_HARDWARE_OPTION: {
				APSReqHardwareOption apsReqHardwareOption = (APSReqHardwareOption)theEObject;
				T result = caseAPSReqHardwareOption(apsReqHardwareOption);
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
			case ApshardwareoptionsPackage.APS_REQ_STRUCTURE_HARDWARE_OPTION: {
				APSReqStructureHardwareOption apsReqStructureHardwareOption = (APSReqStructureHardwareOption)theEObject;
				T result = caseAPSReqStructureHardwareOption(apsReqStructureHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqStructureHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqStructureHardwareOption);
				if (result == null) result = caseArchOption(apsReqStructureHardwareOption);
				if (result == null) result = caseOption(apsReqStructureHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqStructureHardwareOption);
				if (result == null) result = caseRelationObject(apsReqStructureHardwareOption);
				if (result == null) result = caseConflictObject(apsReqStructureHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqStructureHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqStructureHardwareOption);
				if (result == null) result = caseParentalObject(apsReqStructureHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqStructureHardwareOption);
				if (result == null) result = caseResolveObject(apsReqStructureHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqStructureHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqStructureHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqStructureHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqStructureHardwareOption);
				if (result == null) result = caseIdentifier(apsReqStructureHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION: {
				APSReqIntroduceNewStructureOption apsReqIntroduceNewStructureOption = (APSReqIntroduceNewStructureOption)theEObject;
				T result = caseAPSReqIntroduceNewStructureOption(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseAPSReqStructureHardwareOption(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseArchOption(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseOption(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseTraceableObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseRelationObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseConflictObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseDuplicationObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseDependencyObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseParentalObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseTriggerObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseResolveObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseAlternativeObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseCouldResolveObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseStakeholderObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseSelectionObject(apsReqIntroduceNewStructureOption);
				if (result == null) result = caseIdentifier(apsReqIntroduceNewStructureOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_STRUCTURE_OPTION: {
				APSReqChangeStructureOption apsReqChangeStructureOption = (APSReqChangeStructureOption)theEObject;
				T result = caseAPSReqChangeStructureOption(apsReqChangeStructureOption);
				if (result == null) result = caseAPSReqStructureHardwareOption(apsReqChangeStructureOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqChangeStructureOption);
				if (result == null) result = caseAPSReqOption(apsReqChangeStructureOption);
				if (result == null) result = caseArchOption(apsReqChangeStructureOption);
				if (result == null) result = caseOption(apsReqChangeStructureOption);
				if (result == null) result = caseTraceableObject(apsReqChangeStructureOption);
				if (result == null) result = caseRelationObject(apsReqChangeStructureOption);
				if (result == null) result = caseConflictObject(apsReqChangeStructureOption);
				if (result == null) result = caseDuplicationObject(apsReqChangeStructureOption);
				if (result == null) result = caseDependencyObject(apsReqChangeStructureOption);
				if (result == null) result = caseParentalObject(apsReqChangeStructureOption);
				if (result == null) result = caseTriggerObject(apsReqChangeStructureOption);
				if (result == null) result = caseResolveObject(apsReqChangeStructureOption);
				if (result == null) result = caseAlternativeObject(apsReqChangeStructureOption);
				if (result == null) result = caseCouldResolveObject(apsReqChangeStructureOption);
				if (result == null) result = caseStakeholderObject(apsReqChangeStructureOption);
				if (result == null) result = caseSelectionObject(apsReqChangeStructureOption);
				if (result == null) result = caseIdentifier(apsReqChangeStructureOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_STRUCTURE_OPTION: {
				APSReqRemoveStructureOption apsReqRemoveStructureOption = (APSReqRemoveStructureOption)theEObject;
				T result = caseAPSReqRemoveStructureOption(apsReqRemoveStructureOption);
				if (result == null) result = caseAPSReqStructureHardwareOption(apsReqRemoveStructureOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqRemoveStructureOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveStructureOption);
				if (result == null) result = caseArchOption(apsReqRemoveStructureOption);
				if (result == null) result = caseOption(apsReqRemoveStructureOption);
				if (result == null) result = caseTraceableObject(apsReqRemoveStructureOption);
				if (result == null) result = caseRelationObject(apsReqRemoveStructureOption);
				if (result == null) result = caseConflictObject(apsReqRemoveStructureOption);
				if (result == null) result = caseDuplicationObject(apsReqRemoveStructureOption);
				if (result == null) result = caseDependencyObject(apsReqRemoveStructureOption);
				if (result == null) result = caseParentalObject(apsReqRemoveStructureOption);
				if (result == null) result = caseTriggerObject(apsReqRemoveStructureOption);
				if (result == null) result = caseResolveObject(apsReqRemoveStructureOption);
				if (result == null) result = caseAlternativeObject(apsReqRemoveStructureOption);
				if (result == null) result = caseCouldResolveObject(apsReqRemoveStructureOption);
				if (result == null) result = caseStakeholderObject(apsReqRemoveStructureOption);
				if (result == null) result = caseSelectionObject(apsReqRemoveStructureOption);
				if (result == null) result = caseIdentifier(apsReqRemoveStructureOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION: {
				APSReqReplaceStructureOption apsReqReplaceStructureOption = (APSReqReplaceStructureOption)theEObject;
				T result = caseAPSReqReplaceStructureOption(apsReqReplaceStructureOption);
				if (result == null) result = caseAPSReqStructureHardwareOption(apsReqReplaceStructureOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqReplaceStructureOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceStructureOption);
				if (result == null) result = caseArchOption(apsReqReplaceStructureOption);
				if (result == null) result = caseOption(apsReqReplaceStructureOption);
				if (result == null) result = caseTraceableObject(apsReqReplaceStructureOption);
				if (result == null) result = caseRelationObject(apsReqReplaceStructureOption);
				if (result == null) result = caseConflictObject(apsReqReplaceStructureOption);
				if (result == null) result = caseDuplicationObject(apsReqReplaceStructureOption);
				if (result == null) result = caseDependencyObject(apsReqReplaceStructureOption);
				if (result == null) result = caseParentalObject(apsReqReplaceStructureOption);
				if (result == null) result = caseTriggerObject(apsReqReplaceStructureOption);
				if (result == null) result = caseResolveObject(apsReqReplaceStructureOption);
				if (result == null) result = caseAlternativeObject(apsReqReplaceStructureOption);
				if (result == null) result = caseCouldResolveObject(apsReqReplaceStructureOption);
				if (result == null) result = caseStakeholderObject(apsReqReplaceStructureOption);
				if (result == null) result = caseSelectionObject(apsReqReplaceStructureOption);
				if (result == null) result = caseIdentifier(apsReqReplaceStructureOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_MODULE_HARDWARE_OPTION: {
				APSReqModuleHardwareOption apsReqModuleHardwareOption = (APSReqModuleHardwareOption)theEObject;
				T result = caseAPSReqModuleHardwareOption(apsReqModuleHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqModuleHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqModuleHardwareOption);
				if (result == null) result = caseArchOption(apsReqModuleHardwareOption);
				if (result == null) result = caseOption(apsReqModuleHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqModuleHardwareOption);
				if (result == null) result = caseRelationObject(apsReqModuleHardwareOption);
				if (result == null) result = caseConflictObject(apsReqModuleHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqModuleHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqModuleHardwareOption);
				if (result == null) result = caseParentalObject(apsReqModuleHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqModuleHardwareOption);
				if (result == null) result = caseResolveObject(apsReqModuleHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqModuleHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqModuleHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqModuleHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqModuleHardwareOption);
				if (result == null) result = caseIdentifier(apsReqModuleHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_MODULE_OPTION: {
				APSReqIntroduceNewModuleOption apsReqIntroduceNewModuleOption = (APSReqIntroduceNewModuleOption)theEObject;
				T result = caseAPSReqIntroduceNewModuleOption(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseAPSReqModuleHardwareOption(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseArchOption(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseOption(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseTraceableObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseRelationObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseConflictObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseDuplicationObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseDependencyObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseParentalObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseTriggerObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseResolveObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseAlternativeObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseCouldResolveObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseStakeholderObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseSelectionObject(apsReqIntroduceNewModuleOption);
				if (result == null) result = caseIdentifier(apsReqIntroduceNewModuleOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_MODULE_OPTION: {
				APSReqRemoveModuleOption apsReqRemoveModuleOption = (APSReqRemoveModuleOption)theEObject;
				T result = caseAPSReqRemoveModuleOption(apsReqRemoveModuleOption);
				if (result == null) result = caseAPSReqModuleHardwareOption(apsReqRemoveModuleOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqRemoveModuleOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveModuleOption);
				if (result == null) result = caseArchOption(apsReqRemoveModuleOption);
				if (result == null) result = caseOption(apsReqRemoveModuleOption);
				if (result == null) result = caseTraceableObject(apsReqRemoveModuleOption);
				if (result == null) result = caseRelationObject(apsReqRemoveModuleOption);
				if (result == null) result = caseConflictObject(apsReqRemoveModuleOption);
				if (result == null) result = caseDuplicationObject(apsReqRemoveModuleOption);
				if (result == null) result = caseDependencyObject(apsReqRemoveModuleOption);
				if (result == null) result = caseParentalObject(apsReqRemoveModuleOption);
				if (result == null) result = caseTriggerObject(apsReqRemoveModuleOption);
				if (result == null) result = caseResolveObject(apsReqRemoveModuleOption);
				if (result == null) result = caseAlternativeObject(apsReqRemoveModuleOption);
				if (result == null) result = caseCouldResolveObject(apsReqRemoveModuleOption);
				if (result == null) result = caseStakeholderObject(apsReqRemoveModuleOption);
				if (result == null) result = caseSelectionObject(apsReqRemoveModuleOption);
				if (result == null) result = caseIdentifier(apsReqRemoveModuleOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_MODULE_OPTION: {
				APSReqChangeModuleOption apsReqChangeModuleOption = (APSReqChangeModuleOption)theEObject;
				T result = caseAPSReqChangeModuleOption(apsReqChangeModuleOption);
				if (result == null) result = caseAPSReqModuleHardwareOption(apsReqChangeModuleOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqChangeModuleOption);
				if (result == null) result = caseAPSReqOption(apsReqChangeModuleOption);
				if (result == null) result = caseArchOption(apsReqChangeModuleOption);
				if (result == null) result = caseOption(apsReqChangeModuleOption);
				if (result == null) result = caseTraceableObject(apsReqChangeModuleOption);
				if (result == null) result = caseRelationObject(apsReqChangeModuleOption);
				if (result == null) result = caseConflictObject(apsReqChangeModuleOption);
				if (result == null) result = caseDuplicationObject(apsReqChangeModuleOption);
				if (result == null) result = caseDependencyObject(apsReqChangeModuleOption);
				if (result == null) result = caseParentalObject(apsReqChangeModuleOption);
				if (result == null) result = caseTriggerObject(apsReqChangeModuleOption);
				if (result == null) result = caseResolveObject(apsReqChangeModuleOption);
				if (result == null) result = caseAlternativeObject(apsReqChangeModuleOption);
				if (result == null) result = caseCouldResolveObject(apsReqChangeModuleOption);
				if (result == null) result = caseStakeholderObject(apsReqChangeModuleOption);
				if (result == null) result = caseSelectionObject(apsReqChangeModuleOption);
				if (result == null) result = caseIdentifier(apsReqChangeModuleOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION: {
				APSReqReplaceModuleOption apsReqReplaceModuleOption = (APSReqReplaceModuleOption)theEObject;
				T result = caseAPSReqReplaceModuleOption(apsReqReplaceModuleOption);
				if (result == null) result = caseAPSReqModuleHardwareOption(apsReqReplaceModuleOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqReplaceModuleOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceModuleOption);
				if (result == null) result = caseArchOption(apsReqReplaceModuleOption);
				if (result == null) result = caseOption(apsReqReplaceModuleOption);
				if (result == null) result = caseTraceableObject(apsReqReplaceModuleOption);
				if (result == null) result = caseRelationObject(apsReqReplaceModuleOption);
				if (result == null) result = caseConflictObject(apsReqReplaceModuleOption);
				if (result == null) result = caseDuplicationObject(apsReqReplaceModuleOption);
				if (result == null) result = caseDependencyObject(apsReqReplaceModuleOption);
				if (result == null) result = caseParentalObject(apsReqReplaceModuleOption);
				if (result == null) result = caseTriggerObject(apsReqReplaceModuleOption);
				if (result == null) result = caseResolveObject(apsReqReplaceModuleOption);
				if (result == null) result = caseAlternativeObject(apsReqReplaceModuleOption);
				if (result == null) result = caseCouldResolveObject(apsReqReplaceModuleOption);
				if (result == null) result = caseStakeholderObject(apsReqReplaceModuleOption);
				if (result == null) result = caseSelectionObject(apsReqReplaceModuleOption);
				if (result == null) result = caseIdentifier(apsReqReplaceModuleOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_COMPONENT_HARDWARE_OPTION: {
				APSReqComponentHardwareOption apsReqComponentHardwareOption = (APSReqComponentHardwareOption)theEObject;
				T result = caseAPSReqComponentHardwareOption(apsReqComponentHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqComponentHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqComponentHardwareOption);
				if (result == null) result = caseArchOption(apsReqComponentHardwareOption);
				if (result == null) result = caseOption(apsReqComponentHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqComponentHardwareOption);
				if (result == null) result = caseRelationObject(apsReqComponentHardwareOption);
				if (result == null) result = caseConflictObject(apsReqComponentHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqComponentHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqComponentHardwareOption);
				if (result == null) result = caseParentalObject(apsReqComponentHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqComponentHardwareOption);
				if (result == null) result = caseResolveObject(apsReqComponentHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqComponentHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqComponentHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqComponentHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqComponentHardwareOption);
				if (result == null) result = caseIdentifier(apsReqComponentHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION: {
				APSReqIntroduceNewComponentOption apsReqIntroduceNewComponentOption = (APSReqIntroduceNewComponentOption)theEObject;
				T result = caseAPSReqIntroduceNewComponentOption(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseAPSReqComponentHardwareOption(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseArchOption(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseOption(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseTraceableObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseRelationObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseConflictObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseDuplicationObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseDependencyObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseParentalObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseTriggerObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseResolveObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseAlternativeObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseCouldResolveObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseStakeholderObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseSelectionObject(apsReqIntroduceNewComponentOption);
				if (result == null) result = caseIdentifier(apsReqIntroduceNewComponentOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_COMPONENT_OPTION: {
				APSReqRemoveComponentOption apsReqRemoveComponentOption = (APSReqRemoveComponentOption)theEObject;
				T result = caseAPSReqRemoveComponentOption(apsReqRemoveComponentOption);
				if (result == null) result = caseAPSReqComponentHardwareOption(apsReqRemoveComponentOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqRemoveComponentOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveComponentOption);
				if (result == null) result = caseArchOption(apsReqRemoveComponentOption);
				if (result == null) result = caseOption(apsReqRemoveComponentOption);
				if (result == null) result = caseTraceableObject(apsReqRemoveComponentOption);
				if (result == null) result = caseRelationObject(apsReqRemoveComponentOption);
				if (result == null) result = caseConflictObject(apsReqRemoveComponentOption);
				if (result == null) result = caseDuplicationObject(apsReqRemoveComponentOption);
				if (result == null) result = caseDependencyObject(apsReqRemoveComponentOption);
				if (result == null) result = caseParentalObject(apsReqRemoveComponentOption);
				if (result == null) result = caseTriggerObject(apsReqRemoveComponentOption);
				if (result == null) result = caseResolveObject(apsReqRemoveComponentOption);
				if (result == null) result = caseAlternativeObject(apsReqRemoveComponentOption);
				if (result == null) result = caseCouldResolveObject(apsReqRemoveComponentOption);
				if (result == null) result = caseStakeholderObject(apsReqRemoveComponentOption);
				if (result == null) result = caseSelectionObject(apsReqRemoveComponentOption);
				if (result == null) result = caseIdentifier(apsReqRemoveComponentOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION: {
				APSReqReplaceComponentOption apsReqReplaceComponentOption = (APSReqReplaceComponentOption)theEObject;
				T result = caseAPSReqReplaceComponentOption(apsReqReplaceComponentOption);
				if (result == null) result = caseAPSReqComponentHardwareOption(apsReqReplaceComponentOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqReplaceComponentOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceComponentOption);
				if (result == null) result = caseArchOption(apsReqReplaceComponentOption);
				if (result == null) result = caseOption(apsReqReplaceComponentOption);
				if (result == null) result = caseTraceableObject(apsReqReplaceComponentOption);
				if (result == null) result = caseRelationObject(apsReqReplaceComponentOption);
				if (result == null) result = caseConflictObject(apsReqReplaceComponentOption);
				if (result == null) result = caseDuplicationObject(apsReqReplaceComponentOption);
				if (result == null) result = caseDependencyObject(apsReqReplaceComponentOption);
				if (result == null) result = caseParentalObject(apsReqReplaceComponentOption);
				if (result == null) result = caseTriggerObject(apsReqReplaceComponentOption);
				if (result == null) result = caseResolveObject(apsReqReplaceComponentOption);
				if (result == null) result = caseAlternativeObject(apsReqReplaceComponentOption);
				if (result == null) result = caseCouldResolveObject(apsReqReplaceComponentOption);
				if (result == null) result = caseStakeholderObject(apsReqReplaceComponentOption);
				if (result == null) result = caseSelectionObject(apsReqReplaceComponentOption);
				if (result == null) result = caseIdentifier(apsReqReplaceComponentOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_INTERFACE_HARDWARE_OPTION: {
				APSReqInterfaceHardwareOption apsReqInterfaceHardwareOption = (APSReqInterfaceHardwareOption)theEObject;
				T result = caseAPSReqInterfaceHardwareOption(apsReqInterfaceHardwareOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqInterfaceHardwareOption);
				if (result == null) result = caseAPSReqOption(apsReqInterfaceHardwareOption);
				if (result == null) result = caseArchOption(apsReqInterfaceHardwareOption);
				if (result == null) result = caseOption(apsReqInterfaceHardwareOption);
				if (result == null) result = caseTraceableObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseRelationObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseConflictObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseDuplicationObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseDependencyObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseParentalObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseTriggerObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseResolveObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseAlternativeObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseCouldResolveObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseStakeholderObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseSelectionObject(apsReqInterfaceHardwareOption);
				if (result == null) result = caseIdentifier(apsReqInterfaceHardwareOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION: {
				APSReqIntroduceNewInterfaceOption apsReqIntroduceNewInterfaceOption = (APSReqIntroduceNewInterfaceOption)theEObject;
				T result = caseAPSReqIntroduceNewInterfaceOption(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseAPSReqInterfaceHardwareOption(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseAPSReqOption(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseArchOption(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseOption(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseTraceableObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseRelationObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseConflictObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseDuplicationObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseDependencyObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseParentalObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseTriggerObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseResolveObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseAlternativeObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseCouldResolveObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseStakeholderObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseSelectionObject(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = caseIdentifier(apsReqIntroduceNewInterfaceOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_INTERFACE_OPTION: {
				APSReqChangeInterfaceOption apsReqChangeInterfaceOption = (APSReqChangeInterfaceOption)theEObject;
				T result = caseAPSReqChangeInterfaceOption(apsReqChangeInterfaceOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqChangeInterfaceOption);
				if (result == null) result = caseAPSReqOption(apsReqChangeInterfaceOption);
				if (result == null) result = caseArchOption(apsReqChangeInterfaceOption);
				if (result == null) result = caseOption(apsReqChangeInterfaceOption);
				if (result == null) result = caseTraceableObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseRelationObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseConflictObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseDuplicationObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseDependencyObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseParentalObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseTriggerObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseResolveObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseAlternativeObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseCouldResolveObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseStakeholderObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseSelectionObject(apsReqChangeInterfaceOption);
				if (result == null) result = caseIdentifier(apsReqChangeInterfaceOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION: {
				APSReqReplaceInterfaceOption apsReqReplaceInterfaceOption = (APSReqReplaceInterfaceOption)theEObject;
				T result = caseAPSReqReplaceInterfaceOption(apsReqReplaceInterfaceOption);
				if (result == null) result = caseAPSReqInterfaceHardwareOption(apsReqReplaceInterfaceOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqReplaceInterfaceOption);
				if (result == null) result = caseAPSReqOption(apsReqReplaceInterfaceOption);
				if (result == null) result = caseArchOption(apsReqReplaceInterfaceOption);
				if (result == null) result = caseOption(apsReqReplaceInterfaceOption);
				if (result == null) result = caseTraceableObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseRelationObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseConflictObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseDuplicationObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseDependencyObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseParentalObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseTriggerObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseResolveObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseAlternativeObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseCouldResolveObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseStakeholderObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseSelectionObject(apsReqReplaceInterfaceOption);
				if (result == null) result = caseIdentifier(apsReqReplaceInterfaceOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_INTERFACE_OPTION: {
				APSReqRemoveInterfaceOption apsReqRemoveInterfaceOption = (APSReqRemoveInterfaceOption)theEObject;
				T result = caseAPSReqRemoveInterfaceOption(apsReqRemoveInterfaceOption);
				if (result == null) result = caseAPSReqInterfaceHardwareOption(apsReqRemoveInterfaceOption);
				if (result == null) result = caseAPSReqHardwareOption(apsReqRemoveInterfaceOption);
				if (result == null) result = caseAPSReqOption(apsReqRemoveInterfaceOption);
				if (result == null) result = caseArchOption(apsReqRemoveInterfaceOption);
				if (result == null) result = caseOption(apsReqRemoveInterfaceOption);
				if (result == null) result = caseTraceableObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseRelationObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseConflictObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseDuplicationObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseDependencyObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseParentalObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseTriggerObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseResolveObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseAlternativeObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseCouldResolveObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseStakeholderObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseSelectionObject(apsReqRemoveInterfaceOption);
				if (result == null) result = caseIdentifier(apsReqRemoveInterfaceOption);
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
	public T caseAPSReqHardwareOption(APSReqHardwareOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Structure Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Structure Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqStructureHardwareOption(APSReqStructureHardwareOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Structure Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Structure Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIntroduceNewStructureOption(APSReqIntroduceNewStructureOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Structure Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Structure Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqChangeStructureOption(APSReqChangeStructureOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Structure Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Structure Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqRemoveStructureOption(APSReqRemoveStructureOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Structure Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Structure Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqReplaceStructureOption(APSReqReplaceStructureOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Module Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Module Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqModuleHardwareOption(APSReqModuleHardwareOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Module Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Module Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIntroduceNewModuleOption(APSReqIntroduceNewModuleOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Module Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Module Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqRemoveModuleOption(APSReqRemoveModuleOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Module Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Module Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqChangeModuleOption(APSReqChangeModuleOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Module Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Module Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqReplaceModuleOption(APSReqReplaceModuleOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Component Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Component Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqComponentHardwareOption(APSReqComponentHardwareOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Component Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Component Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIntroduceNewComponentOption(APSReqIntroduceNewComponentOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Component Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Component Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqRemoveComponentOption(APSReqRemoveComponentOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Component Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Component Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqReplaceComponentOption(APSReqReplaceComponentOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Interface Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Interface Hardware Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqInterfaceHardwareOption(APSReqInterfaceHardwareOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Introduce New Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Introduce New Interface Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqIntroduceNewInterfaceOption(APSReqIntroduceNewInterfaceOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Change Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Change Interface Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqChangeInterfaceOption(APSReqChangeInterfaceOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Replace Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Replace Interface Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqReplaceInterfaceOption(APSReqReplaceInterfaceOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Remove Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Remove Interface Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPSReqRemoveInterfaceOption(APSReqRemoveInterfaceOption object) {
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
	public T caseArchOption(ArchOption object) {
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

} //ApshardwareoptionsSwitch
