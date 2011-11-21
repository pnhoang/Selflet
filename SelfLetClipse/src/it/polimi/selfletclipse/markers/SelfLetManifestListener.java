package it.polimi.selfletclipse.markers;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;

public class SelfLetManifestListener implements IResourceChangeListener {

    private SelfLetManifestValidator selfletXmlError = new SelfLetManifestValidator();

    public void resourceChanged(IResourceChangeEvent event) {

	IResourceDelta resourceDelta = event.getDelta();

	switch (event.getType()) {

	case IResourceChangeEvent.POST_CHANGE:
	    selfletXmlError.checkDelta(resourceDelta);
	    break;

	default:
	    break;

	}
    }
}
