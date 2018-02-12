/**
 */
package apssoftwareoptions;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Software Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqReplaceSoftwareOption#getOldComponent <em>Old Component</em>}</li>
 *   <li>{@link apssoftwareoptions.APSReqReplaceSoftwareOption#getNewComponent <em>New Component</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqReplaceSoftwareOption()
 * @model
 * @generated
 */
public interface APSReqReplaceSoftwareOption<T extends IECComponent> extends APSReqSoftwareOption<T> {
	/**
	 * Returns the value of the '<em><b>Old Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Component</em>' reference.
	 * @see #setOldComponent(IECComponent)
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqReplaceSoftwareOption_OldComponent()
	 * @model
	 * @generated
	 */
	T getOldComponent();

	/**
	 * Sets the value of the '{@link apssoftwareoptions.APSReqReplaceSoftwareOption#getOldComponent <em>Old Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Component</em>' reference.
	 * @see #getOldComponent()
	 * @generated
	 */
	void setOldComponent(T value);

	/**
	 * Returns the value of the '<em><b>New Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Component</em>' reference.
	 * @see #setNewComponent(IECComponent)
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqReplaceSoftwareOption_NewComponent()
	 * @model
	 * @generated
	 */
	T getNewComponent();

	/**
	 * Sets the value of the '{@link apssoftwareoptions.APSReqReplaceSoftwareOption#getNewComponent <em>New Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Component</em>' reference.
	 * @see #getNewComponent()
	 * @generated
	 */
	void setNewComponent(T value);

} // APSReqReplaceSoftwareOption
