package it.polimi.selfletclipse.util;


import it.polimi.selfletclipse.exceptions.EvaluationException;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class GoalXmlParser {

	/* element */
	public static final String GOAL_TAG = "service";
	public static final String INPUT_TAG = "input";
	public static final String OUTPUT_TAG = "output";
	public static final String OFFER_MODE_TAG = "offermode";
	public static final String IS_ACTIVE_TAG = "isActive";
	public static final String PARAM_TAG = "param";
	public static final String CAN_DO_TAG = "CanDo";
	public static final String CAN_TEACH_TAG = "CanTeach";
	public static final String BOTH_TAG = "Both";
	public static final String KNOWS_WHO_CAN_BOTH_TAG = "KnowsWhoCanBoth";
	public static final String KNOWS_WHO_CAN_DO_TAG = "KnowsWhoCanDo";
	public static final String KNOWS_WHO_CAN_TEACH_TAG = "KnowsWhoCanTeach";
	public static final String NONE_TAG = "None";
	public static final String TRUE_TAG = "true";
	public static final String FALSE_TAG = "false";

	/* attributes */
	public static final String NAME_TAG = "name";
	public static final String TYPE_TAG = "type";

	public static final String INT_TYPE = "int";
	public static final String FLOAT_TYPE = "float";
	public static final String DOUBLE_TYPE = "double";
	public static final String STRING_TYPE = "string";

	private static GoalRepresentation myGoalXml;
/**
 * Costruttore della classe GoalXmlParser.
 * @param path percorso del service.xml
 * @throws EvaluationException
 */
	public GoalXmlParser(String path) throws EvaluationException {

				
		myGoalXml = new GoalRepresentation();

		EvaluatorXml(path);
	
		//demostrate(myGoalXml);
		
	}// close GoalEvaluatorXml
/**
 * Il metodo provvede a validare l’xml e a memorizzare i dati in una variabile di tipo GoalRepresentation 
 * altrimenti solleva eccezioni di tipo EvaluatorException nel caso di formattazione non conforme al dtd.
 * @param path percorso del service.xml
 * @throws EvaluationException
 */
	public static void EvaluatorXml(String path) throws EvaluationException {

		Document doc = null;

		try {
			doc = parseFile(path);
		} catch (SAXException e) {
			throw new EvaluationException("Error while parsing condition", e);
		} catch (IOException e) {
			throw new EvaluationException("Error while parsing condition", e);
		} catch (ParserConfigurationException e) {
			throw new EvaluationException("Error while parsing condition", e);
		}

		NodeList nodes = doc.getElementsByTagName(GOAL_TAG);

		if (nodes.getLength() != 1) // un solo service per ogni xml
			throw new EvaluationException(
					"Unexpected number of service nodes in the xml file");

		String name = getNamedAttribute(nodes.item(0), NAME_TAG); // dal primo
		// nodo
		// controllo
		// se c'è
		// l'attributo
		// name

		if (name == null || name.trim().equalsIgnoreCase(""))
			throw new EvaluationException("Invalid attribute service name");
		else {
			myGoalXml.setNameGoal(name);
		}
		;

		removeTextNode(nodes);
		NodeList children = nodes.item(0).getChildNodes(); // restituisce i nodi
		// figli di service
		// (input,output,offermode,isActive)

		if (children.getLength() != 4) // controllo che ci siano
			// input,output,offermode,isActive
			throw new EvaluationException(
					"Unexpected number of nodes in the xml file. Only properties and resources attend");

		if (children.item(0).getNodeName() != INPUT_TAG)
			throw new EvaluationException(
					"Unexpected name of properties nodes in the xml file");
		if (children.item(1).getNodeName() != OUTPUT_TAG)
			throw new EvaluationException(
					"Unexpected name of resources nodes in the xml file");
		if (children.item(2).getNodeName() != OFFER_MODE_TAG)
			throw new EvaluationException(
					"Unexpected name of properties nodes in the xml file");
		if (children.item(3).getNodeName() != IS_ACTIVE_TAG)
			throw new EvaluationException(
					"Unexpected name of resources nodes in the xml file");

		removeTextNode(children);

		if (children.item(0).hasChildNodes()) {// controllo che ci sia almeno un
			// param

			NodeList inputParamNodes = children.item(0).getChildNodes();

			for (int i = 0; i < inputParamNodes.getLength(); i++) {

				if (inputParamNodes.item(i).getNodeName() != PARAM_TAG)
					throw new EvaluationException(
							"Unexpected name of nodes in the xml file");

				if (inputParamNodes.item(i).getTextContent() != "") // controllo
					// che sia
					// EMPTY
					throw new EvaluationException(
							"Unexpected content in param tag");

				String paramName, paramType;
				paramName = getNamedAttribute(inputParamNodes.item(i), NAME_TAG); // controllo
				// se
				// c'è
				// l'attributo
				// name
				paramType = getNamedAttribute(inputParamNodes.item(i), TYPE_TAG); // controllo
				// se
				// c'è
				// l'attributo
				// type

				if (paramName == null || paramName.trim().equalsIgnoreCase("")
						|| paramType == null
						|| paramType.trim().equalsIgnoreCase(""))
					throw new EvaluationException(
							"Invalid attribute in input nodes");
				else
					myGoalXml.setInput(paramName, paramType);

			}// close for

		}// close if

		NodeList outputNodes = children.item(1).getChildNodes();

		removeTextNode(outputNodes);

		if (outputNodes.item(0).getNodeName() != PARAM_TAG)
			throw new EvaluationException(
					"Unexpected name of nodes in the xml file");

		if (outputNodes.item(0).getTextContent() != "") // controllo che sia
			// EMPTY
			throw new EvaluationException("Unexpected content in param tag");

		String paramName, paramType;
		paramName = getNamedAttribute(outputNodes.item(0), NAME_TAG); // controllo
		// se
		// c'è
		// l'attributo
		// name
		paramType = getNamedAttribute(outputNodes.item(0), TYPE_TAG); // controllo
		// se
		// c'è
		// l'attributo
		// type

		if (paramName == null || paramName.trim().equalsIgnoreCase("")
				|| paramType == null || paramType.trim().equalsIgnoreCase(""))
			throw new EvaluationException("Invalid attribute in input nodes");
		else {
			myGoalXml.setOutputName(paramName);
			myGoalXml.setOutputType(paramType);
		}

		NodeList offerModeNodes = children.item(2).getChildNodes();

		if (offerModeNodes.getLength() != 1) // CanDo,CanTeach,Both,KnowsWhoCanBoth,KnowsWhoCanDo,KnowsWhoCanTeach,None
			throw new EvaluationException(
					"Unexpected number of nodes in the xml file.");

		if (offerModeNodes.item(0).getNodeName() != CAN_DO_TAG
				&& offerModeNodes.item(0).getNodeName() != CAN_TEACH_TAG
				&& offerModeNodes.item(0).getNodeName() != BOTH_TAG
				&& offerModeNodes.item(0).getNodeName() != KNOWS_WHO_CAN_BOTH_TAG
				&& offerModeNodes.item(0).getNodeName() != KNOWS_WHO_CAN_DO_TAG
				&& offerModeNodes.item(0).getNodeName() != KNOWS_WHO_CAN_TEACH_TAG
				&& offerModeNodes.item(0).getNodeName() != NONE_TAG)
			throw new EvaluationException(
					"Unexpected name of resources nodes in the xml file");

		if (offerModeNodes.item(0).getNodeName() == CAN_DO_TAG)
			myGoalXml.setOfferMode(CAN_DO_TAG);
		if (offerModeNodes.item(0).getNodeName() == CAN_TEACH_TAG)
			myGoalXml.setOfferMode(CAN_TEACH_TAG);
		if (offerModeNodes.item(0).getNodeName() == BOTH_TAG)
			myGoalXml.setOfferMode(BOTH_TAG);
		if (offerModeNodes.item(0).getNodeName() == KNOWS_WHO_CAN_BOTH_TAG)
			myGoalXml.setOfferMode(KNOWS_WHO_CAN_BOTH_TAG);
		if (offerModeNodes.item(0).getNodeName() == KNOWS_WHO_CAN_DO_TAG)
			myGoalXml.setOfferMode(KNOWS_WHO_CAN_DO_TAG);
		if (offerModeNodes.item(0).getNodeName() == KNOWS_WHO_CAN_TEACH_TAG)
			myGoalXml.setOfferMode(KNOWS_WHO_CAN_TEACH_TAG);
		if (offerModeNodes.item(0).getNodeName() == NONE_TAG)
			myGoalXml.setOfferMode(NONE_TAG);

		if (offerModeNodes.item(0).getTextContent() != "") // controllo che
			// siano EMPTY
			throw new EvaluationException("Unexpected content in param tag");

		NodeList isActiveNodes = children.item(3).getChildNodes();

		if (isActiveNodes.getLength() != 1) // Active or Passive
			throw new EvaluationException(
					"Unexpected number of nodes in the xml file.");

		if (isActiveNodes.item(0).getNodeName() != TRUE_TAG
				&& isActiveNodes.item(0).getNodeName() != FALSE_TAG)
			throw new EvaluationException(
					"Unexpected name of address nodes in the xml file");
		if (isActiveNodes.item(0).getNodeName() == TRUE_TAG)
			myGoalXml.setIsActive(true);
		if (isActiveNodes.item(0).getNodeName() == FALSE_TAG)
			myGoalXml.setIsActive(false);

	}// close EvaluatorXml

	/**
	 * Metodo che richiede in ingresso il path del file xml. 
	 * Ritorna un oggetto di tipo document dopo aver controlla che il file xml sia ben formato.
	 * @param filePath percorso del file xml
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

		docBuilder = docBuilderFactory.newDocumentBuilder();

		File sourceFile = new File(filePath);
		doc = docBuilder.parse(sourceFile);
		return doc;
	}// close parseFile

	/**
	 * Metodo che richiede in ingresso un nodo e il nome dell’attributo di cui si vuole conoscere il valore. 
	 * Il metodo restituisce il valore dell’attributo del nodo xml passatogli mentre ritorna null in caso l’attributo non sia presente.
	 * @param node nodo da analizzare
	 * @param Attributename
	 * @return
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
	}// close getNameAttribute
/**
 * Metodo che restituisce la NodeList  passatagli senza i nodi #Text.
 * @param myNodeList nodelist da analizzare
 * @return lista di nodi senza #Text
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

	}// close removeTextNode
/**
 * Metodo di controllo per verificare la coerenza tra xml fornito e i dati memorizzati. 
 * Il metodo stampa la rappresentazione del file xml contenuto nell’oggeto myGoalXml di tipo GoalRepresentation.
 * @param myGoalXml oggetto di tipo GoalXml da stampare
 */
	public static void demostrate(GoalRepresentation myGoalXml) {

		System.out.println("nome service:       " + myGoalXml.getNameGoal());
		for (int i = 0; i < myGoalXml.getInputName().size(); i++) {
			System.out.println("Input name:    " + myGoalXml.getInputName(i));
			System.out.println("Input type:    " + myGoalXml.getInputType(i));
		}
		System.out.println("Offer mode:        " + myGoalXml.getOfferMode());
		System.out.println("output name:       " + myGoalXml.getOutputName());
		System.out.println("output type:       " + myGoalXml.getOutputType());
		System.out.println("is Active:         " + myGoalXml.getIsActive());

	}
/**
 * Metodo che restituisce la rappresentazione del file xml contenuto nell’oggetto myGoalXml di tipo GoalRepresentation.
 * @return rappresentazione dell'xml del service
 */
	public static GoalRepresentation getMyGoalXml() {
		return myGoalXml;
	}
/**
 * Metodo che permette di assegnare all’oggetto myGoalXml il service passato per parametro.
 * @param myGoalXml oggetto di tipo serviceXml
 */
	public static void setMyGoalXml(GoalRepresentation myGoalXml) {
		GoalXmlParser.myGoalXml = myGoalXml;
	}

}// close class GoalEvaluatorXml
