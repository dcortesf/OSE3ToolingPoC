/**
 */
package openshift;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link openshift.Pod#getPodHasProducts <em>Pod Has Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see openshift.OpenshiftPackage#getPod()
 * @model
 * @generated
 */
public interface Pod extends EObject {
	/**
	 * Returns the value of the '<em><b>Pod Has Products</b></em>' reference list.
	 * The list contents are of type {@link openshift.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pod Has Products</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pod Has Products</em>' reference list.
	 * @see openshift.OpenshiftPackage#getPod_PodHasProducts()
	 * @model required="true"
	 * @generated
	 */
	EList<Product> getPodHasProducts();

} // Pod
