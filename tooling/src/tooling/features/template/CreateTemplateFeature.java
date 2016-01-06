package tooling.features.template;

import java.util.List;

import openshift.OpenshiftFactory;
import openshift.Template;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class CreateTemplateFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateTemplateFeature(IFeatureProvider fp) {
		super(fp, "Template", "Creates a new Template");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		
		Template tSelect = null;
		String newClassName = "Template";
		
		if(context.getTargetContainer().getLink()!=null){

			List<EObject> containerObjects = context.getTargetContainer().getLink().getBusinessObjects();
			
			if(containerObjects!=null){
		
				tSelect=(Template)containerObjects.get(0);		 
				if(tSelect.getName()!=null) newClassName = tSelect.getName();
			}
		}
		 
		 		 
	     if (newClassName == null || newClassName.trim().length() == 0) {
	            return EMPTY;
	      }
	 
	        // create EClass
	        Template newClass = OpenshiftFactory.eINSTANCE.createTemplate();
	        // Add model element to resource.
	        // We add the model element to the resource of the diagram for
	        // simplicity's sake. Normally, a customer would use its own
	        // model persistence layer for storing the business model separately.
	        getDiagram().eResource().getContents().add(newClass);
	        newClass.setName(newClassName);
	 
	        // do the add
	        addGraphicalRepresentation(context, newClass);
	        
	     // activate direct editing after object creation
	       getFeatureProvider().getDirectEditingInfo().setActive(true);
	 
	        // return newly created business object(s)
	        return new Object[] { newClass };
	    
	}
}
