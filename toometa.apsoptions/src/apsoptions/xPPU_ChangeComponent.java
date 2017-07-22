/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.ComponentRepository.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Change Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_ChangeComponent#getOldComponents <em>Old Components</em>}</li>
 *   <li>{@link apsoptions.xPPU_ChangeComponent#getNewComponents <em>New Components</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeComponent()
 * @model
 * @generated
 */
public interface xPPU_ChangeComponent extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Old Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Components</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeComponent_OldComponents()
	 * @model required="true"
	 * @generated
	 */
	EList<Component> getOldComponents();

	/**
	 * Returns the value of the '<em><b>New Components</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ComponentRepository.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Components</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeComponent_NewComponents()
	 * @model
	 * @generated
	 */
	EList<Component> getNewComponents();

} // xPPU_ChangeComponent
