/**
 */
package apssoftwareoptions.impl;

import apsoptions.ApsoptionsPackage;

import apssoftwareoptions.APSReqChangeSoftwareOption;
import apssoftwareoptions.APSReqIntroduceNewSoftwareOption;
import apssoftwareoptions.APSReqRemoveSoftwareOption;
import apssoftwareoptions.APSReqReplaceSoftwareOption;
import apssoftwareoptions.APSReqSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsFactory;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;

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
	private EClass apsReqChangeSoftwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqRemoveSoftwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqReplaceSoftwareOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIntroduceNewSoftwareOptionEClass = null;

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
	public EClass getAPSReqChangeSoftwareOption() {
		return apsReqChangeSoftwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangeSoftwareOption_Components() {
		return (EReference)apsReqChangeSoftwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqRemoveSoftwareOption() {
		return apsReqRemoveSoftwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqRemoveSoftwareOption_Components() {
		return (EReference)apsReqRemoveSoftwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqReplaceSoftwareOption() {
		return apsReqReplaceSoftwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceSoftwareOption_OldComponent() {
		return (EReference)apsReqReplaceSoftwareOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqReplaceSoftwareOption_NewComponent() {
		return (EReference)apsReqReplaceSoftwareOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIntroduceNewSoftwareOption() {
		return apsReqIntroduceNewSoftwareOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIntroduceNewSoftwareOption_Components() {
		return (EReference)apsReqIntroduceNewSoftwareOptionEClass.getEStructuralFeatures().get(0);
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

		apsReqChangeSoftwareOptionEClass = createEClass(APS_REQ_CHANGE_SOFTWARE_OPTION);
		createEReference(apsReqChangeSoftwareOptionEClass, APS_REQ_CHANGE_SOFTWARE_OPTION__COMPONENTS);

		apsReqRemoveSoftwareOptionEClass = createEClass(APS_REQ_REMOVE_SOFTWARE_OPTION);
		createEReference(apsReqRemoveSoftwareOptionEClass, APS_REQ_REMOVE_SOFTWARE_OPTION__COMPONENTS);

		apsReqReplaceSoftwareOptionEClass = createEClass(APS_REQ_REPLACE_SOFTWARE_OPTION);
		createEReference(apsReqReplaceSoftwareOptionEClass, APS_REQ_REPLACE_SOFTWARE_OPTION__OLD_COMPONENT);
		createEReference(apsReqReplaceSoftwareOptionEClass, APS_REQ_REPLACE_SOFTWARE_OPTION__NEW_COMPONENT);

		apsReqIntroduceNewSoftwareOptionEClass = createEClass(APS_REQ_INTRODUCE_NEW_SOFTWARE_OPTION);
		createEReference(apsReqIntroduceNewSoftwareOptionEClass, APS_REQ_INTRODUCE_NEW_SOFTWARE_OPTION__COMPONENTS);
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
		addETypeParameter(apsReqSoftwareOptionEClass, "T");
		ETypeParameter apsReqChangeSoftwareOptionEClass_T = addETypeParameter(apsReqChangeSoftwareOptionEClass, "T");
		ETypeParameter apsReqRemoveSoftwareOptionEClass_T = addETypeParameter(apsReqRemoveSoftwareOptionEClass, "T");
		ETypeParameter apsReqReplaceSoftwareOptionEClass_T = addETypeParameter(apsReqReplaceSoftwareOptionEClass, "T");
		ETypeParameter apsReqIntroduceNewSoftwareOptionEClass_T = addETypeParameter(apsReqIntroduceNewSoftwareOptionEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		apsReqChangeSoftwareOptionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		apsReqRemoveSoftwareOptionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		apsReqReplaceSoftwareOptionEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		apsReqIntroduceNewSoftwareOptionEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theApsoptionsPackage.getAPSReqOption());
		EGenericType g2 = createEGenericType(theIECRepositoryPackage.getIECComponent());
		g1.getETypeArguments().add(g2);
		apsReqSoftwareOptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqSoftwareOption());
		g2 = createEGenericType(apsReqChangeSoftwareOptionEClass_T);
		g1.getETypeArguments().add(g2);
		apsReqChangeSoftwareOptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqSoftwareOption());
		g2 = createEGenericType(apsReqRemoveSoftwareOptionEClass_T);
		g1.getETypeArguments().add(g2);
		apsReqRemoveSoftwareOptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqSoftwareOption());
		g2 = createEGenericType(apsReqReplaceSoftwareOptionEClass_T);
		g1.getETypeArguments().add(g2);
		apsReqReplaceSoftwareOptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqSoftwareOption());
		g2 = createEGenericType(apsReqIntroduceNewSoftwareOptionEClass_T);
		g1.getETypeArguments().add(g2);
		apsReqIntroduceNewSoftwareOptionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqSoftwareOptionEClass, APSReqSoftwareOption.class, "APSReqSoftwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqChangeSoftwareOptionEClass, APSReqChangeSoftwareOption.class, "APSReqChangeSoftwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqChangeSoftwareOptionEClass_T);
		initEReference(getAPSReqChangeSoftwareOption_Components(), g1, null, "components", null, 0, -1, APSReqChangeSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqRemoveSoftwareOptionEClass, APSReqRemoveSoftwareOption.class, "APSReqRemoveSoftwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqRemoveSoftwareOptionEClass_T);
		initEReference(getAPSReqRemoveSoftwareOption_Components(), g1, null, "components", null, 0, -1, APSReqRemoveSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqReplaceSoftwareOptionEClass, APSReqReplaceSoftwareOption.class, "APSReqReplaceSoftwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqReplaceSoftwareOptionEClass_T);
		initEReference(getAPSReqReplaceSoftwareOption_OldComponent(), g1, null, "oldComponent", null, 0, 1, APSReqReplaceSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(apsReqReplaceSoftwareOptionEClass_T);
		initEReference(getAPSReqReplaceSoftwareOption_NewComponent(), g1, null, "newComponent", null, 0, 1, APSReqReplaceSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqIntroduceNewSoftwareOptionEClass, APSReqIntroduceNewSoftwareOption.class, "APSReqIntroduceNewSoftwareOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(apsReqIntroduceNewSoftwareOptionEClass_T);
		initEReference(getAPSReqIntroduceNewSoftwareOption_Components(), g1, null, "components", null, 0, -1, APSReqIntroduceNewSoftwareOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApssoftwareoptionsPackageImpl
