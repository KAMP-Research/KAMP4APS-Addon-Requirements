/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqChangeEntities;
import apshardwareoptions.APSReqIntroduceNewEntitites;
import apshardwareoptions.APSReqRemoveEntities;
import apshardwareoptions.APSReqReplaceEntities;
import apshardwareoptions.ApshardwareoptionsFactory;
import apshardwareoptions.ApshardwareoptionsPackage;

import apsoptions.ApsoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.apsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;

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
	private EClass apsReqIntroduceNewEntititesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveEntitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceEntitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqChangeEntitiesEClass = null;

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
	public EClass getAPSReqIntroduceNewEntitites() {
		return apsReqIntroduceNewEntititesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewEntitites_Entities() {
		return (EReference)apsReqIntroduceNewEntititesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveEntities() {
		return apsReqRemoveEntitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveEntities_Entities() {
		return (EReference)apsReqRemoveEntitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceEntities() {
		return apsReqReplaceEntitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceEntities_OldEntities() {
		return (EReference)apsReqReplaceEntitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceEntities_NewEntities() {
		return (EReference)apsReqReplaceEntitiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqChangeEntities() {
		return apsReqChangeEntitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangeEntities_Entities() {
		return (EReference)apsReqChangeEntitiesEClass.getEStructuralFeatures().get(0);
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
		apsReqIntroduceNewEntititesEClass = createEClass(APS_REQ_INTRODUCE_NEW_ENTITITES);
		createEReference(apsReqIntroduceNewEntititesEClass, APS_REQ_INTRODUCE_NEW_ENTITITES__ENTITIES);

		apsReqRemoveEntitiesEClass = createEClass(APS_REQ_REMOVE_ENTITIES);
		createEReference(apsReqRemoveEntitiesEClass, APS_REQ_REMOVE_ENTITIES__ENTITIES);

		apsReqReplaceEntitiesEClass = createEClass(APS_REQ_REPLACE_ENTITIES);
		createEReference(apsReqReplaceEntitiesEClass, APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES);
		createEReference(apsReqReplaceEntitiesEClass, APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES);

		apsReqChangeEntitiesEClass = createEClass(APS_REQ_CHANGE_ENTITIES);
		createEReference(apsReqChangeEntitiesEClass, APS_REQ_CHANGE_ENTITIES__ENTITIES);
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
		BasicPackage theBasicPackage = (BasicPackage)EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqIntroduceNewEntititesEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqIntrodueNewOption());
		apsReqRemoveEntitiesEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqRemoveOption());
		apsReqReplaceEntitiesEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqReplaceOption());
		apsReqChangeEntitiesEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqChangeOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqIntroduceNewEntititesEClass, APSReqIntroduceNewEntitites.class, "APSReqIntroduceNewEntitites", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIntroduceNewEntitites_Entities(), theBasicPackage.getEntity(), null, "entities", null, 0, -1, APSReqIntroduceNewEntitites.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveEntitiesEClass, APSReqRemoveEntities.class, "APSReqRemoveEntities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqRemoveEntities_Entities(), theBasicPackage.getEntity(), null, "entities", null, 0, -1, APSReqRemoveEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceEntitiesEClass, APSReqReplaceEntities.class, "APSReqReplaceEntities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqReplaceEntities_OldEntities(), theBasicPackage.getEntity(), null, "oldEntities", null, 0, -1, APSReqReplaceEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqReplaceEntities_NewEntities(), theBasicPackage.getEntity(), null, "newEntities", null, 0, -1, APSReqReplaceEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangeEntitiesEClass, APSReqChangeEntities.class, "APSReqChangeEntities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqChangeEntities_Entities(), theBasicPackage.getEntity(), null, "entities", null, 0, -1, APSReqChangeEntities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApshardwareoptionsPackageImpl
