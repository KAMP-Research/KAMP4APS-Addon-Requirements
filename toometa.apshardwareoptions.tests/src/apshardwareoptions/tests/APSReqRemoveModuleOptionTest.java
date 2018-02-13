/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqRemoveModuleOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Remove Module Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqRemoveModuleOptionTest extends APSReqModuleHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqRemoveModuleOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Remove Module Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveModuleOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Remove Module Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqRemoveModuleOption getFixture() {
		return (APSReqRemoveModuleOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqRemoveModuleOption());
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

} //APSReqRemoveModuleOptionTest
