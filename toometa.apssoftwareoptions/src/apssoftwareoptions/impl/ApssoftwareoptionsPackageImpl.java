/**
 */
package apssoftwareoptions.impl;

import apsoptions.ApsoptionsPackage;

import apssoftwareoptions.APSReqSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsFactory;
import apssoftwareoptions.ApssoftwareoptionsPackage;
import apssoftwareoptions.IECComponentType;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApssoftwareoptionsPackageImpl extends EPackageImpl implements ApssoftwareoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqSoftwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iecComponentTypeEEnum = null;

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
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApssoftwareoptionsPackageImpl() {
		super(eNS_URI, ApssoftwareoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApssoftwareoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApssoftwareoptionsPackage init() {
		if (isInited) return (ApssoftwareoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ApssoftwareoptionsPackage.eNS_URI);

		// Obtain or create and register package
		ApssoftwareoptionsPackageImpl theApssoftwareoptionsPackage = (ApssoftwareoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApssoftwareoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApssoftwareoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApsoptionsPackage.eINSTANCE.eClass();
		IECRepositoryPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApssoftwareoptionsPackage.createPackageContents();

		// Initialize created meta-data
		theApssoftwareoptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApssoftwareoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApssoftwareoptionsPackage.eNS_URI, theApssoftwareoptionsPackage);
		return theApssoftwareoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqSoftwareOption() {
		return apsReqSoftwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareOption_IecComponents() {
		return (EReference)apsReqSoftwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAPSReqSoftwareOption_IecComponentType() {
		return (EAttribute)apsReqSoftwareOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIECComponentType() {
		return iecComponentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApssoftwareoptionsFactory getApssoftwareoptionsFactory() {
		return (ApssoftwareoptionsFactory)getEFactoryInstance();
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
		apsReqSoftwareOptionEClass = createEClass(APS_REQ_SOFTWARE_OPTION);
		createEReference(apsReqSoftwareOptionEClass, APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS);
		createEAttribute(apsReqSoftwareOptionEClass, APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE);

		// Create enums
		iecComponentTypeEEnum = createEEnum(IEC_COMPONENT_TYPE);
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
		ApsoptionsPackage theApsoptionsPackage = (ApsoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ApsoptionsPackage.eNS_URI);
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqSoftwareOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqSoftwareOptionEClass, APSReqSoftwareOption.class, "APSReqSoftwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqSoftwareOption_IecComponents(), theIECRepositoryPackage.getIECComponent(), null, "iecComponents", null, 0, -1, APSReqSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAPSReqSoftwareOption_IecComponentType(), this.getIECComponentType(), "iecComponentType", null, 1, 1, APSReqSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(iecComponentTypeEEnum, IECComponentType.class, "IECComponentType");
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.PROGRAM);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.CONFIGURATION);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.FUNCTION_BLOCK);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.FUNCTION);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.GLOBAL_VARIABLE);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.INTERFACE);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.METHOD);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.ABSTRACT_METHOD);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.PROPERTY);
		addEEnumLiteral(iecComponentTypeEEnum, IECComponentType.ABSTRACT_PROPERTY);

		// Create resource
		createResource(eNS_URI);
	}

} //ApssoftwareoptionsPackageImpl
