package it.polimi.selfletclipse.markers;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.ResourcesPlugin;

public class MarkersManager {

    /* Logger */
    private static final Logger LOG = Logger.getLogger(MarkersManager.class);

    /* Singleton instance */
    private static MarkersManager manager = null;

    private static SelfLetManifestListener listener = null;

    public static MarkersManager getInstance() {
	if (manager == null) {
	    LOG.info("Starting Markers Manager");

	    manager = new MarkersManager();

	    listener = new SelfLetManifestListener();

	    // TODO any other event ?
	    LOG.info("Registering resource change listener");

	    // MarkersManager.initMarkers();

	    ResourcesPlugin.getWorkspace().addResourceChangeListener(listener,
		    IResourceChangeEvent.POST_CHANGE);

	}
	return manager;

    }

    /**
     * Private constructor
     * */
    private MarkersManager() {
    }

    // private static void initMarkers() {
    //
    // LOG.info("Initializing markers");
    //
    // // This part must be completely refactored!
    // checkMissingGoals();
    // // SelfletXmlError mySelfletXmlError = new SelfletXmlError(resource);
    //
    // // checkMissingConditions(); //TODO
    // // checkFaultActionFiles(); //TODO
    //
    // }

    // private static void checkMissingConditions() {
    // LOG.info("Checking missing conditions in workspace");
    // IProject[] projects = root.getProjects();
    //
    // if (projects == null) {
    // LOG.error("Error opening workspace");
    // return;
    // }
    //
    // for (int i = 0; i < projects.length; i++) {
    // IProject project = projects[i];
    //
    // if (!project.isOpen())
    // continue;
    //
    // IFolder folder = project.getFolder("behaviors");
    // if (folder == null)
    // continue;
    //
    // IResource[] projectFiles = null;
    // try {
    // projectFiles = folder.members();
    // } catch (CoreException e) {
    // LOG.error("Error in opening folder " + folder.getName());
    // e.printStackTrace();
    // }
    //
    // if (projectFiles == null)
    // continue;
    //
    // for (int j = 0; j < projectFiles.length; j++) {
    // IResource resource = projectFiles[j];
    //
    // if (resource == null)
    // continue;
    //
    // /* Skip not zargo files */
    // if (!resource.getName().endsWith(".zargo"))
    // continue;
    //
    // ConditionsInFile cond = new ConditionsInFile(resource);
    //
    // }
    //
    // }
    // }
    //
    // /*
    // * This method checks if for each action file the following constraints
    // are
    // * respected:
    // *
    // * 1) The file must contains exactly the goal invocation represented by
    // the
    // * action file name
    // *
    // * 2) The file must not contain more than one goal invocation
    // *
    // * 3)
    // */
    // private static void checkFaultActionFiles() {
    // LOG.info("Checking fault action files in workspace");
    //
    // IProject[] projects = root.getProjects();
    //
    // if (projects == null)
    // return;
    //
    // for (int i = 0; i < projects.length; i++) {
    // IProject project = projects[i];
    //
    // if (!project.isOpen())
    // continue;
    //
    // IFolder folder = project.getFolder("actions");
    // if (folder == null)
    // continue;
    //
    // IResource[] projectFiles = null;
    // try {
    // projectFiles = folder.members();
    // } catch (CoreException e) {
    // e.printStackTrace();
    // }
    //
    // if (projectFiles == null)
    // continue;
    //
    // for (int j = 0; j < projectFiles.length; j++) {
    // IResource resource = projectFiles[j];
    //
    // if (resource == null)
    // continue;
    //
    // if (!resource.getName().contains(".java"))
    // continue;
    //
    // MarkersInAction mia = new MarkersInAction(resource);
    // mia.getMarkers(); // TODO
    //
    // }
    //
    // }
    // }
    //
    // private static void checkMissingGoals() {
    //
    // LOG.info("Checking missing services in workspace");
    // IProject[] projects = root.getProjects();
    //
    // if (projects == null) {
    // LOG.error("Error opening workspace");
    // return;
    // }
    //
    // Vector<GoalsInFile> vectorGoals = new Vector<GoalsInFile>();
    //
    // for (int i = 0; i < projects.length; i++) {
    // IProject project = projects[i];
    //
    // if (!project.isOpen())
    // continue;
    //
    // IFolder folder = project.getFolder("behaviors");
    // if (folder == null)
    // continue;
    //
    // IResource[] projectFiles = null;
    // try {
    // projectFiles = folder.members();
    // } catch (CoreException e) {
    // LOG.error("Error in opening folder " + folder.getName());
    // e.printStackTrace();
    // }
    //
    // if (projectFiles == null)
    // continue;
    //
    // for (int j = 0; j < projectFiles.length; j++) {
    // /* IResource */resource = projectFiles[j];
    //
    // if (resource == null)
    // continue;
    //
    // /* Skip not zargo files */
    // if (!resource.getName().endsWith(".zargo"))
    // continue;
    //
    // /* Load the filename and the states from the file */
    // GoalsInFile g = new GoalsInFile(resource);
    // vectorGoals.add(g);
    // }
    //
    // }
    //
    // checkDependecies(vectorGoals);
    // }
    //
    // /* Check for each zargo file if there are services unimplemented */
    // private static void checkDependecies(Vector<GoalsInFile> vectorGoals) {
    //
    // notSatisfied = new Vector<String>();
    // /* Iterate over all the files */
    // for (int i = 0; i < vectorGoals.size(); i++) {
    // GoalsInFile g = vectorGoals.get(i);
    // /*
    // * Set of services that must be present in the workspace to avoid
    // * warnings
    // */
    // Vector<String> services = g.getGoals();
    // /*
    // * Remove the goal with the same name of the selflet This is the
    // * case when we are dealing with elementary behavior
    // */
    // services.remove(g.getFileNameWithoutExtension());
    //
    // for (int j = 0; j < vectorGoals.size(); j++) {
    // String filename = vectorGoals.get(j)
    // .getFileNameWithoutExtension();
    //
    // if (i != j)
    // if (!filename.equals("DefaultBehavior"))
    // if (services.contains(filename))
    // services.remove(filename);
    //
    // }
    //
    // /*
    // * Wait behavior is implemented by default
    // */
    // services.remove("wait");
    //
    // /* If some goal is not implemented then we must report a warning */
    // if (services.size() > 0)
    // for (String goal : services) {
    // try {
    // /* Create warnings */
    // IMarker m = g.getFile().createMarker(IMarker.PROBLEM);
    // m
    // .setAttribute(IMarker.MESSAGE, "Missing goal: "
    // + goal);
    // m.setAttribute(IMarker.TRANSIENT, true);
    // m.setAttribute(IMarker.LOCATION, "Selflet "
    // + g.getFile().getProject().getName());
    // addToMarkersVector(m);
    // } catch (CoreException e) {
    // e.printStackTrace();
    // }
    // }
    // }
    //
    // }
    //
    // /*
    // * Add the marker if it is not duplicated. A marker is identified by the
    // * message and the location
    // */
    // private static void addToMarkersVector(IMarker m) {
    // String msg2 = m.getAttribute(IMarker.MESSAGE, null);
    // String loc2 = m.getAttribute(IMarker.LOCATION, null);
    //
    // for (IMarker elem : markers) {
    // String msg1 = elem.getAttribute(IMarker.MESSAGE, null);
    // String loc1 = elem.getAttribute(IMarker.LOCATION, null);
    // if (msg1.equals(msg2) && loc1.equals(loc2))
    // return;
    // }
    // markers.add(m);
    // }
    //
    // public static void checkCondition(String body) {
    // }
}
