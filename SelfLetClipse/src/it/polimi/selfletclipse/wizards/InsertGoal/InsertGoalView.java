package it.polimi.selfletclipse.wizards.InsertGoal;

import it.polimi.selfletclipse.model.GoalParameter;
import it.polimi.selfletclipse.wizards.NewSelflet.SelfletWizardModel;
import it.polimi.selfletclipse.wizards.SelectGoal.SelectGoalModel;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

/**
 * @author Nicola
 */
public class InsertGoalView extends WizardPage implements Observer {
    
    private Text textGoalName;
    private Text textParamName;
    private Button buttonAdd;
    private Button buttonRemove;
    
    private InsertGoalController controller;
    private Composite topLevel;
    private Table table;
    private boolean viewInitialized;
    
    private boolean allowGoalNameChanges = true;
    private boolean allowParametersChanges = true;
    
    private static String pageName = "Goal";
    
    public InsertGoalView(InsertGoalController controller) {
        super(pageName);
        viewInitialized = false;
        this.controller = controller;
    }
    
    public void createControl(Composite parent) {
        
        createMainLayout(parent);
        createGoalNameRow();
        
        Composite upPart = new Composite(topLevel, SWT.NONE);
        Composite downPart = new Composite(topLevel, SWT.NONE);
        
        createTableRow(upPart);
        createButtons(upPart);
        createParamNameRow(downPart);
        
        createActiveRow(downPart); //TODO
        viewInitialized = true;
        controller.refreshObservers();
        
    }
    
    private void createActiveRow(Composite downPart) {
        
    }
    
    private void createButtons(Composite upPart) {
        Composite rightPart = new Composite(upPart, SWT.NONE);
        
        RowLayout rightRowLayout = new RowLayout();
        rightRowLayout.type = SWT.VERTICAL;
        rightRowLayout.justify = true;
        rightRowLayout.wrap = false;
        rightRowLayout.pack = true;
        rightRowLayout.marginLeft = 5;
        rightRowLayout.marginTop = 5;
        rightRowLayout.marginRight = 5;
        rightRowLayout.marginBottom = 5;
        
        rightPart.setLayout(rightRowLayout);
        
        buttonAdd = new Button(rightPart, SWT.NONE);
        buttonAdd.setText("Add");
        buttonAdd.setLayoutData(new RowData(100, 50));
        buttonAdd.setEnabled(false);
        
        /*
         * Add the service name into table when pressing the add button
         */
        buttonAdd.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                controller.addParameter();
            }
        });
        
        buttonRemove = new Button(rightPart, SWT.NONE);
        buttonRemove.setText("Remove");
        buttonRemove.setLayoutData(new RowData(100, 50));
        buttonRemove.setEnabled(false);
        
        /* Remove button listener, remove the selected item */
        buttonRemove.addSelectionListener(new SelectionAdapter() {
            
            public void widgetSelected(SelectionEvent e) {
                int index = table.getSelectionIndex();
                controller.remove(index);
                buttonRemove.setEnabled(false);
            }
            
        });
    }
    
    private void createMainLayout(Composite parent) {
        
        topLevel = new Composite(parent, SWT.NONE);
        setControl(topLevel);
        
        // set topLevel layout
        RowLayout topLevelRowLayout = new RowLayout();
        topLevelRowLayout.type = SWT.VERTICAL;
        topLevelRowLayout.justify = false;
        topLevelRowLayout.wrap = true;
        topLevelRowLayout.pack = true;
        topLevelRowLayout.marginLeft = 5;
        topLevelRowLayout.marginTop = 5;
        topLevelRowLayout.marginRight = 5;
        topLevelRowLayout.marginBottom = 5;
        topLevel.setLayout(topLevelRowLayout);
    }
    
    private void createGoalNameRow() {
        Composite labelAndTextComposite = new Composite(topLevel, SWT.NONE);
        RowLayout labelAndTextRowLayot = new RowLayout();
        labelAndTextRowLayot.type = SWT.HORIZONTAL;
        labelAndTextComposite.setLayout(labelAndTextRowLayot);
        
        Label labelGoalName = new Label(labelAndTextComposite, SWT.LEFT);
        labelGoalName.setLayoutData(new RowData(150, 15));
        labelGoalName.setText("Service name: ");
        
        textGoalName = new Text(labelAndTextComposite, SWT.BORDER);
        textGoalName.setLayoutData(new RowData(300, 15));
        
        textGoalName.addListener(SWT.Modify, new Listener() {
            public void handleEvent(Event event) {
                controller.setGoalName(textGoalName.getText());
            }
        });
    }
    
    private void createParamNameRow(Composite downPart) {
        RowLayout downPartRowLayout = new RowLayout();
        downPartRowLayout.type = SWT.HORIZONTAL;
        downPartRowLayout.justify = true;
        downPartRowLayout.wrap = false;
        downPartRowLayout.pack = true;
        downPartRowLayout.marginLeft = 10;
        downPartRowLayout.marginTop = 5;
        downPartRowLayout.marginRight = 10;
        downPartRowLayout.marginBottom = 5;
        downPart.setLayout(downPartRowLayout);
        
        Label labelParamName = new Label(downPart, SWT.LEFT);
        labelParamName.setLayoutData(new RowData(150, 20));
        labelParamName.setText("Parameter name: ");
        
        textParamName = new Text(downPart, SWT.BORDER);
        textParamName.setLayoutData(new RowData(300, 15));
        
        /*
         * Enable or disable the add button depending on the text on the text
         * widget
         */
        textParamName.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                controller.setParameterName(textParamName.getText());
            }
        });
        
    }
    
    private void createTableRow(Composite upPart) {
        RowLayout upPartRowLayout = new RowLayout();
        upPartRowLayout.type = SWT.HORIZONTAL;
        upPartRowLayout.justify = true;
        upPartRowLayout.wrap = false;
        upPartRowLayout.pack = true;
        upPartRowLayout.marginLeft = 5;
        upPartRowLayout.marginTop = 5;
        upPartRowLayout.marginRight = 5;
        upPartRowLayout.marginBottom = 5;
        upPart.setLayout(upPartRowLayout);
        
        table = new Table(upPart, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI
                          | SWT.CHECK);
        
        table.setLinesVisible(true);
        table.setHeaderVisible(true);
        
        final TableColumn columnName = new TableColumn(table, SWT.CENTER);
        final TableColumn columnType = new TableColumn(table, SWT.CENTER);
        
        columnName.setWidth(210);
        columnName.setText("	Name	");
        columnType.setWidth(210);
        columnType.setText("	Type	");
        
        table.setLayoutData(new RowData(450, 240));
        
        /*
         * Simulates a radio button behavior
         */
        table.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                if (event.detail == SWT.CHECK) {
                    Object o = event.item;
                    if (!(o instanceof TableItem))
                        return;
                    
                    TableItem ti = (TableItem) o;
                    Object data = ti.getData();
                    GoalParameter serviceParameter = (GoalParameter) data;
                    if (ti.getChecked())
                        controller.setOutputParameter(serviceParameter, true);
                    else
                        controller.setOutputParameter(serviceParameter, false);
                }
            }
        });
        
        /*
         * Update the remove button if an item is selected
         */
        table.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
                int index = table.getSelectionIndex();
                
                if (allowGoalNameChanges) {
                    if (index < 0)
                        buttonRemove.setEnabled(false);
                    else
                        buttonRemove.setEnabled(true);
                }
                
            }
        });
        
        final TableEditor editor = new TableEditor(table);
        // The editor must have the same size as the cell and must
        // not be any smaller than 50 pixels.
        editor.horizontalAlignment = SWT.LEFT;
        editor.grabHorizontal = true;
        editor.minimumWidth = 50;
        // editing the second column
        final int EDITABLECOLUMN = 1;
        
        table.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                // Clean up any previous editor control
                Control oldEditor = editor.getEditor();
                
                TableItem item = (TableItem) e.item;
                if (item == null) {
                    return;
                }
                
                if (oldEditor != null) {
                    oldEditor.dispose(); // FIX the focus
                }
                // Identify the selected row
                
                // The control that will be the editor must be a child of the
                // Table
                final Text textNewEditor = new Text(table, SWT.NONE);
                
                textNewEditor.setText(item.getText(EDITABLECOLUMN));
                textNewEditor.addModifyListener(new ModifyListener() {
                    public void modifyText(ModifyEvent me) {
                        Text text = (Text) editor.getEditor();
                        editor.getItem()
                        .setText(EDITABLECOLUMN, text.getText());
                    }
                });
                
                /*
                 * TODO FIX the focus
                 */
                textNewEditor.selectAll();
                // newEditor.setFocus();
                editor.setEditor(textNewEditor, item, EDITABLECOLUMN);
            }
        });
    }
    
    public void update(Observable o, Object arg) {
        if (arg instanceof InsertGoalModel) {
            if (!viewInitialized)
                return;
            
            InsertGoalModel model = (InsertGoalModel) arg;
            
            if (!textGoalName.getText().equals(model.getGoalName()))
                textGoalName.setText(model.getGoalName());
            
            if (!textParamName.getText().equals(model.getParameterName()))
                textParamName.setText(model.getParameterName());
            
            if (getTitle() == null)
                setTitle(model.getPageTitle());
            
            if (getDescription() == null)
                setDescription(model.getPageDescription());
            
            this.allowGoalNameChanges = !(model.isGoalNameReadOnly());
            this.allowParametersChanges = !(model.isParametersReadOnly());
            
            textGoalName.setEnabled(allowGoalNameChanges);
            
            if (allowParametersChanges) {
                textParamName.setEnabled(true);
                if (model.getParameterName().equals(""))
                    buttonAdd.setEnabled(false);
                else
                    buttonAdd.setEnabled(true);
            } else {
                table.setEnabled(false);
                textParamName.setEnabled(false);
            }
            
            fillTable(model.getGoalParameters());
            
            if (model.isGoalComplete())
                setPageComplete(true);
            else
                setPageComplete(false);
            
        }
        
        if (arg instanceof SelectGoalModel) {
            SelectGoalModel model = (SelectGoalModel) arg;
            if (model.isNewGoal()) {
                table.setEnabled(true);
            }
        }
        
        if (arg instanceof SelfletWizardModel) {
            SelfletWizardModel model = (SelfletWizardModel) arg;
            setPageComplete(!(model.isActiveSelflet()));
        }
        
    }
    
    private void fillTable(ArrayList<GoalParameter> serviceParameters) {
        table.removeAll();
        
        TableItem newItem;
        for (GoalParameter gp : serviceParameters) {
            newItem = new TableItem(table, SWT.NONE);
            newItem.setText(new String[] { gp.getName(), gp.getType() });
            newItem.setChecked(gp.isOutput());
            newItem.setData(gp);
        }
        table.redraw();
    }
    
}
