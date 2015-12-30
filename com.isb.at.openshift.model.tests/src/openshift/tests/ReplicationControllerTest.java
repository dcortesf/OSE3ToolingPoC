/**
 */
package openshift.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openshift.OpenshiftFactory;
import openshift.ReplicationController;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Replication Controller</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReplicationControllerTest extends TestCase {

	/**
	 * The fixture for this Replication Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicationController fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReplicationControllerTest.class);
	}

	/**
	 * Constructs a new Replication Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicationControllerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Replication Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReplicationController fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Replication Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicationController getFixture() {
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
		setFixture(OpenshiftFactory.eINSTANCE.createReplicationController());
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

} //ReplicationControllerTest
