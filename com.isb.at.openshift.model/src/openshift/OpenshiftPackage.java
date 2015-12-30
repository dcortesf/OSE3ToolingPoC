/**
 */
package openshift;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see openshift.OpenshiftFactory
 * @model kind="package"
 * @generated
 */
public interface OpenshiftPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openshift";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/openshift";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openshift";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenshiftPackage eINSTANCE = openshift.impl.OpenshiftPackageImpl.init();

	/**
	 * The meta object id for the '{@link openshift.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.impl.TemplateImpl
	 * @see openshift.impl.OpenshiftPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Template Has Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__TEMPLATE_HAS_SERVICES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openshift.impl.PodImpl <em>Pod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.impl.PodImpl
	 * @see openshift.impl.OpenshiftPackageImpl#getPod()
	 * @generated
	 */
	int POD = 1;

	/**
	 * The feature id for the '<em><b>Pod Has Products</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD__POD_HAS_PRODUCTS = 0;

	/**
	 * The number of structural features of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openshift.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.impl.ServiceImpl
	 * @see openshift.impl.OpenshiftPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Service Manage Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_MANAGE_POD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openshift.Product <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.Product
	 * @see openshift.impl.OpenshiftPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Producto Belongs Image Stream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTO_BELONGS_IMAGE_STREAM = 0;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openshift.impl.ImageStreamImpl <em>Image Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.impl.ImageStreamImpl
	 * @see openshift.impl.OpenshiftPackageImpl#getImageStream()
	 * @generated
	 */
	int IMAGE_STREAM = 4;

	/**
	 * The number of structural features of the '<em>Image Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STREAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Image Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openshift.impl.ReplicationControllerImpl <em>Replication Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.impl.ReplicationControllerImpl
	 * @see openshift.impl.OpenshiftPackageImpl#getReplicationController()
	 * @generated
	 */
	int REPLICATION_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Rc Manage Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_CONTROLLER__RC_MANAGE_POD = 0;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_CONTROLLER__REPLICAS = 1;

	/**
	 * The number of structural features of the '<em>Replication Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Replication Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link openshift.impl.DeploymentConfigImpl <em>Deployment Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see openshift.impl.DeploymentConfigImpl
	 * @see openshift.impl.OpenshiftPackageImpl#getDeploymentConfig()
	 * @generated
	 */
	int DEPLOYMENT_CONFIG = 6;

	/**
	 * The feature id for the '<em><b>Dc Manage Pod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIG__DC_MANAGE_POD = 0;

	/**
	 * The number of structural features of the '<em>Deployment Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployment Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_CONFIG_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link openshift.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see openshift.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the reference list '{@link openshift.Template#getTemplateHasServices <em>Template Has Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Template Has Services</em>'.
	 * @see openshift.Template#getTemplateHasServices()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_TemplateHasServices();

	/**
	 * Returns the meta object for the attribute '{@link openshift.Template#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openshift.Template#getName()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Name();

	/**
	 * Returns the meta object for class '{@link openshift.Pod <em>Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pod</em>'.
	 * @see openshift.Pod
	 * @generated
	 */
	EClass getPod();

	/**
	 * Returns the meta object for the reference list '{@link openshift.Pod#getPodHasProducts <em>Pod Has Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pod Has Products</em>'.
	 * @see openshift.Pod#getPodHasProducts()
	 * @see #getPod()
	 * @generated
	 */
	EReference getPod_PodHasProducts();

	/**
	 * Returns the meta object for class '{@link openshift.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see openshift.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link openshift.Service#getServiceManagePod <em>Service Manage Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Manage Pod</em>'.
	 * @see openshift.Service#getServiceManagePod()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ServiceManagePod();

	/**
	 * Returns the meta object for the attribute '{@link openshift.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see openshift.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for class '{@link openshift.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see openshift.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the reference '{@link openshift.Product#getProductoBelongsImageStream <em>Producto Belongs Image Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Producto Belongs Image Stream</em>'.
	 * @see openshift.Product#getProductoBelongsImageStream()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ProductoBelongsImageStream();

	/**
	 * Returns the meta object for class '{@link openshift.ImageStream <em>Image Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Stream</em>'.
	 * @see openshift.ImageStream
	 * @generated
	 */
	EClass getImageStream();

	/**
	 * Returns the meta object for class '{@link openshift.ReplicationController <em>Replication Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replication Controller</em>'.
	 * @see openshift.ReplicationController
	 * @generated
	 */
	EClass getReplicationController();

	/**
	 * Returns the meta object for the reference '{@link openshift.ReplicationController#getRcManagePod <em>Rc Manage Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rc Manage Pod</em>'.
	 * @see openshift.ReplicationController#getRcManagePod()
	 * @see #getReplicationController()
	 * @generated
	 */
	EReference getReplicationController_RcManagePod();

	/**
	 * Returns the meta object for the attribute '{@link openshift.ReplicationController#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see openshift.ReplicationController#getReplicas()
	 * @see #getReplicationController()
	 * @generated
	 */
	EAttribute getReplicationController_Replicas();

	/**
	 * Returns the meta object for class '{@link openshift.DeploymentConfig <em>Deployment Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Config</em>'.
	 * @see openshift.DeploymentConfig
	 * @generated
	 */
	EClass getDeploymentConfig();

	/**
	 * Returns the meta object for the reference '{@link openshift.DeploymentConfig#getDcManagePod <em>Dc Manage Pod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dc Manage Pod</em>'.
	 * @see openshift.DeploymentConfig#getDcManagePod()
	 * @see #getDeploymentConfig()
	 * @generated
	 */
	EReference getDeploymentConfig_DcManagePod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenshiftFactory getOpenshiftFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link openshift.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.impl.TemplateImpl
		 * @see openshift.impl.OpenshiftPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Template Has Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__TEMPLATE_HAS_SERVICES = eINSTANCE.getTemplate_TemplateHasServices();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

		/**
		 * The meta object literal for the '{@link openshift.impl.PodImpl <em>Pod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.impl.PodImpl
		 * @see openshift.impl.OpenshiftPackageImpl#getPod()
		 * @generated
		 */
		EClass POD = eINSTANCE.getPod();

		/**
		 * The meta object literal for the '<em><b>Pod Has Products</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POD__POD_HAS_PRODUCTS = eINSTANCE.getPod_PodHasProducts();

		/**
		 * The meta object literal for the '{@link openshift.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.impl.ServiceImpl
		 * @see openshift.impl.OpenshiftPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Manage Pod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SERVICE_MANAGE_POD = eINSTANCE.getService_ServiceManagePod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '{@link openshift.Product <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.Product
		 * @see openshift.impl.OpenshiftPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Producto Belongs Image Stream</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PRODUCTO_BELONGS_IMAGE_STREAM = eINSTANCE.getProduct_ProductoBelongsImageStream();

		/**
		 * The meta object literal for the '{@link openshift.impl.ImageStreamImpl <em>Image Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.impl.ImageStreamImpl
		 * @see openshift.impl.OpenshiftPackageImpl#getImageStream()
		 * @generated
		 */
		EClass IMAGE_STREAM = eINSTANCE.getImageStream();

		/**
		 * The meta object literal for the '{@link openshift.impl.ReplicationControllerImpl <em>Replication Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.impl.ReplicationControllerImpl
		 * @see openshift.impl.OpenshiftPackageImpl#getReplicationController()
		 * @generated
		 */
		EClass REPLICATION_CONTROLLER = eINSTANCE.getReplicationController();

		/**
		 * The meta object literal for the '<em><b>Rc Manage Pod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_CONTROLLER__RC_MANAGE_POD = eINSTANCE.getReplicationController_RcManagePod();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLICATION_CONTROLLER__REPLICAS = eINSTANCE.getReplicationController_Replicas();

		/**
		 * The meta object literal for the '{@link openshift.impl.DeploymentConfigImpl <em>Deployment Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see openshift.impl.DeploymentConfigImpl
		 * @see openshift.impl.OpenshiftPackageImpl#getDeploymentConfig()
		 * @generated
		 */
		EClass DEPLOYMENT_CONFIG = eINSTANCE.getDeploymentConfig();

		/**
		 * The meta object literal for the '<em><b>Dc Manage Pod</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_CONFIG__DC_MANAGE_POD = eINSTANCE.getDeploymentConfig_DcManagePod();

	}

} //OpenshiftPackage
