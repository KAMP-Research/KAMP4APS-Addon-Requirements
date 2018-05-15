/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqComponentOption;
import apshardwareoptions.APSReqInterfaceOption;
import apshardwareoptions.APSReqModuleOption;
import apshardwareoptions.APSReqStructureOption;
import apshardwareoptions.ApshardwareoptionsFactory;
import apshardwareoptions.ApshardwareoptionsPackage;

import apsoptions.ApsoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApshardwareoptionsPackageImpl extends EPackageImpl implements ApshardwareoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqStructureOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModuleOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqComponentOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqInterfaceOptionEClass = null;

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
	 * @see apshardwareoptions.ApshardwareoptionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApshardwareoptionsPackageImpl() {
		super(eNS_URI, ApshardwareoptionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApshardwareoptionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApshardwareoptionsPackage init() {
		if (isInited) return (ApshardwareoptionsPackage)EPackage.Registry.INSTANCE.getEPackage(ApshardwareoptionsPackage.eNS_URI);

		// Obtain or create and register package
		ApshardwareoptionsPackageImpl theApshardwareoptionsPackage = (ApshardwareoptionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApshardwareoptionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApshardwareoptionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		apsPackage.eINSTANCE.eClass();
		ApsoptionsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApshardwareoptionsPackage.createPackageContents();

		// Initialize created meta-data
		theApshardwareoptionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApshardwareoptionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApshardwareoptionsPackage.eNS_URI, theApshardwareoptionsPackage);
		return theApshardwareoptionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqStructureOption() {
		return apsReqStructureOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqStructureOption_Structures() {
		return (EReference)apsReqStructureOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModuleOption() {
		return apsReqModuleOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqModuleOption_Modules() {
		return (EReference)apsReqModuleOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqComponentOption() {
		return apsReqComponentOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqComponentOption_Components() {
		return (EReference)apsReqComponentOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqInterfaceOption() {
		return apsReqInterfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqInterfaceOption_Interfaces() {
		return (EReference)apsReqInterfaceOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApshardwareoptionsFactory getApshardwareoptionsFactory() {
		return (ApshardwareoptionsFactory)getEFactoryInstance();
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
		apsReqStructureOptionEClass = createEClass(APS_REQ_STRUCTURE_OPTION);
		createEReference(apsReqStructureOptionEClass, APS_REQ_STRUCTURE_OPTION__STRUCTURES);

		apsReqModuleOptionEClass = createEClass(APS_REQ_MODULE_OPTION);
		createEReference(apsReqModuleOptionEClass, APS_REQ_MODULE_OPTION__MODULES);

		apsReqComponentOptionEClass = createEClass(APS_REQ_COMPONENT_OPTION);
		createEReference(apsReqComponentOptionEClass, APS_REQ_COMPONENT_OPTION__COMPONENTS);

		apsReqInterfaceOptionEClass = createEClass(APS_REQ_INTERFACE_OPTION);
		createEReference(apsReqInterfaceOptionEClass, APS_REQ_INTERFACE_OPTION__INTERFACES);
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
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqStructureOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqModuleOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqComponentOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqInterfaceOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqStructureOptionEClass, APSReqStructureOption.class, "APSReqStructureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqStructureOption_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, APSReqStructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqModuleOptionEClass, APSReqModuleOption.class, "APSReqModuleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqModuleOption_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, APSReqModuleOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqComponentOptionEClass, APSReqComponentOption.class, "APSReqComponentOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqComponentOption_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, APSReqComponentOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqInterfaceOptionEClass, APSReqInterfaceOption.class, "APSReqInterfaceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqInterfaceOption_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, APSReqInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApshardwareoptionsPackageImpl
