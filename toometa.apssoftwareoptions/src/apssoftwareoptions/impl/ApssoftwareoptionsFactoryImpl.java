/**
 */
package apssoftwareoptions.impl;

import apssoftwareoptions.*;

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
			case ApssoftwareoptionsPackage.APS_REQ_PROGRAM_OPTION: return createAPSReqProgramOption();
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_OPTION: return createAPSReqFunctionOption();
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION: return createAPSReqFunctionBlockOption();
			case ApssoftwareoptionsPackage.APS_REQ_CONFIGURATION_OPTION: return createAPSReqConfigurationOption();
			case ApssoftwareoptionsPackage.APS_REQ_IEC_METHOD_OPTION: return createAPSReqIECMethodOption();
			case ApssoftwareoptionsPackage.APS_REQ_GLOBAL_VARIABLE_OPTION: return createAPSReqGlobalVariableOption();
			case ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION: return createAPSReqIECPropertyOption();
			case ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION: return createAPSReqIECInterfaceOption();
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_METHOD_OPTION: return createAPSReqAbstractMethodOption();
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_PROPERTY_OPTION: return createAPSReqAbstractPropertyOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqProgramOption createAPSReqProgramOption() {
		APSReqProgramOptionImpl apsReqProgramOption = new APSReqProgramOptionImpl();
		return apsReqProgramOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqFunctionOption createAPSReqFunctionOption() {
		APSReqFunctionOptionImpl apsReqFunctionOption = new APSReqFunctionOptionImpl();
		return apsReqFunctionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqFunctionBlockOption createAPSReqFunctionBlockOption() {
		APSReqFunctionBlockOptionImpl apsReqFunctionBlockOption = new APSReqFunctionBlockOptionImpl();
		return apsReqFunctionBlockOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqConfigurationOption createAPSReqConfigurationOption() {
		APSReqConfigurationOptionImpl apsReqConfigurationOption = new APSReqConfigurationOptionImpl();
		return apsReqConfigurationOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIECMethodOption createAPSReqIECMethodOption() {
		APSReqIECMethodOptionImpl apsReqIECMethodOption = new APSReqIECMethodOptionImpl();
		return apsReqIECMethodOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqGlobalVariableOption createAPSReqGlobalVariableOption() {
		APSReqGlobalVariableOptionImpl apsReqGlobalVariableOption = new APSReqGlobalVariableOptionImpl();
		return apsReqGlobalVariableOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIECPropertyOption createAPSReqIECPropertyOption() {
		APSReqIECPropertyOptionImpl apsReqIECPropertyOption = new APSReqIECPropertyOptionImpl();
		return apsReqIECPropertyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIECInterfaceOption createAPSReqIECInterfaceOption() {
		APSReqIECInterfaceOptionImpl apsReqIECInterfaceOption = new APSReqIECInterfaceOptionImpl();
		return apsReqIECInterfaceOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqAbstractMethodOption createAPSReqAbstractMethodOption() {
		APSReqAbstractMethodOptionImpl apsReqAbstractMethodOption = new APSReqAbstractMethodOptionImpl();
		return apsReqAbstractMethodOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqAbstractPropertyOption createAPSReqAbstractPropertyOption() {
		APSReqAbstractPropertyOptionImpl apsReqAbstractPropertyOption = new APSReqAbstractPropertyOptionImpl();
		return apsReqAbstractPropertyOption;
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
