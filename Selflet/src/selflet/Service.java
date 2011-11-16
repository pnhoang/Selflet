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
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Service#getInput <em>Input</em>}</li>
 *   <li>{@link selflet.Service#getOutput <em>Output</em>}</li>
 *   <li>{@link selflet.Service#getOffermode <em>Offermode</em>}</li>
 *   <li>{@link selflet.Service#isActive <em>Active</em>}</li>
 *   <li>{@link selflet.Service#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link selflet.Service#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link selflet.Service#getName <em>Name</em>}</li>
 *   <li>{@link selflet.Service#getImplementations <em>Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getService()
 * @model extendedMetaData="name='serviceType' kind='elementOnly'"
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(Input)
	 * @see selflet.SelfletPackage#getService_Input()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='input' namespace='##targetNamespace'"
	 * @generated
	 */
	Input getInput();

	/**
	 * Sets the value of the '{@link selflet.Service#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Input value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see selflet.SelfletPackage#getService_Output()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='output' namespace='##targetNamespace'"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link selflet.Service#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Offermode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offermode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offermode</em>' containment reference.
	 * @see #setOffermode(OfferMode)
	 * @see selflet.SelfletPackage#getService_Offermode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='offermode' namespace='##targetNamespace'"
	 * @generated
	 */
	OfferMode getOffermode();

	/**
	 * Sets the value of the '{@link selflet.Service#getOffermode <em>Offermode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offermode</em>' containment reference.
	 * @see #getOffermode()
	 * @generated
	 */
	void setOffermode(OfferMode value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #isSetActive()
	 * @see #unsetActive()
	 * @see #setActive(boolean)
	 * @see selflet.SelfletPackage#getService_Active()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='active' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link selflet.Service#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isSetActive()
	 * @see #unsetActive()
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Unsets the value of the '{@link selflet.Service#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActive()
	 * @see #isActive()
	 * @see #setActive(boolean)
	 * @generated
	 */
	void unsetActive();

	/**
	 * Returns whether the value of the '{@link selflet.Service#isActive <em>Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active</em>' attribute is set.
	 * @see #unsetActive()
	 * @see #isActive()
	 * @see #setActive(boolean)
	 * @generated
	 */
	boolean isSetActive();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revenue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' attribute.
	 * @see #isSetRevenue()
	 * @see #unsetRevenue()
	 * @see #setRevenue(int)
	 * @see selflet.SelfletPackage#getService_Revenue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	int getRevenue();

	/**
	 * Sets the value of the '{@link selflet.Service#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' attribute.
	 * @see #isSetRevenue()
	 * @see #unsetRevenue()
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(int value);

	/**
	 * Unsets the value of the '{@link selflet.Service#getRevenue <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevenue()
	 * @see #getRevenue()
	 * @see #setRevenue(int)
	 * @generated
	 */
	void unsetRevenue();

	/**
	 * Returns whether the value of the '{@link selflet.Service#getRevenue <em>Revenue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revenue</em>' attribute is set.
	 * @see #unsetRevenue()
	 * @see #getRevenue()
	 * @see #setRevenue(int)
	 * @generated
	 */
	boolean isSetRevenue();

	/**
	 * Returns the value of the '<em><b>Max Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Response Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Response Time</em>' attribute.
	 * @see #isSetMaxResponseTime()
	 * @see #unsetMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @see selflet.SelfletPackage#getService_MaxResponseTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='maxResponseTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxResponseTime();

	/**
	 * Sets the value of the '{@link selflet.Service#getMaxResponseTime <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Response Time</em>' attribute.
	 * @see #isSetMaxResponseTime()
	 * @see #unsetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @generated
	 */
	void setMaxResponseTime(double value);

	/**
	 * Unsets the value of the '{@link selflet.Service#getMaxResponseTime <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @generated
	 */
	void unsetMaxResponseTime();

	/**
	 * Returns whether the value of the '{@link selflet.Service#getMaxResponseTime <em>Max Response Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Response Time</em>' attribute is set.
	 * @see #unsetMaxResponseTime()
	 * @see #getMaxResponseTime()
	 * @see #setMaxResponseTime(double)
	 * @generated
	 */
	boolean isSetMaxResponseTime();

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
	 * @see selflet.SelfletPackage#getService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link selflet.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link selflet.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementations</em>' containment reference list.
	 * @see selflet.SelfletPackage#getService_Implementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Behavior> getImplementations();

} // Service
