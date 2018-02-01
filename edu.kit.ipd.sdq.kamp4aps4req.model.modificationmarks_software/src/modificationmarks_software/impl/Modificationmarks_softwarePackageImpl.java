/**
 */
package modificationmarks_software.impl;

import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECModificationmarksPackage;

import modificationmarks.ModificationmarksPackage;

import modificationmarks_software.APSReqSoftwareModificationRepository;
import modificationmarks_software.APSReqSoftwareSeedModifications;
import modificationmarks_software.Modificationmarks_softwareFactory;
import modificationmarks_software.Modificationmarks_softwarePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Modificationmarks_softwarePackageImpl extends EPackageImpl implements Modificationmarks_softwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqSoftwareSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqSoftwareModificationRepositoryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modificationmarks_software.Modificationmarks_softwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Modificationmarks_softwarePackageImpl() {
		super(eNS_URI, Modificationmarks_softwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Modificationmarks_softwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Modificationmarks_softwarePackage init() {
		if (isInited) return (Modificationmarks_softwarePackage)EPackage.Registry.INSTANCE.getEPackage(Modificationmarks_softwarePackage.eNS_URI);

		// Obtain or create and register package
		Modificationmarks_softwarePackageImpl theModificationmarks_softwarePackage = (Modificationmarks_softwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Modificationmarks_softwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Modificationmarks_softwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IECModificationmarksPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModificationmarks_softwarePackage.createPackageContents();

		// Initialize created meta-data
		theModificationmarks_softwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModificationmarks_softwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Modificationmarks_softwarePackage.eNS_URI, theModificationmarks_softwarePackage);
		return theModificationmarks_softwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqSoftwareSeedModifications() {
		return apsReqSoftwareSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqSoftwareModificationRepository() {
		return apsReqSoftwareModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modificationmarks_softwareFactory getModificationmarks_softwareFactory() {
		return (Modificationmarks_softwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apsReqSoftwareSeedModificationsEClass = createEClass(APS_REQ_SOFTWARE_SEED_MODIFICATIONS);

		apsReqSoftwareModificationRepositoryEClass = createEClass(APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		IECModificationmarksPackage theIECModificationmarksPackage = (IECModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(IECModificationmarksPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theModificationmarksPackage.getAPSReqSeedModifications());
		EGenericType g2 = createEGenericType(theIECModificationmarksPackage.getIECSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqSoftwareSeedModificationsEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractKAMP4aPS4ReqModificationRepository());
		g2 = createEGenericType(theModificationmarksPackage.getAPSReqSeedModifications());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theIECModificationmarksPackage.getIECSeedModifications());
		g2.getETypeArguments().add(g3);
		apsReqSoftwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqSoftwareSeedModificationsEClass, APSReqSoftwareSeedModifications.class, "APSReqSoftwareSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSoftwareModificationRepositoryEClass, APSReqSoftwareModificationRepository.class, "APSReqSoftwareModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Modificationmarks_softwarePackageImpl
