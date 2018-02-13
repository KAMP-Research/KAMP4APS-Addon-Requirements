/**
 */
package apshardwareoptions.util;

import apshardwareoptions.*;

import apsoptions.APSReqOption;

import archoptions.ArchOption;

import de.uka.ipd.sdq.identifier.Identifier;

import options.Option;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import relations.AlternativeObject;
import relations.ConflictObject;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.DuplicationObject;
import relations.ParentalObject;
import relations.RelationObject;
import relations.ResolveObject;
import relations.SelectionObject;
import relations.StakeholderObject;
import relations.TraceableObject;
import relations.TriggerObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see apshardwareoptions.ApshardwareoptionsPackage
 * @generated
 */
public class ApshardwareoptionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApshardwareoptionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApshardwareoptionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApshardwareoptionsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApshardwareoptionsSwitch<Adapter> modelSwitch =
		new ApshardwareoptionsSwitch<Adapter>() {
			@Override
			public Adapter caseAPSReqHardwareOption(APSReqHardwareOption object) {
				return createAPSReqHardwareOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqStructureHardwareOption(APSReqStructureHardwareOption object) {
				return createAPSReqStructureHardwareOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqIntroduceNewStructureOption(APSReqIntroduceNewStructureOption object) {
				return createAPSReqIntroduceNewStructureOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqChangeStructureOption(APSReqChangeStructureOption object) {
				return createAPSReqChangeStructureOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqRemoveStructureOption(APSReqRemoveStructureOption object) {
				return createAPSReqRemoveStructureOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqReplaceStructureOption(APSReqReplaceStructureOption object) {
				return createAPSReqReplaceStructureOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqModuleHardwareOption(APSReqModuleHardwareOption object) {
				return createAPSReqModuleHardwareOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqIntroduceNewModuleOption(APSReqIntroduceNewModuleOption object) {
				return createAPSReqIntroduceNewModuleOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqRemoveModuleOption(APSReqRemoveModuleOption object) {
				return createAPSReqRemoveModuleOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqChangeModuleOption(APSReqChangeModuleOption object) {
				return createAPSReqChangeModuleOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqReplaceModuleOption(APSReqReplaceModuleOption object) {
				return createAPSReqReplaceModuleOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqComponentHardwareOption(APSReqComponentHardwareOption object) {
				return createAPSReqComponentHardwareOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqIntroduceNewComponentOption(APSReqIntroduceNewComponentOption object) {
				return createAPSReqIntroduceNewComponentOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqRemoveComponentOption(APSReqRemoveComponentOption object) {
				return createAPSReqRemoveComponentOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqReplaceComponentOption(APSReqReplaceComponentOption object) {
				return createAPSReqReplaceComponentOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqInterfaceHardwareOption(APSReqInterfaceHardwareOption object) {
				return createAPSReqInterfaceHardwareOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqIntroduceNewInterfaceOption(APSReqIntroduceNewInterfaceOption object) {
				return createAPSReqIntroduceNewInterfaceOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqChangeInterfaceOption(APSReqChangeInterfaceOption object) {
				return createAPSReqChangeInterfaceOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqReplaceInterfaceOption(APSReqReplaceInterfaceOption object) {
				return createAPSReqReplaceInterfaceOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqRemoveInterfaceOption(APSReqRemoveInterfaceOption object) {
				return createAPSReqRemoveInterfaceOptionAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseRelationObject(RelationObject object) {
				return createRelationObjectAdapter();
			}
			@Override
			public Adapter caseConflictObject(ConflictObject object) {
				return createConflictObjectAdapter();
			}
			@Override
			public Adapter caseDuplicationObject(DuplicationObject object) {
				return createDuplicationObjectAdapter();
			}
			@Override
			public Adapter caseDependencyObject(DependencyObject object) {
				return createDependencyObjectAdapter();
			}
			@Override
			public Adapter caseParentalObject(ParentalObject object) {
				return createParentalObjectAdapter();
			}
			@Override
			public Adapter caseTriggerObject(TriggerObject object) {
				return createTriggerObjectAdapter();
			}
			@Override
			public Adapter caseResolveObject(ResolveObject object) {
				return createResolveObjectAdapter();
			}
			@Override
			public Adapter caseAlternativeObject(AlternativeObject object) {
				return createAlternativeObjectAdapter();
			}
			@Override
			public Adapter caseCouldResolveObject(CouldResolveObject object) {
				return createCouldResolveObjectAdapter();
			}
			@Override
			public Adapter caseStakeholderObject(StakeholderObject object) {
				return createStakeholderObjectAdapter();
			}
			@Override
			public Adapter caseSelectionObject(SelectionObject object) {
				return createSelectionObjectAdapter();
			}
			@Override
			public Adapter caseTraceableObject(TraceableObject object) {
				return createTraceableObjectAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseArchOption(ArchOption object) {
				return createArchOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqOption(APSReqOption object) {
				return createAPSReqOptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqHardwareOption <em>APS Req Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqHardwareOption
	 * @generated
	 */
	public Adapter createAPSReqHardwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqStructureHardwareOption <em>APS Req Structure Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqStructureHardwareOption
	 * @generated
	 */
	public Adapter createAPSReqStructureHardwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqIntroduceNewStructureOption <em>APS Req Introduce New Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqIntroduceNewStructureOption
	 * @generated
	 */
	public Adapter createAPSReqIntroduceNewStructureOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqChangeStructureOption <em>APS Req Change Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqChangeStructureOption
	 * @generated
	 */
	public Adapter createAPSReqChangeStructureOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqRemoveStructureOption <em>APS Req Remove Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqRemoveStructureOption
	 * @generated
	 */
	public Adapter createAPSReqRemoveStructureOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqReplaceStructureOption <em>APS Req Replace Structure Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqReplaceStructureOption
	 * @generated
	 */
	public Adapter createAPSReqReplaceStructureOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqModuleHardwareOption <em>APS Req Module Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqModuleHardwareOption
	 * @generated
	 */
	public Adapter createAPSReqModuleHardwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqIntroduceNewModuleOption <em>APS Req Introduce New Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqIntroduceNewModuleOption
	 * @generated
	 */
	public Adapter createAPSReqIntroduceNewModuleOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqRemoveModuleOption <em>APS Req Remove Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqRemoveModuleOption
	 * @generated
	 */
	public Adapter createAPSReqRemoveModuleOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqChangeModuleOption <em>APS Req Change Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqChangeModuleOption
	 * @generated
	 */
	public Adapter createAPSReqChangeModuleOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqReplaceModuleOption <em>APS Req Replace Module Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqReplaceModuleOption
	 * @generated
	 */
	public Adapter createAPSReqReplaceModuleOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqComponentHardwareOption <em>APS Req Component Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqComponentHardwareOption
	 * @generated
	 */
	public Adapter createAPSReqComponentHardwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqIntroduceNewComponentOption <em>APS Req Introduce New Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqIntroduceNewComponentOption
	 * @generated
	 */
	public Adapter createAPSReqIntroduceNewComponentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqRemoveComponentOption <em>APS Req Remove Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqRemoveComponentOption
	 * @generated
	 */
	public Adapter createAPSReqRemoveComponentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqReplaceComponentOption <em>APS Req Replace Component Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqReplaceComponentOption
	 * @generated
	 */
	public Adapter createAPSReqReplaceComponentOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqInterfaceHardwareOption <em>APS Req Interface Hardware Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqInterfaceHardwareOption
	 * @generated
	 */
	public Adapter createAPSReqInterfaceHardwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqIntroduceNewInterfaceOption <em>APS Req Introduce New Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqIntroduceNewInterfaceOption
	 * @generated
	 */
	public Adapter createAPSReqIntroduceNewInterfaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqChangeInterfaceOption <em>APS Req Change Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqChangeInterfaceOption
	 * @generated
	 */
	public Adapter createAPSReqChangeInterfaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqReplaceInterfaceOption <em>APS Req Replace Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqReplaceInterfaceOption
	 * @generated
	 */
	public Adapter createAPSReqReplaceInterfaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqRemoveInterfaceOption <em>APS Req Remove Interface Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqRemoveInterfaceOption
	 * @generated
	 */
	public Adapter createAPSReqRemoveInterfaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.RelationObject <em>Relation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.RelationObject
	 * @generated
	 */
	public Adapter createRelationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.ConflictObject <em>Conflict Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.ConflictObject
	 * @generated
	 */
	public Adapter createConflictObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.DuplicationObject <em>Duplication Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.DuplicationObject
	 * @generated
	 */
	public Adapter createDuplicationObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.DependencyObject <em>Dependency Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.DependencyObject
	 * @generated
	 */
	public Adapter createDependencyObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.ParentalObject <em>Parental Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.ParentalObject
	 * @generated
	 */
	public Adapter createParentalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.TriggerObject <em>Trigger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.TriggerObject
	 * @generated
	 */
	public Adapter createTriggerObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.ResolveObject <em>Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.ResolveObject
	 * @generated
	 */
	public Adapter createResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.AlternativeObject <em>Alternative Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.AlternativeObject
	 * @generated
	 */
	public Adapter createAlternativeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.CouldResolveObject <em>Could Resolve Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.CouldResolveObject
	 * @generated
	 */
	public Adapter createCouldResolveObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.StakeholderObject <em>Stakeholder Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.StakeholderObject
	 * @generated
	 */
	public Adapter createStakeholderObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.SelectionObject <em>Selection Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.SelectionObject
	 * @generated
	 */
	public Adapter createSelectionObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link relations.TraceableObject <em>Traceable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see relations.TraceableObject
	 * @generated
	 */
	public Adapter createTraceableObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link options.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see options.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link archoptions.ArchOption <em>Arch Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see archoptions.ArchOption
	 * @generated
	 */
	public Adapter createArchOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apsoptions.APSReqOption <em>APS Req Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apsoptions.APSReqOption
	 * @generated
	 */
	public Adapter createAPSReqOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApshardwareoptionsAdapterFactory
