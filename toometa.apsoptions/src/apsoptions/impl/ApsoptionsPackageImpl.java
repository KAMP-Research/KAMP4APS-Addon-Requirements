/**
 */
package apsoptions.impl;

import apsoptions.APSReqOption;
import apsoptions.ApsoptionsFactory;
import apsoptions.ApsoptionsPackage;

import archoptions.ArchoptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApsoptionsPackageImpl extends EPackageImpl implements ApsoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqOptionEClass = null;

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
	 * @see apsoptions.ApsoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApsoptionsPackageImpl() {
		super(eNS_URI, ApsoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApsoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApsoptionsPackage init() {
		if (isInited) return (ApsoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ApsoptionsPackage.eNS_URI);

		// Obtain or create and register package
		ApsoptionsPackageImpl theApsoptionsPackage = (ApsoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApsoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApsoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArchoptionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApsoptionsPackage.createPackageContents();

		// Initialize created meta-data
		theApsoptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApsoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApsoptionsPackage.eNS_URI, theApsoptionsPackage);
		return theApsoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqOption() {
		return apsReqOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsoptionsFactory getApsoptionsFactory() {
		return (ApsoptionsFactory)getEFactoryInstance();
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
		apsReqOptionEClass = createEClass(APS_REQ_OPTION);
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
		ArchoptionsPackage theArchoptionsPackage = (ArchoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ArchoptionsPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(apsReqOptionEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqOptionEClass.getESuperTypes().add(theArchoptionsPackage.getArchOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqOptionEClass, APSReqOption.class, "APSReqOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApsoptionsPackageImpl
