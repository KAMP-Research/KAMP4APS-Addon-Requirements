/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqReplaceHardwareOption#getOldEntity <em>Old Entity</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqReplaceHardwareOption#getNewEntity <em>New Entity</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceHardwareOption()
 * @model
 * @generated
 */
public interface APSReqReplaceHardwareOption<T extends Entity> extends APSReqHardwareOption<T> {
	/**
	 * Returns the value of the '<em><b>Old Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Entity</em>' reference.
	 * @see #setOldEntity(Entity)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceHardwareOption_OldEntity()
	 * @model
	 * @generated
	 */
	T getOldEntity();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceHardwareOption#getOldEntity <em>Old Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Entity</em>' reference.
	 * @see #getOldEntity()
	 * @generated
	 */
	void setOldEntity(T value);

	/**
	 * Returns the value of the '<em><b>New Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Entity</em>' reference.
	 * @see #setNewEntity(Entity)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceHardwareOption_NewEntity()
	 * @model
	 * @generated
	 */
	T getNewEntity();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceHardwareOption#getNewEntity <em>New Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Entity</em>' reference.
	 * @see #getNewEntity()
	 * @generated
	 */
	void setNewEntity(T value);

} // APSReqReplaceHardwareOption
