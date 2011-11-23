package it.polimi.selfletclipse.util;

import it.polimi.selfletclipse.SelfLetProjectManager;
import it.polimi.selfletclipse.WorkspaceManager;
import it.polimi.selfletclipse.exceptions.NotFoundException;
import it.polimi.selfletclipse.exceptions.WriteErrorException;
import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.model.GoalParameter;
import it.polimi.selfletclipse.model.SelfLetProject;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;

public class WorkspaceWriter {

    private static final Logger LOG = Logger.getLogger(WorkspaceWriter.class);

    /**
     * Private constructor
     */
    private WorkspaceWriter() {
    }

    /**
     * Write a goal xml file in the project identified by the project name given
     * as parameter.
     * 
     * @param goal
     *            The goal to write
     * @param projectName
     *            The project in which to write the goal
     * @return
     * @throws WriteErrorException
     * */
    public static IFile writeGoalFile(Goal goal, String projectName)
	    throws WriteErrorException {

	SelfLetProject project = null;
	try {
	    project = SelfLetProjectManager.getProject(projectName);
	} catch (NotFoundException e) {
	    LOG.debug("Error while opening project " + projectName);
	    throw new WriteErrorException("The project does not exists");
	}

	if (project == null || project.getProjectResource() == null)
	    throw new WriteErrorException("Cannot write goal " + goal
		    + " in project " + projectName);

	IProject projectResource = project.getProjectResource();

	String path = new String("goals/" + goal.getName() + ".xml");
	IFile file = FileUtils.createFileInProject(projectResource, path);

	String s = new String();

	s = s.concat("<goal name=\"" + goal.getName() + "\">\r\n");
	s = s.concat("\t<input>\n");

	ArrayList<GoalParameter> parameters = goal.getParameters();

	for (GoalParameter parameter : parameters) {
	    s = s.concat("\t\t<param name=\"" + parameter.getName()
		    + "\" type=\"" + parameter.getType() + "\" />\r\n");
	}

	s = s.concat("\t</input>\r\n");
	s = s.concat("\t<output>\r\n");
	s = s.concat("\t\t<param name=\"" + goal.getOutputName() + "\" type=\""
		+ goal.getOutputType() + "\" />\r\n");
	s = s.concat("\t</output>\r\n");
	s = s.concat("</goal>\r\n");

	FileUtils.writeFile(file, s);
	return file;
    }

    /**
     * Write the xml file that represents the entire selflet (selflet.xml in the
     * project root).
     * 
     * The file will be written in the root directory. The file xml schema is in
     * it.polimi.selfletclipse/resources/dtd.
     * 
     * @param projectName
     * 
     * @throws WriteErrorException
     * 
     * */
    public static void writeSelfletConfigurationFile(String projectName)
	    throws NotFoundException, WriteErrorException {
	SelfLetProject project;
	project = SelfLetProjectManager.getProject(projectName);
	writeSelfletConfigurationFile(project);
    }

    /**
     * Write the xml file that represents the entire selflet (selflet.xml in the
     * project root).
     * 
     * The file will be written in the root directory. The file xml schema is in
     * it.polimi.selfletclipse/resources/dtd.
     * 
     * @param project
     *            the object representing the selflet to write
     * @throws WriteErrorException
     * 
     * */
    public static void writeSelfletConfigurationFile(SelfLetProject project)
	    throws WriteErrorException {

	if (project == null)
	    throw new WriteErrorException("Null project to write");

	IProject projectResource = null;
	try {
	    projectResource = WorkspaceManager.getProject(project.getName());
	} catch (NotFoundException e) {
	    LOG.debug("Project " + project + " does not exists");
	    throw new WriteErrorException("Project " + project
		    + " does not exists");
	}

	IFile file = FileUtils.createFileInProject(projectResource,
		"selflet.xml");

	if (file == null)
	    throw new WriteErrorException("Cannot create file selflet.xml");

	String s = new String();

	s = s.concat("<selflet name=\"" + project.getName() + "\">\n\n");
	s = s.concat("\t<properties>\r\n");

	s = s.concat("\t\t<author>" + project.getAuthor() + "</author>\n");

	s = s.concat("\t\t<description>" + project.getDescription()
		+ "</description>\r\n");

	String mode = project.isActiveSelflet() ? "active mainGoal=\""
		: "passive";

	// add parameter
	if (project.isActiveSelflet())
	    mode = mode.concat(project.getMainGoal().getName() + "\"");

	s = s.concat("\t\t<" + mode + "/>\n");
	s = s.concat(getMiddleWareParams(project));
	s = s.concat("\t</properties>\n\n");

	// resources
	s = s.concat("\t<resources>\n\n");

	// --abilities
	s = s.concat("\t\t<abilities>\n");
	s = s.concat(getXMLAbilities(project));
	s = s.concat("\t\t</abilities>\n\n");

	// --actions
	s = s.concat("\t\t<actions>\n");
	s = s.concat(getXMLActions(project));
	s = s.concat("\t\t</actions>\n\n");

	// --behaviors
	s = s.concat("\t\t<behaviors>\n");
	s = s.concat(getXMLBehaviors(project));
	s = s.concat("\t\t</behaviors>\n\n");

	// --conditions
	s = s.concat("\t\t<conditions>\n");
	s = s.concat(getXMLConditions(project));
	s = s.concat("\t\t</conditions>\n\n");

	// --goals
	s = s.concat("\t\t<goals>\n");
	s = s.concat(getXMLGoals(project));
	s = s.concat("\t\t</goals>\n\n");

	// --rules
	s = s.concat("\t\t<rules>\n");
	s = s.concat(getXMLRules(project));
	s = s.concat("\t\t</rules>\n\n");

	s = s.concat("\t</resources>\n");

	s = s.concat("</selflet>");

	FileUtils.writeFile(file, s);
    }

    private static String getMiddleWareParams(SelfLetProject project) {
	String s = new String();
	s = s.concat("\t\t<reds>\n");

	s = s.concat("\t\t\t<address>" + project.getREDsAddress()
		+ "</address>\n");
	s = s.concat("\t\t\t<port>" + project.getREDsPort() + "</port>\n");

	s = s.concat("\t\t</reds>\n");

	s = s.concat("\t\t<lime>\n");
	s = s.concat("\t\t\t<port>" + project.getLimePort() + "</port>\n");
	s = s.concat("\t\t</lime>\n");

	return s;
    }

    private static String getXMLRules(SelfLetProject project) {
	// TODO
	return new String();
    }

    private static String getXMLGoals(SelfLetProject project) {

	ArrayList<Goal> goals = project.getGoals();

	String folderName = WorkspaceManager.folderNames[WorkspaceManager.GOAL];

	String s = new String();
	for (Goal goal : goals) {
	    String name = goal.getName() + ".xml";
	    s = s + "\t\t\t<goal file=\"" + folderName + "/" + name + "\">";
	    s = s + "</goal>\n";
	}

	return s;
    }

    /**
     * getXMLConditions
     * 
     * @param project
     * 
     * */
    private static String getXMLConditions(SelfLetProject project) {
	ArrayList<IResource> conditions = project
		.getResourcesByType(WorkspaceManager.CONDITION);

	String folderName = WorkspaceManager.folderNames[WorkspaceManager.CONDITION];

	String s = new String();
	for (IResource condition : conditions) {
	    String name = condition.getName();
	    s = s.concat("\t\t\t<condition file=\"" + folderName + "/" + name
		    + "\">");
	    s = s.concat("</condition>\n");
	}

	return s;
    }

    /**
     * getXMLBehaviors
     * 
     * @param project
     * 
     * */
    private static String getXMLBehaviors(SelfLetProject project) {
	String s = new String();
	ArrayList<IResource> behaviors = project
		.getResourcesByType(WorkspaceManager.BEHAVIOR);

	for (IResource resource : behaviors) {
	    String name = resource.getName();

	    if (name.endsWith(".zargo")) {
		name = name.substring(0, name.length() - ".zargo".length());
		name = name + ".xmi";
	    }

	    String folderName = WorkspaceManager.folderNames[WorkspaceManager.BEHAVIOR];

	    s = s.concat("\t\t\t<behavior file=\"" + folderName + "/" + name
		    + "\">");

	    s = s.concat("</behavior>\n");
	}

	return s;
    }

    /**
     * getXMLBehaviors
     * 
     * @param project
     * 
     * */
    private static String getXMLActions(SelfLetProject project) {

	String s = new String();
	ArrayList<IResource> actions = project
		.getResourcesByType(WorkspaceManager.ACTION);

	for (IResource resource : actions) {
	    String name = resource.getName();
	    String folderName = WorkspaceManager.folderNames[WorkspaceManager.ACTION];
	    s = s.concat("\t\t\t<action file=\"" + folderName + "/" + name
		    + "\">");
	    s = s.concat("</action>\n");
	}
	return s;
    }

    /**
     * getXMLAbilities
     * 
     * @param project
     * 
     * */
    private static String getXMLAbilities(SelfLetProject project) {

	String s = new String();
	ArrayList<IResource> abilities = project
		.getResourcesByType(WorkspaceManager.ABILITY);

	for (IResource resource : abilities) {
	    String name = resource.getName();
	    String folderName = WorkspaceManager.folderNames[WorkspaceManager.ABILITY];

	    s = s.concat("\t\t\t<ability file=\"" + folderName + "/" + name
		    + "\">");
	    s = s.concat("</ability>\n");
	}

	return s;
    }

}