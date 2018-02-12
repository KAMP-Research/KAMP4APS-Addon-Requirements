/**
 */
package apssoftwareoptions;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see apssoftwareoptions.ApssoftwareoptionsPackage
 * @generated
 */
public interface ApssoftwareoptionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApssoftwareoptionsFactory eINSTANCE = apssoftwareoptions.impl.ApssoftwareoptionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>APS Req Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Software Option</em>'.
	 * @generated
	 */
	<T> APSReqSoftwareOption<T> createAPSReqSoftwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Change Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Change Software Option</em>'.
	 * @generated
	 */
	<T extends IECComponent> APSReqChangeSoftwareOption<T> createAPSReqChangeSoftwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Remove Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Remove Software Option</em>'.
	 * @generated
	 */
	<T extends IECComponent> APSReqRemoveSoftwareOption<T> createAPSReqRemoveSoftwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Replace Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Replace Software Option</em>'.
	 * @generated
	 */
	<T extends IECComponent> APSReqReplaceSoftwareOption<T> createAPSReqReplaceSoftwareOption();

	/**
	 * Returns a new object of class '<em>APS Req Introduce New Software Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Introduce New Software Option</em>'.
	 * @generated
	 */
	<T extends IECComponent> APSReqIntroduceNewSoftwareOption<T> createAPSReqIntroduceNewSoftwareOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApssoftwareoptionsPackage getApssoftwareoptionsPackage();

} //ApssoftwareoptionsFactory
