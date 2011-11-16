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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Input#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getInput()
 * @model extendedMetaData="name='inputType' kind='elementOnly'"
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link selflet.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see selflet.SelfletPackage#getInput_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // Input
