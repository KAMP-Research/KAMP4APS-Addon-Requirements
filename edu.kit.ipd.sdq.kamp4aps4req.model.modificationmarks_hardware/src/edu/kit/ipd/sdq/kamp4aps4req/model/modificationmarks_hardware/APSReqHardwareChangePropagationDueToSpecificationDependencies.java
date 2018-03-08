/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Hardware Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies#getEntityModifications <em>Entity Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface APSReqHardwareChangePropagationDueToSpecificationDependencies extends AbstractAPSReqChangePropagationDueToSpecificationDependencies {
	/**
	 * Returns the value of the '<em><b>Entity Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqModifyEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies_EntityModifications()
	 * @model
	 * @generated
	 */
	EList<APSReqModifyEntity> getEntityModifications();

} // APSReqHardwareChangePropagationDueToSpecificationDependencies
