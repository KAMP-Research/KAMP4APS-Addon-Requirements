/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqChangeInterfaceOption;
import apshardwareoptions.APSReqChangeModuleOption;
import apshardwareoptions.APSReqChangeStructureOption;
import apshardwareoptions.APSReqComponentHardwareOption;
import apshardwareoptions.APSReqHardwareOption;
import apshardwareoptions.APSReqInterfaceHardwareOption;
import apshardwareoptions.APSReqIntroduceNewComponentOption;
import apshardwareoptions.APSReqIntroduceNewInterfaceOption;
import apshardwareoptions.APSReqIntroduceNewModuleOption;
import apshardwareoptions.APSReqIntroduceNewStructureOption;
import apshardwareoptions.APSReqModuleHardwareOption;
import apshardwareoptions.APSReqRemoveComponentOption;
import apshardwareoptions.APSReqRemoveInterfaceOption;
import apshardwareoptions.APSReqRemoveModuleOption;
import apshardwareoptions.APSReqRemoveStructureOption;
import apshardwareoptions.APSReqReplaceComponentOption;
import apshardwareoptions.APSReqReplaceInterfaceOption;
import apshardwareoptions.APSReqReplaceModuleOption;
import apshardwareoptions.APSReqReplaceStructureOption;
import apshardwareoptions.APSReqStructureHardwareOption;
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
	private EClass apsReqHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqStructureHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIntroduceNewStructureOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqChangeStructureOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveStructureOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceStructureOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModuleHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIntroduceNewModuleOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveModuleOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqChangeModuleOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceModuleOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqComponentHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIntroduceNewComponentOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveComponentOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceComponentOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqInterfaceHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIntroduceNewInterfaceOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqChangeInterfaceOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceInterfaceOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveInterfaceOptionEClass = null;

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
	public EClass getAPSReqHardwareOption() {
		return apsReqHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqStructureHardwareOption() {
		return apsReqStructureHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIntroduceNewStructureOption() {
		return apsReqIntroduceNewStructureOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewStructureOption_Structures() {
		return (EReference)apsReqIntroduceNewStructureOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqChangeStructureOption() {
		return apsReqChangeStructureOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangeStructureOption_Structures() {
		return (EReference)apsReqChangeStructureOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveStructureOption() {
		return apsReqRemoveStructureOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveStructureOption_Structures() {
		return (EReference)apsReqRemoveStructureOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceStructureOption() {
		return apsReqReplaceStructureOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceStructureOption_OldStructure() {
		return (EReference)apsReqReplaceStructureOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceStructureOption_NewStructure() {
		return (EReference)apsReqReplaceStructureOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModuleHardwareOption() {
		return apsReqModuleHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIntroduceNewModuleOption() {
		return apsReqIntroduceNewModuleOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewModuleOption_Modules() {
		return (EReference)apsReqIntroduceNewModuleOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveModuleOption() {
		return apsReqRemoveModuleOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveModuleOption_Modules() {
		return (EReference)apsReqRemoveModuleOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqChangeModuleOption() {
		return apsReqChangeModuleOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangeModuleOption_Modules() {
		return (EReference)apsReqChangeModuleOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceModuleOption() {
		return apsReqReplaceModuleOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceModuleOption_OldModule() {
		return (EReference)apsReqReplaceModuleOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceModuleOption_NewModule() {
		return (EReference)apsReqReplaceModuleOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqComponentHardwareOption() {
		return apsReqComponentHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIntroduceNewComponentOption() {
		return apsReqIntroduceNewComponentOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewComponentOption_Components() {
		return (EReference)apsReqIntroduceNewComponentOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveComponentOption() {
		return apsReqRemoveComponentOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveComponentOption_Components() {
		return (EReference)apsReqRemoveComponentOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceComponentOption() {
		return apsReqReplaceComponentOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceComponentOption_OldComponent() {
		return (EReference)apsReqReplaceComponentOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceComponentOption_NewComponent() {
		return (EReference)apsReqReplaceComponentOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqInterfaceHardwareOption() {
		return apsReqInterfaceHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIntroduceNewInterfaceOption() {
		return apsReqIntroduceNewInterfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewInterfaceOption_Interfaces() {
		return (EReference)apsReqIntroduceNewInterfaceOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqChangeInterfaceOption() {
		return apsReqChangeInterfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangeInterfaceOption_Interfaces() {
		return (EReference)apsReqChangeInterfaceOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceInterfaceOption() {
		return apsReqReplaceInterfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceInterfaceOption_OldInterface() {
		return (EReference)apsReqReplaceInterfaceOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceInterfaceOption_NewInterface() {
		return (EReference)apsReqReplaceInterfaceOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveInterfaceOption() {
		return apsReqRemoveInterfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveInterfaceOption_Interfaces() {
		return (EReference)apsReqRemoveInterfaceOptionEClass.getEStructuralFeatures().get(0);
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
		apsReqHardwareOptionEClass = createEClass(APS_REQ_HARDWARE_OPTION);

		apsReqStructureHardwareOptionEClass = createEClass(APS_REQ_STRUCTURE_HARDWARE_OPTION);

		apsReqIntroduceNewStructureOptionEClass = createEClass(APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION);
		createEReference(apsReqIntroduceNewStructureOptionEClass, APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION__STRUCTURES);

		apsReqChangeStructureOptionEClass = createEClass(APS_REQ_CHANGE_STRUCTURE_OPTION);
		createEReference(apsReqChangeStructureOptionEClass, APS_REQ_CHANGE_STRUCTURE_OPTION__STRUCTURES);

		apsReqRemoveStructureOptionEClass = createEClass(APS_REQ_REMOVE_STRUCTURE_OPTION);
		createEReference(apsReqRemoveStructureOptionEClass, APS_REQ_REMOVE_STRUCTURE_OPTION__STRUCTURES);

		apsReqReplaceStructureOptionEClass = createEClass(APS_REQ_REPLACE_STRUCTURE_OPTION);
		createEReference(apsReqReplaceStructureOptionEClass, APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE);
		createEReference(apsReqReplaceStructureOptionEClass, APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE);

		apsReqModuleHardwareOptionEClass = createEClass(APS_REQ_MODULE_HARDWARE_OPTION);

		apsReqIntroduceNewModuleOptionEClass = createEClass(APS_REQ_INTRODUCE_NEW_MODULE_OPTION);
		createEReference(apsReqIntroduceNewModuleOptionEClass, APS_REQ_INTRODUCE_NEW_MODULE_OPTION__MODULES);

		apsReqRemoveModuleOptionEClass = createEClass(APS_REQ_REMOVE_MODULE_OPTION);
		createEReference(apsReqRemoveModuleOptionEClass, APS_REQ_REMOVE_MODULE_OPTION__MODULES);

		apsReqChangeModuleOptionEClass = createEClass(APS_REQ_CHANGE_MODULE_OPTION);
		createEReference(apsReqChangeModuleOptionEClass, APS_REQ_CHANGE_MODULE_OPTION__MODULES);

		apsReqReplaceModuleOptionEClass = createEClass(APS_REQ_REPLACE_MODULE_OPTION);
		createEReference(apsReqReplaceModuleOptionEClass, APS_REQ_REPLACE_MODULE_OPTION__OLD_MODULE);
		createEReference(apsReqReplaceModuleOptionEClass, APS_REQ_REPLACE_MODULE_OPTION__NEW_MODULE);

		apsReqComponentHardwareOptionEClass = createEClass(APS_REQ_COMPONENT_HARDWARE_OPTION);

		apsReqIntroduceNewComponentOptionEClass = createEClass(APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION);
		createEReference(apsReqIntroduceNewComponentOptionEClass, APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION__COMPONENTS);

		apsReqRemoveComponentOptionEClass = createEClass(APS_REQ_REMOVE_COMPONENT_OPTION);
		createEReference(apsReqRemoveComponentOptionEClass, APS_REQ_REMOVE_COMPONENT_OPTION__COMPONENTS);

		apsReqReplaceComponentOptionEClass = createEClass(APS_REQ_REPLACE_COMPONENT_OPTION);
		createEReference(apsReqReplaceComponentOptionEClass, APS_REQ_REPLACE_COMPONENT_OPTION__OLD_COMPONENT);
		createEReference(apsReqReplaceComponentOptionEClass, APS_REQ_REPLACE_COMPONENT_OPTION__NEW_COMPONENT);

		apsReqInterfaceHardwareOptionEClass = createEClass(APS_REQ_INTERFACE_HARDWARE_OPTION);

		apsReqIntroduceNewInterfaceOptionEClass = createEClass(APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION);
		createEReference(apsReqIntroduceNewInterfaceOptionEClass, APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION__INTERFACES);

		apsReqChangeInterfaceOptionEClass = createEClass(APS_REQ_CHANGE_INTERFACE_OPTION);
		createEReference(apsReqChangeInterfaceOptionEClass, APS_REQ_CHANGE_INTERFACE_OPTION__INTERFACES);

		apsReqReplaceInterfaceOptionEClass = createEClass(APS_REQ_REPLACE_INTERFACE_OPTION);
		createEReference(apsReqReplaceInterfaceOptionEClass, APS_REQ_REPLACE_INTERFACE_OPTION__OLD_INTERFACE);
		createEReference(apsReqReplaceInterfaceOptionEClass, APS_REQ_REPLACE_INTERFACE_OPTION__NEW_INTERFACE);

		apsReqRemoveInterfaceOptionEClass = createEClass(APS_REQ_REMOVE_INTERFACE_OPTION);
		createEReference(apsReqRemoveInterfaceOptionEClass, APS_REQ_REMOVE_INTERFACE_OPTION__INTERFACES);
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
		apsReqHardwareOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqStructureHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqIntroduceNewStructureOptionEClass.getESuperTypes().add(this.getAPSReqStructureHardwareOption());
		apsReqChangeStructureOptionEClass.getESuperTypes().add(this.getAPSReqStructureHardwareOption());
		apsReqRemoveStructureOptionEClass.getESuperTypes().add(this.getAPSReqStructureHardwareOption());
		apsReqReplaceStructureOptionEClass.getESuperTypes().add(this.getAPSReqStructureHardwareOption());
		apsReqModuleHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqIntroduceNewModuleOptionEClass.getESuperTypes().add(this.getAPSReqModuleHardwareOption());
		apsReqRemoveModuleOptionEClass.getESuperTypes().add(this.getAPSReqModuleHardwareOption());
		apsReqChangeModuleOptionEClass.getESuperTypes().add(this.getAPSReqModuleHardwareOption());
		apsReqReplaceModuleOptionEClass.getESuperTypes().add(this.getAPSReqModuleHardwareOption());
		apsReqComponentHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqIntroduceNewComponentOptionEClass.getESuperTypes().add(this.getAPSReqComponentHardwareOption());
		apsReqRemoveComponentOptionEClass.getESuperTypes().add(this.getAPSReqComponentHardwareOption());
		apsReqReplaceComponentOptionEClass.getESuperTypes().add(this.getAPSReqComponentHardwareOption());
		apsReqInterfaceHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqIntroduceNewInterfaceOptionEClass.getESuperTypes().add(this.getAPSReqInterfaceHardwareOption());
		apsReqChangeInterfaceOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqReplaceInterfaceOptionEClass.getESuperTypes().add(this.getAPSReqInterfaceHardwareOption());
		apsReqRemoveInterfaceOptionEClass.getESuperTypes().add(this.getAPSReqInterfaceHardwareOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqHardwareOptionEClass, APSReqHardwareOption.class, "APSReqHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqStructureHardwareOptionEClass, APSReqStructureHardwareOption.class, "APSReqStructureHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqIntroduceNewStructureOptionEClass, APSReqIntroduceNewStructureOption.class, "APSReqIntroduceNewStructureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIntroduceNewStructureOption_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, APSReqIntroduceNewStructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangeStructureOptionEClass, APSReqChangeStructureOption.class, "APSReqChangeStructureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqChangeStructureOption_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, APSReqChangeStructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveStructureOptionEClass, APSReqRemoveStructureOption.class, "APSReqRemoveStructureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqRemoveStructureOption_Structures(), theStructureRepositoryPackage.getStructure(), null, "structures", null, 0, -1, APSReqRemoveStructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceStructureOptionEClass, APSReqReplaceStructureOption.class, "APSReqReplaceStructureOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqReplaceStructureOption_OldStructure(), theStructureRepositoryPackage.getStructure(), null, "oldStructure", null, 0, 1, APSReqReplaceStructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqReplaceStructureOption_NewStructure(), theStructureRepositoryPackage.getStructure(), null, "newStructure", null, 0, 1, APSReqReplaceStructureOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqModuleHardwareOptionEClass, APSReqModuleHardwareOption.class, "APSReqModuleHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqIntroduceNewModuleOptionEClass, APSReqIntroduceNewModuleOption.class, "APSReqIntroduceNewModuleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIntroduceNewModuleOption_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, APSReqIntroduceNewModuleOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveModuleOptionEClass, APSReqRemoveModuleOption.class, "APSReqRemoveModuleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqRemoveModuleOption_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, APSReqRemoveModuleOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangeModuleOptionEClass, APSReqChangeModuleOption.class, "APSReqChangeModuleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqChangeModuleOption_Modules(), theModuleRepositoryPackage.getModule(), null, "modules", null, 0, -1, APSReqChangeModuleOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceModuleOptionEClass, APSReqReplaceModuleOption.class, "APSReqReplaceModuleOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqReplaceModuleOption_OldModule(), theModuleRepositoryPackage.getModule(), null, "oldModule", null, 0, 1, APSReqReplaceModuleOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqReplaceModuleOption_NewModule(), theModuleRepositoryPackage.getModule(), null, "newModule", null, 0, 1, APSReqReplaceModuleOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqComponentHardwareOptionEClass, APSReqComponentHardwareOption.class, "APSReqComponentHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqIntroduceNewComponentOptionEClass, APSReqIntroduceNewComponentOption.class, "APSReqIntroduceNewComponentOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIntroduceNewComponentOption_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, APSReqIntroduceNewComponentOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveComponentOptionEClass, APSReqRemoveComponentOption.class, "APSReqRemoveComponentOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqRemoveComponentOption_Components(), theComponentRepositoryPackage.getComponent(), null, "components", null, 0, -1, APSReqRemoveComponentOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceComponentOptionEClass, APSReqReplaceComponentOption.class, "APSReqReplaceComponentOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqReplaceComponentOption_OldComponent(), theComponentRepositoryPackage.getComponent(), null, "oldComponent", null, 0, 1, APSReqReplaceComponentOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqReplaceComponentOption_NewComponent(), theComponentRepositoryPackage.getComponent(), null, "newComponent", null, 0, 1, APSReqReplaceComponentOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqInterfaceHardwareOptionEClass, APSReqInterfaceHardwareOption.class, "APSReqInterfaceHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqIntroduceNewInterfaceOptionEClass, APSReqIntroduceNewInterfaceOption.class, "APSReqIntroduceNewInterfaceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIntroduceNewInterfaceOption_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, APSReqIntroduceNewInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangeInterfaceOptionEClass, APSReqChangeInterfaceOption.class, "APSReqChangeInterfaceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqChangeInterfaceOption_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, APSReqChangeInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceInterfaceOptionEClass, APSReqReplaceInterfaceOption.class, "APSReqReplaceInterfaceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqReplaceInterfaceOption_OldInterface(), theInterfaceRepositoryPackage.getInterface(), null, "oldInterface", null, 0, 1, APSReqReplaceInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqReplaceInterfaceOption_NewInterface(), theInterfaceRepositoryPackage.getInterface(), null, "newInterface", null, 0, 1, APSReqReplaceInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveInterfaceOptionEClass, APSReqRemoveInterfaceOption.class, "APSReqRemoveInterfaceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqRemoveInterfaceOption_Interfaces(), theInterfaceRepositoryPackage.getInterface(), null, "interfaces", null, 0, -1, APSReqRemoveInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApshardwareoptionsPackageImpl
