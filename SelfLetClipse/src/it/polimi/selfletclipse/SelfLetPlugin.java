package it.polimi.selfletclipse;

import it.polimi.selfletclipse.markers.MarkersManager;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

/**
 * @author Nicola
 */

public class SelfLetPlugin {

	private static final Logger LOG = Logger.getLogger(SelfLetPlugin.class);

	private static boolean initialized = false;
	private static MarkersManager markersManager = null;
	
	public static IWorkspace workspace = null;

	public static IWorkspaceRoot root = null;

	private static WorkspaceManager workspaceManager = null;

	private static ImagesManager imagesManager = null;

	private static ViewManager viewManager;

	private static SelfLetProjectManager selfletProjectManager;

	/**
	 * This is the main initialization function for the entire plugin. It must
	 * be called before any operation is performed (e.g. before any wizard).
	 */
	public static synchronized void Init() {

		if (initialized)
			return;

		initialized = true;

		workspace = ResourcesPlugin.getWorkspace();
		root = workspace.getRoot();

		LOG.debug("Loading images manager");
		imagesManager = ImagesManager.getInstance();

		LOG.debug("Loading Selflet project manager");
		selfletProjectManager = SelfLetProjectManager.getInstance();

		LOG.debug("Loading workspace manager");
		workspaceManager = WorkspaceManager.getInstance();

		LOG.debug("Loading view manager");
		viewManager = ViewManager.getInstance();

		LOG.debug("Loading markers manager");
		markersManager = MarkersManager.getInstance();


	}

	public static MarkersManager getMarkersManager() {
		return markersManager;
	}

	public static WorkspaceManager getWorkspaceManager() {
		return workspaceManager;
	}

	public static ImagesManager getImagesManager() {
		return imagesManager;
	}

	public static ViewManager getViewManager() {
		return viewManager;
	}

	public static SelfLetProjectManager getSelfletProjectManager() {
		return selfletProjectManager;
	}

}
