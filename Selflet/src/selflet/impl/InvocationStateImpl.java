/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import selflet.InvocationState;
import selflet.SelfletPackage;
import selflet.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.InvocationStateImpl#getInvoke <em>Invoke</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationStateImpl extends StateImpl implements InvocationState {
	/**
	 * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoke()
	 * @generated
	 * @ordered
	 */
	protected Service invoke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocationStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.INVOCATION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getInvoke() {
		if (invoke != null && invoke.eIsProxy()) {
			InternalEObject oldInvoke = (InternalEObject)invoke;
			invoke = (Service)eResolveProxy(oldInvoke);
			if (invoke != oldInvoke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelfletPackage.INVOCATION_STATE__INVOKE, oldInvoke, invoke));
			}
		}
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetInvoke() {
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoke(Service newInvoke) {
		Service oldInvoke = invoke;
		invoke = newInvoke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.INVOCATION_STATE__INVOKE, oldInvoke, invoke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelfletPackage.INVOCATION_STATE__INVOKE:
				if (resolve) return getInvoke();
				return basicGetInvoke();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SelfletPackage.INVOCATION_STATE__INVOKE:
				setInvoke((Service)newValue);
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
			case SelfletPackage.INVOCATION_STATE__INVOKE:
				setInvoke((Service)null);
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
			case SelfletPackage.INVOCATION_STATE__INVOKE:
				return invoke != null;
		}
		return super.eIsSet(featureID);
	}

} //InvocationStateImpl
