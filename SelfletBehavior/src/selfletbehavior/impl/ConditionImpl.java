/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import selfletbehavior.Condition;
import selfletbehavior.SelfletbehaviorPackage;
import selfletbehavior.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selfletbehavior.impl.ConditionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link selfletbehavior.impl.ConditionImpl#getConditionFile <em>Condition File</em>}</li>
 *   <li>{@link selfletbehavior.impl.ConditionImpl#getTargetState <em>Target State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends EObjectImpl implements Condition {
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
	 * The default value of the '{@link #getConditionFile() <em>Condition File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFile()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionFile() <em>Condition File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionFile()
	 * @generated
	 * @ordered
	 */
	protected String conditionFile = CONDITION_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletbehaviorPackage.Literals.CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.CONDITION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionFile() {
		return conditionFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionFile(String newConditionFile) {
		String oldConditionFile = conditionFile;
		conditionFile = newConditionFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.CONDITION__CONDITION_FILE, oldConditionFile, conditionFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject)targetState;
			targetState = (State)eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SelfletbehaviorPackage.CONDITION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetState(State newTargetState) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletbehaviorPackage.CONDITION__TARGET_STATE, oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelfletbehaviorPackage.CONDITION__BODY:
				return getBody();
			case SelfletbehaviorPackage.CONDITION__CONDITION_FILE:
				return getConditionFile();
			case SelfletbehaviorPackage.CONDITION__TARGET_STATE:
				if (resolve) return getTargetState();
				return basicGetTargetState();
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
			case SelfletbehaviorPackage.CONDITION__BODY:
				setBody((String)newValue);
				return;
			case SelfletbehaviorPackage.CONDITION__CONDITION_FILE:
				setConditionFile((String)newValue);
				return;
			case SelfletbehaviorPackage.CONDITION__TARGET_STATE:
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
			case SelfletbehaviorPackage.CONDITION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case SelfletbehaviorPackage.CONDITION__CONDITION_FILE:
				setConditionFile(CONDITION_FILE_EDEFAULT);
				return;
			case SelfletbehaviorPackage.CONDITION__TARGET_STATE:
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
			case SelfletbehaviorPackage.CONDITION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case SelfletbehaviorPackage.CONDITION__CONDITION_FILE:
				return CONDITION_FILE_EDEFAULT == null ? conditionFile != null : !CONDITION_FILE_EDEFAULT.equals(conditionFile);
			case SelfletbehaviorPackage.CONDITION__TARGET_STATE:
				return targetState != null;
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
		result.append(", conditionFile: ");
		result.append(conditionFile);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
