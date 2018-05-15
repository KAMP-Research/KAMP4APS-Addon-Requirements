/**
 */
package apssoftwareoptions;

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
 * @see apssoftwareoptions.ApssoftwareoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ApssoftwareoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apssoftwareoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/apssoftwareoptions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apssoftwareoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApssoftwareoptionsPackage eINSTANCE = apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqProgramOptionImpl <em>APS Req Program Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqProgramOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqProgramOption()
	 * @generated
	 */
	int APS_REQ_PROGRAM_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION__PROGRAM = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Program Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_PROGRAM_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqFunctionOptionImpl <em>APS Req Function Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqFunctionOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqFunctionOption()
	 * @generated
	 */
	int APS_REQ_FUNCTION_OPTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION__FUNCTIONS = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Function Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqFunctionBlockOptionImpl <em>APS Req Function Block Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqFunctionBlockOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqFunctionBlockOption()
	 * @generated
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Function Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Function Block Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_FUNCTION_BLOCK_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqConfigurationOptionImpl <em>APS Req Configuration Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqConfigurationOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqConfigurationOption()
	 * @generated
	 */
	int APS_REQ_CONFIGURATION_OPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION__CONFIGURATION = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Configuration Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CONFIGURATION_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqIECMethodOptionImpl <em>APS Req IEC Method Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqIECMethodOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqIECMethodOption()
	 * @generated
	 */
	int APS_REQ_IEC_METHOD_OPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Iec Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION__IEC_METHODS = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req IEC Method Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_METHOD_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqGlobalVariableOptionImpl <em>APS Req Global Variable Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqGlobalVariableOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqGlobalVariableOption()
	 * @generated
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION__GLOBAL_VARIABLES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Global Variable Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_GLOBAL_VARIABLE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqIECPropertyOptionImpl <em>APS Req IEC Property Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqIECPropertyOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqIECPropertyOption()
	 * @generated
	 */
	int APS_REQ_IEC_PROPERTY_OPTION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Iec Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req IEC Property Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_PROPERTY_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqIECInterfaceOptionImpl <em>APS Req IEC Interface Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqIECInterfaceOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqIECInterfaceOption()
	 * @generated
	 */
	int APS_REQ_IEC_INTERFACE_OPTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Iec Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req IEC Interface Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_IEC_INTERFACE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqProgramOption <em>APS Req Program Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Program Option</em>'.
	 * @see apssoftwareoptions.APSReqProgramOption
	 * @generated
	 */
	EClass getAPSReqProgramOption();

	/**
	 * Returns the meta object for the reference '{@link apssoftwareoptions.APSReqProgramOption#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see apssoftwareoptions.APSReqProgramOption#getProgram()
	 * @see #getAPSReqProgramOption()
	 * @generated
	 */
	EReference getAPSReqProgramOption_Program();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqFunctionOption <em>APS Req Function Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Function Option</em>'.
	 * @see apssoftwareoptions.APSReqFunctionOption
	 * @generated
	 */
	EClass getAPSReqFunctionOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqFunctionOption#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Functions</em>'.
	 * @see apssoftwareoptions.APSReqFunctionOption#getFunctions()
	 * @see #getAPSReqFunctionOption()
	 * @generated
	 */
	EReference getAPSReqFunctionOption_Functions();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqFunctionBlockOption <em>APS Req Function Block Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Function Block Option</em>'.
	 * @see apssoftwareoptions.APSReqFunctionBlockOption
	 * @generated
	 */
	EClass getAPSReqFunctionBlockOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqFunctionBlockOption#getFunctionBlocks <em>Function Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Blocks</em>'.
	 * @see apssoftwareoptions.APSReqFunctionBlockOption#getFunctionBlocks()
	 * @see #getAPSReqFunctionBlockOption()
	 * @generated
	 */
	EReference getAPSReqFunctionBlockOption_FunctionBlocks();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqConfigurationOption <em>APS Req Configuration Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Configuration Option</em>'.
	 * @see apssoftwareoptions.APSReqConfigurationOption
	 * @generated
	 */
	EClass getAPSReqConfigurationOption();

	/**
	 * Returns the meta object for the reference '{@link apssoftwareoptions.APSReqConfigurationOption#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see apssoftwareoptions.APSReqConfigurationOption#getConfiguration()
	 * @see #getAPSReqConfigurationOption()
	 * @generated
	 */
	EReference getAPSReqConfigurationOption_Configuration();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqIECMethodOption <em>APS Req IEC Method Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req IEC Method Option</em>'.
	 * @see apssoftwareoptions.APSReqIECMethodOption
	 * @generated
	 */
	EClass getAPSReqIECMethodOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqIECMethodOption#getIecMethods <em>Iec Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Methods</em>'.
	 * @see apssoftwareoptions.APSReqIECMethodOption#getIecMethods()
	 * @see #getAPSReqIECMethodOption()
	 * @generated
	 */
	EReference getAPSReqIECMethodOption_IecMethods();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqGlobalVariableOption <em>APS Req Global Variable Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Global Variable Option</em>'.
	 * @see apssoftwareoptions.APSReqGlobalVariableOption
	 * @generated
	 */
	EClass getAPSReqGlobalVariableOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqGlobalVariableOption#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Global Variables</em>'.
	 * @see apssoftwareoptions.APSReqGlobalVariableOption#getGlobalVariables()
	 * @see #getAPSReqGlobalVariableOption()
	 * @generated
	 */
	EReference getAPSReqGlobalVariableOption_GlobalVariables();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqIECPropertyOption <em>APS Req IEC Property Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req IEC Property Option</em>'.
	 * @see apssoftwareoptions.APSReqIECPropertyOption
	 * @generated
	 */
	EClass getAPSReqIECPropertyOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqIECPropertyOption#getIecProperties <em>Iec Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Properties</em>'.
	 * @see apssoftwareoptions.APSReqIECPropertyOption#getIecProperties()
	 * @see #getAPSReqIECPropertyOption()
	 * @generated
	 */
	EReference getAPSReqIECPropertyOption_IecProperties();

	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqIECInterfaceOption <em>APS Req IEC Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req IEC Interface Option</em>'.
	 * @see apssoftwareoptions.APSReqIECInterfaceOption
	 * @generated
	 */
	EClass getAPSReqIECInterfaceOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqIECInterfaceOption#getIecInterfaces <em>Iec Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Interfaces</em>'.
	 * @see apssoftwareoptions.APSReqIECInterfaceOption#getIecInterfaces()
	 * @see #getAPSReqIECInterfaceOption()
	 * @generated
	 */
	EReference getAPSReqIECInterfaceOption_IecInterfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApssoftwareoptionsFactory getApssoftwareoptionsFactory();

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
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqProgramOptionImpl <em>APS Req Program Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqProgramOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqProgramOption()
		 * @generated
		 */
		EClass APS_REQ_PROGRAM_OPTION = eINSTANCE.getAPSReqProgramOption();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_PROGRAM_OPTION__PROGRAM = eINSTANCE.getAPSReqProgramOption_Program();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqFunctionOptionImpl <em>APS Req Function Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqFunctionOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqFunctionOption()
		 * @generated
		 */
		EClass APS_REQ_FUNCTION_OPTION = eINSTANCE.getAPSReqFunctionOption();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_FUNCTION_OPTION__FUNCTIONS = eINSTANCE.getAPSReqFunctionOption_Functions();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqFunctionBlockOptionImpl <em>APS Req Function Block Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqFunctionBlockOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqFunctionBlockOption()
		 * @generated
		 */
		EClass APS_REQ_FUNCTION_BLOCK_OPTION = eINSTANCE.getAPSReqFunctionBlockOption();

		/**
		 * The meta object literal for the '<em><b>Function Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS = eINSTANCE.getAPSReqFunctionBlockOption_FunctionBlocks();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqConfigurationOptionImpl <em>APS Req Configuration Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqConfigurationOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqConfigurationOption()
		 * @generated
		 */
		EClass APS_REQ_CONFIGURATION_OPTION = eINSTANCE.getAPSReqConfigurationOption();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_CONFIGURATION_OPTION__CONFIGURATION = eINSTANCE.getAPSReqConfigurationOption_Configuration();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqIECMethodOptionImpl <em>APS Req IEC Method Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqIECMethodOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqIECMethodOption()
		 * @generated
		 */
		EClass APS_REQ_IEC_METHOD_OPTION = eINSTANCE.getAPSReqIECMethodOption();

		/**
		 * The meta object literal for the '<em><b>Iec Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_IEC_METHOD_OPTION__IEC_METHODS = eINSTANCE.getAPSReqIECMethodOption_IecMethods();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqGlobalVariableOptionImpl <em>APS Req Global Variable Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqGlobalVariableOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqGlobalVariableOption()
		 * @generated
		 */
		EClass APS_REQ_GLOBAL_VARIABLE_OPTION = eINSTANCE.getAPSReqGlobalVariableOption();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_GLOBAL_VARIABLE_OPTION__GLOBAL_VARIABLES = eINSTANCE.getAPSReqGlobalVariableOption_GlobalVariables();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqIECPropertyOptionImpl <em>APS Req IEC Property Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqIECPropertyOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqIECPropertyOption()
		 * @generated
		 */
		EClass APS_REQ_IEC_PROPERTY_OPTION = eINSTANCE.getAPSReqIECPropertyOption();

		/**
		 * The meta object literal for the '<em><b>Iec Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES = eINSTANCE.getAPSReqIECPropertyOption_IecProperties();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqIECInterfaceOptionImpl <em>APS Req IEC Interface Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqIECInterfaceOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqIECInterfaceOption()
		 * @generated
		 */
		EClass APS_REQ_IEC_INTERFACE_OPTION = eINSTANCE.getAPSReqIECInterfaceOption();

		/**
		 * The meta object literal for the '<em><b>Iec Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES = eINSTANCE.getAPSReqIECInterfaceOption_IecInterfaces();

	}

} //ApssoftwareoptionsPackage
