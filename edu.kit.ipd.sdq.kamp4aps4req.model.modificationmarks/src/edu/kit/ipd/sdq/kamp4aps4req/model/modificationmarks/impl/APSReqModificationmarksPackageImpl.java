/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl;

import decisions.DecisionsPackage;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.modificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;

import options.OptionsPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import relations.RelationsPackage;

import requirements.RequirementsPackage;

import xPPU.ComponentRepository.ComponentRepositoryPackage;

import xPPU.InterfaceRepository.InterfaceRepositoryPackage;

import xPPU.ModuleRepository.ModuleRepositoryPackage;

import xPPU.StructureRepository.StructureRepositoryPackage;

import xPPU.XPPUPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class APSReqModificationmarksPackageImpl extends EPackageImpl implements APSReqModificationmarksPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModificationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqSeedModificationsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqChangePropagationDueToSpecificationDependenciesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyTraceableObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyComponentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyModuleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyStructureEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyDecisionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass apsReqModifyOptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private APSReqModificationmarksPackageImpl() {
		super(eNS_URI, APSReqModificationmarksFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize
	 * {@link APSReqModificationmarksPackage#eINSTANCE} when that field is
	 * accessed. Clients should not invoke it directly. Instead, they should
	 * simply access that field to obtain the package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static APSReqModificationmarksPackage init() {
		if (isInited)
			return (APSReqModificationmarksPackage) EPackage.Registry.INSTANCE
					.getEPackage(APSReqModificationmarksPackage.eNS_URI);

		// Obtain or create and register package
		APSReqModificationmarksPackageImpl theAPSReqModificationmarksPackage = (APSReqModificationmarksPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof APSReqModificationmarksPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new APSReqModificationmarksPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DecisionsPackage.eINSTANCE.eClass();
		modificationmarksPackage.eINSTANCE.eClass();
		OptionsPackage.eINSTANCE.eClass();
		RequirementsPackage.eINSTANCE.eClass();
		XPPUPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAPSReqModificationmarksPackage.createPackageContents();

		// Initialize created meta-data
		theAPSReqModificationmarksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAPSReqModificationmarksPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(APSReqModificationmarksPackage.eNS_URI, theAPSReqModificationmarksPackage);
		return theAPSReqModificationmarksPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModificationRepository() {
		return apsReqModificationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqSeedModifications() {
		return apsReqSeedModificationsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqSeedModifications_RequirementModifications() {
		return (EReference) apsReqSeedModificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqSeedModifications_DecisionModifications() {
		return (EReference) apsReqSeedModificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqSeedModifications_OptionModifications() {
		return (EReference) apsReqSeedModificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqChangePropagationDueToSpecificationDependencies() {
		return apsReqChangePropagationDueToSpecificationDependenciesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_ComponentModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_ModuleModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_StructureModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EReference getAPSReqChangePropagationDueToSpecificationDependencies_InterfaceModifications() {
		return (EReference) apsReqChangePropagationDueToSpecificationDependenciesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyTraceableObject() {
		return apsReqModifyTraceableObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyComponent() {
		return apsReqModifyComponentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyModule() {
		return apsReqModifyModuleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyStructure() {
		return apsReqModifyStructureEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyInterface() {
		return apsReqModifyInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyRequirement() {
		return apsReqModifyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyDecision() {
		return apsReqModifyDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EClass getAPSReqModifyOption() {
		return apsReqModifyOptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModificationmarksFactory getAPSReqModificationmarksFactory() {
		return (APSReqModificationmarksFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		apsReqModificationRepositoryEClass = createEClass(APS_REQ_MODIFICATION_REPOSITORY);

		apsReqSeedModificationsEClass = createEClass(APS_REQ_SEED_MODIFICATIONS);
		createEReference(apsReqSeedModificationsEClass, APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
		createEReference(apsReqSeedModificationsEClass, APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
		createEReference(apsReqSeedModificationsEClass, APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);

		apsReqChangePropagationDueToSpecificationDependenciesEClass = createEClass(
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS);
		createEReference(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS);

		apsReqModifyTraceableObjectEClass = createEClass(APS_REQ_MODIFY_TRACEABLE_OBJECT);

		apsReqModifyComponentEClass = createEClass(APS_REQ_MODIFY_COMPONENT);

		apsReqModifyModuleEClass = createEClass(APS_REQ_MODIFY_MODULE);

		apsReqModifyStructureEClass = createEClass(APS_REQ_MODIFY_STRUCTURE);

		apsReqModifyInterfaceEClass = createEClass(APS_REQ_MODIFY_INTERFACE);

		apsReqModifyRequirementEClass = createEClass(APS_REQ_MODIFY_REQUIREMENT);

		apsReqModifyDecisionEClass = createEClass(APS_REQ_MODIFY_DECISION);

		apsReqModifyOptionEClass = createEClass(APS_REQ_MODIFY_OPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		modificationmarksPackage themodificationmarksPackage = (modificationmarksPackage) EPackage.Registry.INSTANCE
				.getEPackage(modificationmarksPackage.eNS_URI);
		ModificationmarksPackage theModificationmarksPackage = (ModificationmarksPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModificationmarksPackage.eNS_URI);
		RelationsPackage theRelationsPackage = (RelationsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RelationsPackage.eNS_URI);
		ComponentRepositoryPackage theComponentRepositoryPackage = (ComponentRepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentRepositoryPackage.eNS_URI);
		ModuleRepositoryPackage theModuleRepositoryPackage = (ModuleRepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(ModuleRepositoryPackage.eNS_URI);
		StructureRepositoryPackage theStructureRepositoryPackage = (StructureRepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(StructureRepositoryPackage.eNS_URI);
		InterfaceRepositoryPackage theInterfaceRepositoryPackage = (InterfaceRepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(InterfaceRepositoryPackage.eNS_URI);
		RequirementsPackage theRequirementsPackage = (RequirementsPackage) EPackage.Registry.INSTANCE
				.getEPackage(RequirementsPackage.eNS_URI);
		DecisionsPackage theDecisionsPackage = (DecisionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(DecisionsPackage.eNS_URI);
		OptionsPackage theOptionsPackage = (OptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(OptionsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter apsReqModifyTraceableObjectEClass_T = addETypeParameter(apsReqModifyTraceableObjectEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRelationsPackage.getTraceableObject());
		apsReqModifyTraceableObjectEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(themodificationmarksPackage.getAbstractKAPSModificationRepository());
		EGenericType g2 = createEGenericType(this.getAPSReqSeedModifications());
		g1.getETypeArguments().add(g2);
		apsReqModificationRepositoryEClass.getEGenericSuperTypes().add(g1);
		apsReqSeedModificationsEClass.getESuperTypes().add(themodificationmarksPackage.getKAPSSeedModifications());
		apsReqChangePropagationDueToSpecificationDependenciesEClass.getESuperTypes()
				.add(theModificationmarksPackage.getChangePropagationStep());
		g1 = createEGenericType(theModificationmarksPackage.getAbstractModification());
		g2 = createEGenericType(apsReqModifyTraceableObjectEClass_T);
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		apsReqModifyTraceableObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(themodificationmarksPackage.getModifyComponent());
		g2 = createEGenericType(theComponentRepositoryPackage.getComponent());
		g1.getETypeArguments().add(g2);
		apsReqModifyComponentEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(themodificationmarksPackage.getModifyModule());
		g2 = createEGenericType(theModuleRepositoryPackage.getModule());
		g1.getETypeArguments().add(g2);
		apsReqModifyModuleEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(themodificationmarksPackage.getModifyStructure());
		g2 = createEGenericType(theStructureRepositoryPackage.getStructure());
		g1.getETypeArguments().add(g2);
		apsReqModifyStructureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(themodificationmarksPackage.getModifyInterface());
		g2 = createEGenericType(theInterfaceRepositoryPackage.getInterface());
		g1.getETypeArguments().add(g2);
		apsReqModifyInterfaceEClass.getEGenericSuperTypes().add(g1);
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

		// Initialize classes and features; add operations and parameters
		initEClass(apsReqModificationRepositoryEClass, APSReqModificationRepository.class,
				"APSReqModificationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqSeedModificationsEClass, APSReqSeedModifications.class, "APSReqSeedModifications",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqSeedModifications_RequirementModifications(), this.getAPSReqModifyRequirement(), null,
				"requirementModifications", null, 0, -1, APSReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSeedModifications_DecisionModifications(), this.getAPSReqModifyDecision(), null,
				"decisionModifications", null, 0, -1, APSReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqSeedModifications_OptionModifications(), this.getAPSReqModifyOption(), null,
				"optionModifications", null, 0, -1, APSReqSeedModifications.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqChangePropagationDueToSpecificationDependenciesEClass,
				APSReqChangePropagationDueToSpecificationDependencies.class,
				"APSReqChangePropagationDueToSpecificationDependencies", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_DecisionModifications(),
				this.getAPSReqModifyDecision(), null, "decisionModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_OptionModifications(),
				this.getAPSReqModifyOption(), null, "optionModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_RequirementModifications(),
				this.getAPSReqModifyRequirement(), null, "requirementModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_ComponentModifications(),
				this.getAPSReqModifyComponent(), null, "componentModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_ModuleModifications(),
				this.getAPSReqModifyModule(), null, "moduleModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_StructureModifications(),
				this.getAPSReqModifyStructure(), null, "structureModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAPSReqChangePropagationDueToSpecificationDependencies_InterfaceModifications(),
				this.getAPSReqModifyInterface(), null, "interfaceModifications", null, 0, -1,
				APSReqChangePropagationDueToSpecificationDependencies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(apsReqModifyTraceableObjectEClass, APSReqModifyTraceableObject.class, "APSReqModifyTraceableObject",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyComponentEClass, APSReqModifyComponent.class, "APSReqModifyComponent", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyModuleEClass, APSReqModifyModule.class, "APSReqModifyModule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyStructureEClass, APSReqModifyStructure.class, "APSReqModifyStructure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyInterfaceEClass, APSReqModifyInterface.class, "APSReqModifyInterface", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyRequirementEClass, APSReqModifyRequirement.class, "APSReqModifyRequirement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyDecisionEClass, APSReqModifyDecision.class, "APSReqModifyDecision", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apsReqModifyOptionEClass, APSReqModifyOption.class, "APSReqModifyOption", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // APSReqModificationmarksPackageImpl
