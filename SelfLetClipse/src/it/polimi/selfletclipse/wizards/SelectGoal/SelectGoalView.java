package it.polimi.selfletclipse.wizards.SelectGoal;

import it.polimi.selfletclipse.ImagesManager;

import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * @author Nicola
 */
public class SelectGoalView extends WizardPage implements Observer {
    
    private Composite topLevel;
    private SelectGoalController controller;
    
    private Text textGoalName;
    
    private Button buttonExistingGoal;
    private Button buttonNewGoal;
    
    private Button buttonComplexBehavior;
    private Button buttonElementaryBehavior;
    
    private Tree tree;
    private boolean treeAlreadyContainsValues = false;
    
    private final static String pageName = "Select service";
    
    public SelectGoalView(SelectGoalController selectGoalController) {
        super(pageName);
        this.controller = selectGoalController;
    }
    
    public void createControl(Composite parent) {
        createMainLayout(parent);
        createUpperPart();
        createLowerPart();
        setPageComplete(false);
        controller.refreshObservers();
    }
    
    private void createLowerPart() {
        /*
         * Enable/Disable the tree menu depending on the state of the radio
         * button
         */
        GridData gd3 = new GridData();
        gd3.horizontalAlignment = GridData.FILL;
        gd3.verticalAlignment = GridData.FILL;
        gd3.horizontalSpan = 2;
        gd3.grabExcessHorizontalSpace = true;
        gd3.grabExcessVerticalSpace = true;
        gd3.verticalIndent = 30;
        
        Group group = new Group(topLevel, SWT.None);
        group.setLayoutData(gd3);
        group.setLayout(new FillLayout());
        
        this.buttonComplexBehavior = new Button(group, SWT.RADIO);
        buttonComplexBehavior.setText("Complex behavior");
        buttonComplexBehavior.setSelection(true);
        
        buttonComplexBehavior.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                controller.setComplexBehavior();
            }
        });
        
        this.buttonElementaryBehavior = new Button(group, SWT.RADIO);
        buttonElementaryBehavior.setText("Elementary behavior");
        buttonElementaryBehavior.addListener(SWT.Selection, new Listener() {
            
            public void handleEvent(Event event) {
                controller.setElementaryBehavior();
            }
        });
        
        // Update the value for the complex/elementary mode
        buttonNewGoal.addSelectionListener(new SelectionAdapter() {
            
            public void widgetSelected(SelectionEvent e) {
                if (buttonNewGoal.getSelection()) {
                    controller.setNewGoal(true);
                    controller.setGoalName(textGoalName.getText());
                } else {
                    controller.setNewGoal(false);
                }
                
            }
        });
        
    }
    
    private void createUpperPart() {
        /* Radio button existing service */
        this.buttonExistingGoal = new Button(topLevel, SWT.RADIO);
        buttonExistingGoal.setSelection(true);
        buttonExistingGoal
		.setText("Select from existing service in the workspace:");
        
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.FILL;
        gd1.verticalAlignment = GridData.FILL;
        gd1.horizontalSpan = 2;
        gd1.grabExcessHorizontalSpace = true;
        gd1.grabExcessVerticalSpace = true;
        
        tree = new Tree(topLevel, SWT.VIRTUAL | SWT.BORDER);
        tree.setSize(200, 200);
        tree.setLayoutData(gd1);
        
        tree.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                
                if (!(event.item instanceof TreeItem))
                    return;
                
                TreeItem item = (TreeItem) event.item;
                Object data = item.getData();
                
                if ((data instanceof String) && ((String) data).equals("service")) {
                    controller.setSelectedGoal(item.getText(), item
                                               .getParentItem().getText());
                } else {
                    controller.setSelectedGoal("", "");
                }
            }
        });
        
        buttonExistingGoal.addSelectionListener(new SelectionAdapter() {
            
            public void widgetSelected(SelectionEvent e) {
                if (buttonExistingGoal.getSelection()) {
                    tree.setEnabled(true);
                    textGoalName.setEnabled(false);
                    controller.setNewGoal(false);
                } else {
                    tree.setEnabled(false);
                    textGoalName.setEnabled(true);
                    controller.setNewGoal(true);
                }
            }
        });
        
        /* Radio button new service */
        this.buttonNewGoal = new Button(topLevel, SWT.RADIO);
        buttonNewGoal.setText("New Goal");
        buttonNewGoal.setSelection(false);
        
        GridData gd2 = new GridData();
        gd2.horizontalAlignment = GridData.FILL;
        gd2.grabExcessHorizontalSpace = true;
        
        /* Text box for a new service */
        this.textGoalName = new Text(topLevel, SWT.BORDER);
        textGoalName.setLayoutData(gd2);
        textGoalName.setEnabled(false);
        
        textGoalName.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event event) {
                controller.setGoalName(textGoalName.getText());
            }
        });
    }
    
    private void createMainLayout(Composite parent) {
        topLevel = new Composite(parent, SWT.NONE);
        setControl(topLevel);
        
        setTitle("Create a Behavior");
        setDescription("Select the service this behavior implements");
        
        GridLayout gl = new GridLayout();
        gl.numColumns = 2;
        topLevel.setLayout(gl);
        topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
                                            | GridData.HORIZONTAL_ALIGN_FILL));
        topLevel.setFont(parent.getFont());
    }
    
    public void update(Observable o, Object arg) {
        if (arg instanceof SelectGoalModel) {
            SelectGoalModel model = (SelectGoalModel) arg;
            
            Map<String, ArrayList<String>> projectGoals = model
		    .getAllProjectGoals();
            
            updateTree(projectGoals);
            
            if (model.isGoalComplete())
                setPageComplete(true);
            else
                setPageComplete(false);
            
            if (model.isNewGoal())
                tree.setEnabled(false);
            else
                tree.setEnabled(true);
            
        }
    }
    
    private void updateTree(Map<String, ArrayList<String>> projectGoals) {
        if (treeAlreadyContainsValues)
            return;
        
        treeAlreadyContainsValues = true;
        
        tree.removeAll();
        
        Set<String> keys = projectGoals.keySet();
        
        for (String projectName : keys) {
            TreeItem item = new TreeItem(tree, SWT.None);
            item.setText(projectName);
            item.setImage(ImagesManager.PROJECT);
            
            ArrayList<String> services = projectGoals.get(projectName);
            
            for (String service : services) {
                TreeItem serviceItem = new TreeItem(item, SWT.None);
                serviceItem.setText(service);
                serviceItem.setData("service");
                serviceItem.setImage(ImagesManager.STATE);
            }
        }
    }
}
