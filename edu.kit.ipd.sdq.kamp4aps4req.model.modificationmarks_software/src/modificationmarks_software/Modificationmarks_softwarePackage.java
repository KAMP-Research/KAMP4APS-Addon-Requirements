/**
 */
package modificationmarks_software;

import modificationmarks.ModificationmarksPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see modificationmarks_software.Modificationmarks_softwareFactory
 * @model kind="package"
 * @generated
 */
public interface Modificationmarks_softwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modificationmarks_software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modificationmarks_software";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modificationmarks_software";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modificationmarks_softwarePackage eINSTANCE = modificationmarks_software.impl.Modificationmarks_softwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl <em>APS Req Software Seed Modifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl
	 * @see modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareSeedModifications()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS = 0;

	/**
	 * The feature id for the '<em><b>Requirement Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Decision Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Option Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Apsiec Seed Modifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS;

	/**
	 * The number of structural features of the '<em>APS Req Software Seed Modifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_SEED_MODIFICATIONS_FEATURE_COUNT = ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl <em>APS Req Software Modification Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl
	 * @see modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareModificationRepository()
	 * @generated
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Seed Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS = ModificationmarksPackage.ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY__SEED_MODIFICATIONS;

	/**
	 * The feature id for the '<em><b>Change Propagation Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS = ModificationmarksPackage.ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY__CHANGE_PROPAGATION_STEPS;

	/**
	 * The number of structural features of the '<em>APS Req Software Modification Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY_FEATURE_COUNT = ModificationmarksPackage.ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link modificationmarks_software.APSReqSoftwareSeedModifications <em>APS Req Software Seed Modifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Seed Modifications</em>'.
	 * @see modificationmarks_software.APSReqSoftwareSeedModifications
	 * @generated
	 */
	EClass getAPSReqSoftwareSeedModifications();

	/**
	 * Returns the meta object for class '{@link modificationmarks_software.APSReqSoftwareModificationRepository <em>APS Req Software Modification Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APS Req Software Modification Repository</em>'.
	 * @see modificationmarks_software.APSReqSoftwareModificationRepository
	 * @generated
	 */
	EClass getAPSReqSoftwareModificationRepository();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Modificationmarks_softwareFactory getModificationmarks_softwareFactory();

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
		 * The meta object literal for the '{@link modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl <em>APS Req Software Seed Modifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modificationmarks_software.impl.APSReqSoftwareSeedModificationsImpl
		 * @see modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareSeedModifications()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_SEED_MODIFICATIONS = eINSTANCE.getAPSReqSoftwareSeedModifications();

		/**
		 * The meta object literal for the '{@link modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl <em>APS Req Software Modification Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modificationmarks_software.impl.APSReqSoftwareModificationRepositoryImpl
		 * @see modificationmarks_software.impl.Modificationmarks_softwarePackageImpl#getAPSReqSoftwareModificationRepository()
		 * @generated
		 */
		EClass APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY = eINSTANCE.getAPSReqSoftwareModificationRepository();

	}

} //Modificationmarks_softwarePackage
