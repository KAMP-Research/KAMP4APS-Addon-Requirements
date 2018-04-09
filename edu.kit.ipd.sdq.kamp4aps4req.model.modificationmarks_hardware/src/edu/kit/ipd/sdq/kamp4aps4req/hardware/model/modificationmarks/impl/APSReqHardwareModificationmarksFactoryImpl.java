/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.hardware.model.modificationmarks.*;

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
public class APSReqHardwareModificationmarksFactoryImpl extends EFactoryImpl implements APSReqHardwareModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static APSReqHardwareModificationmarksFactory init() {
		try {
			APSReqHardwareModificationmarksFactory theAPSReqHardwareModificationmarksFactory = (APSReqHardwareModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(APSReqHardwareModificationmarksPackage.eNS_URI);
			if (theAPSReqHardwareModificationmarksFactory != null) {
				return theAPSReqHardwareModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new APSReqHardwareModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareModificationmarksFactoryImpl() {
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
			case APSReqHardwareModificationmarksPackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS: return createAPSReqHardwareSeedModifications();
			case APSReqHardwareModificationmarksPackage.APS_REQ_HARDWARE_MODIFICATION_REPOSITORY: return createAPSReqHardwareModificationRepository();
			case APSReqHardwareModificationmarksPackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: return createAPSReqHardwareChangePropagationDueToSpecificationDependencies();
			case APSReqHardwareModificationmarksPackage.APS_REQ_MODIFY_ENTITY: return createAPSReqModifyEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareSeedModifications createAPSReqHardwareSeedModifications() {
		APSReqHardwareSeedModificationsImpl apsReqHardwareSeedModifications = new APSReqHardwareSeedModificationsImpl();
		return apsReqHardwareSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareModificationRepository createAPSReqHardwareModificationRepository() {
		APSReqHardwareModificationRepositoryImpl apsReqHardwareModificationRepository = new APSReqHardwareModificationRepositoryImpl();
		return apsReqHardwareModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareChangePropagationDueToSpecificationDependencies createAPSReqHardwareChangePropagationDueToSpecificationDependencies() {
		APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl apsReqHardwareChangePropagationDueToSpecificationDependencies = new APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl();
		return apsReqHardwareChangePropagationDueToSpecificationDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModifyEntity createAPSReqModifyEntity() {
		APSReqModifyEntityImpl apsReqModifyEntity = new APSReqModifyEntityImpl();
		return apsReqModifyEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareModificationmarksPackage getAPSReqHardwareModificationmarksPackage() {
		return (APSReqHardwareModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static APSReqHardwareModificationmarksPackage getPackage() {
		return APSReqHardwareModificationmarksPackage.eINSTANCE;
	}

} //APSReqHardwareModificationmarksFactoryImpl
