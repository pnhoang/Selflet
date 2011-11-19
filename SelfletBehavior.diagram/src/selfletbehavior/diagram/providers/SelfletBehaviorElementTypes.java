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
import selfletbehavior.diagram.edit.parts.Action2EditPart;
import selfletbehavior.diagram.edit.parts.ActionEditPart;
import selfletbehavior.diagram.edit.parts.BehaviorEditPart;
import selfletbehavior.diagram.edit.parts.ComplexEditPart;
import selfletbehavior.diagram.edit.parts.ConditionEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryEditPart;
import selfletbehavior.diagram.edit.parts.Final2EditPart;
import selfletbehavior.diagram.edit.parts.FinalEditPart;
import selfletbehavior.diagram.edit.parts.Init2EditPart;
import selfletbehavior.diagram.edit.parts.InitEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateEditPart;
import selfletbehavior.diagram.edit.parts.InvocationEditPart;
import selfletbehavior.diagram.edit.parts.ServiceEditPart;
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
	public static final IElementType Selflet_1000 = getElementType("SelfletBehavior.diagram.Selflet_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Service_2005 = getElementType("SelfletBehavior.diagram.Service_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Elementary_3001 = getElementType("SelfletBehavior.diagram.Elementary_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Init_3011 = getElementType("SelfletBehavior.diagram.Init_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Invocation_3012 = getElementType("SelfletBehavior.diagram.Invocation_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_3013 = getElementType("SelfletBehavior.diagram.Action_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Final_3014 = getElementType("SelfletBehavior.diagram.Final_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Complex_3006 = getElementType("SelfletBehavior.diagram.Complex_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Init_3015 = getElementType("SelfletBehavior.diagram.Init_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Intermediate_3016 = getElementType("SelfletBehavior.diagram.Intermediate_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Action_3017 = getElementType("SelfletBehavior.diagram.Action_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Final_3018 = getElementType("SelfletBehavior.diagram.Final_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_4007 = getElementType("SelfletBehavior.diagram.Condition_4007"); //$NON-NLS-1$

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

			elements.put(Selflet_1000,
					SelfletbehaviorPackage.eINSTANCE.getSelflet());

			elements.put(Service_2005,
					SelfletbehaviorPackage.eINSTANCE.getService());

			elements.put(Elementary_3001,
					SelfletbehaviorPackage.eINSTANCE.getElementary());

			elements.put(Init_3011, SelfletbehaviorPackage.eINSTANCE.getInit());

			elements.put(Invocation_3012,
					SelfletbehaviorPackage.eINSTANCE.getInvocation());

			elements.put(Action_3013,
					SelfletbehaviorPackage.eINSTANCE.getAction());

			elements.put(Final_3014,
					SelfletbehaviorPackage.eINSTANCE.getFinal());

			elements.put(Complex_3006,
					SelfletbehaviorPackage.eINSTANCE.getComplex());

			elements.put(Init_3015, SelfletbehaviorPackage.eINSTANCE.getInit());

			elements.put(Intermediate_3016,
					SelfletbehaviorPackage.eINSTANCE.getIntermediate());

			elements.put(Action_3017,
					SelfletbehaviorPackage.eINSTANCE.getAction());

			elements.put(Final_3018,
					SelfletbehaviorPackage.eINSTANCE.getFinal());

			elements.put(Condition_4007,
					SelfletbehaviorPackage.eINSTANCE.getCondition());
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
			KNOWN_ELEMENT_TYPES.add(Selflet_1000);
			KNOWN_ELEMENT_TYPES.add(Service_2005);
			KNOWN_ELEMENT_TYPES.add(Elementary_3001);
			KNOWN_ELEMENT_TYPES.add(Init_3011);
			KNOWN_ELEMENT_TYPES.add(Invocation_3012);
			KNOWN_ELEMENT_TYPES.add(Action_3013);
			KNOWN_ELEMENT_TYPES.add(Final_3014);
			KNOWN_ELEMENT_TYPES.add(Complex_3006);
			KNOWN_ELEMENT_TYPES.add(Init_3015);
			KNOWN_ELEMENT_TYPES.add(Intermediate_3016);
			KNOWN_ELEMENT_TYPES.add(Action_3017);
			KNOWN_ELEMENT_TYPES.add(Final_3018);
			KNOWN_ELEMENT_TYPES.add(Condition_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case BehaviorEditPart.VISUAL_ID:
			return Selflet_1000;
		case ServiceEditPart.VISUAL_ID:
			return Service_2005;
		case ElementaryEditPart.VISUAL_ID:
			return Elementary_3001;
		case InitEditPart.VISUAL_ID:
			return Init_3011;
		case InvocationEditPart.VISUAL_ID:
			return Invocation_3012;
		case ActionEditPart.VISUAL_ID:
			return Action_3013;
		case FinalEditPart.VISUAL_ID:
			return Final_3014;
		case ComplexEditPart.VISUAL_ID:
			return Complex_3006;
		case Init2EditPart.VISUAL_ID:
			return Init_3015;
		case IntermediateEditPart.VISUAL_ID:
			return Intermediate_3016;
		case Action2EditPart.VISUAL_ID:
			return Action_3017;
		case Final2EditPart.VISUAL_ID:
			return Final_3018;
		case ConditionEditPart.VISUAL_ID:
			return Condition_4007;
		}
		return null;
	}

}
