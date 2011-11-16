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
 * A representation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Behavior#getElementaryBehaviorCost <em>Elementary Behavior Cost</em>}</li>
 *   <li>{@link selflet.Behavior#getElementaryBehaviorCPUTime <em>Elementary Behavior CPU Time</em>}</li>
 *   <li>{@link selflet.Behavior#getFileName <em>File Name</em>}</li>
 *   <li>{@link selflet.Behavior#isIsDefaultBehavior <em>Is Default Behavior</em>}</li>
 *   <li>{@link selflet.Behavior#getImplements <em>Implements</em>}</li>
 *   <li>{@link selflet.Behavior#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getBehavior()
 * @model extendedMetaData="name='behaviorType' kind='empty'"
 * @generated
 */
public interface Behavior extends EObject {
	/**
	 * Returns the value of the '<em><b>Elementary Behavior Cost</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementary Behavior Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementary Behavior Cost</em>' attribute.
	 * @see #isSetElementaryBehaviorCost()
	 * @see #unsetElementaryBehaviorCost()
	 * @see #setElementaryBehaviorCost(double)
	 * @see selflet.SelfletPackage#getBehavior_ElementaryBehaviorCost()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='elementaryBehaviorCost'"
	 * @generated
	 */
	double getElementaryBehaviorCost();

	/**
	 * Sets the value of the '{@link selflet.Behavior#getElementaryBehaviorCost <em>Elementary Behavior Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementary Behavior Cost</em>' attribute.
	 * @see #isSetElementaryBehaviorCost()
	 * @see #unsetElementaryBehaviorCost()
	 * @see #getElementaryBehaviorCost()
	 * @generated
	 */
	void setElementaryBehaviorCost(double value);

	/**
	 * Unsets the value of the '{@link selflet.Behavior#getElementaryBehaviorCost <em>Elementary Behavior Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementaryBehaviorCost()
	 * @see #getElementaryBehaviorCost()
	 * @see #setElementaryBehaviorCost(double)
	 * @generated
	 */
	void unsetElementaryBehaviorCost();

	/**
	 * Returns whether the value of the '{@link selflet.Behavior#getElementaryBehaviorCost <em>Elementary Behavior Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elementary Behavior Cost</em>' attribute is set.
	 * @see #unsetElementaryBehaviorCost()
	 * @see #getElementaryBehaviorCost()
	 * @see #setElementaryBehaviorCost(double)
	 * @generated
	 */
	boolean isSetElementaryBehaviorCost();

	/**
	 * Returns the value of the '<em><b>Elementary Behavior CPU Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elementary Behavior CPU Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementary Behavior CPU Time</em>' attribute.
	 * @see #isSetElementaryBehaviorCPUTime()
	 * @see #unsetElementaryBehaviorCPUTime()
	 * @see #setElementaryBehaviorCPUTime(double)
	 * @see selflet.SelfletPackage#getBehavior_ElementaryBehaviorCPUTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='elementaryBehaviorCPUTime'"
	 * @generated
	 */
	double getElementaryBehaviorCPUTime();

	/**
	 * Sets the value of the '{@link selflet.Behavior#getElementaryBehaviorCPUTime <em>Elementary Behavior CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elementary Behavior CPU Time</em>' attribute.
	 * @see #isSetElementaryBehaviorCPUTime()
	 * @see #unsetElementaryBehaviorCPUTime()
	 * @see #getElementaryBehaviorCPUTime()
	 * @generated
	 */
	void setElementaryBehaviorCPUTime(double value);

	/**
	 * Unsets the value of the '{@link selflet.Behavior#getElementaryBehaviorCPUTime <em>Elementary Behavior CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElementaryBehaviorCPUTime()
	 * @see #getElementaryBehaviorCPUTime()
	 * @see #setElementaryBehaviorCPUTime(double)
	 * @generated
	 */
	void unsetElementaryBehaviorCPUTime();

	/**
	 * Returns whether the value of the '{@link selflet.Behavior#getElementaryBehaviorCPUTime <em>Elementary Behavior CPU Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elementary Behavior CPU Time</em>' attribute is set.
	 * @see #unsetElementaryBehaviorCPUTime()
	 * @see #getElementaryBehaviorCPUTime()
	 * @see #setElementaryBehaviorCPUTime(double)
	 * @generated
	 */
	boolean isSetElementaryBehaviorCPUTime();

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see selflet.SelfletPackage#getBehavior_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='fileName'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link selflet.Behavior#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Is Default Behavior</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Behavior</em>' attribute.
	 * @see #isSetIsDefaultBehavior()
	 * @see #unsetIsDefaultBehavior()
	 * @see #setIsDefaultBehavior(boolean)
	 * @see selflet.SelfletPackage#getBehavior_IsDefaultBehavior()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isDefaultBehavior'"
	 * @generated
	 */
	boolean isIsDefaultBehavior();

	/**
	 * Sets the value of the '{@link selflet.Behavior#isIsDefaultBehavior <em>Is Default Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Behavior</em>' attribute.
	 * @see #isSetIsDefaultBehavior()
	 * @see #unsetIsDefaultBehavior()
	 * @see #isIsDefaultBehavior()
	 * @generated
	 */
	void setIsDefaultBehavior(boolean value);

	/**
	 * Unsets the value of the '{@link selflet.Behavior#isIsDefaultBehavior <em>Is Default Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDefaultBehavior()
	 * @see #isIsDefaultBehavior()
	 * @see #setIsDefaultBehavior(boolean)
	 * @generated
	 */
	void unsetIsDefaultBehavior();

	/**
	 * Returns whether the value of the '{@link selflet.Behavior#isIsDefaultBehavior <em>Is Default Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Default Behavior</em>' attribute is set.
	 * @see #unsetIsDefaultBehavior()
	 * @see #isIsDefaultBehavior()
	 * @see #setIsDefaultBehavior(boolean)
	 * @generated
	 */
	boolean isSetIsDefaultBehavior();

	/**
	 * Returns the value of the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' containment reference.
	 * @see #setImplements(Service)
	 * @see selflet.SelfletPackage#getBehavior_Implements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Service getImplements();

	/**
	 * Sets the value of the '{@link selflet.Behavior#getImplements <em>Implements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' containment reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(Service value);

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
	 * @see selflet.SelfletPackage#getBehavior_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link selflet.Behavior#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Behavior
