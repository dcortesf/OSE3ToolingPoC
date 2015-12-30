/**
 */
package openshift;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link openshift.DeploymentConfig#getDcManagePod <em>Dc Manage Pod</em>}</li>
 * </ul>
 * </p>
 *
 * @see openshift.OpenshiftPackage#getDeploymentConfig()
 * @model
 * @generated
 */
public interface DeploymentConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Dc Manage Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dc Manage Pod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dc Manage Pod</em>' reference.
	 * @see #setDcManagePod(Pod)
	 * @see openshift.OpenshiftPackage#getDeploymentConfig_DcManagePod()
	 * @model required="true"
	 * @generated
	 */
	Pod getDcManagePod();

	/**
	 * Sets the value of the '{@link openshift.DeploymentConfig#getDcManagePod <em>Dc Manage Pod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dc Manage Pod</em>' reference.
	 * @see #getDcManagePod()
	 * @generated
	 */
	void setDcManagePod(Pod value);

} // DeploymentConfig
