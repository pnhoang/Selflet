package selfletbehavior.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.StateNextEditPart;
import selfletbehavior.diagram.part.SelfletBehaviorDiagramEditorPlugin;

/**
 * @generated
 */
public class SelfletBehaviorElementTypes {

	/**
	 * @generated
	 */
	private SelfletBehaviorElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Behavior_1000 = getElementType("SelfletBehavior.diagram.Behavior_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Intermediate_2001 = getElementType("SelfletBehavior.diagram.Intermediate_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Init_2002 = getElementType("SelfletBehavior.diagram.Init_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Final_2003 = getElementType("SelfletBehavior.diagram.Final_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invocation_2004 = getElementType("SelfletBehavior.diagram.Invocation_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType StateNext_4006 = getElementType("SelfletBehavior.diagram.StateNext_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SelfletBehaviorDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Behavior_1000,
					SelfletbehaviorPackage.eINSTANCE.getBehavior());

			elements.put(Intermediate_2001,
					SelfletbehaviorPackage.eINSTANCE.getIntermediate());

			elements.put(Init_2002, SelfletbehaviorPackage.eINSTANCE.getInit());

			elements.put(Final_2003,
					SelfletbehaviorPackage.eINSTANCE.getFinal());

			elements.put(Invocation_2004,
					SelfletbehaviorPackage.eINSTANCE.getInvocation());

			elements.put(StateNext_4006,
					SelfletbehaviorPackage.eINSTANCE.getState_Next());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Behavior_1000);
			KNOWN_ELEMENT_TYPES.add(Intermediate_2001);
			KNOWN_ELEMENT_TYPES.add(Init_2002);
			KNOWN_ELEMENT_TYPES.add(Final_2003);
			KNOWN_ELEMENT_TYPES.add(Invocation_2004);
			KNOWN_ELEMENT_TYPES.add(StateNext_4006);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case BehaviorEditPart.VISUAL_ID:
			return Behavior_1000;
		case IntermediateEditPart.VISUAL_ID:
			return Intermediate_2001;
		case InitEditPart.VISUAL_ID:
			return Init_2002;
		case FinalEditPart.VISUAL_ID:
			return Final_2003;
		case InvocationEditPart.VISUAL_ID:
			return Invocation_2004;
		case StateNextEditPart.VISUAL_ID:
			return StateNext_4006;
		}
		return null;
	}

}
