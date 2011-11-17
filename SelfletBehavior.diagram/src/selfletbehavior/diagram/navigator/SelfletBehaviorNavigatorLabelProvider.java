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
import selfletbehavior.diagram.edit.parts.ComplexEditPart;
import selfletbehavior.diagram.edit.parts.ComplexNameEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryNameEditPart;
import selfletbehavior.diagram.edit.parts.Final2EditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.Init2EditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.Intermediate2EditPart;
import selfletbehavior.diagram.edit.parts.IntermediateCallService2EditPart;
import selfletbehavior.diagram.edit.parts.IntermediateCallServiceEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.Invocation2EditPart;
import selfletbehavior.diagram.edit.parts.InvocationDoActivity2EditPart;
import selfletbehavior.diagram.edit.parts.InvocationDoActivityEditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.ServiceEditPart;
import selfletbehavior.diagram.edit.parts.ServiceNameEditPart;
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
		case InitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Init", SelfletBehaviorElementTypes.Init_3002); //$NON-NLS-1$
		case InvocationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Invocation", SelfletBehaviorElementTypes.Invocation_3003); //$NON-NLS-1$
		case Init2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Init", SelfletBehaviorElementTypes.Init_3007); //$NON-NLS-1$
		case StateNextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://selfletbehavior/1.0?State?next", SelfletBehaviorElementTypes.StateNext_4006); //$NON-NLS-1$
		case Invocation2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Invocation", SelfletBehaviorElementTypes.Invocation_3008); //$NON-NLS-1$
		case ComplexEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Complex", SelfletBehaviorElementTypes.Complex_3006); //$NON-NLS-1$
		case ElementaryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Elementary", SelfletBehaviorElementTypes.Elementary_3001); //$NON-NLS-1$
		case FinalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Final", SelfletBehaviorElementTypes.Final_3005); //$NON-NLS-1$
		case IntermediateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Intermediate", SelfletBehaviorElementTypes.Intermediate_3004); //$NON-NLS-1$
		case Intermediate2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Intermediate", SelfletBehaviorElementTypes.Intermediate_3009); //$NON-NLS-1$
		case Final2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://selfletbehavior/1.0?Final", SelfletBehaviorElementTypes.Final_3010); //$NON-NLS-1$
		case ServiceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://selfletbehavior/1.0?Service", SelfletBehaviorElementTypes.Service_2005); //$NON-NLS-1$
		case BehaviorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://selfletbehavior/1.0?Selflet", SelfletBehaviorElementTypes.Selflet_1000); //$NON-NLS-1$
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
		case InitEditPart.VISUAL_ID:
			return getInit_3002Text(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3003Text(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3007Text(view);
		case StateNextEditPart.VISUAL_ID:
			return getStateNext_4006Text(view);
		case Invocation2EditPart.VISUAL_ID:
			return getInvocation_3008Text(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006Text(view);
		case ElementaryEditPart.VISUAL_ID:
			return getElementary_3001Text(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3005Text(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3004Text(view);
		case Intermediate2EditPart.VISUAL_ID:
			return getIntermediate_3009Text(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3010Text(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2005Text(view);
		case BehaviorEditPart.VISUAL_ID:
			return getSelflet_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getInit_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInvocation_3003Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Invocation_3003,
				view.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(InvocationDoActivityEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInit_3007Text(View view) {
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
	private String getInvocation_3008Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Invocation_3008,
				view.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(InvocationDoActivity2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComplex_3006Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Complex_3006,
				view.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(ComplexNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getElementary_3001Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Elementary_3001,
				view.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(ElementaryNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFinal_3005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIntermediate_3004Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Intermediate_3004, view
						.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(IntermediateCallServiceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIntermediate_3009Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Intermediate_3009, view
						.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(IntermediateCallService2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFinal_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getService_2005Text(View view) {
		IParser parser = SelfletBehaviorParserProvider.getParser(
				SelfletBehaviorElementTypes.Service_2005,
				view.getElement() != null ? view.getElement() : view,
				SelfletBehaviorVisualIDRegistry
						.getType(ServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelflet_1000Text(View view) {
		return ""; //$NON-NLS-1$
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
