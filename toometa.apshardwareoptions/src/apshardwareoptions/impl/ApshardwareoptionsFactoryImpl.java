/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.*;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

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
			case ApshardwareoptionsPackage.APS_REQ_HARDWARE_OPTION: return createAPSReqHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_HARDWARE_OPTION: return createAPSReqIntroduceNewHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_HARDWARE_OPTION: return createAPSReqRemoveHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_HARDWARE_OPTION: return createAPSReqChangeHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_HARDWARE_OPTION: return createAPSReqReplaceHardwareOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareOption createAPSReqHardwareOption() {
		APSReqHardwareOptionImpl apsReqHardwareOption = new APSReqHardwareOptionImpl();
		return apsReqHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Entity> APSReqIntroduceNewHardwareOption<T> createAPSReqIntroduceNewHardwareOption() {
		APSReqIntroduceNewHardwareOptionImpl<T> apsReqIntroduceNewHardwareOption = new APSReqIntroduceNewHardwareOptionImpl<T>();
		return apsReqIntroduceNewHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Entity> APSReqRemoveHardwareOption<T> createAPSReqRemoveHardwareOption() {
		APSReqRemoveHardwareOptionImpl<T> apsReqRemoveHardwareOption = new APSReqRemoveHardwareOptionImpl<T>();
		return apsReqRemoveHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Entity> APSReqChangeHardwareOption<T> createAPSReqChangeHardwareOption() {
		APSReqChangeHardwareOptionImpl<T> apsReqChangeHardwareOption = new APSReqChangeHardwareOptionImpl<T>();
		return apsReqChangeHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Entity> APSReqReplaceHardwareOption<T> createAPSReqReplaceHardwareOption() {
		APSReqReplaceHardwareOptionImpl<T> apsReqReplaceHardwareOption = new APSReqReplaceHardwareOptionImpl<T>();
		return apsReqReplaceHardwareOption;
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
