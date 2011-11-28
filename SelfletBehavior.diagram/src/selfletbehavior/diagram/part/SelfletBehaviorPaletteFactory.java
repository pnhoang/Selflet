package selfletbehavior.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import selfletbehavior.diagram.providers.SelfletBehaviorElementTypes;

/**
 * @generated
 */
public class SelfletBehaviorPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createNodes2Group());
		paletteRoot.add(createConnections3Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Default1Group_desc);
		paletteContainer.add(new PaletteSeparator());
		return paletteContainer;
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes2Group_title);
		paletteContainer.setId("createNodes2Group"); //$NON-NLS-1$
		paletteContainer.add(createInitialState1CreationTool());
		paletteContainer.add(createFinalState2CreationTool());
		paletteContainer.add(createIntermediateState3CreationTool());
		paletteContainer.add(createInvocationState4CreationTool());
		paletteContainer.add(createElementaryBehavior5CreationTool());
		paletteContainer.add(createComplexBehavior6CreationTool());
		paletteContainer.add(createAction7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connections3Group_title);
		paletteContainer.setId("createConnections3Group"); //$NON-NLS-1$
		paletteContainer.add(createStateConnection1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SelfletBehaviorElementTypes.Init_3011);
		types.add(SelfletBehaviorElementTypes.Init_3015);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitialState1CreationTool_title,
				Messages.InitialState1CreationTool_desc, types);
		entry.setId("createInitialState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/Initial.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/Initial.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SelfletBehaviorElementTypes.Final_3014);
		types.add(SelfletBehaviorElementTypes.Final_3018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FinalState2CreationTool_title,
				Messages.FinalState2CreationTool_desc, types);
		entry.setId("createFinalState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/Final.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/Final.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIntermediateState3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IntermediateState3CreationTool_title,
				Messages.IntermediateState3CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Intermediate_3016));
		entry.setId("createIntermediateState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/inter.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/inter.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInvocationState4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InvocationState4CreationTool_title,
				Messages.InvocationState4CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Invocation_3012));
		entry.setId("createInvocationState4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/Invo.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/Invo.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementaryBehavior5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ElementaryBehavior5CreationTool_title,
				Messages.ElementaryBehavior5CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Elementary_3001));
		entry.setId("createElementaryBehavior5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/Elementary.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/Elementary.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComplexBehavior6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ComplexBehavior6CreationTool_title,
				Messages.ComplexBehavior6CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Complex_3006));
		entry.setId("createComplexBehavior6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/Complex.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/Complex.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAction7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SelfletBehaviorElementTypes.Action_3013);
		types.add(SelfletBehaviorElementTypes.Action_3017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Action7CreationTool_title,
				Messages.Action7CreationTool_desc, types);
		entry.setId("createAction7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/action.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/action.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateConnection1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StateConnection1CreationTool_title,
				Messages.StateConnection1CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Condition_4007));
		entry.setId("createStateConnection1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/smallResources/Connector.png")); //$NON-NLS-1$
		entry.setLargeIcon(SelfletBehaviorDiagramEditorPlugin
				.findImageDescriptor("/SelfletBehavior/src/bigResources/Connector.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
