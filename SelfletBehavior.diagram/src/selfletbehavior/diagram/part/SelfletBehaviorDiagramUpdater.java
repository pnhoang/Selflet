package selfletbehavior.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import selfletbehavior.Behavior;
import selfletbehavior.Final;
import selfletbehavior.Init;
import selfletbehavior.Intermediate;
import selfletbehavior.Invocation;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.State;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.StateNextEditPart;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class SelfletBehaviorDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorNodeDescriptor> getSemanticChildren(
			View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case BehaviorEditPart.VISUAL_ID:
			return getBehavior_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorNodeDescriptor> getBehavior_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Behavior modelElement = (Behavior) view.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == IntermediateEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == InitEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == FinalEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == InvocationEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getContainedLinks(
			View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case BehaviorEditPart.VISUAL_ID:
			return getBehavior_1000ContainedLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_2001ContainedLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_2002ContainedLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2003ContainedLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIncomingLinks(View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_2001IncomingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_2002IncomingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2003IncomingLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getOutgoingLinks(View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_2001OutgoingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_2002OutgoingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_2003OutgoingLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_2004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getBehavior_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_2001ContainedLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_2002ContainedLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_2003ContainedLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_2004ContainedLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_2001IncomingLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_State_Next_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_2002IncomingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_State_Next_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_2003IncomingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_State_Next_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_2004IncomingLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_State_Next_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_2001OutgoingLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_2002OutgoingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_2003OutgoingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_2004OutgoingLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SelfletBehaviorLinkDescriptor> getIncomingFeatureModelFacetLinks_State_Next_4006(
			State target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SelfletbehaviorPackage.eINSTANCE
					.getState_Next()) {
				result.add(new SelfletBehaviorLinkDescriptor(setting
						.getEObject(), target,
						SelfletBehaviorElementTypes.StateNext_4006,
						StateNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SelfletBehaviorLinkDescriptor> getOutgoingFeatureModelFacetLinks_State_Next_4006(
			State source) {
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		for (Iterator<?> destinations = source.getNext().iterator(); destinations
				.hasNext();) {
			State destination = (State) destinations.next();
			result.add(new SelfletBehaviorLinkDescriptor(source, destination,
					SelfletBehaviorElementTypes.StateNext_4006,
					StateNextEditPart.VISUAL_ID));
		}
		return result;
	}

}
