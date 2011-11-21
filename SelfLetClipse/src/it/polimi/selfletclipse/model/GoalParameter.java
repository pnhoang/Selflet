package it.polimi.selfletclipse.model;

/**
 * 
 * @author Nicola
 * 
 *         Represent a couple (Name,Type). The boolean isOutput is true if it is
 *         an output parameter
 * */
public class GoalParameter {

	private final String name;
	private final String type;
	private boolean isOutput;

	public GoalParameter(String name, String type, boolean isOutput) {
		this.name = name;
		this.type = type;
		this.isOutput = isOutput;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public boolean isOutput() {
		return isOutput;
	}

	public void setOutput(boolean b) {
		isOutput = b;
	}

	public boolean equals(GoalParameter other) {
		if (other == this)
			return true;

		if (other.name.equals(name))
			return true;

		return false;
	}

	@Override
	public String toString() {
		return "Name: " + name + " type: " + type + " isOutput: " + isOutput;
	}
}
