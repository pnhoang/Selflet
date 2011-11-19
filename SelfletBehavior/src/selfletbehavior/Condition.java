/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selfletbehavior.Condition#getBody <em>Body</em>}</li>
 *   <li>{@link selfletbehavior.Condition#getConditionFile <em>Condition File</em>}</li>
 *   <li>{@link selfletbehavior.Condition#getTargetState <em>Target State</em>}</li>
 * </ul>
 * </p>
 *
 * @see selfletbehavior.SelfletbehaviorPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see selfletbehavior.SelfletbehaviorPackage#getCondition_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link selfletbehavior.Condition#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Condition File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition File</em>' attribute.
	 * @see #setConditionFile(String)
	 * @see selfletbehavior.SelfletbehaviorPackage#getCondition_ConditionFile()
	 * @model
	 * @generated
	 */
	String getConditionFile();

	/**
	 * Sets the value of the '{@link selfletbehavior.Condition#getConditionFile <em>Condition File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition File</em>' attribute.
	 * @see #getConditionFile()
	 * @generated
	 */
	void setConditionFile(String value);

	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see selfletbehavior.SelfletbehaviorPackage#getCondition_TargetState()
	 * @model
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link selfletbehavior.Condition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

} // Condition
