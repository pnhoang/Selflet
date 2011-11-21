package it.polimi.selfletclipse.wizards.SelectProject;

public class SelectProjectController {

    private SelectProjectModel model;

    public SelectProjectController(SelectProjectModel selectProjectModel) {
	this.model = selectProjectModel;
    }

    public void setProjectName(String name) {
	model.setProjectName(name);
    }

    public void refreshObservers() {
	model.changeAndNotifyObservers();
    }

}
