/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.*;

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
public class Modificationmarks_hardwareFactoryImpl extends EFactoryImpl implements Modificationmarks_hardwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Modificationmarks_hardwareFactory init() {
		try {
			Modificationmarks_hardwareFactory theModificationmarks_hardwareFactory = (Modificationmarks_hardwareFactory)EPackage.Registry.INSTANCE.getEFactory(Modificationmarks_hardwarePackage.eNS_URI);
			if (theModificationmarks_hardwareFactory != null) {
				return theModificationmarks_hardwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Modificationmarks_hardwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modificationmarks_hardwareFactoryImpl() {
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS: return createAPSReqHardwareSeedModifications();
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_MODIFICATION_REPOSITORY: return createAPSReqHardwareModificationRepository();
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: return createAPSReqHardwareChangePropagationDueToSpecificationDependencies();
			case Modificationmarks_hardwarePackage.APS_REQ_MODIFY_ENTITY: return createAPSReqModifyEntity();
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
	public Modificationmarks_hardwarePackage getModificationmarks_hardwarePackage() {
		return (Modificationmarks_hardwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Modificationmarks_hardwarePackage getPackage() {
		return Modificationmarks_hardwarePackage.eINSTANCE;
	}

} //Modificationmarks_hardwareFactoryImpl
