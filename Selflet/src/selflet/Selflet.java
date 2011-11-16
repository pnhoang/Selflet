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
 * A representation of the model object '<em><b>Selflet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Selflet#getSelfletProperties <em>Selflet Properties</em>}</li>
 *   <li>{@link selflet.Selflet#getSelfletResources <em>Selflet Resources</em>}</li>
 *   <li>{@link selflet.Selflet#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getSelflet()
 * @model extendedMetaData="name='selflet' kind='elementOnly'"
 * @generated
 */
public interface Selflet extends EObject {
	/**
	 * Returns the value of the '<em><b>Selflet Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selflet Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selflet Properties</em>' containment reference.
	 * @see #setSelfletProperties(SelfletProperties)
	 * @see selflet.SelfletPackage#getSelflet_SelfletProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='selfletProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	SelfletProperties getSelfletProperties();

	/**
	 * Sets the value of the '{@link selflet.Selflet#getSelfletProperties <em>Selflet Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selflet Properties</em>' containment reference.
	 * @see #getSelfletProperties()
	 * @generated
	 */
	void setSelfletProperties(SelfletProperties value);

	/**
	 * Returns the value of the '<em><b>Selflet Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selflet Resources</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selflet Resources</em>' containment reference.
	 * @see #setSelfletResources(SelfletResources)
	 * @see selflet.SelfletPackage#getSelflet_SelfletResources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='selfletResources' namespace='##targetNamespace'"
	 * @generated
	 */
	SelfletResources getSelfletResources();

	/**
	 * Sets the value of the '{@link selflet.Selflet#getSelfletResources <em>Selflet Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selflet Resources</em>' containment reference.
	 * @see #getSelfletResources()
	 * @generated
	 */
	void setSelfletResources(SelfletResources value);

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
	 * @see selflet.SelfletPackage#getSelflet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link selflet.Selflet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Selflet
