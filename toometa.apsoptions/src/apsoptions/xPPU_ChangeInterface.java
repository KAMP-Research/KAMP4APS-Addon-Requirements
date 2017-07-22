/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Change Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_ChangeInterface#getOldInterfaces <em>Old Interfaces</em>}</li>
 *   <li>{@link apsoptions.xPPU_ChangeInterface#getNewInterfaces <em>New Interfaces</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeInterface()
 * @model
 * @generated
 */
public interface xPPU_ChangeInterface extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Old Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Interfaces</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeInterface_OldInterfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getOldInterfaces();

	/**
	 * Returns the value of the '<em><b>New Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Interfaces</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeInterface_NewInterfaces()
	 * @model
	 * @generated
	 */
	EList<Interface> getNewInterfaces();

} // xPPU_ChangeInterface
