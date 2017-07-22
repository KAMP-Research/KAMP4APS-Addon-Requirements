/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage
 * @generated
 */
public interface APSReqModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	APSReqModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqModificationmarksFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>APS Req Modification Repository</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modification Repository</em>'.
	 * @generated
	 */
	APSReqModificationRepository createAPSReqModificationRepository();

	/**
	 * Returns a new object of class '<em>APS Req Seed Modifications</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Seed Modifications</em>'.
	 * @generated
	 */
	APSReqSeedModifications createAPSReqSeedModifications();

	/**
	 * Returns a new object of class '<em>APS Req Change Propagation Due To
	 * Specification Dependencies</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Change Propagation Due To
	 *         Specification Dependencies</em>'.
	 * @generated
	 */
	APSReqChangePropagationDueToSpecificationDependencies createAPSReqChangePropagationDueToSpecificationDependencies();

	/**
	 * Returns a new object of class '<em>APS Req Modify Component</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Component</em>'.
	 * @generated
	 */
	APSReqModifyComponent createAPSReqModifyComponent();

	/**
	 * Returns a new object of class '<em>APS Req Modify Module</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Module</em>'.
	 * @generated
	 */
	APSReqModifyModule createAPSReqModifyModule();

	/**
	 * Returns a new object of class '<em>APS Req Modify Structure</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Structure</em>'.
	 * @generated
	 */
	APSReqModifyStructure createAPSReqModifyStructure();

	/**
	 * Returns a new object of class '<em>APS Req Modify Interface</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Interface</em>'.
	 * @generated
	 */
	APSReqModifyInterface createAPSReqModifyInterface();

	/**
	 * Returns a new object of class '<em>APS Req Modify Requirement</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Requirement</em>'.
	 * @generated
	 */
	APSReqModifyRequirement createAPSReqModifyRequirement();

	/**
	 * Returns a new object of class '<em>APS Req Modify Decision</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Decision</em>'.
	 * @generated
	 */
	APSReqModifyDecision createAPSReqModifyDecision();

	/**
	 * Returns a new object of class '<em>APS Req Modify Option</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>APS Req Modify Option</em>'.
	 * @generated
	 */
	APSReqModifyOption createAPSReqModifyOption();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	APSReqModificationmarksPackage getAPSReqModificationmarksPackage();

} // APSReqModificationmarksFactory
