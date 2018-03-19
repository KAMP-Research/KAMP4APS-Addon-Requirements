/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req IEC Property Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqIECPropertyOption#getIecProperties <em>Iec Properties</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqIECPropertyOption()
 * @model
 * @generated
 */
public interface APSReqIECPropertyOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Iec Properties</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Properties</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqIECPropertyOption_IecProperties()
	 * @model
	 * @generated
	 */
	EList<IsProperty> getIecProperties();

} // APSReqIECPropertyOption
