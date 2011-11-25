package it.polimi.selfletclipse.wizards;

import java.lang.reflect.InvocationTargetException;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalController;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalModel;
import it.polimi.selfletclipse.wizards.InsertGoal.InsertGoalView;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardController;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardModel;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardView;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
public class NewSelfletWizard extends Wizard implements INewWizard {
    
    private static final Logger LOG = Logger.getLogger(NewSelfletWizard.class);
    
    private SelfletWizardController selfletController;
    private SelfletWizardView selfletView;
    private SelfletWizardModel selfletModel;
    
    private InsertGoalController insertGoalController;
    private InsertGoalView insertGoalView;
    private InsertGoalModel insertServiceModel;
    
	protected Resource diagram;
    
    
    public NewSelfletWizard() {
        // Initialize the plugin system
        SelfLetPlugin.Init();
        
        LOG.info("Starting a new Selflet Wizard");
        
        // instantiate MVC classes
        insertServiceModel = new InsertGoalModel(InsertGoalModel.MAIN_GOAL);
        insertGoalController = new InsertGoalController(insertServiceModel);
        insertGoalView = new InsertGoalView(insertGoalController);
        insertServiceModel.addObserver(insertGoalView);
        
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
                                                                   selfletModel, insertServiceModel);
        writer.write();
        
        
        //Get the project name from selfletModel.projectName
		String projectName = selfletModel.getProjectName();
		
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
		
    }
    
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        // TODO Auto-generated method stub
    }
    
}
