/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqRemoveComponentOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Remove Component Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqRemoveComponentOptionTest extends APSReqComponentHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqRemoveComponentOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Remove Component Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveComponentOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Remove Component Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqRemoveComponentOption getFixture() {
		return (APSReqRemoveComponentOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqRemoveComponentOption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //APSReqRemoveComponentOptionTest
