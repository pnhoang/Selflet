/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.InvocationState#getInvoke <em>Invoke</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getInvocationState()
 * @model
 * @generated
 */
public interface InvocationState extends State {
	/**
	 * Returns the value of the '<em><b>Invoke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoke</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoke</em>' reference.
	 * @see #setInvoke(Service)
	 * @see selflet.SelfletPackage#getInvocationState_Invoke()
	 * @model
	 * @generated
	 */
	Service getInvoke();

	/**
	 * Sets the value of the '{@link selflet.InvocationState#getInvoke <em>Invoke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoke</em>' reference.
	 * @see #getInvoke()
	 * @generated
	 */
	void setInvoke(Service value);

} // InvocationState
