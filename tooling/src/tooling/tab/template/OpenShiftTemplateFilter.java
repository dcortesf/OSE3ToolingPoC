package tooling.tab.template;

import openshift.Template;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;

public class OpenShiftTemplateFilter extends AbstractPropertySectionFilter{
	
	@Override
	protected boolean accept(PictogramElement pe) {
		EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
	        
		if (eObject instanceof Template) {
	            return true;
	    }
		return false;
	}
	

}
