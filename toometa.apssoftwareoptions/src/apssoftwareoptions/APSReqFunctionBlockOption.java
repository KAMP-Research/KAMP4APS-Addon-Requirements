/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Function Block Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqFunctionBlockOption#getFunctionBlocks <em>Function Blocks</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqFunctionBlockOption()
 * @model
 * @generated
 */
public interface APSReqFunctionBlockOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Function Blocks</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Blocks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Blocks</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqFunctionBlockOption_FunctionBlocks()
	 * @model
	 * @generated
	 */
	EList<FunctionBlock> getFunctionBlocks();

} // APSReqFunctionBlockOption
