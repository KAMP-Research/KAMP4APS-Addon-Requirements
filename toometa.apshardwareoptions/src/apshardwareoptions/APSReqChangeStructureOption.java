/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Change Structure Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqChangeStructureOption#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqChangeStructureOption()
 * @model
 * @generated
 */
public interface APSReqChangeStructureOption extends APSReqStructureHardwareOption {
	/**
	 * Returns the value of the '<em><b>Structures</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqChangeStructureOption_Structures()
	 * @model
	 * @generated
	 */
	EList<Structure> getStructures();

} // APSReqChangeStructureOption
