package it.polimi.selfletclipse.wizards;

import java.lang.reflect.InvocationTargetException;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.SelfLetProjectManager;
import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.exceptions.NotFoundException;
import it.polimi.selfletclipse.exceptions.WriteErrorException;
import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.util.WorkspaceWriter;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalController;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalModel;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalView;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectController;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectModel;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectView;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import selfletbehavior.diagram.part.Messages;
import selfletbehavior.diagram.part.SelfletBehaviorDiagramEditorPlugin;
import selfletbehavior.diagram.part.SelfletBehaviorDiagramEditorUtil;

/**
 * @author Nicola
 */
public class NewGoalWizard extends Wizard implements INewWizard {

    private static final Logger LOG = Logger.getLogger(NewGoalWizard.class);

    private InsertGoalModel serviceModel;
    private InsertGoalController serviceController;
    private InsertGoalView serviceView;

    private SelectProjectModel selectProjectModel;
    private SelectProjectController selectProjectController;
    private SelectProjectView selectProjectView;
    
    protected Resource diagram;
    
    public NewGoalWizard() {

	// Init the plugin before all the operations
	SelfLetPlugin.Init();

	selectProjectModel = new SelectProjectModel();
	selectProjectController = new SelectProjectController(
		selectProjectModel);
	selectProjectView = new SelectProjectView(selectProjectController);
	selectProjectModel.addObserver(selectProjectView);

	serviceModel = new InsertGoalModel(InsertGoalModel.MAIN_GOAL);
	serviceController = new InsertGoalController(serviceModel);
	serviceView = new InsertGoalView(serviceController);
	serviceModel.addObserver(serviceView);
    }

    @Override
    public void addPages() {
	addPage(selectProjectView);
	addPage(serviceView);
    }

    @Override
    public boolean performFinish() {

	WorkspaceManager.refreshResourcesTree();

	Goal service = serviceModel.getGoal();
	String projectName = selectProjectModel.getProjectName();
	IFile file = null;
	try {
	    file = WorkspaceWriter.writeGoalFile(service, projectName);
	} catch (WriteErrorException e1) {
	    // TODO
	}

	service.setGoalResource(file);
	try {
	    SelfLetProjectManager.getProject(projectName).addGoal(service);
	} catch (NotFoundException e1) {
	    // TODO
	}

	// update the selflet configuration file
	try {
	    WorkspaceWriter.writeSelfletConfigurationFile(projectName);
	} catch (NotFoundException e) {
	    LOG.debug("The project " + projectName + " cannot be found");
	} catch (WriteErrorException e) {
	    LOG.debug("Error while writing the project " + projectName);
	}

	//Get the current project in the workspace using cores function
	IProject workspaceProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	System.out.println("workspaceProject: " + workspaceProject);
	
	
	
	IFolder behaviorsFolder = workspaceProject.getFolder(WorkspaceManager.folderNames[WorkspaceManager.BEHAVIOR]);
	
	IPath path = behaviorsFolder.getFullPath();
	if (path == null) {
		path = new Path(""); //$NON-NLS-1$
	}
	
	//Get the serviceName from insertServiceModel.serviceName
    String serviceName = serviceModel.getGoalName();
    
	String diagramModelFile = serviceName + ".service_diagram";
	final IPath diagramModelFilePath = path.append(diagramModelFile);;
	
	String domainModelFile = serviceName + ".service";
	final IPath domainModelFilePath = path.append(domainModelFile);
	
	IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

		protected void execute(IProgressMonitor monitor)
				throws CoreException, InterruptedException {
			diagram = SelfletBehaviorDiagramEditorUtil.createDiagram(
					URI.createPlatformResourceURI(diagramModelFilePath.toString(), false),
					URI.createPlatformResourceURI(domainModelFilePath.toString(), false), monitor);
			if (diagram != null) {
				try {
					SelfletBehaviorDiagramEditorUtil.openDiagram(diagram);
				} catch (PartInitException e) {
					ErrorDialog
							.openError(
									getContainer().getShell(),
									Messages.SelfletBehaviorCreationWizardOpenEditorError,
									null, e.getStatus());
				}
			}
		}
	};
	try {
		getContainer().run(false, true, op);
	} catch (InterruptedException e) {
		return false;
	} catch (InvocationTargetException e) {
		if (e.getTargetException() instanceof CoreException) {
			ErrorDialog.openError(getContainer().getShell(),
					Messages.SelfletBehaviorCreationWizardCreationError,
					null,
					((CoreException) e.getTargetException()).getStatus());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
		}
		return false;
	}
	return diagram != null;
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }

}
