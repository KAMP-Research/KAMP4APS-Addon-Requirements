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
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqHardwareOptionImpl <em>APS Req Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqHardwareOption()
	 * @generated
	 */
	int APS_REQ_HARDWARE_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>APS Req Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqIntroduceNewHardwareOptionImpl <em>APS Req Introduce New Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqIntroduceNewHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewHardwareOption()
	 * @generated
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__ENTITIES = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Introduce New Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqRemoveHardwareOptionImpl <em>APS Req Remove Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqRemoveHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveHardwareOption()
	 * @generated
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION__ENTITIES = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Remove Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqChangeHardwareOptionImpl <em>APS Req Change Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqChangeHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeHardwareOption()
	 * @generated
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION__ENTITIES = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Change Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqReplaceHardwareOptionImpl <em>APS Req Replace Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqReplaceHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceHardwareOption()
	 * @generated
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Replace Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqHardwareOption <em>APS Req Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqHardwareOption
	 * @generated
	 */
	EClass getAPSReqHardwareOption();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqIntroduceNewHardwareOption <em>APS Req Introduce New Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introduce New Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewHardwareOption
	 * @generated
	 */
	EClass getAPSReqIntroduceNewHardwareOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqIntroduceNewHardwareOption#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewHardwareOption#getEntities()
	 * @see #getAPSReqIntroduceNewHardwareOption()
	 * @generated
	 */
	EReference getAPSReqIntroduceNewHardwareOption_Entities();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqRemoveHardwareOption <em>APS Req Remove Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqRemoveHardwareOption
	 * @generated
	 */
	EClass getAPSReqRemoveHardwareOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqRemoveHardwareOption#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqRemoveHardwareOption#getEntities()
	 * @see #getAPSReqRemoveHardwareOption()
	 * @generated
	 */
	EReference getAPSReqRemoveHardwareOption_Entities();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqChangeHardwareOption <em>APS Req Change Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Change Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqChangeHardwareOption
	 * @generated
	 */
	EClass getAPSReqChangeHardwareOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqChangeHardwareOption#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqChangeHardwareOption#getEntities()
	 * @see #getAPSReqChangeHardwareOption()
	 * @generated
	 */
	EReference getAPSReqChangeHardwareOption_Entities();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqReplaceHardwareOption <em>APS Req Replace Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqReplaceHardwareOption
	 * @generated
	 */
	EClass getAPSReqReplaceHardwareOption();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceHardwareOption#getOldEntity <em>Old Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Entity</em>'.
	 * @see apshardwareoptions.APSReqReplaceHardwareOption#getOldEntity()
	 * @see #getAPSReqReplaceHardwareOption()
	 * @generated
	 */
	EReference getAPSReqReplaceHardwareOption_OldEntity();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceHardwareOption#getNewEntity <em>New Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Entity</em>'.
	 * @see apshardwareoptions.APSReqReplaceHardwareOption#getNewEntity()
	 * @see #getAPSReqReplaceHardwareOption()
	 * @generated
	 */
	EReference getAPSReqReplaceHardwareOption_NewEntity();

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
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqHardwareOptionImpl <em>APS Req Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_HARDWARE_OPTION = eINSTANCE.getAPSReqHardwareOption();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqIntroduceNewHardwareOptionImpl <em>APS Req Introduce New Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqIntroduceNewHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION = eINSTANCE.getAPSReqIntroduceNewHardwareOption();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__ENTITIES = eINSTANCE.getAPSReqIntroduceNewHardwareOption_Entities();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqRemoveHardwareOptionImpl <em>APS Req Remove Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqRemoveHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_HARDWARE_OPTION = eINSTANCE.getAPSReqRemoveHardwareOption();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REMOVE_HARDWARE_OPTION__ENTITIES = eINSTANCE.getAPSReqRemoveHardwareOption_Entities();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqChangeHardwareOptionImpl <em>APS Req Change Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqChangeHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_HARDWARE_OPTION = eINSTANCE.getAPSReqChangeHardwareOption();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_CHANGE_HARDWARE_OPTION__ENTITIES = eINSTANCE.getAPSReqChangeHardwareOption_Entities();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqReplaceHardwareOptionImpl <em>APS Req Replace Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqReplaceHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_HARDWARE_OPTION = eINSTANCE.getAPSReqReplaceHardwareOption();

		/**
		 * The meta object literal for the '<em><b>Old Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY = eINSTANCE.getAPSReqReplaceHardwareOption_OldEntity();

		/**
		 * The meta object literal for the '<em><b>New Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY = eINSTANCE.getAPSReqReplaceHardwareOption_NewEntity();

	}

} //ApshardwareoptionsPackage
