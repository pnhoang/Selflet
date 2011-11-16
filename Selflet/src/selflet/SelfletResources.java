/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.SelfletResources#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link selflet.SelfletResources#getActions <em>Actions</em>}</li>
 *   <li>{@link selflet.SelfletResources#getConditions <em>Conditions</em>}</li>
 *   <li>{@link selflet.SelfletResources#getServices <em>Services</em>}</li>
 *   <li>{@link selflet.SelfletResources#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getSelfletResources()
 * @model extendedMetaData="name='selfletResources' kind='elementOnly'"
 * @generated
 */
public interface SelfletResources extends EObject {
	/**
	 * Returns the value of the '<em><b>Abilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abilities</em>' containment reference.
	 * @see #setAbilities(Abilities)
	 * @see selflet.SelfletPackage#getSelfletResources_Abilities()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abilities' namespace='##targetNamespace'"
	 * @generated
	 */
	Abilities getAbilities();

	/**
	 * Sets the value of the '{@link selflet.SelfletResources#getAbilities <em>Abilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abilities</em>' containment reference.
	 * @see #getAbilities()
	 * @generated
	 */
	void setAbilities(Abilities value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(Actions)
	 * @see selflet.SelfletPackage#getSelfletResources_Actions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actions' namespace='##targetNamespace'"
	 * @generated
	 */
	Actions getActions();

	/**
	 * Sets the value of the '{@link selflet.SelfletResources#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(Actions value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(Conditions)
	 * @see selflet.SelfletPackage#getSelfletResources_Conditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	Conditions getConditions();

	/**
	 * Sets the value of the '{@link selflet.SelfletResources#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(Conditions value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Services)
	 * @see selflet.SelfletPackage#getSelfletResources_Services()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='services' namespace='##targetNamespace'"
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link selflet.SelfletResources#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference.
	 * @see #setRules(Rules)
	 * @see selflet.SelfletPackage#getSelfletResources_Rules()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rules' namespace='##targetNamespace'"
	 * @generated
	 */
	Rules getRules();

	/**
	 * Sets the value of the '{@link selflet.SelfletResources#getRules <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' containment reference.
	 * @see #getRules()
	 * @generated
	 */
	void setRules(Rules value);

} // SelfletResources
