/**
 */
package openshift.impl;

import openshift.OpenshiftPackage;
import openshift.Pod;
import openshift.ReplicationController;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replication Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link openshift.impl.ReplicationControllerImpl#getRcManagePod <em>Rc Manage Pod</em>}</li>
 *   <li>{@link openshift.impl.ReplicationControllerImpl#getReplicas <em>Replicas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplicationControllerImpl extends MinimalEObjectImpl.Container implements ReplicationController {
	/**
	 * The cached value of the '{@link #getRcManagePod() <em>Rc Manage Pod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcManagePod()
	 * @generated
	 * @ordered
	 */
	protected Pod rcManagePod;

	/**
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 1;
	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicationControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenshiftPackage.Literals.REPLICATION_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod getRcManagePod() {
		if (rcManagePod != null && rcManagePod.eIsProxy()) {
			InternalEObject oldRcManagePod = (InternalEObject)rcManagePod;
			rcManagePod = (Pod)eResolveProxy(oldRcManagePod);
			if (rcManagePod != oldRcManagePod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenshiftPackage.REPLICATION_CONTROLLER__RC_MANAGE_POD, oldRcManagePod, rcManagePod));
			}
		}
		return rcManagePod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod basicGetRcManagePod() {
		return rcManagePod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcManagePod(Pod newRcManagePod) {
		Pod oldRcManagePod = rcManagePod;
		rcManagePod = newRcManagePod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.REPLICATION_CONTROLLER__RC_MANAGE_POD, oldRcManagePod, rcManagePod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenshiftPackage.REPLICATION_CONTROLLER__REPLICAS, oldReplicas, replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenshiftPackage.REPLICATION_CONTROLLER__RC_MANAGE_POD:
				if (resolve) return getRcManagePod();
				return basicGetRcManagePod();
			case OpenshiftPackage.REPLICATION_CONTROLLER__REPLICAS:
				return getReplicas();
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
			case OpenshiftPackage.REPLICATION_CONTROLLER__RC_MANAGE_POD:
				setRcManagePod((Pod)newValue);
				return;
			case OpenshiftPackage.REPLICATION_CONTROLLER__REPLICAS:
				setReplicas((Integer)newValue);
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
			case OpenshiftPackage.REPLICATION_CONTROLLER__RC_MANAGE_POD:
				setRcManagePod((Pod)null);
				return;
			case OpenshiftPackage.REPLICATION_CONTROLLER__REPLICAS:
				setReplicas(REPLICAS_EDEFAULT);
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
			case OpenshiftPackage.REPLICATION_CONTROLLER__RC_MANAGE_POD:
				return rcManagePod != null;
			case OpenshiftPackage.REPLICATION_CONTROLLER__REPLICAS:
				return replicas != REPLICAS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (replicas: ");
		result.append(replicas);
		result.append(')');
		return result.toString();
	}

} //ReplicationControllerImpl
