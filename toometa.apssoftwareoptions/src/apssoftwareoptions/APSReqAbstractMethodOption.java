/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Abstract Method Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqAbstractMethodOption#getAbstractMethods <em>Abstract Methods</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqAbstractMethodOption()
 * @model
 * @generated
 */
public interface APSReqAbstractMethodOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Abstract Methods</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Methods</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqAbstractMethodOption_AbstractMethods()
	 * @model
	 * @generated
	 */
	EList<IECAbstractMethod> getAbstractMethods();

} // APSReqAbstractMethodOption
