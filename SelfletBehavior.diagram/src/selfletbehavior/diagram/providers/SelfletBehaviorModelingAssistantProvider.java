package selfletbehavior.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.ComplexComplexBehaviorsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryElementaryBehaviorsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.Final2EditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.Init2EditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.Intermediate2EditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.Invocation2EditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.ServiceEditPart;
import selfletbehavior.diagram.part.Messages;
import selfletbehavior.diagram.part.SelfletBehaviorDiagramEditorPlugin;

/**
 * @generated
 */
public class SelfletBehaviorModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof BehaviorEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(SelfletBehaviorElementTypes.Service_2005);
			return types;
		}
		if (editPart instanceof ServiceEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(SelfletBehaviorElementTypes.Elementary_3001);
			types.add(SelfletBehaviorElementTypes.Complex_3006);
			return types;
		}
		if (editPart instanceof ElementaryElementaryBehaviorsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(SelfletBehaviorElementTypes.Init_3002);
			types.add(SelfletBehaviorElementTypes.Invocation_3003);
			types.add(SelfletBehaviorElementTypes.Intermediate_3004);
			types.add(SelfletBehaviorElementTypes.Final_3005);
			return types;
		}
		if (editPart instanceof ComplexComplexBehaviorsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(SelfletBehaviorElementTypes.Init_3007);
			types.add(SelfletBehaviorElementTypes.Invocation_3008);
			types.add(SelfletBehaviorElementTypes.Intermediate_3009);
			types.add(SelfletBehaviorElementTypes.Final_3010);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InitEditPart) {
			return ((InitEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InvocationEditPart) {
			return ((InvocationEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IntermediateEditPart) {
			return ((IntermediateEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FinalEditPart) {
			return ((FinalEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Init2EditPart) {
			return ((Init2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Invocation2EditPart) {
			return ((Invocation2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Intermediate2EditPart) {
			return ((Intermediate2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Final2EditPart) {
			return ((Final2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InitEditPart) {
			return ((InitEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InvocationEditPart) {
			return ((InvocationEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IntermediateEditPart) {
			return ((IntermediateEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FinalEditPart) {
			return ((FinalEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Init2EditPart) {
			return ((Init2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Invocation2EditPart) {
			return ((Invocation2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Intermediate2EditPart) {
			return ((Intermediate2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Final2EditPart) {
			return ((Final2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InitEditPart) {
			return ((InitEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InvocationEditPart) {
			return ((InvocationEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IntermediateEditPart) {
			return ((IntermediateEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FinalEditPart) {
			return ((FinalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Init2EditPart) {
			return ((Init2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Invocation2EditPart) {
			return ((Invocation2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Intermediate2EditPart) {
			return ((Intermediate2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Final2EditPart) {
			return ((Final2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InitEditPart) {
			return ((InitEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InvocationEditPart) {
			return ((InvocationEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IntermediateEditPart) {
			return ((IntermediateEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FinalEditPart) {
			return ((FinalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Init2EditPart) {
			return ((Init2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Invocation2EditPart) {
			return ((Invocation2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Intermediate2EditPart) {
			return ((Intermediate2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Final2EditPart) {
			return ((Final2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InitEditPart) {
			return ((InitEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InvocationEditPart) {
			return ((InvocationEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IntermediateEditPart) {
			return ((IntermediateEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FinalEditPart) {
			return ((FinalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Init2EditPart) {
			return ((Init2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Invocation2EditPart) {
			return ((Invocation2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Intermediate2EditPart) {
			return ((Intermediate2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Final2EditPart) {
			return ((Final2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				SelfletBehaviorDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.SelfletBehaviorModelingAssistantProviderMessage);
		dialog.setTitle(Messages.SelfletBehaviorModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
