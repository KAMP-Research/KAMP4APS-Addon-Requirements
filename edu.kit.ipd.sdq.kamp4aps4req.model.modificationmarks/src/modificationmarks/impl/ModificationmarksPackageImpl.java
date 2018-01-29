/**
 */
package modificationmarks.impl;

import decisions.DecisionsPackage;

import modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import modificationmarks.APSReqModifyDecision;
import modificationmarks.APSReqModifyOption;
import modificationmarks.APSReqModifyRequirement;
import modificationmarks.APSReqModifyTraceableObject;
import modificationmarks.APSReqSeedModifications;
import modificationmarks.AbstractKAMP4aPS4ReqModificationRepository;
import modificationmarks.ModificationmarksFactory;
import modificationmarks.ModificationmarksPackage;

import options.OptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import relations.RelationsPackage;

import requirements.RequirementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModificationmarksPackageImpl extends EPackageImpl implements ModificationmarksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModifyTraceableObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModifyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModifyDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqModifyOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractKAMP4aPS4ReqModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apsReqChangePropagationDueToSpecificationDependenciesEClass = null;

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
	 * @see modificationmarks.ModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModificationmarksPackageImpl() {
		super(eNS_URI, ModificationmarksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModificationmarksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModificationmarksPackage init() {
		if (isInited) return (ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(ModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		ModificationmarksPackageImpl theModificationmarksPackage = (ModificationmarksPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DecisionsPackage.eINSTANCE.eClass();
		edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.eINSTANCE.eClass();
		OptionsPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModificationmarksPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModificationmarksPackage.eNS_URI, theModificationmarksPackage);
		return theModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModifyTraceableObject() {
		return apsReqModifyTraceableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModifyRequirement() {
		return apsReqModifyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModifyDecision() {
		return apsReqModifyDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqModifyOption() {
		return apsReqModifyOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractKAMP4aPS4ReqModificationRepository() {
		return abstractKAMP4aPS4ReqModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqSeedModifications() {
		return apsReqSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSeedModifications_RequirementModifications() {
		return (EReference)apsReqSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSeedModifications_DecisionModifications() {
		return (EReference)apsReqSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqSeedModifications_OptionModifications() {
		return (EReference)apsReqSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPSReqChangePropagationDueToSpecificationDependencies() {
		return apsReqChangePropagationDueToSpecificationDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications() {
		return (EReference)apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications() {
		return (EReference)apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications() {
		return (EReference)apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactory getModificationmarksFactory() {
		return (ModificationmarksFactory)getEFactoryInstance();
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
		apsReqModifyTraceableObjectEClass = createEClass(APS_REQ_MODIFY_TRACEABLE_OBJECT);

		apsReqModifyRequirementEClass = createEClass(APS_REQ_MODIFY_REQUIREMENT);

		apsReqModifyDecisionEClass = createEClass(APS_REQ_MODIFY_DECISION);

		apsReqModifyOptionEClass = createEClass(APS_REQ_MODIFY_OPTION);

		abstractKAMP4aPS4ReqModificationRepositoryEClass = createEClass(ABSTRACT_KAMP_4A_PS4_REQ_MODIFICATION_REPOSITORY);

		apsReqSeedModificationsEClass = createEClass(APS_REQ_SEED_MODIFICATIONS);
		createEReference(apsReqSeedModificationsEClass, APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
		createEReference(apsReqSeedModificationsEClass, APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
		createEReference(apsReqSeedModificationsEClass, APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);

		apsReqChangePropagationDueToSpecificationDependenciesEClass = createEClass(APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass, APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS);
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
		RelationsPackage theRelationsPackage = (RelationsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationsPackage.eNS_URI);
		edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage theModificationmarksPackage_1 = (edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage)EPackage.Registry.INSTANCE.getEPackage(edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementsPackage.eNS_URI);
		DecisionsPackage theDecisionsPackage = (DecisionsPackage)EPackage.Registry.INSTANCE.getEPackage(DecisionsPackage.eNS_URI);
		OptionsPackage theOptionsPackage = (OptionsPackage)EPackage.Registry.INSTANCE.getEPackage(OptionsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter apsReqModifyTraceableObjectEClass_T = addETypeParameter(apsReqModifyTraceableObjectEClass, "T");
		ETypeParameter abstractKAMP4aPS4ReqModificationRepositoryEClass_T = addETypeParameter(abstractKAMP4aPS4ReqModificationRepositoryEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRelationsPackage.getTraceableObject());
		apsReqModifyTraceableObjectEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getAPSReqSeedModifications());
		abstractKAMP4aPS4ReqModificationRepositoryEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theModificationmarksPackage_1.getAbstractModification());
		EGenericType g2 = createEGenericType(apsReqModifyTraceableObjectEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		apsReqModifyTraceableObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqModifyTraceableObject());
		g2 = createEGenericType(theRequirementsPackage.getRequirement());
		g1.getETypeArguments().add(g2);
		apsReqModifyRequirementEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqModifyTraceableObject());
		g2 = createEGenericType(theDecisionsPackage.getDecision());
		g1.getETypeArguments().add(g2);
		apsReqModifyDecisionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAPSReqModifyTraceableObject());
		g2 = createEGenericType(theOptionsPackage.getOption());
		g1.getETypeArguments().add(g2);
		apsReqModifyOptionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theModificationmarksPackage_1.getAbstractModificationRepository());
		g2 = createEGenericType(abstractKAMP4aPS4ReqModificationRepositoryEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theModificationmarksPackage_1.getChangePropagationStep());
		g1.getETypeArguments().add(g2);
		abstractKAMP4aPS4ReqModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		apsReqSeedModificationsEClass.getESuperTypes().add(theModificationmarksPackage_1.getAbstractSeedModifications());
		apsReqChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes().add(theModificationmarksPackage_1.getChangePropagationStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(apsReqModifyTraceableObjectEClass, APSReqModifyTraceableObject.class, "APSReqModifyTraceableObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyRequirementEClass, APSReqModifyRequirement.class, "APSReqModifyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyDecisionEClass, APSReqModifyDecision.class, "APSReqModifyDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyOptionEClass, APSReqModifyOption.class, "APSReqModifyOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractKAMP4aPS4ReqModificationRepositoryEClass, AbstractKAMP4aPS4ReqModificationRepository.class, "AbstractKAMP4aPS4ReqModificationRepository", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSeedModificationsEClass, APSReqSeedModifications.class, "APSReqSeedModifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqSeedModifications_RequirementModifications(), this.getAPSReqModifyRequirement(), null, "requirementModifications", null, 0, -1, APSReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSeedModifications_DecisionModifications(), this.getAPSReqModifyDecision(), null, "decisionModifications", null, 0, -1, APSReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSeedModifications_OptionModifications(), this.getAPSReqModifyOption(), null, "optionModifications", null, 0, -1, APSReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangePropagationDueToSpecificationDependenciesEClass, APSReqChangePropagationDueToSpecificationDependencies.class, "APSReqChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications(), this.getAPSReqModifyDecision(), null, "decisionModifications", null, 0, -1, APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications(), this.getAPSReqModifyRequirement(), null, "requirementModifications", null, 0, -1, APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications(), this.getAPSReqModifyOption(), null, "optionModifications", null, 0, -1, APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModificationmarksPackageImpl
