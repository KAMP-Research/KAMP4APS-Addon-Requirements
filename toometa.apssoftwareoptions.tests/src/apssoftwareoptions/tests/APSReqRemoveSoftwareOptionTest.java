/**
 */
package apssoftwareoptions.tests;

import apssoftwareoptions.APSReqRemoveSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Remove Software Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqRemoveSoftwareOptionTest extends APSReqSoftwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqRemoveSoftwareOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Remove Software Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveSoftwareOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Remove Software Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqRemoveSoftwareOption<?> getFixture() {
		return (APSReqRemoveSoftwareOption<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApssoftwareoptionsFactory.eINSTANCE.createAPSReqRemoveSoftwareOption());
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

} //APSReqRemoveSoftwareOptionTest
