/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Change Propagation Due To Hardware Changes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqChangePropagationDueToHardwareChanges#getHardwareChanges <em>Hardware Changes</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqChangePropagationDueToHardwareChanges()
 * @model
 * @generated
 */
public interface APSReqChangePropagationDueToHardwareChanges extends APSReqChangePropagationDueToSpecificationDependencies {
	/**
	 * Returns the value of the '<em><b>Hardware Changes</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Changes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Changes</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqChangePropagationDueToHardwareChanges_HardwareChanges()
	 * @model
	 * @generated
	 */
	EList<ChangePropagationDueToHardwareChange> getHardwareChanges();

} // APSReqChangePropagationDueToHardwareChanges
