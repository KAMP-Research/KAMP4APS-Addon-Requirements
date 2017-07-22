/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsFactory;
import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_ChangeComponent;
import apsoptions.xPPU_ChangeInterface;
import apsoptions.xPPU_ChangeModule;
import apsoptions.xPPU_ChangeStructure;
import apsoptions.xPPU_IntroduceNewComponent;
import apsoptions.xPPU_IntroduceNewInterface;
import apsoptions.xPPU_IntroduceNewModule;
import apsoptions.xPPU_IntroduceNewStructure;
import apsoptions.xPPU_Option;
import apsoptions.xPPU_RemoveComponent;
import apsoptions.xPPU_RemoveInterface;
import apsoptions.xPPU_RemoveModule;
import apsoptions.xPPU_RemoveStructure;

import archoptions.ArchoptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.XPPUPackage;

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
	private EClass xPPU_OptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_IntroduceNewComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_ChangeComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_RemoveComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_IntroduceNewModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_ChangeModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_RemoveModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_IntroduceNewStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_ChangeStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_RemoveStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_IntroduceNewInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_ChangeInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPPU_RemoveInterfaceEClass = null;

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
		XPPUPackage.eINSTANCE.eClass();

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
	public EClass getxPPU_Option() {
		return xPPU_OptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_IntroduceNewComponent() {
		return xPPU_IntroduceNewComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_IntroduceNewComponent_Components() {
		return (EReference)xPPU_IntroduceNewComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_ChangeComponent() {
		return xPPU_ChangeComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeComponent_OldComponents() {
		return (EReference)xPPU_ChangeComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeComponent_NewComponents() {
		return (EReference)xPPU_ChangeComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_RemoveComponent() {
		return xPPU_RemoveComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_RemoveComponent_Components() {
		return (EReference)xPPU_RemoveComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_IntroduceNewModule() {
		return xPPU_IntroduceNewModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_IntroduceNewModule_Modules() {
		return (EReference)xPPU_IntroduceNewModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_ChangeModule() {
		return xPPU_ChangeModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeModule_OldModules() {
		return (EReference)xPPU_ChangeModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeModule_NewModules() {
		return (EReference)xPPU_ChangeModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_RemoveModule() {
		return xPPU_RemoveModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_RemoveModule_Modules() {
		return (EReference)xPPU_RemoveModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_IntroduceNewStructure() {
		return xPPU_IntroduceNewStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_IntroduceNewStructure_Structures() {
		return (EReference)xPPU_IntroduceNewStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_ChangeStructure() {
		return xPPU_ChangeStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeStructure_OldStructures() {
		return (EReference)xPPU_ChangeStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeStructure_NewStructures() {
		return (EReference)xPPU_ChangeStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_RemoveStructure() {
		return xPPU_RemoveStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_RemoveStructure_Structures() {
		return (EReference)xPPU_RemoveStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_IntroduceNewInterface() {
		return xPPU_IntroduceNewInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_IntroduceNewInterface_Interfaces() {
		return (EReference)xPPU_IntroduceNewInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_ChangeInterface() {
		return xPPU_ChangeInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeInterface_OldInterfaces() {
		return (EReference)xPPU_ChangeInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_ChangeInterface_NewInterfaces() {
		return (EReference)xPPU_ChangeInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxPPU_RemoveInterface() {
		return xPPU_RemoveInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getxPPU_RemoveInterface_Interfaces() {
		return (EReference)xPPU_RemoveInterfaceEClass.getEStructuralFeatures().get(0);
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
		xPPU_OptionEClass = createEClass(XPPU_OPTION);

		xPPU_IntroduceNewComponentEClass = createEClass(XPPU_INTRODUCE_NEW_COMPONENT);
		createEReference(xPPU_IntroduceNewComponentEClass, XPPU_INTRODUCE_NEW_COMPONENT__COMPONENTS);

		xPPU_ChangeComponentEClass = createEClass(XPPU_CHANGE_COMPONENT);
		createEReference(xPPU_ChangeComponentEClass, XPPU_CHANGE_COMPONENT__OLD_COMPONENTS);
		createEReference(xPPU_ChangeComponentEClass, XPPU_CHANGE_COMPONENT__NEW_COMPONENTS);

		xPPU_RemoveComponentEClass = createEClass(XPPU_REMOVE_COMPONENT);
		createEReference(xPPU_RemoveComponentEClass, XPPU_REMOVE_COMPONENT__COMPONENTS);

		xPPU_IntroduceNewModuleEClass = createEClass(XPPU_INTRODUCE_NEW_MODULE);
		createEReference(xPPU_IntroduceNewModuleEClass, XPPU_INTRODUCE_NEW_MODULE__MODULES);

		xPPU_ChangeModuleEClass = createEClass(XPPU_CHANGE_MODULE);
		createEReference(xPPU_ChangeModuleEClass, XPPU_CHANGE_MODULE__OLD_MODULES);
		createEReference(xPPU_ChangeModuleEClass, XPPU_CHANGE_MODULE__NEW_MODULES);

		xPPU_RemoveModuleEClass = createEClass(XPPU_REMOVE_MODULE);
		createEReference(xPPU_RemoveModuleEClass, XPPU_REMOVE_MODULE__MODULES);

		xPPU_IntroduceNewStructureEClass = createEClass(XPPU_INTRODUCE_NEW_STRUCTURE);
		createEReference(xPPU_IntroduceNewStructureEClass, XPPU_INTRODUCE_NEW_STRUCTURE__STRUCTURES);

		xPPU_ChangeStructureEClass = createEClass(XPPU_CHANGE_STRUCTURE);
		createEReference(xPPU_ChangeStructureEClass, XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES);
		createEReference(xPPU_ChangeStructureEClass, XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES);

		xPPU_RemoveStructureEClass = createEClass(XPPU_REMOVE_STRUCTURE);
		createEReference(xPPU_RemoveStructureEClass, XPPU_REMOVE_STRUCTURE__STRUCTURES);

		xPPU_IntroduceNewInterfaceEClass = createEClass(XPPU_INTRODUCE_NEW_INTERFACE);
		createEReference(xPPU_IntroduceNewInterfaceEClass, XPPU_INTRODUCE_NEW_INTERFACE__INTERFACES);

		xPPU_ChangeInterfaceEClass = createEClass(XPPU_CHANGE_INTERFACE);
		createEReference(xPPU_ChangeInterfaceEClass, XPPU_CHANGE_INTERFACE__OLD_INTERFACES);
		createEReference(xPPU_ChangeInterfaceEClass, XPPU_CHANGE_INTERFACE__NEW_INTERFACES);

		xPPU_RemoveInterfaceEClass = createEClass(XPPU_REMOVE_INTERFACE);
		createEReference(xPPU_RemoveInterfaceEClass, XPPU_REMOVE_INTERFACE__INTERFACES);
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
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xPPU_OptionEClass.getESuperTypes().add(theArchoptionsPackage.getArchOption());
		xPPU_IntroduceNewComponentEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_ChangeComponentEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_RemoveComponentEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_IntroduceNewModuleEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_ChangeModuleEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_RemoveModuleEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_IntroduceNewStructureEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_ChangeStructureEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_RemoveStructureEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_IntroduceNewInterfaceEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_ChangeInterfaceEClass.getESuperTypes().add(this.getxPPU_Option());
		xPPU_RemoveInterfaceEClass.getESuperTypes().add(this.getxPPU_Option());

		// Initialize classes and features; add operations and parameters
		initEClass(xPPU_OptionEClass, xPPU_Option.class, "xPPU_Option", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xPPU_IntroduceNewComponentEClass, xPPU_IntroduceNewComponent.class, "xPPU_IntroduceNewComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_IntroduceNewComponent_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, xPPU_IntroduceNewComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_ChangeComponentEClass, xPPU_ChangeComponent.class, "xPPU_ChangeComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_ChangeComponent_OldComponents(), theComponentRepositoryPackage.getComponent(), null, "oldComponents", null, 1, -1, xPPU_ChangeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getxPPU_ChangeComponent_NewComponents(), theComponentRepositoryPackage.getComponent(), null, "newComponents", null, 0, -1, xPPU_ChangeComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_RemoveComponentEClass, xPPU_RemoveComponent.class, "xPPU_RemoveComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_RemoveComponent_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 1, -1, xPPU_RemoveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_IntroduceNewModuleEClass, xPPU_IntroduceNewModule.class, "xPPU_IntroduceNewModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_IntroduceNewModule_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, xPPU_IntroduceNewModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_ChangeModuleEClass, xPPU_ChangeModule.class, "xPPU_ChangeModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_ChangeModule_OldModules(), theModuleRepositoryPackage.getModule(), null, "oldModules", null, 1, -1, xPPU_ChangeModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getxPPU_ChangeModule_NewModules(), theModuleRepositoryPackage.getModule(), null, "newModules", null, 0, -1, xPPU_ChangeModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_RemoveModuleEClass, xPPU_RemoveModule.class, "xPPU_RemoveModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_RemoveModule_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 1, -1, xPPU_RemoveModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_IntroduceNewStructureEClass, xPPU_IntroduceNewStructure.class, "xPPU_IntroduceNewStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_IntroduceNewStructure_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, xPPU_IntroduceNewStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_ChangeStructureEClass, xPPU_ChangeStructure.class, "xPPU_ChangeStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_ChangeStructure_OldStructures(), theStructureRepositoryPackage.getStructure(), null, "oldStructures", null, 1, -1, xPPU_ChangeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getxPPU_ChangeStructure_NewStructures(), theStructureRepositoryPackage.getStructure(), null, "newStructures", null, 0, -1, xPPU_ChangeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_RemoveStructureEClass, xPPU_RemoveStructure.class, "xPPU_RemoveStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_RemoveStructure_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 1, -1, xPPU_RemoveStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_IntroduceNewInterfaceEClass, xPPU_IntroduceNewInterface.class, "xPPU_IntroduceNewInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_IntroduceNewInterface_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, xPPU_IntroduceNewInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_ChangeInterfaceEClass, xPPU_ChangeInterface.class, "xPPU_ChangeInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_ChangeInterface_OldInterfaces(), theInterfaceRepositoryPackage.getInterface(), null, "oldInterfaces", null, 1, -1, xPPU_ChangeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getxPPU_ChangeInterface_NewInterfaces(), theInterfaceRepositoryPackage.getInterface(), null, "newInterfaces", null, 0, -1, xPPU_ChangeInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xPPU_RemoveInterfaceEClass, xPPU_RemoveInterface.class, "xPPU_RemoveInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getxPPU_RemoveInterface_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 1, -1, xPPU_RemoveInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApsoptionsPackageImpl
