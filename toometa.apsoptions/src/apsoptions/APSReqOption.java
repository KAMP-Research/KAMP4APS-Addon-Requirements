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
 *   <li>{@link apsoptions.APSReqOption#getOptionType <em>Option Type</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getAPSReqOption()
 * @model abstract="true"
 * @generated
 */
public interface APSReqOption extends EObject, Option {
	/**
	 * Returns the value of the '<em><b>Option Type</b></em>' attribute.
	 * The literals are from the enumeration {@link apsoptions.OptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option Type</em>' attribute.
	 * @see apsoptions.OptionType
	 * @see #setOptionType(OptionType)
	 * @see apsoptions.ApsoptionsPackage#getAPSReqOption_OptionType()
	 * @model required="true"
	 * @generated
	 */
	OptionType getOptionType();

	/**
	 * Sets the value of the '{@link apsoptions.APSReqOption#getOptionType <em>Option Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option Type</em>' attribute.
	 * @see apsoptions.OptionType
	 * @see #getOptionType()
	 * @generated
	 */
	void setOptionType(OptionType value);

} // APSReqOption
