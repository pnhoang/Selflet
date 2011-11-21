package it.polimi.selfletclipse.util;

import it.polimi.selfletclipse.exceptions.EvaluationException;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SelfletXmlParser {

    /* element */
    public static final String SELFLET_TAG = "selflet";
    public static final String PROPERTIES_TAG = "properties";
    public static final String RESOURCES_TAG = "resources";
    public static final String AUTHOR_TAG = "author";
    public static final String DESCRIPTION_TAG = "description";
    public static final String ACTIVE_TAG = "active";
    public static final String PASSIVE_TAG = "passive";
    public static final String REDS_TAG = "reds";
    public static final String ADDRESS_TAG = "address";
    public static final String PORT_TAG = "port";
    public static final String LIME_TAG = "lime";
    public static final String KNOWLEDGE_TAG = "knowledge";
    public static final String TYPE_TAG = "type";
    public static final String SELFLET_PROPERTY_TAG = "selfletProperty";

    public static final String ABILITIES_TAG = "abilities";
    public static final String ABILITY_TAG = "ability";
    public static final String SERVICE_TAG = "service";
    public static final String METHOD_TAG = "method";
    public static final String PARAM_TYPE_TAG = "paramType";
    public static final String ACTIONS_TAG = "actions";
    public static final String ACTION_TAG = "action";
    public static final String BEHAVIORS_TAG = "behaviors";
    public static final String BEHAVIOR_TAG = "behavior";
    public static final String CONDITIONS_TAG = "conditions";
    public static final String CONDITION_TAG = "condition";
    public static final String GOALS_TAG = "goals";
    public static final String GOAL_TAG = "goal";
    public static final String RULES_TAG = "rules";
    public static final String RULE_TAG = "rule";

    /* attributes */
    public static final String NAME_TAG = "name";
    public static final String MAIN_GOAL_TAG = "mainGoal";
    public static final String VALUE_TAG = "value";
    public static final String FILE_TAG = "file";

    public static final String INT_TYPE = "int";
    public static final String FLOAT_TYPE = "float";
    public static final String DOUBLE_TYPE = "double";
    public static final String STRING_TYPE = "string";

    private static SelfletRepresentation mySelfletXml;

    /**
     * Costruttore della classe SelfletXmlParser.
     */
    public SelfletXmlParser(String path) throws EvaluationException {

	mySelfletXml = new SelfletRepresentation(new String());

	EvaluatorXml(path);

	// printRepresentation(mySelfletXml);

    }

    /**
     * Metodo che restituisce la rappresentazione del file xml contenuto
     * nell’oggetto mySelfletXml di tipo SelfletRepresentation.
     * 
     * @return rappresentazione della selflet
     */

    public SelfletRepresentation getMySelfletXml() {
	return mySelfletXml;
    }

    /**
     * Metodo che necessita come input il path del file selflet.xml da parsare.
     * Il metodo provvede a validare l’xml e a memorizzare i dati in una
     * variabile di tipo SelfletRepresentation altrimenti solleva eccezioni di
     * tipo EvaluatorException nel caso di formattazione non conforme al dtd.
     * 
     * @param filePath
     *            percorso di selflet.xml
     * @throws EvaluationException
     */
    public static void EvaluatorXml(String filePath) throws EvaluationException {

	Document doc = null;

	try {
	    doc = parseFile(filePath); // inserire path file xml workingDir +
	    // "/?????/" + expression
	} catch (SAXException e) {
	    throw new EvaluationException("SAX exception while parsing "
		    + filePath, e);
	} catch (IOException e) {
	    throw new EvaluationException("IO exception while parsing "
		    + filePath, e);
	} catch (ParserConfigurationException e) {
	    throw new EvaluationException(
		    "ParserConfiguration exception while parsing " + filePath,
		    e);
	}

	NodeList nodes = doc.getElementsByTagName(SELFLET_TAG);

	if (nodes.getLength() != 1) { // una sola selflet per ogni xml
	    throw new EvaluationException(
		    "Unexpected number of Selflet nodes in the xml file");
	}

	/*
	 * dal primo nodo controllo se c'è l'attributo name
	 */
	String name = getNamedAttribute(nodes.item(0), NAME_TAG);

	if (name == null || name.trim().equalsIgnoreCase("")) {
	    throw new EvaluationException("Invalid attribute selflet name");
	} else {
	    try {
		int id = Integer.parseInt(name);
	    } catch (NumberFormatException e) {
		/*
		 * throw new EvaluationException("SelfletId must be a number");
		 */
	    }
	    mySelfletXml.setNameSelflet(name);
	}

	// System.out.println("il nome della selflet è: "+mySelfletXml.getNameSelflet());

	removeTextNode(nodes);
	NodeList children = nodes.item(0).getChildNodes();
	// restituisce i nodi
	// figli di selflet
	// (properties,resources)

	if (children.getLength() != 2) // controllo che ci sia properties e
	    // resources
	    throw new EvaluationException(
		    "Unexpected number of nodes in the xml file. Only properties and resources attend");

	if (children.item(0).getNodeName() != PROPERTIES_TAG)
	    throw new EvaluationException(
		    "Unexpected name of properties nodes in the xml file");
	if (children.item(1).getNodeName() != RESOURCES_TAG)
	    throw new EvaluationException(
		    "Unexpected name of resources nodes in the xml file");

	removeTextNode(children);
	NodeList propertiesNodes = children.item(0).getChildNodes();

	if (propertiesNodes.getLength() < 5 || propertiesNodes.getLength() > 7) {

	    // for (int i = 0; i < propertiesNodes.getLength(); i++) {
	    // System.out.println(propertiesNodes.item(i));
	    // }

	    /*
	     * controllo che ci siano tute le properties
	     */
	    throw new EvaluationException(
		    "Unexpected number of nodes in properties "
			    + propertiesNodes.getLength());
	}

	if (propertiesNodes.item(0).getNodeName() != AUTHOR_TAG)
	    throw new EvaluationException(
		    "Unexpected name of author nodes in the xml file");
	else
	    mySelfletXml.setAuthor(propertiesNodes.item(0).getTextContent());

	if (propertiesNodes.item(1).getNodeName() != DESCRIPTION_TAG)
	    throw new EvaluationException(
		    "Unexpected name of description in the xml file");
	else
	    mySelfletXml.setDescription(propertiesNodes.item(1)
		    .getTextContent());

	if (propertiesNodes.item(2).getNodeName() != ACTIVE_TAG
		&& propertiesNodes.item(2).getNodeName() != PASSIVE_TAG)
	    throw new EvaluationException(
		    "Unexpected name of active/passive nodes in the xml file");

	if (propertiesNodes.item(2).getTextContent() != "") // controllo che sia
	    // EMPTY
	    throw new EvaluationException(
		    "Unexpected content in the active/passive nodes");

	if (propertiesNodes.item(2).getNodeName() == ACTIVE_TAG) {

	    String maingoal = getNamedAttribute(propertiesNodes.item(2),
		    MAIN_GOAL_TAG); // controllo se c'è l'attributo maingoal
	    if (maingoal == null || maingoal.trim().equalsIgnoreCase(""))
		throw new EvaluationException("Invalid attribute main goal");
	    else
		mySelfletXml.setActive_Maingoal(maingoal)/* memorizzare maingoal */;

	}// fine if active_tag

	if (propertiesNodes.item(2).getNodeName() == PASSIVE_TAG) {

	    mySelfletXml.setActive_Maingoal("");

	}

	if (propertiesNodes.item(3).getNodeName() != REDS_TAG)
	    throw new EvaluationException(
		    "Unexpected name of reds nodes in the xml file");

	removeTextNode(propertiesNodes);
	NodeList redsNodes = propertiesNodes.item(3).getChildNodes();

	if (redsNodes.getLength() != 2) // controllo che ci sia address e port
	    throw new EvaluationException(
		    "Unexpected number of nodes in reds node");

	if (redsNodes.item(0).getNodeName() != ADDRESS_TAG)
	    throw new EvaluationException(
		    "Unexpected name of address nodes in the xml file");
	else {
	    if (ValidateIPAddress(redsNodes.item(0).getTextContent()))
		mySelfletXml.setMyReds_Address(redsNodes.item(0)
			.getTextContent().trim());
	    else
		throw new EvaluationException(
			"Unexpected Address form in reds node");
	}

	if (redsNodes.item(1).getNodeName() != PORT_TAG)
	    throw new EvaluationException(
		    "Unexpected name of port nodes in the xml file");
	else {
	    if (Integer.parseInt(redsNodes.item(1).getTextContent().trim()) >= 0
		    && Integer.parseInt(redsNodes.item(1).getTextContent()
			    .trim()) <= 65535)
		mySelfletXml.setMyReds_Port(Integer.parseInt(redsNodes.item(1)
			.getTextContent().trim()));
	    else {
		throw new EvaluationException(
			"Invalid REDS port number");
	    }
	}

	if (propertiesNodes.item(4).getNodeName() != LIME_TAG)
	    throw new EvaluationException(
		    "Unexpected name of lime nodes in the xml file");

	NodeList limeNodes = propertiesNodes.item(4).getChildNodes();

	if (limeNodes.getLength() != 1) // controllo che ci sia port
	    throw new EvaluationException(
		    "Unexpected number of lime nodes in the xml file");

	if (limeNodes.item(0).getNodeName() != PORT_TAG)
	    throw new EvaluationException(
		    "Unexpected name of lime_port nodes in the xml file");
	else {
	    if (Integer.parseInt(limeNodes.item(0).getTextContent().trim()) >= 0
		    && Integer.parseInt(limeNodes.item(0).getTextContent()
			    .trim()) <= 65535)
		mySelfletXml.setLime_Port(Integer.parseInt(limeNodes.item(0)
			.getTextContent().trim()));
	    else
		throw new EvaluationException(
			"Unexpected number of port nodes in the xml file");

	}

	if (propertiesNodes.getLength() == 6) {

	    if (propertiesNodes.item(5).getNodeName() != KNOWLEDGE_TAG
		    && propertiesNodes.item(5).getNodeName() != TYPE_TAG)
		throw new EvaluationException(
			"Unexpected name of nodes in the xml file");

	    NodeList propertyNodes = propertiesNodes.item(5).getChildNodes();

	    if (propertyNodes.getLength() == 0)
		throw new EvaluationException(
			"Unexpected number of selflet property");

	    for (int i = 0; i < propertyNodes.getLength(); i++) {

		if (propertyNodes.item(i).getNodeName() != SELFLET_PROPERTY_TAG)
		    throw new EvaluationException(
			    "Unexpected name of nodes in the xml file");

		String type;
		String value;
		name = getNamedAttribute(propertyNodes.item(i), NAME_TAG); // controllo
		// se
		// c'è
		// l'attributo
		// name
		type = getNamedAttribute(propertyNodes.item(i), TYPE_TAG); // controllo
		// se
		// c'è
		// l'attributo
		// type
		value = getNamedAttribute(propertyNodes.item(i), VALUE_TAG);

		if (name == null || name.trim().equalsIgnoreCase("")
			|| type == null || type.trim().equalsIgnoreCase("")
			|| value == null || value.trim().equalsIgnoreCase(""))
		    throw new EvaluationException(
			    "Invalid attribute property of KNOWLEDGE or TYPE nodes");
		else {
		    if (propertiesNodes.item(5).getNodeName() == KNOWLEDGE_TAG) {
			mySelfletXml.setKnowledge(name, type, value);
		    }
		    if (propertiesNodes.item(5).getNodeName() == TYPE_TAG) {
			mySelfletXml.setType(name, type, value);
		    }
		}
		;

	    }

	}

	if (propertiesNodes.getLength() == 7) {

	    if (propertiesNodes.item(5).getNodeName() != KNOWLEDGE_TAG
		    && propertiesNodes.item(6).getNodeName() != TYPE_TAG)
		throw new EvaluationException(
			"Unexpected name of knowledge or type nodes in the xml file");

	    for (int j = 5; j < 7; j++) {

		NodeList propertyNodes = propertiesNodes.item(j)
			.getChildNodes();

		if (propertyNodes.getLength() == 0)
		    throw new EvaluationException(
			    "Unexpected number of selflet property");

		for (int i = 0; i < propertyNodes.getLength(); i++) {

		    if (propertyNodes.item(i).getNodeName() != SELFLET_PROPERTY_TAG)
			throw new EvaluationException(
				"Unexpected name of nodes in the xml file");

		    String type;
		    String value;
		    name = getNamedAttribute(propertyNodes.item(i), NAME_TAG); // controllo
		    // se
		    // c'è
		    // l'attributo
		    // name
		    type = getNamedAttribute(propertyNodes.item(i), TYPE_TAG); // controllo
		    // se
		    // c'è
		    // l'attributo
		    // type
		    value = getNamedAttribute(propertyNodes.item(i), VALUE_TAG);

		    if (name == null || name.trim().equalsIgnoreCase("")
			    || type == null || type.trim().equalsIgnoreCase("")
			    || value == null
			    || value.trim().equalsIgnoreCase(""))
			throw new EvaluationException(
				"Invalid attribute property of KNOWLEDGE or TYPE nodes");
		    else {
			if (propertiesNodes.item(j).getNodeName() == KNOWLEDGE_TAG) {
			    mySelfletXml.setKnowledge(name, type, value);
			}
			if (propertiesNodes.item(j).getNodeName() == TYPE_TAG) {
			    mySelfletXml.setType(name, type, value);
			}
		    }
		    ;

		}

	    }
	}

	NodeList resourcesNodes = children.item(1).getChildNodes();

	if (resourcesNodes.getLength() != 6) {// controllo che ci siano tute le
	    // resources
	    throw new EvaluationException(
		    "Unexpected number of resources nodes in the xml file");
	}

	if (resourcesNodes.item(0).getNodeName() != ABILITIES_TAG) {
	    throw new EvaluationException(
		    "Unexpected name of abilities nodes in the xml file");
	}
	if (resourcesNodes.item(0).hasChildNodes()) { // se c'è almeno un
	    // ability

	    removeTextNode(resourcesNodes);
	    NodeList abilitiesNodes = resourcesNodes.item(0).getChildNodes();

	    String file;
	    String service;

	    for (int i = 0; i < abilitiesNodes.getLength(); i++) { // for che
		// controlla
		// tutte le
		// ability

		Vector names = new Vector();
		Vector paramTypes = new Vector();
		removeTextNode(abilitiesNodes);
		NodeList abilityNodes = abilitiesNodes.item(i).getChildNodes();

		file = getNamedAttribute(abilitiesNodes.item(i), FILE_TAG);
		if (file == null || !validateEXTFile(file, "jar")) {
		    throw new EvaluationException(
			    "Invalid attribute file of ability: " + file);
		}

		if (abilityNodes.getLength() < 2) {// controllo che ci sia
		    // service e almeno un
		    // method
		    throw new EvaluationException(
			    "Unexpected number of nodes service and method in the xml file");
		}
		if (abilityNodes.item(0).getNodeName() != SERVICE_TAG) {
		    throw new EvaluationException(
			    "Unexpected name of service nodes in the xml file");
		}
		service = abilityNodes.item(0).getTextContent();

		for (int j = 1; j < abilityNodes.getLength(); j++) {

		    if (abilityNodes.item(j).getNodeName() != METHOD_TAG) {
			throw new EvaluationException(
				"Unexpected name of method nodes in the xml file");
		    }
		    name = getNamedAttribute(abilityNodes.item(j), NAME_TAG); // controllo
		    // che
		    // ci
		    // sia
		    // l'attributo
		    // name
		    // di
		    // method
		    if (name == null || name.trim().equalsIgnoreCase("")) {
			throw new EvaluationException(
				"Invalid attribute method name of ability");
		    }
		    names.add(name);
		    Vector paramType = new Vector();

		    if (abilityNodes.item(j).hasChildNodes()) {

			removeTextNode(abilityNodes);
			NodeList abilityNodesChildren = abilityNodes.item(j)
				.getChildNodes();

			for (int k = 0; k < abilityNodesChildren.getLength(); k++) {

			    if (abilityNodesChildren.item(k).getNodeName() != PARAM_TYPE_TAG)
				throw new EvaluationException(
					"Unexpected name of method name nodes in the xml file");

			    paramType.add(abilityNodes.item(j).getChildNodes()
				    .item(k).getTextContent());

			}// end for

		    }// end if
		    else
			paramType = null;
		    paramTypes.add(paramType);
		}// end for

		mySelfletXml.setAbility(file, service, names, paramTypes);

	    }// end for ability

	}// if almeno un ability

	if (resourcesNodes.item(1).getNodeName() != ACTIONS_TAG)
	    throw new EvaluationException(
		    "Unexpected name of acton nodes in the xml file");

	if (resourcesNodes.item(1).hasChildNodes()) {

	    NodeList actionsNodes = resourcesNodes.item(1).getChildNodes();

	    for (int i = 0; i < actionsNodes.getLength(); i++) {

		String file = getNamedAttribute(actionsNodes.item(i), FILE_TAG);

		if (file == null || !validateEXTFile(file, "java"))
		    throw new EvaluationException(
			    "Invalid attribute file of actions");
		else
		    mySelfletXml.setAction(file);

		if (actionsNodes.item(i).getTextContent() != "") // controllo
		    // che sia
		    // EMPTY
		    throw new EvaluationException(
			    "Unexpected content in the xml file");

	    }// end for action

	}// end if action

	if (resourcesNodes.item(2).getNodeName() != BEHAVIORS_TAG)
	    throw new EvaluationException(
		    "Unexpected name of behaviors nodes in the xml file");

	if (resourcesNodes.item(2).hasChildNodes()) {

	    NodeList behaviorsNodes = resourcesNodes.item(2).getChildNodes();

	    for (int i = 0; i < behaviorsNodes.getLength(); i++) {

		String file = getNamedAttribute(behaviorsNodes.item(i),
			FILE_TAG);

		if (file == null || !validateEXTFile(file, "xmi")) {
		    // TODO da rimettere!
		    /*
		     * throw new EvaluationException (
		     * "Invalid attribute of behaviors" );
		     */
		} else {
		    mySelfletXml.setBehaviors(file);

		}
		if (behaviorsNodes.item(i).getTextContent() != "") // controllo
		    // che sia
		    // EMPTY
		    throw new EvaluationException(
			    "Unexpected content in the tag behaviors");

	    }// end for behaviors

	}// end if behaviors

	if (resourcesNodes.item(3).getNodeName() != CONDITIONS_TAG)
	    throw new EvaluationException(
		    "Unexpected name of nodes in the xml file");

	if (resourcesNodes.item(3).hasChildNodes()) {

	    NodeList conditionsNodes = resourcesNodes.item(3).getChildNodes();

	    for (int i = 0; i < conditionsNodes.getLength(); i++) {

		String file = getNamedAttribute(conditionsNodes.item(i),
			FILE_TAG);

		if (file == null || !validateEXTFile(file, "xml"))
		    throw new EvaluationException(
			    "Invalid attribute in conditions tag");
		else
		    mySelfletXml.setConditions(file);

		if (conditionsNodes.item(i).getTextContent() != "") // controllo
		    // che sia
		    // EMPTY
		    throw new EvaluationException(
			    "Unexpected content in conditions tag");

	    }// end for conditions

	}// end if conditions

	if (resourcesNodes.item(4).getNodeName() != GOALS_TAG) {
	    throw new EvaluationException(
		    "Unexpected name of nodes in the xml file");
	}

	//
	if (resourcesNodes.item(4).hasChildNodes()) {

	    NodeList goalsNodes = resourcesNodes.item(4).getChildNodes();

	    for (int i = 0; i < goalsNodes.getLength(); i++) {

		String file = getNamedAttribute(goalsNodes.item(i), FILE_TAG);

		if (file == null || !validateEXTFile(file, "xml")) {
		    throw new EvaluationException(
			    "Invalid attribute of file goal: " + file);
		} else {

		    String projectPath = filePath;

		    // Remove the "selflet.xml" suffix to get the path
		    if (projectPath.endsWith("selflet.xml")) {
			projectPath = projectPath.substring(0, projectPath
				.length()
				- "selflet.xml".length());
		    }
		    mySelfletXml.addGoal(projectPath + file);
		}

		if (goalsNodes.item(i).getTextContent() != "") {// controllo che
		    // sia EMPTY
		    throw new EvaluationException(
			    "Unexpected content in the goal tag");
		}

	    }// end for goal

	}// end if goal

	if (resourcesNodes.item(5).getNodeName() != RULES_TAG)
	    throw new EvaluationException(
		    "Unexpected name of nodes in the xml file");

	if (resourcesNodes.item(5).hasChildNodes()) {

	    NodeList rulesNodes = resourcesNodes.item(5).getChildNodes();

	    for (int i = 0; i < rulesNodes.getLength(); i++) {

		String file = getNamedAttribute(rulesNodes.item(i), FILE_TAG);

		if (file == null || !validateEXTFile(file, "drl"))
		    throw new EvaluationException(
			    "Invalid attribute file of rules");
		else
		    mySelfletXml.setRules(file);

		if (rulesNodes.item(i).getTextContent() != "") // controllo che
		    // sia EMPTY
		    throw new EvaluationException(
			    "Unexpected content in the rules tag");

	    }// end for rules

	}// end if rules

    }

    /**
     * Metodo che richiede in ingresso il path del file xml. Ritorna un oggetto
     * di tipo document dopo aver controlla che il file xml sia ben formato.
     * 
     * @param filePath
     *            percorso di selflet.xml
     * @return documento xml valido
     * @throws SAXException
     * @throws IOException
     * @throws ParserConfigurationException
     */
    private static Document parseFile(String filePath) throws SAXException,
	    IOException, ParserConfigurationException {

	DocumentBuilder docBuilder;
	Document doc = null;
	DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
		.newInstance();
	docBuilderFactory.setIgnoringElementContentWhitespace(true);
	docBuilderFactory.setIgnoringComments(true);
	docBuilder = docBuilderFactory.newDocumentBuilder();

	File sourceFile = new File(filePath);
	doc = docBuilder.parse(sourceFile);
	return doc;
    }

    /**
     * Metodo che richiede in ingresso un nodo e il nome dell’attributo di cui
     * si vuole conoscere il valore. Il metodo restituisce il valore
     * dell’attributo del nodo xml passatogli mentre ritorna null in caso
     * l’attributo non sia presente.
     * 
     * @param node
     *            nodo da analizzare
     * @param Attributename
     * @return valore attributo
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

    /**
     * Metodo che restituisce la NodeList passatagli senza i nodi #Text.
     * 
     * @param myNodeList
     *            Nodelist da analizzare
     * @return nodelist senza nodi #text
     */
    private static NodeList removeTextNode(NodeList myNodeList) {

	NodeList children;

	for (int j = 0; j < myNodeList.getLength(); j++) {

	    children = myNodeList.item(j).getChildNodes();

	    for (int i = 0; i < children.getLength(); i++) {

		if (children.item(i).getNodeName() == "#text") {

		    myNodeList.item(j).removeChild(children.item(i));

		}
	    }
	}

	return myNodeList;

    }

    /**
     * Metodo che necessita come input la stringa ipAddress da verificare. Il
     * metodo restituisce true se l’indirizzo ip è corretto altrimenti
     * restituisce false.
     * 
     * @param ipAddress
     *            ip da convalidare
     * @return true se ip valido false altrimenti
     */
    private static boolean ValidateIPAddress(String ipAddress)

    {

	ipAddress = ipAddress.trim();

	String[] parts = ipAddress.split("\\.");

	if (parts.length != 4) {
	    return false;
	}

	for (String s : parts) {
	    int i = Integer.parseInt(s);

	    if ((i < 0) || (i > 255)) {
		return false;
	    }
	}

	return true;
    }

    /**
     * Il metodo stampa la rappresentazione del file xml contenuto nell’oggeto s
     * di tipo SelfletRepresentation
     * 
     * @param s
     *            selflet da stampare
     */
    private static void printRepresentation(SelfletRepresentation s) {

	/**
	 * General parameters
	 * */
	System.out.println("nome selflet:    " + s.getNameSelflet());
	System.out.println("nome autore:     " + s.getAuthor());
	System.out.println("descrizione:     " + s.getDescription());
	System.out.println("maingoal:        " + s.getActive_Maingoal());
	System.out.println("reds address:    " + s.getMyReds_Address());
	System.out.println("reds port:       " + s.getMyReds_Port());
	System.out.println("lime port:       " + s.getLime_Port());

	/**
	 * Knowledge base
	 * */
	System.out.println("Knowledge names: "
		+ s.getKnowledge_Name().toString());
	System.out.println("Knowledge type:  "
		+ s.getKnowledge_Type().toString());
	System.out.println("Knowledge value: "
		+ s.getKnowledge_Value().toString());

	/**
	 * Type knowledge
	 * */
	System.out.println("Type names:      " + s.getType_Name().toString());
	System.out.println("Type type:       " + s.getType_Type().toString());
	System.out.println("Type value:      " + s.getType_Value().toString());

	/**
	 * Abilities
	 * */
	for (int i = 0; i < s.getAbilitiesNumber(); i++) {

	    System.out.println("Ability file:    " + s.getAbility_File(i));

	    System.out.println("Ability service: " + s.getAbility_Service(i));

	    for (int j = 0; j < s.getAbility_method_number(i); j++) {

		System.out.println("Ability method:  "
			+ s.getAbility_method_name(i).get(j).toString());

		if (s.getAbility_method_paramType(i).get(j) != null) {
		    for (int k = 0; k < s.getAbility_method_paramType(i).get(j)
			    .size(); k++) {

			System.out.println("Ability method paramType: "
				+ s.getAbility_method_paramType(i).get(j)
					.get(k).toString());

		    }
		}
	    }
	}

	System.out.println("Action:         " + s.getAction().toString());
	System.out.println("behaviors:      " + s.getBehaviors().toString());
	System.out.println("conditions:     " + s.getConditions().toString());
	System.out.println("goals:          " + s.getGoals().toString());

	for (int i = 0; i < s.getMyGoalsXml().size(); i++) {
	    GoalXmlParser.demostrate(s.getMyGoalsXml().get(i));
	}
	System.out.println("rules:          " + s.getRules().toString());

    }

    /**
     * Metodo che necessita come input due stringhe, che sono il nome del file e
     * l’estensione attesa. Il metodo restituisce true se il file ha
     * l’estensione passata come parametro altrimenti restituisce false.
     * 
     * @param file
     *            file da verificarne l'estensione
     * @param ext
     *            estensione
     * @return true se il file ha l'estensione passata false altimenti
     */
    private static boolean validateEXTFile(String file, String ext) {

	file = file.trim();
	String[] parts = file.split("\\.");

	if (!parts[0].trim().equalsIgnoreCase("")
		&& parts[parts.length - 1].equalsIgnoreCase(ext)) {
	    return true;
	}

	return false;
    }

}