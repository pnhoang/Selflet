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
 * A representation of the model object '<em><b>Complex Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.ComplexBehavior#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getComplexBehavior()
 * @model
 * @generated
 */
public interface ComplexBehavior extends Behavior {
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
	 * @see selflet.SelfletPackage#getComplexBehavior_States()
	 * @model containment="true" lower="3"
	 * @generated
	 */
	EList<State> getStates();

} // ComplexBehavior
