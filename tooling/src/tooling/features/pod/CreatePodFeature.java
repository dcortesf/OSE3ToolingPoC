package tooling.features.pod;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import openshift.OpenshiftFactory;
import openshift.Pod;

public class CreatePodFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreatePodFeature(IFeatureProvider fp) {
		super(fp, "Pod", "Creates a new Pod");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		 String newClassName = "Pod";
	     if (newClassName == null || newClassName.trim().length() == 0) {
	            return EMPTY;
	      }
	 
	        // create EClass
	        Pod newClass = OpenshiftFactory.eINSTANCE.createPod();
	        // Add model element to resource.
	        // We add the model element to the resource of the diagram for
	        // simplicity's sake. Normally, a customer would use its own
	        // model persistence layer for storing the business model separately.
	        getDiagram().eResource().getContents().add(newClass);
	        //newClass.setName(newClassName);
	 
	        // do the add
	        addGraphicalRepresentation(context, newClass);
	 
	        // return newly created business object(s)
	        return new Object[] { newClass };
	    
	}
}
