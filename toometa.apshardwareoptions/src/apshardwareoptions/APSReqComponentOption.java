/**
 */
package apshardwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Component Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqComponentOption#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqComponentOption()
 * @model
 * @generated
 */
public interface APSReqComponentOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqComponentOption_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

} // APSReqComponentOption
