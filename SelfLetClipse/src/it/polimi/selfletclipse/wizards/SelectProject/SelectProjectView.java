package it.polimi.selfletclipse.wizards.SelectProject;

import it.polimi.selfletclipse.ImagesManager;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

/**
 * @author Nicola
 */
public class SelectProjectView extends WizardPage implements Observer {

    private String projectName;
    // private NewBehaviorWizardController behaviorWizardManager;
    private SelectProjectController controller;
    private Tree tree;
    private final static String pageName = "Select Project";
    private final static String title = "Create a Behavior";
    private final static String description = "Select the destination project";

    public SelectProjectView(SelectProjectController selectProjectController) {
	super(pageName);
	this.controller = selectProjectController;
    }

    public void createControl(Composite parent) {

	Composite topLevel = new Composite(parent, SWT.NONE);
	setControl(topLevel);

	setTitle(title);
	setDescription(description);

	GridLayout gl = new GridLayout();
	topLevel.setLayout(gl);
	topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
		| GridData.HORIZONTAL_ALIGN_FILL));
	topLevel.setFont(parent.getFont());

	tree = new Tree(topLevel, SWT.VIRTUAL | SWT.BORDER);
	tree.setSize(180, 180);

	tree.addListener(SWT.Selection, new Listener() {
	    public void handleEvent(Event event) {

		if (!(event.item instanceof TreeItem)) {
		    setPageComplete(false);
		    return;
		}

		TreeItem item = (TreeItem) event.item;
		setPageComplete(true);
		controller.setProjectName(item.getText());
	    }
	});

	GridData gd1 = new GridData();
	gd1.horizontalAlignment = GridData.FILL;
	gd1.verticalAlignment = GridData.FILL;
	gd1.grabExcessHorizontalSpace = true;
	gd1.grabExcessVerticalSpace = true;
	tree.setLayoutData(gd1);

	setPageComplete(false);

	controller.refreshObservers();

    }

    public String getProjectName() {
	return this.projectName;
    }

    public void update(Observable o, Object arg) {
	if (arg instanceof SelectProjectModel) {
	    SelectProjectModel model = (SelectProjectModel) arg;

	    if (tree.getItemCount() <= 0) {
		ArrayList<String> projectNames = model.getProjectNames();
		for (String name : projectNames) {
		    TreeItem item = new TreeItem(tree, SWT.None);
		    item.setText(name);
		    item.setImage(ImagesManager.PROJECT);

		}
	    }

	}
    }
}
