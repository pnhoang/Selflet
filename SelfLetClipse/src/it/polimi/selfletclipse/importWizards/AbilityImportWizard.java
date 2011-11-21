/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package it.polimi.selfletclipse.importWizards;

import it.polimi.selfletclipse.SelfLetPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;

/**
 * @author Nicola
 */
public class AbilityImportWizard extends Wizard implements IImportWizard {

    AbilityImportWizardPage mainPage;

    public AbilityImportWizard() {
	super();
	/* Init the plugin */
	SelfLetPlugin.Init();
    }

    /**
     * The file is created in the workspace if the user places it inside the
     * abilities folder.
     * */
    public boolean performFinish() {
	// IPath p = mainPage.getContainerFullPath();
	// if (p == null)
	// return false;
	//
	// String[] segments = p.segments();
	// if (segments.length != 2)
	// return false;
	//
	// String project = segments[0];
	// String folder = segments[1];
	//
	// if (!folder.equals("abilities"))
	// return false;
	//
	// SelfletProject prj = WorkspaceManager.getProject(project);
	//
	// if (prj == null)
	// return false;
	//
	// IFile file = mainPage.createNewFile();
	//
	// if (file == null)
	// return false;
	//
	// prj.addAbility(file);
	//
	// prj.writeXmlFile();
	return true;
    }

    public void init(IWorkbench workbench, IStructuredSelection selection) {
	setWindowTitle("File Import Wizard"); // NON-NLS-1
	setNeedsProgressMonitor(true);
	mainPage = new AbilityImportWizardPage("Import Ability", selection); // NON-NLS-1
    }

    public void addPages() {
	super.addPages();
	addPage(mainPage);
    }

}
