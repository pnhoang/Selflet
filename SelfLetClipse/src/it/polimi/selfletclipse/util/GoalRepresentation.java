package it.polimi.selfletclipse.util;

import java.util.Vector;

public class GoalRepresentation {

    private String nameGoal;
    private Vector<Parameter> inputVector;
    private Parameter output;
    private String offerMode;
    private Boolean isActive;

    /**
     * Costruttore della classe GoalRepresentation.
     */
    public GoalRepresentation() {

	inputVector = new Vector<Parameter>();
	output = new Parameter();

    }// close MyGoalXml

    /**
     * Metodo che restituisce il nome del Goal.
     * 
     * @return nome service
     */
    public String getNameGoal() {
	return nameGoal;
    }

    /**
     * Metodo che consente di assegnare alla variabile nameGoal il nome del
     * Goal.
     * 
     * @param nameGoal
     *            nome del service
     */
    public void setNameGoal(String nameGoal) {
	this.nameGoal = nameGoal;
    }

    /**
     * Metodo che restituisce il nome dell’i-esimo parametro di input.
     * 
     * @param i
     *            index
     * @return nome parametro di input
     */
    public String getInputName(int i) {
	return inputVector.get(i).name;
    }

    /**
     * Metodo che restituisce il type dell’i-esimo parametro di input.
     * 
     * @param i
     *            index
     * @return type parametro di input
     */
    public String getInputType(int i) {
	return inputVector.get(i).type;
    }

    /**
     * Metodo che restituisce il vettore contenente tutti i nomi dei parametri
     * di input.
     * 
     * @return vettore contenente i nomi dei parametri di input
     */
    public Vector<String> getInputName() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < inputVector.size(); i++) {

	    temp.add(inputVector.get(i).name);

	}

	return temp;

    }

    /**
     * Metodo che restituisce il vettore contenente tutti i type dei parametri
     * di input.
     * 
     * @return vettore contenente i type dei parametri di input
     */
    public Vector<String> getInputType() {

	Vector<String> temp = new Vector<String>();

	for (int i = 0; i < inputVector.size(); i++) {

	    temp.add(inputVector.get(i).type);

	}

	return temp;

    }

    /**
     * Metodo che consente di aggiungere al vettore inputVector un parametro di
     * input.
     * 
     * @param name
     *            nome input
     * @param type
     *            type input
     */
    public void setInput(String name, String type) {

	Parameter temp = new Parameter();
	temp.name = name;
	temp.type = type;

	inputVector.add(temp);

    }

    /**
     * Metodo che restituisce il nome del parametro di output del service.
     * 
     * @return nome parametro di output
     */
    public String getOutputName() {
	return output.name;
    }

    /**
     * Metodo che restituisce il type del parametro di output del service.
     * 
     * @return type parametro di output
     */
    public String getOutputType() {
	return output.type;
    }

    /**
     * Metodo che consente di assegnare alla variabile outputName il nome
     * dell’output del service.
     * 
     * @param name
     *            nome service output
     */
    public void setOutputName(String name) {
	this.output.name = name;
    }

    /**
     * Metodo che consente di assegnare alla variabile outputType il nome
     * dell’output del service.
     * 
     * @param type
     *            type service output
     */
    public void setOutputType(String type) {
	this.output.type = type;
    }

    /**
     * Metodo che restituisce true se il service è attivo o false se il service non è
     * attivo.
     * 
     * @return true se il service attivo false se il service non è attivo
     */
    public Boolean getIsActive() {
	return isActive;
    }

    /**
     * Metodo che consente di settare il service ad attivo o non attivo.
     * 
     * @param isActive
     *            true se è active
     */
    public void setIsActive(Boolean isActive) {
	this.isActive = isActive;
    }

    /**
     * Metodo che restituisce il valore della variabile offerMode;
     * 
     * @return valore di offermode
     */
    public String getOfferMode() {
	return offerMode;
    }

    /**
     * Metodo che consente di assegnare alla variabile offerMode il tipo di
     * offerMode del service;
     * 
     * @param offerMode
     *            tipo di offermode
     */
    public void setOfferMode(String offerMode) {
	this.offerMode = offerMode;
    }

}// close class MyGoalXml

/**
 * Inner class
 * 
 * Represent a parameter with the parameter name and type
 */
class Parameter {
    String name;
    String type;
}
