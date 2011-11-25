package it.polimi.selfletclipse.wizards;

import java.lang.reflect.InvocationTargetException;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalController;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalModel;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalView;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalController;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalModel;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalView;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectController;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectModel;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectView;

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
public class NewBehaviorWizard extends Wizard implements INewWizard {

    private NewBehaviorWizardWriter writer = null;

    private SelectGoalModel selectGoalModel;
    private SelectGoalController selectGoalController;
    private SelectGoalView selectGoalView = null;

    private SelectProjectModel selectProjectModel;
    private SelectProjectController selectProjectController;
    private SelectProjectView selectProjectView = null;

    private InsertGoalModel insertServiceModel;
    private InsertGoalController insertGoalController;
    private InsertGoalView insertGoalView = null;
    
	protected Resource diagram;
    
    public NewBehaviorWizard() {

	SelfLetPlugin.Init();

	
	selectProjectModel = new SelectProjectModel();
	selectProjectController = new SelectProjectController(
		selectProjectModel);
	selectProjectView = new SelectProjectView(selectProjectController);
	selectProjectModel.addObserver(selectProjectView);
	
	selectGoalModel = new SelectGoalModel();
	selectGoalController = new SelectGoalController(selectGoalModel);
	selectGoalView = new SelectGoalView(selectGoalController);
	selectGoalModel.addObserver(selectGoalView);

	insertServiceModel = new InsertGoalModel(InsertGoalModel.GENERIC_GOAL);
	insertGoalController = new InsertGoalController(insertServiceModel);
	insertGoalView = new InsertGoalView(insertGoalController);
	insertServiceModel.addObserver(insertGoalView);

	selectGoalModel.addObserver(insertServiceModel);
    }

    @Override
    public void addPages() {
	// Add the pages to the wizard
	addPage(selectProjectView);
	addPage(selectGoalView);
	addPage(insertGoalView);
    }

    public boolean performFinish() {
	writer = new NewBehaviorWizardWriter(selectGoalModel,
		selectProjectModel, insertServiceModel);
	writer.write();
	
	/*
	//Get the project name from selfletModel.projectName
	String projectName = selectProjectModel.getProjectName();
	
	//Get the current project in the workspace using cores function
	IProject workspaceProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	System.out.println("workspaceProject: " + workspaceProject);
	
	
	
	IFolder behaviorsFolder = workspaceProject.getFolder(WorkspaceManager.folderNames[WorkspaceManager.BEHAVIOR]);
	
	IPath path = behaviorsFolder.getFullPath();
	if (path == null) {
		path = new Path(""); //$NON-NLS-1$
	}
	
	//Get the serviceName from insertServiceModel.serviceName
    String serviceName = insertServiceModel.getGoalName();
    
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
	*/
	
	return true;
	
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }

}
