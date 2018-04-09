/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;

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
 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface APSReqSoftwareModificationmarksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modificationmarks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	APSReqSoftwareModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl <em>APS Req Software Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqSoftwareSeedModifications()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Global Variable Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Abstract Method Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Abstract Property Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Function Block Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Method Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__METHOD_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Property Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Function Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Program Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>APS Req Software Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS_FEATURE_COUNT = IECModificationmarksPackage.IEC_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationRepositoryImpl <em>APS Req Software Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqSoftwareModificationRepository()
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
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl <em>APS Req Software Change Propagation Due To Specification Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
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
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Iec Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Software Change Propagation Due To Specification Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqModifyIECComponentImpl <em>APS Req Modify IEC Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqModifyIECComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqModifyIECComponent()
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
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareSeedModifications <em>APS Req Software Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareSeedModifications
	 * @generated
	 */
	EClass getAPSReqSoftwareSeedModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationRepository <em>APS Req Software Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationRepository
	 * @generated
	 */
	EClass getAPSReqSoftwareModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies <em>APS Req Software Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Change Propagation Due To Specification Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	EClass getAPSReqSoftwareChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecComponentModifications <em>Iec Component Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iec Component Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies#getIecComponentModifications()
	 * @see #getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqModifyIECComponent <em>APS Req Modify IEC Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify IEC Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqModifyIECComponent
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
	APSReqSoftwareModificationmarksFactory getAPSReqSoftwareModificationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl <em>APS Req Software Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqSoftwareSeedModifications()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_SEED_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareSeedModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationRepositoryImpl <em>APS Req Software Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqSoftwareModificationRepository()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY = eINSTANCE.getAPSReqSoftwareModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl <em>APS Req Software Change Propagation Due To Specification Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqSoftwareChangePropagationDueToSpecificationDependencies()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies();

		/**
		 * The meta object literal for the '<em><b>Iec Component Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqModifyIECComponentImpl <em>APS Req Modify IEC Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqModifyIECComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksPackageImpl#getAPSReqModifyIECComponent()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_IEC_COMPONENT = eINSTANCE.getAPSReqModifyIECComponent();

	}

} //APSReqSoftwareModificationmarksPackage
