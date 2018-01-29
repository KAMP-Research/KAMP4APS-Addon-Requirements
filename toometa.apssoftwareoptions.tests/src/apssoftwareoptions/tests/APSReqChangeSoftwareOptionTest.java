/**
 */
package apssoftwareoptions.tests;

import apssoftwareoptions.APSReqChangeSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Change Software Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqChangeSoftwareOptionTest extends APSReqSoftwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqChangeSoftwareOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Change Software Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeSoftwareOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Change Software Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqChangeSoftwareOption<?> getFixture() {
		return (APSReqChangeSoftwareOption<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApssoftwareoptionsFactory.eINSTANCE.createAPSReqChangeSoftwareOption());
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

} //APSReqChangeSoftwareOptionTest
