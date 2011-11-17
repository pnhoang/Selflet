package selfletbehavior.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import selfletbehavior.diagram.edit.commands.ComplexCreateCommand;
import selfletbehavior.diagram.edit.commands.ElementaryCreateCommand;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class ServiceServicesCompartmentItemSemanticEditPolicy extends
		SelfletBehaviorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceServicesCompartmentItemSemanticEditPolicy() {
		super(SelfletBehaviorElementTypes.Service_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Elementary_3001 == req.getElementType()) {
			return getGEFWrapper(new ElementaryCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Complex_3006 == req.getElementType()) {
			return getGEFWrapper(new ComplexCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
