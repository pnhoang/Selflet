/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import selflet.SelfLetProperty;
import selflet.SelfletPackage;
import selflet.TypeKnowledge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.TypeKnowledgeImpl#getSelfLetProperty <em>Self Let Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeKnowledgeImpl extends EObjectImpl implements TypeKnowledge {
	/**
	 * The cached value of the '{@link #getSelfLetProperty() <em>Self Let Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfLetProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SelfLetProperty> selfLetProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeKnowledgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.TYPE_KNOWLEDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelfLetProperty> getSelfLetProperty() {
		if (selfLetProperty == null) {
			selfLetProperty = new EObjectContainmentEList<SelfLetProperty>(SelfLetProperty.class, this, SelfletPackage.TYPE_KNOWLEDGE__SELF_LET_PROPERTY);
		}
		return selfLetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletPackage.TYPE_KNOWLEDGE__SELF_LET_PROPERTY:
				return ((InternalEList<?>)getSelfLetProperty()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelfletPackage.TYPE_KNOWLEDGE__SELF_LET_PROPERTY:
				return getSelfLetProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SelfletPackage.TYPE_KNOWLEDGE__SELF_LET_PROPERTY:
				getSelfLetProperty().clear();
				getSelfLetProperty().addAll((Collection<? extends SelfLetProperty>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SelfletPackage.TYPE_KNOWLEDGE__SELF_LET_PROPERTY:
				getSelfLetProperty().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SelfletPackage.TYPE_KNOWLEDGE__SELF_LET_PROPERTY:
				return selfLetProperty != null && !selfLetProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeKnowledgeImpl
