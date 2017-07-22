/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>xPPU Introduce New Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.xPPU_IntroduceNewStructure#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getxPPU_IntroduceNewStructure()
 * @model
 * @generated
 */
public interface xPPU_IntroduceNewStructure extends xPPU_Option {
	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link xPPU.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see apsoptions.ApsoptionsPackage#getxPPU_IntroduceNewStructure_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

} // xPPU_IntroduceNewStructure
