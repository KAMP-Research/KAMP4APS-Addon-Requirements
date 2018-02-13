/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Replace Module Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqReplaceModuleOption#getOldModule <em>Old Module</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqReplaceModuleOption#getNewModule <em>New Module</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceModuleOption()
 * @model
 * @generated
 */
public interface APSReqReplaceModuleOption extends APSReqModuleHardwareOption {
	/**
	 * Returns the value of the '<em><b>Old Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Module</em>' reference.
	 * @see #setOldModule(Module)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceModuleOption_OldModule()
	 * @model
	 * @generated
	 */
	Module getOldModule();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceModuleOption#getOldModule <em>Old Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Module</em>' reference.
	 * @see #getOldModule()
	 * @generated
	 */
	void setOldModule(Module value);

	/**
	 * Returns the value of the '<em><b>New Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Module</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Module</em>' reference.
	 * @see #setNewModule(Module)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqReplaceModuleOption_NewModule()
	 * @model
	 * @generated
	 */
	Module getNewModule();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqReplaceModuleOption#getNewModule <em>New Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Module</em>' reference.
	 * @see #getNewModule()
	 * @generated
	 */
	void setNewModule(Module value);

} // APSReqReplaceModuleOption
