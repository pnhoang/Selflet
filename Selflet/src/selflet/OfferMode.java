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
 * A representation of the model object '<em><b>Offer Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.OfferMode#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getOfferMode()
 * @model extendedMetaData="name='offerModeType' kind='empty'"
 * @generated
 */
public interface OfferMode extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link selflet.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see selflet.Mode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(Mode)
	 * @see selflet.SelfletPackage#getOfferMode_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link selflet.OfferMode#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see selflet.Mode
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

	/**
	 * Unsets the value of the '{@link selflet.OfferMode#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(Mode)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link selflet.OfferMode#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(Mode)
	 * @generated
	 */
	boolean isSetMode();

} // OfferMode
