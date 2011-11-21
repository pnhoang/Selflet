package it.polimi.selfletclipse;

import java.io.InputStream;

import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

/**
 * @author Nicola
 */
public class ImagesManager {

	private static ImagesManager mg = null;

	public static Image GEARS;
	public static Image STATE_MACHINE;
	public static Image STATE;
	public static Image PROJECT;

	public static ImagesManager getInstance() {

		if (mg != null)
			return mg;

		mg = new ImagesManager();

		Display dis = Display.getCurrent();

		/*
		 * TODO
		 */

		final String path = "/it/polimi/selfletclipse/resources/img/";
		InputStream g;

		g = ImagesManager.class.getResourceAsStream(path + "releng_gears.gif");
		GEARS = new Image(dis, g);

		g = ImagesManager.class.getResourceAsStream(path + "StateMachine.gif");
		STATE_MACHINE = new Image(dis, g);

		g = ImagesManager.class.getResourceAsStream(path + "SynchState.gif");
		STATE = new Image(dis, g);

		PROJECT = PlatformUI.getWorkbench().getSharedImages().getImage(
				org.eclipse.ui.ide.IDE.SharedImages.IMG_OBJ_PROJECT);
		
		return mg;
	}

}
