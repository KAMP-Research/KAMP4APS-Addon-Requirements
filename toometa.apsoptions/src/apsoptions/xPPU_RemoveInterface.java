/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.InterfaceRepository.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Remove Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_RemoveInterface#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_RemoveInterface()
 * @model
 * @generated
 */
public interface xPPU_RemoveInterface extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link xPPU.InterfaceRepository.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_RemoveInterface_Interfaces()
	 * @model required="true"
	 * @generated
	 */
	EList<Interface> getInterfaces();

} // xPPU_RemoveInterface
