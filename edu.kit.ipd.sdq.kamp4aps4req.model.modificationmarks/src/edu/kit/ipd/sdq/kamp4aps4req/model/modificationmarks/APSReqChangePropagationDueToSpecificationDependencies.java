/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>APS Req
 * Change Propagation Due To Specification Dependencies</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getDecisionModifications
 * <em>Decision Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getOptionModifications
 * <em>Option Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getRequirementModifications
 * <em>Requirement Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getComponentModifications
 * <em>Component Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getModuleModifications
 * <em>Module Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getStructureModifications
 * <em>Structure Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getInterfaceModifications
 * <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface APSReqChangePropagationDueToSpecificationDependencies extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Decision Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Decision Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyDecision> getDecisionModifications();

	/**
	 * Returns the value of the '<em><b>Option Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Option Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyOption> getOptionModifications();

	/**
	 * Returns the value of the '<em><b>Requirement Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirement Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyRequirement> getRequirementModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Component Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_ComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyComponent> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Module Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_ModuleModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyModule> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Structure Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_StructureModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyStructure> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Interface Modifications</em>' containment
	 *         reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_InterfaceModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyInterface> getInterfaceModifications();

} // APSReqChangePropagationDueToSpecificationDependencies
