/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Actions#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getActions()
 * @model extendedMetaData="name='actionsType' kind='elementOnly'"
 * @generated
 */
public interface Actions extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link selflet.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see selflet.SelfletPackage#getActions_Action()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Action> getAction();

} // Actions
