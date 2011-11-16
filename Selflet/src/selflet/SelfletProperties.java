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
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.SelfletProperties#getAuthor <em>Author</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getDescription <em>Description</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getPassive <em>Passive</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getActive <em>Active</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getReds <em>Reds</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getLimePort <em>Lime Port</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getGeneralknowledge <em>Generalknowledge</em>}</li>
 *   <li>{@link selflet.SelfletProperties#getTypeKnowledge <em>Type Knowledge</em>}</li>
 *   <li>{@link selflet.SelfletProperties#isEnableOptimizationPolicy <em>Enable Optimization Policy</em>}</li>
 *   <li>{@link selflet.SelfletProperties#isEnableCloudOptimizationPolicy <em>Enable Cloud Optimization Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getSelfletProperties()
 * @model extendedMetaData="name='selfletProperties' kind='elementOnly'"
 * @generated
 */
public interface SelfletProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see selflet.SelfletPackage#getSelfletProperties_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see selflet.SelfletPackage#getSelfletProperties_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Passive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive</em>' containment reference.
	 * @see #setPassive(Empty)
	 * @see selflet.SelfletPackage#getSelfletProperties_Passive()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='passive' namespace='##targetNamespace'"
	 * @generated
	 */
	Empty getPassive();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getPassive <em>Passive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive</em>' containment reference.
	 * @see #getPassive()
	 * @generated
	 */
	void setPassive(Empty value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(Active)
	 * @see selflet.SelfletPackage#getSelfletProperties_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	Active getActive();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(Active value);

	/**
	 * Returns the value of the '<em><b>Reds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reds</em>' containment reference.
	 * @see #setReds(Reds)
	 * @see selflet.SelfletPackage#getSelfletProperties_Reds()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reds' namespace='##targetNamespace'"
	 * @generated
	 */
	Reds getReds();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getReds <em>Reds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reds</em>' containment reference.
	 * @see #getReds()
	 * @generated
	 */
	void setReds(Reds value);

	/**
	 * Returns the value of the '<em><b>Lime Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lime Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lime Port</em>' attribute.
	 * @see #isSetLimePort()
	 * @see #unsetLimePort()
	 * @see #setLimePort(int)
	 * @see selflet.SelfletPackage#getSelfletProperties_LimePort()
	 * @model unsettable="true" dataType="selflet.LimePort" required="true"
	 *        extendedMetaData="kind='element' name='limePort' namespace='##targetNamespace'"
	 * @generated
	 */
	int getLimePort();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getLimePort <em>Lime Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lime Port</em>' attribute.
	 * @see #isSetLimePort()
	 * @see #unsetLimePort()
	 * @see #getLimePort()
	 * @generated
	 */
	void setLimePort(int value);

	/**
	 * Unsets the value of the '{@link selflet.SelfletProperties#getLimePort <em>Lime Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLimePort()
	 * @see #getLimePort()
	 * @see #setLimePort(int)
	 * @generated
	 */
	void unsetLimePort();

	/**
	 * Returns whether the value of the '{@link selflet.SelfletProperties#getLimePort <em>Lime Port</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lime Port</em>' attribute is set.
	 * @see #unsetLimePort()
	 * @see #getLimePort()
	 * @see #setLimePort(int)
	 * @generated
	 */
	boolean isSetLimePort();

	/**
	 * Returns the value of the '<em><b>Generalknowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalknowledge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalknowledge</em>' containment reference.
	 * @see #setGeneralknowledge(GeneralKnowledge)
	 * @see selflet.SelfletPackage#getSelfletProperties_Generalknowledge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generalknowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralKnowledge getGeneralknowledge();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getGeneralknowledge <em>Generalknowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalknowledge</em>' containment reference.
	 * @see #getGeneralknowledge()
	 * @generated
	 */
	void setGeneralknowledge(GeneralKnowledge value);

	/**
	 * Returns the value of the '<em><b>Type Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Knowledge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Knowledge</em>' containment reference.
	 * @see #setTypeKnowledge(TypeKnowledge)
	 * @see selflet.SelfletPackage#getSelfletProperties_TypeKnowledge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeKnowledge' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeKnowledge getTypeKnowledge();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#getTypeKnowledge <em>Type Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Knowledge</em>' containment reference.
	 * @see #getTypeKnowledge()
	 * @generated
	 */
	void setTypeKnowledge(TypeKnowledge value);

	/**
	 * Returns the value of the '<em><b>Enable Optimization Policy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Optimization Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Optimization Policy</em>' attribute.
	 * @see #isSetEnableOptimizationPolicy()
	 * @see #unsetEnableOptimizationPolicy()
	 * @see #setEnableOptimizationPolicy(boolean)
	 * @see selflet.SelfletPackage#getSelfletProperties_EnableOptimizationPolicy()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='enableOptimizationPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableOptimizationPolicy();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#isEnableOptimizationPolicy <em>Enable Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Optimization Policy</em>' attribute.
	 * @see #isSetEnableOptimizationPolicy()
	 * @see #unsetEnableOptimizationPolicy()
	 * @see #isEnableOptimizationPolicy()
	 * @generated
	 */
	void setEnableOptimizationPolicy(boolean value);

	/**
	 * Unsets the value of the '{@link selflet.SelfletProperties#isEnableOptimizationPolicy <em>Enable Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableOptimizationPolicy()
	 * @see #isEnableOptimizationPolicy()
	 * @see #setEnableOptimizationPolicy(boolean)
	 * @generated
	 */
	void unsetEnableOptimizationPolicy();

	/**
	 * Returns whether the value of the '{@link selflet.SelfletProperties#isEnableOptimizationPolicy <em>Enable Optimization Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Optimization Policy</em>' attribute is set.
	 * @see #unsetEnableOptimizationPolicy()
	 * @see #isEnableOptimizationPolicy()
	 * @see #setEnableOptimizationPolicy(boolean)
	 * @generated
	 */
	boolean isSetEnableOptimizationPolicy();

	/**
	 * Returns the value of the '<em><b>Enable Cloud Optimization Policy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Cloud Optimization Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Cloud Optimization Policy</em>' attribute.
	 * @see #isSetEnableCloudOptimizationPolicy()
	 * @see #unsetEnableCloudOptimizationPolicy()
	 * @see #setEnableCloudOptimizationPolicy(boolean)
	 * @see selflet.SelfletPackage#getSelfletProperties_EnableCloudOptimizationPolicy()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='enableCloudOptimizationPolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEnableCloudOptimizationPolicy();

	/**
	 * Sets the value of the '{@link selflet.SelfletProperties#isEnableCloudOptimizationPolicy <em>Enable Cloud Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Cloud Optimization Policy</em>' attribute.
	 * @see #isSetEnableCloudOptimizationPolicy()
	 * @see #unsetEnableCloudOptimizationPolicy()
	 * @see #isEnableCloudOptimizationPolicy()
	 * @generated
	 */
	void setEnableCloudOptimizationPolicy(boolean value);

	/**
	 * Unsets the value of the '{@link selflet.SelfletProperties#isEnableCloudOptimizationPolicy <em>Enable Cloud Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableCloudOptimizationPolicy()
	 * @see #isEnableCloudOptimizationPolicy()
	 * @see #setEnableCloudOptimizationPolicy(boolean)
	 * @generated
	 */
	void unsetEnableCloudOptimizationPolicy();

	/**
	 * Returns whether the value of the '{@link selflet.SelfletProperties#isEnableCloudOptimizationPolicy <em>Enable Cloud Optimization Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Cloud Optimization Policy</em>' attribute is set.
	 * @see #unsetEnableCloudOptimizationPolicy()
	 * @see #isEnableCloudOptimizationPolicy()
	 * @see #setEnableCloudOptimizationPolicy(boolean)
	 * @generated
	 */
	boolean isSetEnableCloudOptimizationPolicy();

} // SelfletProperties
