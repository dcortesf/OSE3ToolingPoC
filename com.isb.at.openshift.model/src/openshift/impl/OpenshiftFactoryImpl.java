/**
 */
package openshift.impl;

import openshift.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenshiftFactoryImpl extends EFactoryImpl implements OpenshiftFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenshiftFactory init() {
		try {
			OpenshiftFactory theOpenshiftFactory = (OpenshiftFactory)EPackage.Registry.INSTANCE.getEFactory(OpenshiftPackage.eNS_URI);
			if (theOpenshiftFactory != null) {
				return theOpenshiftFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenshiftFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenshiftFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenshiftPackage.TEMPLATE: return createTemplate();
			case OpenshiftPackage.POD: return createPod();
			case OpenshiftPackage.SERVICE: return createService();
			case OpenshiftPackage.IMAGE_STREAM: return createImageStream();
			case OpenshiftPackage.REPLICATION_CONTROLLER: return createReplicationController();
			case OpenshiftPackage.DEPLOYMENT_CONFIG: return createDeploymentConfig();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pod createPod() {
		PodImpl pod = new PodImpl();
		return pod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageStream createImageStream() {
		ImageStreamImpl imageStream = new ImageStreamImpl();
		return imageStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicationController createReplicationController() {
		ReplicationControllerImpl replicationController = new ReplicationControllerImpl();
		return replicationController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentConfig createDeploymentConfig() {
		DeploymentConfigImpl deploymentConfig = new DeploymentConfigImpl();
		return deploymentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenshiftPackage getOpenshiftPackage() {
		return (OpenshiftPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenshiftPackage getPackage() {
		return OpenshiftPackage.eINSTANCE;
	}

} //OpenshiftFactoryImpl
