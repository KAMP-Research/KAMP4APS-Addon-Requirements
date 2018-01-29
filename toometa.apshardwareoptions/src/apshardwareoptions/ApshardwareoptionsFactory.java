/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

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
	 * Returns a new object of class '<em>APS Req Introduce New Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Introduce New Hardware Option</em>'.
	 * @generated
	 */
	<T extends Entity> APSReqIntroduceNewHardwareOption<T> createAPSReqIntroduceNewHardwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Remove Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Remove Hardware Option</em>'.
	 * @generated
	 */
	<T extends Entity> APSReqRemoveHardwareOption<T> createAPSReqRemoveHardwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Change Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Change Hardware Option</em>'.
	 * @generated
	 */
	<T extends Entity> APSReqChangeHardwareOption<T> createAPSReqChangeHardwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Replace Hardware Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Replace Hardware Option</em>'.
	 * @generated
	 */
	<T extends Entity> APSReqReplaceHardwareOption<T> createAPSReqReplaceHardwareOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApshardwareoptionsPackage getApshardwareoptionsPackage();

} //ApshardwareoptionsFactory
