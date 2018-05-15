/**
 */
package apshardwareoptions;

import apsoptions.ApsoptionsPackage;

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
 * @see apshardwareoptions.ApshardwareoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ApshardwareoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apshardwareoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/apshardwareoptions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apshardwareoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApshardwareoptionsPackage eINSTANCE = apshardwareoptions.impl.ApshardwareoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqStructureOptionImpl <em>APS Req Structure Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqStructureOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqStructureOption()
	 * @generated
	 */
	int APS_REQ_STRUCTURE_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION__STRUCTURES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Structure Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqModuleOptionImpl <em>APS Req Module Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqModuleOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqModuleOption()
	 * @generated
	 */
	int APS_REQ_MODULE_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION__MODULES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Module Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqComponentOptionImpl <em>APS Req Component Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqComponentOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqComponentOption()
	 * @generated
	 */
	int APS_REQ_COMPONENT_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION__COMPONENTS = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Component Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqInterfaceOptionImpl <em>APS Req Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqInterfaceOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqInterfaceOption()
	 * @generated
	 */
	int APS_REQ_INTERFACE_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION__INTERFACES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqStructureOption <em>APS Req Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Structure Option</em>'.
	 * @see apshardwareoptions.APSReqStructureOption
	 * @generated
	 */
	EClass getAPSReqStructureOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqStructureOption#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see apshardwareoptions.APSReqStructureOption#getStructures()
	 * @see #getAPSReqStructureOption()
	 * @generated
	 */
	EReference getAPSReqStructureOption_Structures();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqModuleOption <em>APS Req Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Module Option</em>'.
	 * @see apshardwareoptions.APSReqModuleOption
	 * @generated
	 */
	EClass getAPSReqModuleOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqModuleOption#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see apshardwareoptions.APSReqModuleOption#getModules()
	 * @see #getAPSReqModuleOption()
	 * @generated
	 */
	EReference getAPSReqModuleOption_Modules();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqComponentOption <em>APS Req Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Component Option</em>'.
	 * @see apshardwareoptions.APSReqComponentOption
	 * @generated
	 */
	EClass getAPSReqComponentOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqComponentOption#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see apshardwareoptions.APSReqComponentOption#getComponents()
	 * @see #getAPSReqComponentOption()
	 * @generated
	 */
	EReference getAPSReqComponentOption_Components();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqInterfaceOption <em>APS Req Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Interface Option</em>'.
	 * @see apshardwareoptions.APSReqInterfaceOption
	 * @generated
	 */
	EClass getAPSReqInterfaceOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqInterfaceOption#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see apshardwareoptions.APSReqInterfaceOption#getInterfaces()
	 * @see #getAPSReqInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqInterfaceOption_Interfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApshardwareoptionsFactory getApshardwareoptionsFactory();

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
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqStructureOptionImpl <em>APS Req Structure Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqStructureOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqStructureOption()
		 * @generated
		 */
		EClass APS_REQ_STRUCTURE_OPTION = eINSTANCE.getAPSReqStructureOption();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_STRUCTURE_OPTION__STRUCTURES = eINSTANCE.getAPSReqStructureOption_Structures();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqModuleOptionImpl <em>APS Req Module Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqModuleOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqModuleOption()
		 * @generated
		 */
		EClass APS_REQ_MODULE_OPTION = eINSTANCE.getAPSReqModuleOption();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_MODULE_OPTION__MODULES = eINSTANCE.getAPSReqModuleOption_Modules();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqComponentOptionImpl <em>APS Req Component Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqComponentOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqComponentOption()
		 * @generated
		 */
		EClass APS_REQ_COMPONENT_OPTION = eINSTANCE.getAPSReqComponentOption();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_COMPONENT_OPTION__COMPONENTS = eINSTANCE.getAPSReqComponentOption_Components();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqInterfaceOptionImpl <em>APS Req Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqInterfaceOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqInterfaceOption()
		 * @generated
		 */
		EClass APS_REQ_INTERFACE_OPTION = eINSTANCE.getAPSReqInterfaceOption();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTERFACE_OPTION__INTERFACES = eINSTANCE.getAPSReqInterfaceOption_Interfaces();

	}

} //ApshardwareoptionsPackage
