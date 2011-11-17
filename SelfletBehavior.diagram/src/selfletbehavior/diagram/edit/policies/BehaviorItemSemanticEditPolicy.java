package selfletbehavior.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import selfletbehavior.diagram.edit.commands.FinalCreateCommand;
import selfletbehavior.diagram.edit.commands.InitCreateCommand;
import selfletbehavior.diagram.edit.commands.IntermediateCreateCommand;
import selfletbehavior.diagram.edit.commands.InvocationCreateCommand;
import selfletbehavior.diagram.edit.commands.ServiceCreateCommand;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class BehaviorItemSemanticEditPolicy extends
		SelfletBehaviorBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BehaviorItemSemanticEditPolicy() {
		super(SelfletBehaviorElementTypes.Selflet_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Service_2005 == req.getElementType()) {
			return getGEFWrapper(new ServiceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
