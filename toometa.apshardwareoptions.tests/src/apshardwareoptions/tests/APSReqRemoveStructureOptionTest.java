/**
 */
package apshardwareoptions.tests;

import apshardwareoptions.APSReqRemoveStructureOption;
import apshardwareoptions.ApshardwareoptionsFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>APS Req Remove Structure Option</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqRemoveStructureOptionTest extends APSReqStructureHardwareOptionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(APSReqRemoveStructureOptionTest.class);
	}

	/**
	 * Constructs a new APS Req Remove Structure Option test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqRemoveStructureOptionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this APS Req Remove Structure Option test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected APSReqRemoveStructureOption getFixture() {
		return (APSReqRemoveStructureOption)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApshardwareoptionsFactory.eINSTANCE.createAPSReqRemoveStructureOption());
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

} //APSReqRemoveStructureOptionTest
