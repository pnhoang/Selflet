package selfletbehavior.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import selfletbehavior.diagram.part.Messages;
import selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry;

/**
 * @generated
 */
public class SelfletBehaviorNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public SelfletBehaviorNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<SelfletBehaviorNavigatorItem> result = new ArrayList<SelfletBehaviorNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, BehaviorEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof SelfletBehaviorNavigatorGroup) {
			SelfletBehaviorNavigatorGroup group = (SelfletBehaviorNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof SelfletBehaviorNavigatorItem) {
			SelfletBehaviorNavigatorItem navigatorItem = (SelfletBehaviorNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {

		case Final2EditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			SelfletBehaviorNavigatorGroup incominglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Final_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup outgoinglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Final_3018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ServiceEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ServiceServicesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(ElementaryEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ServiceServicesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(ComplexEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ElementaryEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(InitEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(InvocationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(FinalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ConditionEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SelfletBehaviorNavigatorGroup target = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Condition_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup source = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Condition_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(InitEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(InvocationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(FinalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(Init2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(IntermediateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(Final2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(InitEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(InvocationEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(FinalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(Init2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(IntermediateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(Final2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ComplexEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(Init2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(IntermediateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(Final2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case InvocationEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			SelfletBehaviorNavigatorGroup incominglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Invocation_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup outgoinglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Invocation_3012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(InvocationSharedActionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(ActionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InitEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			SelfletBehaviorNavigatorGroup incominglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Init_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup outgoinglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Init_3011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case BehaviorEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			SelfletBehaviorNavigatorGroup links = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Selflet_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ServiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case IntermediateEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			SelfletBehaviorNavigatorGroup incominglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Intermediate_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup outgoinglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Intermediate_3016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(IntermediateSharedActionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					SelfletBehaviorVisualIDRegistry
							.getType(Action2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FinalEditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			SelfletBehaviorNavigatorGroup incominglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Final_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup outgoinglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Final_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Init2EditPart.VISUAL_ID: {
			LinkedList<SelfletBehaviorAbstractNavigatorItem> result = new LinkedList<SelfletBehaviorAbstractNavigatorItem>();
			Node sv = (Node) view;
			SelfletBehaviorNavigatorGroup incominglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Init_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SelfletBehaviorNavigatorGroup outgoinglinks = new SelfletBehaviorNavigatorGroup(
					Messages.NavigatorGroupName_Init_3015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					SelfletBehaviorVisualIDRegistry
							.getType(ConditionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return BehaviorEditPart.MODEL_ID.equals(SelfletBehaviorVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<SelfletBehaviorNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<SelfletBehaviorNavigatorItem> result = new ArrayList<SelfletBehaviorNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new SelfletBehaviorNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof SelfletBehaviorAbstractNavigatorItem) {
			SelfletBehaviorAbstractNavigatorItem abstractNavigatorItem = (SelfletBehaviorAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
