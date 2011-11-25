package it.polimi.selfletclipse.util;


import it.polimi.selfletclipse.exceptions.EvaluationException;

import java.util.Vector;

public class SelfletRepresentation {

    private String nameSelflet;
    private SelfletProperties properties;
    private SelfletResources resources;
    private Vector<GoalRepresentation> servicesXml = new Vector<GoalRepresentation>();

    /**
     * Costruttore della classe SelfletRepresentation
     * */
    public SelfletRepresentation(String name) {
	nameSelflet = name;
	properties = new SelfletProperties();
	resources = new SelfletResources();
    }

    /**
     * Metodo che consente di assegnare alla variabile nameSelflet il nome della
     * selflet.
     * 
     * @param name
     *            nome selflet
     */
    public void setNameSelflet(String name) {
	nameSelflet = name;
    }

    /**
     * Metodo che restituisce il nome della selflet.
     * 
     * @return nome selfelt
     */
    public String getNameSelflet() {
	return (nameSelflet);
    }

    /**
     * Metodo che consente di assegnare alla variabile author il nome
     * dell誕utore della selflet.
     * 
     * @param author
     *            autore selflet
     */
    public void setAuthor(String author) {
	properties.author = author;
    }

    /**
     * Metodo che restituisce il nome dell誕utore della selflet.
     * 
     * @return autore selflet
     */
    public String getAuthor() {
	return (properties.author);
    }

    /**
     * Metodo che consente di assegnare alla variabile description la
     * descrizione della selflet.
     * 
     * @param description
     *            descrizione selflet
     */
    public void setDescription(String description) {
	properties.description = description;
    }

    /**
     * Metodo che restituisce la descrizione della selflet.
     * 
     * @return destrizione selflet
     */
    public String getDescription() {
	return (properties.description);
    }

    /**
     * Metodo che consente di assegnare alla variabile active_Mainservice l誕ctive
     * mainservice della selflet.
     * 
     * @param active_Mainservice
     *            active main service
     */
    public void setActive_Mainservice(String active_Mainservice) {
	properties.active_Mainservice = active_Mainservice;
    }

    /**
     * Metodo che restituisce l誕ctive mainservice della selflet.
     * 
     * @return active mainservice
     */
    public String getActive_Mainservice() {
	return (properties.active_Mainservice);
    }

    /**
     * Metodo che consente di assegnare alla variabile MyReds.Address l誕ddress.
     * 
     * @param Address
     *            Reds address
     */
    public void setMyReds_Address(String Address) {
	properties.myReds.address = Address;
    }

    /**
     * Metodo che restituisce l誕ddress.
     * 
     * @return reds address
     */
    public String getMyReds_Address() {
	return (properties.myReds.address);
    }

    /**
     * Metodo che consente di assegnare alla variabile MyReds.Port la porta
     * specificata.
     * 
     * @param Port
     *            Reds port
     */
    public void setMyReds_Port(int Port) {
	properties.myReds.port = Port;
    }

    /**
     * Metodo che restituisce la port.
     * 
     * @return reds port
     */
    public int getMyReds_Port() {
	return (properties.myReds.port);
    }

    /**
     * Metodo che consente di assegnare alla variabile Lime_Port la porta
     * specificata.
     * 
     * @param Port
     *            Lime port
     */
    public void setLime_Port(int Port) {
	properties.lime_Port = Port;
    }

    /**
     * Metodo che restituisce la port.
     * 
     * @return lime port
     */
    public int getLime_Port() {
	return (properties.lime_Port);
    }

    /**
     * Metodo che consente di aggiungere una selfletProperty della Knowledge con
     * i parametri passati.
     * 
     * @param name
     *            nome selflet property knowledge
     * @param type
     *            type selflet property knowledge
     * @param value
     *            value selfelt property knowledge
     */
    public void setKnowledge(String name, String type, String value) {

	properties.mySelfletProperty = properties.new MySelfletProperty();
	properties.mySelfletProperty.name = name;
	properties.mySelfletProperty.type = type;
	properties.mySelfletProperty.value = value;
	properties.knowledge.add(properties.mySelfletProperty);

    }

    /**
     * Metodo che restituisce l段-esimo nome della Knowledge selfletProperty.
     * 
     * @param i
     *            index
     * @return name knowledge selflet property
     */
    public String getKnowledge_Name(int i) {
	return (String) (properties.knowledge.get(i).name);
    }

    /**
     * Metodo che restituisce un vettore di stringhe contenente tutti i nomi
     * delle selfletProperty della Knowledge.
     * 
     * @return vettore dei nomi della knowledge selflet property
     */
    public Vector<String> getKnowledge_Name() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < properties.knowledge.size(); i++) {

	    temp.add(properties.knowledge.get(i).name);

	}

	return temp;
    }

    /**
     * Metodo che restituisce l段-esimo type della Knowledge selfletProperty.
     * 
     * @param i
     *            index
     * @return type knowledge selflet property
     */
    public String getKnowledge_Type(int i) {
	return (String) (properties.knowledge.get(i).type);
    }

    /**
     * Metodo che restituisce un vettore di stringhe contenente tutti i type
     * delle selfletProperty della Knowledge.
     * 
     * @return vettore dei type della knowledge selflet property
     */
    public Vector<String> getKnowledge_Type() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < properties.knowledge.size(); i++) {

	    temp.add(properties.knowledge.get(i).type);

	}

	return temp;
    }

    /**
     * Metodo che restituisce l段-esimo value della Knowledge selfletProperty.
     * 
     * @param i
     *            index
     * @return value knowledge selflet property
     */
    public String getKnowledge_Value(int i) {
	return (String) (properties.knowledge.get(i).value);
    }

    /**
     * Metodo che restituisce un vettore di stringhe contenente tutti i value
     * delle selfletProperty della Knowledge.
     * 
     * @return vettore dei value della knowledge selflet property
     */
    public Vector<String> getKnowledge_Value() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < properties.knowledge.size(); i++) {

	    temp.add(properties.knowledge.get(i).value);

	}

	return temp;
    }

    /**
     * Metodo che consente di aggiungere una selfletProperty della Type con i
     * parametri passati.
     * 
     * @param name
     *            nome selflet property Type
     * @param type
     *            type selflet property Type
     * @param value
     *            value selflet property Type
     */
    public void setType(String name, String type, String value) {
	properties.mySelfletProperty = properties.new MySelfletProperty();
	properties.mySelfletProperty.name = name;
	properties.mySelfletProperty.type = type;
	properties.mySelfletProperty.value = value;
	properties.type.add(properties.mySelfletProperty);
    }

    /**
     * Metodo che restituisce l段-esimo nome della Type selfletProperty.
     * 
     * @param i
     *            index
     * @return nome type selflet property
     */
    public String getType_Name(int i) {
	return (String) (properties.type.get(i).name);
    }

    /**
     * Metodo che restituisce un vettore di stringhe contenente tutti i nomi
     * delle selfletProperty della Type.
     * 
     * @return vettore dei nome del type selflet property
     */
    public Vector<String> getType_Name() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < properties.type.size(); i++) {

	    temp.add(properties.type.get(i).name);

	}

	return temp;
    }

    /**
     * Metodo che restituisce l段-esimo type della Type selfletProperty.
     * 
     * @param i
     *            index
     * @return type type selflet property
     */
    public String getType_Type(int i) {
	return (String) (properties.type.get(i).type);
    }

    /**
     * Metodo che restituisce un vettore di stringhe contenente tutti i type
     * delle selfletProperty della Type.
     * 
     * @return vettore dei type del type selflet property
     */
    public Vector<String> getType_Type() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < properties.type.size(); i++) {

	    temp.add(properties.type.get(i).type);

	}

	return temp;
    }

    /**
     * Metodo che restituisce l段-esimo value della Type selfletProperty.
     * 
     * @param i
     *            index
     * @return value type selflet property
     */
    public String getType_Value(int i) {
	return (String) (properties.type.get(i).value);
    }

    /**
     * Metodo che restituisce un vettore di stringhe contenente tutti i value
     * delle selfletProperty della Type.
     * 
     * @return vettore dei value del type selflet property
     */
    public Vector<String> getType_Value() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < properties.type.size(); i++) {

	    temp.add(properties.type.get(i).value);

	}

	return temp;
    }

    // RESOURCES
    /**
     * Metodo che consente di aggiungere una Ability all誕bilitiesVector con i
     * parametri passati.
     */
    public void setAbility(String ability_file, String service,
	    Vector<String> method_name, Vector<Vector> paramType) {

	resources.myAbility.file = ability_file;
	resources.myAbility.service = service;
	resources.myAbility.method_name = method_name;
	resources.myAbility.method_param = paramType;
	resources.abilitiesVector.add(resources.myAbility);

	resources.myAbility = resources.new SelfletAbility();

    }

    /**
     * Metodo che restituisce la lunghezza dell誕bilitiesVector ovvero il numero
     * delle Ability.
     * 
     * @return numero ability
     */
    public int getAbilitiesNumber() {
	return resources.abilitiesVector.size();
    }

    /**
     * Metodo che restituisce l段-esimo file dell誕bilitiesVector
     * 
     * @param i
     *            index
     * @return file abilities
     */
    public String getAbility_File(int i) {
	return (String) resources.abilitiesVector.get(i).file;
    }

    /**
     * Metodo che restituisce l段-esimo service dell誕bilitiesVector.
     * 
     * @param i
     *            index
     * @return service abilities
     */
    public String getAbility_Service(int i) {
	return (String) resources.abilitiesVector.get(i).service;
    }

    /**
     * Metodo che restituisce il numero di method della i-esima abilities.
     * 
     * @param i
     *            index
     * @return numero di method
     */
    public int getAbility_method_number(int i) {
	return resources.abilitiesVector.get(i).method_name.size();
    }

    /**
     * Metodo che restituisce un vettore di stringhe contente i nomi dei method
     * dell段-esima abilities.
     * 
     * @param i
     *            index
     * @return vettore dei nomi di method
     */
    public Vector<String> getAbility_method_name(int i) {
	return (Vector<String>) resources.abilitiesVector.get(i).method_name;
    }

    /**
     * Metodo che restituisce un vettore di stringhe contente i nomi dei
     * paramType dell段-esima abilities.
     * 
     * @param i
     *            index
     * @return vettore dei nomi dei paramtype
     */
    public Vector<Vector> getAbility_method_paramType(int i) {
	return (Vector<Vector>) resources.abilitiesVector.get(i).method_param;
    }

    /**
     * Metodo che consente di aggiungere una Action con il parametro passato.
     * 
     * @param action
     *            action
     */
    public void setAction(String action) {
	resources.actions.add(action);
    }

    /**
     * Metodo che restituisce una stringa con l段-esima Action.
     * 
     * @param i
     *            index
     * @return action
     */
    public String getAction(int i) {
	return (resources.actions.get(i).toString());
    }

    /**
     * Metodo che restituisce un vettore di stringhe con l段nsieme delle Action.
     * 
     * @return vettore delle action
     */
    public Vector<String> getAction() {
	return resources.actions;
    }

    /**
     * Metodo che consente di aggiungere un Behaviors con il parametro passato.
     * 
     * @param behaviors
     *            behaviors
     */
    public void setBehaviors(String behaviors) {
	resources.behaviors.add(behaviors);
    }

    /**
     * Metodo che restituisce una stringa con l段-esimo Behaviors.
     * 
     * @param i
     *            index
     * @return behavior
     */
    public String getBehaviors(int i) {
	return (resources.behaviors.get(i).toString());
    }

    /**
     * Metodo che restituisce un vettore di stringhe con l段nsieme dei
     * Behaviors.
     * 
     * @return vettore dei behaviors
     */
    public Vector<String> getBehaviors() {
	return resources.behaviors;
    }

    /**
     * Metodo che consente di aggiungere una Conditions con il parametro
     * passato.
     * 
     * @param conditions
     *            condition
     */
    public void setConditions(String conditions) {
	resources.conditions.add(conditions);
    }

    /**
     * Metodo che restituisce una stringa con l段-esima Conditions.
     * 
     * @param i
     *            index
     * @return condition
     */
    public String getConditions(int i) {
	return (resources.conditions.get(i).toString());
    }

    /**
     * Metodo che restituisce un vettore di stringhe con l段nsieme delle
     * Conditions.
     * 
     * @return vettore delle condition
     */
    public Vector<String> getConditions() {
	return resources.conditions;
    }

    /**
     * Metodo che aggiunge il nome del service al vettore dei service e istanzia un
     * oggetto serviceXmlParser con il parametro passato. Aggiunge al vettore
     * serviceXml la rappresentazione del service parsato.
     * 
     * @param services
     */
    public void addGoal(String services) {

	resources.services.add(services);
	GoalXmlParser myGoalXml;
	try {

	    myGoalXml = new GoalXmlParser(services);
	    servicesXml.add(myGoalXml.getMyGoalXml());
	} catch (EvaluationException e) {
	}

    }

    /**
     * Metodo che restituisce la rappresentazione dell段-esimo Goals.
     * 
     * @param i
     *            index
     * @return rappresentazione del service
     */
    public GoalRepresentation getGoalRepresentation(int i) {
	return (GoalRepresentation) (servicesXml.get(i));
    }

    /**
     * Metodo che restituisce l段-esimo Goals.
     * 
     * @param i
     *            index
     * @return service
     */
    public String getGoals(int i) {
	return (resources.services.get(i).toString());
    }

    /**
     * Metodo che restituisce un vettore di stringhe con l段nsieme dei Goals.
     * 
     * @return vettore dei service
     */
    public Vector<String> getGoals() {
	return resources.services;
    }

    /**
     * Metodo che consente di aggiungere una Rules con il parametro passato.
     * 
     * @param rules
     *            rule
     */
    public void setRules(String rules) {
	resources.rules.add(rules);
    }

    /**
     * Metodo che restituisce una stringa con l段-esimo Rules.
     * 
     * @param i
     *            index
     * @return rule
     */
    public String getRules(int i) {
	return (resources.rules.get(i).toString());
    }

    /**
     * Metodo che restituisce un vettore di stringhe con l段nsieme delle Rules.
     * 
     * @return vettore dei rules
     */
    public Vector<String> getRules() {
	return resources.rules;
    }

    /**
     * Inner class
     * */
    public class SelfletProperties {

	private String author;
	private String description;
	private String active_Mainservice;

	private MyReds myReds = new MyReds();

	/**
	 * Inner class
	 * */
	private class MyReds {
	    private String address;
	    private int port;
	}

	private int lime_Port;

	private MySelfletProperty mySelfletProperty = new MySelfletProperty();

	/**
	 * Inner class
	 * */
	public class MySelfletProperty {
	    String name, type, value;
	}

	private Vector<MySelfletProperty> knowledge = new Vector<MySelfletProperty>();
	private Vector<MySelfletProperty> type = new Vector<MySelfletProperty>();

    }// end Myproperties definition

    /**
     * Inner class
     * */
    public class SelfletResources {

	private Vector<SelfletAbility> abilitiesVector = new Vector<SelfletAbility>();
	private SelfletAbility myAbility = new SelfletAbility();

	/**
	 * Inner class
	 * */
	public class SelfletAbility {

	    private String service;
	    private Vector<String> method_name = new Vector<String>();
	    private Vector<Vector> method_param = new Vector<Vector>();
	    private String file;

	}// MyAbility

	private Vector<String> actions = new Vector<String>();
	private Vector<String> behaviors = new Vector<String>();
	private Vector<String> conditions = new Vector<String>();
	private Vector<String> services = new Vector<String>();
	private Vector<String> rules = new Vector<String>();

    }// MyResources

    /**
     * Metodo che restituisce un vettore di oggetti di tipo GoalRepresentation
     * con l段nsieme delle rappresentazioni dei Goals.
     * 
     * @return vettore contenente la rappresentazione dei service
     */
    public Vector<GoalRepresentation> getMyGoalsXml() {
	return servicesXml;
    }

    /**
     * Metodo che consente di aggiungere un oggetto myGoalsXml con il parametro
     * passato.
     * 
     * @param myGoalsXml
     *            GoalXml
     */
    public void setMyGoalsXml(Vector<GoalRepresentation> myGoalsXml) {
	this.servicesXml = myGoalsXml;
    }

}
