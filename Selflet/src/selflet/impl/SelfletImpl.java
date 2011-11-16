/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import selflet.Selflet;
import selflet.SelfletPackage;
import selflet.SelfletProperties;
import selflet.SelfletResources;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selflet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.SelfletImpl#getSelfletProperties <em>Selflet Properties</em>}</li>
 *   <li>{@link selflet.impl.SelfletImpl#getSelfletResources <em>Selflet Resources</em>}</li>
 *   <li>{@link selflet.impl.SelfletImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfletImpl extends EObjectImpl implements Selflet {
	/**
	 * The cached value of the '{@link #getSelfletProperties() <em>Selflet Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfletProperties()
	 * @generated
	 * @ordered
	 */
	protected SelfletProperties selfletProperties;

	/**
	 * The cached value of the '{@link #getSelfletResources() <em>Selflet Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfletResources()
	 * @generated
	 * @ordered
	 */
	protected SelfletResources selfletResources;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.SELFLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletProperties getSelfletProperties() {
		return selfletProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfletProperties(SelfletProperties newSelfletProperties, NotificationChain msgs) {
		SelfletProperties oldSelfletProperties = selfletProperties;
		selfletProperties = newSelfletProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET__SELFLET_PROPERTIES, oldSelfletProperties, newSelfletProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfletProperties(SelfletProperties newSelfletProperties) {
		if (newSelfletProperties != selfletProperties) {
			NotificationChain msgs = null;
			if (selfletProperties != null)
				msgs = ((InternalEObject)selfletProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET__SELFLET_PROPERTIES, null, msgs);
			if (newSelfletProperties != null)
				msgs = ((InternalEObject)newSelfletProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET__SELFLET_PROPERTIES, null, msgs);
			msgs = basicSetSelfletProperties(newSelfletProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET__SELFLET_PROPERTIES, newSelfletProperties, newSelfletProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletResources getSelfletResources() {
		return selfletResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelfletResources(SelfletResources newSelfletResources, NotificationChain msgs) {
		SelfletResources oldSelfletResources = selfletResources;
		selfletResources = newSelfletResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET__SELFLET_RESOURCES, oldSelfletResources, newSelfletResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfletResources(SelfletResources newSelfletResources) {
		if (newSelfletResources != selfletResources) {
			NotificationChain msgs = null;
			if (selfletResources != null)
				msgs = ((InternalEObject)selfletResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET__SELFLET_RESOURCES, null, msgs);
			if (newSelfletResources != null)
				msgs = ((InternalEObject)newSelfletResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET__SELFLET_RESOURCES, null, msgs);
			msgs = basicSetSelfletResources(newSelfletResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET__SELFLET_RESOURCES, newSelfletResources, newSelfletResources));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletPackage.SELFLET__SELFLET_PROPERTIES:
				return basicSetSelfletProperties(null, msgs);
			case SelfletPackage.SELFLET__SELFLET_RESOURCES:
				return basicSetSelfletResources(null, msgs);
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
			case SelfletPackage.SELFLET__SELFLET_PROPERTIES:
				return getSelfletProperties();
			case SelfletPackage.SELFLET__SELFLET_RESOURCES:
				return getSelfletResources();
			case SelfletPackage.SELFLET__NAME:
				return getName();
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
			case SelfletPackage.SELFLET__SELFLET_PROPERTIES:
				setSelfletProperties((SelfletProperties)newValue);
				return;
			case SelfletPackage.SELFLET__SELFLET_RESOURCES:
				setSelfletResources((SelfletResources)newValue);
				return;
			case SelfletPackage.SELFLET__NAME:
				setName((String)newValue);
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
			case SelfletPackage.SELFLET__SELFLET_PROPERTIES:
				setSelfletProperties((SelfletProperties)null);
				return;
			case SelfletPackage.SELFLET__SELFLET_RESOURCES:
				setSelfletResources((SelfletResources)null);
				return;
			case SelfletPackage.SELFLET__NAME:
				setName(NAME_EDEFAULT);
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
			case SelfletPackage.SELFLET__SELFLET_PROPERTIES:
				return selfletProperties != null;
			case SelfletPackage.SELFLET__SELFLET_RESOURCES:
				return selfletResources != null;
			case SelfletPackage.SELFLET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SelfletImpl
