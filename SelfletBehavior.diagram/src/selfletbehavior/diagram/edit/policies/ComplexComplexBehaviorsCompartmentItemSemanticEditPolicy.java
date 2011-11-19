package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.Final2CreateCommand;
import selfletbehavior.diagram.edit.commands.Init2CreateCommand;
import selfletbehavior.diagram.edit.commands.IntermediateCreateCommand;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class ComplexComplexBehaviorsCompartmentItemSemanticEditPolicy extends
		SelfletBehaviorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComplexComplexBehaviorsCompartmentItemSemanticEditPolicy() {
		super(SelfletBehaviorElementTypes.Complex_3006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Init_3015 == req.getElementType()) {
			return getGEFWrapper(new Init2CreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Intermediate_3016 == req
				.getElementType()) {
			return getGEFWrapper(new IntermediateCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Final_3018 == req.getElementType()) {
			return getGEFWrapper(new Final2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
