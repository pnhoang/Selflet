package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.Final2CreateCommand;
import selfletbehavior.diagram.edit.commands.Init2CreateCommand;
import selfletbehavior.diagram.edit.commands.Intermediate2CreateCommand;
import selfletbehavior.diagram.edit.commands.Invocation2CreateCommand;
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
		if (SelfletBehaviorElementTypes.Init_3007 == req.getElementType()) {
			return getGEFWrapper(new Init2CreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Invocation_3008 == req.getElementType()) {
			return getGEFWrapper(new Invocation2CreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Intermediate_3009 == req
				.getElementType()) {
			return getGEFWrapper(new Intermediate2CreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Final_3010 == req.getElementType()) {
			return getGEFWrapper(new Final2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
