package selfletbehavior.diagram.part;

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
		paletteRoot.add(createStateNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "State Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createStateNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.StateNodes1Group_title);
		paletteContainer.setId("createStateNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createInitialState1CreationTool());
		paletteContainer.add(createFinalState2CreationTool());
		paletteContainer.add(createCallingServiceState3CreationTool());
		paletteContainer.add(createInvocationState4CreationTool());
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
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InitialState1CreationTool_title,
				Messages.InitialState1CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Init_2002));
		entry.setId("createInitialState1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Init_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FinalState2CreationTool_title,
				Messages.FinalState2CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Final_2003));
		entry.setId("createFinalState2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Final_2003));
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
						.singletonList(SelfletBehaviorElementTypes.Intermediate_2001));
		entry.setId("createCallingServiceState3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Intermediate_2001));
		entry.setLargeIcon(entry.getSmallIcon());
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
						.singletonList(SelfletBehaviorElementTypes.Invocation_2004));
		entry.setId("createInvocationState4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Invocation_2004));
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
