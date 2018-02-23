/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Structure Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqReplaceStructureOption#getOldStructure <em>Old Structure</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqReplaceStructureOption#getNewStructure <em>New Structure</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceStructureOption()
 * @model
 * @generated
 */
public interface APSReqReplaceStructureOption extends APSReqStructureHardwareOption {
	/**
	 * Returns the value of the '<em><b>Old Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Structure</em>' reference.
	 * @see #setOldStructure(Structure)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceStructureOption_OldStructure()
	 * @model
	 * @generated
	 */
	Structure getOldStructure();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceStructureOption#getOldStructure <em>Old Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Structure</em>' reference.
	 * @see #getOldStructure()
	 * @generated
	 */
	void setOldStructure(Structure value);

	/**
	 * Returns the value of the '<em><b>New Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Structure</em>' reference.
	 * @see #setNewStructure(Structure)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceStructureOption_NewStructure()
	 * @model
	 * @generated
	 */
	Structure getNewStructure();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceStructureOption#getNewStructure <em>New Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Structure</em>' reference.
	 * @see #getNewStructure()
	 * @generated
	 */
	void setNewStructure(Structure value);

} // APSReqReplaceStructureOption
