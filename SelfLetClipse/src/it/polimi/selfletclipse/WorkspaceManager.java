package it.polimi.selfletclipse;

import it.polimi.selfletclipse.exceptions.NotFoundException;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

/**
 * @author Nicola
 */
public class WorkspaceManager {

	private static final Logger LOG = Logger.getLogger(WorkspaceManager.class);

	private static WorkspaceManager instance = null;

	public static final String folderNames[] = { "abilities", "actions",
			"behaviors", "conditions", "services", "rules" };

	/** Resource types constants */
	public static final int ABILITY = 0;
	public static final int ACTION = 1;
	public static final int BEHAVIOR = 2;
	public static final int CONDITION = 3;
	public static final int GOAL = 4;
	public static final int RULE = 5;

	/**
	 * Singleton
	 * */
	public static WorkspaceManager getInstance() {
		if (instance != null)
			return instance;

		LOG.debug("Initializing workspace manager");

		instance = new WorkspaceManager();
		WorkspaceManager.refreshResourcesTree();
		WorkspaceManager.reloadSelfletProjects();

		return instance;

	}

	/**
	 * Private constructor
	 * */
	private WorkspaceManager() {
	}

	/**
	 * Refreshes the resource hierarchy.
	 * */
	public static void refreshResourcesTree() {
		try {
			SelfLetPlugin.root.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			LOG.debug("Error while refreshing the resources tree");
		}
	}

	/**
	 * Scan the workspace and returns existing Selflet projects. This method
	 * does not modify data structures
	 * */
	public static ArrayList<IProject> scanSelfletProjects() {

		ArrayList<IProject> projectResources = new ArrayList<IProject>();

		IProject[] allProjects = SelfLetPlugin.root.getProjects();

		for (int i = 0; i < allProjects.length; i++) {
			IProject curr = allProjects[i];

			if (!curr.isOpen())
				continue;

			if (isSelfletProject(curr)) {
				projectResources.add(curr);
			}
		}

		return projectResources;
	}

	/**
	 * Checks if the given name is among the selflet projectResources
	 * 
	 * @param project
	 *            the project name of the project to check.
	 * @return true <==> the name corresponds to a selflet project
	 * */
	public static boolean isSelfletProject(String project) {
		return isSelfletProject(SelfLetPlugin.root.getProject(project));
	}

	/**
	 * Checks if the input projectResources resource is a selflet
	 * projectResources (exists all the projectResources directories). This
	 * could be refined...How can I define a valid projectResources?
	 * 
	 * @param project
	 *            the IProject resource to check
	 * @return true <==> the projectResources is a valid selflet
	 *         projectResources
	 * 
	 * */
	public static boolean isSelfletProject(IProject project) {

		if (!isValidProject(project))
			return false;

		for (int i = 0; i < folderNames.length; i++) {
			IFolder folder = project.getFolder(folderNames[i]);
			if (!folder.exists())
				return false;
		}

		return true;
	}

	/**
	 * Get the projectResources with the specified name
	 * 
	 * @param projectResources
	 *            name of the projectResources
	 * @return the projectResources with the given name. null if the
	 *         projectResources does not exists
	 * @throws NotFoundException
	 * */
	public static IProject getProject(String project) throws NotFoundException {

		ArrayList<IProject> projectResources = scanSelfletProjects();
		for (IProject p : projectResources) {
			if (p.getName().equals(project))
				return p;
		}

		throw new NotFoundException();
	}

	/**
	 * @param name
	 *            the name of a selflet folder
	 * @return the id corresponding to that folder, -1 if does not exists
	 * */
	public static int getFolderIDbyName(String name) {
		for (int i = 0; i < folderNames.length; i++) {
			if (name.equals(folderNames[i]))
				return i;
		}
		return -1;
	}

	/**
	 * Reload all the selflet resources
	 * */
	private static void reloadSelfletProjects() {
		ArrayList<IProject> projectResources = scanSelfletProjects();

		for (IProject p : projectResources) {
			SelfLetProjectManager.loadProject(p);
		}
	}

	/**
	 * @param project
	 *            the project to check
	 * @return true<==> the project exists and is open
	 * 
	 **/
	private static boolean isValidProject(IProject project) {
		if (project == null || !project.exists() || !project.isOpen())
			return false;
		return true;
	}

	// /**
	// * Add a projectResources to the list of projectResources. The
	// * projectResources is added if it is not yet in the list.
	// *
	// * @param newProject
	// * the projectResources to add
	// */
	// public static void addProject(SelfLetProject newProject) {
	// WorkspaceManager.refreshResourcesTree();
	//
	// for (IProject p : projectResources) {
	// if (p.getName().equals(newProject))
	// return;
	// }
	//
	// projectResources.add(newProject);
	// }
}
