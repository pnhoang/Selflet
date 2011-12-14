/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import selfletbehavior.Action;
import selfletbehavior.Behavior;
import selfletbehavior.Condition;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selfletbehavior.impl.StateImpl#getAction <em>Action</em>}</li>
 *   <li>{@link selfletbehavior.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link selfletbehavior.impl.StateImpl#getNext <em>Next</em>}</li>
 *   <li>{@link selfletbehavior.impl.StateImpl#getTargetBehavior <em>Target Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EObjectImpl implements State {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletbehaviorPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.STATE__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, SelfletbehaviorPackage.ACTION__TARGET_STATE, Action.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, SelfletbehaviorPackage.ACTION__TARGET_STATE, Action.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.STATE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getNext() {
		if (next == null) {
			next = new EObjectContainmentEList<Condition>(Condition.class, this, SelfletbehaviorPackage.STATE__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getTargetBehavior() {
		if (eContainerFeatureID() != SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR) return null;
		return (Behavior)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetBehavior(Behavior newTargetBehavior, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargetBehavior, SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetBehavior(Behavior newTargetBehavior) {
		if (newTargetBehavior != eInternalContainer() || (eContainerFeatureID() != SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR && newTargetBehavior != null)) {
			if (EcoreUtil.isAncestor(this, newTargetBehavior))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetBehavior != null)
				msgs = ((InternalEObject)newTargetBehavior).eInverseAdd(this, SelfletbehaviorPackage.BEHAVIOR__STATE, Behavior.class, msgs);
			msgs = basicSetTargetBehavior(newTargetBehavior, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR, newTargetBehavior, newTargetBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletbehaviorPackage.STATE__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletbehaviorPackage.STATE__ACTION, null, msgs);
				return basicSetAction((Action)otherEnd, msgs);
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargetBehavior((Behavior)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletbehaviorPackage.STATE__ACTION:
				return basicSetAction(null, msgs);
			case SelfletbehaviorPackage.STATE__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				return basicSetTargetBehavior(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				return eInternalContainer().eInverseRemove(this, SelfletbehaviorPackage.BEHAVIOR__STATE, Behavior.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelfletbehaviorPackage.STATE__ACTION:
				return getAction();
			case SelfletbehaviorPackage.STATE__NAME:
				return getName();
			case SelfletbehaviorPackage.STATE__NEXT:
				return getNext();
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				return getTargetBehavior();
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
			case SelfletbehaviorPackage.STATE__ACTION:
				setAction((Action)newValue);
				return;
			case SelfletbehaviorPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case SelfletbehaviorPackage.STATE__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends Condition>)newValue);
				return;
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				setTargetBehavior((Behavior)newValue);
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
			case SelfletbehaviorPackage.STATE__ACTION:
				setAction((Action)null);
				return;
			case SelfletbehaviorPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SelfletbehaviorPackage.STATE__NEXT:
				getNext().clear();
				return;
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				setTargetBehavior((Behavior)null);
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
			case SelfletbehaviorPackage.STATE__ACTION:
				return action != null;
			case SelfletbehaviorPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SelfletbehaviorPackage.STATE__NEXT:
				return next != null && !next.isEmpty();
			case SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR:
				return getTargetBehavior() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
