/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Global Variable Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqGlobalVariableOption#getGlobalVariables <em>Global Variables</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqGlobalVariableOption()
 * @model
 * @generated
 */
public interface APSReqGlobalVariableOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Global Variables</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variables</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqGlobalVariableOption_GlobalVariables()
	 * @model
	 * @generated
	 */
	EList<GlobalVariable> getGlobalVariables();

} // APSReqGlobalVariableOption
