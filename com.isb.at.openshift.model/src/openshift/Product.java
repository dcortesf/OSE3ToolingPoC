/**
 */
package openshift;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link openshift.Product#getProductoBelongsImageStream <em>Producto Belongs Image Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see openshift.OpenshiftPackage#getProduct()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Producto Belongs Image Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Producto Belongs Image Stream</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producto Belongs Image Stream</em>' reference.
	 * @see #setProductoBelongsImageStream(ImageStream)
	 * @see openshift.OpenshiftPackage#getProduct_ProductoBelongsImageStream()
	 * @model
	 * @generated
	 */
	ImageStream getProductoBelongsImageStream();

	/**
	 * Sets the value of the '{@link openshift.Product#getProductoBelongsImageStream <em>Producto Belongs Image Stream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Producto Belongs Image Stream</em>' reference.
	 * @see #getProductoBelongsImageStream()
	 * @generated
	 */
	void setProductoBelongsImageStream(ImageStream value);

} // Product
