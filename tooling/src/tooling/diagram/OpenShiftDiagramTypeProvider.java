package tooling.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

public class OpenShiftDiagramTypeProvider extends AbstractDiagramTypeProvider {

	public OpenShiftDiagramTypeProvider() {
		super();
		setFeatureProvider(new ToolingFeatureProvider(this));
	}
}
