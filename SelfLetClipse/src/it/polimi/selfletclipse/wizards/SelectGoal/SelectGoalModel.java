package it.polimi.selfletclipse.wizards.SelectGoal;

import it.polimi.selfletclipse.SelfLetProjectManager;
import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.model.SelfLetProject;
import it.polimi.selfletclipse.model.SelfLetProject;

import java.util.ArrayList;
import java.util.Map;
import java.util.Observable;
import java.util.TreeMap;
import java.util.Vector;

import org.eclipse.core.resources.IResource;

public class SelectGoalModel extends Observable {

    private String serviceName;
    private String project;
    private boolean isComplex;
    private boolean isNewGoal;

    public SelectGoalModel() {
	// initialization
	this.isComplex = true;
	this.isNewGoal = false;
	this.serviceName = "";
	this.project = "";
    }

    public boolean isComplex() {
	return isComplex;
    }

    void setComplex(boolean isComplex) {
	this.isComplex = isComplex;
	changeAndNotifyObservers();
    }

    public String getGoalName() {
	return serviceName;
    }

    public String getProject() {
	return project;
    }

    void setComplexBehavior() {
	this.isComplex = true;
	changeAndNotifyObservers();
    }

    void setElementaryBehavior() {
	this.isComplex = false;
	changeAndNotifyObservers();
    }

    void setSelectedGoal(String service, String project) {
	this.serviceName = service;
	this.project = project;
	changeAndNotifyObservers();
    }

    public Map<String, ArrayList<String>> getAllProjectGoals() {

	Map<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();
	ArrayList<SelfLetProject> projects = SelfLetProjectManager
		.getProjects();

	for (SelfLetProject project : projects) {

	    ArrayList<Goal> services = project.getGoals();
	    ArrayList<String> serviceNames = new ArrayList<String>();

	    for (Goal service : services) {
		String serviceName = service.getName();
		if (serviceName.endsWith(".xml"))
		    serviceName = serviceName.substring(0, serviceName.length()
			    - ".xml".length());
		serviceNames.add(serviceName);
	    }
	    map.put(project.getName(), serviceNames);
	}

	return map;
    }

    public boolean isGoalComplete() {
	// at least a service name...
	if (serviceName.length() <= 0)
	    return false;

	// we just need a service name
	if (isNewGoal)
	    return true;

	// otherwise we also need a project name
	if (project.length() > 0)
	    return true;
	return false;

    }

    void setNewGoal(boolean b) {
	this.isNewGoal = b;
	changeAndNotifyObservers();
    }

    public boolean isNewGoal() {
	return this.isNewGoal;
    }

    void setGoalName(String service) {
	this.serviceName = service;
	changeAndNotifyObservers();
    }

    void changeAndNotifyObservers() {
	setChanged();
	notifyObservers(this);
    }

}
