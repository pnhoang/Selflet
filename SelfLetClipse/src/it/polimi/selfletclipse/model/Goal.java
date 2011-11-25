package it.polimi.selfletclipse.model;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;

/**
 * @author Nicola
 */
public class Goal {

	private String name;
	private ArrayList<GoalParameter> parameters;
	private String outputName;
	private String outputType;
	private IResource resource;

	/**w
	 * Constructor
	 * 
	 * @param name
	 *            service name
	 * @param parameters
	 *            list of service parameters
	 */
	public Goal(String name, ArrayList<GoalParameter> parameters) {
		this.name = name;
		setParameters(parameters);
	}

	public IResource getResource() {
		return resource;
	}

	public void setGoalResource(IResource serviceResource) {
		this.resource = serviceResource;
	}

	/**
	 * Empty constructor
	 */
	public Goal() {
	}

	/**
	 * @param serviceParameters
	 *            A vector with all the parameters including the output
	 *            parameter. The method will set the output parameter field and
	 *            remove the output parameter from the input vector
	 * 
	 * */
	public void setParameters(ArrayList<GoalParameter> serviceParameters) {
		this.parameters = serviceParameters;

		for (GoalParameter p : parameters) {
			if (p.isOutput()) {
				this.outputName = p.getName();
				this.outputType = p.getType();
				parameters.remove(p);
				return;
			}
		}
	}

	public void setName(String text) {
		this.name = text;
	}

	public String getName() {
		return name;
	}

	public ArrayList<GoalParameter> getParameters() {
		return this.parameters;
	}

	public String getOutputName() {
		return outputName;
	}

	public String getOutputType() {
		return outputType;
	}

}
