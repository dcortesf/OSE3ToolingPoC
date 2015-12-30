/**
 */
package openshift.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openshift.OpenshiftFactory;
import openshift.Pod;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PodTest extends TestCase {

	/**
	 * The fixture for this Pod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pod fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PodTest.class);
	}

	/**
	 * Constructs a new Pod test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PodTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Pod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Pod fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pod test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pod getFixture() {
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
		setFixture(OpenshiftFactory.eINSTANCE.createPod());
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

} //PodTest
