package it.polimi.selfletclipse.wizards;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.SelfLetProjectManager;
import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.exceptions.WriteErrorException;
import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.model.SelfLetProject;
import it.polimi.selfletclipse.util.FileUtils;
import it.polimi.selfletclipse.util.WorkspaceWriter;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalModel;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardModel;

import java.io.InputStream;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

@SuppressWarnings("restriction")
public class NewSelfletWizardWriter {

	private static final Logger LOG = Logger
	.getLogger(NewSelfletWizardWriter.class);

	private SelfLetProject project = null;
	private SelfletWizardModel selfletModel;
	private InsertGoalModel insertGoalModel;

	public NewSelfletWizardWriter(SelfletWizardModel selfletModel,
			InsertGoalModel insertGoalModel) {
		if (selfletModel == null)
			throw new NullPointerException();
		this.selfletModel = selfletModel;
		this.insertGoalModel = insertGoalModel;
	}

	/**
	 * Write the selflet into the workspace.
	 * */
	public void write() {

		IProject projectResource = createEclipseProject();
		instantiateSelfletProject(projectResource);

		createProjectDirectories(projectResource);

		SelfLetProjectManager.loadProject(project);

		if (project.isActiveSelflet()) {
			String mainGoalName = insertGoalModel.getGoalName();
			createDefaultBehavior(mainGoalName);
			createDefaultBehaviorAction(mainGoalName);
			createWaitAction();
			createErrorConditions();
			createGoalFile();
		}

		writeSelfletConfigurationFile();

		// WorkspaceManager.addProject(project);
	}

	private void instantiateSelfletProject(IProject projectResource) {
		project = new SelfLetProject(selfletModel.getProjectName(),
				projectResource);

		project.setActiveSelflet(selfletModel.isActiveSelflet());
		project.setAuthor(selfletModel.getAuthorName());
		project.setMainGoal(insertGoalModel.getGoal());
		project.setREDsAddress(selfletModel.getREDsAddress());
		project.setREDsPort(selfletModel.getREDsPort());
		project.setLimePort(selfletModel.getLimePort());
		project.setDescription(selfletModel.getDescription());
	}

	private void writeSelfletConfigurationFile() {

		WorkspaceManager.refreshResourcesTree();
		SelfLetProjectManager.loadProject(project);

		try {
			WorkspaceWriter.writeSelfletConfigurationFile(project);
		} catch (WriteErrorException e) {
			// TODO
		}
	}

	private void createGoalFile() {
		WorkspaceManager.refreshResourcesTree();

		Goal goal = project.getMainGoal();
		try {
			WorkspaceWriter.writeGoalFile(goal, project.getName());
		} catch (WriteErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private IProject createEclipseProject() {

		WorkspaceManager.refreshResourcesTree();

		IProject projectResource = SelfLetPlugin.root.getProject(selfletModel
				.getProjectName());

		try {

			if (!projectResource.exists()) {
				projectResource.create(new NullProgressMonitor());
				LOG.debug("Created new project: " + projectResource.getName());
			} else {
				// TODO
			}
			projectResource.open(new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return projectResource;

	}

	private void createProjectDirectories(IProject prj) {

		LOG.info("Creating project directories ");

		String[] folderNames = WorkspaceManager.folderNames;

		IFolder[] folders = new IFolder[folderNames.length];

		for (int i = 0; i < folderNames.length; i++) {

			folders[i] = prj.getFolder(folderNames[i]);
			if (!folders[i].exists())
				try {
					folders[i].create(true, true, null);
				} catch (CoreException e) {
					LOG.error("Error in creating directories in project "
							+ prj.getName());
				}
		}

	}

	private void createDefaultBehavior(String mainGoal) {

		//TODO: HOANG
		//CREATE THE BEHAVIOR FILE BASED ON GMF 

		
		/*
		LOG.info("Creating default behavior for " + mainGoal);
		/* Create file in the project 
		IFile file = project.getProjectResource().getFile(
		"behaviors/defaultBehavior.zargo");

		InputStream g = getClass().getResourceAsStream(
		"/it/polimi/selfletclipse/resources/defaultBehavior.zargo");

		FileUtils.createFileFromInputStream(file, g);

		InitUI.initialize();
		/* Open the project in a new editor window 
		IWorkbenchWindow window = Workbench.getInstance()
		.getActiveWorkbenchWindow();

		IPathEditorInput input = new ArgoEditorInput(file);
		IWorkbenchPage activePage = window.getActivePage();

		if (Register.getInstance().isRegistered(Register.EDITOR)) {
			// If the editor is already open
			DiagramEditor ed = (DiagramEditor) Register.getInstance()
			.getRegistered(Register.EDITOR);
			ed.setPartName(input.getName());
			ed.setInput(input);
			// ed.doSave(null);
		} else {
			try {
				activePage.openEditor(input,
						"org.argouml.argoeclipse.internal.ui"
						+ ".editor.DiagramEditor");
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}

		/*
		 * This function modifies the diagram for the default behavior. It
		 * changes the content of the initial behavior state
		 
		changeMainGoal(mainGoal);

		try {
			file.refreshLocal(IResource.DEPTH_ZERO, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}*/

	}

	@SuppressWarnings("unchecked")
	private void changeMainGoal(String mainGoal) {
		
		//TODO: HOANG
		//CREATE THE BEHAVIOR FILE BASED ON GMF
		
		/*
		LOG.debug("Changing the main goal in the default behavior");
		Project p = ProjectManager.getManager().getCurrentProject();
		ModelManagementHelper helper = Model.getModelManagementHelper();

		/* Get all State object in the diagram 
		Collection cont = helper.getAllModelElementsOfKind(p
				.getCurrentNamespace(),
		"org.omg.uml.behavioralelements.statemachines.State");

		Iterator<Object> itr = cont.iterator();

		while (itr.hasNext()) {
			Object object = itr.next();
			if (Model.getFacade().isAState(object)) {
				if (object instanceof State) {
					State ss = (State) object;
					if (ss.getName().contains("initialBehavior")) {

						/* Modify the content 
						Action a = ss.getDoActivity();
						ActionExpression script = a.getScript();
						script.setBody("need" + mainGoal + ".java");
						script.setLanguage("javassist");

						Model.getStateMachinesHelper().setDoActivity(ss, a);
					}
				}
			}
		}

		ProjectBrowser.getInstance().trySave(true);*/

	}

	/* Create the initial action file for the default behavior */
	private void createDefaultBehaviorAction(String mainGoal) {
		LOG.info("Creating action for the default behavior");

		String path = "actions/need" + mainGoal + ".action";
		IFile file = FileUtils.createFileInProject(
				project.getProjectResource(), path);

		String s = new String("{\n"
				+ "	//TODO Automatically generated by SelfLetClipse plugin\n"
				+ "	IActionExecutor ae = $9;\n" + "	String output = null;\n"
				+ "	output = ae.needService(\"" + mainGoal + "\");\n"
				+ "	return output;\n" + "}");

		FileUtils.writeFile(file, s);

	}

	private void createWaitAction() {
		LOG.info("Creating action for the wait state");

		IFile file = FileUtils.createFileInProject(
				project.getProjectResource(), "actions/wait.action");

		String s = "{\n";
		s = s.concat("\ttry {\n");
		s = s.concat("\t\tThread.sleep(2000L);\n");
		s = s.concat("\t}\n");
		s = s.concat("\tcatch (InterruptedException e) {\n");
		s = s.concat("\t}\n");
		s = s.concat("\treturn  \"ok_wait_done\";\n");
		s = s.concat("}\n");

		FileUtils.writeFile(file, s);

	}

	private void createErrorConditions() {
		LOG.info("Creating conditions for the default behavior");

		boolean err = true;
		InputStream g = null;

		/* Create errorCondition.xml in the project */
		IFile file = FileUtils.createFileInProject(
				project.getProjectResource(), "conditions/errorCondition.xml");
		g = getClass().getResourceAsStream(
		"/it/polimi/selfletclipse/resources/errorCondition.xml");
		if (g != null)
			err = FileUtils.createFileFromInputStream(file, g);

		/* Create notErrorCondition.xml in the project */
		file = FileUtils.createFileInProject(project.getProjectResource(),
		"conditions/notErrorCondition.xml");
		if (g != null)
			g = getClass().getResourceAsStream(
					"/it/polimi/selfletclipse/resources/notErrorCondition.xml");
		err = err || FileUtils.createFileFromInputStream(file, g);

		if (err) {
			LOG.error("Error in creating condition file");
			return;
		}

	}

}
