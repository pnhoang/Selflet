package it.polimi.selfletclipse.wizards.SelectGoal;

public class SelectGoalController {

    private SelectGoalModel model;

    public SelectGoalController(SelectGoalModel selectGoalModel) {
	this.model = selectGoalModel;
    }

    public void refreshObservers() {
	model.changeAndNotifyObservers();
    }

    public void setComplexBehavior() {
	model.setComplexBehavior();
    }

    public void setElementaryBehavior() {
	model.setElementaryBehavior();
    }

    public void setSelectedGoal(String service, String project) {
	model.setSelectedGoal(service,project);
    }

    public void setNewGoal(boolean b) {
	model.setNewGoal(b);
    }

    public void setGoalName(String text) {
	model.setGoalName(text);
    }

}
