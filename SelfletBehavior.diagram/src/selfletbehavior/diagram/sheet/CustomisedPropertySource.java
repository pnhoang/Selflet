package selfletbehavior.diagram.sheet;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

public class CustomisedPropertySource extends PropertySource implements
		IPropertySource {

	public CustomisedPropertySource(Object object, IItemPropertySource itemPropertySource){
		super(object, itemPropertySource);
	}
	
	protected IPropertyDescriptor createPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor){
		return new CustomisedPropertyDescriptor(object, itemPropertyDescriptor);
	}
}
