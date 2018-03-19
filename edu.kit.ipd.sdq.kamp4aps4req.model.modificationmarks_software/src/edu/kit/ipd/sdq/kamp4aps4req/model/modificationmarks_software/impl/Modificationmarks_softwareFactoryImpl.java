/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.*;

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
public class Modificationmarks_softwareFactoryImpl extends EFactoryImpl implements Modificationmarks_softwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Modificationmarks_softwareFactory init() {
		try {
			Modificationmarks_softwareFactory theModificationmarks_softwareFactory = (Modificationmarks_softwareFactory)EPackage.Registry.INSTANCE.getEFactory(Modificationmarks_softwarePackage.eNS_URI);
			if (theModificationmarks_softwareFactory != null) {
				return theModificationmarks_softwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Modificationmarks_softwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modificationmarks_softwareFactoryImpl() {
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
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS: return createAPSReqSoftwareSeedModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY: return createAPSReqSoftwareModificationRepository();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES: return createAPSReqSoftwareChangePropagationDueToSpecificationDependencies();
			case Modificationmarks_softwarePackage.APS_REQ_MODIFY_IEC_COMPONENT: return createAPSReqModifyIECComponent();
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
	public Modificationmarks_softwarePackage getModificationmarks_softwarePackage() {
		return (Modificationmarks_softwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Modificationmarks_softwarePackage getPackage() {
		return Modificationmarks_softwarePackage.eINSTANCE;
	}

} //Modificationmarks_softwareFactoryImpl
