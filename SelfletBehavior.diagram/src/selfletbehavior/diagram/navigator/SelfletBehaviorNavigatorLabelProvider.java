package selfletbehavior.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import selfletbehavior.Behavior;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateCallServiceEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.InvocationDoActivityEditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.StateNextEditPart;
import selfletbehavior.diagram.part.SelfletBehaviorDiagramEditorPlugin;
import selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;
import selfletbehavior.diagram.providers.SelfletBehaviorParserProvider;

/**
 * @generated
 */
public class SelfletBehaviorNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SelfletBehaviorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SelfletBehaviorDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SelfletBehaviorNavigatorItem
				&& !isOwnView(((SelfletBehaviorNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SelfletBehaviorNavigatorGroup) {
			SelfletBehaviorNavigatorGroup group = (SelfletBehaviorNavigatorGroup) element;
			return SelfletBehaviorDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof SelfletBehaviorNavigatorItem) {
			SelfletBehaviorNavigatorItem navigatorItem = (SelfletBehaviorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case FinalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://selfletbehavior/1.0?Final", SelfletBehaviorElementTypes.Final_2003); //$NON-NLS-1$
		case InitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://selfletbehavior/1.0?Init", SelfletBehaviorElementTypes.Init_2002); //$NON-NLS-1$
		case InvocationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://selfletbehavior/1.0?Invocation", SelfletBehaviorElementTypes.Invocation_2004); //$NON-NLS-1$
		case BehaviorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://selfletbehavior/1.0?Behavior", SelfletBehaviorElementTypes.Behavior_1000); //$NON-NLS-1$
		case StateNextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://selfletbehavior/1.0?State?next", SelfletBehaviorElementTypes.StateNext_4006); //$NON-NLS-1$
		case IntermediateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://selfletbehavior/1.0?Intermediate", SelfletBehaviorElementTypes.Intermediate_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SelfletBehaviorDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SelfletBehaviorElementTypes.isKnownElementType(elementType)) {
			image = SelfletBehaviorElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SelfletBehaviorNavigatorGroup) {
			SelfletBehaviorNavigatorGroup group = (SelfletBehaviorNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SelfletBehaviorNavigatorItem) {
			SelfletBehaviorNavigatorItem navigatorItem = (SelfletBehaviorNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case FinalEditPart.VISUAL_ID:
			return getFinal_2003Text(view);
		case InitEditPart.VISUAL_ID:
			return getInit_2002Text(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_2004Text(view);
		case BehaviorEditPart.VISUAL_ID:
			return getBehavior_1000Text(view);
		case StateNextEditPart.VISUAL_ID:
			return getStateNext_4006Text(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getBehavior_1000Text(View view) {
		Behavior domainModelElement = (Behavior) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInit_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFinal_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStateNext_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIntermediate_2001Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Intermediate_2001, view
						.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(IntermediateCallServiceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInvocation_2004Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Invocation_2004,
				view.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(InvocationDoActivityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return BehaviorEditPart.MODEL_ID.equals(SelfletBehaviorVisualIDRegistry
				.getModelID(view));
	}

}
