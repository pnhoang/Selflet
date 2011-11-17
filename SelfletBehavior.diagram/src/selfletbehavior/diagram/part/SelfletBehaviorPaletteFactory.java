package selfletbehavior.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
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
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createInitialState1CreationTool());
		paletteContainer.add(createFinalState2CreationTool());
		paletteContainer.add(createCallingServiceState3CreationTool());
		paletteContainer.add(createInvocationState4CreationTool());
		paletteContainer.add(createService5CreationTool());
		paletteContainer.add(createElementaryBehavior6CreationTool());
		paletteContainer.add(createComplexBehavior7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createLink1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitialState1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SelfletBehaviorElementTypes.Init_3002);
		types.add(SelfletBehaviorElementTypes.Init_3007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitialState1CreationTool_title,
				Messages.InitialState1CreationTool_desc, types);
		entry.setId("createInitialState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Init_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SelfletBehaviorElementTypes.Final_3005);
		types.add(SelfletBehaviorElementTypes.Final_3010);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FinalState2CreationTool_title,
				Messages.FinalState2CreationTool_desc, types);
		entry.setId("createFinalState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Final_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallingServiceState3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CallingServiceState3CreationTool_title,
				Messages.CallingServiceState3CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Intermediate_3009));
		entry.setId("createCallingServiceState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Intermediate_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInvocationState4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SelfletBehaviorElementTypes.Invocation_3003);
		types.add(SelfletBehaviorElementTypes.Invocation_3008);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InvocationState4CreationTool_title,
				Messages.InvocationState4CreationTool_desc, types);
		entry.setId("createInvocationState4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Invocation_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createService5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Service5CreationTool_title,
				Messages.Service5CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Service_2005));
		entry.setId("createService5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Service_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementaryBehavior6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ElementaryBehavior6CreationTool_title,
				Messages.ElementaryBehavior6CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Elementary_3001));
		entry.setId("createElementaryBehavior6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Elementary_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComplexBehavior7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ComplexBehavior7CreationTool_title,
				Messages.ComplexBehavior7CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Complex_3006));
		entry.setId("createComplexBehavior7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Complex_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Link1CreationTool_title,
				Messages.Link1CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.StateNext_4006));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.StateNext_4006));
		entry.setLargeIcon(entry.getSmallIcon());
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
