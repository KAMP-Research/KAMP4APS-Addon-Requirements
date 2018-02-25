/**
 */
package apsoptions;

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
 *   <li>each operation of each class,</li>
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
	String eNS_URI = "http://www.example.org/apsoptions";

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
	 * The meta object id for the '{@link apsoptions.impl.APSReqOptionImpl <em>APS Req Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqOptionImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOption()
	 * @generated
	 */
	int APS_REQ_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION__REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Option Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION__OPTION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>APS Req Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link apsoptions.impl.APSReqOptionRepositoryImpl <em>APS Req Option Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.impl.APSReqOptionRepositoryImpl
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOptionRepository()
	 * @generated
	 */
	int APS_REQ_OPTION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Apsreqoption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION_REPOSITORY__APSREQOPTION = 0;

	/**
	 * The number of structural features of the '<em>APS Req Option Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_OPTION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link apsoptions.OptionType <em>Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see apsoptions.OptionType
	 * @see apsoptions.impl.ApsoptionsPackageImpl#getOptionType()
	 * @generated
	 */
	int OPTION_TYPE = 2;

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqOption <em>APS Req Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Option</em>'.
	 * @see apsoptions.APSReqOption
	 * @generated
	 */
	EClass getAPSReqOption();

	/**
	 * Returns the meta object for the reference '{@link apsoptions.APSReqOption#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Option</em>'.
	 * @see apsoptions.APSReqOption#getOption()
	 * @see #getAPSReqOption()
	 * @generated
	 */
	EReference getAPSReqOption_Option();

	/**
	 * Returns the meta object for the container reference '{@link apsoptions.APSReqOption#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see apsoptions.APSReqOption#getRepository()
	 * @see #getAPSReqOption()
	 * @generated
	 */
	EReference getAPSReqOption_Repository();

	/**
	 * Returns the meta object for the attribute '{@link apsoptions.APSReqOption#getOptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option Type</em>'.
	 * @see apsoptions.APSReqOption#getOptionType()
	 * @see #getAPSReqOption()
	 * @generated
	 */
	EAttribute getAPSReqOption_OptionType();

	/**
	 * Returns the meta object for class '{@link apsoptions.APSReqOptionRepository <em>APS Req Option Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Option Repository</em>'.
	 * @see apsoptions.APSReqOptionRepository
	 * @generated
	 */
	EClass getAPSReqOptionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link apsoptions.APSReqOptionRepository#getApsreqoption <em>Apsreqoption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apsreqoption</em>'.
	 * @see apsoptions.APSReqOptionRepository#getApsreqoption()
	 * @see #getAPSReqOptionRepository()
	 * @generated
	 */
	EReference getAPSReqOptionRepository_Apsreqoption();

	/**
	 * Returns the meta object for enum '{@link apsoptions.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Option Type</em>'.
	 * @see apsoptions.OptionType
	 * @generated
	 */
	EEnum getOptionType();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqOptionImpl <em>APS Req Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqOptionImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOption()
		 * @generated
		 */
		EClass APS_REQ_OPTION = eINSTANCE.getAPSReqOption();
		/**
		 * The meta object literal for the '<em><b>Option</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_OPTION__OPTION = eINSTANCE.getAPSReqOption_Option();
		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_OPTION__REPOSITORY = eINSTANCE.getAPSReqOption_Repository();
		/**
		 * The meta object literal for the '<em><b>Option Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APS_REQ_OPTION__OPTION_TYPE = eINSTANCE.getAPSReqOption_OptionType();
		/**
		 * The meta object literal for the '{@link apsoptions.impl.APSReqOptionRepositoryImpl <em>APS Req Option Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.impl.APSReqOptionRepositoryImpl
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getAPSReqOptionRepository()
		 * @generated
		 */
		EClass APS_REQ_OPTION_REPOSITORY = eINSTANCE.getAPSReqOptionRepository();
		/**
		 * The meta object literal for the '<em><b>Apsreqoption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APS_REQ_OPTION_REPOSITORY__APSREQOPTION = eINSTANCE.getAPSReqOptionRepository_Apsreqoption();
		/**
		 * The meta object literal for the '{@link apsoptions.OptionType <em>Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see apsoptions.OptionType
		 * @see apsoptions.impl.ApsoptionsPackageImpl#getOptionType()
		 * @generated
		 */
		EEnum OPTION_TYPE = eINSTANCE.getOptionType();

	}

} //ApsoptionsPackage
