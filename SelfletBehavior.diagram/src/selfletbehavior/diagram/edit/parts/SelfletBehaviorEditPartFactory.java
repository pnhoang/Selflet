package selfletbehavior.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry;

/**
 * @generated
 */
public class SelfletBehaviorEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SelfletBehaviorVisualIDRegistry.getVisualID(view)) {

			case BehaviorEditPart.VISUAL_ID:
				return new BehaviorEditPart(view);

			case ServiceEditPart.VISUAL_ID:
				return new ServiceEditPart(view);

			case ServiceNameEditPart.VISUAL_ID:
				return new ServiceNameEditPart(view);

			case ServiceDescriptionEditPart.VISUAL_ID:
				return new ServiceDescriptionEditPart(view);

			case ElementaryEditPart.VISUAL_ID:
				return new ElementaryEditPart(view);

			case ElementaryNameEditPart.VISUAL_ID:
				return new ElementaryNameEditPart(view);

			case InitEditPart.VISUAL_ID:
				return new InitEditPart(view);

			case InvocationEditPart.VISUAL_ID:
				return new InvocationEditPart(view);

			case InvocationNameEditPart.VISUAL_ID:
				return new InvocationNameEditPart(view);

			case ActionEditPart.VISUAL_ID:
				return new ActionEditPart(view);

			case FinalEditPart.VISUAL_ID:
				return new FinalEditPart(view);

			case ComplexEditPart.VISUAL_ID:
				return new ComplexEditPart(view);

			case ComplexNameEditPart.VISUAL_ID:
				return new ComplexNameEditPart(view);

			case Init2EditPart.VISUAL_ID:
				return new Init2EditPart(view);

			case IntermediateEditPart.VISUAL_ID:
				return new IntermediateEditPart(view);

			case IntermediateNameEditPart.VISUAL_ID:
				return new IntermediateNameEditPart(view);

			case Action2EditPart.VISUAL_ID:
				return new Action2EditPart(view);

			case Final2EditPart.VISUAL_ID:
				return new Final2EditPart(view);

			case ServiceServicesCompartmentEditPart.VISUAL_ID:
				return new ServiceServicesCompartmentEditPart(view);

			case ElementaryElementaryBehaviorsCompartmentEditPart.VISUAL_ID:
				return new ElementaryElementaryBehaviorsCompartmentEditPart(
						view);

			case InvocationSharedActionsCompartmentEditPart.VISUAL_ID:
				return new InvocationSharedActionsCompartmentEditPart(view);

			case ComplexComplexBehaviorsCompartmentEditPart.VISUAL_ID:
				return new ComplexComplexBehaviorsCompartmentEditPart(view);

			case IntermediateSharedActionsCompartmentEditPart.VISUAL_ID:
				return new IntermediateSharedActionsCompartmentEditPart(view);

			case ConditionEditPart.VISUAL_ID:
				return new ConditionEditPart(view);

			case ConditionBodyEditPart.VISUAL_ID:
				return new ConditionBodyEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
