/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqChangeHardwareOption;
import apshardwareoptions.APSReqHardwareOption;
import apshardwareoptions.APSReqIntroduceNewHardwareOption;
import apshardwareoptions.APSReqRemoveHardwareOption;
import apshardwareoptions.APSReqReplaceHardwareOption;
import apshardwareoptions.ApshardwareoptionsFactory;
import apshardwareoptions.ApshardwareoptionsPackage;

import apsoptions.ApsoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.basic.BasicPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

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
	private EClass apsReqIntroduceNewHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqChangeHardwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceHardwareOptionEClass = null;

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
		ApsoptionsPackage.eINSTANCE.eClass();
		BasicPackage.eINSTANCE.eClass();

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
	public EClass getAPSReqIntroduceNewHardwareOption() {
		return apsReqIntroduceNewHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewHardwareOption_Entities() {
		return (EReference)apsReqIntroduceNewHardwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveHardwareOption() {
		return apsReqRemoveHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveHardwareOption_Entities() {
		return (EReference)apsReqRemoveHardwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqChangeHardwareOption() {
		return apsReqChangeHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangeHardwareOption_Entities() {
		return (EReference)apsReqChangeHardwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceHardwareOption() {
		return apsReqReplaceHardwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceHardwareOption_OldEntity() {
		return (EReference)apsReqReplaceHardwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceHardwareOption_NewEntity() {
		return (EReference)apsReqReplaceHardwareOptionEClass.getEStructuralFeatures().get(1);
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

		apsReqIntroduceNewHardwareOptionEClass = createEClass(APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION);
		createEReference(apsReqIntroduceNewHardwareOptionEClass, APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION__ENTITIES);

		apsReqRemoveHardwareOptionEClass = createEClass(APS_REQ_REMOVE_HARDWARE_OPTION);
		createEReference(apsReqRemoveHardwareOptionEClass, APS_REQ_REMOVE_HARDWARE_OPTION__ENTITIES);

		apsReqChangeHardwareOptionEClass = createEClass(APS_REQ_CHANGE_HARDWARE_OPTION);
		createEReference(apsReqChangeHardwareOptionEClass, APS_REQ_CHANGE_HARDWARE_OPTION__ENTITIES);

		apsReqReplaceHardwareOptionEClass = createEClass(APS_REQ_REPLACE_HARDWARE_OPTION);
		createEReference(apsReqReplaceHardwareOptionEClass, APS_REQ_REPLACE_HARDWARE_OPTION__OLD_ENTITY);
		createEReference(apsReqReplaceHardwareOptionEClass, APS_REQ_REPLACE_HARDWARE_OPTION__NEW_ENTITY);
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
		ETypeParameter apsReqIntroduceNewHardwareOptionEClass_T = addETypeParameter(apsReqIntroduceNewHardwareOptionEClass, "T");
		ETypeParameter apsReqRemoveHardwareOptionEClass_T = addETypeParameter(apsReqRemoveHardwareOptionEClass, "T");
		ETypeParameter apsReqChangeHardwareOptionEClass_T = addETypeParameter(apsReqChangeHardwareOptionEClass, "T");
		ETypeParameter apsReqReplaceHardwareOptionEClass_T = addETypeParameter(apsReqReplaceHardwareOptionEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theBasicPackage.getEntity());
		apsReqIntroduceNewHardwareOptionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theBasicPackage.getEntity());
		apsReqRemoveHardwareOptionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theBasicPackage.getEntity());
		apsReqChangeHardwareOptionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theBasicPackage.getEntity());
		apsReqReplaceHardwareOptionEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theApsoptionsPackage.getAPSReqOption());
		EGenericType g2 = createEGenericType(theBasicPackage.getEntity());
		g1.getETypeArguments().add(g2);
		apsReqHardwareOptionEClass.getEGenericSuperTypes().add(g1);
		apsReqIntroduceNewHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqRemoveHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqChangeHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());
		apsReqReplaceHardwareOptionEClass.getESuperTypes().add(this.getAPSReqHardwareOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqHardwareOptionEClass, APSReqHardwareOption.class, "APSReqHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqIntroduceNewHardwareOptionEClass, APSReqIntroduceNewHardwareOption.class, "APSReqIntroduceNewHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqIntroduceNewHardwareOptionEClass_T);
		initEReference(getAPSReqIntroduceNewHardwareOption_Entities(), g1, null, "entities", null, 0, -1, APSReqIntroduceNewHardwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveHardwareOptionEClass, APSReqRemoveHardwareOption.class, "APSReqRemoveHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqRemoveHardwareOptionEClass_T);
		initEReference(getAPSReqRemoveHardwareOption_Entities(), g1, null, "entities", null, 0, -1, APSReqRemoveHardwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangeHardwareOptionEClass, APSReqChangeHardwareOption.class, "APSReqChangeHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqChangeHardwareOptionEClass_T);
		initEReference(getAPSReqChangeHardwareOption_Entities(), g1, null, "entities", null, 0, -1, APSReqChangeHardwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceHardwareOptionEClass, APSReqReplaceHardwareOption.class, "APSReqReplaceHardwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqReplaceHardwareOptionEClass_T);
		initEReference(getAPSReqReplaceHardwareOption_OldEntity(), g1, null, "oldEntity", null, 0, 1, APSReqReplaceHardwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(apsReqReplaceHardwareOptionEClass_T);
		initEReference(getAPSReqReplaceHardwareOption_NewEntity(), g1, null, "newEntity", null, 0, 1, APSReqReplaceHardwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApshardwareoptionsPackageImpl
