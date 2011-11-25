package it.polimi.selfletclipse;

import it.polimi.selfletclipse.exceptions.NotFoundException;
import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.model.SelfLetProject;
import it.polimi.selfletclipse.util.FileUtils;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * @author Nicola
 */

public class SelfLetProjectManager {

    private static final Logger LOG = Logger.getLogger(SelfLetProject.class);

    private static SelfLetProjectManager instance = null;
    private static ArrayList<SelfLetProject> projects;

    /**
     * Singleton
     * */
    public static SelfLetProjectManager getInstance() {
	if (instance != null)
	    return instance;

	projects = new ArrayList<SelfLetProject>();

	return instance = new SelfLetProjectManager();
    }

    private SelfLetProjectManager() {
    }

    /**
     * @param goalName
     * @param projectName
     * 
     *            Returns a goal object representing the goal.
     * @throws NotFoundException
     * */
    public static Goal getGoal(String goalName, String projectName)
	    throws NotFoundException {

	for (SelfLetProject project : projects) {
	    if (project.getName().equals(projectName)) {
		return project.getGoal(goalName);
	    }
	}

	throw new NotFoundException();
    }

    /**
     * 
     * Load a goal xml file and returns the associated resource
     * 
     * @param goal
     *            the goal name
     * @param projectResources
     *            the projectResources containing the goal
     * 
     * @return the resource representing the goal. null if the action does not
     *         exist
     * @throws NotFoundException
     * */
    public static IResource getGoalResource(String goal, String project)
	    throws NotFoundException {

	if (goal == null || project == null)
	    throw new NotFoundException();

	SelfLetProject p = null;
	Goal g = null;
	try {
	    p = SelfLetProjectManager.getProject(project);
	    g = p.getGoal(goal);
	} catch (NotFoundException e) {
	    LOG.debug("Error while loading goal " + goal + " in project "
		    + project);
	    throw new NotFoundException();
	}
	return g.getResource();

    }

    /**
     * Load a project into the workspace
     * 
     * @param project
     * 
     * */
    public static void loadProject(SelfLetProject project) {

	if (project == null)
	    return;

	IProject projectResource = project.getProjectResource();

	for (int i = 0; i < WorkspaceManager.folderNames.length; i++) {

	    String currentFolder = WorkspaceManager.folderNames[i];
	    ArrayList<IResource> v = getResourcesInFolder(projectResource,
		    currentFolder);
	    project.setFolderResources(currentFolder, v);
	}

	loadGoals(project);

	addProject(project);

    }

    /**
     * Scan the given project resource and load the project data structure in
     * the manager.
     * 
     * @param projectResource
     *            the project to load
     * */
    public static void loadProject(IProject projectResource) {
	if (projectResource == null)
	    return;

	SelfLetProject project = null;
	try {
	    project = SelfLetProjectManager.getProject(projectResource
		    .getName());
	} catch (NotFoundException e) {
	    project = new SelfLetProject(projectResource.getName(),
		    projectResource);
	}

	for (int i = 0; i < WorkspaceManager.folderNames.length; i++) {

	    String currentFolder = WorkspaceManager.folderNames[i];
	    ArrayList<IResource> v = getResourcesInFolder(projectResource,
		    currentFolder);
	    project.setFolderResources(currentFolder, v);
	}

	loadGoals(project);

	addProject(project);
    }

    /**
     * Add the given project to the list of current projects. If the project
     * already exists, it will be replaced with the new one.
     * 
     * @param project
     *            the project to add
     * */
    private static void addProject(SelfLetProject project) {
	for (SelfLetProject p : projects) {
	    if (p.equals(project)) {
		return;
		// TODO problema se il progetto c'e' gia' dovrei aggiornarlo con
		// i valori piu' recenti.
		// projects.remove(p);
	    }
	}
	projects.add(project);
    }

    /**
     * 
     * @param projectName
     *            the name of the selflet project
     * */
    public static SelfLetProject getProject(String projectName)
	    throws NotFoundException {

	if (projectName == null)
	    throw new NotFoundException();

	for (SelfLetProject project : projects) {
	    if (project.getName().equals(projectName))
		return project;
	}

	throw new NotFoundException();
    }

    /**
     * Parse all the services in the "services" folder and creates a goal object for
     * each one of them.
     * */
    private static void loadGoals(SelfLetProject project) {

	ArrayList<IResource> goalResources = project.getGoalResources();

	for (IResource resource : goalResources) {

	    if (resource == null)
		continue;

	    Goal g = FileUtils.loadGoalFromFile(resource);

	    if (g == null)
		continue;

	    project.addGoal(g);
	}
    }

    /**
     * Load all the valid resources inside the specified folder.
     * 
     * @param folderName
     *            the folder from which to load all the resources contained in
     *            it.
     * @return a vector containing all the valid resources for the specified
     *         folder
     * 
     * */
    private static ArrayList<IResource> getResourcesInFolder(
	    IProject projectResource, String folderName) {

	ArrayList<IResource> v = new ArrayList<IResource>();

	IFolder folder = projectResource.getFolder(folderName);
	if (folder == null)
	    return v;

	IResource[] members = null;

	try {
	    members = folder.members();
	} catch (CoreException e) {

	}

	if (members == null)
	    return v;

	int folderId = WorkspaceManager.getFolderIDbyName(folderName);

	for (int i = 0; i < members.length; i++) {

	    if (isResourceValid(members[i], folderId))
		v.add(members[i]);
	}

	return v;
    }

    /**
     * This method check the validity of the given resource with respect the
     * folder in which it is contained. E.g. if the folder is "behaviors", the
     * resource must be a valid .zargo file.
     * 
     * @param resource
     *            the resource to check
     * @param folderId
     *            the folder in which the resource it is contained.
     * */
    private static boolean isResourceValid(IResource resource, int folderId) {

	if (resource == null)
	    return false;

	switch (folderId) {
	case WorkspaceManager.BEHAVIOR:
	    if (resource.getName().endsWith(".zargo"))
		return true;
	    break;

	case WorkspaceManager.ACTION:
	    if (resource.getName().endsWith(".java"))
		return true;
	    break;

	case WorkspaceManager.CONDITION:
	    if (resource.getName().endsWith(".xml"))
		return true;
	    break;

	case WorkspaceManager.GOAL:
	    if (resource.getName().endsWith(".xml"))
		return true;
	    break;
	default:
	    return false;
	}
	return false;

    }

    // public void addAbility(IFile file) {
    // if (file == null)
    // return;
    // String name = file.getName();
    // Vector<IResource> abilities = resourcesMap.get("abilities");
    // for (IResource resource : abilities) {
    // if (resource.getName().equals(name))
    // return;
    // }
    // abilities.add(file);
    // }

    public static ArrayList<SelfLetProject> getProjects() {
	return (ArrayList<SelfLetProject>) projects.clone();
    }

}
