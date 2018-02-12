/**
 */
package modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getOptionModifications <em>Option Modifications</em>}</li>
 * </ul>
 *
 * @see modificationmarks.ModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface APSReqChangePropagationDueToSpecificationDependencies extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link modificationmarks.APSReqModifyDecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decision Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Modifications</em>' containment reference list.
	 * @see modificationmarks.ModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyDecision> getDecisionModifications();

	/**
	 * Returns the value of the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link modificationmarks.APSReqModifyRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Modifications</em>' containment reference list.
	 * @see modificationmarks.ModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyRequirement> getRequirementModifications();

	/**
	 * Returns the value of the '<em><b>Option Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link modificationmarks.APSReqModifyOption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Modifications</em>' containment reference list.
	 * @see modificationmarks.ModificationmarksPackage#getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyOption> getOptionModifications();

} // APSReqChangePropagationDueToSpecificationDependencies
