/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Remove Module Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqRemoveModuleOption#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqRemoveModuleOption()
 * @model
 * @generated
 */
public interface APSReqRemoveModuleOption extends APSReqModuleHardwareOption {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqRemoveModuleOption_Modules()
	 * @model
	 * @generated
	 */
	EList<Module> getModules();

} // APSReqRemoveModuleOption
