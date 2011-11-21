package it.polimi.selfletclipse;

import it.polimi.selfletclipse.views.ViewArcCondition;

import org.eclipse.core.resources.IResource;


/**
 * @author Nicola
 */
public class ViewManager {

    private static ViewManager manager = null;

    private static ViewArcCondition viewArcCondition = null;

    /**
     * Init all the views created by the plugin
     * */
    public static ViewManager getInstance() {
	if (manager == null) {
	    manager = new ViewManager();
	}

	return manager;
    }

    public static ViewArcCondition getArcView() {
	SelfLetPlugin.Init();
	return viewArcCondition;
    }

    public static void setArcLabel(String label) {
	if (viewArcCondition == null)
	    return;
	viewArcCondition.setLabelCondition(label);
    }

    public static void setArcCondition(IResource resource) {
	if (viewArcCondition == null)
	    return;
	viewArcCondition.setLabelCondition(resource);
    }

    public static void setArcView(ViewArcCondition viewArc) {
	viewArcCondition = viewArc;
    }

}
