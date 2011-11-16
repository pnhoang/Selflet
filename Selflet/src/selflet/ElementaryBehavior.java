/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.ElementaryBehavior#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getElementaryBehavior()
 * @model
 * @generated
 */
public interface ElementaryBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link selflet.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see selflet.SelfletPackage#getElementaryBehavior_States()
	 * @model containment="true" lower="3" upper="3"
	 * @generated
	 */
	EList<State> getStates();

} // ElementaryBehavior
