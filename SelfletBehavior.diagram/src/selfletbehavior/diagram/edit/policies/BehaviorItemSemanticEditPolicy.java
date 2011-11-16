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
		super(SelfletBehaviorElementTypes.Behavior_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SelfletBehaviorElementTypes.Intermediate_2001 == req
				.getElementType()) {
			return getGEFWrapper(new IntermediateCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Init_2002 == req.getElementType()) {
			return getGEFWrapper(new InitCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Final_2003 == req.getElementType()) {
			return getGEFWrapper(new FinalCreateCommand(req));
		}
		if (SelfletBehaviorElementTypes.Invocation_2004 == req.getElementType()) {
			return getGEFWrapper(new InvocationCreateCommand(req));
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
