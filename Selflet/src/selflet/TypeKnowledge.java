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
 * A representation of the model object '<em><b>Type Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link selflet.TypeKnowledge#getSelfLetProperty <em>Self Let Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see selflet.SelfletPackage#getTypeKnowledge()
 * @model extendedMetaData="name='typeKnowledgeType' kind='elementOnly'"
 * @generated
 */
public interface TypeKnowledge extends EObject {
	/**
	 * Returns the value of the '<em><b>Self Let Property</b></em>' containment reference list.
	 * The list contents are of type {@link selflet.SelfLetProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Let Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Let Property</em>' containment reference list.
	 * @see selflet.SelfletPackage#getTypeKnowledge_SelfLetProperty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='selfLetProperty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SelfLetProperty> getSelfLetProperty();

} // TypeKnowledge
