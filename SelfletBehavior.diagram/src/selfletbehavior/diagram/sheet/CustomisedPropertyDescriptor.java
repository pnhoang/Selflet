package selfletbehavior.diagram.sheet;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

import selfletbehavior.SelfletbehaviorPackage;


public class CustomisedPropertyDescriptor extends PropertyDescriptor implements
		IPropertyDescriptor {
	
	public CustomisedPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor){
		super (object, itemPropertyDescriptor);
	}
	
	/*
	@Override
	protected CellEditor createEDataTypeCellEditor(EDataType dataType, Composite composite){
		if (dataType.equals(SelfletbehaviorPackage.eINSTANCE.getFileReference())){
			System.out.println("kittens!"); //success!
		}
		
		return super.createEDataTypeCellEditor(dataType, composite);
	}*/
	
	public CellEditor createPropertyEditor(Composite composite){
		EClassifier eType = ((EStructuralFeature) itemPropertyDescriptor.getFeature(object)).getEType();
		
		final EDataType dataType = (EDataType) eType;
		
		if (dataType.equals(SelfletbehaviorPackage.eINSTANCE.getFileReference())){
			CellEditor result = new ExtendedDialogCellEditor(composite, getEditLabelProvider()){
				protected EDataTypeValueHandler valueHandler = new EDataTypeValueHandler(dataType);
				
				@Override
				protected Object openDialogBox(Control cellEditorWindow){
					Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
					FileDialog dialog = new FileDialog(shell, SWT.OPEN);
					
					dialog.setFileName(valueHandler.toString(getValue()));
					
					String fileSelected = dialog.open();
					if (fileSelected == null){
						return getValue();
					}
					
					return valueHandler.toValue(fileSelected);
				}
			};
			return result;
		}
		return super.createPropertyEditor(composite);
	}
	
}
