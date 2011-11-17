package selfletbehavior.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import selfletbehavior.Behavior;
import selfletbehavior.Selflet;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.ComplexComplexBehaviorsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.ComplexEditPart;
import selfletbehavior.diagram.edit.parts.ComplexNameEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryElementaryBehaviorsCompartmentEditPart;
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
import selfletbehavior.diagram.edit.parts.ServiceDescriptionEditPart;
import selfletbehavior.diagram.edit.parts.ServiceEditPart;
import selfletbehavior.diagram.edit.parts.ServiceNameEditPart;
import selfletbehavior.diagram.edit.parts.ServiceServicesCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SelfletBehaviorVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "SelfletBehavior.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (BehaviorEditPart.MODEL_ID.equals(view.getType())) {
				return BehaviorEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SelfletbehaviorPackage.eINSTANCE.getSelflet().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Selflet) domainElement)) {
			return BehaviorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry
				.getModelID(containerView);
		if (!BehaviorEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (BehaviorEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BehaviorEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case BehaviorEditPart.VISUAL_ID:
			if (SelfletbehaviorPackage.eINSTANCE.getService().isSuperTypeOf(
					domainElement.eClass())) {
				return ServiceEditPart.VISUAL_ID;
			}
			break;
		case ServiceServicesCompartmentEditPart.VISUAL_ID:
			if (SelfletbehaviorPackage.eINSTANCE.getElementary().isSuperTypeOf(
					domainElement.eClass())) {
				return ElementaryEditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getComplex().isSuperTypeOf(
					domainElement.eClass())) {
				return ComplexEditPart.VISUAL_ID;
			}
			break;
		case ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID:
			if (SelfletbehaviorPackage.eINSTANCE.getInit().isSuperTypeOf(
					domainElement.eClass())) {
				return InitEditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getInvocation().isSuperTypeOf(
					domainElement.eClass())) {
				return InvocationEditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getIntermediate()
					.isSuperTypeOf(domainElement.eClass())) {
				return IntermediateEditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getFinal().isSuperTypeOf(
					domainElement.eClass())) {
				return FinalEditPart.VISUAL_ID;
			}
			break;
		case ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID:
			if (SelfletbehaviorPackage.eINSTANCE.getInit().isSuperTypeOf(
					domainElement.eClass())) {
				return Init2EditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getInvocation().isSuperTypeOf(
					domainElement.eClass())) {
				return Invocation2EditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getIntermediate()
					.isSuperTypeOf(domainElement.eClass())) {
				return Intermediate2EditPart.VISUAL_ID;
			}
			if (SelfletbehaviorPackage.eINSTANCE.getFinal().isSuperTypeOf(
					domainElement.eClass())) {
				return Final2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry
				.getModelID(containerView);
		if (!BehaviorEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (BehaviorEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = BehaviorEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case BehaviorEditPart.VISUAL_ID:
			if (ServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceEditPart.VISUAL_ID:
			if (ServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ServiceServicesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementaryEditPart.VISUAL_ID:
			if (ElementaryNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InvocationEditPart.VISUAL_ID:
			if (InvocationDoActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IntermediateEditPart.VISUAL_ID:
			if (IntermediateCallServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexEditPart.VISUAL_ID:
			if (ComplexNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Invocation2EditPart.VISUAL_ID:
			if (InvocationDoActivity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Intermediate2EditPart.VISUAL_ID:
			if (IntermediateCallService2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ServiceServicesCompartmentEditPart.VISUAL_ID:
			if (ElementaryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComplexEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID:
			if (InitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InvocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntermediateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID:
			if (Init2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Invocation2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Intermediate2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Final2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Selflet element) {
		return true;
	}

}
