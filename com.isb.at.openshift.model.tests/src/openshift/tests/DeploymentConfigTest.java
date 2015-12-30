/**
 */
package openshift.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openshift.DeploymentConfig;
import openshift.OpenshiftFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Deployment Config</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentConfigTest extends TestCase {

	/**
	 * The fixture for this Deployment Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConfig fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeploymentConfigTest.class);
	}

	/**
	 * Constructs a new Deployment Config test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConfigTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Deployment Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DeploymentConfig fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Deployment Config test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConfig getFixture() {
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
		setFixture(OpenshiftFactory.eINSTANCE.createDeploymentConfig());
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

} //DeploymentConfigTest
