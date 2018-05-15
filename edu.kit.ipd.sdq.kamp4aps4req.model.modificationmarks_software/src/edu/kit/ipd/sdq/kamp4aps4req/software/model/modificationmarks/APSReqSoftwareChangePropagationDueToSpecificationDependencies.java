/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Software Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecComponentModifications <em>Iec Component Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface APSReqSoftwareChangePropagationDueToSpecificationDependencies extends AbstractAPSReqChangePropagationDueToSpecificationDependencies {
	/**
	 * Returns the value of the '<em><b>Iec Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqModifyIECComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Component Modifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyIECComponent> getIecComponentModifications();

} // APSReqSoftwareChangePropagationDueToSpecificationDependencies
