package tooling.features.template;

import openshift.Template;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class AddTemplateFeature extends AbstractAddShapeFeature implements
		IAddFeature {

	private static final IColorConstant E_CLASS_TEXT_FOREGROUND =
	        IColorConstant.BLACK;
	 
	    private static final IColorConstant E_CLASS_FOREGROUND =
	        new ColorConstant(98, 131, 167);

	    private static final IColorConstant E_CLASS_BACKGROUND =
	        new ColorConstant(187, 218, 247);
	 
	    public AddTemplateFeature(IFeatureProvider fp) {
	        super(fp);
	    }

	@Override
	public boolean canAdd(IAddContext context) {
		
		if(context.getNewObject() instanceof Template){
			if(context.getTargetContainer() instanceof Diagram) return true;
		}
		
		
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Template addedClass = (Template) context.getNewObject();
        Diagram targetDiagram = (Diagram) context.getTargetContainer();
 
        // CONTAINER SHAPE WITH ROUNDED RECTANGLE
        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        ContainerShape containerShape =
             peCreateService.createContainerShape(targetDiagram, true);
 
        // define a default size for the shape
        int width = 100;
        int height = 50; 
        IGaService gaService = Graphiti.getGaService();
        RoundedRectangle roundedRectangle; // need to access it later
 
        {
            // create and set graphics algorithm
            roundedRectangle =
                gaService.createRoundedRectangle(containerShape, 5, 5);
            roundedRectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
            roundedRectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
            roundedRectangle.setLineWidth(2);
            gaService.setLocationAndSize(roundedRectangle,
                context.getX(), context.getY(), width, height);
 
            // if added Class has no resource we add it to the resource 
            // of the diagram
            // in a real scenario the business model would have its own resource
            if (addedClass.eResource() == null) {
                     getDiagram().eResource().getContents().add(addedClass);
            }
            // create link and wire it
            link(containerShape, addedClass);
        }
 
        // SHAPE WITH LINE
        {
            // create shape for line
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set graphics algorithm
            Polyline polyline =
                gaService.createPolyline(shape, new int[] { 0, 20, width, 20 });
            polyline.setForeground(manageColor(E_CLASS_FOREGROUND));
            polyline.setLineWidth(2);
        }
 
        // SHAPE WITH TEXT
        {
            // create shape for text
            Shape shape = peCreateService.createShape(containerShape, false);
 
            // create and set text graphics algorithm
            Text text = gaService.createText(shape, addedClass.getName());
            text.setForeground(manageColor(E_CLASS_TEXT_FOREGROUND));
            text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER ); 
            // vertical alignment has as default value "center"
            text.setFont(gaService.manageDefaultFont(getDiagram(), false, true));
            gaService.setLocationAndSize(text, 0, 0, width, 20);
 
            // create link and wire it
            link(shape, addedClass);
            
            //Soporte para direct-editing
            // provide information to support direct-editing directly 
            // after object creation (must be activated additionally)
            	IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
            // set container shape for direct editing after object creation
            directEditingInfo.setMainPictogramElement(containerShape);
            // set shape and graphics algorithm where the editor for
            // direct editing shall be opened after object creation
            directEditingInfo.setPictogramElement(shape);
            directEditingInfo.setGraphicsAlgorithm(text);
            
            //Fin de soporte para direct-editing
            
        }
        
        
       
        
        
        
        peCreateService.createChopboxAnchor(containerShape);
        
        ///
     // create an additional box relative anchor at middle-right
        final BoxRelativeAnchor boxAnchor = 
             peCreateService.createBoxRelativeAnchor(containerShape);
        
        boxAnchor.setRelativeWidth(1.0);
        boxAnchor.setRelativeHeight(0.38); //use golden section 
        boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);

        // assign a rectangle graphics algorithm for the box relative anchor
        // note, that the rectangle is inside the border of the rectangle shape
        final Rectangle rectangle = gaService.createPlainRectangle(boxAnchor);
        rectangle.setForeground(manageColor(E_CLASS_FOREGROUND));
        rectangle.setBackground(manageColor(E_CLASS_BACKGROUND));
        rectangle.setLineWidth(2);
        gaService.setLocationAndSize(rectangle, -12, -6, 12, 12);
        
        
        
        ///
        layoutPictogramElement(containerShape);
 
        return containerShape;
    }
	
}
