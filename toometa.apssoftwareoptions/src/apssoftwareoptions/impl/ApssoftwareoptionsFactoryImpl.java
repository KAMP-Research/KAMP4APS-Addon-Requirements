/**
 */
package apssoftwareoptions.impl;

import apssoftwareoptions.*;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

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
public class ApssoftwareoptionsFactoryImpl extends EFactoryImpl implements ApssoftwareoptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApssoftwareoptionsFactory init() {
		try {
			ApssoftwareoptionsFactory theApssoftwareoptionsFactory = (ApssoftwareoptionsFactory)EPackage.Registry.INSTANCE.getEFactory(ApssoftwareoptionsPackage.eNS_URI);
			if (theApssoftwareoptionsFactory != null) {
				return theApssoftwareoptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApssoftwareoptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApssoftwareoptionsFactoryImpl() {
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
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION: return createAPSReqSoftwareOption();
			case ApssoftwareoptionsPackage.APS_REQ_CHANGE_SOFTWARE_OPTION: return createAPSReqChangeSoftwareOption();
			case ApssoftwareoptionsPackage.APS_REQ_REMOVE_SOFTWARE_OPTION: return createAPSReqRemoveSoftwareOption();
			case ApssoftwareoptionsPackage.APS_REQ_REPLACE_SOFTWARE_OPTION: return createAPSReqReplaceSoftwareOption();
			case ApssoftwareoptionsPackage.APS_REQ_INTRODUCE_NEW_SOFTWARE_OPTION: return createAPSReqIntroduceNewSoftwareOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T> APSReqSoftwareOption<T> createAPSReqSoftwareOption() {
		APSReqSoftwareOptionImpl<T> apsReqSoftwareOption = new APSReqSoftwareOptionImpl<T>();
		return apsReqSoftwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> APSReqChangeSoftwareOption<T> createAPSReqChangeSoftwareOption() {
		APSReqChangeSoftwareOptionImpl<T> apsReqChangeSoftwareOption = new APSReqChangeSoftwareOptionImpl<T>();
		return apsReqChangeSoftwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> APSReqRemoveSoftwareOption<T> createAPSReqRemoveSoftwareOption() {
		APSReqRemoveSoftwareOptionImpl<T> apsReqRemoveSoftwareOption = new APSReqRemoveSoftwareOptionImpl<T>();
		return apsReqRemoveSoftwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> APSReqReplaceSoftwareOption<T> createAPSReqReplaceSoftwareOption() {
		APSReqReplaceSoftwareOptionImpl<T> apsReqReplaceSoftwareOption = new APSReqReplaceSoftwareOptionImpl<T>();
		return apsReqReplaceSoftwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends IECComponent> APSReqIntroduceNewSoftwareOption<T> createAPSReqIntroduceNewSoftwareOption() {
		APSReqIntroduceNewSoftwareOptionImpl<T> apsReqIntroduceNewSoftwareOption = new APSReqIntroduceNewSoftwareOptionImpl<T>();
		return apsReqIntroduceNewSoftwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApssoftwareoptionsPackage getApssoftwareoptionsPackage() {
		return (ApssoftwareoptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApssoftwareoptionsPackage getPackage() {
		return ApssoftwareoptionsPackage.eINSTANCE;
	}

} //ApssoftwareoptionsFactoryImpl
