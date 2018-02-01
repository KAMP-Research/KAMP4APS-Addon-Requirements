/**
 */
package modificationmarks_hardware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modificationmarks_hardware.Modificationmarks_hardwarePackage
 * @generated
 */
public interface Modificationmarks_hardwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modificationmarks_hardwareFactory eINSTANCE = modificationmarks_hardware.impl.Modificationmarks_hardwareFactoryImpl.init();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Modificationmarks_hardwarePackage getModificationmarks_hardwarePackage();

} //Modificationmarks_hardwareFactory
