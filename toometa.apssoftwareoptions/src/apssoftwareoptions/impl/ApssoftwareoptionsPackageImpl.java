/**
 */
package apssoftwareoptions.impl;

import apsoptions.ApsoptionsPackage;
import apssoftwareoptions.APSReqConfigurationOption;
import apssoftwareoptions.APSReqFunctionBlockOption;
import apssoftwareoptions.APSReqFunctionOption;
import apssoftwareoptions.APSReqGlobalVariableOption;
import apssoftwareoptions.APSReqIECInterfaceOption;
import apssoftwareoptions.APSReqIECMethodOption;
import apssoftwareoptions.APSReqIECPropertyOption;
import apssoftwareoptions.APSReqProgramOption;
import apssoftwareoptions.ApssoftwareoptionsFactory;
import apssoftwareoptions.ApssoftwareoptionsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModel.IECModelPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECRepositoryPackage;
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
public class ApssoftwareoptionsPackageImpl extends EPackageImpl implements ApssoftwareoptionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqProgramOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqFunctionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqFunctionBlockOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqConfigurationOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIECMethodOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqGlobalVariableOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIECPropertyOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqIECInterfaceOptionEClass = null;

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
		IECModelPackage.eINSTANCE.eClass();

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
	public EClass getAPSReqProgramOption() {
		return apsReqProgramOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqProgramOption_Program() {
		return (EReference)apsReqProgramOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqFunctionOption() {
		return apsReqFunctionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqFunctionOption_Functions() {
		return (EReference)apsReqFunctionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqFunctionBlockOption() {
		return apsReqFunctionBlockOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqFunctionBlockOption_FunctionBlocks() {
		return (EReference)apsReqFunctionBlockOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqConfigurationOption() {
		return apsReqConfigurationOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqConfigurationOption_Configuration() {
		return (EReference)apsReqConfigurationOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIECMethodOption() {
		return apsReqIECMethodOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIECMethodOption_IecMethods() {
		return (EReference)apsReqIECMethodOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqGlobalVariableOption() {
		return apsReqGlobalVariableOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqGlobalVariableOption_GlobalVariables() {
		return (EReference)apsReqGlobalVariableOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIECPropertyOption() {
		return apsReqIECPropertyOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIECPropertyOption_IecProperties() {
		return (EReference)apsReqIECPropertyOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqIECInterfaceOption() {
		return apsReqIECInterfaceOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqIECInterfaceOption_IecInterfaces() {
		return (EReference)apsReqIECInterfaceOptionEClass.getEStructuralFeatures().get(0);
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
		apsReqProgramOptionEClass = createEClass(APS_REQ_PROGRAM_OPTION);
		createEReference(apsReqProgramOptionEClass, APS_REQ_PROGRAM_OPTION__PROGRAM);

		apsReqFunctionOptionEClass = createEClass(APS_REQ_FUNCTION_OPTION);
		createEReference(apsReqFunctionOptionEClass, APS_REQ_FUNCTION_OPTION__FUNCTIONS);

		apsReqFunctionBlockOptionEClass = createEClass(APS_REQ_FUNCTION_BLOCK_OPTION);
		createEReference(apsReqFunctionBlockOptionEClass, APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS);

		apsReqConfigurationOptionEClass = createEClass(APS_REQ_CONFIGURATION_OPTION);
		createEReference(apsReqConfigurationOptionEClass, APS_REQ_CONFIGURATION_OPTION__CONFIGURATION);

		apsReqIECMethodOptionEClass = createEClass(APS_REQ_IEC_METHOD_OPTION);
		createEReference(apsReqIECMethodOptionEClass, APS_REQ_IEC_METHOD_OPTION__IEC_METHODS);

		apsReqGlobalVariableOptionEClass = createEClass(APS_REQ_GLOBAL_VARIABLE_OPTION);
		createEReference(apsReqGlobalVariableOptionEClass, APS_REQ_GLOBAL_VARIABLE_OPTION__GLOBAL_VARIABLES);

		apsReqIECPropertyOptionEClass = createEClass(APS_REQ_IEC_PROPERTY_OPTION);
		createEReference(apsReqIECPropertyOptionEClass, APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES);

		apsReqIECInterfaceOptionEClass = createEClass(APS_REQ_IEC_INTERFACE_OPTION);
		createEReference(apsReqIECInterfaceOptionEClass, APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES);
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
		IECModelPackage theIECModelPackage = (IECModelPackage)EPackage.Registry.INSTANCE.getEPackage(IECModelPackage.eNS_URI);
		IECRepositoryPackage theIECRepositoryPackage = (IECRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(IECRepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		apsReqProgramOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqFunctionOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqFunctionBlockOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqConfigurationOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqIECMethodOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqGlobalVariableOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqIECPropertyOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());
		apsReqIECInterfaceOptionEClass.getESuperTypes().add(theApsoptionsPackage.getAPSReqOption());

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqProgramOptionEClass, APSReqProgramOption.class, "APSReqProgramOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqProgramOption_Program(), theIECModelPackage.getProgram(), null, "program", null, 0, 1, APSReqProgramOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqFunctionOptionEClass, APSReqFunctionOption.class, "APSReqFunctionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqFunctionOption_Functions(), theIECRepositoryPackage.getFunction(), null, "functions", null, 0, -1, APSReqFunctionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqFunctionBlockOptionEClass, APSReqFunctionBlockOption.class, "APSReqFunctionBlockOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqFunctionBlockOption_FunctionBlocks(), theIECRepositoryPackage.getFunctionBlock(), null, "functionBlocks", null, 0, -1, APSReqFunctionBlockOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqConfigurationOptionEClass, APSReqConfigurationOption.class, "APSReqConfigurationOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqConfigurationOption_Configuration(), theIECModelPackage.getConfiguration(), null, "configuration", null, 0, 1, APSReqConfigurationOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqIECMethodOptionEClass, APSReqIECMethodOption.class, "APSReqIECMethodOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIECMethodOption_IecMethods(), theIECRepositoryPackage.getIsMethod(), null, "iecMethods", null, 0, -1, APSReqIECMethodOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqGlobalVariableOptionEClass, APSReqGlobalVariableOption.class, "APSReqGlobalVariableOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqGlobalVariableOption_GlobalVariables(), theIECRepositoryPackage.getGlobalVariable(), null, "globalVariables", null, 0, -1, APSReqGlobalVariableOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqIECPropertyOptionEClass, APSReqIECPropertyOption.class, "APSReqIECPropertyOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIECPropertyOption_IecProperties(), theIECRepositoryPackage.getIsProperty(), null, "iecProperties", null, 0, -1, APSReqIECPropertyOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqIECInterfaceOptionEClass, APSReqIECInterfaceOption.class, "APSReqIECInterfaceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqIECInterfaceOption_IecInterfaces(), theIECRepositoryPackage.getIECInterface(), null, "iecInterfaces", null, 0, -1, APSReqIECInterfaceOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ApssoftwareoptionsPackageImpl
