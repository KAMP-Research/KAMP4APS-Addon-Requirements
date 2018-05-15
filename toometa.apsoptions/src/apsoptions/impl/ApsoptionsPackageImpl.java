/**
 */
package apsoptions.impl;

import apsoptions.APSReqOption;
import apsoptions.ApsoptionsFactory;
import apsoptions.ApsoptionsPackage;
import apsoptions.OptionType;

import archoptions.ArchoptionsPackage;

import options.OptionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optionTypeEEnum = null;

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
	public EAttribute getAPSReqOption_OptionType() {
		return (EAttribute)apsReqOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOptionType() {
		return optionTypeEEnum;
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
		createEAttribute(apsReqOptionEClass, APS_REQ_OPTION__OPTION_TYPE);

		// Create enums
		optionTypeEEnum = createEEnum(OPTION_TYPE);
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
		OptionsPackage theOptionsPackage = (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqOptionEClass.getESuperTypes().add(theOptionsPackage.getOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqOptionEClass, APSReqOption.class, "APSReqOption", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAPSReqOption_OptionType(), this.getOptionType(), "optionType", null, 1, 1, APSReqOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(optionTypeEEnum, OptionType.class, "OptionType");
		addEEnumLiteral(optionTypeEEnum, OptionType.INTRODUCE_NEW);
		addEEnumLiteral(optionTypeEEnum, OptionType.REMOVE);
		addEEnumLiteral(optionTypeEEnum, OptionType.CHANGE);

		// Create resource
		createResource(eNS_URI);
	}

} //ApsoptionsPackageImpl
