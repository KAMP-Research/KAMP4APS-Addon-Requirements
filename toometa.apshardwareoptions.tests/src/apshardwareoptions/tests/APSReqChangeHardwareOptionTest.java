/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqChangeHardwareOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Change Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqChangeHardwareOptionTest extends APSReqHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqChangeHardwareOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Change Hardware Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeHardwareOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Change Hardware Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqChangeHardwareOption<?> getFixture() {
		return (APSReqChangeHardwareOption<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqChangeHardwareOption());
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

} //APSReqChangeHardwareOptionTest
