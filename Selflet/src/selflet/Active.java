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
 * A representation of the model object '<em><b>Active</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Active#getMainService <em>Main Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getActive()
 * @model extendedMetaData="name='activeType' kind='empty'"
 * @generated
 */
public interface Active extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Service</em>' attribute.
	 * @see #setMainService(String)
	 * @see selflet.SelfletPackage#getActive_MainService()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mainService'"
	 * @generated
	 */
	String getMainService();

	/**
	 * Sets the value of the '{@link selflet.Active#getMainService <em>Main Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Service</em>' attribute.
	 * @see #getMainService()
	 * @generated
	 */
	void setMainService(String value);

} // Active
