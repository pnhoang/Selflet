package it.polimi.selfletclipse.wizards.InsertGoal;

import it.polimi.selfletclipse.model.GoalParameter;

public class InsertGoalController {

    private InsertGoalModel model;

    public InsertGoalController(InsertGoalModel serviceModel) {
	this.model = serviceModel;
    }

    public void setParameterName(String par) {
	model.setParameterName(par);
    }

    public void setGoalName(String text) {
	model.setGoalName(text);
    }

    public void refreshObservers() {
	model.changeAndNotifyObservers();
    }

    public void addParameter() {
	model.addParameter();
    }

    public void remove(int index) {
	model.removeParameter(index);
    }

    public void setOutputParameter(GoalParameter serviceParameter, boolean output) {
	model.setOutputParameter(serviceParameter, output);
    }

}
