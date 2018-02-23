/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Component Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqReplaceComponentOption#getOldComponent <em>Old Component</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqReplaceComponentOption#getNewComponent <em>New Component</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceComponentOption()
 * @model
 * @generated
 */
public interface APSReqReplaceComponentOption extends APSReqComponentHardwareOption {
	/**
	 * Returns the value of the '<em><b>Old Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Component</em>' reference.
	 * @see #setOldComponent(Component)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceComponentOption_OldComponent()
	 * @model
	 * @generated
	 */
	Component getOldComponent();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceComponentOption#getOldComponent <em>Old Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Component</em>' reference.
	 * @see #getOldComponent()
	 * @generated
	 */
	void setOldComponent(Component value);

	/**
	 * Returns the value of the '<em><b>New Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Component</em>' reference.
	 * @see #setNewComponent(Component)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceComponentOption_NewComponent()
	 * @model
	 * @generated
	 */
	Component getNewComponent();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceComponentOption#getNewComponent <em>New Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Component</em>' reference.
	 * @see #getNewComponent()
	 * @generated
	 */
	void setNewComponent(Component value);

} // APSReqReplaceComponentOption
