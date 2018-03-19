/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwareFactory
 * @model kind="package"
 * @generated
 */
public interface Modificationmarks_softwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks_software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modificationmarks_software";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks_software";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modificationmarks_softwarePackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl <em>APS Req Software Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareSeedModifications()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Method Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Property Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Function Block Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Method Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__METHOD_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Property Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Function Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Program Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>APS Req Software Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl <em>APS Req Software Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareModificationRepository()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = IECModificationmarksPackage.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = IECModificationmarksPackage.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>APS Req Software Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY_FEATURE_COUNT = IECModificationmarksPackage.ABSTRACT_KAMP4IEC_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl <em>APS Req Software Change Propagation Due To Specification Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Configuration Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Function Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Block Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Iec Interface Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract IEC Method Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Iec Method Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Abstract IEC Property Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Iec Property Modifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Iec Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>APS Req Software Change Propagation Due To Specification Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqModifyIECComponentImpl <em>APS Req Modify IEC Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqModifyIECComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqModifyIECComponent()
	 * @generated
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT__AFFECTED_ELEMENT = IECModificationmarksPackage.IEC_MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT__CAUSING_ELEMENTS = IECModificationmarksPackage.IEC_MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT__ID = IECModificationmarksPackage.IEC_MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT__TOOLDERIVED = IECModificationmarksPackage.IEC_MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT__USER_DECISION = IECModificationmarksPackage.IEC_MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify IEC Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_IEC_COMPONENT_FEATURE_COUNT = IECModificationmarksPackage.IEC_MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareSeedModifications <em>APS Req Software Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareSeedModifications
	 * @generated
	 */
	EClass getAPSReqSoftwareSeedModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareModificationRepository <em>APS Req Software Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareModificationRepository
	 * @generated
	 */
	EClass getAPSReqSoftwareModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies <em>APS Req Software Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Change Propagation Due To Specification Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	EClass getAPSReqSoftwareChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getConfigurationModifications <em>Configuration Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configuration Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getConfigurationModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ConfigurationModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getProgramModifications <em>Program Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Program Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getProgramModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ProgramModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getFunctionModifications <em>Function Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getFunctionModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getFunctionBlockModifications <em>Function Block Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Block Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getFunctionBlockModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionBlockModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getGlobalVariableModifications <em>Global Variable Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Global Variable Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getGlobalVariableModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_GlobalVariableModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecInterfaceModifications <em>Iec Interface Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Interface Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecInterfaceModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecInterfaceModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getAbstractIECMethodModifications <em>Abstract IEC Method Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract IEC Method Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getAbstractIECMethodModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECMethodModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecMethodModifications <em>Iec Method Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Method Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecMethodModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecMethodModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getAbstractIECPropertyModifications <em>Abstract IEC Property Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Abstract IEC Property Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getAbstractIECPropertyModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECPropertyModifications();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecPropertyModifications <em>Iec Property Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Property Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecPropertyModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecPropertyModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecComponentModifications <em>Iec Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iec Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecComponentModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyIECComponent <em>APS Req Modify IEC Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify IEC Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyIECComponent
	 * @generated
	 */
	EClass getAPSReqModifyIECComponent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Modificationmarks_softwareFactory getModificationmarks_softwareFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl <em>APS Req Software Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareSeedModifications()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_SEED_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareSeedModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl <em>APS Req Software Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareModificationRepository()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY = eINSTANCE.getAPSReqSoftwareModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl <em>APS Req Software Change Propagation Due To Specification Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies();

		/**
		 * The meta object literal for the '<em><b>Configuration Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ConfigurationModifications();

		/**
		 * The meta object literal for the '<em><b>Program Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ProgramModifications();

		/**
		 * The meta object literal for the '<em><b>Function Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionModifications();

		/**
		 * The meta object literal for the '<em><b>Function Block Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionBlockModifications();

		/**
		 * The meta object literal for the '<em><b>Global Variable Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_GlobalVariableModifications();

		/**
		 * The meta object literal for the '<em><b>Iec Interface Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecInterfaceModifications();

		/**
		 * The meta object literal for the '<em><b>Abstract IEC Method Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECMethodModifications();

		/**
		 * The meta object literal for the '<em><b>Iec Method Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecMethodModifications();

		/**
		 * The meta object literal for the '<em><b>Abstract IEC Property Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECPropertyModifications();

		/**
		 * The meta object literal for the '<em><b>Iec Property Modifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecPropertyModifications();

		/**
		 * The meta object literal for the '<em><b>Iec Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqModifyIECComponentImpl <em>APS Req Modify IEC Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqModifyIECComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqModifyIECComponent()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_IEC_COMPONENT = eINSTANCE.getAPSReqModifyIECComponent();

	}

} //Modificationmarks_softwarePackage
