package it.polimi.selfletclipse.views;

import it.polimi.selfletclipse.SelfLetPlugin;
import it.polimi.selfletclipse.ViewManager;
import it.polimi.selfletclipse.util.FileUtils;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author Nicola
 */
public class ViewArcCondition extends ViewPart {

    private static final Logger LOG = Logger.getLogger(ViewArcCondition.class);
    @SuppressWarnings("unused")
    private Composite parent;
    private Composite topLevel;
    private Label labelCondition = null;

    private static ViewArcCondition vac = null;

    public ViewArcCondition() {
	if (vac == null) {
	    SelfLetPlugin.Init();
	    vac = this;
	    ViewManager.setArcView(this);
	    LOG.info("Starting arc view");
	}
    }

    public static ViewArcCondition getInstance() {
	return vac;
    }

    @Override
    public void createPartControl(Composite parent) {
	this.parent = parent;
	topLevel = new Composite(parent, SWT.NONE);
	GridLayout gl = new GridLayout();
	gl.numColumns = 1;
	topLevel.setLayout(gl);
	topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
		| GridData.HORIZONTAL_ALIGN_FILL));
	topLevel.setFont(parent.getFont());

	labelCondition = new Label(topLevel, SWT.RIGHT);

	GridData gd1 = new GridData();
	gd1.horizontalAlignment = GridData.FILL;
	gd1.grabExcessHorizontalSpace = true;
	labelCondition.setLayoutData(gd1);

    }

    @Override
    public void setFocus() {
    }

    public String getFileCondition(IResource resource) {
	String s = new String();

	if (resource == null) {
	    return s;
	}

	IFile file = resource.getProject().getFile(
		"conditions/" + resource.getName());

	if (file == null) {
	    return s;
	}

	Document doc = FileUtils.loadDocumentFromXmlFile(resource);

	// TODO
	// Hypothesis: the xml is valid
	NodeList nodes = doc.getChildNodes();
	NodeList children = nodes.item(0).getChildNodes();
	Node condition = children.item(1);

	s = evaluateNode(condition);
	return s;

    }

    public void setLabelCondition(IResource resource) {
	final String s = getFileCondition(resource);
	setLabelCondition(s);
    }

    public void setLabelCondition(final String s) {

	labelCondition.getDisplay().syncExec(new Runnable() {

	    public void run() {
		labelCondition.setText(s);
	    }
	});
    }

    // TODO Move this code to another class

    /* Constants for parsing the XML file */
    public static final String CONDITION_TAG = "condition";
    public static final String OUTPUT_TAG = "output";
    public static final String PROPERTY_TAG = "property";
    public static final String AND_TAG = "and";
    public static final String OR_TAG = "or";

    public static final String EQUAL_TAG = "equals";
    public static final String NOT_EQUAL_TAG = "notEquals";
    public static final String GREATER_THAN_TAG = "greater";
    public static final String GREATER_THAN_EQUAL_TAG = "greaterEqual";
    public static final String LESS_THAN_TAG = "less";
    public static final String LESS_THAN_EQUAL_TAG = "lessEqual";

    public static final String TYPE_TAG = "type";
    public static final String NAME_TAG = "name";
    public static final String VALUE_TAG = "value";
    // public static final String OPERATOR_TAG = "operator";

    public static final String INT_TYPE = "int";
    public static final String FLOAT_TYPE = "float";
    public static final String DOUBLE_TYPE = "double";
    public static final String STRING_TYPE = "string";

    private String evaluateNode(Node node) {
	String nodeName = node.getNodeName();

	if (nodeName.equals(AND_TAG)) {

	    String s = new String();
	    NodeList children = node.getChildNodes();

	    for (int i = 0; i < children.getLength(); i++) {

		if (children.item(i).getNodeName().equals("#text"))
		    continue;

		if (s.length() == 0)
		    s = evaluateNode(children.item(i));
		else
		    s = s + " &&&& " + evaluateNode(children.item(i));
	    }
	    return s;

	} else if (nodeName.equals(OR_TAG)) {

	    String s = new String();
	    NodeList children = node.getChildNodes();
	    for (int i = 0; i < children.getLength(); i++) {

		if (children.item(i).getNodeName().equals("#text"))
		    continue;

		if (s.length() == 0) {
		    s = evaluateNode(children.item(i));
		} else {
		    s = s + " || " + evaluateNode(children.item(i));
		}
	    }
	    return s;
	} else if (nodeName.equals(EQUAL_TAG)) {

	    String s = new String();
	    NodeList children = node.getChildNodes();

	    Node child01 = children.item(1);
	    Node child02 = children.item(3);

	    s = " (" + evaluateNode(child01) + " == " + evaluateNode(child02)
		    + ") ";

	    return s;
	} else if (nodeName.equals(NOT_EQUAL_TAG)) {

	    String s = new String();
	    NodeList children = node.getChildNodes();

	    Node child01 = children.item(1);
	    Node child02 = children.item(3);

	    s = " (" + evaluateNode(child01) + " != " + evaluateNode(child02)
		    + ") ";

	    return s;
	}

	else if (nodeName.equals(VALUE_TAG)) {

	    String s = new String();
	    s = getNamedAttribute(node, VALUE_TAG);
	    return s;

	} else if (nodeName.equals(OUTPUT_TAG)) {

	    return "Output";

	}

	return new String();
    }

    /**
     * Helper method to read the value of a node's specified attribute.
     * 
     * @param node
     *            the node to examine
     * @param Attributename
     *            the name of the attribute which must be read
     * @return the value of the attribute, or null if the attribute doesn't
     *         exist in the given node
     */
    private static String getNamedAttribute(Node node, String Attributename) {

	NamedNodeMap stateAttr = node.getAttributes();
	if (stateAttr == null)
	    return null;

	for (int i = 0; i < stateAttr.getLength(); i++) {

	    Node attribute = stateAttr.item(i);

	    if (attribute.getNodeName().equals(Attributename)) {
		return attribute.getNodeValue();
	    }
	}

	return null;
    }

}
