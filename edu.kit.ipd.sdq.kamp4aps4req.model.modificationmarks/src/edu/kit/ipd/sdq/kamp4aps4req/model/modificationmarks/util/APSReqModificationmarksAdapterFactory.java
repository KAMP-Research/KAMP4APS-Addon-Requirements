/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.util;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import relations.TraceableObject;

import xPPU.ComponentRepository.Component;

import xPPU.InterfaceRepository.Interface;

import xPPU.ModuleRepository.Module;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage
 * @generated
 */
public class APSReqModificationmarksAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static APSReqModificationmarksPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public APSReqModificationmarksAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = APSReqModificationmarksPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected APSReqModificationmarksSwitch<Adapter> modelSwitch = new APSReqModificationmarksSwitch<Adapter>() {
		@Override
		public Adapter caseAPSReqModificationRepository(APSReqModificationRepository object) {
			return createAPSReqModificationRepositoryAdapter();
		}

		@Override
		public Adapter caseAPSReqSeedModifications(APSReqSeedModifications object) {
			return createAPSReqSeedModificationsAdapter();
		}

		@Override
		public Adapter caseAPSReqChangePropagationDueToSpecificationDependencies(
				APSReqChangePropagationDueToSpecificationDependencies object) {
			return createAPSReqChangePropagationDueToSpecificationDependenciesAdapter();
		}

		@Override
		public <T extends TraceableObject> Adapter caseAPSReqModifyTraceableObject(
				APSReqModifyTraceableObject<T> object) {
			return createAPSReqModifyTraceableObjectAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyComponent(APSReqModifyComponent object) {
			return createAPSReqModifyComponentAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyModule(APSReqModifyModule object) {
			return createAPSReqModifyModuleAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyStructure(APSReqModifyStructure object) {
			return createAPSReqModifyStructureAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyInterface(APSReqModifyInterface object) {
			return createAPSReqModifyInterfaceAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyRequirement(APSReqModifyRequirement object) {
			return createAPSReqModifyRequirementAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyDecision(APSReqModifyDecision object) {
			return createAPSReqModifyDecisionAdapter();
		}

		@Override
		public Adapter caseAPSReqModifyOption(APSReqModifyOption object) {
			return createAPSReqModifyOptionAdapter();
		}

		@Override
		public <S extends AbstractSeedModifications, T extends AbstractChangePropagationStep> Adapter caseAbstractModificationRepository(
				AbstractModificationRepository<S, T> object) {
			return createAbstractModificationRepositoryAdapter();
		}

		@Override
		public <T extends KAPSSeedModifications> Adapter caseAbstractKAPSModificationRepository(
				AbstractKAPSModificationRepository<T> object) {
			return createAbstractKAPSModificationRepositoryAdapter();
		}

		@Override
		public Adapter caseAbstractSeedModifications(AbstractSeedModifications object) {
			return createAbstractSeedModificationsAdapter();
		}

		@Override
		public Adapter caseKAPSSeedModifications(KAPSSeedModifications object) {
			return createKAPSSeedModificationsAdapter();
		}

		@Override
		public Adapter caseAbstractChangePropagationStep(AbstractChangePropagationStep object) {
			return createAbstractChangePropagationStepAdapter();
		}

		@Override
		public Adapter caseChangePropagationStep(ChangePropagationStep object) {
			return createChangePropagationStepAdapter();
		}

		@Override
		public <S, T> Adapter caseAbstractModification(AbstractModification<S, T> object) {
			return createAbstractModificationAdapter();
		}

		@Override
		public <T extends Component> Adapter caseModifyComponent(ModifyComponent<T> object) {
			return createModifyComponentAdapter();
		}

		@Override
		public <T extends Module> Adapter caseModifyModule(ModifyModule<T> object) {
			return createModifyModuleAdapter();
		}

		@Override
		public <T extends Structure> Adapter caseModifyStructure(ModifyStructure<T> object) {
			return createModifyStructureAdapter();
		}

		@Override
		public <T extends Interface> Adapter caseModifyInterface(ModifyInterface<T> object) {
			return createModifyInterfaceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationRepository
	 * <em>APS Req Modification Repository</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationRepository
	 * @generated
	 */
	public Adapter createAPSReqModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications
	 * <em>APS Req Seed Modifications</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications
	 * @generated
	 */
	public Adapter createAPSReqSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies
	 * <em>APS Req Change Propagation Due To Specification Dependencies</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies
	 * @generated
	 */
	public Adapter createAPSReqChangePropagationDueToSpecificationDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject
	 * <em>APS Req Modify Traceable Object</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyTraceableObject
	 * @generated
	 */
	public Adapter createAPSReqModifyTraceableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent
	 * <em>APS Req Modify Component</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent
	 * @generated
	 */
	public Adapter createAPSReqModifyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule
	 * <em>APS Req Modify Module</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule
	 * @generated
	 */
	public Adapter createAPSReqModifyModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure
	 * <em>APS Req Modify Structure</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure
	 * @generated
	 */
	public Adapter createAPSReqModifyStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface
	 * <em>APS Req Modify Interface</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface
	 * @generated
	 */
	public Adapter createAPSReqModifyInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement
	 * <em>APS Req Modify Requirement</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement
	 * @generated
	 */
	public Adapter createAPSReqModifyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision
	 * <em>APS Req Modify Decision</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision
	 * @generated
	 */
	public Adapter createAPSReqModifyDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption
	 * <em>APS Req Modify Option</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption
	 * @generated
	 */
	public Adapter createAPSReqModifyOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
	 * <em>Abstract Modification Repository</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModificationRepository
	 * @generated
	 */
	public Adapter createAbstractModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository
	 * <em>Abstract KAPS Modification Repository</em>}'. <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore
	 * cases; it's useful to ignore a case when inheritance will catch all the
	 * cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.AbstractKAPSModificationRepository
	 * @generated
	 */
	public Adapter createAbstractKAPSModificationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications
	 * <em>Abstract Seed Modifications</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications
	 * @generated
	 */
	public Adapter createAbstractSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications
	 * <em>KAPS Seed Modifications</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.KAPSSeedModifications
	 * @generated
	 */
	public Adapter createKAPSSeedModificationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep
	 * <em>Abstract Change Propagation Step</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractChangePropagationStep
	 * @generated
	 */
	public Adapter createAbstractChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
	 * <em>Change Propagation Step</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep
	 * @generated
	 */
	public Adapter createChangePropagationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification
	 * <em>Abstract Modification</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractModification
	 * @generated
	 */
	public Adapter createAbstractModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent
	 * <em>Modify Component</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyComponent
	 * @generated
	 */
	public Adapter createModifyComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule
	 * <em>Modify Module</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyModule
	 * @generated
	 */
	public Adapter createModifyModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure
	 * <em>Modify Structure</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyStructure
	 * @generated
	 */
	public Adapter createModifyStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface
	 * <em>Modify Interface</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.ModifyInterface
	 * @generated
	 */
	public Adapter createModifyInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // APSReqModificationmarksAdapterFactory
