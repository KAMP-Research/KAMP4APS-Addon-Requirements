/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApshardwareoptionsFactoryImpl extends EFactoryImpl implements ApshardwareoptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApshardwareoptionsFactory init() {
		try {
			ApshardwareoptionsFactory theApshardwareoptionsFactory = (ApshardwareoptionsFactory)EPackage.Registry.INSTANCE.getEFactory(ApshardwareoptionsPackage.eNS_URI);
			if (theApshardwareoptionsFactory != null) {
				return theApshardwareoptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApshardwareoptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApshardwareoptionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_ENTITITES: return createAPSReqIntroduceNewEntitites();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES: return createAPSReqRemoveEntities();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES: return createAPSReqReplaceEntities();
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_ENTITIES: return createAPSReqChangeEntities();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIntroduceNewEntitites createAPSReqIntroduceNewEntitites() {
		APSReqIntroduceNewEntititesImpl apsReqIntroduceNewEntitites = new APSReqIntroduceNewEntititesImpl();
		return apsReqIntroduceNewEntitites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveEntities createAPSReqRemoveEntities() {
		APSReqRemoveEntitiesImpl apsReqRemoveEntities = new APSReqRemoveEntitiesImpl();
		return apsReqRemoveEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqReplaceEntities createAPSReqReplaceEntities() {
		APSReqReplaceEntitiesImpl apsReqReplaceEntities = new APSReqReplaceEntitiesImpl();
		return apsReqReplaceEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeEntities createAPSReqChangeEntities() {
		APSReqChangeEntitiesImpl apsReqChangeEntities = new APSReqChangeEntitiesImpl();
		return apsReqChangeEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApshardwareoptionsPackage getApshardwareoptionsPackage() {
		return (ApshardwareoptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApshardwareoptionsPackage getPackage() {
		return ApshardwareoptionsPackage.eINSTANCE;
	}

} //ApshardwareoptionsFactoryImpl
