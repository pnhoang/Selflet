package it.polimi.selfletclipse.markers;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.exceptions.EvaluationException;
import it.polimi.selfletclipse.util.SelfletXmlParser;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

public class SelfLetManifestValidator {

    private static String MANIFEST_FILE = "selflet.xml";

    /**
     * Receive the entire root resource delta tree. Its children are project
     * resources. We are interested in children of projects.
     * */
    public void checkDelta(IResourceDelta rootDelta) {

	if (rootDelta == null)
	    return;

	IResourceDelta[] projectsAffected = rootDelta.getAffectedChildren();

	checkProjectsDelta(projectsAffected);

    }

    private void checkProjectsDelta(IResourceDelta[] projectAffected) {

	for (int i = 0; i < projectAffected.length; i++) {

	    IResourceDelta[] projectChildrenAffected = projectAffected[i]
		    .getAffectedChildren();

	    checkProjectChildrenDelta(projectChildrenAffected);
	}
    }

    private void checkProjectChildrenDelta(
	    IResourceDelta[] projectChildrenAffected) {

	for (int i = 0; i < projectChildrenAffected.length; i++) {
	    checkResourceDelta(projectChildrenAffected[i]);
	}
    }

    private void checkResourceDelta(IResourceDelta resourceDelta) {

	/* Ignore marker deltas */
	if ((resourceDelta.getFlags() & IResourceDelta.MARKERS) == IResourceDelta.MARKERS)
	    return;

	IPath resourcePath = resourceDelta.getFullPath();
	String resourcePathString = resourcePath.toString().toLowerCase();

	IResource projectResource = resourceDelta.getResource().getProject();

	boolean deleteOnlyMarkers = false;

	if (resourcePathString.endsWith(MANIFEST_FILE)) {

	    int kindOfChange = resourceDelta.getKind();

	    switch (kindOfChange) {

	    case IResourceDelta.ADDED:

		deleteOnlyMarkers = true;
		updateMarkers(projectResource,
			MarkerOperation.MISSING_MANIFEST_FILE_MESSAGE,
			deleteOnlyMarkers);

		checkManifestCorrectness(resourceDelta);
		break;

	    case IResourceDelta.REMOVED:

		deleteOnlyMarkers = false;

		updateMarkers(projectResource,
			MarkerOperation.MISSING_MANIFEST_FILE_MESSAGE,
			deleteOnlyMarkers);

		break;

	    case IResourceDelta.CHANGED:
		checkManifestCorrectness(resourceDelta);
		break;

	    }
	}
    }

    private void checkManifestCorrectness(IResourceDelta manifestDelta) {

	IResource manifestResource = manifestDelta.getResource();
	String manifestLocation = manifestResource.getLocation().toString();

	try {
	    new SelfletXmlParser(manifestLocation);

	    boolean deleteOnlyMarkers = true;
	    updateMarkers(manifestResource, "", deleteOnlyMarkers);

	} catch (EvaluationException e) {

	    String message = e.getMessage();

	    boolean deleteOnlyMarkers = false;
	    updateMarkers(manifestResource, message, deleteOnlyMarkers);
	}

    }

    // TODO refactor this??
    private void updateMarkers(IResource resource, String message,
	    boolean kindOfUpdate) {

	final MarkerJob markerJob = new MarkerJob(resource, message,
		MarkerOperation.MANIFEST_INVALID, kindOfUpdate);

	/* Set the scheduling rule which locks the entire root */
	markerJob.setRule(SelfLetPlugin.root);

	/* Add the listener that will kill the job when finished */

	JobChangeListenerForMarkers jobListener = new JobChangeListenerForMarkers(
		markerJob);

	markerJob.addJobChangeListener(jobListener);

	/* Job not visible to the user & Start the job */
	markerJob.setSystem(true);
	markerJob.schedule();
    }

    /**
     * Inner Class
     * 
     * Listener for job changes
     * */
    private class JobChangeListenerForMarkers extends JobChangeAdapter {
	private MarkerJob markerJob;

	public JobChangeListenerForMarkers(MarkerJob markerJob) {
	    this.markerJob = markerJob;
	}

	public void done(IJobChangeEvent event) {

	    IStatus exit = event.getResult();

	    // if (exit.isOK()) {
	    markerJob.cancel();
	    super.done(event);
	    // }
	}
    }

} // close class SelfletXmlError

