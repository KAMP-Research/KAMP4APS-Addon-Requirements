/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Interface Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqReplaceInterfaceOption#getOldInterface <em>Old Interface</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqReplaceInterfaceOption#getNewInterface <em>New Interface</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceInterfaceOption()
 * @model
 * @generated
 */
public interface APSReqReplaceInterfaceOption extends APSReqInterfaceHardwareOption {
	/**
	 * Returns the value of the '<em><b>Old Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Interface</em>' reference.
	 * @see #setOldInterface(Interface)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceInterfaceOption_OldInterface()
	 * @model
	 * @generated
	 */
	Interface getOldInterface();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceInterfaceOption#getOldInterface <em>Old Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Interface</em>' reference.
	 * @see #getOldInterface()
	 * @generated
	 */
	void setOldInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>New Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Interface</em>' reference.
	 * @see #setNewInterface(Interface)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceInterfaceOption_NewInterface()
	 * @model
	 * @generated
	 */
	Interface getNewInterface();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceInterfaceOption#getNewInterface <em>New Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Interface</em>' reference.
	 * @see #getNewInterface()
	 * @generated
	 */
	void setNewInterface(Interface value);

} // APSReqReplaceInterfaceOption
