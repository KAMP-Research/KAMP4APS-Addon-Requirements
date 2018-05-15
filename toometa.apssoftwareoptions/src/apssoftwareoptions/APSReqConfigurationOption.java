/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.Configuration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Configuration Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqConfigurationOption#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqConfigurationOption()
 * @model
 * @generated
 */
public interface APSReqConfigurationOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqConfigurationOption_Configuration()
	 * @model
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link apssoftwareoptions.APSReqConfigurationOption#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // APSReqConfigurationOption
