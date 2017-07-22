/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface APSReqModificationmarksPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "modificationmarks";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.kit.edu/KAMP4APS4ReqModificationmarks/1.0";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	APSReqModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl
			.init();

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationRepositoryImpl
	 * <em>APS Req Modification Repository</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModificationRepository()
	 * @generated
	 */
	int APS_REQ_MODIFICATION_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = modificationmarksPackage.ABSTRACT_KAPS_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = modificationmarksPackage.ABSTRACT_KAPS_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>APS Req Modification
	 * Repository</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFICATION_REPOSITORY_FEATURE_COUNT = modificationmarksPackage.ABSTRACT_KAPS_MODIFICATION_REPOSITORY_FEATURE_COUNT
			+ 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl
	 * <em>APS Req Seed Modifications</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqSeedModifications()
	 * @generated
	 */
	int APS_REQ_SEED_MODIFICATIONS = 1;

	/**
	 * The feature id for the '<em><b>Bus Box Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_BOX_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Sensor Modifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS__SENSOR_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Bus Master Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_MASTER_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Bus Slave Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS__BUS_SLAVE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Microswitch Module Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS__MICROSWITCH_MODULE_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = modificationmarksPackage.KAPS_SEED_MODIFICATIONS_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>APS Req Seed
	 * Modifications</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT = modificationmarksPackage.KAPS_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl
	 * <em>APS Req Change Propagation Due To Specification Dependencies</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = 2;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Component Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 3;

	/**
	 * The feature id for the '<em><b>Module Modifications</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 4;

	/**
	 * The feature id for the '<em><b>Structure Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 5;

	/**
	 * The feature id for the '<em><b>Interface Modifications</b></em>'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 6;

	/**
	 * The number of structural features of the '<em>APS Req Change Propagation
	 * Due To Specification Dependencies</em>' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT
			+ 7;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl
	 * <em>APS Req Modify Traceable Object</em>}' class. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyTraceableObject()
	 * @generated
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Traceable
	 * Object</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT
			+ 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyComponentImpl
	 * <em>APS Req Modify Component</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyComponentImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyComponent()
	 * @generated
	 */
	int APS_REQ_MODIFY_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_COMPONENT__AFFECTED_ELEMENT = modificationmarksPackage.MODIFY_COMPONENT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_COMPONENT__CAUSING_ELEMENTS = modificationmarksPackage.MODIFY_COMPONENT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_COMPONENT__ID = modificationmarksPackage.MODIFY_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_COMPONENT__TOOLDERIVED = modificationmarksPackage.MODIFY_COMPONENT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_COMPONENT__USER_DECISION = modificationmarksPackage.MODIFY_COMPONENT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify
	 * Component</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_COMPONENT_FEATURE_COUNT = modificationmarksPackage.MODIFY_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyModuleImpl
	 * <em>APS Req Modify Module</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyModuleImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyModule()
	 * @generated
	 */
	int APS_REQ_MODIFY_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_MODULE__AFFECTED_ELEMENT = modificationmarksPackage.MODIFY_MODULE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_MODULE__CAUSING_ELEMENTS = modificationmarksPackage.MODIFY_MODULE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_MODULE__ID = modificationmarksPackage.MODIFY_MODULE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_MODULE__TOOLDERIVED = modificationmarksPackage.MODIFY_MODULE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_MODULE__USER_DECISION = modificationmarksPackage.MODIFY_MODULE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Module</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_MODULE_FEATURE_COUNT = modificationmarksPackage.MODIFY_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyStructureImpl
	 * <em>APS Req Modify Structure</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyStructureImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyStructure()
	 * @generated
	 */
	int APS_REQ_MODIFY_STRUCTURE = 6;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_STRUCTURE__AFFECTED_ELEMENT = modificationmarksPackage.MODIFY_STRUCTURE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_STRUCTURE__CAUSING_ELEMENTS = modificationmarksPackage.MODIFY_STRUCTURE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_STRUCTURE__ID = modificationmarksPackage.MODIFY_STRUCTURE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_STRUCTURE__TOOLDERIVED = modificationmarksPackage.MODIFY_STRUCTURE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_STRUCTURE__USER_DECISION = modificationmarksPackage.MODIFY_STRUCTURE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify
	 * Structure</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_STRUCTURE_FEATURE_COUNT = modificationmarksPackage.MODIFY_STRUCTURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyInterfaceImpl
	 * <em>APS Req Modify Interface</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyInterfaceImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyInterface()
	 * @generated
	 */
	int APS_REQ_MODIFY_INTERFACE = 7;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_INTERFACE__AFFECTED_ELEMENT = modificationmarksPackage.MODIFY_INTERFACE__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_INTERFACE__CAUSING_ELEMENTS = modificationmarksPackage.MODIFY_INTERFACE__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_INTERFACE__ID = modificationmarksPackage.MODIFY_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_INTERFACE__TOOLDERIVED = modificationmarksPackage.MODIFY_INTERFACE__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_INTERFACE__USER_DECISION = modificationmarksPackage.MODIFY_INTERFACE__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify
	 * Interface</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_INTERFACE_FEATURE_COUNT = modificationmarksPackage.MODIFY_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl
	 * <em>APS Req Modify Requirement</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyRequirement()
	 * @generated
	 */
	int APS_REQ_MODIFY_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__AFFECTED_ELEMENT = APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__CAUSING_ELEMENTS = APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__ID = APS_REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__TOOLDERIVED = APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__USER_DECISION = APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify
	 * Requirement</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT_FEATURE_COUNT = APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl
	 * <em>APS Req Modify Decision</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyDecision()
	 * @generated
	 */
	int APS_REQ_MODIFY_DECISION = 9;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__AFFECTED_ELEMENT = APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__CAUSING_ELEMENTS = APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__ID = APS_REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__TOOLDERIVED = APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__USER_DECISION = APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify
	 * Decision</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION_FEATURE_COUNT = APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl
	 * <em>APS Req Modify Option</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyOption()
	 * @generated
	 */
	int APS_REQ_MODIFY_OPTION = 10;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__AFFECTED_ELEMENT = APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__CAUSING_ELEMENTS = APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__ID = APS_REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__TOOLDERIVED = APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__USER_DECISION = APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Option</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION_FEATURE_COUNT = APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationRepository
	 * <em>APS Req Modification Repository</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modification
	 *         Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationRepository
	 * @generated
	 */
	EClass getAPSReqModificationRepository();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications
	 * <em>APS Req Seed Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications
	 * @generated
	 */
	EClass getAPSReqSeedModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getRequirementModifications
	 * <em>Requirement Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Requirement Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getRequirementModifications()
	 * @see #getAPSReqSeedModifications()
	 * @generated
	 */
	EReference getAPSReqSeedModifications_RequirementModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getDecisionModifications
	 * <em>Decision Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Decision
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getDecisionModifications()
	 * @see #getAPSReqSeedModifications()
	 * @generated
	 */
	EReference getAPSReqSeedModifications_DecisionModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getOptionModifications
	 * <em>Option Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Option
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getOptionModifications()
	 * @see #getAPSReqSeedModifications()
	 * @generated
	 */
	EReference getAPSReqSeedModifications_OptionModifications();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies
	 * <em>APS Req Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Change Propagation Due To
	 *         Specification Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	EClass getAPSReqChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getDecisionModifications
	 * <em>Decision Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Decision
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getDecisionModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getOptionModifications
	 * <em>Option Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Option
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getOptionModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getRequirementModifications
	 * <em>Requirement Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list
	 *         '<em>Requirement Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getRequirementModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getComponentModifications
	 * <em>Component Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Component
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getComponentModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_ComponentModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getModuleModifications
	 * <em>Module Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Module
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getModuleModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_ModuleModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getStructureModifications
	 * <em>Structure Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Structure
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getStructureModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_StructureModifications();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getInterfaceModifications
	 * <em>Interface Modifications</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Interface
	 *         Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies#getInterfaceModifications()
	 * @see #getAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAPSReqChangePropagationDueToSpecificationDependencies_InterfaceModifications();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject
	 * <em>APS Req Modify Traceable Object</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Traceable
	 *         Object</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject
	 * @generated
	 */
	EClass getAPSReqModifyTraceableObject();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent
	 * <em>APS Req Modify Component</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Component</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent
	 * @generated
	 */
	EClass getAPSReqModifyComponent();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule
	 * <em>APS Req Modify Module</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Module</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule
	 * @generated
	 */
	EClass getAPSReqModifyModule();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure
	 * <em>APS Req Modify Structure</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Structure</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure
	 * @generated
	 */
	EClass getAPSReqModifyStructure();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface
	 * <em>APS Req Modify Interface</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Interface</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface
	 * @generated
	 */
	EClass getAPSReqModifyInterface();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement
	 * <em>APS Req Modify Requirement</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Requirement</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement
	 * @generated
	 */
	EClass getAPSReqModifyRequirement();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision
	 * <em>APS Req Modify Decision</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Decision</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision
	 * @generated
	 */
	EClass getAPSReqModifyDecision();

	/**
	 * Returns the meta object for class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption
	 * <em>APS Req Modify Option</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for class '<em>APS Req Modify Option</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption
	 * @generated
	 */
	EClass getAPSReqModifyOption();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	APSReqModificationmarksFactory getAPSReqModificationmarksFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationRepositoryImpl
		 * <em>APS Req Modification Repository</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModificationRepository()
		 * @generated
		 */
		EClass APS_REQ_MODIFICATION_REPOSITORY = eINSTANCE.getAPSReqModificationRepository();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl
		 * <em>APS Req Seed Modifications</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqSeedModifications()
		 * @generated
		 */
		EClass APS_REQ_SEED_MODIFICATIONS = eINSTANCE.getAPSReqSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Requirement
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = eINSTANCE
				.getAPSReqSeedModifications_RequirementModifications();

		/**
		 * The meta object literal for the '<em><b>Decision
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = eINSTANCE
				.getAPSReqSeedModifications_DecisionModifications();

		/**
		 * The meta object literal for the '<em><b>Option
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = eINSTANCE
				.getAPSReqSeedModifications_OptionModifications();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl
		 * <em>APS Req Change Propagation Due To Specification
		 * Dependencies</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqChangePropagationDueToSpecificationDependencies()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies();

		/**
		 * The meta object literal for the '<em><b>Decision
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications();

		/**
		 * The meta object literal for the '<em><b>Option
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications();

		/**
		 * The meta object literal for the '<em><b>Requirement
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications();

		/**
		 * The meta object literal for the '<em><b>Component
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_ComponentModifications();

		/**
		 * The meta object literal for the '<em><b>Module
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_ModuleModifications();

		/**
		 * The meta object literal for the '<em><b>Structure
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_StructureModifications();

		/**
		 * The meta object literal for the '<em><b>Interface
		 * Modifications</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS = eINSTANCE
				.getAPSReqChangePropagationDueToSpecificationDependencies_InterfaceModifications();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl
		 * <em>APS Req Modify Traceable Object</em>}' class. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyTraceableObject()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_TRACEABLE_OBJECT = eINSTANCE.getAPSReqModifyTraceableObject();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyComponentImpl
		 * <em>APS Req Modify Component</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyComponentImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyComponent()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_COMPONENT = eINSTANCE.getAPSReqModifyComponent();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyModuleImpl
		 * <em>APS Req Modify Module</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyModuleImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyModule()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_MODULE = eINSTANCE.getAPSReqModifyModule();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyStructureImpl
		 * <em>APS Req Modify Structure</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyStructureImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyStructure()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_STRUCTURE = eINSTANCE.getAPSReqModifyStructure();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyInterfaceImpl
		 * <em>APS Req Modify Interface</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyInterfaceImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyInterface()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_INTERFACE = eINSTANCE.getAPSReqModifyInterface();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl
		 * <em>APS Req Modify Requirement</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyRequirement()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_REQUIREMENT = eINSTANCE.getAPSReqModifyRequirement();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl
		 * <em>APS Req Modify Decision</em>}' class. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyDecision()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_DECISION = eINSTANCE.getAPSReqModifyDecision();

		/**
		 * The meta object literal for the
		 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl
		 * <em>APS Req Modify Option</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyOption()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_OPTION = eINSTANCE.getAPSReqModifyOption();

	}

} // APSReqModificationmarksPackage
