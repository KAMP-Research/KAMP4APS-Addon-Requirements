/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;

import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqModifyEntity;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;

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
public class APSReqHardwareModificationmarksPackageImpl extends EPackageImpl implements APSReqHardwareModificationmarksPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModifyEntityEClass = null;

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
	 * @see edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.APSReqHardwareModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private APSReqHardwareModificationmarksPackageImpl() {
		super(eNS_URI, APSReqHardwareModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link APSReqHardwareModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static APSReqHardwareModificationmarksPackage init() {
		if (isInited) return (APSReqHardwareModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(APSReqHardwareModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		APSReqHardwareModificationmarksPackageImpl theAPSReqHardwareModificationmarksPackage = (APSReqHardwareModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof APSReqHardwareModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new APSReqHardwareModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		APSReqModificationmarksPackage.eINSTANCE.eClass();
		KAMP4aPSModificationmarksPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAPSReqHardwareModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theAPSReqHardwareModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAPSReqHardwareModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(APSReqHardwareModificationmarksPackage.eNS_URI, theAPSReqHardwareModificationmarksPackage);
		return theAPSReqHardwareModificationmarksPackage;
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
	public EReference getAPSReqHardwareChangePropagationDueToSpecificationDependencies_EntityModifications() {
		return (EReference)apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModifyEntity() {
		return apsReqModifyEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareModificationmarksFactory getAPSReqHardwareModificationmarksFactory() {
		return (APSReqHardwareModificationmarksFactory)getEFactoryInstance();
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
		createEReference(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS);

		apsReqModifyEntityEClass = createEClass(APS_REQ_MODIFY_ENTITY);
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
		APSReqModificationmarksPackage theAPSReqModificationmarksPackage = (APSReqModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(APSReqModificationmarksPackage.eNS_URI);
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqHardwareSeedModificationsEClass.getESuperTypes().add(theKAMP4aPSModificationmarksPackage.getKAMP4aPSSeedModifications());
		apsReqHardwareSeedModificationsEClass.getESuperTypes().add(theAPSReqModificationmarksPackage.getAPSReqSeedModifications());
		EGenericType g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getAbstractKAMP4aPSModificationRepository());
		EGenericType g2 = createEGenericType(this.getAPSReqHardwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqHardwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theAPSReqModificationmarksPackage.getAbstractKAMP4aPS4ReqModificationRepository());
		g2 = createEGenericType(this.getAPSReqHardwareSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqHardwareModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes().add(theAPSReqModificationmarksPackage.getAbstractAPSReqChangePropagationDueToSpecificationDependencies());
		g1 = createEGenericType(theKAMP4aPSModificationmarksPackage.getModifyEntity());
		g2 = createEGenericType(theBasicPackage.getEntity());
		g1.getETypeArguments().add(g2);
		apsReqModifyEntityEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqHardwareSeedModificationsEClass, APSReqHardwareSeedModifications.class, "APSReqHardwareSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqHardwareModificationRepositoryEClass, APSReqHardwareModificationRepository.class, "APSReqHardwareModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqHardwareChangePropagationDueToSpecificationDependenciesEClass, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, "APSReqHardwareChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqHardwareChangePropagationDueToSpecificationDependencies_EntityModifications(), this.getAPSReqModifyEntity(), null, "entityModifications", null, 0, -1, APSReqHardwareChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqModifyEntityEClass, APSReqModifyEntity.class, "APSReqModifyEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //APSReqHardwareModificationmarksPackageImpl
