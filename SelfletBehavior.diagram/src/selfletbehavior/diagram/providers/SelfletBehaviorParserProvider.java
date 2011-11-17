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
import selfletbehavior.diagram.edit.parts.ComplexNameEditPart;
import selfletbehavior.diagram.edit.parts.ElementaryNameEditPart;
import selfletbehavior.diagram.edit.parts.IntermediateCallService2EditPart;
import selfletbehavior.diagram.edit.parts.IntermediateCallServiceEditPart;
import selfletbehavior.diagram.edit.parts.InvocationDoActivity2EditPart;
import selfletbehavior.diagram.edit.parts.InvocationDoActivityEditPart;
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
	private IParser invocationDoActivity_5003Parser;

	/**
	 * @generated
	 */
	private IParser getInvocationDoActivity_5003Parser() {
		if (invocationDoActivity_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getInvocation_DoActivity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			invocationDoActivity_5003Parser = parser;
		}
		return invocationDoActivity_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser intermediateCallService_5004Parser;

	/**
	 * @generated
	 */
	private IParser getIntermediateCallService_5004Parser() {
		if (intermediateCallService_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getIntermediate_CallService() };
			MessageFormatParser parser = new MessageFormatParser(features);
			intermediateCallService_5004Parser = parser;
		}
		return intermediateCallService_5004Parser;
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
	private IParser invocationDoActivity_5006Parser;

	/**
	 * @generated
	 */
	private IParser getInvocationDoActivity_5006Parser() {
		if (invocationDoActivity_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getInvocation_DoActivity() };
			MessageFormatParser parser = new MessageFormatParser(features);
			invocationDoActivity_5006Parser = parser;
		}
		return invocationDoActivity_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser intermediateCallService_5007Parser;

	/**
	 * @generated
	 */
	private IParser getIntermediateCallService_5007Parser() {
		if (intermediateCallService_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { SelfletbehaviorPackage.eINSTANCE
					.getIntermediate_CallService() };
			MessageFormatParser parser = new MessageFormatParser(features);
			intermediateCallService_5007Parser = parser;
		}
		return intermediateCallService_5007Parser;
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
		case InvocationDoActivityEditPart.VISUAL_ID:
			return getInvocationDoActivity_5003Parser();
		case IntermediateCallServiceEditPart.VISUAL_ID:
			return getIntermediateCallService_5004Parser();
		case ComplexNameEditPart.VISUAL_ID:
			return getComplexName_5008Parser();
		case InvocationDoActivity2EditPart.VISUAL_ID:
			return getInvocationDoActivity_5006Parser();
		case IntermediateCallService2EditPart.VISUAL_ID:
			return getIntermediateCallService_5007Parser();
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
