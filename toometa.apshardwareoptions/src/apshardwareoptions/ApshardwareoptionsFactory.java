/**
 */
package apshardwareoptions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see apshardwareoptions.ApshardwareoptionsPackage
 * @generated
 */
public interface ApshardwareoptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApshardwareoptionsFactory eINSTANCE = apshardwareoptions.impl.ApshardwareoptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APS Req Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Hardware Option</em>'.
	 * @generated
	 */
	APSReqHardwareOption createAPSReqHardwareOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApshardwareoptionsPackage getApshardwareoptionsPackage();

} //ApshardwareoptionsFactory
