package it.polimi.selfletclipse.markers;

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
import org.eclipse.core.resources.IResource;
import org.omg.uml.behavioralelements.commonbehavior.Action;
import org.omg.uml.behavioralelements.statemachines.State;
import org.omg.uml.foundation.datatypes.ActionExpression;

public class GoalsInFile {

	private static final Logger LOG = Logger.getLogger(GoalsInFile.class);

	private String fileName = null;

	private java.util.Vector<String> goals = null;

	private IResource resource;

	private IFile file;

	public GoalsInFile(IResource resource) {
		if (resource != null) {
			this.resource = resource;
			fileName = resource.getName();
			goals = new java.util.Vector<String>();
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
			Object object = (Object) nodesItr.next();

			/* If it is not a state skip */
			if (!Model.getFacade().isASimpleState((object)))
				continue;

			State s = (State) object;

			Action activity = s.getDoActivity();
			if (activity == null)
				continue;

			ActionExpression script = activity.getScript();
			if (script == null)
				continue;

			String body = script.getBody();

			/* Check if the file refers to a file */
			if (body.endsWith(".java")) {

				/* Copy the body string */
				String goal = new String(body);
				/* Eliminates the need keyword */
				if (goal.startsWith("need"))
					goal = goal.substring(4);
				/* Eliminates the .java suffix */
				goal = goal.substring(0, goal.length() - ".java".length());
				/* finally add the goal name */
				goals.add(goal);
			}
		}
	}

	public String getFileName() {
		return new String(fileName);
	}

	public String getFileNameWithoutExtension() {
		if (fileName.endsWith(".zargo")) {
			return fileName.substring(0, fileName.length() - ".zargo".length());

		}
		return fileName;
	}

	public IFile getFile() {
		return file;
	}

	public String getFilePath() {
		return new String(resource.getLocationURI().getPath());
	}

	public java.util.Vector<String> getGoals() {
		return new java.util.Vector<String>(goals);
	}

	public String toString() {
		String s = new String("Filename: " + fileName + "\n");
		s = s.concat("Goals in file: " + goals.size() + "\n");

		for (int i = 0; i < goals.size(); i++) {
			s = s.concat(goals.get(i) + " \n");
		}

		return s;
	}

}
