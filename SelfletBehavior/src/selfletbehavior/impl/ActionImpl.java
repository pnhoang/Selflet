/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import selfletbehavior.Action;
import selfletbehavior.FileReference;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selfletbehavior.impl.ActionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link selfletbehavior.impl.ActionImpl#getActionFile <em>Action File</em>}</li>
 *   <li>{@link selfletbehavior.impl.ActionImpl#getAbilityFile <em>Ability File</em>}</li>
 *   <li>{@link selfletbehavior.impl.ActionImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends EObjectImpl implements Action {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionFile() <em>Action File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionFile() <em>Action File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionFile()
	 * @generated
	 * @ordered
	 */
	protected String actionFile = ACTION_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbilityFile() <em>Ability File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityFile()
	 * @generated
	 * @ordered
	 */
	protected static final FileReference ABILITY_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbilityFile() <em>Ability File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilityFile()
	 * @generated
	 * @ordered
	 */
	protected FileReference abilityFile = ABILITY_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletbehaviorPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.ACTION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionFile() {
		return actionFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionFile(String newActionFile) {
		String oldActionFile = actionFile;
		actionFile = newActionFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.ACTION__ACTION_FILE, oldActionFile, actionFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileReference getAbilityFile() {
		return abilityFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilityFile(FileReference newAbilityFile) {
		FileReference oldAbilityFile = abilityFile;
		abilityFile = newAbilityFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.ACTION__ABILITY_FILE, oldAbilityFile, abilityFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (eContainerFeatureID() != SelfletbehaviorPackage.ACTION__TARGET_STATE) return null;
		return (State)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetState(State newTargetState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTargetState, SelfletbehaviorPackage.ACTION__TARGET_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(State newTargetState) {
		if (newTargetState != eInternalContainer() || (eContainerFeatureID() != SelfletbehaviorPackage.ACTION__TARGET_STATE && newTargetState != null)) {
			if (EcoreUtil.isAncestor(this, newTargetState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTargetState != null)
				msgs = ((InternalEObject)newTargetState).eInverseAdd(this, SelfletbehaviorPackage.STATE__ACTION, State.class, msgs);
			msgs = basicSetTargetState(newTargetState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.ACTION__TARGET_STATE, newTargetState, newTargetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTargetState((State)otherEnd, msgs);
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
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				return basicSetTargetState(null, msgs);
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
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				return eInternalContainer().eInverseRemove(this, SelfletbehaviorPackage.STATE__ACTION, State.class, msgs);
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
			case SelfletbehaviorPackage.ACTION__BODY:
				return getBody();
			case SelfletbehaviorPackage.ACTION__ACTION_FILE:
				return getActionFile();
			case SelfletbehaviorPackage.ACTION__ABILITY_FILE:
				return getAbilityFile();
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				return getTargetState();
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
			case SelfletbehaviorPackage.ACTION__BODY:
				setBody((String)newValue);
				return;
			case SelfletbehaviorPackage.ACTION__ACTION_FILE:
				setActionFile((String)newValue);
				return;
			case SelfletbehaviorPackage.ACTION__ABILITY_FILE:
				setAbilityFile((FileReference)newValue);
				return;
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				setTargetState((State)newValue);
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
			case SelfletbehaviorPackage.ACTION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case SelfletbehaviorPackage.ACTION__ACTION_FILE:
				setActionFile(ACTION_FILE_EDEFAULT);
				return;
			case SelfletbehaviorPackage.ACTION__ABILITY_FILE:
				setAbilityFile(ABILITY_FILE_EDEFAULT);
				return;
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				setTargetState((State)null);
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
			case SelfletbehaviorPackage.ACTION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case SelfletbehaviorPackage.ACTION__ACTION_FILE:
				return ACTION_FILE_EDEFAULT == null ? actionFile != null : !ACTION_FILE_EDEFAULT.equals(actionFile);
			case SelfletbehaviorPackage.ACTION__ABILITY_FILE:
				return ABILITY_FILE_EDEFAULT == null ? abilityFile != null : !ABILITY_FILE_EDEFAULT.equals(abilityFile);
			case SelfletbehaviorPackage.ACTION__TARGET_STATE:
				return getTargetState() != null;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", actionFile: ");
		result.append(actionFile);
		result.append(", abilityFile: ");
		result.append(abilityFile);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
