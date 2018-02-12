/**
 */
package apssoftwareoptions.util;

import apsoptions.APSReqOption;

import apssoftwareoptions.*;

import archoptions.ArchOption;

import de.uka.ipd.sdq.identifier.Identifier;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

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
 * @see apssoftwareoptions.ApssoftwareoptionsPackage
 * @generated
 */
public class ApssoftwareoptionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApssoftwareoptionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApssoftwareoptionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApssoftwareoptionsPackage.eINSTANCE;
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
	protected ApssoftwareoptionsSwitch<Adapter> modelSwitch =
		new ApssoftwareoptionsSwitch<Adapter>() {
			@Override
			public <T> Adapter caseAPSReqSoftwareOption(APSReqSoftwareOption<T> object) {
				return createAPSReqSoftwareOptionAdapter();
			}
			@Override
			public <T extends IECComponent> Adapter caseAPSReqChangeSoftwareOption(APSReqChangeSoftwareOption<T> object) {
				return createAPSReqChangeSoftwareOptionAdapter();
			}
			@Override
			public <T extends IECComponent> Adapter caseAPSReqRemoveSoftwareOption(APSReqRemoveSoftwareOption<T> object) {
				return createAPSReqRemoveSoftwareOptionAdapter();
			}
			@Override
			public <T extends IECComponent> Adapter caseAPSReqReplaceSoftwareOption(APSReqReplaceSoftwareOption<T> object) {
				return createAPSReqReplaceSoftwareOptionAdapter();
			}
			@Override
			public <T extends IECComponent> Adapter caseAPSReqIntroduceNewSoftwareOption(APSReqIntroduceNewSoftwareOption<T> object) {
				return createAPSReqIntroduceNewSoftwareOptionAdapter();
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
			public <T> Adapter caseAPSReqOption(APSReqOption<T> object) {
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
	 * Creates a new adapter for an object of class '{@link apssoftwareoptions.APSReqSoftwareOption <em>APS Req Software Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apssoftwareoptions.APSReqSoftwareOption
	 * @generated
	 */
	public Adapter createAPSReqSoftwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apssoftwareoptions.APSReqChangeSoftwareOption <em>APS Req Change Software Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apssoftwareoptions.APSReqChangeSoftwareOption
	 * @generated
	 */
	public Adapter createAPSReqChangeSoftwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apssoftwareoptions.APSReqRemoveSoftwareOption <em>APS Req Remove Software Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apssoftwareoptions.APSReqRemoveSoftwareOption
	 * @generated
	 */
	public Adapter createAPSReqRemoveSoftwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apssoftwareoptions.APSReqReplaceSoftwareOption <em>APS Req Replace Software Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apssoftwareoptions.APSReqReplaceSoftwareOption
	 * @generated
	 */
	public Adapter createAPSReqReplaceSoftwareOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apssoftwareoptions.APSReqIntroduceNewSoftwareOption <em>APS Req Introduce New Software Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apssoftwareoptions.APSReqIntroduceNewSoftwareOption
	 * @generated
	 */
	public Adapter createAPSReqIntroduceNewSoftwareOptionAdapter() {
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

} //ApssoftwareoptionsAdapterFactory
