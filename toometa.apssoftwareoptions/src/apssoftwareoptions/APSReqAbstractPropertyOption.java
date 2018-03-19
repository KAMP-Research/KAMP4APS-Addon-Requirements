/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Abstract Property Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqAbstractPropertyOption#getAbstractProperties <em>Abstract Properties</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqAbstractPropertyOption()
 * @model
 * @generated
 */
public interface APSReqAbstractPropertyOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Abstract Properties</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Properties</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqAbstractPropertyOption_AbstractProperties()
	 * @model
	 * @generated
	 */
	EList<IECAbstractProperty> getAbstractProperties();

} // APSReqAbstractPropertyOption
