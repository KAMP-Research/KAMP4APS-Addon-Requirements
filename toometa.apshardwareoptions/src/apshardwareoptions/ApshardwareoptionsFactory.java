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
	 * Returns a new object of class '<em>APS Req Structure Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Structure Option</em>'.
	 * @generated
	 */
	APSReqStructureOption createAPSReqStructureOption();

	/**
	 * Returns a new object of class '<em>APS Req Module Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Module Option</em>'.
	 * @generated
	 */
	APSReqModuleOption createAPSReqModuleOption();

	/**
	 * Returns a new object of class '<em>APS Req Component Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Component Option</em>'.
	 * @generated
	 */
	APSReqComponentOption createAPSReqComponentOption();

	/**
	 * Returns a new object of class '<em>APS Req Interface Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>APS Req Interface Option</em>'.
	 * @generated
	 */
	APSReqInterfaceOption createAPSReqInterfaceOption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApshardwareoptionsPackage getApshardwareoptionsPackage();

} //ApshardwareoptionsFactory
