package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.FinalCreateCommand;
import selfletbehavior.diagram.edit.commands.InitCreateCommand;
import selfletbehavior.diagram.edit.commands.IntermediateCreateCommand;
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
		if (SelfletBehaviorElementTypes.Init_3002 == req.getElementType()) {
			return getGEFWrapper(new InitCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Invocation_3003 == req.getElementType()) {
			return getGEFWrapper(new InvocationCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Intermediate_3004 == req
				.getElementType()) {
			return getGEFWrapper(new IntermediateCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Final_3005 == req.getElementType()) {
			return getGEFWrapper(new FinalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
