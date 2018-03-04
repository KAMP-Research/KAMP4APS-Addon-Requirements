/**
 */
package apssoftwareoptions;

import apsoptions.ApsoptionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link apssoftwareoptions.impl.APSReqSoftwareOptionImpl <em>APS Req Software Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.impl.APSReqSoftwareOptionImpl
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqSoftwareOption()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__ID = ApsoptionsPackage.APS_REQ_OPTION__ID;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__RELATIONS = ApsoptionsPackage.APS_REQ_OPTION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Conflicts With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__CONFLICTS_WITH = ApsoptionsPackage.APS_REQ_OPTION__CONFLICTS_WITH;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__HAS_CONFLICTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_CONFLICTS;

	/**
	 * The feature id for the '<em><b>Duplicate Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__DUPLICATE_OF = ApsoptionsPackage.APS_REQ_OPTION__DUPLICATE_OF;

	/**
	 * The feature id for the '<em><b>Has Duplicates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__HAS_DUPLICATES = ApsoptionsPackage.APS_REQ_OPTION__HAS_DUPLICATES;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__DEPENDS_ON = ApsoptionsPackage.APS_REQ_OPTION__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Has Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__HAS_DEPENDENTS = ApsoptionsPackage.APS_REQ_OPTION__HAS_DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Parent Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__PARENT_OF = ApsoptionsPackage.APS_REQ_OPTION__PARENT_OF;

	/**
	 * The feature id for the '<em><b>Subpart Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__SUBPART_OF = ApsoptionsPackage.APS_REQ_OPTION__SUBPART_OF;

	/**
	 * The feature id for the '<em><b>Trigger Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__TRIGGER_OF = ApsoptionsPackage.APS_REQ_OPTION__TRIGGER_OF;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__TRIGGERED_BY = ApsoptionsPackage.APS_REQ_OPTION__TRIGGERED_BY;

	/**
	 * The feature id for the '<em><b>Resolves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__RESOLVES = ApsoptionsPackage.APS_REQ_OPTION__RESOLVES;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Alternative To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__ALTERNATIVE_TO = ApsoptionsPackage.APS_REQ_OPTION__ALTERNATIVE_TO;

	/**
	 * The feature id for the '<em><b>Has Alternatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__HAS_ALTERNATIVES = ApsoptionsPackage.APS_REQ_OPTION__HAS_ALTERNATIVES;

	/**
	 * The feature id for the '<em><b>Could Resolve</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__COULD_RESOLVE = ApsoptionsPackage.APS_REQ_OPTION__COULD_RESOLVE;

	/**
	 * The feature id for the '<em><b>Could Be Resolved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__COULD_BE_RESOLVED_BY = ApsoptionsPackage.APS_REQ_OPTION__COULD_BE_RESOLVED_BY;

	/**
	 * The feature id for the '<em><b>Stakeholder Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__STAKEHOLDER_OF = ApsoptionsPackage.APS_REQ_OPTION__STAKEHOLDER_OF;

	/**
	 * The feature id for the '<em><b>Has Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__HAS_STAKEHOLDERS = ApsoptionsPackage.APS_REQ_OPTION__HAS_STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__SELECTED = ApsoptionsPackage.APS_REQ_OPTION__SELECTED;

	/**
	 * The feature id for the '<em><b>Selected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__SELECTED_BY = ApsoptionsPackage.APS_REQ_OPTION__SELECTED_BY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__DESCRIPTION = ApsoptionsPackage.APS_REQ_OPTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__KEYWORDS = ApsoptionsPackage.APS_REQ_OPTION__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__RATIONALE = ApsoptionsPackage.APS_REQ_OPTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Is Modelled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__IS_MODELLED = ApsoptionsPackage.APS_REQ_OPTION__IS_MODELLED;

	/**
	 * The feature id for the '<em><b>Is Implemented</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__IS_IMPLEMENTED = ApsoptionsPackage.APS_REQ_OPTION__IS_IMPLEMENTED;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__TIME_STAMP = ApsoptionsPackage.APS_REQ_OPTION__TIME_STAMP;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__EFFECTS = ApsoptionsPackage.APS_REQ_OPTION__EFFECTS;

	/**
	 * The feature id for the '<em><b>Used Terms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__USED_TERMS = ApsoptionsPackage.APS_REQ_OPTION__USED_TERMS;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Iec Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iec Component Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Software Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apssoftwareoptions.IECComponentType <em>IEC Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apssoftwareoptions.IECComponentType
	 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getIECComponentType()
	 * @generated
	 */
	int IEC_COMPONENT_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link apssoftwareoptions.APSReqSoftwareOption <em>APS Req Software Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Option</em>'.
	 * @see apssoftwareoptions.APSReqSoftwareOption
	 * @generated
	 */
	EClass getAPSReqSoftwareOption();

	/**
	 * Returns the meta object for the reference list '{@link apssoftwareoptions.APSReqSoftwareOption#getIecComponents <em>Iec Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iec Components</em>'.
	 * @see apssoftwareoptions.APSReqSoftwareOption#getIecComponents()
	 * @see #getAPSReqSoftwareOption()
	 * @generated
	 */
	EReference getAPSReqSoftwareOption_IecComponents();

	/**
	 * Returns the meta object for the attribute '{@link apssoftwareoptions.APSReqSoftwareOption#getIecComponentType <em>Iec Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iec Component Type</em>'.
	 * @see apssoftwareoptions.APSReqSoftwareOption#getIecComponentType()
	 * @see #getAPSReqSoftwareOption()
	 * @generated
	 */
	EAttribute getAPSReqSoftwareOption_IecComponentType();

	/**
	 * Returns the meta object for enum '{@link apssoftwareoptions.IECComponentType <em>IEC Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IEC Component Type</em>'.
	 * @see apssoftwareoptions.IECComponentType
	 * @generated
	 */
	EEnum getIECComponentType();

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
		 * The meta object literal for the '{@link apssoftwareoptions.impl.APSReqSoftwareOptionImpl <em>APS Req Software Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.impl.APSReqSoftwareOptionImpl
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getAPSReqSoftwareOption()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_OPTION = eINSTANCE.getAPSReqSoftwareOption();

		/**
		 * The meta object literal for the '<em><b>Iec Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS = eINSTANCE.getAPSReqSoftwareOption_IecComponents();

		/**
		 * The meta object literal for the '<em><b>Iec Component Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE = eINSTANCE.getAPSReqSoftwareOption_IecComponentType();

		/**
		 * The meta object literal for the '{@link apssoftwareoptions.IECComponentType <em>IEC Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apssoftwareoptions.IECComponentType
		 * @see apssoftwareoptions.impl.ApssoftwareoptionsPackageImpl#getIECComponentType()
		 * @generated
		 */
		EEnum IEC_COMPONENT_TYPE = eINSTANCE.getIECComponentType();

	}

} //ApssoftwareoptionsPackage
