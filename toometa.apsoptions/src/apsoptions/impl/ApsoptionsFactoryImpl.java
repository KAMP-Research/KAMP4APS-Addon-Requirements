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
			case ApsoptionsPackage.APS_REQ_OPTION_CONTAINER: return createAPSReqOptionContainer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqOptionContainer createAPSReqOptionContainer() {
		APSReqOptionContainerImpl apsReqOptionContainer = new APSReqOptionContainerImpl();
		return apsReqOptionContainer;
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
