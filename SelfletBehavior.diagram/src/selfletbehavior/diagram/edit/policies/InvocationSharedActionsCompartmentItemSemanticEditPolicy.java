package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.ActionCreateCommand;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class InvocationSharedActionsCompartmentItemSemanticEditPolicy extends
		SelfletBehaviorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InvocationSharedActionsCompartmentItemSemanticEditPolicy() {
		super(SelfletBehaviorElementTypes.Invocation_3012);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Action_3013 == req.getElementType()) {
			return getGEFWrapper(new ActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
