/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage
 * @generated
 */
public interface APSReqSoftwareModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	APSReqSoftwareModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareModificationmarksFactoryImpl.init();

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
	 * Returns a new object of class '<em>APS Req Software Change Propagation Due To Specification Dependencies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Software Change Propagation Due To Specification Dependencies</em>'.
	 * @generated
	 */
	APSReqSoftwareChangePropagationDueToSpecificationDependencies createAPSReqSoftwareChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns a new object of class '<em>APS Req Modify IEC Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Modify IEC Component</em>'.
	 * @generated
	 */
	APSReqModifyIECComponent createAPSReqModifyIECComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	APSReqSoftwareModificationmarksPackage getAPSReqSoftwareModificationmarksPackage();

} //APSReqSoftwareModificationmarksFactory
