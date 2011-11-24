package selfletbehavior.diagram.sheet;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.jar.JarFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
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
					
					dialog.setFilterNames(new String[] {".jar files"});
					dialog.setFilterExtensions(new String[] {"*.jar"});
					
					//set the default path
					URI uri = ((EObject) object).eResource().getURI();
					URI resolved = CommonPlugin.resolve(uri);
					URI resolvedTrim = resolved.trimFileExtension();
					dialog.setFilterPath(resolvedTrim.toFileString());
					
					
					//set the default file
					// (the FileDialog also handles absolute/relative files)
					String fileName = valueHandler.toString(getValue());
					dialog.setFileName(fileName);
					
					String fileSelected = dialog.open();
					if (fileSelected == null){
						return getValue();
					}
					
					
					//extract out the source path to make it relative
					URI deres = URI.createFileURI(fileSelected).deresolve(resolved);
					fileSelected = deres.toString();
					String fileNameSelected = deres.lastSegment(); 
					/**
					 * HACKED ON OSX WHEN USER SELECTS A FOLDER WITH WHITESPACE! 
					 * SHOULD CHECK WHAT HAPPENS ON WINDOWS
					 */
					String fileNameWhiteSpaceReplaced = fileSelected.replace("%20", " ");
						
					
					
					URI project = resolved.trimSegments(2);
					String destFile = project + "/abilities/" + fileNameSelected;
					String destFileNoPrefix = destFile.replace("file:", ""); 
	                
					
					try {
						/**
						 * AFTER COPYING, THE NEW FILE DOES NOT APPEAR ON THE PROJECT FOLDER IMMEDIATELY
						 * ENABLE AUTOMATIC WORKSPACE REFRESH WHEN SOURCE FILES CHANGED IN THE PREFERENCE
						 */
						FileHandler.binaryCopyFile(fileNameWhiteSpaceReplaced, destFileNoPrefix);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					return valueHandler.toValue(destFileNoPrefix);
				}
			};
			return result;
		}
		return super.createPropertyEditor(composite);
	}
	
	
	
}
