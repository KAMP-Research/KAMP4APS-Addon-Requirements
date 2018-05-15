/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Program;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Program Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqProgramOption#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqProgramOption()
 * @model
 * @generated
 */
public interface APSReqProgramOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqProgramOption_Program()
	 * @model
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link apssoftwareoptions.APSReqProgramOption#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // APSReqProgramOption
