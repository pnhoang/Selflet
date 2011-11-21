package it.polimi.selfletclipse.wizards;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalController;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalModel;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalView;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalController;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalModel;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalView;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectController;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectModel;
import it.polimi.selfletclipse.wizards.SelectProject.SelectProjectView;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

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

    private InsertGoalModel insertGoalModel;
    private InsertGoalController insertGoalController;
    private InsertGoalView insertGoalView = null;

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

	insertGoalModel = new InsertGoalModel(InsertGoalModel.GENERIC_GOAL);
	insertGoalController = new InsertGoalController(insertGoalModel);
	insertGoalView = new InsertGoalView(insertGoalController);
	insertGoalModel.addObserver(insertGoalView);

	selectGoalModel.addObserver(insertGoalModel);
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
		selectProjectModel, insertGoalModel);
	writer.write();
	return true;
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
    }

}
