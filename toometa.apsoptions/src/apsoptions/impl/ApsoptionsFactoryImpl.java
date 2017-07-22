/**
 */
package apsoptions.impl;

import apsoptions.*;

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
public class ApsoptionsFactoryImpl extends EFactoryImpl implements ApsoptionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApsoptionsFactory init() {
		try {
			ApsoptionsFactory theApsoptionsFactory = (ApsoptionsFactory)EPackage.Registry.INSTANCE.getEFactory(ApsoptionsPackage.eNS_URI);
			if (theApsoptionsFactory != null) {
				return theApsoptionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApsoptionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsoptionsFactoryImpl() {
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
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_COMPONENT: return (EObject)createxPPU_IntroduceNewComponent();
			case ApsoptionsPackage.XPPU_CHANGE_COMPONENT: return (EObject)createxPPU_ChangeComponent();
			case ApsoptionsPackage.XPPU_REMOVE_COMPONENT: return (EObject)createxPPU_RemoveComponent();
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_MODULE: return (EObject)createxPPU_IntroduceNewModule();
			case ApsoptionsPackage.XPPU_CHANGE_MODULE: return (EObject)createxPPU_ChangeModule();
			case ApsoptionsPackage.XPPU_REMOVE_MODULE: return (EObject)createxPPU_RemoveModule();
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_STRUCTURE: return (EObject)createxPPU_IntroduceNewStructure();
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE: return (EObject)createxPPU_ChangeStructure();
			case ApsoptionsPackage.XPPU_REMOVE_STRUCTURE: return (EObject)createxPPU_RemoveStructure();
			case ApsoptionsPackage.XPPU_INTRODUCE_NEW_INTERFACE: return (EObject)createxPPU_IntroduceNewInterface();
			case ApsoptionsPackage.XPPU_CHANGE_INTERFACE: return (EObject)createxPPU_ChangeInterface();
			case ApsoptionsPackage.XPPU_REMOVE_INTERFACE: return (EObject)createxPPU_RemoveInterface();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_IntroduceNewComponent createxPPU_IntroduceNewComponent() {
		xPPU_IntroduceNewComponentImpl xPPU_IntroduceNewComponent = new xPPU_IntroduceNewComponentImpl();
		return xPPU_IntroduceNewComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_ChangeComponent createxPPU_ChangeComponent() {
		xPPU_ChangeComponentImpl xPPU_ChangeComponent = new xPPU_ChangeComponentImpl();
		return xPPU_ChangeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_RemoveComponent createxPPU_RemoveComponent() {
		xPPU_RemoveComponentImpl xPPU_RemoveComponent = new xPPU_RemoveComponentImpl();
		return xPPU_RemoveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_IntroduceNewModule createxPPU_IntroduceNewModule() {
		xPPU_IntroduceNewModuleImpl xPPU_IntroduceNewModule = new xPPU_IntroduceNewModuleImpl();
		return xPPU_IntroduceNewModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_ChangeModule createxPPU_ChangeModule() {
		xPPU_ChangeModuleImpl xPPU_ChangeModule = new xPPU_ChangeModuleImpl();
		return xPPU_ChangeModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_RemoveModule createxPPU_RemoveModule() {
		xPPU_RemoveModuleImpl xPPU_RemoveModule = new xPPU_RemoveModuleImpl();
		return xPPU_RemoveModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_IntroduceNewStructure createxPPU_IntroduceNewStructure() {
		xPPU_IntroduceNewStructureImpl xPPU_IntroduceNewStructure = new xPPU_IntroduceNewStructureImpl();
		return xPPU_IntroduceNewStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_ChangeStructure createxPPU_ChangeStructure() {
		xPPU_ChangeStructureImpl xPPU_ChangeStructure = new xPPU_ChangeStructureImpl();
		return xPPU_ChangeStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_RemoveStructure createxPPU_RemoveStructure() {
		xPPU_RemoveStructureImpl xPPU_RemoveStructure = new xPPU_RemoveStructureImpl();
		return xPPU_RemoveStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_IntroduceNewInterface createxPPU_IntroduceNewInterface() {
		xPPU_IntroduceNewInterfaceImpl xPPU_IntroduceNewInterface = new xPPU_IntroduceNewInterfaceImpl();
		return xPPU_IntroduceNewInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_ChangeInterface createxPPU_ChangeInterface() {
		xPPU_ChangeInterfaceImpl xPPU_ChangeInterface = new xPPU_ChangeInterfaceImpl();
		return xPPU_ChangeInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xPPU_RemoveInterface createxPPU_RemoveInterface() {
		xPPU_RemoveInterfaceImpl xPPU_RemoveInterface = new xPPU_RemoveInterfaceImpl();
		return xPPU_RemoveInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApsoptionsPackage getApsoptionsPackage() {
		return (ApsoptionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApsoptionsPackage getPackage() {
		return ApsoptionsPackage.eINSTANCE;
	}

} //ApsoptionsFactoryImpl
