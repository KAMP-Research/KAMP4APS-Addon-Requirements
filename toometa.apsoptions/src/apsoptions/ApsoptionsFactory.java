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
	 * Returns a new object of class '<em>xPPU Introduce New Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Introduce New Component</em>'.
	 * @generated
	 */
	xPPU_IntroduceNewComponent createxPPU_IntroduceNewComponent();

	/**
	 * Returns a new object of class '<em>xPPU Change Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Change Component</em>'.
	 * @generated
	 */
	xPPU_ChangeComponent createxPPU_ChangeComponent();

	/**
	 * Returns a new object of class '<em>xPPU Remove Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Remove Component</em>'.
	 * @generated
	 */
	xPPU_RemoveComponent createxPPU_RemoveComponent();

	/**
	 * Returns a new object of class '<em>xPPU Introduce New Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Introduce New Module</em>'.
	 * @generated
	 */
	xPPU_IntroduceNewModule createxPPU_IntroduceNewModule();

	/**
	 * Returns a new object of class '<em>xPPU Change Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Change Module</em>'.
	 * @generated
	 */
	xPPU_ChangeModule createxPPU_ChangeModule();

	/**
	 * Returns a new object of class '<em>xPPU Remove Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Remove Module</em>'.
	 * @generated
	 */
	xPPU_RemoveModule createxPPU_RemoveModule();

	/**
	 * Returns a new object of class '<em>xPPU Introduce New Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Introduce New Structure</em>'.
	 * @generated
	 */
	xPPU_IntroduceNewStructure createxPPU_IntroduceNewStructure();

	/**
	 * Returns a new object of class '<em>xPPU Change Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Change Structure</em>'.
	 * @generated
	 */
	xPPU_ChangeStructure createxPPU_ChangeStructure();

	/**
	 * Returns a new object of class '<em>xPPU Remove Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Remove Structure</em>'.
	 * @generated
	 */
	xPPU_RemoveStructure createxPPU_RemoveStructure();

	/**
	 * Returns a new object of class '<em>xPPU Introduce New Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Introduce New Interface</em>'.
	 * @generated
	 */
	xPPU_IntroduceNewInterface createxPPU_IntroduceNewInterface();

	/**
	 * Returns a new object of class '<em>xPPU Change Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Change Interface</em>'.
	 * @generated
	 */
	xPPU_ChangeInterface createxPPU_ChangeInterface();

	/**
	 * Returns a new object of class '<em>xPPU Remove Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xPPU Remove Interface</em>'.
	 * @generated
	 */
	xPPU_RemoveInterface createxPPU_RemoveInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApsoptionsPackage getApsoptionsPackage();

} //ApsoptionsFactory
