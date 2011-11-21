package it.polimi.selfletclipse.wizards;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalController;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalModel;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalView;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardController;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardModel;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardView;

import org.apache.log4j.Logger;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author Nicola
 */
public class NewSelfletWizard extends Wizard implements INewWizard {
    
    private static final Logger LOG = Logger.getLogger(NewSelfletWizard.class);
    
    private SelfletWizardController selfletController;
    private SelfletWizardView selfletView;
    private SelfletWizardModel selfletModel;
    
    private InsertGoalController insertGoalController;
    private InsertGoalView insertGoalView;
    private InsertGoalModel insertGoalModel;
    
    public NewSelfletWizard() {
        // Initialize the plugin system
        SelfLetPlugin.Init();
        
        LOG.info("Starting a new Selflet Wizard");
        
        // instantiate MVC classes
        insertGoalModel = new InsertGoalModel(InsertGoalModel.MAIN_GOAL);
        insertGoalController = new InsertGoalController(insertGoalModel);
        insertGoalView = new InsertGoalView(insertGoalController);
        insertGoalModel.addObserver(insertGoalView);
        
        selfletModel = new SelfletWizardModel();
        selfletController = new SelfletWizardController(selfletModel);
        selfletView = new SelfletWizardView(selfletController);
        
        selfletModel.addObserver(selfletView);
        selfletModel.addObserver(insertGoalView);
    }
    
    public void addPages() {
        addPage(selfletView);
        
        // the page is dynamically added
        addPage(insertGoalView);
    }
    
    public InsertGoalView getInsertGoalView() {
        return insertGoalView;
    }
    
    /*
     * This method is called by Eclipse when the wizard is finished
     */
    public boolean performFinish() {
        
        NewSelfletWizardWriter writer = new NewSelfletWizardWriter(
                                                                   selfletModel, insertGoalModel);
        writer.write();
        return true;
    }
    
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        // TODO Auto-generated method stub
    }
    
}
