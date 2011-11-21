package it.polimi.selfletclipse.wizards.InsertGoal;

import it.polimi.selfletclipse.SelfLetProjectManager;
import it.polimi.selfletclipse.exceptions.NotFoundException;
import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.model.GoalParameter;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalModel;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class InsertGoalModel extends Observable implements Observer {

    // model data
    private String parameterName;

    private String goalName;
    private ArrayList<GoalParameter> parameters = null;

    private String pageTitle;
    private String pageDescription;

    private boolean parametersReadOnly;
    private boolean goalNameReadOnly;

    public static final int MAIN_GOAL = 0;
    public static final int GENERIC_GOAL = 1;

    public InsertGoalModel(int type) {
	type = (type < 0 || type > 1) ? GENERIC_GOAL : type;

	switch (type) {
	case MAIN_GOAL:
	    pageTitle = "Create the main goal for the selflet";
	    pageDescription = "Specify the input and the output parameters for the main goal";
	    break;

	case GENERIC_GOAL:
	    pageTitle = "Create a Goal";
	    pageDescription = "Specify the input and the output parameters for the goal";
	    break;
	}

	parameterName = "";
	goalName = "";
	parameters = new ArrayList<GoalParameter>();
	this.parametersReadOnly = false;
	this.goalNameReadOnly = false;
    }

    public Goal getGoal() {
	return new Goal(goalName, parameters);
    }

    public String getParameterName() {
	return parameterName;
    }

    public String getGoalName() {
	return goalName;
    }

    public String getPageTitle() {
	return pageTitle;
    }

    public String getPageDescription() {
	return pageDescription;
    }

    void setGoalName(String goal) {
	this.goalName = goal;
	changeAndNotifyObservers();
    }

    void setParameterName(String param) {
	this.parameterName = param;
	changeAndNotifyObservers();
    }

    void addParameter() {

	GoalParameter gp = new GoalParameter(parameterName, "Object", false);
	if (parameters.contains(gp))
	    return;

	parameterName = "";
	parameters.add(gp);
	changeAndNotifyObservers();
    }

    void changeAndNotifyObservers() {
	setChanged();
	notifyObservers(this);
    }

    @SuppressWarnings("unchecked")
    ArrayList<GoalParameter> getGoalParameters() {

	Object clone = parameters.clone();
	return (ArrayList<GoalParameter>) clone;
    }

    public boolean isGoalComplete() {
	if (goalName.length() == 0)
	    return false;

	if (parameters.isEmpty())
	    return false;

	for (GoalParameter parameter : parameters) {
	    if (parameter.isOutput())
		return true;
	}

	return false;
    }

    public boolean isParametersReadOnly() {
	return parametersReadOnly;
    }

    public boolean isGoalNameReadOnly() {
	// if parameters are read only, its not possible to change only the name
	return parametersReadOnly ? true : goalNameReadOnly;
    }

    void removeParameter(int index) {
	if (index < 0 || index > parameters.size())
	    return;
	parameters.remove(index);
	changeAndNotifyObservers();
    }

    void setOutputParameter(GoalParameter goalParameter, boolean output) {
	int index = parameters.indexOf(goalParameter);

	if (index < 0)
	    return;

	for (GoalParameter gp : parameters) {
	    if (gp.equals(goalParameter))
		gp.setOutput(output);
	    else
		gp.setOutput(false);
	}
	changeAndNotifyObservers();
    }

    // observer pattern
    public void update(Observable o, Object arg) {
	if (arg instanceof SelectGoalModel) {
	    this.goalNameReadOnly = false;
	    this.parametersReadOnly = false;

	    SelectGoalModel model = (SelectGoalModel) arg;
	    goalName = model.getGoalName();

	    if (goalName.length() > 0)
		this.goalNameReadOnly = true;

	    // delete previous parameters
	    parameters.clear();

	    if (!model.isNewGoal()) {
		//
		Goal goal;
		try {
		    goal = SelfLetProjectManager.getGoal(model.getGoalName(),
			    model.getProject());
		} catch (NotFoundException e) {
		    return;
		}

		if (goal != null) {
		    parameters = goal.getParameters();
		    parameters.add(new GoalParameter(goal.getOutputName(), goal
			    .getOutputType(), true));

		    this.parametersReadOnly = true;
		}
	    }
	    changeAndNotifyObservers();
	}
    }
}
