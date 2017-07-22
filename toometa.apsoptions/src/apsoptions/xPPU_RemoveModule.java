/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Remove Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_RemoveModule#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_RemoveModule()
 * @model
 * @generated
 */
public interface xPPU_RemoveModule extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_RemoveModule_Modules()
	 * @model required="true"
	 * @generated
	 */
	EList<Module> getModules();

} // xPPU_RemoveModule
