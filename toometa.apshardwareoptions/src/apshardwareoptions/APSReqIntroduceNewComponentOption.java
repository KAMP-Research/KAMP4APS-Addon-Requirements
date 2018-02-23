/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Introduce New Component Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqIntroduceNewComponentOption#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqIntroduceNewComponentOption()
 * @model
 * @generated
 */
public interface APSReqIntroduceNewComponentOption extends APSReqComponentHardwareOption {
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
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqIntroduceNewComponentOption_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

} // APSReqIntroduceNewComponentOption
