package it.polimi.selfletclipse.util;

import it.polimi.selfletclipse.model.Goal;
import it.polimi.selfletclipse.model.GoalParameter;

import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * @author Nicola
 */
public class XmlUtil {

    /**
     * Parse the input document and returns a goal object
     * 
     * @param doc
     *            the document to parse
     * @return the goal parsed from document
     * 
     * */
    public static Goal parseGoal(Document doc) {
	Goal goal = new Goal();
	ArrayList<GoalParameter> parameters = new ArrayList<GoalParameter>();

	Node node = doc.getFirstChild();
	if (!node.getNodeName().equals("goal"))
	    return null;

	String goalName = getNamedAttribute(node, "name");

	if (goalName == null)
	    return null;

	goal.setName(goalName);

	NodeList children = node.getChildNodes();

	if (children.getLength() != 5)
	    return null;
	
	Node input = children.item(1);
	Node output = children.item(3);

	if (!input.getNodeName().equals("input")
		|| !output.getNodeName().equals("output"))
	    return null;

	NodeList inParams = input.getChildNodes();
	for (int i = 0; i < inParams.getLength(); i++) {
	    Node it = inParams.item(i);
	    if (it.getNodeName().contains("#text"))
		continue;
	    String name = getNamedAttribute(it, "name");
	    String type = getNamedAttribute(it, "type");

	    if (name == null || type == null)
		return null;
	    
	    GoalParameter gp = new GoalParameter(name, type, false);
	    parameters.add(gp);
	}

	if (output.getChildNodes().getLength() != 3)
	    return null;

	Node outPar = output.getChildNodes().item(1);

	String name = getNamedAttribute(outPar, "name");
	String type = getNamedAttribute(outPar, "type");

	if (name == null || type == null)
	    return null;

	GoalParameter gp = new GoalParameter(name, type, true);
	parameters.add(gp);
	goal.setParameters(parameters);

	return goal;
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
    public static String getNamedAttribute(Node node, String Attributename) {

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
