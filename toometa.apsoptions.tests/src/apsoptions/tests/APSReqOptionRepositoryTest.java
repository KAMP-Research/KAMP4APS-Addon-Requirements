/**
 */
package apsoptions.tests;

import apsoptions.APSReqOptionRepository;
import apsoptions.ApsoptionsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Option Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqOptionRepositoryTest extends TestCase {

	/**
	 * The fixture for this APS Req Option Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqOptionRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqOptionRepositoryTest.class);
	}

	/**
	 * Constructs a new APS Req Option Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqOptionRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this APS Req Option Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(APSReqOptionRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this APS Req Option Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqOptionRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApsoptionsFactory.eINSTANCE.createAPSReqOptionRepository());
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

} //APSReqOptionRepositoryTest
