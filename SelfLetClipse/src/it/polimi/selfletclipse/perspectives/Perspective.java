package it.polimi.selfletclipse.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @author Nicola
 */
public class Perspective implements IPerspectiveFactory {

    private IPageLayout layout;

    public void createInitialLayout(IPageLayout layout) {
	this.layout = layout;

	addViews();
    }

    @SuppressWarnings("unused")
    private void addViews() {
	String editor = layout.getEditorArea();

	/* Add resource view on the left */
	IFolderLayout left = layout.createFolder("main.left", IPageLayout.LEFT,
		0.15f, editor);

	left.addView(IPageLayout.ID_RES_NAV);

	/* Add problem view on the left */
	IFolderLayout bottom_center = layout.createFolder("bottom.center",
		IPageLayout.BOTTOM, 0.75f, editor);

	bottom_center.addView(IPageLayout.ID_PROBLEM_VIEW);

	/* Add SelfLet Structure view on the left */

	IFolderLayout right = layout.createFolder("main.right",
		IPageLayout.RIGHT, 0.6f, editor);

	IFolderLayout rightTop = layout.createFolder("main.rightTop",
		IPageLayout.TOP, 0.3f, "main.right");

	IFolderLayout rightBottom = layout.createFolder("main.rightBottom",
		IPageLayout.BOTTOM, 0.7f, "main.right");

	rightTop.addView("SelfLetClipse.ViewArcCondition");
	rightBottom.addView(IPageLayout.ID_OUTLINE);

    }
}
