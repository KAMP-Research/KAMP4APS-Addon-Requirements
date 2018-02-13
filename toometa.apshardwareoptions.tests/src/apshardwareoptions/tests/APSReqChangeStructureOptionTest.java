/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqChangeStructureOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Change Structure Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqChangeStructureOptionTest extends APSReqStructureHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqChangeStructureOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Change Structure Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqChangeStructureOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Change Structure Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqChangeStructureOption getFixture() {
		return (APSReqChangeStructureOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqChangeStructureOption());
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

} //APSReqChangeStructureOptionTest
