/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqRemoveInterfaceOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Remove Interface Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqRemoveInterfaceOptionTest extends APSReqInterfaceHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqRemoveInterfaceOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Remove Interface Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveInterfaceOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Remove Interface Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqRemoveInterfaceOption getFixture() {
		return (APSReqRemoveInterfaceOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqRemoveInterfaceOption());
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

} //APSReqRemoveInterfaceOptionTest
