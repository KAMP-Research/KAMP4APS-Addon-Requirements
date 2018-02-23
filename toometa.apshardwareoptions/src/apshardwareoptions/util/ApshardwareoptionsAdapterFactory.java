/**
 */
package apshardwareoptions.util;

import apshardwareoptions.*;

import apsoptions.APSReqChangeOption;
import apsoptions.APSReqIntrodueNewOption;
import apsoptions.APSReqOption;
import apsoptions.APSReqRemoveOption;
import apsoptions.APSReqReplaceOption;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
			public Adapter caseAPSReqIntroduceNewEntitites(APSReqIntroduceNewEntitites object) {
				return createAPSReqIntroduceNewEntititesAdapter();
			}
			@Override
			public Adapter caseAPSReqRemoveEntities(APSReqRemoveEntities object) {
				return createAPSReqRemoveEntitiesAdapter();
			}
			@Override
			public Adapter caseAPSReqReplaceEntities(APSReqReplaceEntities object) {
				return createAPSReqReplaceEntitiesAdapter();
			}
			@Override
			public Adapter caseAPSReqChangeEntities(APSReqChangeEntities object) {
				return createAPSReqChangeEntitiesAdapter();
			}
			@Override
			public Adapter caseAPSReqOption(APSReqOption object) {
				return createAPSReqOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqIntrodueNewOption(APSReqIntrodueNewOption object) {
				return createAPSReqIntrodueNewOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqRemoveOption(APSReqRemoveOption object) {
				return createAPSReqRemoveOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqReplaceOption(APSReqReplaceOption object) {
				return createAPSReqReplaceOptionAdapter();
			}
			@Override
			public Adapter caseAPSReqChangeOption(APSReqChangeOption object) {
				return createAPSReqChangeOptionAdapter();
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
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqIntroduceNewEntitites <em>APS Req Introduce New Entitites</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqIntroduceNewEntitites
	 * @generated
	 */
	public Adapter createAPSReqIntroduceNewEntititesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqRemoveEntities <em>APS Req Remove Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqRemoveEntities
	 * @generated
	 */
	public Adapter createAPSReqRemoveEntitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqReplaceEntities <em>APS Req Replace Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqReplaceEntities
	 * @generated
	 */
	public Adapter createAPSReqReplaceEntitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apshardwareoptions.APSReqChangeEntities <em>APS Req Change Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apshardwareoptions.APSReqChangeEntities
	 * @generated
	 */
	public Adapter createAPSReqChangeEntitiesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link apsoptions.APSReqIntrodueNewOption <em>APS Req Introdue New Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apsoptions.APSReqIntrodueNewOption
	 * @generated
	 */
	public Adapter createAPSReqIntrodueNewOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apsoptions.APSReqRemoveOption <em>APS Req Remove Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apsoptions.APSReqRemoveOption
	 * @generated
	 */
	public Adapter createAPSReqRemoveOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apsoptions.APSReqReplaceOption <em>APS Req Replace Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apsoptions.APSReqReplaceOption
	 * @generated
	 */
	public Adapter createAPSReqReplaceOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link apsoptions.APSReqChangeOption <em>APS Req Change Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see apsoptions.APSReqChangeOption
	 * @generated
	 */
	public Adapter createAPSReqChangeOptionAdapter() {
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
