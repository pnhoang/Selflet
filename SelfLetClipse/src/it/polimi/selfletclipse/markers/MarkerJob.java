package it.polimi.selfletclipse.markers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class MarkerJob extends Job {

    private IResource resource;
    private String message;
    private String markerType;
    private boolean onlyDeleteOperation;

    private static String jobName = "Marker";

    public MarkerJob(IResource manifestResource, String message,
	    String markerType, boolean onlyDeleteOperation) {

	super(jobName);
	this.resource = manifestResource;
	this.message = message;
	this.markerType = markerType;
	this.onlyDeleteOperation = onlyDeleteOperation;
    }

    @SuppressWarnings("finally")
    @Override
    protected IStatus run(IProgressMonitor monitor) {
	try {

	    MarkerOperation marker = new MarkerOperation(resource, message,
		    markerType, onlyDeleteOperation);
	    marker.run(null);

	    return Status.OK_STATUS;

	} catch (InvocationTargetException e) {
	} catch (InterruptedException e) {

	} finally {
	    return Status.CANCEL_STATUS;
	}

    }

}
