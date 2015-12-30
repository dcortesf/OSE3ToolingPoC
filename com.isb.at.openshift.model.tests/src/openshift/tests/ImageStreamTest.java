/**
 */
package openshift.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import openshift.ImageStream;
import openshift.OpenshiftFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Stream</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageStreamTest extends TestCase {

	/**
	 * The fixture for this Image Stream test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageStream fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageStreamTest.class);
	}

	/**
	 * Constructs a new Image Stream test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStreamTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Image Stream test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ImageStream fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Image Stream test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageStream getFixture() {
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
		setFixture(OpenshiftFactory.eINSTANCE.createImageStream());
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

} //ImageStreamTest
