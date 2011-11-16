/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.AbilityState#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getAbilityState()
 * @model
 * @generated
 */
public interface AbilityState extends State {
	/**
	 * Returns the value of the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' reference.
	 * @see #setDo(Action)
	 * @see selflet.SelfletPackage#getAbilityState_Do()
	 * @model required="true"
	 * @generated
	 */
	Action getDo();

	/**
	 * Sets the value of the '{@link selflet.AbilityState#getDo <em>Do</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Action value);

} // AbilityState
