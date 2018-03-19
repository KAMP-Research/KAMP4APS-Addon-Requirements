/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Software Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getConfigurationModifications <em>Configuration Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getProgramModifications <em>Program Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getFunctionModifications <em>Function Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecInterfaceModifications <em>Iec Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getAbstractIECMethodModifications <em>Abstract IEC Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecMethodModifications <em>Iec Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getAbstractIECPropertyModifications <em>Abstract IEC Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecPropertyModifications <em>Iec Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecComponentModifications <em>Iec Component Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface APSReqSoftwareChangePropagationDueToSpecificationDependencies extends AbstractAPSReqChangePropagationDueToSpecificationDependencies {

	/**
	 * Returns the value of the '<em><b>Configuration Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ConfigurationModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyConfiguration> getConfigurationModifications();

	/**
	 * Returns the value of the '<em><b>Program Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ProgramModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyProgram> getProgramModifications();

	/**
	 * Returns the value of the '<em><b>Function Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyFunction> getFunctionModifications();

	/**
	 * Returns the value of the '<em><b>Function Block Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Block Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Block Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionBlockModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyFunctionBlock> getFunctionBlockModifications();

	/**
	 * Returns the value of the '<em><b>Global Variable Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_GlobalVariableModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyGlobalVariable> getGlobalVariableModifications();

	/**
	 * Returns the value of the '<em><b>Iec Interface Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Interface Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Interface Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecInterfaceModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyInterface> getIecInterfaceModifications();

	/**
	 * Returns the value of the '<em><b>Abstract IEC Method Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract IEC Method Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract IEC Method Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECMethodModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyAbstractMethod> getAbstractIECMethodModifications();

	/**
	 * Returns the value of the '<em><b>Iec Method Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Method Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Method Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecMethodModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyMethod> getIecMethodModifications();

	/**
	 * Returns the value of the '<em><b>Abstract IEC Property Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract IEC Property Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract IEC Property Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECPropertyModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyAbstractProperty> getAbstractIECPropertyModifications();

	/**
	 * Returns the value of the '<em><b>Iec Property Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Property Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Property Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecPropertyModifications()
	 * @model
	 * @generated
	 */
	EList<IECModifyProperty> getIecPropertyModifications();

	/**
	 * Returns the value of the '<em><b>Iec Component Modifications</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyIECComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Component Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Component Modifications</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<APSReqModifyIECComponent> getIecComponentModifications();
} // APSReqSoftwareChangePropagationDueToSpecificationDependencies
