/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqModifyIECComponent;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareSeedModifications;

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
public class APSReqSoftwareModificationmarksPackageImpl extends EPackageImpl implements APSReqSoftwareModificationmarksPackage {
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
	 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private APSReqSoftwareModificationmarksPackageImpl() {
		super(eNS_URI, APSReqSoftwareModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link APSReqSoftwareModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static APSReqSoftwareModificationmarksPackage init() {
		if (isInited) return (APSReqSoftwareModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(APSReqSoftwareModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		APSReqSoftwareModificationmarksPackageImpl theAPSReqSoftwareModificationmarksPackage = (APSReqSoftwareModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof APSReqSoftwareModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new APSReqSoftwareModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		APSReqModificationmarksPackage.eINSTANCE.eClass();
		IECModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAPSReqSoftwareModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theAPSReqSoftwareModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAPSReqSoftwareModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(APSReqSoftwareModificationmarksPackage.eNS_URI, theAPSReqSoftwareModificationmarksPackage);
		return theAPSReqSoftwareModificationmarksPackage;
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
	public EReference getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications() {
		return (EReference)apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
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
	public APSReqSoftwareModificationmarksFactory getAPSReqSoftwareModificationmarksFactory() {
		return (APSReqSoftwareModificationmarksFactory)getEFactoryInstance();
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
		IECModificationmarksPackage theIECModificationmarksPackage = (IECModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(IECModificationmarksPackage.eNS_URI);
		APSReqModificationmarksPackage theAPSReqModificationmarksPackage = (APSReqModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(APSReqModificationmarksPackage.eNS_URI);
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqSoftwareSeedModificationsEClass.getESuperTypes().add(theIECModificationmarksPackage.getIECSeedModifications());
		apsReqSoftwareSeedModificationsEClass.getESuperTypes().add(theAPSReqModificationmarksPackage.getAPSReqSeedModifications());
		EGenericType g1 = createEGenericType(theIECModificationmarksPackage.getAbstractKAMP4IECModificationRepository());
		EGenericType g2 = createEGenericType(this.getAPSReqSoftwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqSoftwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAPSReqModificationmarksPackage.getAbstractKAMP4aPS4ReqModificationRepository());
		g2 = createEGenericType(this.getAPSReqSoftwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqSoftwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes().add(theAPSReqModificationmarksPackage.getAbstractAPSReqChangePropagationDueToSpecificationDependencies());
		g1 = createEGenericType(theIECModificationmarksPackage.getIECModifyComponent());
		g2 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		g1.getETypeArguments().add(g2);
		apsReqModifyIECComponentEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqSoftwareSeedModificationsEClass, APSReqSoftwareSeedModifications.class, "APSReqSoftwareSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSoftwareModificationRepositoryEClass, APSReqSoftwareModificationRepository.class, "APSReqSoftwareModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSoftwareChangePropagationDueToSpecificationDependenciesEClass, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, "APSReqSoftwareChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqSoftwareChangePropagationDueToSpecificationDependencies_IecComponentModifications(), this.getAPSReqModifyIECComponent(), null, "iecComponentModifications", null, 0, -1, APSReqSoftwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqModifyIECComponentEClass, APSReqModifyIECComponent.class, "APSReqModifyIECComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //APSReqSoftwareModificationmarksPackageImpl
