/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selfletbehavior.State#getAction <em>Action</em>}</li>
 *   <li>{@link selfletbehavior.State#getName <em>Name</em>}</li>
 *   <li>{@link selfletbehavior.State#getNext <em>Next</em>}</li>
 *   <li>{@link selfletbehavior.State#getTargetBehavior <em>Target Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see selfletbehavior.SelfletbehaviorPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link selfletbehavior.Action#getTargetState <em>Target State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see selfletbehavior.SelfletbehaviorPackage#getState_Action()
	 * @see selfletbehavior.Action#getTargetState
	 * @model opposite="targetState" containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link selfletbehavior.State#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see selfletbehavior.SelfletbehaviorPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link selfletbehavior.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference list.
	 * The list contents are of type {@link selfletbehavior.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference list.
	 * @see selfletbehavior.SelfletbehaviorPackage#getState_Next()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getNext();

	/**
	 * Returns the value of the '<em><b>Target Behavior</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link selfletbehavior.Behavior#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Behavior</em>' container reference.
	 * @see #setTargetBehavior(Behavior)
	 * @see selfletbehavior.SelfletbehaviorPackage#getState_TargetBehavior()
	 * @see selfletbehavior.Behavior#getState
	 * @model opposite="state" transient="false"
	 * @generated
	 */
	Behavior getTargetBehavior();

	/**
	 * Sets the value of the '{@link selfletbehavior.State#getTargetBehavior <em>Target Behavior</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Behavior</em>' container reference.
	 * @see #getTargetBehavior()
	 * @generated
	 */
	void setTargetBehavior(Behavior value);

} // State
