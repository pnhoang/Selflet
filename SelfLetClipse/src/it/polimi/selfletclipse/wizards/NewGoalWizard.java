package it.polimi.selfletclipse.wizards;

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
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

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

	return true;
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }

}
