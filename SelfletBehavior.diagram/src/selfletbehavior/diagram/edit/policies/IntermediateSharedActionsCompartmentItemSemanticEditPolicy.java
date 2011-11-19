package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.Action2CreateCommand;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class IntermediateSharedActionsCompartmentItemSemanticEditPolicy extends
		SelfletBehaviorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public IntermediateSharedActionsCompartmentItemSemanticEditPolicy() {
		super(SelfletBehaviorElementTypes.Intermediate_3016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Action_3017 == req.getElementType()) {
			return getGEFWrapper(new Action2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
