/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Remove Interface Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqRemoveInterfaceOption#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqRemoveInterfaceOption()
 * @model
 * @generated
 */
public interface APSReqRemoveInterfaceOption extends APSReqInterfaceHardwareOption {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqRemoveInterfaceOption_Interfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // APSReqRemoveInterfaceOption
