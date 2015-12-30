/**
 */
package openshift.impl;

import java.util.Collection;

import openshift.OpenshiftPackage;
import openshift.Pod;
import openshift.Product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link openshift.impl.PodImpl#getPodHasProducts <em>Pod Has Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PodImpl extends MinimalEObjectImpl.Container implements Pod {
	/**
	 * The cached value of the '{@link #getPodHasProducts() <em>Pod Has Products</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPodHasProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> podHasProducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenshiftPackage.Literals.POD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getPodHasProducts() {
		if (podHasProducts == null) {
			podHasProducts = new EObjectResolvingEList<Product>(Product.class, this, OpenshiftPackage.POD__POD_HAS_PRODUCTS);
		}
		return podHasProducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenshiftPackage.POD__POD_HAS_PRODUCTS:
				return getPodHasProducts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenshiftPackage.POD__POD_HAS_PRODUCTS:
				getPodHasProducts().clear();
				getPodHasProducts().addAll((Collection<? extends Product>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpenshiftPackage.POD__POD_HAS_PRODUCTS:
				getPodHasProducts().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpenshiftPackage.POD__POD_HAS_PRODUCTS:
				return podHasProducts != null && !podHasProducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PodImpl
