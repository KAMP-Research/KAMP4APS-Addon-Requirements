/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.*;

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
public class APSReqSoftwareModificationmarksFactoryImpl extends EFactoryImpl implements APSReqSoftwareModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static APSReqSoftwareModificationmarksFactory init() {
		try {
			APSReqSoftwareModificationmarksFactory theAPSReqSoftwareModificationmarksFactory = (APSReqSoftwareModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(APSReqSoftwareModificationmarksPackage.eNS_URI);
			if (theAPSReqSoftwareModificationmarksFactory != null) {
				return theAPSReqSoftwareModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new APSReqSoftwareModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareModificationmarksFactoryImpl() {
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS: return createAPSReqSoftwareSeedModifications();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY: return createAPSReqSoftwareModificationRepository();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: return createAPSReqSoftwareChangePropagationDueToSpecificationDependencies();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_MODIFY_IEC_COMPONENT: return createAPSReqModifyIECComponent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareSeedModifications createAPSReqSoftwareSeedModifications() {
		APSReqSoftwareSeedModificationsImpl apsReqSoftwareSeedModifications = new APSReqSoftwareSeedModificationsImpl();
		return apsReqSoftwareSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareModificationRepository createAPSReqSoftwareModificationRepository() {
		APSReqSoftwareModificationRepositoryImpl apsReqSoftwareModificationRepository = new APSReqSoftwareModificationRepositoryImpl();
		return apsReqSoftwareModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareChangePropagationDueToSpecificationDependencies createAPSReqSoftwareChangePropagationDueToSpecificationDependencies() {
		APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl apsReqSoftwareChangePropagationDueToSpecificationDependencies = new APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl();
		return apsReqSoftwareChangePropagationDueToSpecificationDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModifyIECComponent createAPSReqModifyIECComponent() {
		APSReqModifyIECComponentImpl apsReqModifyIECComponent = new APSReqModifyIECComponentImpl();
		return apsReqModifyIECComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareModificationmarksPackage getAPSReqSoftwareModificationmarksPackage() {
		return (APSReqSoftwareModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static APSReqSoftwareModificationmarksPackage getPackage() {
		return APSReqSoftwareModificationmarksPackage.eINSTANCE;
	}

} //APSReqSoftwareModificationmarksFactoryImpl
