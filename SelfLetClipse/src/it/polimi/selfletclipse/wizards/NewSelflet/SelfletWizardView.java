package it.polimi.selfletclipse.wizards.NewSelflet;

import it.polimi.selfletclipse.wizards.NewSelfletWizard;

import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * @author Nicola
 */

public class SelfletWizardView extends WizardPage implements Observer {
    
    private final static String wizardName = new String("New SelfLet");
    
    private Composite topLevel;
    
    /* Textbox for the project name */
    private Text textProjectName;
    private Text textAuthorName;
    private Text textDescription;
    private Text textREDsAddress;
    private Text textREDsPort;
    private Text textLimePort;
    private Button buttonActive;
    
    private SelfletWizardController controller;
    
    public SelfletWizardView(SelfletWizardController mngr) {
        super(wizardName);
        this.controller = mngr;
    }
    
    public void createControl(Composite parent) {
        
        createMainLayout(parent);
        createSelfletProjectRow();
        createAuthorRow();
        createActiveRow();
        createRedsAddressRow();
        createLimeAddressRow();
        createDescriptionRow();
        
        controller.refreshObservers();
    }
    
    private void createMainLayout(Composite parent) {
        topLevel = new Composite(parent, SWT.NONE);
        setControl(topLevel);
        
        setTitle("Create a SelfLet project");
        setDescription("Set main project properties");
        
        setPageComplete(false);
        
        /*
         * TODO insert img with setImageDescriptor(image)
         */
        
        /* ---- toplevel ---- */
        GridLayout gl = new GridLayout();
        gl.numColumns = 4;
        gl.verticalSpacing = 10;
        gl.horizontalSpacing = 5;
        topLevel.setLayout(gl);
        /* ------------------ */
    }
    
    private void createDescriptionRow() {
        // Label project description
        
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.BEGINNING;
        gd1.widthHint = 200;
        gd1.horizontalSpan = 4;
        
        Label labelProjectDescription = new Label(topLevel, SWT.LEFT);
        labelProjectDescription.setText("Project Description:");
        labelProjectDescription.setLayoutData(gd1);
        
        // Text project description
        
        GridData gd2 = new GridData();
        gd2.horizontalAlignment = GridData.FILL;
        gd2.horizontalAlignment = GridData.CENTER;
        gd2.widthHint = 500;
        gd2.heightHint = 150;
        gd2.horizontalSpan = 4;
        gd2.grabExcessHorizontalSpace = true;
        
        textDescription = new Text(topLevel, SWT.MULTI | SWT.BORDER);
        textDescription.setLayoutData(gd2);
        
        textDescription.addListener(SWT.Modify, new Listener() {
            
            public void handleEvent(Event event) {
                controller.setDescription(textDescription.getText());
            }
        });
    }
    
    private void createLimeAddressRow() {
        // Label Lime address
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.FILL;
        gd1.widthHint = 200;
        gd1.horizontalSpan = 1;
        
        Label labelREDsAddress = new Label(topLevel, SWT.LEFT);
        labelREDsAddress.setText("Lime [ Port ]: ");
        labelREDsAddress.setLayoutData(gd1);
        
        // Text LimeAddress
        
        GridData gd2 = new GridData();
        // gd2.horizontalAlignment = GridData.FILL;
        gd2.widthHint = 70;
        gd2.horizontalSpan = 3;
        
        textLimePort = new Text(topLevel, SWT.BORDER);
        textLimePort.setTextLimit(5);
        textLimePort.setLayoutData(gd2);
        
        textLimePort.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event event) {
                controller.setLimePort(textLimePort.getText());
            }
        });
        
    }
    
    private void createRedsAddressRow() {
        
        // Label REDs address
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.FILL;
        gd1.widthHint = 200;
        gd1.horizontalSpan = 1;
        
        Label labelREDsAddress = new Label(topLevel, SWT.LEFT);
        labelREDsAddress.setText("REDs address [ IP:Port ] :");
        labelREDsAddress.setLayoutData(gd1);
        
        // Text REDsAddress
        
        GridData gd2 = new GridData();
        gd2.horizontalAlignment = GridData.END;
        gd2.widthHint = 100;
        gd2.horizontalSpan = 1;
        
        textREDsAddress = new Text(topLevel, SWT.BORDER);
        textREDsAddress.setTextLimit(12 + 3);
        textREDsAddress.setLayoutData(gd2);
        
        textREDsAddress.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event event) {
                controller.setREDsAddress(textREDsAddress.getText());
            }
        });
        
        // Label colon
        
        GridData gd3 = new GridData();
        gd3.horizontalAlignment = GridData.END;
        gd3.widthHint = 10;
        gd3.horizontalSpan = 1;
        
        Label labelColon = new Label(topLevel, SWT.LEFT);
        labelColon.setText(" : ");
        labelColon.setLayoutData(gd3);
        
        // Text port
        GridData gd4 = new GridData();
        gd4.horizontalAlignment = GridData.BEGINNING;
        gd4.widthHint = 50;
        gd4.horizontalSpan = 1;
        
        textREDsPort = new Text(topLevel, SWT.BORDER);
        textREDsPort.setTextLimit(5);
        textREDsPort.setLayoutData(gd4);
        
        textREDsPort.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event event) {
                controller.setREDsPort(textREDsPort.getText());
            }
        });
        
    }
    
    private void createActiveRow() {
        
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.FILL;
        gd1.widthHint = 200;
        gd1.horizontalSpan = 1;
        
        // Label active/passive
        Label labelActiveSelflet = new Label(topLevel, SWT.LEFT);
        labelActiveSelflet.setText("Active selflet:");
        labelActiveSelflet.setLayoutData(gd1);
        
        GridData gd2 = new GridData();
        gd2.horizontalAlignment = GridData.FILL;
        gd2.horizontalIndent = 30;
        gd2.horizontalSpan = 3;
        
        // CheckBox active
        buttonActive = new Button(topLevel, SWT.CHECK);
        buttonActive.setLayoutData(gd2);
        
        buttonActive.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                controller.setActiveSelflet(buttonActive.getSelection());
            }
        });
        
    }
    
    private void createAuthorRow() {
        
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.FILL;
        gd1.widthHint = 150;
        gd1.horizontalSpan = 1;
        
        // Label (High-level goal)
        Label labelAuthorName = new Label(topLevel, SWT.LEFT);
        labelAuthorName.setText("Author:");
        labelAuthorName.setLayoutData(gd1);
        
        GridData gd2 = new GridData();
        gd2.horizontalAlignment = GridData.FILL;
        gd2.widthHint = 200;
        gd2.horizontalIndent = 30;
        gd2.horizontalSpan = 3;
        
        // Text box (Author)
        textAuthorName = new Text(topLevel, SWT.BORDER);
        textAuthorName.setLayoutData(gd2);
        
        textAuthorName.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event e) {
                controller.setAuthorName(textAuthorName.getText());
            }
        });
        
    }
    
    private void createSelfletProjectRow() {
        
        GridData gd1 = new GridData();
        gd1.horizontalAlignment = GridData.FILL;
        gd1.widthHint = 150;
        gd1.horizontalSpan = 1;
        
        // Label (Project name)
        Label labelProjectName = new Label(topLevel, SWT.LEFT);
        labelProjectName.setText("Selflet name:");
        labelProjectName.setLayoutData(gd1);
        
        GridData gd2 = new GridData();
        gd2.horizontalAlignment = GridData.FILL;
        gd2.widthHint = 200;
        gd2.horizontalIndent = 30;
        gd2.horizontalSpan = 3;
        
        // Text box (Project name)
        textProjectName = new Text(topLevel, SWT.BORDER);
        textProjectName.setSize(500, textProjectName.getSize().y);
        textProjectName.setLayoutData(gd2);
        
        // Set the finish button clickable depending if there is a project name
        textProjectName.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event e) {
                controller.setProjectName(textProjectName.getText());
            }
        });
    }
    
    // update the view according to the model
    public void update(Observable o, Object arg) {
        if (arg instanceof SelfletWizardModel) {
            SelfletWizardModel m = (SelfletWizardModel) arg;
            
            if (!textAuthorName.getText().equals(m.getAuthorName()))
                textAuthorName.setText(m.getAuthorName());
            
            if (!textDescription.getText().equals(m.getDescription()))
                textDescription.setText(m.getDescription());
            
            if (!textLimePort.getText().equals(m.getLimePort()))
                textLimePort.setText(m.getLimePort());
            
            if (!textProjectName.getText().equals(m.getProjectName()))
                textProjectName.setText(m.getProjectName());
            
            if (!textREDsAddress.getText().equals(m.getREDsAddress()))
                textREDsAddress.setText(m.getREDsAddress());
            
            if (!textREDsPort.getText().equals(m.getREDsPort()))
                textREDsPort.setText(m.getREDsPort());
            
            if (!buttonActive.getSelection() == m.isActiveSelflet())
                buttonActive.setSelection(m.isActiveSelflet());
            
            setPageComplete(m.isPageComplete());
        }
    }
    
    public boolean canFlipToNextPage() {
        if (!isPageComplete())
            return false;
        
        if (buttonActive.getSelection())
            return true;
        else
            return false;
    }
    
}
