package selfletbehavior.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry;

/**
 * @generated
 */
public class SelfletBehaviorNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SelfletBehaviorNavigatorItem) {
			SelfletBehaviorNavigatorItem item = (SelfletBehaviorNavigatorItem) element;
			return SelfletBehaviorVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
