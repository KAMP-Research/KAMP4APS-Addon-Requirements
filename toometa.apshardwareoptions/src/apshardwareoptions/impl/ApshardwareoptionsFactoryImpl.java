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
			case ApshardwareoptionsPackage.APS_REQ_HARDWARE_OPTION: return createAPSReqHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_STRUCTURE_HARDWARE_OPTION: return createAPSReqStructureHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_STRUCTURE_OPTION: return createAPSReqIntroduceNewStructureOption();
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_STRUCTURE_OPTION: return createAPSReqChangeStructureOption();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_STRUCTURE_OPTION: return createAPSReqRemoveStructureOption();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION: return createAPSReqReplaceStructureOption();
			case ApshardwareoptionsPackage.APS_REQ_MODULE_HARDWARE_OPTION: return createAPSReqModuleHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_MODULE_OPTION: return createAPSReqIntroduceNewModuleOption();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_MODULE_OPTION: return createAPSReqRemoveModuleOption();
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_MODULE_OPTION: return createAPSReqChangeModuleOption();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_MODULE_OPTION: return createAPSReqReplaceModuleOption();
			case ApshardwareoptionsPackage.APS_REQ_COMPONENT_HARDWARE_OPTION: return createAPSReqComponentHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_COMPONENT_OPTION: return createAPSReqIntroduceNewComponentOption();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_COMPONENT_OPTION: return createAPSReqRemoveComponentOption();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_COMPONENT_OPTION: return createAPSReqReplaceComponentOption();
			case ApshardwareoptionsPackage.APS_REQ_INTERFACE_HARDWARE_OPTION: return createAPSReqInterfaceHardwareOption();
			case ApshardwareoptionsPackage.APS_REQ_INTRODUCE_NEW_INTERFACE_OPTION: return createAPSReqIntroduceNewInterfaceOption();
			case ApshardwareoptionsPackage.APS_REQ_CHANGE_INTERFACE_OPTION: return createAPSReqChangeInterfaceOption();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_INTERFACE_OPTION: return createAPSReqReplaceInterfaceOption();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_INTERFACE_OPTION: return createAPSReqRemoveInterfaceOption();
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
	public APSReqStructureHardwareOption createAPSReqStructureHardwareOption() {
		APSReqStructureHardwareOptionImpl apsReqStructureHardwareOption = new APSReqStructureHardwareOptionImpl();
		return apsReqStructureHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIntroduceNewStructureOption createAPSReqIntroduceNewStructureOption() {
		APSReqIntroduceNewStructureOptionImpl apsReqIntroduceNewStructureOption = new APSReqIntroduceNewStructureOptionImpl();
		return apsReqIntroduceNewStructureOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeStructureOption createAPSReqChangeStructureOption() {
		APSReqChangeStructureOptionImpl apsReqChangeStructureOption = new APSReqChangeStructureOptionImpl();
		return apsReqChangeStructureOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveStructureOption createAPSReqRemoveStructureOption() {
		APSReqRemoveStructureOptionImpl apsReqRemoveStructureOption = new APSReqRemoveStructureOptionImpl();
		return apsReqRemoveStructureOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqReplaceStructureOption createAPSReqReplaceStructureOption() {
		APSReqReplaceStructureOptionImpl apsReqReplaceStructureOption = new APSReqReplaceStructureOptionImpl();
		return apsReqReplaceStructureOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModuleHardwareOption createAPSReqModuleHardwareOption() {
		APSReqModuleHardwareOptionImpl apsReqModuleHardwareOption = new APSReqModuleHardwareOptionImpl();
		return apsReqModuleHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIntroduceNewModuleOption createAPSReqIntroduceNewModuleOption() {
		APSReqIntroduceNewModuleOptionImpl apsReqIntroduceNewModuleOption = new APSReqIntroduceNewModuleOptionImpl();
		return apsReqIntroduceNewModuleOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveModuleOption createAPSReqRemoveModuleOption() {
		APSReqRemoveModuleOptionImpl apsReqRemoveModuleOption = new APSReqRemoveModuleOptionImpl();
		return apsReqRemoveModuleOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeModuleOption createAPSReqChangeModuleOption() {
		APSReqChangeModuleOptionImpl apsReqChangeModuleOption = new APSReqChangeModuleOptionImpl();
		return apsReqChangeModuleOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqReplaceModuleOption createAPSReqReplaceModuleOption() {
		APSReqReplaceModuleOptionImpl apsReqReplaceModuleOption = new APSReqReplaceModuleOptionImpl();
		return apsReqReplaceModuleOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqComponentHardwareOption createAPSReqComponentHardwareOption() {
		APSReqComponentHardwareOptionImpl apsReqComponentHardwareOption = new APSReqComponentHardwareOptionImpl();
		return apsReqComponentHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIntroduceNewComponentOption createAPSReqIntroduceNewComponentOption() {
		APSReqIntroduceNewComponentOptionImpl apsReqIntroduceNewComponentOption = new APSReqIntroduceNewComponentOptionImpl();
		return apsReqIntroduceNewComponentOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveComponentOption createAPSReqRemoveComponentOption() {
		APSReqRemoveComponentOptionImpl apsReqRemoveComponentOption = new APSReqRemoveComponentOptionImpl();
		return apsReqRemoveComponentOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqReplaceComponentOption createAPSReqReplaceComponentOption() {
		APSReqReplaceComponentOptionImpl apsReqReplaceComponentOption = new APSReqReplaceComponentOptionImpl();
		return apsReqReplaceComponentOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqInterfaceHardwareOption createAPSReqInterfaceHardwareOption() {
		APSReqInterfaceHardwareOptionImpl apsReqInterfaceHardwareOption = new APSReqInterfaceHardwareOptionImpl();
		return apsReqInterfaceHardwareOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIntroduceNewInterfaceOption createAPSReqIntroduceNewInterfaceOption() {
		APSReqIntroduceNewInterfaceOptionImpl apsReqIntroduceNewInterfaceOption = new APSReqIntroduceNewInterfaceOptionImpl();
		return apsReqIntroduceNewInterfaceOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeInterfaceOption createAPSReqChangeInterfaceOption() {
		APSReqChangeInterfaceOptionImpl apsReqChangeInterfaceOption = new APSReqChangeInterfaceOptionImpl();
		return apsReqChangeInterfaceOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqReplaceInterfaceOption createAPSReqReplaceInterfaceOption() {
		APSReqReplaceInterfaceOptionImpl apsReqReplaceInterfaceOption = new APSReqReplaceInterfaceOptionImpl();
		return apsReqReplaceInterfaceOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveInterfaceOption createAPSReqRemoveInterfaceOption() {
		APSReqRemoveInterfaceOptionImpl apsReqRemoveInterfaceOption = new APSReqRemoveInterfaceOptionImpl();
		return apsReqRemoveInterfaceOption;
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
