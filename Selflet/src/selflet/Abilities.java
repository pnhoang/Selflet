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
 * A representation of the model object '<em><b>Abilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.Abilities#getAbility <em>Ability</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getAbilities()
 * @model extendedMetaData="name='abilitiesType' kind='elementOnly'"
 * @generated
 */
public interface Abilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Ability</b></em>' containment reference list.
	 * The list contents are of type {@link selflet.Ability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' containment reference list.
	 * @see selflet.SelfletPackage#getAbilities_Ability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Ability> getAbility();

} // Abilities
