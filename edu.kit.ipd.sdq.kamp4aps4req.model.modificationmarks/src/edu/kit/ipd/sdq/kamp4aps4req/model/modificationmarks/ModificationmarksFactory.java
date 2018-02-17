/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage
 * @generated
 */
public interface ModificationmarksFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModificationmarksFactory eINSTANCE = edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.ModificationmarksFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APS Req Modify Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Modify Requirement</em>'.
	 * @generated
	 */
	APSReqModifyRequirement createAPSReqModifyRequirement();

	/**
	 * Returns a new object of class '<em>APS Req Modify Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Modify Decision</em>'.
	 * @generated
	 */
	APSReqModifyDecision createAPSReqModifyDecision();

	/**
	 * Returns a new object of class '<em>APS Req Modify Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Modify Option</em>'.
	 * @generated
	 */
	APSReqModifyOption createAPSReqModifyOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModificationmarksPackage getModificationmarksPackage();

} //ModificationmarksFactory
