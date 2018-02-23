/**
 */
package apsoptions;

import options.Option;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.APSReqOption#getOption <em>Option</em>}</li>
 *   <li>{@link apsoptions.APSReqOption#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getAPSReqOption()
 * @model abstract="true"
 * @generated
 */
public interface APSReqOption extends EObject {

	/**
	 * Returns the value of the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' reference.
	 * @see #setOption(Option)
	 * @see apsoptions.ApsoptionsPackage#getAPSReqOption_Option()
	 * @model
	 * @generated
	 */
	Option getOption();

	/**
	 * Sets the value of the '{@link apsoptions.APSReqOption#getOption <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(Option value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link apsoptions.APSReqOptionContainer#getApsreqoption <em>Apsreqoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(APSReqOptionContainer)
	 * @see apsoptions.ApsoptionsPackage#getAPSReqOption_Repository()
	 * @see apsoptions.APSReqOptionContainer#getApsreqoption
	 * @model opposite="apsreqoption" required="true" transient="false"
	 * @generated
	 */
	APSReqOptionContainer getRepository();

	/**
	 * Sets the value of the '{@link apsoptions.APSReqOption#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(APSReqOptionContainer value);
} // APSReqOption
