/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyIECComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwareFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModifyIECComponentEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage#eNS_URI
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
	public EClass getAPSReqSoftwareChangePropagationDueToSpecificationDependencies() {
		return apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ConfigurationModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ProgramModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionBlockModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_GlobalVariableModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecInterfaceModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECMethodModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecMethodModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECPropertyModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecPropertyModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModifyIECComponent() {
		return apsReqModifyIECComponentEClass;
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

		apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass = createEClass(APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS);
		createEReference(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS);

		apsReqModifyIECComponentEClass = createEClass(APS_REQ_MODIFY_IEC_COMPONENT);
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
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqSoftwareSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage.getAPSReqSeedModifications());
		apsReqSoftwareSeedModificationsEClass.getESuperTypes().add(theIECModificationmarksPackage.getIECSeedModifications());
		EGenericType g1 = createEGenericType(theIECModificationmarksPackage.getAbstractKAMP4IECModificationRepository());
		EGenericType g2 = createEGenericType(this.getAPSReqSoftwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqSoftwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage.getAbstractKAMP4aPS4ReqModificationRepository());
		g2 = createEGenericType(this.getAPSReqSoftwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqSoftwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes().add(theModificationmarksPackage.getAbstractAPSReqChangePropagationDueToSpecificationDependencies());
		g1 = createEGenericType(theIECModificationmarksPackage.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		g1.getETypeArguments().add(g2);
		apsReqModifyIECComponentEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqSoftwareSeedModificationsEClass, APSReqSoftwareSeedModifications.class, "APSReqSoftwareSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSoftwareModificationRepositoryEClass, APSReqSoftwareModificationRepository.class, "APSReqSoftwareModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, "APSReqSoftwareChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ConfigurationModifications(), theIECModificationmarksPackage.getIECModifyConfiguration(), null, "configurationModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_ProgramModifications(), theIECModificationmarksPackage.getIECModifyProgram(), null, "programModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionModifications(), theIECModificationmarksPackage.getIECModifyFunction(), null, "functionModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_FunctionBlockModifications(), theIECModificationmarksPackage.getIECModifyFunctionBlock(), null, "functionBlockModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_GlobalVariableModifications(), theIECModificationmarksPackage.getIECModifyGlobalVariable(), null, "globalVariableModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecInterfaceModifications(), theIECModificationmarksPackage.getIECModifyInterface(), null, "iecInterfaceModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECMethodModifications(), theIECModificationmarksPackage.getIECModifyAbstractMethod(), null, "abstractIECMethodModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecMethodModifications(), theIECModificationmarksPackage.getIECModifyMethod(), null, "iecMethodModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_AbstractIECPropertyModifications(), theIECModificationmarksPackage.getIECModifyAbstractProperty(), null, "abstractIECPropertyModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecPropertyModifications(), theIECModificationmarksPackage.getIECModifyProperty(), null, "iecPropertyModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications(), this.getAPSReqModifyIECComponent(), null, "iecComponentModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqModifyIECComponentEClass, APSReqModifyIECComponent.class, "APSReqModifyIECComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Modificationmarks_softwarePackageImpl
