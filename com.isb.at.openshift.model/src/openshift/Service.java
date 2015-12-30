/**
 */
package openshift;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link openshift.Service#getServiceManagePod <em>Service Manage Pod</em>}</li>
 *   <li>{@link openshift.Service#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see openshift.OpenshiftPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Manage Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Manage Pod</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Manage Pod</em>' reference.
	 * @see #setServiceManagePod(Pod)
	 * @see openshift.OpenshiftPackage#getService_ServiceManagePod()
	 * @model required="true"
	 * @generated
	 */
	Pod getServiceManagePod();

	/**
	 * Sets the value of the '{@link openshift.Service#getServiceManagePod <em>Service Manage Pod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Manage Pod</em>' reference.
	 * @see #getServiceManagePod()
	 * @generated
	 */
	void setServiceManagePod(Pod value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see openshift.OpenshiftPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link openshift.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Service
