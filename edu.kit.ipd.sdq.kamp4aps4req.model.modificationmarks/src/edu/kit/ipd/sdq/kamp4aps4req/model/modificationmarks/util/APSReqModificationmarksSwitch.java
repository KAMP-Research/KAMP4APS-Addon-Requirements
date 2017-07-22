/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import relations.TraceableObject;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage
 * @generated
 */
public class APSReqModificationmarksSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static APSReqModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public APSReqModificationmarksSwitch() {
		if (modelPackage == null) {
			modelPackage = APSReqModificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param ePackage
	 *            the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case APSReqModificationmarksPackage.APS_REQ_MODIFICATION_REPOSITORY: {
				APSReqModificationRepository apsReqModificationRepository = (APSReqModificationRepository) theEObject;
				T1 result = caseAPSReqModificationRepository(apsReqModificationRepository);
				if (result == null)
					result = caseAbstractKAPSModificationRepository(apsReqModificationRepository);
				if (result == null)
					result = caseAbstractModificationRepository(apsReqModificationRepository);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS: {
				APSReqSeedModifications apsReqSeedModifications = (APSReqSeedModifications) theEObject;
				T1 result = caseAPSReqSeedModifications(apsReqSeedModifications);
				if (result == null)
					result = caseKAPSSeedModifications(apsReqSeedModifications);
				if (result == null)
					result = caseAbstractSeedModifications(apsReqSeedModifications);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: {
				APSReqChangePropagationDueToSpecificationDependencies apsReqChangePropagationDueToSpecificationDependencies = (APSReqChangePropagationDueToSpecificationDependencies) theEObject;
				T1 result = caseAPSReqChangePropagationDueToSpecificationDependencies(
						apsReqChangePropagationDueToSpecificationDependencies);
				if (result == null)
					result = caseChangePropagationStep(apsReqChangePropagationDueToSpecificationDependencies);
				if (result == null)
					result = caseAbstractChangePropagationStep(apsReqChangePropagationDueToSpecificationDependencies);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_TRACEABLE_OBJECT: {
				APSReqModifyTraceableObject<?> apsReqModifyTraceableObject = (APSReqModifyTraceableObject<?>) theEObject;
				T1 result = caseAPSReqModifyTraceableObject(apsReqModifyTraceableObject);
				if (result == null)
					result = caseAbstractModification(apsReqModifyTraceableObject);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_COMPONENT: {
				APSReqModifyComponent apsReqModifyComponent = (APSReqModifyComponent) theEObject;
				T1 result = caseAPSReqModifyComponent(apsReqModifyComponent);
				if (result == null)
					result = caseModifyComponent(apsReqModifyComponent);
				if (result == null)
					result = caseAbstractModification(apsReqModifyComponent);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_MODULE: {
				APSReqModifyModule apsReqModifyModule = (APSReqModifyModule) theEObject;
				T1 result = caseAPSReqModifyModule(apsReqModifyModule);
				if (result == null)
					result = caseModifyModule(apsReqModifyModule);
				if (result == null)
					result = caseAbstractModification(apsReqModifyModule);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_STRUCTURE: {
				APSReqModifyStructure apsReqModifyStructure = (APSReqModifyStructure) theEObject;
				T1 result = caseAPSReqModifyStructure(apsReqModifyStructure);
				if (result == null)
					result = caseModifyStructure(apsReqModifyStructure);
				if (result == null)
					result = caseAbstractModification(apsReqModifyStructure);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_INTERFACE: {
				APSReqModifyInterface apsReqModifyInterface = (APSReqModifyInterface) theEObject;
				T1 result = caseAPSReqModifyInterface(apsReqModifyInterface);
				if (result == null)
					result = caseModifyInterface(apsReqModifyInterface);
				if (result == null)
					result = caseAbstractModification(apsReqModifyInterface);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_REQUIREMENT: {
				APSReqModifyRequirement apsReqModifyRequirement = (APSReqModifyRequirement) theEObject;
				T1 result = caseAPSReqModifyRequirement(apsReqModifyRequirement);
				if (result == null)
					result = caseAPSReqModifyTraceableObject(apsReqModifyRequirement);
				if (result == null)
					result = caseAbstractModification(apsReqModifyRequirement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_DECISION: {
				APSReqModifyDecision apsReqModifyDecision = (APSReqModifyDecision) theEObject;
				T1 result = caseAPSReqModifyDecision(apsReqModifyDecision);
				if (result == null)
					result = caseAPSReqModifyTraceableObject(apsReqModifyDecision);
				if (result == null)
					result = caseAbstractModification(apsReqModifyDecision);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_OPTION: {
				APSReqModifyOption apsReqModifyOption = (APSReqModifyOption) theEObject;
				T1 result = caseAPSReqModifyOption(apsReqModifyOption);
				if (result == null)
					result = caseAPSReqModifyTraceableObject(apsReqModifyOption);
				if (result == null)
					result = caseAbstractModification(apsReqModifyOption);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modification Repository</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModificationRepository(APSReqModificationRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Seed Modifications</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqSeedModifications(APSReqSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Change Propagation Due To Specification Dependencies</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null
	 * result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Change Propagation Due To Specification Dependencies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqChangePropagationDueToSpecificationDependencies(
			APSReqChangePropagationDueToSpecificationDependencies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Traceable Object</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Traceable Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TraceableObject> T1 caseAPSReqModifyTraceableObject(APSReqModifyTraceableObject<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Component</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyComponent(APSReqModifyComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Module</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyModule(APSReqModifyModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Structure</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyStructure(APSReqModifyStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Interface</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyInterface(APSReqModifyInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Requirement</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyRequirement(APSReqModifyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Decision</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyDecision(APSReqModifyDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>APS
	 * Req Modify Option</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>APS
	 *         Req Modify Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAPSReqModifyOption(APSReqModifyOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract Modification Repository</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> T1 caseAbstractModificationRepository(
			AbstractModificationRepository<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract KAPS Modification Repository</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract KAPS Modification Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends KAPSSeedModifications> T1 caseAbstractKAPSModificationRepository(
			AbstractKAPSModificationRepository<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract Seed Modifications</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractSeedModifications(AbstractSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KAPS
	 * Seed Modifications</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KAPS
	 *         Seed Modifications</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseKAPSSeedModifications(KAPSSeedModifications object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract Change Propagation Step</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Change Propagation Step</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Change Propagation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseChangePropagationStep(ChangePropagationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Abstract Modification</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Abstract Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <S, T> T1 caseAbstractModification(AbstractModification<S, T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Modify Component</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Modify Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Component> T1 caseModifyComponent(ModifyComponent<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Modify Module</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Modify Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Module> T1 caseModifyModule(ModifyModule<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Modify Structure</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Modify Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Structure> T1 caseModifyStructure(ModifyStructure<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>Modify Interface</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>Modify Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Interface> T1 caseModifyInterface(ModifyInterface<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of
	 * '<em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of
	 *         '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} // APSReqModificationmarksSwitch
