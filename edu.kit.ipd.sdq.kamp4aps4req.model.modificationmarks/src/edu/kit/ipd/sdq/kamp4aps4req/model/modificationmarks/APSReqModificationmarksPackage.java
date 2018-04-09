/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

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
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksFactory
 * @model kind="package"
 * @generated
 */
public interface APSReqModificationmarksPackage extends EPackage {
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
	String eNS_URI = "http://www.example.org//modificationmarks";

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
	APSReqModificationmarksPackage eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl <em>APS Req Modify Traceable Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyTraceableObject()
	 * @generated
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT = ModificationmarksPackage.ABSTRACT_MODIFICATION__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS = ModificationmarksPackage.ABSTRACT_MODIFICATION__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__ID = ModificationmarksPackage.ABSTRACT_MODIFICATION__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED = ModificationmarksPackage.ABSTRACT_MODIFICATION__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION = ModificationmarksPackage.ABSTRACT_MODIFICATION__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Traceable Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl <em>APS Req Modify Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyRequirement()
	 * @generated
	 */
	int APS_REQ_MODIFY_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__AFFECTED_ELEMENT = APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__CAUSING_ELEMENTS = APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__ID = APS_REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__TOOLDERIVED = APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT__USER_DECISION = APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_REQUIREMENT_FEATURE_COUNT = APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl <em>APS Req Modify Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyDecision()
	 * @generated
	 */
	int APS_REQ_MODIFY_DECISION = 2;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__AFFECTED_ELEMENT = APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__CAUSING_ELEMENTS = APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__ID = APS_REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__TOOLDERIVED = APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION__USER_DECISION = APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_DECISION_FEATURE_COUNT = APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl <em>APS Req Modify Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyOption()
	 * @generated
	 */
	int APS_REQ_MODIFY_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__AFFECTED_ELEMENT = APS_REQ_MODIFY_TRACEABLE_OBJECT__AFFECTED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Causing Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__CAUSING_ELEMENTS = APS_REQ_MODIFY_TRACEABLE_OBJECT__CAUSING_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__ID = APS_REQ_MODIFY_TRACEABLE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Toolderived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__TOOLDERIVED = APS_REQ_MODIFY_TRACEABLE_OBJECT__TOOLDERIVED;

	/**
	 * The feature id for the '<em><b>User Decision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION__USER_DECISION = APS_REQ_MODIFY_TRACEABLE_OBJECT__USER_DECISION;

	/**
	 * The number of structural features of the '<em>APS Req Modify Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODIFY_OPTION_FEATURE_COUNT = APS_REQ_MODIFY_TRACEABLE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractKAMP4aPS4ReqModificationRepositoryImpl <em>Abstract KAMP 4a PS4 Req Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractKAMP4aPS4ReqModificationRepositoryImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAbstractKAMP4aPS4ReqModificationRepository()
	 * @generated
	 */
	int ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>Abstract KAMP 4a PS4 Req Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl <em>APS Req Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqSeedModifications()
	 * @generated
	 */
	int APS_REQ_SEED_MODIFICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>APS Req Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_SEED_MODIFICATIONS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl <em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAbstractAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	int ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = 6;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES_FEATURE_COUNT = ModificationmarksPackage.CHANGE_PROPAGATION_STEP_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject <em>APS Req Modify Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify Traceable Object</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject
	 * @generated
	 */
	EClass getAPSReqModifyTraceableObject();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement <em>APS Req Modify Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify Requirement</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement
	 * @generated
	 */
	EClass getAPSReqModifyRequirement();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision <em>APS Req Modify Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify Decision</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision
	 * @generated
	 */
	EClass getAPSReqModifyDecision();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption <em>APS Req Modify Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Modify Option</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption
	 * @generated
	 */
	EClass getAPSReqModifyOption();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractKAMP4aPS4ReqModificationRepository <em>Abstract KAMP 4a PS4 Req Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract KAMP 4a PS4 Req Modification Repository</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractKAMP4aPS4ReqModificationRepository
	 * @generated
	 */
	EClass getAbstractKAMP4aPS4ReqModificationRepository();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications <em>APS Req Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Seed Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications
	 * @generated
	 */
	EClass getAPSReqSeedModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getRequirementModifications <em>Requirement Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getRequirementModifications()
	 * @see #getAPSReqSeedModifications()
	 * @generated
	 */
	EReference getAPSReqSeedModifications_RequirementModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getDecisionModifications <em>Decision Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getDecisionModifications()
	 * @see #getAPSReqSeedModifications()
	 * @generated
	 */
	EReference getAPSReqSeedModifications_DecisionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getOptionModifications <em>Option Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications#getOptionModifications()
	 * @see #getAPSReqSeedModifications()
	 * @generated
	 */
	EReference getAPSReqSeedModifications_OptionModifications();

	/**
	 * Returns the meta object for class '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies <em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	EClass getAbstractAPSReqChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies#getDecisionModifications <em>Decision Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies#getDecisionModifications()
	 * @see #getAbstractAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAbstractAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies#getRequirementModifications <em>Requirement Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies#getRequirementModifications()
	 * @see #getAbstractAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAbstractAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies#getOptionModifications <em>Option Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option Modifications</em>'.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies#getOptionModifications()
	 * @see #getAbstractAPSReqChangePropagationDueToSpecificationDependencies()
	 * @generated
	 */
	EReference getAbstractAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	APSReqModificationmarksFactory getAPSReqModificationmarksFactory();

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
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl <em>APS Req Modify Traceable Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyTraceableObjectImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyTraceableObject()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_TRACEABLE_OBJECT = eINSTANCE.getAPSReqModifyTraceableObject();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl <em>APS Req Modify Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyRequirementImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyRequirement()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_REQUIREMENT = eINSTANCE.getAPSReqModifyRequirement();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl <em>APS Req Modify Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyDecisionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyDecision()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_DECISION = eINSTANCE.getAPSReqModifyDecision();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl <em>APS Req Modify Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModifyOptionImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqModifyOption()
		 * @generated
		 */
		EClass APS_REQ_MODIFY_OPTION = eINSTANCE.getAPSReqModifyOption();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractKAMP4aPS4ReqModificationRepositoryImpl <em>Abstract KAMP 4a PS4 Req Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractKAMP4aPS4ReqModificationRepositoryImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAbstractKAMP4aPS4ReqModificationRepository()
		 * @generated
		 */
		EClass ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY = eINSTANCE.getAbstractKAMP4aPS4ReqModificationRepository();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl <em>APS Req Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAPSReqSeedModifications()
		 * @generated
		 */
		EClass APS_REQ_SEED_MODIFICATIONS = eINSTANCE.getAPSReqSeedModifications();

		/**
		 * The meta object literal for the '<em><b>Requirement Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = eINSTANCE.getAPSReqSeedModifications_RequirementModifications();

		/**
		 * The meta object literal for the '<em><b>Decision Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = eINSTANCE.getAPSReqSeedModifications_DecisionModifications();

		/**
		 * The meta object literal for the '<em><b>Option Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = eINSTANCE.getAPSReqSeedModifications_OptionModifications();

		/**
		 * The meta object literal for the '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl <em>Abstract APS Req Change Propagation Due To Specification Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl
		 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksPackageImpl#getAbstractAPSReqChangePropagationDueToSpecificationDependencies()
		 * @generated
		 */
		EClass ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES = eINSTANCE.getAbstractAPSReqChangePropagationDueToSpecificationDependencies();

		/**
		 * The meta object literal for the '<em><b>Decision Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS = eINSTANCE.getAbstractAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications();

		/**
		 * The meta object literal for the '<em><b>Requirement Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS = eINSTANCE.getAbstractAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications();

		/**
		 * The meta object literal for the '<em><b>Option Modifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS = eINSTANCE.getAbstractAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications();

	}

} //APSReqModificationmarksPackage
