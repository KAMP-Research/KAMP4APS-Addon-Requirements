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
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqIntroduceNewEntititesImpl <em>APS Req Introduce New Entitites</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqIntroduceNewEntititesImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewEntitites()
	 * @generated
	 */
	int APS_REQ_INTRODUCE_NEW_ENTITITES = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_ENTITITES__OPTION = ApsoptionsPackage.APS_REQ_INTRODUE_NEW_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_ENTITITES__REPOSITORY = ApsoptionsPackage.APS_REQ_INTRODUE_NEW_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_ENTITITES__ENTITIES = ApsoptionsPackage.APS_REQ_INTRODUE_NEW_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Introduce New Entitites</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_INTRODUCE_NEW_ENTITITES_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_INTRODUE_NEW_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqRemoveEntitiesImpl <em>APS Req Remove Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqRemoveEntitiesImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveEntities()
	 * @generated
	 */
	int APS_REQ_REMOVE_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_ENTITIES__OPTION = ApsoptionsPackage.APS_REQ_REMOVE_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_ENTITIES__REPOSITORY = ApsoptionsPackage.APS_REQ_REMOVE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_ENTITIES__ENTITIES = ApsoptionsPackage.APS_REQ_REMOVE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Remove Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REMOVE_ENTITIES_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_REMOVE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqReplaceEntitiesImpl <em>APS Req Replace Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqReplaceEntitiesImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceEntities()
	 * @generated
	 */
	int APS_REQ_REPLACE_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_ENTITIES__OPTION = ApsoptionsPackage.APS_REQ_REPLACE_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_ENTITIES__REPOSITORY = ApsoptionsPackage.APS_REQ_REPLACE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Old Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES = ApsoptionsPackage.APS_REQ_REPLACE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES = ApsoptionsPackage.APS_REQ_REPLACE_OPTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>APS Req Replace Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_REPLACE_ENTITIES_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_REPLACE_OPTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link apshardwareoptions.impl.APSReqChangeEntitiesImpl <em>APS Req Change Entities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apshardwareoptions.impl.APSReqChangeEntitiesImpl
	 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeEntities()
	 * @generated
	 */
	int APS_REQ_CHANGE_ENTITIES = 3;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_ENTITIES__OPTION = ApsoptionsPackage.APS_REQ_CHANGE_OPTION__OPTION;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_ENTITIES__REPOSITORY = ApsoptionsPackage.APS_REQ_CHANGE_OPTION__REPOSITORY;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_ENTITIES__ENTITIES = ApsoptionsPackage.APS_REQ_CHANGE_OPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>APS Req Change Entities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_CHANGE_ENTITIES_FEATURE_COUNT = ApsoptionsPackage.APS_REQ_CHANGE_OPTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqIntroduceNewEntitites <em>APS Req Introduce New Entitites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Introduce New Entitites</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewEntitites
	 * @generated
	 */
	EClass getAPSReqIntroduceNewEntitites();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqIntroduceNewEntitites#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqIntroduceNewEntitites#getEntities()
	 * @see #getAPSReqIntroduceNewEntitites()
	 * @generated
	 */
	EReference getAPSReqIntroduceNewEntitites_Entities();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqRemoveEntities <em>APS Req Remove Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Remove Entities</em>'.
	 * @see apshardwareoptions.APSReqRemoveEntities
	 * @generated
	 */
	EClass getAPSReqRemoveEntities();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqRemoveEntities#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqRemoveEntities#getEntities()
	 * @see #getAPSReqRemoveEntities()
	 * @generated
	 */
	EReference getAPSReqRemoveEntities_Entities();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqReplaceEntities <em>APS Req Replace Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Replace Entities</em>'.
	 * @see apshardwareoptions.APSReqReplaceEntities
	 * @generated
	 */
	EClass getAPSReqReplaceEntities();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqReplaceEntities#getOldEntities <em>Old Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Old Entities</em>'.
	 * @see apshardwareoptions.APSReqReplaceEntities#getOldEntities()
	 * @see #getAPSReqReplaceEntities()
	 * @generated
	 */
	EReference getAPSReqReplaceEntities_OldEntities();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqReplaceEntities#getNewEntities <em>New Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>New Entities</em>'.
	 * @see apshardwareoptions.APSReqReplaceEntities#getNewEntities()
	 * @see #getAPSReqReplaceEntities()
	 * @generated
	 */
	EReference getAPSReqReplaceEntities_NewEntities();

	/**
	 * Returns the meta object for class '{@link apshardwareoptions.APSReqChangeEntities <em>APS Req Change Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Change Entities</em>'.
	 * @see apshardwareoptions.APSReqChangeEntities
	 * @generated
	 */
	EClass getAPSReqChangeEntities();

	/**
	 * Returns the meta object for the reference list '{@link apshardwareoptions.APSReqChangeEntities#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see apshardwareoptions.APSReqChangeEntities#getEntities()
	 * @see #getAPSReqChangeEntities()
	 * @generated
	 */
	EReference getAPSReqChangeEntities_Entities();

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
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqIntroduceNewEntititesImpl <em>APS Req Introduce New Entitites</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqIntroduceNewEntititesImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqIntroduceNewEntitites()
		 * @generated
		 */
		EClass APS_REQ_INTRODUCE_NEW_ENTITITES = eINSTANCE.getAPSReqIntroduceNewEntitites();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_INTRODUCE_NEW_ENTITITES__ENTITIES = eINSTANCE.getAPSReqIntroduceNewEntitites_Entities();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqRemoveEntitiesImpl <em>APS Req Remove Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqRemoveEntitiesImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqRemoveEntities()
		 * @generated
		 */
		EClass APS_REQ_REMOVE_ENTITIES = eINSTANCE.getAPSReqRemoveEntities();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REMOVE_ENTITIES__ENTITIES = eINSTANCE.getAPSReqRemoveEntities_Entities();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqReplaceEntitiesImpl <em>APS Req Replace Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqReplaceEntitiesImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqReplaceEntities()
		 * @generated
		 */
		EClass APS_REQ_REPLACE_ENTITIES = eINSTANCE.getAPSReqReplaceEntities();

		/**
		 * The meta object literal for the '<em><b>Old Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES = eINSTANCE.getAPSReqReplaceEntities_OldEntities();

		/**
		 * The meta object literal for the '<em><b>New Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES = eINSTANCE.getAPSReqReplaceEntities_NewEntities();

		/**
		 * The meta object literal for the '{@link apshardwareoptions.impl.APSReqChangeEntitiesImpl <em>APS Req Change Entities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apshardwareoptions.impl.APSReqChangeEntitiesImpl
		 * @see apshardwareoptions.impl.ApshardwareoptionsPackageImpl#getAPSReqChangeEntities()
		 * @generated
		 */
		EClass APS_REQ_CHANGE_ENTITIES = eINSTANCE.getAPSReqChangeEntities();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_CHANGE_ENTITIES__ENTITIES = eINSTANCE.getAPSReqChangeEntities_Entities();

	}

} //ApshardwareoptionsPackage
