/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req IEC Method Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqIECMethodOption#getIecMethods <em>Iec Methods</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqIECMethodOption()
 * @model
 * @generated
 */
public interface APSReqIECMethodOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Iec Methods</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Methods</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqIECMethodOption_IecMethods()
	 * @model
	 * @generated
	 */
	EList<IECMethod> getIecMethods();

} // APSReqIECMethodOption
