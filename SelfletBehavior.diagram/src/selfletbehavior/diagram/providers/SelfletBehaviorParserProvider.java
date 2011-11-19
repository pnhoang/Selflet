package selfletbehavior.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.diagram.edit.parts.Action2EditPart;
import selfletbehavior.diagram.edit.parts.ActionEditPart;
import selfletbehavior.diagram.edit.parts.ComplexNameEditPart;
import selfletbehavior.diagram.edit.parts.ConditionBodyEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryNameEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateNameEditPart;
import selfletbehavior.diagram.edit.parts.InvocationNameEditPart;
import selfletbehavior.diagram.edit.parts.ServiceDescriptionEditPart;
import selfletbehavior.diagram.edit.parts.ServiceNameEditPart;
import selfletbehavior.diagram.parsers.MessageFormatParser;
import selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry;

/**
 * @generated
 */
public class SelfletBehaviorParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser serviceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getServiceName_5009Parser() {
		if (serviceName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getService_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceName_5009Parser = parser;
		}
		return serviceName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser serviceDescription_5010Parser;

	/**
	 * @generated
	 */
	private IParser getServiceDescription_5010Parser() {
		if (serviceDescription_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getService_Description() };
			MessageFormatParser parser = new MessageFormatParser(features);
			serviceDescription_5010Parser = parser;
		}
		return serviceDescription_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser elementaryName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getElementaryName_5005Parser() {
		if (elementaryName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getBehavior_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			elementaryName_5005Parser = parser;
		}
		return elementaryName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser invocationName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getInvocationName_5011Parser() {
		if (invocationName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			invocationName_5011Parser = parser;
		}
		return invocationName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser action_3013Parser;

	/**
	 * @generated
	 */
	private IParser getAction_3013Parser() {
		if (action_3013Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getAction_Body() };
			MessageFormatParser parser = new MessageFormatParser(features);
			action_3013Parser = parser;
		}
		return action_3013Parser;
	}

	/**
	 * @generated
	 */
	private IParser complexName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getComplexName_5008Parser() {
		if (complexName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getBehavior_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			complexName_5008Parser = parser;
		}
		return complexName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser intermediateName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getIntermediateName_5012Parser() {
		if (intermediateName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getState_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			intermediateName_5012Parser = parser;
		}
		return intermediateName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser action_3017Parser;

	/**
	 * @generated
	 */
	private IParser getAction_3017Parser() {
		if (action_3017Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getAction_Body() };
			MessageFormatParser parser = new MessageFormatParser(features);
			action_3017Parser = parser;
		}
		return action_3017Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionBody_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConditionBody_6001Parser() {
		if (conditionBody_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getCondition_Body() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionBody_6001Parser = parser;
		}
		return conditionBody_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ServiceNameEditPart.VISUAL_ID:
			return getServiceName_5009Parser();
		case ServiceDescriptionEditPart.VISUAL_ID:
			return getServiceDescription_5010Parser();
		case ElementaryNameEditPart.VISUAL_ID:
			return getElementaryName_5005Parser();
		case InvocationNameEditPart.VISUAL_ID:
			return getInvocationName_5011Parser();
		case ActionEditPart.VISUAL_ID:
			return getAction_3013Parser();
		case ComplexNameEditPart.VISUAL_ID:
			return getComplexName_5008Parser();
		case IntermediateNameEditPart.VISUAL_ID:
			return getIntermediateName_5012Parser();
		case Action2EditPart.VISUAL_ID:
			return getAction_3017Parser();
		case ConditionBodyEditPart.VISUAL_ID:
			return getConditionBody_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SelfletBehaviorVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SelfletBehaviorVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SelfletBehaviorElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
