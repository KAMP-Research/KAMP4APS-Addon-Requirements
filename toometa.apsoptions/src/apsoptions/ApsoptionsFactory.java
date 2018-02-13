/**
 */
package apsoptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see apsoptions.ApsoptionsPackage
 * @generated
 */
public interface ApsoptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApsoptionsFactory eINSTANCE = apsoptions.impl.ApsoptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APS Req Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Option</em>'.
	 * @generated
	 */
	APSReqOption createAPSReqOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApsoptionsPackage getApsoptionsPackage();

} //ApsoptionsFactory
