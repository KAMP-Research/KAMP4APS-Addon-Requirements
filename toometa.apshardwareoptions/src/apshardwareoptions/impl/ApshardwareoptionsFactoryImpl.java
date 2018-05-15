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
			case ApshardwareoptionsPackage.APS_REQ_STRUCTURE_OPTION: return createAPSReqStructureOption();
			case ApshardwareoptionsPackage.APS_REQ_MODULE_OPTION: return createAPSReqModuleOption();
			case ApshardwareoptionsPackage.APS_REQ_COMPONENT_OPTION: return createAPSReqComponentOption();
			case ApshardwareoptionsPackage.APS_REQ_INTERFACE_OPTION: return createAPSReqInterfaceOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqStructureOption createAPSReqStructureOption() {
		APSReqStructureOptionImpl apsReqStructureOption = new APSReqStructureOptionImpl();
		return apsReqStructureOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModuleOption createAPSReqModuleOption() {
		APSReqModuleOptionImpl apsReqModuleOption = new APSReqModuleOptionImpl();
		return apsReqModuleOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqComponentOption createAPSReqComponentOption() {
		APSReqComponentOptionImpl apsReqComponentOption = new APSReqComponentOptionImpl();
		return apsReqComponentOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqInterfaceOption createAPSReqInterfaceOption() {
		APSReqInterfaceOptionImpl apsReqInterfaceOption = new APSReqInterfaceOptionImpl();
		return apsReqInterfaceOption;
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
