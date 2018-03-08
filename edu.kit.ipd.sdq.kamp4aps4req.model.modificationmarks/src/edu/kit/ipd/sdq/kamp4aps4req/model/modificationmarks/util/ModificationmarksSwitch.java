/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import relations.TraceableObject;

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
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage
 * @generated
 */
public class ModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = ModificationmarksPackage.eINSTANCE;
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
			case ModificationmarksPackage.APS_REQ_MODIFY_TRACEABLE_OBJECT: {
				APSReqModifyTraceableObject<?> apsReqModifyTraceableObject = (APSReqModifyTraceableObject<?>)theEObject;
				T1 result = caseAPSReqModifyTraceableObject(apsReqModifyTraceableObject);
				if (result == null) result = caseAbstractModification(apsReqModifyTraceableObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.APS_REQ_MODIFY_REQUIREMENT: {
				APSReqModifyRequirement apsReqModifyRequirement = (APSReqModifyRequirement)theEObject;
				T1 result = caseAPSReqModifyRequirement(apsReqModifyRequirement);
				if (result == null) result = caseAPSReqModifyTraceableObject(apsReqModifyRequirement);
				if (result == null) result = caseAbstractModification(apsReqModifyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.APS_REQ_MODIFY_DECISION: {
				APSReqModifyDecision apsReqModifyDecision = (APSReqModifyDecision)theEObject;
				T1 result = caseAPSReqModifyDecision(apsReqModifyDecision);
				if (result == null) result = caseAPSReqModifyTraceableObject(apsReqModifyDecision);
				if (result == null) result = caseAbstractModification(apsReqModifyDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.APS_REQ_MODIFY_OPTION: {
				APSReqModifyOption apsReqModifyOption = (APSReqModifyOption)theEObject;
				T1 result = caseAPSReqModifyOption(apsReqModifyOption);
				if (result == null) result = caseAPSReqModifyTraceableObject(apsReqModifyOption);
				if (result == null) result = caseAbstractModification(apsReqModifyOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY: {
				AbstractKAMP4aPS4ReqModificationRepository<?> abstractKAMP4aPS4ReqModificationRepository = (AbstractKAMP4aPS4ReqModificationRepository<?>)theEObject;
				T1 result = caseAbstractKAMP4aPS4ReqModificationRepository(abstractKAMP4aPS4ReqModificationRepository);
				if (result == null) result = caseAbstractModificationRepository(abstractKAMP4aPS4ReqModificationRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS: {
				APSReqSeedModifications apsReqSeedModifications = (APSReqSeedModifications)theEObject;
				T1 result = caseAPSReqSeedModifications(apsReqSeedModifications);
				if (result == null) result = caseAbstractSeedModifications(apsReqSeedModifications);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: {
				AbstractAPSReqChangePropagationDueToSpecificationDependencies abstractAPSReqChangePropagationDueToSpecificationDependencies = (AbstractAPSReqChangePropagationDueToSpecificationDependencies)theEObject;
				T1 result = caseAbstractAPSReqChangePropagationDueToSpecificationDependencies(abstractAPSReqChangePropagationDueToSpecificationDependencies);
				if (result == null) result = caseChangePropagationStep(abstractAPSReqChangePropagationDueToSpecificationDependencies);
				if (result == null) result = caseAbstractChangePropagationStep(abstractAPSReqChangePropagationDueToSpecificationDependencies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Modify Traceable Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Modify Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TraceableObject> T1 caseAPSReqModifyTraceableObject(APSReqModifyTraceableObject<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Modify Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Modify Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyRequirement(APSReqModifyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Modify Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Modify Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyDecision(APSReqModifyDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Modify Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Modify Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyOption(APSReqModifyOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract KAMP 4a PS4 Req Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract KAMP 4a PS4 Req Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends APSReqSeedModifications> T1 caseAbstractKAMP4aPS4ReqModificationRepository(AbstractKAMP4aPS4ReqModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS Req Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS Req Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqSeedModifications(APSReqSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractAPSReqChangePropagationDueToSpecificationDependencies(AbstractAPSReqChangePropagationDueToSpecificationDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
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

} //ModificationmarksSwitch
