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

    private String goalName;
    private String project;
    private boolean isComplex;
    private boolean isNewGoal;

    public SelectGoalModel() {
	// initialization
	this.isComplex = true;
	this.isNewGoal = false;
	this.goalName = "";
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
	return goalName;
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

    void setSelectedGoal(String goal, String project) {
	this.goalName = goal;
	this.project = project;
	changeAndNotifyObservers();
    }

    public Map<String, ArrayList<String>> getAllProjectGoals() {

	Map<String, ArrayList<String>> map = new TreeMap<String, ArrayList<String>>();
	ArrayList<SelfLetProject> projects = SelfLetProjectManager
		.getProjects();

	for (SelfLetProject project : projects) {

	    ArrayList<Goal> goals = project.getGoals();
	    ArrayList<String> goalNames = new ArrayList<String>();

	    for (Goal goal : goals) {
		String goalName = goal.getName();
		if (goalName.endsWith(".xml"))
		    goalName = goalName.substring(0, goalName.length()
			    - ".xml".length());
		goalNames.add(goalName);
	    }
	    map.put(project.getName(), goalNames);
	}

	return map;
    }

    public boolean isGoalComplete() {
	// at least a goal name...
	if (goalName.length() <= 0)
	    return false;

	// we just need a goal name
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

    void setGoalName(String goal) {
	this.goalName = goal;
	changeAndNotifyObservers();
    }

    void changeAndNotifyObservers() {
	setChanged();
	notifyObservers(this);
    }

}
