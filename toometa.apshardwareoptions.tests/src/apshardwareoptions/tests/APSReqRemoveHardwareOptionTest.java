/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqRemoveHardwareOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Remove Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqRemoveHardwareOptionTest extends APSReqHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqRemoveHardwareOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Remove Hardware Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveHardwareOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Remove Hardware Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqRemoveHardwareOption<?> getFixture() {
		return (APSReqRemoveHardwareOption<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqRemoveHardwareOption());
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

} //APSReqRemoveHardwareOptionTest
