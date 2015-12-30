/**
 */
package openshift;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replication Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link openshift.ReplicationController#getRcManagePod <em>Rc Manage Pod</em>}</li>
 *   <li>{@link openshift.ReplicationController#getReplicas <em>Replicas</em>}</li>
 * </ul>
 * </p>
 *
 * @see openshift.OpenshiftPackage#getReplicationController()
 * @model
 * @generated
 */
public interface ReplicationController extends EObject {
	/**
	 * Returns the value of the '<em><b>Rc Manage Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rc Manage Pod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rc Manage Pod</em>' reference.
	 * @see #setRcManagePod(Pod)
	 * @see openshift.OpenshiftPackage#getReplicationController_RcManagePod()
	 * @model required="true"
	 * @generated
	 */
	Pod getRcManagePod();

	/**
	 * Sets the value of the '{@link openshift.ReplicationController#getRcManagePod <em>Rc Manage Pod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rc Manage Pod</em>' reference.
	 * @see #getRcManagePod()
	 * @generated
	 */
	void setRcManagePod(Pod value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replicas</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see openshift.OpenshiftPackage#getReplicationController_Replicas()
	 * @model default="1"
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link openshift.ReplicationController#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

} // ReplicationController
