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

import selfletbehavior.Action;
import selfletbehavior.Behavior;
import selfletbehavior.Complex;
import selfletbehavior.Condition;
import selfletbehavior.Elementary;
import selfletbehavior.Final;
import selfletbehavior.Init;
import selfletbehavior.Intermediate;
import selfletbehavior.Invocation;
import selfletbehavior.Selflet;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.Service;
import selfletbehavior.State;
import selfletbehavior.diagram.edit.parts.Action2EditPart;
import selfletbehavior.diagram.edit.parts.ActionEditPart;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.ComplexComplexBehaviorsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.ComplexEditPart;
import selfletbehavior.diagram.edit.parts.ConditionEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryElementaryBehaviorsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.Final2EditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.Init2EditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateSharedActionsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.InvocationSharedActionsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.ServiceEditPart;
import selfletbehavior.diagram.edit.parts.ServiceServicesCompartmentEditPart;
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
			return getSelflet_1000SemanticChildren(view);
		case ServiceServicesCompartmentEditPart.VISUAL_ID:
			return getServiceServicesCompartment_7001SemanticChildren(view);
		case ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID:
			return getElementaryElementaryBehaviorsCompartment_7002SemanticChildren(view);
		case InvocationSharedActionsCompartmentEditPart.VISUAL_ID:
			return getInvocationSharedActionsCompartment_7004SemanticChildren(view);
		case ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID:
			return getComplexComplexBehaviorsCompartment_7003SemanticChildren(view);
		case IntermediateSharedActionsCompartmentEditPart.VISUAL_ID:
			return getIntermediateSharedActionsCompartment_7005SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorNodeDescriptor> getSelflet_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Selflet modelElement = (Selflet) view.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getService().iterator(); it
				.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
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
	public static List<SelfletBehaviorNodeDescriptor> getServiceServicesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Service modelElement = (Service) containerView.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBehavior().iterator(); it
				.hasNext();) {
			Behavior childElement = (Behavior) it.next();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ElementaryEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == ComplexEditPart.VISUAL_ID) {
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
	public static List<SelfletBehaviorNodeDescriptor> getElementaryElementaryBehaviorsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Elementary modelElement = (Elementary) containerView.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == InitEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == InvocationEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == FinalEditPart.VISUAL_ID) {
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
	public static List<SelfletBehaviorNodeDescriptor> getInvocationSharedActionsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Invocation modelElement = (Invocation) containerView.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		{
			Action childElement = modelElement.getAction();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ActionEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorNodeDescriptor> getComplexComplexBehaviorsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Complex modelElement = (Complex) containerView.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		for (Iterator<?> it = modelElement.getState().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == Init2EditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == IntermediateEditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Final2EditPart.VISUAL_ID) {
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
	public static List<SelfletBehaviorNodeDescriptor> getIntermediateSharedActionsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Intermediate modelElement = (Intermediate) containerView.getElement();
		LinkedList<SelfletBehaviorNodeDescriptor> result = new LinkedList<SelfletBehaviorNodeDescriptor>();
		{
			Action childElement = modelElement.getAction();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == Action2EditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
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
			return getSelflet_1000ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2005ContainedLinks(view);
		case ElementaryEditPart.VISUAL_ID:
			return getElementary_3001ContainedLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3011ContainedLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3012ContainedLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3013ContainedLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3014ContainedLinks(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006ContainedLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3015ContainedLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3016ContainedLinks(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3017ContainedLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3018ContainedLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_4007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIncomingLinks(View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case ServiceEditPart.VISUAL_ID:
			return getService_2005IncomingLinks(view);
		case ElementaryEditPart.VISUAL_ID:
			return getElementary_3001IncomingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3011IncomingLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3012IncomingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3013IncomingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3014IncomingLinks(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006IncomingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3015IncomingLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3016IncomingLinks(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3017IncomingLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3018IncomingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_4007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getOutgoingLinks(View view) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {
		case ServiceEditPart.VISUAL_ID:
			return getService_2005OutgoingLinks(view);
		case ElementaryEditPart.VISUAL_ID:
			return getElementary_3001OutgoingLinks(view);
		case InitEditPart.VISUAL_ID:
			return getInit_3011OutgoingLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3012OutgoingLinks(view);
		case ActionEditPart.VISUAL_ID:
			return getAction_3013OutgoingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3014OutgoingLinks(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006OutgoingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3015OutgoingLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3016OutgoingLinks(view);
		case Action2EditPart.VISUAL_ID:
			return getAction_3017OutgoingLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3018OutgoingLinks(view);
		case ConditionEditPart.VISUAL_ID:
			return getCondition_4007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getSelflet_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getService_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getElementary_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3011ContainedLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3012ContainedLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getAction_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3014ContainedLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getComplex_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3015ContainedLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3016ContainedLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getAction_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3018ContainedLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getCondition_4007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getService_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getElementary_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3011IncomingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Condition_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3012IncomingLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Condition_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getAction_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3014IncomingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Condition_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getComplex_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3015IncomingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Condition_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3016IncomingLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Condition_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getAction_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3018IncomingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Condition_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getCondition_4007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getService_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getElementary_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3011OutgoingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3012OutgoingLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getAction_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3014OutgoingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getComplex_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3015OutgoingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3016OutgoingLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getAction_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3018OutgoingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Condition_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getCondition_4007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SelfletBehaviorLinkDescriptor> getContainedTypeModelFacetLinks_Condition_4007(
			State container) {
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		for (Iterator<?> links = container.getNext().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Condition) {
				continue;
			}
			Condition link = (Condition) linkObject;
			if (ConditionEditPart.VISUAL_ID != SelfletBehaviorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			State dst = link.getTargetState();
			result.add(new SelfletBehaviorLinkDescriptor(container, dst, link,
					SelfletBehaviorElementTypes.Condition_4007,
					ConditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SelfletBehaviorLinkDescriptor> getIncomingTypeModelFacetLinks_Condition_4007(
			State target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SelfletbehaviorPackage.eINSTANCE
					.getCondition_TargetState()
					|| false == setting.getEObject() instanceof Condition) {
				continue;
			}
			Condition link = (Condition) setting.getEObject();
			if (ConditionEditPart.VISUAL_ID != SelfletBehaviorVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof State) {
				continue;
			}
			State container = (State) link.eContainer();
			result.add(new SelfletBehaviorLinkDescriptor(container, target,
					link, SelfletBehaviorElementTypes.Condition_4007,
					ConditionEditPart.VISUAL_ID));

		}
		return result;
	}

}
