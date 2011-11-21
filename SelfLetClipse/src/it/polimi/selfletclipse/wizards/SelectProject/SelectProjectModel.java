package it.polimi.selfletclipse.wizards.SelectProject;

import it.polimi.selfletclipse.SelfLetProjectManager;
import it.polimi.selfletclipse.model.SelfLetProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

public class SelectProjectModel extends Observable {

    private String projectName;

    public SelectProjectModel() {
	projectName = "";
    }

    void setProjectName(String name) {
	this.projectName = name;
	changeAndNotifyObservers();
    }

    public String getProjectName() {
	return projectName;
    }

    public ArrayList<String> getProjectNames() {
	ArrayList<SelfLetProject> prjs = SelfLetProjectManager.getProjects();
	ArrayList<String> projects = new ArrayList<String>();

	for (SelfLetProject selfLetProject : prjs) {
	    String selfletName = selfLetProject.getName();
	    projects.add(selfletName);
	}

	Collections.sort(projects);
	return projects;
    }

    void changeAndNotifyObservers() {
	setChanged();
	notifyObservers(this);
    }

}
