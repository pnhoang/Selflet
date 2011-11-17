package selfletbehavior.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableShapeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import selfletbehavior.diagram.edit.policies.IntermediateItemSemanticEditPolicy;
import selfletbehavior.diagram.part.SelfletBehaviorVisualIDRegistry;
import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class IntermediateEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public IntermediateEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new IntermediateItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		XYLayoutEditPolicy lep = new XYLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = super.createChildEditPolicy(child);
				if (result == null) {
					return new ResizableShapeEditPolicy();
				}
				return result;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new IntermediateFigure();
	}

	/**
	 * @generated
	 */
	public IntermediateFigure getPrimaryShape() {
		return (IntermediateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IntermediateCallServiceEditPart) {
			((IntermediateCallServiceEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureIntermediateCallServiceFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof IntermediateCallServiceEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			nodeShape.setLayoutManager(new FreeformLayout() {

				public Object getConstraint(IFigure figure) {
					Object result = constraints.get(figure);
					if (result == null) {
						result = new Rectangle(0, 0, -1, -1);
					}
					return result;
				}
			});
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(SelfletBehaviorVisualIDRegistry
				.getType(IntermediateCallServiceEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SelfletBehaviorElementTypes.StateNext_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InitEditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof InvocationEditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof selfletbehavior.diagram.edit.parts.IntermediateEditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof FinalEditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof Init2EditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof Invocation2EditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof Intermediate2EditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		if (targetEditPart instanceof Final2EditPart) {
			types.add(SelfletBehaviorElementTypes.StateNext_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SelfletBehaviorElementTypes.StateNext_4006) {
			types.add(SelfletBehaviorElementTypes.Init_3002);
			types.add(SelfletBehaviorElementTypes.Invocation_3003);
			types.add(SelfletBehaviorElementTypes.Intermediate_3004);
			types.add(SelfletBehaviorElementTypes.Final_3005);
			types.add(SelfletBehaviorElementTypes.Init_3007);
			types.add(SelfletBehaviorElementTypes.Invocation_3008);
			types.add(SelfletBehaviorElementTypes.Intermediate_3009);
			types.add(SelfletBehaviorElementTypes.Final_3010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SelfletBehaviorElementTypes.StateNext_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == SelfletBehaviorElementTypes.StateNext_4006) {
			types.add(SelfletBehaviorElementTypes.Init_3002);
			types.add(SelfletBehaviorElementTypes.Invocation_3003);
			types.add(SelfletBehaviorElementTypes.Intermediate_3004);
			types.add(SelfletBehaviorElementTypes.Final_3005);
			types.add(SelfletBehaviorElementTypes.Init_3007);
			types.add(SelfletBehaviorElementTypes.Invocation_3008);
			types.add(SelfletBehaviorElementTypes.Intermediate_3009);
			types.add(SelfletBehaviorElementTypes.Final_3010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class IntermediateFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureIntermediateCallServiceFigure;

		/**
		 * @generated
		 */
		public IntermediateFigure() {
			this.setLayoutManager(new XYLayout());
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(25),
					getMapMode().DPtoLP(25)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureIntermediateCallServiceFigure = new WrappingLabel();
			fFigureIntermediateCallServiceFigure.setText("<...>");

			this.add(fFigureIntermediateCallServiceFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureIntermediateCallServiceFigure() {
			return fFigureIntermediateCallServiceFigure;
		}

	}

}
