/**
 */
package modificationmarks_software;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see modificationmarks_software.Modificationmarks_softwarePackage
 * @generated
 */
public interface Modificationmarks_softwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Modificationmarks_softwareFactory eINSTANCE = modificationmarks_software.impl.Modificationmarks_softwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APS Req Software Seed Modifications</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Software Seed Modifications</em>'.
	 * @generated
	 */
	APSReqSoftwareSeedModifications createAPSReqSoftwareSeedModifications();

	/**
	 * Returns a new object of class '<em>APS Req Software Modification Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Software Modification Repository</em>'.
	 * @generated
	 */
	APSReqSoftwareModificationRepository createAPSReqSoftwareModificationRepository();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Modificationmarks_softwarePackage getModificationmarks_softwarePackage();

} //Modificationmarks_softwareFactory
