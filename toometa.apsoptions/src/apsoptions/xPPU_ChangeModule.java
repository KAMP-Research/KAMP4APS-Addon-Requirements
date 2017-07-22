/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.ModuleRepository.Module;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Change Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_ChangeModule#getOldModules <em>Old Modules</em>}</li>
 *   <li>{@link apsoptions.xPPU_ChangeModule#getNewModules <em>New Modules</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeModule()
 * @model
 * @generated
 */
public interface xPPU_ChangeModule extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Old Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Modules</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeModule_OldModules()
	 * @model required="true"
	 * @generated
	 */
	EList<Module> getOldModules();

	/**
	 * Returns the value of the '<em><b>New Modules</b></em>' reference list.
	 * The list contents are of type {@link xPPU.ModuleRepository.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Modules</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Modules</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeModule_NewModules()
	 * @model
	 * @generated
	 */
	EList<Module> getNewModules();

} // xPPU_ChangeModule
