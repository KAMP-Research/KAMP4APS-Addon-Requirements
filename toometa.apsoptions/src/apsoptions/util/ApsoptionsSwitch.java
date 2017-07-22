/**
 */
package apsoptions.util;

import apsoptions.*;

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
			case ApsoptionsPackage.XPPU_OPTION: {
				xPPU_Option xPPU_Option = (xPPU_Option)theEObject;
				T result = casexPPU_Option(xPPU_Option);
				if (result == null) result = caseArchOption(xPPU_Option);
				if (result == null) result = caseOption(xPPU_Option);
				if (result == null) result = caseTraceableObject(xPPU_Option);
				if (result == null) result = caseRelationObject(xPPU_Option);
				if (result == null) result = caseConflictObject(xPPU_Option);
				if (result == null) result = caseDuplicationObject(xPPU_Option);
				if (result == null) result = caseDependencyObject(xPPU_Option);
				if (result == null) result = caseParentalObject(xPPU_Option);
				if (result == null) result = caseTriggerObject(xPPU_Option);
				if (result == null) result = caseResolveObject(xPPU_Option);
				if (result == null) result = caseAlternativeObject(xPPU_Option);
				if (result == null) result = caseCouldResolveObject(xPPU_Option);
				if (result == null) result = caseStakeholderObject(xPPU_Option);
				if (result == null) result = caseSelectionObject(xPPU_Option);
				if (result == null) result = caseIdentifier(xPPU_Option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT: {
				xPPU_IntroduceNewComponent xPPU_IntroduceNewComponent = (xPPU_IntroduceNewComponent)theEObject;
				T result = casexPPU_IntroduceNewComponent(xPPU_IntroduceNewComponent);
				if (result == null) result = casexPPU_Option(xPPU_IntroduceNewComponent);
				if (result == null) result = caseArchOption(xPPU_IntroduceNewComponent);
				if (result == null) result = caseOption(xPPU_IntroduceNewComponent);
				if (result == null) result = caseTraceableObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseRelationObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseConflictObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseDuplicationObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseDependencyObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseParentalObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseTriggerObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseResolveObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseAlternativeObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseCouldResolveObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseStakeholderObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseSelectionObject(xPPU_IntroduceNewComponent);
				if (result == null) result = caseIdentifier(xPPU_IntroduceNewComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT: {
				xPPU_ChangeComponent xPPU_ChangeComponent = (xPPU_ChangeComponent)theEObject;
				T result = casexPPU_ChangeComponent(xPPU_ChangeComponent);
				if (result == null) result = casexPPU_Option(xPPU_ChangeComponent);
				if (result == null) result = caseArchOption(xPPU_ChangeComponent);
				if (result == null) result = caseOption(xPPU_ChangeComponent);
				if (result == null) result = caseTraceableObject(xPPU_ChangeComponent);
				if (result == null) result = caseRelationObject(xPPU_ChangeComponent);
				if (result == null) result = caseConflictObject(xPPU_ChangeComponent);
				if (result == null) result = caseDuplicationObject(xPPU_ChangeComponent);
				if (result == null) result = caseDependencyObject(xPPU_ChangeComponent);
				if (result == null) result = caseParentalObject(xPPU_ChangeComponent);
				if (result == null) result = caseTriggerObject(xPPU_ChangeComponent);
				if (result == null) result = caseResolveObject(xPPU_ChangeComponent);
				if (result == null) result = caseAlternativeObject(xPPU_ChangeComponent);
				if (result == null) result = caseCouldResolveObject(xPPU_ChangeComponent);
				if (result == null) result = caseStakeholderObject(xPPU_ChangeComponent);
				if (result == null) result = caseSelectionObject(xPPU_ChangeComponent);
				if (result == null) result = caseIdentifier(xPPU_ChangeComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_REMOVE_COMPONENT: {
				xPPU_RemoveComponent xPPU_RemoveComponent = (xPPU_RemoveComponent)theEObject;
				T result = casexPPU_RemoveComponent(xPPU_RemoveComponent);
				if (result == null) result = casexPPU_Option(xPPU_RemoveComponent);
				if (result == null) result = caseArchOption(xPPU_RemoveComponent);
				if (result == null) result = caseOption(xPPU_RemoveComponent);
				if (result == null) result = caseTraceableObject(xPPU_RemoveComponent);
				if (result == null) result = caseRelationObject(xPPU_RemoveComponent);
				if (result == null) result = caseConflictObject(xPPU_RemoveComponent);
				if (result == null) result = caseDuplicationObject(xPPU_RemoveComponent);
				if (result == null) result = caseDependencyObject(xPPU_RemoveComponent);
				if (result == null) result = caseParentalObject(xPPU_RemoveComponent);
				if (result == null) result = caseTriggerObject(xPPU_RemoveComponent);
				if (result == null) result = caseResolveObject(xPPU_RemoveComponent);
				if (result == null) result = caseAlternativeObject(xPPU_RemoveComponent);
				if (result == null) result = caseCouldResolveObject(xPPU_RemoveComponent);
				if (result == null) result = caseStakeholderObject(xPPU_RemoveComponent);
				if (result == null) result = caseSelectionObject(xPPU_RemoveComponent);
				if (result == null) result = caseIdentifier(xPPU_RemoveComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE: {
				xPPU_IntroduceNewModule xPPU_IntroduceNewModule = (xPPU_IntroduceNewModule)theEObject;
				T result = casexPPU_IntroduceNewModule(xPPU_IntroduceNewModule);
				if (result == null) result = casexPPU_Option(xPPU_IntroduceNewModule);
				if (result == null) result = caseArchOption(xPPU_IntroduceNewModule);
				if (result == null) result = caseOption(xPPU_IntroduceNewModule);
				if (result == null) result = caseTraceableObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseRelationObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseConflictObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseDuplicationObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseDependencyObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseParentalObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseTriggerObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseResolveObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseAlternativeObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseCouldResolveObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseStakeholderObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseSelectionObject(xPPU_IntroduceNewModule);
				if (result == null) result = caseIdentifier(xPPU_IntroduceNewModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_CHANGE_MODULE: {
				xPPU_ChangeModule xPPU_ChangeModule = (xPPU_ChangeModule)theEObject;
				T result = casexPPU_ChangeModule(xPPU_ChangeModule);
				if (result == null) result = casexPPU_Option(xPPU_ChangeModule);
				if (result == null) result = caseArchOption(xPPU_ChangeModule);
				if (result == null) result = caseOption(xPPU_ChangeModule);
				if (result == null) result = caseTraceableObject(xPPU_ChangeModule);
				if (result == null) result = caseRelationObject(xPPU_ChangeModule);
				if (result == null) result = caseConflictObject(xPPU_ChangeModule);
				if (result == null) result = caseDuplicationObject(xPPU_ChangeModule);
				if (result == null) result = caseDependencyObject(xPPU_ChangeModule);
				if (result == null) result = caseParentalObject(xPPU_ChangeModule);
				if (result == null) result = caseTriggerObject(xPPU_ChangeModule);
				if (result == null) result = caseResolveObject(xPPU_ChangeModule);
				if (result == null) result = caseAlternativeObject(xPPU_ChangeModule);
				if (result == null) result = caseCouldResolveObject(xPPU_ChangeModule);
				if (result == null) result = caseStakeholderObject(xPPU_ChangeModule);
				if (result == null) result = caseSelectionObject(xPPU_ChangeModule);
				if (result == null) result = caseIdentifier(xPPU_ChangeModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_REMOVE_MODULE: {
				xPPU_RemoveModule xPPU_RemoveModule = (xPPU_RemoveModule)theEObject;
				T result = casexPPU_RemoveModule(xPPU_RemoveModule);
				if (result == null) result = casexPPU_Option(xPPU_RemoveModule);
				if (result == null) result = caseArchOption(xPPU_RemoveModule);
				if (result == null) result = caseOption(xPPU_RemoveModule);
				if (result == null) result = caseTraceableObject(xPPU_RemoveModule);
				if (result == null) result = caseRelationObject(xPPU_RemoveModule);
				if (result == null) result = caseConflictObject(xPPU_RemoveModule);
				if (result == null) result = caseDuplicationObject(xPPU_RemoveModule);
				if (result == null) result = caseDependencyObject(xPPU_RemoveModule);
				if (result == null) result = caseParentalObject(xPPU_RemoveModule);
				if (result == null) result = caseTriggerObject(xPPU_RemoveModule);
				if (result == null) result = caseResolveObject(xPPU_RemoveModule);
				if (result == null) result = caseAlternativeObject(xPPU_RemoveModule);
				if (result == null) result = caseCouldResolveObject(xPPU_RemoveModule);
				if (result == null) result = caseStakeholderObject(xPPU_RemoveModule);
				if (result == null) result = caseSelectionObject(xPPU_RemoveModule);
				if (result == null) result = caseIdentifier(xPPU_RemoveModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_STRUCTURE: {
				xPPU_IntroduceNewStructure xPPU_IntroduceNewStructure = (xPPU_IntroduceNewStructure)theEObject;
				T result = casexPPU_IntroduceNewStructure(xPPU_IntroduceNewStructure);
				if (result == null) result = casexPPU_Option(xPPU_IntroduceNewStructure);
				if (result == null) result = caseArchOption(xPPU_IntroduceNewStructure);
				if (result == null) result = caseOption(xPPU_IntroduceNewStructure);
				if (result == null) result = caseTraceableObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseRelationObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseConflictObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseDuplicationObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseDependencyObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseParentalObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseTriggerObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseResolveObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseAlternativeObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseCouldResolveObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseStakeholderObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseSelectionObject(xPPU_IntroduceNewStructure);
				if (result == null) result = caseIdentifier(xPPU_IntroduceNewStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE: {
				xPPU_ChangeStructure xPPU_ChangeStructure = (xPPU_ChangeStructure)theEObject;
				T result = casexPPU_ChangeStructure(xPPU_ChangeStructure);
				if (result == null) result = casexPPU_Option(xPPU_ChangeStructure);
				if (result == null) result = caseArchOption(xPPU_ChangeStructure);
				if (result == null) result = caseOption(xPPU_ChangeStructure);
				if (result == null) result = caseTraceableObject(xPPU_ChangeStructure);
				if (result == null) result = caseRelationObject(xPPU_ChangeStructure);
				if (result == null) result = caseConflictObject(xPPU_ChangeStructure);
				if (result == null) result = caseDuplicationObject(xPPU_ChangeStructure);
				if (result == null) result = caseDependencyObject(xPPU_ChangeStructure);
				if (result == null) result = caseParentalObject(xPPU_ChangeStructure);
				if (result == null) result = caseTriggerObject(xPPU_ChangeStructure);
				if (result == null) result = caseResolveObject(xPPU_ChangeStructure);
				if (result == null) result = caseAlternativeObject(xPPU_ChangeStructure);
				if (result == null) result = caseCouldResolveObject(xPPU_ChangeStructure);
				if (result == null) result = caseStakeholderObject(xPPU_ChangeStructure);
				if (result == null) result = caseSelectionObject(xPPU_ChangeStructure);
				if (result == null) result = caseIdentifier(xPPU_ChangeStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_REMOVE_STRUCTURE: {
				xPPU_RemoveStructure xPPU_RemoveStructure = (xPPU_RemoveStructure)theEObject;
				T result = casexPPU_RemoveStructure(xPPU_RemoveStructure);
				if (result == null) result = casexPPU_Option(xPPU_RemoveStructure);
				if (result == null) result = caseArchOption(xPPU_RemoveStructure);
				if (result == null) result = caseOption(xPPU_RemoveStructure);
				if (result == null) result = caseTraceableObject(xPPU_RemoveStructure);
				if (result == null) result = caseRelationObject(xPPU_RemoveStructure);
				if (result == null) result = caseConflictObject(xPPU_RemoveStructure);
				if (result == null) result = caseDuplicationObject(xPPU_RemoveStructure);
				if (result == null) result = caseDependencyObject(xPPU_RemoveStructure);
				if (result == null) result = caseParentalObject(xPPU_RemoveStructure);
				if (result == null) result = caseTriggerObject(xPPU_RemoveStructure);
				if (result == null) result = caseResolveObject(xPPU_RemoveStructure);
				if (result == null) result = caseAlternativeObject(xPPU_RemoveStructure);
				if (result == null) result = caseCouldResolveObject(xPPU_RemoveStructure);
				if (result == null) result = caseStakeholderObject(xPPU_RemoveStructure);
				if (result == null) result = caseSelectionObject(xPPU_RemoveStructure);
				if (result == null) result = caseIdentifier(xPPU_RemoveStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_INTERFACE: {
				xPPU_IntroduceNewInterface xPPU_IntroduceNewInterface = (xPPU_IntroduceNewInterface)theEObject;
				T result = casexPPU_IntroduceNewInterface(xPPU_IntroduceNewInterface);
				if (result == null) result = casexPPU_Option(xPPU_IntroduceNewInterface);
				if (result == null) result = caseArchOption(xPPU_IntroduceNewInterface);
				if (result == null) result = caseOption(xPPU_IntroduceNewInterface);
				if (result == null) result = caseTraceableObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseRelationObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseConflictObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseDuplicationObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseDependencyObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseParentalObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseTriggerObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseResolveObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseAlternativeObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseCouldResolveObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseStakeholderObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseSelectionObject(xPPU_IntroduceNewInterface);
				if (result == null) result = caseIdentifier(xPPU_IntroduceNewInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE: {
				xPPU_ChangeInterface xPPU_ChangeInterface = (xPPU_ChangeInterface)theEObject;
				T result = casexPPU_ChangeInterface(xPPU_ChangeInterface);
				if (result == null) result = casexPPU_Option(xPPU_ChangeInterface);
				if (result == null) result = caseArchOption(xPPU_ChangeInterface);
				if (result == null) result = caseOption(xPPU_ChangeInterface);
				if (result == null) result = caseTraceableObject(xPPU_ChangeInterface);
				if (result == null) result = caseRelationObject(xPPU_ChangeInterface);
				if (result == null) result = caseConflictObject(xPPU_ChangeInterface);
				if (result == null) result = caseDuplicationObject(xPPU_ChangeInterface);
				if (result == null) result = caseDependencyObject(xPPU_ChangeInterface);
				if (result == null) result = caseParentalObject(xPPU_ChangeInterface);
				if (result == null) result = caseTriggerObject(xPPU_ChangeInterface);
				if (result == null) result = caseResolveObject(xPPU_ChangeInterface);
				if (result == null) result = caseAlternativeObject(xPPU_ChangeInterface);
				if (result == null) result = caseCouldResolveObject(xPPU_ChangeInterface);
				if (result == null) result = caseStakeholderObject(xPPU_ChangeInterface);
				if (result == null) result = caseSelectionObject(xPPU_ChangeInterface);
				if (result == null) result = caseIdentifier(xPPU_ChangeInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApsoptionsPackage.XPPU_REMOVE_INTERFACE: {
				xPPU_RemoveInterface xPPU_RemoveInterface = (xPPU_RemoveInterface)theEObject;
				T result = casexPPU_RemoveInterface(xPPU_RemoveInterface);
				if (result == null) result = casexPPU_Option(xPPU_RemoveInterface);
				if (result == null) result = caseArchOption(xPPU_RemoveInterface);
				if (result == null) result = caseOption(xPPU_RemoveInterface);
				if (result == null) result = caseTraceableObject(xPPU_RemoveInterface);
				if (result == null) result = caseRelationObject(xPPU_RemoveInterface);
				if (result == null) result = caseConflictObject(xPPU_RemoveInterface);
				if (result == null) result = caseDuplicationObject(xPPU_RemoveInterface);
				if (result == null) result = caseDependencyObject(xPPU_RemoveInterface);
				if (result == null) result = caseParentalObject(xPPU_RemoveInterface);
				if (result == null) result = caseTriggerObject(xPPU_RemoveInterface);
				if (result == null) result = caseResolveObject(xPPU_RemoveInterface);
				if (result == null) result = caseAlternativeObject(xPPU_RemoveInterface);
				if (result == null) result = caseCouldResolveObject(xPPU_RemoveInterface);
				if (result == null) result = caseStakeholderObject(xPPU_RemoveInterface);
				if (result == null) result = caseSelectionObject(xPPU_RemoveInterface);
				if (result == null) result = caseIdentifier(xPPU_RemoveInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_Option(xPPU_Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Introduce New Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Introduce New Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_IntroduceNewComponent(xPPU_IntroduceNewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Change Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Change Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_ChangeComponent(xPPU_ChangeComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Remove Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Remove Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_RemoveComponent(xPPU_RemoveComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Introduce New Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Introduce New Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_IntroduceNewModule(xPPU_IntroduceNewModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Change Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Change Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_ChangeModule(xPPU_ChangeModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Remove Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Remove Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_RemoveModule(xPPU_RemoveModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Introduce New Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Introduce New Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_IntroduceNewStructure(xPPU_IntroduceNewStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Change Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Change Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_ChangeStructure(xPPU_ChangeStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Remove Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Remove Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_RemoveStructure(xPPU_RemoveStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Introduce New Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Introduce New Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_IntroduceNewInterface(xPPU_IntroduceNewInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Change Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Change Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_ChangeInterface(xPPU_ChangeInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xPPU Remove Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xPPU Remove Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexPPU_RemoveInterface(xPPU_RemoveInterface object) {
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
