package selfletbehavior.diagram.sheet;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import selfletbehavior.SelfletbehaviorPackage;


public class CustomisedPropertyDescriptor extends PropertyDescriptor implements
		IPropertyDescriptor {
	
	public CustomisedPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor){
		super (object, itemPropertyDescriptor);
	}
	
	@Override
	protected CellEditor createEDataTypeCellEditor(EDataType dataType, Composite composite){
		if (dataType.equals(SelfletbehaviorPackage.eINSTANCE.getFileReference())){
			System.out.println("kittens!"); //success!
		}
		
		return super.createEDataTypeCellEditor(dataType, composite);
	}
	
}
