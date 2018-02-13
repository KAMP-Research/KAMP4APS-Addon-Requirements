/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqChangeModuleOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Change Module Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqChangeModuleOptionTest extends APSReqModuleHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqChangeModuleOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Change Module Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeModuleOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Change Module Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqChangeModuleOption getFixture() {
		return (APSReqChangeModuleOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqChangeModuleOption());
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

} //APSReqChangeModuleOptionTest
