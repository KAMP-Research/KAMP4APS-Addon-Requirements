/**
 */
package apshardwareoptions;

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
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__OPTION = ApsoptionsPackage.APS_REQ_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__REPOSITORY = ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__OPTION_TYPE = ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__ENTITIES = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION__ENTITY_TYPE = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Hardware Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_HARDWARE_OPTION_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apshardwareoptions.EntityType <em>Entity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.EntityType
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 1;


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
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqHardwareOption#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqHardwareOption#getEntities()
	 * @see #getAPSReqHardwareOption()
	 * @generated
	 */
	EReference getAPSReqHardwareOption_Entities();

	/**
	 * Returns the meta object for the attribute '{@link apshardwareoptions.APSReqHardwareOption#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see apshardwareoptions.APSReqHardwareOption#getEntityType()
	 * @see #getAPSReqHardwareOption()
	 * @generated
	 */
	EAttribute getAPSReqHardwareOption_EntityType();

	/**
	 * Returns the meta object for enum '{@link apshardwareoptions.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Type</em>'.
	 * @see apshardwareoptions.EntityType
	 * @generated
	 */
	EEnum getEntityType();

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
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_HARDWARE_OPTION__ENTITIES = eINSTANCE.getAPSReqHardwareOption_Entities();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APS_REQ_HARDWARE_OPTION__ENTITY_TYPE = eINSTANCE.getAPSReqHardwareOption_EntityType();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.EntityType <em>Entity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.EntityType
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getEntityType()
		 * @generated
		 */
		EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

	}

} //ApshardwareoptionsPackage
