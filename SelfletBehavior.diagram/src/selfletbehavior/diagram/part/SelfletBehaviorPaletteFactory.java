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
		paletteContainer.add(createInit1CreationTool());
		paletteContainer.add(createFinal2CreationTool());
		paletteContainer.add(createIntermediate3CreationTool());
		paletteContainer.add(createInvocation4CreationTool());
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
	private ToolEntry createInit1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Init1CreationTool_title,
				Messages.Init1CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Init_2002));
		entry.setId("createInit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Init_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinal2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Final2CreationTool_title,
				Messages.Final2CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Final_2003));
		entry.setId("createFinal2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Final_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIntermediate3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Intermediate3CreationTool_title,
				Messages.Intermediate3CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Intermediate_2001));
		entry.setId("createIntermediate3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SelfletBehaviorElementTypes
				.getImageDescriptor(SelfletBehaviorElementTypes.Intermediate_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInvocation4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Invocation4CreationTool_title,
				Messages.Invocation4CreationTool_desc,
				Collections
						.singletonList(SelfletBehaviorElementTypes.Invocation_2004));
		entry.setId("createInvocation4CreationTool"); //$NON-NLS-1$
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
