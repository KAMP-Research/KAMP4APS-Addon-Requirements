/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class APSReqModificationmarksFactoryImpl extends EFactoryImpl implements APSReqModificationmarksFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static APSReqModificationmarksFactory init() {
		try {
			APSReqModificationmarksFactory theAPSReqModificationmarksFactory = (APSReqModificationmarksFactory) EPackage.Registry.INSTANCE
					.getEFactory(APSReqModificationmarksPackage.eNS_URI);
			if (theAPSReqModificationmarksFactory != null) {
				return theAPSReqModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new APSReqModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public APSReqModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case APSReqModificationmarksPackage.APS_REQ_MODIFICATION_REPOSITORY:
				return createAPSReqModificationRepository();
			case APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS:
				return createAPSReqSeedModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES:
				return createAPSReqChangePropagationDueToSpecificationDependencies();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_COMPONENT:
				return createAPSReqModifyComponent();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_MODULE:
				return createAPSReqModifyModule();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_STRUCTURE:
				return createAPSReqModifyStructure();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_INTERFACE:
				return createAPSReqModifyInterface();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_REQUIREMENT:
				return createAPSReqModifyRequirement();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_DECISION:
				return createAPSReqModifyDecision();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_OPTION:
				return createAPSReqModifyOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModificationRepository createAPSReqModificationRepository() {
		APSReqModificationRepositoryImpl apsReqModificationRepository = new APSReqModificationRepositoryImpl();
		return apsReqModificationRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqSeedModifications createAPSReqSeedModifications() {
		APSReqSeedModificationsImpl apsReqSeedModifications = new APSReqSeedModificationsImpl();
		return apsReqSeedModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqChangePropagationDueToSpecificationDependencies createAPSReqChangePropagationDueToSpecificationDependencies() {
		APSReqChangePropagationDueToSpecificationDependenciesImpl apsReqChangePropagationDueToSpecificationDependencies = new APSReqChangePropagationDueToSpecificationDependenciesImpl();
		return apsReqChangePropagationDueToSpecificationDependencies;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyComponent createAPSReqModifyComponent() {
		APSReqModifyComponentImpl apsReqModifyComponent = new APSReqModifyComponentImpl();
		return apsReqModifyComponent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyModule createAPSReqModifyModule() {
		APSReqModifyModuleImpl apsReqModifyModule = new APSReqModifyModuleImpl();
		return apsReqModifyModule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyStructure createAPSReqModifyStructure() {
		APSReqModifyStructureImpl apsReqModifyStructure = new APSReqModifyStructureImpl();
		return apsReqModifyStructure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyInterface createAPSReqModifyInterface() {
		APSReqModifyInterfaceImpl apsReqModifyInterface = new APSReqModifyInterfaceImpl();
		return apsReqModifyInterface;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyRequirement createAPSReqModifyRequirement() {
		APSReqModifyRequirementImpl apsReqModifyRequirement = new APSReqModifyRequirementImpl();
		return apsReqModifyRequirement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyDecision createAPSReqModifyDecision() {
		APSReqModifyDecisionImpl apsReqModifyDecision = new APSReqModifyDecisionImpl();
		return apsReqModifyDecision;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModifyOption createAPSReqModifyOption() {
		APSReqModifyOptionImpl apsReqModifyOption = new APSReqModifyOptionImpl();
		return apsReqModifyOption;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public APSReqModificationmarksPackage getAPSReqModificationmarksPackage() {
		return (APSReqModificationmarksPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static APSReqModificationmarksPackage getPackage() {
		return APSReqModificationmarksPackage.eINSTANCE;
	}

} // APSReqModificationmarksFactoryImpl
