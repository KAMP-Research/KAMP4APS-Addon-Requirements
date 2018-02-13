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
 *   <li>each operation of each class,</li>
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
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqStructureHardwareOptionImpl <em>APS Req Structure Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqStructureHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqStructureHardwareOption()
	 * @generated
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>APS Req Structure Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqIntroduceNewStructureOptionImpl <em>APS Req Introduce New Structure Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqIntroduceNewStructureOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewStructureOption()
	 * @generated
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__ID = APS_REQ_STRUCTURE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__RELATIONS = APS_REQ_STRUCTURE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__CONFLICTS_WITH = APS_REQ_STRUCTURE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__HAS_CONFLICTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__DUPLICATE_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__HAS_DUPLICATES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__DEPENDS_ON = APS_REQ_STRUCTURE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__HAS_DEPENDENTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__PARENT_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__SUBPART_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__TRIGGER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__TRIGGERED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__RESOLVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__ALTERNATIVE_TO = APS_REQ_STRUCTURE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__HAS_ALTERNATIVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__COULD_RESOLVE = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__STAKEHOLDER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__HAS_STAKEHOLDERS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__SELECTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__SELECTED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__DESCRIPTION = APS_REQ_STRUCTURE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__KEYWORDS = APS_REQ_STRUCTURE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__REPOSITORY = APS_REQ_STRUCTURE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__IS_MODELLED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__IS_IMPLEMENTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__TIME_STAMP = APS_REQ_STRUCTURE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__EFFECTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__USED_TERMS = APS_REQ_STRUCTURE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__ANALYSIS_RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__STRUCTURES = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Introduce New Structure Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION_FEATURE_COUNT = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqChangeStructureOptionImpl <em>APS Req Change Structure Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqChangeStructureOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeStructureOption()
	 * @generated
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__ID = APS_REQ_STRUCTURE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__RELATIONS = APS_REQ_STRUCTURE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__CONFLICTS_WITH = APS_REQ_STRUCTURE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__HAS_CONFLICTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__DUPLICATE_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__HAS_DUPLICATES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__DEPENDS_ON = APS_REQ_STRUCTURE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__HAS_DEPENDENTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__PARENT_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__SUBPART_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__TRIGGER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__TRIGGERED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__RESOLVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__ALTERNATIVE_TO = APS_REQ_STRUCTURE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__HAS_ALTERNATIVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__COULD_RESOLVE = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__STAKEHOLDER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__HAS_STAKEHOLDERS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__SELECTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__SELECTED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__DESCRIPTION = APS_REQ_STRUCTURE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__KEYWORDS = APS_REQ_STRUCTURE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__REPOSITORY = APS_REQ_STRUCTURE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__IS_MODELLED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__IS_IMPLEMENTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__TIME_STAMP = APS_REQ_STRUCTURE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__EFFECTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__USED_TERMS = APS_REQ_STRUCTURE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__ANALYSIS_RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION__STRUCTURES = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Change Structure Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_STRUCTURE_OPTION_FEATURE_COUNT = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqRemoveStructureOptionImpl <em>APS Req Remove Structure Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqRemoveStructureOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveStructureOption()
	 * @generated
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__ID = APS_REQ_STRUCTURE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__RELATIONS = APS_REQ_STRUCTURE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__CONFLICTS_WITH = APS_REQ_STRUCTURE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__HAS_CONFLICTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__DUPLICATE_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__HAS_DUPLICATES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__DEPENDS_ON = APS_REQ_STRUCTURE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__HAS_DEPENDENTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__PARENT_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__SUBPART_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__TRIGGER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__TRIGGERED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__RESOLVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__ALTERNATIVE_TO = APS_REQ_STRUCTURE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__HAS_ALTERNATIVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__COULD_RESOLVE = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__STAKEHOLDER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__HAS_STAKEHOLDERS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__SELECTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__SELECTED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__DESCRIPTION = APS_REQ_STRUCTURE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__KEYWORDS = APS_REQ_STRUCTURE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__REPOSITORY = APS_REQ_STRUCTURE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__IS_MODELLED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__IS_IMPLEMENTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__TIME_STAMP = APS_REQ_STRUCTURE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__EFFECTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__USED_TERMS = APS_REQ_STRUCTURE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__ANALYSIS_RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION__STRUCTURES = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Remove Structure Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_STRUCTURE_OPTION_FEATURE_COUNT = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqReplaceStructureOptionImpl <em>APS Req Replace Structure Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqReplaceStructureOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceStructureOption()
	 * @generated
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__ID = APS_REQ_STRUCTURE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__RELATIONS = APS_REQ_STRUCTURE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__CONFLICTS_WITH = APS_REQ_STRUCTURE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__HAS_CONFLICTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__DUPLICATE_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__HAS_DUPLICATES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__DEPENDS_ON = APS_REQ_STRUCTURE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__HAS_DEPENDENTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__PARENT_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__SUBPART_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__TRIGGER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__TRIGGERED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__RESOLVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__ALTERNATIVE_TO = APS_REQ_STRUCTURE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__HAS_ALTERNATIVES = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__COULD_RESOLVE = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__STAKEHOLDER_OF = APS_REQ_STRUCTURE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__HAS_STAKEHOLDERS = APS_REQ_STRUCTURE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__SELECTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__SELECTED_BY = APS_REQ_STRUCTURE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__DESCRIPTION = APS_REQ_STRUCTURE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__KEYWORDS = APS_REQ_STRUCTURE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__REPOSITORY = APS_REQ_STRUCTURE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__IS_MODELLED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__IS_IMPLEMENTED = APS_REQ_STRUCTURE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__TIME_STAMP = APS_REQ_STRUCTURE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__EFFECTS = APS_REQ_STRUCTURE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__USED_TERMS = APS_REQ_STRUCTURE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__ANALYSIS_RATIONALE = APS_REQ_STRUCTURE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Replace Structure Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_STRUCTURE_OPTION_FEATURE_COUNT = APS_REQ_STRUCTURE_HARDWARE_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqModuleHardwareOptionImpl <em>APS Req Module Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqModuleHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqModuleHardwareOption()
	 * @generated
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>APS Req Module Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqIntroduceNewModuleOptionImpl <em>APS Req Introduce New Module Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqIntroduceNewModuleOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewModuleOption()
	 * @generated
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__ID = APS_REQ_MODULE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__RELATIONS = APS_REQ_MODULE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__CONFLICTS_WITH = APS_REQ_MODULE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__HAS_CONFLICTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__DUPLICATE_OF = APS_REQ_MODULE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__HAS_DUPLICATES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__DEPENDS_ON = APS_REQ_MODULE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__HAS_DEPENDENTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__PARENT_OF = APS_REQ_MODULE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__SUBPART_OF = APS_REQ_MODULE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__TRIGGER_OF = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__TRIGGERED_BY = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__RESOLVES = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__ALTERNATIVE_TO = APS_REQ_MODULE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__HAS_ALTERNATIVES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__COULD_RESOLVE = APS_REQ_MODULE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__STAKEHOLDER_OF = APS_REQ_MODULE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__HAS_STAKEHOLDERS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__SELECTED = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__SELECTED_BY = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__DESCRIPTION = APS_REQ_MODULE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__KEYWORDS = APS_REQ_MODULE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__REPOSITORY = APS_REQ_MODULE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__IS_MODELLED = APS_REQ_MODULE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__IS_IMPLEMENTED = APS_REQ_MODULE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__TIME_STAMP = APS_REQ_MODULE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__EFFECTS = APS_REQ_MODULE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__USED_TERMS = APS_REQ_MODULE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__ANALYSIS_RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION__MODULES = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Introduce New Module Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_MODULE_OPTION_FEATURE_COUNT = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqRemoveModuleOptionImpl <em>APS Req Remove Module Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqRemoveModuleOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveModuleOption()
	 * @generated
	 */
	int APS_REQ_REMOVE_MODULE_OPTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__ID = APS_REQ_MODULE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__RELATIONS = APS_REQ_MODULE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__CONFLICTS_WITH = APS_REQ_MODULE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__HAS_CONFLICTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__DUPLICATE_OF = APS_REQ_MODULE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__HAS_DUPLICATES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__DEPENDS_ON = APS_REQ_MODULE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__HAS_DEPENDENTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__PARENT_OF = APS_REQ_MODULE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__SUBPART_OF = APS_REQ_MODULE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__TRIGGER_OF = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__TRIGGERED_BY = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__RESOLVES = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__ALTERNATIVE_TO = APS_REQ_MODULE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__HAS_ALTERNATIVES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__COULD_RESOLVE = APS_REQ_MODULE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__STAKEHOLDER_OF = APS_REQ_MODULE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__HAS_STAKEHOLDERS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__SELECTED = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__SELECTED_BY = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__DESCRIPTION = APS_REQ_MODULE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__KEYWORDS = APS_REQ_MODULE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__REPOSITORY = APS_REQ_MODULE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__IS_MODELLED = APS_REQ_MODULE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__IS_IMPLEMENTED = APS_REQ_MODULE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__TIME_STAMP = APS_REQ_MODULE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__EFFECTS = APS_REQ_MODULE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__USED_TERMS = APS_REQ_MODULE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__ANALYSIS_RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION__MODULES = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Remove Module Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_MODULE_OPTION_FEATURE_COUNT = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqChangeModuleOptionImpl <em>APS Req Change Module Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqChangeModuleOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeModuleOption()
	 * @generated
	 */
	int APS_REQ_CHANGE_MODULE_OPTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__ID = APS_REQ_MODULE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__RELATIONS = APS_REQ_MODULE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__CONFLICTS_WITH = APS_REQ_MODULE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__HAS_CONFLICTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__DUPLICATE_OF = APS_REQ_MODULE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__HAS_DUPLICATES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__DEPENDS_ON = APS_REQ_MODULE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__HAS_DEPENDENTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__PARENT_OF = APS_REQ_MODULE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__SUBPART_OF = APS_REQ_MODULE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__TRIGGER_OF = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__TRIGGERED_BY = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__RESOLVES = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__ALTERNATIVE_TO = APS_REQ_MODULE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__HAS_ALTERNATIVES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__COULD_RESOLVE = APS_REQ_MODULE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__STAKEHOLDER_OF = APS_REQ_MODULE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__HAS_STAKEHOLDERS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__SELECTED = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__SELECTED_BY = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__DESCRIPTION = APS_REQ_MODULE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__KEYWORDS = APS_REQ_MODULE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__REPOSITORY = APS_REQ_MODULE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__IS_MODELLED = APS_REQ_MODULE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__IS_IMPLEMENTED = APS_REQ_MODULE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__TIME_STAMP = APS_REQ_MODULE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__EFFECTS = APS_REQ_MODULE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__USED_TERMS = APS_REQ_MODULE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__ANALYSIS_RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION__MODULES = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Change Module Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_MODULE_OPTION_FEATURE_COUNT = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqReplaceModuleOptionImpl <em>APS Req Replace Module Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqReplaceModuleOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceModuleOption()
	 * @generated
	 */
	int APS_REQ_REPLACE_MODULE_OPTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__ID = APS_REQ_MODULE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__RELATIONS = APS_REQ_MODULE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__CONFLICTS_WITH = APS_REQ_MODULE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__HAS_CONFLICTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__DUPLICATE_OF = APS_REQ_MODULE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__HAS_DUPLICATES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__DEPENDS_ON = APS_REQ_MODULE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__HAS_DEPENDENTS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__PARENT_OF = APS_REQ_MODULE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__SUBPART_OF = APS_REQ_MODULE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__TRIGGER_OF = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__TRIGGERED_BY = APS_REQ_MODULE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__RESOLVES = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__ALTERNATIVE_TO = APS_REQ_MODULE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__HAS_ALTERNATIVES = APS_REQ_MODULE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__COULD_RESOLVE = APS_REQ_MODULE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_MODULE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__STAKEHOLDER_OF = APS_REQ_MODULE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__HAS_STAKEHOLDERS = APS_REQ_MODULE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__SELECTED = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__SELECTED_BY = APS_REQ_MODULE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__DESCRIPTION = APS_REQ_MODULE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__KEYWORDS = APS_REQ_MODULE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__REPOSITORY = APS_REQ_MODULE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__IS_MODELLED = APS_REQ_MODULE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__IS_IMPLEMENTED = APS_REQ_MODULE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__TIME_STAMP = APS_REQ_MODULE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__EFFECTS = APS_REQ_MODULE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__USED_TERMS = APS_REQ_MODULE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__ANALYSIS_RATIONALE = APS_REQ_MODULE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Replace Module Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_MODULE_OPTION_FEATURE_COUNT = APS_REQ_MODULE_HARDWARE_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqComponentHardwareOptionImpl <em>APS Req Component Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqComponentHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqComponentHardwareOption()
	 * @generated
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>APS Req Component Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqIntroduceNewComponentOptionImpl <em>APS Req Introduce New Component Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqIntroduceNewComponentOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewComponentOption()
	 * @generated
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__ID = APS_REQ_COMPONENT_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__RELATIONS = APS_REQ_COMPONENT_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__CONFLICTS_WITH = APS_REQ_COMPONENT_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__HAS_CONFLICTS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__DUPLICATE_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__HAS_DUPLICATES = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__DEPENDS_ON = APS_REQ_COMPONENT_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__HAS_DEPENDENTS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__PARENT_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__SUBPART_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__TRIGGER_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__TRIGGERED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__RESOLVES = APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__RESOLVED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__ALTERNATIVE_TO = APS_REQ_COMPONENT_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__HAS_ALTERNATIVES = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__COULD_RESOLVE = APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__STAKEHOLDER_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__HAS_STAKEHOLDERS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__SELECTED = APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__SELECTED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__DESCRIPTION = APS_REQ_COMPONENT_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__KEYWORDS = APS_REQ_COMPONENT_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__REPOSITORY = APS_REQ_COMPONENT_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__RATIONALE = APS_REQ_COMPONENT_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__IS_MODELLED = APS_REQ_COMPONENT_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__IS_IMPLEMENTED = APS_REQ_COMPONENT_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__TIME_STAMP = APS_REQ_COMPONENT_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__EFFECTS = APS_REQ_COMPONENT_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__USED_TERMS = APS_REQ_COMPONENT_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__ANALYSIS_RATIONALE = APS_REQ_COMPONENT_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__COMPONENTS = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Introduce New Component Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION_FEATURE_COUNT = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqRemoveComponentOptionImpl <em>APS Req Remove Component Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqRemoveComponentOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveComponentOption()
	 * @generated
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__ID = APS_REQ_COMPONENT_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__RELATIONS = APS_REQ_COMPONENT_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__CONFLICTS_WITH = APS_REQ_COMPONENT_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__HAS_CONFLICTS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__DUPLICATE_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__HAS_DUPLICATES = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__DEPENDS_ON = APS_REQ_COMPONENT_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__HAS_DEPENDENTS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__PARENT_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__SUBPART_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__TRIGGER_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__TRIGGERED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__RESOLVES = APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__RESOLVED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__ALTERNATIVE_TO = APS_REQ_COMPONENT_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__HAS_ALTERNATIVES = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__COULD_RESOLVE = APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__STAKEHOLDER_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__HAS_STAKEHOLDERS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__SELECTED = APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__SELECTED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__DESCRIPTION = APS_REQ_COMPONENT_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__KEYWORDS = APS_REQ_COMPONENT_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__REPOSITORY = APS_REQ_COMPONENT_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__RATIONALE = APS_REQ_COMPONENT_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__IS_MODELLED = APS_REQ_COMPONENT_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__IS_IMPLEMENTED = APS_REQ_COMPONENT_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__TIME_STAMP = APS_REQ_COMPONENT_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__EFFECTS = APS_REQ_COMPONENT_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__USED_TERMS = APS_REQ_COMPONENT_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__ANALYSIS_RATIONALE = APS_REQ_COMPONENT_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION__COMPONENTS = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Remove Component Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_COMPONENT_OPTION_FEATURE_COUNT = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqReplaceComponentOptionImpl <em>APS Req Replace Component Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqReplaceComponentOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceComponentOption()
	 * @generated
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__ID = APS_REQ_COMPONENT_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__RELATIONS = APS_REQ_COMPONENT_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__CONFLICTS_WITH = APS_REQ_COMPONENT_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__HAS_CONFLICTS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__DUPLICATE_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__HAS_DUPLICATES = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__DEPENDS_ON = APS_REQ_COMPONENT_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__HAS_DEPENDENTS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__PARENT_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__SUBPART_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__TRIGGER_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__TRIGGERED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__RESOLVES = APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__RESOLVED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__ALTERNATIVE_TO = APS_REQ_COMPONENT_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__HAS_ALTERNATIVES = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__COULD_RESOLVE = APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__STAKEHOLDER_OF = APS_REQ_COMPONENT_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__HAS_STAKEHOLDERS = APS_REQ_COMPONENT_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__SELECTED = APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__SELECTED_BY = APS_REQ_COMPONENT_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__DESCRIPTION = APS_REQ_COMPONENT_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__KEYWORDS = APS_REQ_COMPONENT_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__REPOSITORY = APS_REQ_COMPONENT_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__RATIONALE = APS_REQ_COMPONENT_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__IS_MODELLED = APS_REQ_COMPONENT_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__IS_IMPLEMENTED = APS_REQ_COMPONENT_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__TIME_STAMP = APS_REQ_COMPONENT_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__EFFECTS = APS_REQ_COMPONENT_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__USED_TERMS = APS_REQ_COMPONENT_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__ANALYSIS_RATIONALE = APS_REQ_COMPONENT_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Replace Component Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_COMPONENT_OPTION_FEATURE_COUNT = APS_REQ_COMPONENT_HARDWARE_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqInterfaceHardwareOptionImpl <em>APS Req Interface Hardware Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqInterfaceHardwareOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqInterfaceHardwareOption()
	 * @generated
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>APS Req Interface Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqIntroduceNewInterfaceOptionImpl <em>APS Req Introduce New Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqIntroduceNewInterfaceOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewInterfaceOption()
	 * @generated
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__ID = APS_REQ_INTERFACE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__RELATIONS = APS_REQ_INTERFACE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__CONFLICTS_WITH = APS_REQ_INTERFACE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__HAS_CONFLICTS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__DUPLICATE_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__HAS_DUPLICATES = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__DEPENDS_ON = APS_REQ_INTERFACE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__HAS_DEPENDENTS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__PARENT_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__SUBPART_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__TRIGGER_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__TRIGGERED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__RESOLVES = APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__RESOLVED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__ALTERNATIVE_TO = APS_REQ_INTERFACE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__HAS_ALTERNATIVES = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__COULD_RESOLVE = APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__STAKEHOLDER_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__HAS_STAKEHOLDERS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__SELECTED = APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__SELECTED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__DESCRIPTION = APS_REQ_INTERFACE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__KEYWORDS = APS_REQ_INTERFACE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__REPOSITORY = APS_REQ_INTERFACE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__RATIONALE = APS_REQ_INTERFACE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__IS_MODELLED = APS_REQ_INTERFACE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__IS_IMPLEMENTED = APS_REQ_INTERFACE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__TIME_STAMP = APS_REQ_INTERFACE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__EFFECTS = APS_REQ_INTERFACE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__USED_TERMS = APS_REQ_INTERFACE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__ANALYSIS_RATIONALE = APS_REQ_INTERFACE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__INTERFACES = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Introduce New Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION_FEATURE_COUNT = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqChangeInterfaceOptionImpl <em>APS Req Change Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqChangeInterfaceOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeInterfaceOption()
	 * @generated
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__ID = APS_REQ_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__RELATIONS = APS_REQ_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__CONFLICTS_WITH = APS_REQ_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__HAS_CONFLICTS = APS_REQ_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__DUPLICATE_OF = APS_REQ_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__HAS_DUPLICATES = APS_REQ_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__DEPENDS_ON = APS_REQ_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__HAS_DEPENDENTS = APS_REQ_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__PARENT_OF = APS_REQ_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__SUBPART_OF = APS_REQ_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__TRIGGER_OF = APS_REQ_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__TRIGGERED_BY = APS_REQ_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__RESOLVES = APS_REQ_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__RESOLVED_BY = APS_REQ_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__ALTERNATIVE_TO = APS_REQ_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__HAS_ALTERNATIVES = APS_REQ_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__COULD_RESOLVE = APS_REQ_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__STAKEHOLDER_OF = APS_REQ_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__HAS_STAKEHOLDERS = APS_REQ_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__SELECTED = APS_REQ_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__SELECTED_BY = APS_REQ_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__DESCRIPTION = APS_REQ_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__KEYWORDS = APS_REQ_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__REPOSITORY = APS_REQ_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__RATIONALE = APS_REQ_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__IS_MODELLED = APS_REQ_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__IS_IMPLEMENTED = APS_REQ_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__TIME_STAMP = APS_REQ_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__EFFECTS = APS_REQ_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__USED_TERMS = APS_REQ_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__ANALYSIS_RATIONALE = APS_REQ_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION__INTERFACES = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Change Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_INTERFACE_OPTION_FEATURE_COUNT = APS_REQ_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqReplaceInterfaceOptionImpl <em>APS Req Replace Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqReplaceInterfaceOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceInterfaceOption()
	 * @generated
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__ID = APS_REQ_INTERFACE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__RELATIONS = APS_REQ_INTERFACE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__CONFLICTS_WITH = APS_REQ_INTERFACE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__HAS_CONFLICTS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__DUPLICATE_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__HAS_DUPLICATES = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__DEPENDS_ON = APS_REQ_INTERFACE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__HAS_DEPENDENTS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__PARENT_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__SUBPART_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__TRIGGER_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__TRIGGERED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__RESOLVES = APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__RESOLVED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__ALTERNATIVE_TO = APS_REQ_INTERFACE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__HAS_ALTERNATIVES = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__COULD_RESOLVE = APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__STAKEHOLDER_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__HAS_STAKEHOLDERS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__SELECTED = APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__SELECTED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__DESCRIPTION = APS_REQ_INTERFACE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__KEYWORDS = APS_REQ_INTERFACE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__REPOSITORY = APS_REQ_INTERFACE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__RATIONALE = APS_REQ_INTERFACE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__IS_MODELLED = APS_REQ_INTERFACE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__IS_IMPLEMENTED = APS_REQ_INTERFACE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__TIME_STAMP = APS_REQ_INTERFACE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__EFFECTS = APS_REQ_INTERFACE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__USED_TERMS = APS_REQ_INTERFACE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__ANALYSIS_RATIONALE = APS_REQ_INTERFACE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Replace Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_INTERFACE_OPTION_FEATURE_COUNT = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqRemoveInterfaceOptionImpl <em>APS Req Remove Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqRemoveInterfaceOptionImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveInterfaceOption()
	 * @generated
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__ID = APS_REQ_INTERFACE_HARDWARE_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__RELATIONS = APS_REQ_INTERFACE_HARDWARE_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__CONFLICTS_WITH = APS_REQ_INTERFACE_HARDWARE_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__HAS_CONFLICTS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__DUPLICATE_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__HAS_DUPLICATES = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__DEPENDS_ON = APS_REQ_INTERFACE_HARDWARE_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__HAS_DEPENDENTS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__PARENT_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__SUBPART_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__TRIGGER_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__TRIGGERED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__RESOLVES = APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__RESOLVED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__ALTERNATIVE_TO = APS_REQ_INTERFACE_HARDWARE_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__HAS_ALTERNATIVES = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__COULD_RESOLVE = APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__COULD_BE_RESOLVED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__STAKEHOLDER_OF = APS_REQ_INTERFACE_HARDWARE_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__HAS_STAKEHOLDERS = APS_REQ_INTERFACE_HARDWARE_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__SELECTED = APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__SELECTED_BY = APS_REQ_INTERFACE_HARDWARE_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__DESCRIPTION = APS_REQ_INTERFACE_HARDWARE_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__KEYWORDS = APS_REQ_INTERFACE_HARDWARE_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__REPOSITORY = APS_REQ_INTERFACE_HARDWARE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__RATIONALE = APS_REQ_INTERFACE_HARDWARE_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__IS_MODELLED = APS_REQ_INTERFACE_HARDWARE_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__IS_IMPLEMENTED = APS_REQ_INTERFACE_HARDWARE_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__TIME_STAMP = APS_REQ_INTERFACE_HARDWARE_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__EFFECTS = APS_REQ_INTERFACE_HARDWARE_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__USED_TERMS = APS_REQ_INTERFACE_HARDWARE_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__ANALYSIS_RATIONALE = APS_REQ_INTERFACE_HARDWARE_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION__INTERFACES = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Remove Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_INTERFACE_OPTION_FEATURE_COUNT = APS_REQ_INTERFACE_HARDWARE_OPTION_FEATURE_COUNT + 1;

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
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqStructureHardwareOption <em>APS Req Structure Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Structure Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqStructureHardwareOption
	 * @generated
	 */
	EClass getAPSReqStructureHardwareOption();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqIntroduceNewStructureOption <em>APS Req Introduce New Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introduce New Structure Option</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewStructureOption
	 * @generated
	 */
	EClass getAPSReqIntroduceNewStructureOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqIntroduceNewStructureOption#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewStructureOption#getStructures()
	 * @see #getAPSReqIntroduceNewStructureOption()
	 * @generated
	 */
	EReference getAPSReqIntroduceNewStructureOption_Structures();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqChangeStructureOption <em>APS Req Change Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Change Structure Option</em>'.
	 * @see apshardwareoptions.APSReqChangeStructureOption
	 * @generated
	 */
	EClass getAPSReqChangeStructureOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqChangeStructureOption#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see apshardwareoptions.APSReqChangeStructureOption#getStructures()
	 * @see #getAPSReqChangeStructureOption()
	 * @generated
	 */
	EReference getAPSReqChangeStructureOption_Structures();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqRemoveStructureOption <em>APS Req Remove Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Structure Option</em>'.
	 * @see apshardwareoptions.APSReqRemoveStructureOption
	 * @generated
	 */
	EClass getAPSReqRemoveStructureOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqRemoveStructureOption#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see apshardwareoptions.APSReqRemoveStructureOption#getStructures()
	 * @see #getAPSReqRemoveStructureOption()
	 * @generated
	 */
	EReference getAPSReqRemoveStructureOption_Structures();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqReplaceStructureOption <em>APS Req Replace Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Structure Option</em>'.
	 * @see apshardwareoptions.APSReqReplaceStructureOption
	 * @generated
	 */
	EClass getAPSReqReplaceStructureOption();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceStructureOption#getOldStructure <em>Old Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Structure</em>'.
	 * @see apshardwareoptions.APSReqReplaceStructureOption#getOldStructure()
	 * @see #getAPSReqReplaceStructureOption()
	 * @generated
	 */
	EReference getAPSReqReplaceStructureOption_OldStructure();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceStructureOption#getNewStructure <em>New Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Structure</em>'.
	 * @see apshardwareoptions.APSReqReplaceStructureOption#getNewStructure()
	 * @see #getAPSReqReplaceStructureOption()
	 * @generated
	 */
	EReference getAPSReqReplaceStructureOption_NewStructure();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqModuleHardwareOption <em>APS Req Module Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Module Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqModuleHardwareOption
	 * @generated
	 */
	EClass getAPSReqModuleHardwareOption();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqIntroduceNewModuleOption <em>APS Req Introduce New Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introduce New Module Option</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewModuleOption
	 * @generated
	 */
	EClass getAPSReqIntroduceNewModuleOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqIntroduceNewModuleOption#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewModuleOption#getModules()
	 * @see #getAPSReqIntroduceNewModuleOption()
	 * @generated
	 */
	EReference getAPSReqIntroduceNewModuleOption_Modules();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqRemoveModuleOption <em>APS Req Remove Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Module Option</em>'.
	 * @see apshardwareoptions.APSReqRemoveModuleOption
	 * @generated
	 */
	EClass getAPSReqRemoveModuleOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqRemoveModuleOption#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see apshardwareoptions.APSReqRemoveModuleOption#getModules()
	 * @see #getAPSReqRemoveModuleOption()
	 * @generated
	 */
	EReference getAPSReqRemoveModuleOption_Modules();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqChangeModuleOption <em>APS Req Change Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Change Module Option</em>'.
	 * @see apshardwareoptions.APSReqChangeModuleOption
	 * @generated
	 */
	EClass getAPSReqChangeModuleOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqChangeModuleOption#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see apshardwareoptions.APSReqChangeModuleOption#getModules()
	 * @see #getAPSReqChangeModuleOption()
	 * @generated
	 */
	EReference getAPSReqChangeModuleOption_Modules();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqReplaceModuleOption <em>APS Req Replace Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Module Option</em>'.
	 * @see apshardwareoptions.APSReqReplaceModuleOption
	 * @generated
	 */
	EClass getAPSReqReplaceModuleOption();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceModuleOption#getOldModule <em>Old Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Module</em>'.
	 * @see apshardwareoptions.APSReqReplaceModuleOption#getOldModule()
	 * @see #getAPSReqReplaceModuleOption()
	 * @generated
	 */
	EReference getAPSReqReplaceModuleOption_OldModule();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceModuleOption#getNewModule <em>New Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Module</em>'.
	 * @see apshardwareoptions.APSReqReplaceModuleOption#getNewModule()
	 * @see #getAPSReqReplaceModuleOption()
	 * @generated
	 */
	EReference getAPSReqReplaceModuleOption_NewModule();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqComponentHardwareOption <em>APS Req Component Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Component Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqComponentHardwareOption
	 * @generated
	 */
	EClass getAPSReqComponentHardwareOption();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqIntroduceNewComponentOption <em>APS Req Introduce New Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introduce New Component Option</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewComponentOption
	 * @generated
	 */
	EClass getAPSReqIntroduceNewComponentOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqIntroduceNewComponentOption#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewComponentOption#getComponents()
	 * @see #getAPSReqIntroduceNewComponentOption()
	 * @generated
	 */
	EReference getAPSReqIntroduceNewComponentOption_Components();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqRemoveComponentOption <em>APS Req Remove Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Component Option</em>'.
	 * @see apshardwareoptions.APSReqRemoveComponentOption
	 * @generated
	 */
	EClass getAPSReqRemoveComponentOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqRemoveComponentOption#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see apshardwareoptions.APSReqRemoveComponentOption#getComponents()
	 * @see #getAPSReqRemoveComponentOption()
	 * @generated
	 */
	EReference getAPSReqRemoveComponentOption_Components();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqReplaceComponentOption <em>APS Req Replace Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Component Option</em>'.
	 * @see apshardwareoptions.APSReqReplaceComponentOption
	 * @generated
	 */
	EClass getAPSReqReplaceComponentOption();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceComponentOption#getOldComponent <em>Old Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Component</em>'.
	 * @see apshardwareoptions.APSReqReplaceComponentOption#getOldComponent()
	 * @see #getAPSReqReplaceComponentOption()
	 * @generated
	 */
	EReference getAPSReqReplaceComponentOption_OldComponent();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceComponentOption#getNewComponent <em>New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Component</em>'.
	 * @see apshardwareoptions.APSReqReplaceComponentOption#getNewComponent()
	 * @see #getAPSReqReplaceComponentOption()
	 * @generated
	 */
	EReference getAPSReqReplaceComponentOption_NewComponent();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqInterfaceHardwareOption <em>APS Req Interface Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Interface Hardware Option</em>'.
	 * @see apshardwareoptions.APSReqInterfaceHardwareOption
	 * @generated
	 */
	EClass getAPSReqInterfaceHardwareOption();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqIntroduceNewInterfaceOption <em>APS Req Introduce New Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introduce New Interface Option</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewInterfaceOption
	 * @generated
	 */
	EClass getAPSReqIntroduceNewInterfaceOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqIntroduceNewInterfaceOption#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewInterfaceOption#getInterfaces()
	 * @see #getAPSReqIntroduceNewInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqIntroduceNewInterfaceOption_Interfaces();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqChangeInterfaceOption <em>APS Req Change Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Change Interface Option</em>'.
	 * @see apshardwareoptions.APSReqChangeInterfaceOption
	 * @generated
	 */
	EClass getAPSReqChangeInterfaceOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqChangeInterfaceOption#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see apshardwareoptions.APSReqChangeInterfaceOption#getInterfaces()
	 * @see #getAPSReqChangeInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqChangeInterfaceOption_Interfaces();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqReplaceInterfaceOption <em>APS Req Replace Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Interface Option</em>'.
	 * @see apshardwareoptions.APSReqReplaceInterfaceOption
	 * @generated
	 */
	EClass getAPSReqReplaceInterfaceOption();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceInterfaceOption#getOldInterface <em>Old Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Interface</em>'.
	 * @see apshardwareoptions.APSReqReplaceInterfaceOption#getOldInterface()
	 * @see #getAPSReqReplaceInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqReplaceInterfaceOption_OldInterface();

	/**
	 * Returns the meta object for the reference '{@link apshardwareoptions.APSReqReplaceInterfaceOption#getNewInterface <em>New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Interface</em>'.
	 * @see apshardwareoptions.APSReqReplaceInterfaceOption#getNewInterface()
	 * @see #getAPSReqReplaceInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqReplaceInterfaceOption_NewInterface();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqRemoveInterfaceOption <em>APS Req Remove Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Interface Option</em>'.
	 * @see apshardwareoptions.APSReqRemoveInterfaceOption
	 * @generated
	 */
	EClass getAPSReqRemoveInterfaceOption();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqRemoveInterfaceOption#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see apshardwareoptions.APSReqRemoveInterfaceOption#getInterfaces()
	 * @see #getAPSReqRemoveInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqRemoveInterfaceOption_Interfaces();

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
	 *   <li>each operation of each class,</li>
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
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqStructureHardwareOptionImpl <em>APS Req Structure Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqStructureHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqStructureHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_STRUCTURE_HARDWARE_OPTION = eINSTANCE.getAPSReqStructureHardwareOption();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqIntroduceNewStructureOptionImpl <em>APS Req Introduce New Structure Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqIntroduceNewStructureOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewStructureOption()
		 * @generated
		 */
		EClass APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION = eINSTANCE.getAPSReqIntroduceNewStructureOption();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__STRUCTURES = eINSTANCE.getAPSReqIntroduceNewStructureOption_Structures();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqChangeStructureOptionImpl <em>APS Req Change Structure Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqChangeStructureOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeStructureOption()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_STRUCTURE_OPTION = eINSTANCE.getAPSReqChangeStructureOption();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_CHANGE_STRUCTURE_OPTION__STRUCTURES = eINSTANCE.getAPSReqChangeStructureOption_Structures();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqRemoveStructureOptionImpl <em>APS Req Remove Structure Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqRemoveStructureOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveStructureOption()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_STRUCTURE_OPTION = eINSTANCE.getAPSReqRemoveStructureOption();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REMOVE_STRUCTURE_OPTION__STRUCTURES = eINSTANCE.getAPSReqRemoveStructureOption_Structures();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqReplaceStructureOptionImpl <em>APS Req Replace Structure Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqReplaceStructureOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceStructureOption()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_STRUCTURE_OPTION = eINSTANCE.getAPSReqReplaceStructureOption();

		/**
		 * The meta object literal for the '<em><b>Old Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE = eINSTANCE.getAPSReqReplaceStructureOption_OldStructure();

		/**
		 * The meta object literal for the '<em><b>New Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE = eINSTANCE.getAPSReqReplaceStructureOption_NewStructure();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqModuleHardwareOptionImpl <em>APS Req Module Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqModuleHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqModuleHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_MODULE_HARDWARE_OPTION = eINSTANCE.getAPSReqModuleHardwareOption();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqIntroduceNewModuleOptionImpl <em>APS Req Introduce New Module Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqIntroduceNewModuleOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewModuleOption()
		 * @generated
		 */
		EClass APS_REQ_INTRODUCE_NEW_MODULE_OPTION = eINSTANCE.getAPSReqIntroduceNewModuleOption();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTRODUCE_NEW_MODULE_OPTION__MODULES = eINSTANCE.getAPSReqIntroduceNewModuleOption_Modules();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqRemoveModuleOptionImpl <em>APS Req Remove Module Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqRemoveModuleOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveModuleOption()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_MODULE_OPTION = eINSTANCE.getAPSReqRemoveModuleOption();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REMOVE_MODULE_OPTION__MODULES = eINSTANCE.getAPSReqRemoveModuleOption_Modules();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqChangeModuleOptionImpl <em>APS Req Change Module Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqChangeModuleOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeModuleOption()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_MODULE_OPTION = eINSTANCE.getAPSReqChangeModuleOption();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_CHANGE_MODULE_OPTION__MODULES = eINSTANCE.getAPSReqChangeModuleOption_Modules();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqReplaceModuleOptionImpl <em>APS Req Replace Module Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqReplaceModuleOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceModuleOption()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_MODULE_OPTION = eINSTANCE.getAPSReqReplaceModuleOption();

		/**
		 * The meta object literal for the '<em><b>Old Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE = eINSTANCE.getAPSReqReplaceModuleOption_OldModule();

		/**
		 * The meta object literal for the '<em><b>New Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE = eINSTANCE.getAPSReqReplaceModuleOption_NewModule();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqComponentHardwareOptionImpl <em>APS Req Component Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqComponentHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqComponentHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_COMPONENT_HARDWARE_OPTION = eINSTANCE.getAPSReqComponentHardwareOption();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqIntroduceNewComponentOptionImpl <em>APS Req Introduce New Component Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqIntroduceNewComponentOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewComponentOption()
		 * @generated
		 */
		EClass APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION = eINSTANCE.getAPSReqIntroduceNewComponentOption();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__COMPONENTS = eINSTANCE.getAPSReqIntroduceNewComponentOption_Components();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqRemoveComponentOptionImpl <em>APS Req Remove Component Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqRemoveComponentOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveComponentOption()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_COMPONENT_OPTION = eINSTANCE.getAPSReqRemoveComponentOption();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REMOVE_COMPONENT_OPTION__COMPONENTS = eINSTANCE.getAPSReqRemoveComponentOption_Components();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqReplaceComponentOptionImpl <em>APS Req Replace Component Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqReplaceComponentOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceComponentOption()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_COMPONENT_OPTION = eINSTANCE.getAPSReqReplaceComponentOption();

		/**
		 * The meta object literal for the '<em><b>Old Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT = eINSTANCE.getAPSReqReplaceComponentOption_OldComponent();

		/**
		 * The meta object literal for the '<em><b>New Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT = eINSTANCE.getAPSReqReplaceComponentOption_NewComponent();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqInterfaceHardwareOptionImpl <em>APS Req Interface Hardware Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqInterfaceHardwareOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqInterfaceHardwareOption()
		 * @generated
		 */
		EClass APS_REQ_INTERFACE_HARDWARE_OPTION = eINSTANCE.getAPSReqInterfaceHardwareOption();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqIntroduceNewInterfaceOptionImpl <em>APS Req Introduce New Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqIntroduceNewInterfaceOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewInterfaceOption()
		 * @generated
		 */
		EClass APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION = eINSTANCE.getAPSReqIntroduceNewInterfaceOption();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__INTERFACES = eINSTANCE.getAPSReqIntroduceNewInterfaceOption_Interfaces();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqChangeInterfaceOptionImpl <em>APS Req Change Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqChangeInterfaceOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeInterfaceOption()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_INTERFACE_OPTION = eINSTANCE.getAPSReqChangeInterfaceOption();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_CHANGE_INTERFACE_OPTION__INTERFACES = eINSTANCE.getAPSReqChangeInterfaceOption_Interfaces();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqReplaceInterfaceOptionImpl <em>APS Req Replace Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqReplaceInterfaceOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceInterfaceOption()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_INTERFACE_OPTION = eINSTANCE.getAPSReqReplaceInterfaceOption();

		/**
		 * The meta object literal for the '<em><b>Old Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE = eINSTANCE.getAPSReqReplaceInterfaceOption_OldInterface();

		/**
		 * The meta object literal for the '<em><b>New Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE = eINSTANCE.getAPSReqReplaceInterfaceOption_NewInterface();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqRemoveInterfaceOptionImpl <em>APS Req Remove Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqRemoveInterfaceOptionImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveInterfaceOption()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_INTERFACE_OPTION = eINSTANCE.getAPSReqRemoveInterfaceOption();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REMOVE_INTERFACE_OPTION__INTERFACES = eINSTANCE.getAPSReqRemoveInterfaceOption_Interfaces();

	}

} //ApshardwareoptionsPackage
