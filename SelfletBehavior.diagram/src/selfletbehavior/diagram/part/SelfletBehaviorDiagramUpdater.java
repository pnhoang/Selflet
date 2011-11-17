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
import selfletbehavior.Complex;
import selfletbehavior.Elementary;
import selfletbehavior.Final;
import selfletbehavior.Init;
import selfletbehavior.Intermediate;
import selfletbehavior.Invocation;
import selfletbehavior.Selflet;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.Service;
import selfletbehavior.State;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.ComplexComplexBehaviorsCompartmentEditPart;
import selfletbehavior.diagram.edit.parts.ComplexEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryEditPart;
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
import selfletbehavior.diagram.edit.parts.ServiceServicesCompartmentEditPart;
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
			return getSelflet_1000SemanticChildren(view);
		case ServiceServicesCompartmentEditPart.VISUAL_ID:
			return getServiceServicesCompartment_7001SemanticChildren(view);
		case ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID:
			return getElementaryElementaryBehaviorsCompartment_7002SemanticChildren(view);
		case ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID:
			return getComplexComplexBehaviorsCompartment_7003SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
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
			if (visualID == IntermediateEditPart.VISUAL_ID) {
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
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			State childElement = (State) it.next();
			int visualID = SelfletBehaviorVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == Init2EditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Invocation2EditPart.VISUAL_ID) {
				result.add(new SelfletBehaviorNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == Intermediate2EditPart.VISUAL_ID) {
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
			return getInit_3002ContainedLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3003ContainedLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3004ContainedLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3005ContainedLinks(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006ContainedLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3007ContainedLinks(view);
		case Invocation2EditPart.VISUAL_ID:
			return getInvocation_3008ContainedLinks(view);
		case Intermediate2EditPart.VISUAL_ID:
			return getIntermediate_3009ContainedLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3010ContainedLinks(view);
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
			return getInit_3002IncomingLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3003IncomingLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3004IncomingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3005IncomingLinks(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006IncomingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3007IncomingLinks(view);
		case Invocation2EditPart.VISUAL_ID:
			return getInvocation_3008IncomingLinks(view);
		case Intermediate2EditPart.VISUAL_ID:
			return getIntermediate_3009IncomingLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3010IncomingLinks(view);
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
			return getInit_3002OutgoingLinks(view);
		case InvocationEditPart.VISUAL_ID:
			return getInvocation_3003OutgoingLinks(view);
		case IntermediateEditPart.VISUAL_ID:
			return getIntermediate_3004OutgoingLinks(view);
		case FinalEditPart.VISUAL_ID:
			return getFinal_3005OutgoingLinks(view);
		case ComplexEditPart.VISUAL_ID:
			return getComplex_3006OutgoingLinks(view);
		case Init2EditPart.VISUAL_ID:
			return getInit_3007OutgoingLinks(view);
		case Invocation2EditPart.VISUAL_ID:
			return getInvocation_3008OutgoingLinks(view);
		case Intermediate2EditPart.VISUAL_ID:
			return getIntermediate_3009OutgoingLinks(view);
		case Final2EditPart.VISUAL_ID:
			return getFinal_3010OutgoingLinks(view);
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
	public static List<SelfletBehaviorLinkDescriptor> getInit_3002ContainedLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3003ContainedLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3004ContainedLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3005ContainedLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
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
	public static List<SelfletBehaviorLinkDescriptor> getInit_3007ContainedLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3008ContainedLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3009ContainedLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3010ContainedLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
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
	public static List<SelfletBehaviorLinkDescriptor> getInit_3002IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3003IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3004IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3005IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getComplex_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInit_3007IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3008IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3009IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3010IncomingLinks(
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
	public static List<SelfletBehaviorLinkDescriptor> getInit_3002OutgoingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3003OutgoingLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3004OutgoingLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3005OutgoingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
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
	public static List<SelfletBehaviorLinkDescriptor> getInit_3007OutgoingLinks(
			View view) {
		Init modelElement = (Init) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getInvocation_3008OutgoingLinks(
			View view) {
		Invocation modelElement = (Invocation) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getIntermediate_3009OutgoingLinks(
			View view) {
		Intermediate modelElement = (Intermediate) view.getElement();
		LinkedList<SelfletBehaviorLinkDescriptor> result = new LinkedList<SelfletBehaviorLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_State_Next_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SelfletBehaviorLinkDescriptor> getFinal_3010OutgoingLinks(
			View view) {
		Final modelElement = (Final) view.getElement();
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
