package selfletbehavior.diagram.providers;

import selfletbehavior.Action;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.diagram.expressions.SelfletBehaviorOCLFactory;
import selfletbehavior.diagram.part.SelfletBehaviorDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public void init_Action_3013(Action instance) {
		try {
			Object value_0 = SelfletBehaviorOCLFactory.getExpression(2,
					SelfletbehaviorPackage.eINSTANCE.getAction(), null)
					.evaluate(instance);
			instance.setActionFile((String) value_0);
			Object value_1 = SelfletBehaviorOCLFactory.getExpression(3,
					SelfletbehaviorPackage.eINSTANCE.getAction(), null)
					.evaluate(instance);
			instance.setBody((String) value_1);
		} catch (RuntimeException e) {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public void init_Action_3017(Action instance) {
		try {
			Object value_0 = SelfletBehaviorOCLFactory.getExpression(7,
					SelfletbehaviorPackage.eINSTANCE.getAction(), null)
					.evaluate(instance);
			instance.setActionFile((String) value_0);
			Object value_1 = SelfletBehaviorOCLFactory.getExpression(8,
					SelfletbehaviorPackage.eINSTANCE.getAction(), null)
					.evaluate(instance);
			instance.setBody((String) value_1);
		} catch (RuntimeException e) {
			SelfletBehaviorDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SelfletBehaviorDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			SelfletBehaviorDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
