/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.ComponentRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.InterfaceRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.ModuleRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.StructureRepositoryPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwareFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Modificationmarks_hardwarePackageImpl extends EPackageImpl implements Modificationmarks_hardwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqHardwareSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqHardwareModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Modificationmarks_hardwarePackageImpl() {
		super(eNS_URI, Modificationmarks_hardwareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Modificationmarks_hardwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Modificationmarks_hardwarePackage init() {
		if (isInited) return (Modificationmarks_hardwarePackage)EPackage.Registry.INSTANCE.getEPackage(Modificationmarks_hardwarePackage.eNS_URI);

		// Obtain or create and register package
		Modificationmarks_hardwarePackageImpl theModificationmarks_hardwarePackage = (Modificationmarks_hardwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Modificationmarks_hardwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Modificationmarks_hardwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		KAMP4aPSModificationmarksPackage.eINSTANCE.eClass();
		ModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModificationmarks_hardwarePackage.createPackageContents();

		// Initialize created meta-data
		theModificationmarks_hardwarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModificationmarks_hardwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Modificationmarks_hardwarePackage.eNS_URI, theModificationmarks_hardwarePackage);
		return theModificationmarks_hardwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqHardwareSeedModifications() {
		return apsReqHardwareSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqHardwareModificationRepository() {
		return apsReqHardwareModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqHardwareChangePropagationDueToSpecificationDependencies() {
		return apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqHardwareChangePropagationDueToSpecificationDependencies_StructureModifications() {
		return (EReference)apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqHardwareChangePropagationDueToSpecificationDependencies_ModuleModifications() {
		return (EReference)apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqHardwareChangePropagationDueToSpecificationDependencies_ComponentModifications() {
		return (EReference)apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqHardwareChangePropagationDueToSpecificationDependencies_InterfaceModifications() {
		return (EReference)apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modificationmarks_hardwareFactory getModificationmarks_hardwareFactory() {
		return (Modificationmarks_hardwareFactory)getEFactoryInstance();
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
		apsReqHardwareSeedModificationsEClass = createEClass(APS_REQ_HARDWARE_SEED_MODIFICATIONS);

		apsReqHardwareModificationRepositoryEClass = createEClass(APS_REQ_HARDWARE_MODIFICATION_REPOSITORY);

		apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass = createEClass(APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES);
		createEReference(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS);
		createEReference(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS);
		createEReference(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS);
		createEReference(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS);
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
		KAMP4aPSModificationmarksPackage theKAMP4aPSModificationmarksPackage = (KAMP4aPSModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(KAMP4aPSModificationmarksPackage.eNS_URI);
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(StructureRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ModuleRepositoryPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(InterfaceRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqHardwareSeedModificationsEClass.getESuperTypes().add(theKAMP4aPSModificationmarksPackage.getKAMP4aPSSeedModifications());
		apsReqHardwareSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAPSReqSeedModifications());
		EGenericType g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getAbstractKAMP4aPSModificationRepository());
		EGenericType g2 = createEGenericType(this.getAPSReqHardwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqHardwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractKAMP4aPS4ReqModificationRepository());
		g2 = createEGenericType(this.getAPSReqHardwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqHardwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractAPSReqChangePropagationDueToSpecificationDependencies());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqHardwareSeedModificationsEClass, APSReqHardwareSeedModifications.class, "APSReqHardwareSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqHardwareModificationRepositoryEClass, APSReqHardwareModificationRepository.class, "APSReqHardwareModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, "APSReqHardwareChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		initEReference(getAPSReqHardwareChangePropagationDueToSpecificationDependencies_StructureModifications(), g1, null, "structureModifications", null, 0, -1, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		initEReference(getAPSReqHardwareChangePropagationDueToSpecificationDependencies_ModuleModifications(), g1, null, "moduleModifications", null, 0, -1, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		initEReference(getAPSReqHardwareChangePropagationDueToSpecificationDependencies_ComponentModifications(), g1, null, "componentModifications", null, 0, -1, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		initEReference(getAPSReqHardwareChangePropagationDueToSpecificationDependencies_InterfaceModifications(), g1, null, "interfaceModifications", null, 0, -1, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Modificationmarks_hardwarePackageImpl
