/**
 */
package apssoftwareoptions;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Change Software Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqChangeSoftwareOption#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqChangeSoftwareOption()
 * @model
 * @generated
 */
public interface APSReqChangeSoftwareOption<T extends IECComponent> extends APSReqSoftwareOption {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqChangeSoftwareOption_Components()
	 * @model
	 * @generated
	 */
	EList<T> getComponents();

} // APSReqChangeSoftwareOption
