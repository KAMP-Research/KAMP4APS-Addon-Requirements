/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Change Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_ChangeStructure#getOldStructures <em>Old Structures</em>}</li>
 *   <li>{@link apsoptions.xPPU_ChangeStructure#getNewStructures <em>New Structures</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeStructure()
 * @model
 * @generated
 */
public interface xPPU_ChangeStructure extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Old Structures</b></em>' reference list.
	 * The list contents are of type {@link xPPU.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Structures</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeStructure_OldStructures()
	 * @model required="true"
	 * @generated
	 */
	EList<Structure> getOldStructures();

	/**
	 * Returns the value of the '<em><b>New Structures</b></em>' reference list.
	 * The list contents are of type {@link xPPU.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Structures</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_ChangeStructure_NewStructures()
	 * @model
	 * @generated
	 */
	EList<Structure> getNewStructures();

} // xPPU_ChangeStructure
