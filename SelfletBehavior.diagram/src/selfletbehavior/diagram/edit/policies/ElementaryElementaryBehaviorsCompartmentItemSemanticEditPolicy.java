package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.FinalCreateCommand;
import selfletbehavior.diagram.edit.commands.InitCreateCommand;
import selfletbehavior.diagram.edit.commands.InvocationCreateCommand;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class ElementaryElementaryBehaviorsCompartmentItemSemanticEditPolicy
		extends SelfletBehaviorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ElementaryElementaryBehaviorsCompartmentItemSemanticEditPolicy() {
		super(SelfletBehaviorElementTypes.Elementary_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Init_3011 == req.getElementType()) {
			return getGEFWrapper(new InitCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Invocation_3012 == req.getElementType()) {
			return getGEFWrapper(new InvocationCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Final_3014 == req.getElementType()) {
			return getGEFWrapper(new FinalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
