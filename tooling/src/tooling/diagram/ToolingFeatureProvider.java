package tooling.diagram;

import openshift.Pod;
import openshift.Service;
import openshift.Template;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import tooling.features.AddEReferenceConnectionFeature;
import tooling.features.CreateEReferenceConnectionFeature;
import tooling.features.pod.AddPodFeature;
import tooling.features.pod.CreatePodFeature;
import tooling.features.pod.LayoutPodFeature;
import tooling.features.service.AddServiceFeature;
import tooling.features.service.CreateServiceFeature;
import tooling.features.service.LayoutServiceFeature;
import tooling.features.template.AddTemplateFeature;
import tooling.features.template.CreateTemplateFeature;
import tooling.features.template.LayoutTemplateFeature;

public class ToolingFeatureProvider extends DefaultFeatureProvider {

	public ToolingFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateTemplateFeature(this), new CreateServiceFeature(this), new CreatePodFeature(this)};
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreateEReferenceConnectionFeature(this)};
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// TODO: check for right domain object instances below
		if (context instanceof IAddConnectionContext /* && context.getNewObject() instanceof <DomainObject> */) {
			return new AddEReferenceConnectionFeature(this);
		} else if (context instanceof IAddContext && context.getNewObject() instanceof Template) {
			/*if (context!=null)
				System.out.println("Lo que añado: "+context.getNewObject().getClass());
			else
				System.out.println("El contexto es nulo");*/
			return new AddTemplateFeature(this);
		}else if (context instanceof IAddContext && context.getNewObject() instanceof Service) {
			return new AddServiceFeature(this);
		}else if (context instanceof IAddContext && context.getNewObject() instanceof Pod) {
			return new AddPodFeature(this);
		}

		return super.getAddFeature(context);
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		// TODO: check for right domain object instances below
		if (context.getPictogramElement() instanceof ContainerShape && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof Template ) {
			return  new LayoutTemplateFeature(this);
		}else if(context.getPictogramElement() instanceof ContainerShape && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof Service ){
			return new LayoutServiceFeature(this);
		}else if(context.getPictogramElement() instanceof ContainerShape && getBusinessObjectForPictogramElement(context.getPictogramElement()) instanceof Pod ){
			return new LayoutPodFeature(this);
		}
		return super.getLayoutFeature(context);
	}
	
	
	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
	    // simply return all create connection features
	    return getCreateConnectionFeatures();
	}
}
