package it.polimi.selfletclipse.markers;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

public class MarkerOperation extends WorkspaceModifyOperation {

    public static String ERROR_TYPE = "error_type";

    public static String MANIFEST_INVALID = "invalid_manifest";
    public static String MISSING_MANIFEST_FILE_MESSAGE = "Missing Selflet.xml";

    private IResource resource;
    private String message;
    private String markerType;
    private boolean onlyDeleteOperation;

    public MarkerOperation(IResource resource, String message,
	    String markerType, boolean onlyDeleteOperation) {

	this.resource = resource;
	this.message = message;
	this.markerType = markerType;
	this.onlyDeleteOperation = onlyDeleteOperation;
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException {

	if (!resource.exists())
	    return;

	deletePreviousMarkers();

	if (onlyDeleteOperation)
	    return;

	createMarker();

    }

    private void createMarker() throws CoreException {
	IMarker marker = resource.createMarker(IMarker.PROBLEM);

	/* Set the attributes */
	marker.setAttribute(IMarker.MESSAGE, message);
	marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
	marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
	marker.setAttribute(ERROR_TYPE, MANIFEST_INVALID);

    }

    /**
     * Deletes all the markers of the same type of markerType
     * */
    private void deletePreviousMarkers() throws CoreException {

	IMarker[] markers = resource.findMarkers(IMarker.PROBLEM, false,
		IResource.DEPTH_INFINITE);

	for (int i = 0; i < markers.length; i++) {
	    Object errorTypeObject = markers[i].getAttribute(ERROR_TYPE);

	    if (!(errorTypeObject instanceof String))
		continue;

	    String errorType = (String) errorTypeObject;

	    if (errorType.equals(markerType))
		markers[i].delete();
	}
    }
}
