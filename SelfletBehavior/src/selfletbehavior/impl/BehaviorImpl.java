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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import selfletbehavior.Behavior;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.Service;
import selfletbehavior.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selfletbehavior.impl.BehaviorImpl#getName <em>Name</em>}</li>
 *   <li>{@link selfletbehavior.impl.BehaviorImpl#getState <em>State</em>}</li>
 *   <li>{@link selfletbehavior.impl.BehaviorImpl#getTargetService <em>Target Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends EObjectImpl implements Behavior {
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
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletbehaviorPackage.Literals.BEHAVIOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.BEHAVIOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentWithInverseEList<State>(State.class, this, SelfletbehaviorPackage.BEHAVIOR__STATE, SelfletbehaviorPackage.STATE__TARGET_BEHAVIOR);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getTargetService() {
		if (eContainerFeatureID() != SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetService(Service newTargetService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargetService, SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetService(Service newTargetService) {
		if (newTargetService != eInternalContainer() || (eContainerFeatureID() != SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE && newTargetService != null)) {
			if (EcoreUtil.isAncestor(this, newTargetService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetService != null)
				msgs = ((InternalEObject)newTargetService).eInverseAdd(this, SelfletbehaviorPackage.SERVICE__BEHAVIOR, Service.class, msgs);
			msgs = basicSetTargetService(newTargetService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE, newTargetService, newTargetService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletbehaviorPackage.BEHAVIOR__STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getState()).basicAdd(otherEnd, msgs);
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargetService((Service)otherEnd, msgs);
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
			case SelfletbehaviorPackage.BEHAVIOR__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				return basicSetTargetService(null, msgs);
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
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				return eInternalContainer().eInverseRemove(this, SelfletbehaviorPackage.SERVICE__BEHAVIOR, Service.class, msgs);
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
			case SelfletbehaviorPackage.BEHAVIOR__NAME:
				return getName();
			case SelfletbehaviorPackage.BEHAVIOR__STATE:
				return getState();
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				return getTargetService();
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
			case SelfletbehaviorPackage.BEHAVIOR__NAME:
				setName((String)newValue);
				return;
			case SelfletbehaviorPackage.BEHAVIOR__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				setTargetService((Service)newValue);
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
			case SelfletbehaviorPackage.BEHAVIOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SelfletbehaviorPackage.BEHAVIOR__STATE:
				getState().clear();
				return;
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				setTargetService((Service)null);
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
			case SelfletbehaviorPackage.BEHAVIOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SelfletbehaviorPackage.BEHAVIOR__STATE:
				return state != null && !state.isEmpty();
			case SelfletbehaviorPackage.BEHAVIOR__TARGET_SERVICE:
				return getTargetService() != null;
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

} //BehaviorImpl
