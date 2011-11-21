package it.polimi.selfletclipse.markers;

import it.polimi.selfletclipse.SelfLetPlugin;

import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.argouml.argoeclipse.internal.core.model.ArgoProject;
import org.argouml.kernel.Project;
import org.argouml.kernel.ProjectManager;
import org.argouml.model.Model;
import org.argouml.uml.diagram.ArgoDiagram;
import org.argouml.uml.diagram.state.ui.UMLStateDiagram;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.omg.uml.behavioralelements.statemachines.Guard;
import org.omg.uml.behavioralelements.statemachines.Transition;
import org.omg.uml.foundation.datatypes.BooleanExpression;


public class ConditionsInFile {

    private static final Logger LOG = Logger.getLogger(ConditionsInFile.class);

    private IResource resource;
    private IFile file;

    private IWorkspaceRoot root;

    public ConditionsInFile(IResource resource) {
	if (resource != null) {
	   
		this.resource = resource;
	    String fileName = resource.getName();
	    root = SelfLetPlugin.root;
	    loadFile();

	}
    }

    private void loadFile() {
	file = resource.getProject().getFile("behaviors/" + resource.getName());
	if (file == null) {
	    LOG.error("Error in opening file: " + file.getName());
	    return;
	}
	/* Load project with argoeclipse */
	ArgoProject.loadProject(file.getLocationURI().getPath());

	Project p = ProjectManager.getManager().getCurrentProject();

	List<ArgoDiagram> diagramList = p.getDiagramList();
	Iterator<ArgoDiagram> diagramItr = diagramList.iterator();

	while (diagramItr.hasNext()) {
	    ArgoDiagram diag = diagramItr.next();
	    checkDiagram(diag);
	}

    }

    private void checkDiagram(ArgoDiagram diag) {

	/* Skip if it is not a UMLStateDiagram */
	if (!(diag instanceof UMLStateDiagram))
	    return;

	UMLStateDiagram stateDiag = (UMLStateDiagram) diag;
	/* Get all nodes in diagram */
	Iterator nodesItr = stateDiag.getGraphModel().getNodes().iterator();

	while (nodesItr.hasNext()) {
	    Object o = (Object) nodesItr.next();

	    /* If it is not a state skip */
	    if (!Model.getFacade().isATransition((o)))
		continue;
	    Transition t = (Transition) o;
	    Guard g = t.getGuard();

	    if (g != null) {
		BooleanExpression exp = g.getExpression();
		if (exp != null) {
		    checkFile(exp.getBody());
		    return;
		}
	    }

	}
    }

    private void checkFile(String conditionFile) {
	Project p = ProjectManager.getManager().getCurrentProject();
	/* Extract the eclipse project name from the URI */
	URI uri = p.getURI();
	String name = p.getName();
	String path = uri.getPath();

	String str = path.substring(0, path.indexOf(name));
	str = str.substring(0, str.indexOf("/behaviors/"));
	str = str.substring(str.lastIndexOf("/"), str.length());

	IProject prj = root.getProject(str);
	if (prj == null) {
	    return;
	}
	if (!prj.isOpen()) {
	    return;
	}
	IFolder folder = prj.getFolder("conditions");

	if (folder == null) {
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
	    return;
	}

	for (int i = 0; i < members.length; i++) {
	    IResource resource = members[i];
	    if (resource != null)
		if (!resource.getName().equals(conditionFile)) {
		    // TODO aggiungere a vettore..
		}

	}

    }

}
