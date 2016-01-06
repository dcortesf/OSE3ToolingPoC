package tooling.features.template;

import openshift.Template;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

public class DirectEditTemplateFeature extends AbstractDirectEditingFeature {
	
	public DirectEditTemplateFeature(IFeatureProvider fp){
		super(fp);
	}

	@Override
	public int getEditingType() {
		 // there are several possible editor-types supported:
        // text-field, checkbox, color-chooser, combobox, ...
        return TYPE_TEXT;
	}

	@Override
	public String getInitialValue(IDirectEditingContext context) {
		 // return the current name of the EClass
        PictogramElement pe = context.getPictogramElement();
        Template eClass = (Template) getBusinessObjectForPictogramElement(pe);
        return eClass.getName();
	}
	
	@Override
    public boolean canDirectEdit(IDirectEditingContext context) {
        PictogramElement pe = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pe);
        GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
        // support direct editing, if it is a EClass, and the user clicked
        // directly on the text and not somewhere else in the rectangle
        if (bo instanceof Template && ga instanceof Text) {
            return true;
        }
        // direct editing not supported in all other cases
        return false;
    }
	
	@Override
    public String checkValueValid(String value, IDirectEditingContext context) {
        if (value.length() < 1)
            return "Please enter any text as class name.";
        if (value.contains(" "))
            return "Spaces are not allowed in class names.";
        if (value.contains("\n"))
            return "Line breakes are not allowed in class names.";
 
        // null means, that the value is valid
        return null;
    }
	
	public void setValue(String value, IDirectEditingContext context) {
        // set the new name for the EClass
        PictogramElement pe = context.getPictogramElement();
        Template eClass = (Template) getBusinessObjectForPictogramElement(pe);
        eClass.setName(value);
        System.out.println("[Valor del nombre: ]"+value);
 
        // Explicitly update the shape to display the new value in the diagram
        // Note, that this might not be necessary in future versions of Graphiti
        // (currently in discussion)
 
        // we know, that pe is the Shape of the Text, so its container is the
        // main shape of the EClass
        updatePictogramElement(((Shape) pe).getContainer());
    }
	
	

}
