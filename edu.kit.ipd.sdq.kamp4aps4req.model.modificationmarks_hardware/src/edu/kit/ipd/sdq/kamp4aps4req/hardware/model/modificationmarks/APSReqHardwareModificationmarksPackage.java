/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface APSReqHardwareModificationmarksPackage extends EPackage {
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
	APSReqHardwareModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareSeedModificationsImpl <em>APS Req Hardware Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqHardwareSeedModifications()
	 * @generated
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Structure Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__STRUCTURE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Module Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__MODULE_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__MODULE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>APS Req Hardware Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_SEED_MODIFICATIONS_FEATURE_COUNT = KAMP4aPSModificationmarksPackage.KAMP_4A_PS_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationRepositoryImpl <em>APS Req Hardware Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqHardwareModificationRepository()
	 * @generated
	 */
	int APS_REQ_HARDWARE_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = KAMP4aPSModificationmarksPackage.ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = KAMP4aPSModificationmarksPackage.ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>APS Req Hardware Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_MODIFICATION_REPOSITORY_FEATURE_COUNT = KAMP4aPSModificationmarksPackage.ABSTRACT_KAMP_4A_PS_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl <em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqHardwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	int APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Entity Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT = APSReqModificationmarksPackage.ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqModifyEntityImpl <em>APS Req Modify Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqModifyEntityImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqModifyEntity()
	 * @generated
	 */
	int APS_REQ_MODIFY_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_ENTITY__AFFECTED_ELEMENT = KAMP4aPSModificationmarksPackage.MODIFY_ENTITY__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_ENTITY__CAUSING_ELEMENTS = KAMP4aPSModificationmarksPackage.MODIFY_ENTITY__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_ENTITY__ID = KAMP4aPSModificationmarksPackage.MODIFY_ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_ENTITY__TOOLDERIVED = KAMP4aPSModificationmarksPackage.MODIFY_ENTITY__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_ENTITY__USER_DECISION = KAMP4aPSModificationmarksPackage.MODIFY_ENTITY__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_ENTITY_FEATURE_COUNT = KAMP4aPSModificationmarksPackage.MODIFY_ENTITY_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareSeedModifications <em>APS Req Hardware Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Hardware Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareSeedModifications
	 * @generated
	 */
	EClass getAPSReqHardwareSeedModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationRepository <em>APS Req Hardware Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Hardware Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationRepository
	 * @generated
	 */
	EClass getAPSReqHardwareModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies <em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	EClass getAPSReqHardwareChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies#getEntityModifications <em>Entity Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies#getEntityModifications()
	 * @see #getAPSReqHardwareChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqHardwareChangePropagationDueToSpecificationDependencies_EntityModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqModifyEntity <em>APS Req Modify Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify Entity</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqModifyEntity
	 * @generated
	 */
	EClass getAPSReqModifyEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	APSReqHardwareModificationmarksFactory getAPSReqHardwareModificationmarksFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareSeedModificationsImpl <em>APS Req Hardware Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqHardwareSeedModifications()
		 * @generated
		 */
		EClass APS_REQ_HARDWARE_SEED_MODIFICATIONS = eINSTANCE.getAPSReqHardwareSeedModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationRepositoryImpl <em>APS Req Hardware Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqHardwareModificationRepository()
		 * @generated
		 */
		EClass APS_REQ_HARDWARE_MODIFICATION_REPOSITORY = eINSTANCE.getAPSReqHardwareModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl <em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqHardwareChangePropagationDueToSpecificationDependencies()
		 * @generated
		 */
		EClass APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = eINSTANCE.getAPSReqHardwareChangePropagationDueToSpecificationDependencies();

		/**
		 * The meta object literal for the '<em><b>Entity Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS = eINSTANCE.getAPSReqHardwareChangePropagationDueToSpecificationDependencies_EntityModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqModifyEntityImpl <em>APS Req Modify Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqModifyEntityImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl.APSReqHardwareModificationmarksPackageImpl#getAPSReqModifyEntity()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_ENTITY = eINSTANCE.getAPSReqModifyEntity();

	}

} //APSReqHardwareModificationmarksPackage
