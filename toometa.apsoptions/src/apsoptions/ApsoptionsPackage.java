/**
 */
package apsoptions;

import archoptions.ArchoptionsPackage;

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
 * @see apsoptions.ApsoptionsFactory
 * @model kind="package"
 * @generated
 */
public interface ApsoptionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "apsoptions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://toometa.de/apsoptions/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "apsoptions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApsoptionsPackage eINSTANCE = apsoptions.impl.ApsoptionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_OptionImpl <em>xPPU Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_OptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_Option()
	 * @generated
	 */
	int XPPU_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__ID = ArchoptionsPackage.ARCH_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__RELATIONS = ArchoptionsPackage.ARCH_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__CONFLICTS_WITH = ArchoptionsPackage.ARCH_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__HAS_CONFLICTS = ArchoptionsPackage.ARCH_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__DUPLICATE_OF = ArchoptionsPackage.ARCH_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__HAS_DUPLICATES = ArchoptionsPackage.ARCH_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__DEPENDS_ON = ArchoptionsPackage.ARCH_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__HAS_DEPENDENTS = ArchoptionsPackage.ARCH_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__PARENT_OF = ArchoptionsPackage.ARCH_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__SUBPART_OF = ArchoptionsPackage.ARCH_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__TRIGGER_OF = ArchoptionsPackage.ARCH_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__TRIGGERED_BY = ArchoptionsPackage.ARCH_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__RESOLVES = ArchoptionsPackage.ARCH_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__RESOLVED_BY = ArchoptionsPackage.ARCH_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__ALTERNATIVE_TO = ArchoptionsPackage.ARCH_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__HAS_ALTERNATIVES = ArchoptionsPackage.ARCH_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__COULD_RESOLVE = ArchoptionsPackage.ARCH_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__COULD_BE_RESOLVED_BY = ArchoptionsPackage.ARCH_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__STAKEHOLDER_OF = ArchoptionsPackage.ARCH_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__HAS_STAKEHOLDERS = ArchoptionsPackage.ARCH_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__SELECTED = ArchoptionsPackage.ARCH_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__SELECTED_BY = ArchoptionsPackage.ARCH_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__DESCRIPTION = ArchoptionsPackage.ARCH_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__KEYWORDS = ArchoptionsPackage.ARCH_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__REPOSITORY = ArchoptionsPackage.ARCH_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__RATIONALE = ArchoptionsPackage.ARCH_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__IS_MODELLED = ArchoptionsPackage.ARCH_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__IS_IMPLEMENTED = ArchoptionsPackage.ARCH_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__TIME_STAMP = ArchoptionsPackage.ARCH_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__EFFECTS = ArchoptionsPackage.ARCH_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__USED_TERMS = ArchoptionsPackage.ARCH_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION__ANALYSIS_RATIONALE = ArchoptionsPackage.ARCH_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The number of structural features of the '<em>xPPU Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_OPTION_FEATURE_COUNT = ArchoptionsPackage.ARCH_OPTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_IntroduceNewComponentImpl <em>xPPU Introduce New Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_IntroduceNewComponentImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewComponent()
	 * @generated
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Introduce New Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_COMPONENT_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_ChangeComponentImpl <em>xPPU Change Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_ChangeComponentImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeComponent()
	 * @generated
	 */
	int XPPU_CHANGE_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__OLD_COMPONENTS = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT__NEW_COMPONENTS = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>xPPU Change Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_COMPONENT_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_RemoveComponentImpl <em>xPPU Remove Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_RemoveComponentImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveComponent()
	 * @generated
	 */
	int XPPU_REMOVE_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT__COMPONENTS = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Remove Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_COMPONENT_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_IntroduceNewModuleImpl <em>xPPU Introduce New Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_IntroduceNewModuleImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewModule()
	 * @generated
	 */
	int XPPU_INTRODUCE_NEW_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE__MODULES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Introduce New Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_MODULE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_ChangeModuleImpl <em>xPPU Change Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_ChangeModuleImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeModule()
	 * @generated
	 */
	int XPPU_CHANGE_MODULE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__OLD_MODULES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE__NEW_MODULES = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>xPPU Change Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_MODULE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_RemoveModuleImpl <em>xPPU Remove Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_RemoveModuleImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveModule()
	 * @generated
	 */
	int XPPU_REMOVE_MODULE = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE__MODULES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Remove Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_MODULE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_IntroduceNewStructureImpl <em>xPPU Introduce New Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_IntroduceNewStructureImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewStructure()
	 * @generated
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE__STRUCTURES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Introduce New Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_STRUCTURE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_ChangeStructureImpl <em>xPPU Change Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_ChangeStructureImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeStructure()
	 * @generated
	 */
	int XPPU_CHANGE_STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>xPPU Change Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_STRUCTURE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_RemoveStructureImpl <em>xPPU Remove Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_RemoveStructureImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveStructure()
	 * @generated
	 */
	int XPPU_REMOVE_STRUCTURE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE__STRUCTURES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Remove Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_STRUCTURE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_IntroduceNewInterfaceImpl <em>xPPU Introduce New Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_IntroduceNewInterfaceImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewInterface()
	 * @generated
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE__INTERFACES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Introduce New Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_INTRODUCE_NEW_INTERFACE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_ChangeInterfaceImpl <em>xPPU Change Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_ChangeInterfaceImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeInterface()
	 * @generated
	 */
	int XPPU_CHANGE_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Old Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__OLD_INTERFACES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE__NEW_INTERFACES = XPPU_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>xPPU Change Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_CHANGE_INTERFACE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apsoptions.impl.xPPU_RemoveInterfaceImpl <em>xPPU Remove Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.xPPU_RemoveInterfaceImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveInterface()
	 * @generated
	 */
	int XPPU_REMOVE_INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__ID = XPPU_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__RELATIONS = XPPU_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__CONFLICTS_WITH = XPPU_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__HAS_CONFLICTS = XPPU_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__DUPLICATE_OF = XPPU_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__HAS_DUPLICATES = XPPU_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__DEPENDS_ON = XPPU_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__HAS_DEPENDENTS = XPPU_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__PARENT_OF = XPPU_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__SUBPART_OF = XPPU_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__TRIGGER_OF = XPPU_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__TRIGGERED_BY = XPPU_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__RESOLVES = XPPU_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__RESOLVED_BY = XPPU_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__ALTERNATIVE_TO = XPPU_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__HAS_ALTERNATIVES = XPPU_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__COULD_RESOLVE = XPPU_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__COULD_BE_RESOLVED_BY = XPPU_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__STAKEHOLDER_OF = XPPU_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__HAS_STAKEHOLDERS = XPPU_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__SELECTED = XPPU_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__SELECTED_BY = XPPU_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__DESCRIPTION = XPPU_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__KEYWORDS = XPPU_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__REPOSITORY = XPPU_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__RATIONALE = XPPU_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__IS_MODELLED = XPPU_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__IS_IMPLEMENTED = XPPU_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__TIME_STAMP = XPPU_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__EFFECTS = XPPU_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__USED_TERMS = XPPU_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Analysis Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__ANALYSIS_RATIONALE = XPPU_OPTION__ANALYSIS_RATIONALE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE__INTERFACES = XPPU_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>xPPU Remove Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPPU_REMOVE_INTERFACE_FEATURE_COUNT = XPPU_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_Option <em>xPPU Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Option</em>'.
	 * @see apsoptions.xPPU_Option
	 * @generated
	 */
	EClass getxPPU_Option();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_IntroduceNewComponent <em>xPPU Introduce New Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Introduce New Component</em>'.
	 * @see apsoptions.xPPU_IntroduceNewComponent
	 * @generated
	 */
	EClass getxPPU_IntroduceNewComponent();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_IntroduceNewComponent#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see apsoptions.xPPU_IntroduceNewComponent#getComponents()
	 * @see #getxPPU_IntroduceNewComponent()
	 * @generated
	 */
	EReference getxPPU_IntroduceNewComponent_Components();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_ChangeComponent <em>xPPU Change Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Change Component</em>'.
	 * @see apsoptions.xPPU_ChangeComponent
	 * @generated
	 */
	EClass getxPPU_ChangeComponent();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeComponent#getOldComponents <em>Old Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Components</em>'.
	 * @see apsoptions.xPPU_ChangeComponent#getOldComponents()
	 * @see #getxPPU_ChangeComponent()
	 * @generated
	 */
	EReference getxPPU_ChangeComponent_OldComponents();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeComponent#getNewComponents <em>New Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Components</em>'.
	 * @see apsoptions.xPPU_ChangeComponent#getNewComponents()
	 * @see #getxPPU_ChangeComponent()
	 * @generated
	 */
	EReference getxPPU_ChangeComponent_NewComponents();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_RemoveComponent <em>xPPU Remove Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Remove Component</em>'.
	 * @see apsoptions.xPPU_RemoveComponent
	 * @generated
	 */
	EClass getxPPU_RemoveComponent();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_RemoveComponent#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see apsoptions.xPPU_RemoveComponent#getComponents()
	 * @see #getxPPU_RemoveComponent()
	 * @generated
	 */
	EReference getxPPU_RemoveComponent_Components();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_IntroduceNewModule <em>xPPU Introduce New Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Introduce New Module</em>'.
	 * @see apsoptions.xPPU_IntroduceNewModule
	 * @generated
	 */
	EClass getxPPU_IntroduceNewModule();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_IntroduceNewModule#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see apsoptions.xPPU_IntroduceNewModule#getModules()
	 * @see #getxPPU_IntroduceNewModule()
	 * @generated
	 */
	EReference getxPPU_IntroduceNewModule_Modules();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_ChangeModule <em>xPPU Change Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Change Module</em>'.
	 * @see apsoptions.xPPU_ChangeModule
	 * @generated
	 */
	EClass getxPPU_ChangeModule();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeModule#getOldModules <em>Old Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Modules</em>'.
	 * @see apsoptions.xPPU_ChangeModule#getOldModules()
	 * @see #getxPPU_ChangeModule()
	 * @generated
	 */
	EReference getxPPU_ChangeModule_OldModules();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeModule#getNewModules <em>New Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Modules</em>'.
	 * @see apsoptions.xPPU_ChangeModule#getNewModules()
	 * @see #getxPPU_ChangeModule()
	 * @generated
	 */
	EReference getxPPU_ChangeModule_NewModules();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_RemoveModule <em>xPPU Remove Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Remove Module</em>'.
	 * @see apsoptions.xPPU_RemoveModule
	 * @generated
	 */
	EClass getxPPU_RemoveModule();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_RemoveModule#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modules</em>'.
	 * @see apsoptions.xPPU_RemoveModule#getModules()
	 * @see #getxPPU_RemoveModule()
	 * @generated
	 */
	EReference getxPPU_RemoveModule_Modules();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_IntroduceNewStructure <em>xPPU Introduce New Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Introduce New Structure</em>'.
	 * @see apsoptions.xPPU_IntroduceNewStructure
	 * @generated
	 */
	EClass getxPPU_IntroduceNewStructure();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_IntroduceNewStructure#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see apsoptions.xPPU_IntroduceNewStructure#getStructures()
	 * @see #getxPPU_IntroduceNewStructure()
	 * @generated
	 */
	EReference getxPPU_IntroduceNewStructure_Structures();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_ChangeStructure <em>xPPU Change Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Change Structure</em>'.
	 * @see apsoptions.xPPU_ChangeStructure
	 * @generated
	 */
	EClass getxPPU_ChangeStructure();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeStructure#getOldStructures <em>Old Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Structures</em>'.
	 * @see apsoptions.xPPU_ChangeStructure#getOldStructures()
	 * @see #getxPPU_ChangeStructure()
	 * @generated
	 */
	EReference getxPPU_ChangeStructure_OldStructures();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeStructure#getNewStructures <em>New Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Structures</em>'.
	 * @see apsoptions.xPPU_ChangeStructure#getNewStructures()
	 * @see #getxPPU_ChangeStructure()
	 * @generated
	 */
	EReference getxPPU_ChangeStructure_NewStructures();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_RemoveStructure <em>xPPU Remove Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Remove Structure</em>'.
	 * @see apsoptions.xPPU_RemoveStructure
	 * @generated
	 */
	EClass getxPPU_RemoveStructure();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_RemoveStructure#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structures</em>'.
	 * @see apsoptions.xPPU_RemoveStructure#getStructures()
	 * @see #getxPPU_RemoveStructure()
	 * @generated
	 */
	EReference getxPPU_RemoveStructure_Structures();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_IntroduceNewInterface <em>xPPU Introduce New Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Introduce New Interface</em>'.
	 * @see apsoptions.xPPU_IntroduceNewInterface
	 * @generated
	 */
	EClass getxPPU_IntroduceNewInterface();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_IntroduceNewInterface#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see apsoptions.xPPU_IntroduceNewInterface#getInterfaces()
	 * @see #getxPPU_IntroduceNewInterface()
	 * @generated
	 */
	EReference getxPPU_IntroduceNewInterface_Interfaces();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_ChangeInterface <em>xPPU Change Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Change Interface</em>'.
	 * @see apsoptions.xPPU_ChangeInterface
	 * @generated
	 */
	EClass getxPPU_ChangeInterface();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeInterface#getOldInterfaces <em>Old Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Interfaces</em>'.
	 * @see apsoptions.xPPU_ChangeInterface#getOldInterfaces()
	 * @see #getxPPU_ChangeInterface()
	 * @generated
	 */
	EReference getxPPU_ChangeInterface_OldInterfaces();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_ChangeInterface#getNewInterfaces <em>New Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Interfaces</em>'.
	 * @see apsoptions.xPPU_ChangeInterface#getNewInterfaces()
	 * @see #getxPPU_ChangeInterface()
	 * @generated
	 */
	EReference getxPPU_ChangeInterface_NewInterfaces();

	/**
	 * Returns the meta object for class '{@link apsoptions.xPPU_RemoveInterface <em>xPPU Remove Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xPPU Remove Interface</em>'.
	 * @see apsoptions.xPPU_RemoveInterface
	 * @generated
	 */
	EClass getxPPU_RemoveInterface();

	/**
	 * Returns the meta object for the reference list '{@link apsoptions.xPPU_RemoveInterface#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see apsoptions.xPPU_RemoveInterface#getInterfaces()
	 * @see #getxPPU_RemoveInterface()
	 * @generated
	 */
	EReference getxPPU_RemoveInterface_Interfaces();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApsoptionsFactory getApsoptionsFactory();

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
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_OptionImpl <em>xPPU Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_OptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_Option()
		 * @generated
		 */
		EClass XPPU_OPTION = eINSTANCE.getxPPU_Option();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_IntroduceNewComponentImpl <em>xPPU Introduce New Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_IntroduceNewComponentImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewComponent()
		 * @generated
		 */
		EClass XPPU_INTRODUCE_NEW_COMPONENT = eINSTANCE.getxPPU_IntroduceNewComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS = eINSTANCE.getxPPU_IntroduceNewComponent_Components();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_ChangeComponentImpl <em>xPPU Change Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_ChangeComponentImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeComponent()
		 * @generated
		 */
		EClass XPPU_CHANGE_COMPONENT = eINSTANCE.getxPPU_ChangeComponent();

		/**
		 * The meta object literal for the '<em><b>Old Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_COMPONENT__OLD_COMPONENTS = eINSTANCE.getxPPU_ChangeComponent_OldComponents();

		/**
		 * The meta object literal for the '<em><b>New Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_COMPONENT__NEW_COMPONENTS = eINSTANCE.getxPPU_ChangeComponent_NewComponents();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_RemoveComponentImpl <em>xPPU Remove Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_RemoveComponentImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveComponent()
		 * @generated
		 */
		EClass XPPU_REMOVE_COMPONENT = eINSTANCE.getxPPU_RemoveComponent();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_REMOVE_COMPONENT__COMPONENTS = eINSTANCE.getxPPU_RemoveComponent_Components();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_IntroduceNewModuleImpl <em>xPPU Introduce New Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_IntroduceNewModuleImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewModule()
		 * @generated
		 */
		EClass XPPU_INTRODUCE_NEW_MODULE = eINSTANCE.getxPPU_IntroduceNewModule();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_INTRODUCE_NEW_MODULE__MODULES = eINSTANCE.getxPPU_IntroduceNewModule_Modules();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_ChangeModuleImpl <em>xPPU Change Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_ChangeModuleImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeModule()
		 * @generated
		 */
		EClass XPPU_CHANGE_MODULE = eINSTANCE.getxPPU_ChangeModule();

		/**
		 * The meta object literal for the '<em><b>Old Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_MODULE__OLD_MODULES = eINSTANCE.getxPPU_ChangeModule_OldModules();

		/**
		 * The meta object literal for the '<em><b>New Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_MODULE__NEW_MODULES = eINSTANCE.getxPPU_ChangeModule_NewModules();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_RemoveModuleImpl <em>xPPU Remove Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_RemoveModuleImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveModule()
		 * @generated
		 */
		EClass XPPU_REMOVE_MODULE = eINSTANCE.getxPPU_RemoveModule();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_REMOVE_MODULE__MODULES = eINSTANCE.getxPPU_RemoveModule_Modules();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_IntroduceNewStructureImpl <em>xPPU Introduce New Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_IntroduceNewStructureImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewStructure()
		 * @generated
		 */
		EClass XPPU_INTRODUCE_NEW_STRUCTURE = eINSTANCE.getxPPU_IntroduceNewStructure();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_INTRODUCE_NEW_STRUCTURE__STRUCTURES = eINSTANCE.getxPPU_IntroduceNewStructure_Structures();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_ChangeStructureImpl <em>xPPU Change Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_ChangeStructureImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeStructure()
		 * @generated
		 */
		EClass XPPU_CHANGE_STRUCTURE = eINSTANCE.getxPPU_ChangeStructure();

		/**
		 * The meta object literal for the '<em><b>Old Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES = eINSTANCE.getxPPU_ChangeStructure_OldStructures();

		/**
		 * The meta object literal for the '<em><b>New Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES = eINSTANCE.getxPPU_ChangeStructure_NewStructures();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_RemoveStructureImpl <em>xPPU Remove Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_RemoveStructureImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveStructure()
		 * @generated
		 */
		EClass XPPU_REMOVE_STRUCTURE = eINSTANCE.getxPPU_RemoveStructure();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_REMOVE_STRUCTURE__STRUCTURES = eINSTANCE.getxPPU_RemoveStructure_Structures();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_IntroduceNewInterfaceImpl <em>xPPU Introduce New Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_IntroduceNewInterfaceImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_IntroduceNewInterface()
		 * @generated
		 */
		EClass XPPU_INTRODUCE_NEW_INTERFACE = eINSTANCE.getxPPU_IntroduceNewInterface();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_INTRODUCE_NEW_INTERFACE__INTERFACES = eINSTANCE.getxPPU_IntroduceNewInterface_Interfaces();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_ChangeInterfaceImpl <em>xPPU Change Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_ChangeInterfaceImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_ChangeInterface()
		 * @generated
		 */
		EClass XPPU_CHANGE_INTERFACE = eINSTANCE.getxPPU_ChangeInterface();

		/**
		 * The meta object literal for the '<em><b>Old Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_INTERFACE__OLD_INTERFACES = eINSTANCE.getxPPU_ChangeInterface_OldInterfaces();

		/**
		 * The meta object literal for the '<em><b>New Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_CHANGE_INTERFACE__NEW_INTERFACES = eINSTANCE.getxPPU_ChangeInterface_NewInterfaces();

		/**
		 * The meta object literal for the '{@link apsoptions.impl.xPPU_RemoveInterfaceImpl <em>xPPU Remove Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.xPPU_RemoveInterfaceImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getxPPU_RemoveInterface()
		 * @generated
		 */
		EClass XPPU_REMOVE_INTERFACE = eINSTANCE.getxPPU_RemoveInterface();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XPPU_REMOVE_INTERFACE__INTERFACES = eINSTANCE.getxPPU_RemoveInterface_Interfaces();

	}

} //ApsoptionsPackage
