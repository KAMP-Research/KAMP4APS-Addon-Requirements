/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqIntroduceNewHardwareOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Introduce New Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqIntroduceNewHardwareOptionTest extends APSReqHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqIntroduceNewHardwareOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Introduce New Hardware Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqIntroduceNewHardwareOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Introduce New Hardware Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqIntroduceNewHardwareOption<?> getFixture() {
		return (APSReqIntroduceNewHardwareOption<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqIntroduceNewHardwareOption());
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

} //APSReqIntroduceNewHardwareOptionTest
