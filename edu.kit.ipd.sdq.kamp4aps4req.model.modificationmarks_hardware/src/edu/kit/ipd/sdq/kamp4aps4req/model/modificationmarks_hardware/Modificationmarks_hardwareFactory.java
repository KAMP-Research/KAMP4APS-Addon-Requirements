/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage
 * @generated
 */
public interface Modificationmarks_hardwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modificationmarks_hardwareFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.Modificationmarks_hardwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APS Req Hardware Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Hardware Seed Modifications</em>'.
	 * @generated
	 */
	APSReqHardwareSeedModifications createAPSReqHardwareSeedModifications();

	/**
	 * Returns a new object of class '<em>APS Req Hardware Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Hardware Modification Repository</em>'.
	 * @generated
	 */
	APSReqHardwareModificationRepository createAPSReqHardwareModificationRepository();

	/**
	 * Returns a new object of class '<em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Hardware Change Propagation Due To Specification Dependencies</em>'.
	 * @generated
	 */
	APSReqHardwareChangePropagationDueToSpecificationDependencies createAPSReqHardwareChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns a new object of class '<em>APS Req Modify Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Modify Entity</em>'.
	 * @generated
	 */
	APSReqModifyEntity createAPSReqModifyEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Modificationmarks_hardwarePackage getModificationmarks_hardwarePackage();

} //Modificationmarks_hardwareFactory
