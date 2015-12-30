/**
 */
package openshift.impl;

import openshift.DeploymentConfig;
import openshift.OpenshiftPackage;
import openshift.Pod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link openshift.impl.DeploymentConfigImpl#getDcManagePod <em>Dc Manage Pod</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentConfigImpl extends MinimalEObjectImpl.Container implements DeploymentConfig {
	/**
	 * The cached value of the '{@link #getDcManagePod() <em>Dc Manage Pod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDcManagePod()
	 * @generated
	 * @ordered
	 */
	protected Pod dcManagePod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenshiftPackage.Literals.DEPLOYMENT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod getDcManagePod() {
		if (dcManagePod != null && dcManagePod.eIsProxy()) {
			InternalEObject oldDcManagePod = (InternalEObject)dcManagePod;
			dcManagePod = (Pod)eResolveProxy(oldDcManagePod);
			if (dcManagePod != oldDcManagePod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenshiftPackage.DEPLOYMENT_CONFIG__DC_MANAGE_POD, oldDcManagePod, dcManagePod));
			}
		}
		return dcManagePod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod basicGetDcManagePod() {
		return dcManagePod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDcManagePod(Pod newDcManagePod) {
		Pod oldDcManagePod = dcManagePod;
		dcManagePod = newDcManagePod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.DEPLOYMENT_CONFIG__DC_MANAGE_POD, oldDcManagePod, dcManagePod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenshiftPackage.DEPLOYMENT_CONFIG__DC_MANAGE_POD:
				if (resolve) return getDcManagePod();
				return basicGetDcManagePod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpenshiftPackage.DEPLOYMENT_CONFIG__DC_MANAGE_POD:
				setDcManagePod((Pod)newValue);
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
			case OpenshiftPackage.DEPLOYMENT_CONFIG__DC_MANAGE_POD:
				setDcManagePod((Pod)null);
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
			case OpenshiftPackage.DEPLOYMENT_CONFIG__DC_MANAGE_POD:
				return dcManagePod != null;
		}
		return super.eIsSet(featureID);
	}

} //DeploymentConfigImpl
