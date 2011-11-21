package it.polimi.selfletclipse;

import java.net.URI;

import org.apache.log4j.Logger;
import org.argouml.kernel.Project;
import org.argouml.kernel.ProjectManager;
import org.argouml.ui.targetmanager.TargetEvent;
import org.argouml.ui.targetmanager.TargetListener;
import org.argouml.ui.targetmanager.TargetManager;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.omg.uml.behavioralelements.statemachines.Guard;
import org.omg.uml.behavioralelements.statemachines.Transition;
import org.omg.uml.foundation.datatypes.BooleanExpression;

/**
 * @author Nicola
 */
public class TargetListenerManager {

    private static final Logger LOG = Logger
	    .getLogger(TargetListenerManager.class);

    private static TargetListenerManager manager = null;

    public static TargetListenerManager getInstance() {
	if (manager == null) {
	    LOG.debug("Target manager initialized");
	    manager = new TargetListenerManager();
	    manager.initListener();

	}

	return manager;

    }

    /* Add the listener to the ArgoUml target manager */
    private void initListener() {

	TargetManager.getInstance().addTargetListener(new TargetListener() {
	    public void targetAdded(TargetEvent e) {
	    }

	    public void targetRemoved(TargetEvent e) {
	    }

	    /*
	     * Every time a target is set (clicked by the user), this method is
	     * invoked
	     */
	    public void targetSet(TargetEvent e) {
		Object o = e.getNewTarget();

		/* Interested only in transitions targets */
		if (o instanceof Transition) {
		    Transition t = (Transition) o;
		    if (t != null) {
			Guard g = t.getGuard();
			/*
			 * The expression contains the name for the xml file for
			 * conditions
			 */
			if (g != null) {
			    BooleanExpression exp = g.getExpression();
			    if (exp != null) {
				checkTarget(exp.getBody());
				return;
			    }
			}
		    }

		    ViewManager.setArcLabel("Empty condition");
		}
	    }
	});
    }

    /**
     * This method is invoked by the target manager each time a condition arc is
     * selected. The method checks if there exist the correspondent condition
     * file.
     * 
     * @param conditionFile
     *            the name of the file containing the resource
     */
    public void checkTarget(String conditionFile) {
	Project p = ProjectManager.getManager().getCurrentProject();

	String err = new String("Condition file not found!");

	/* Extract the eclipse project name from the URI */
	URI uri = p.getURI();
	String name = p.getName();
	String path = uri.getPath();

	String str = path.substring(0, path.indexOf(name));
	str = str.substring(0, str.indexOf("/behaviors/"));
	str = str.substring(str.lastIndexOf("/"), str.length());

	IProject prj = SelfLetPlugin.root.getProject(str);

	if (prj == null) {
	    ViewManager.setArcLabel(err);
	    return;
	}

	if (!prj.isOpen()) {
	    ViewManager.setArcLabel(err);
	    return;
	}

	IFolder folder = prj.getFolder("conditions");

	if (folder == null) {
	    ViewManager.setArcLabel(err);
	    return;
	}

	IResource[] members = null;
	/* Get the files in the conditions folder */
	try {
	    members = folder.members();
	} catch (CoreException e) {
	    e.printStackTrace();
	}

	if (members == null) {
	    ViewManager.setArcLabel(err);
	    return;
	}

	for (int i = 0; i < members.length; i++) {
	    IResource resource = members[i];
	    if (resource != null)
		if (resource.getName().equals(conditionFile)) {
		    ViewManager.setArcCondition(resource);
		    return;
		}
	}

	ViewManager.setArcLabel(err);

    }

}
