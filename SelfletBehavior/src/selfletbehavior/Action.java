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
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selfletbehavior.Action#getBody <em>Body</em>}</li>
 *   <li>{@link selfletbehavior.Action#getActionFile <em>Action File</em>}</li>
 * </ul>
 * </p>
 *
 * @see selfletbehavior.SelfletbehaviorPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
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
	 * @see selfletbehavior.SelfletbehaviorPackage#getAction_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link selfletbehavior.Action#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Action File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action File</em>' attribute.
	 * @see #setActionFile(String)
	 * @see selfletbehavior.SelfletbehaviorPackage#getAction_ActionFile()
	 * @model
	 * @generated
	 */
	String getActionFile();

	/**
	 * Sets the value of the '{@link selfletbehavior.Action#getActionFile <em>Action File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action File</em>' attribute.
	 * @see #getActionFile()
	 * @generated
	 */
	void setActionFile(String value);

} // Action