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

import selflet.Abilities;
import selflet.Actions;
import selflet.Conditions;
import selflet.Rules;
import selflet.SelfletPackage;
import selflet.SelfletResources;
import selflet.Services;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.SelfletResourcesImpl#getAbilities <em>Abilities</em>}</li>
 *   <li>{@link selflet.impl.SelfletResourcesImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link selflet.impl.SelfletResourcesImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link selflet.impl.SelfletResourcesImpl#getServices <em>Services</em>}</li>
 *   <li>{@link selflet.impl.SelfletResourcesImpl#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfletResourcesImpl extends EObjectImpl implements SelfletResources {
	/**
	 * The cached value of the '{@link #getAbilities() <em>Abilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbilities()
	 * @generated
	 * @ordered
	 */
	protected Abilities abilities;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected Actions actions;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected Conditions conditions;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected Rules rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfletResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.SELFLET_RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abilities getAbilities() {
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbilities(Abilities newAbilities, NotificationChain msgs) {
		Abilities oldAbilities = abilities;
		abilities = newAbilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__ABILITIES, oldAbilities, newAbilities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbilities(Abilities newAbilities) {
		if (newAbilities != abilities) {
			NotificationChain msgs = null;
			if (abilities != null)
				msgs = ((InternalEObject)abilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__ABILITIES, null, msgs);
			if (newAbilities != null)
				msgs = ((InternalEObject)newAbilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__ABILITIES, null, msgs);
			msgs = basicSetAbilities(newAbilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__ABILITIES, newAbilities, newAbilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(Actions newActions, NotificationChain msgs) {
		Actions oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(Actions newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditions getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditions(Conditions newConditions, NotificationChain msgs) {
		Conditions oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__CONDITIONS, oldConditions, newConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditions(Conditions newConditions) {
		if (newConditions != conditions) {
			NotificationChain msgs = null;
			if (conditions != null)
				msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__CONDITIONS, newConditions, newConditions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(Services newServices, NotificationChain msgs) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Services newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rules getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRules(Rules newRules, NotificationChain msgs) {
		Rules oldRules = rules;
		rules = newRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__RULES, oldRules, newRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(Rules newRules) {
		if (newRules != rules) {
			NotificationChain msgs = null;
			if (rules != null)
				msgs = ((InternalEObject)rules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__RULES, null, msgs);
			if (newRules != null)
				msgs = ((InternalEObject)newRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_RESOURCES__RULES, null, msgs);
			msgs = basicSetRules(newRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_RESOURCES__RULES, newRules, newRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletPackage.SELFLET_RESOURCES__ABILITIES:
				return basicSetAbilities(null, msgs);
			case SelfletPackage.SELFLET_RESOURCES__ACTIONS:
				return basicSetActions(null, msgs);
			case SelfletPackage.SELFLET_RESOURCES__CONDITIONS:
				return basicSetConditions(null, msgs);
			case SelfletPackage.SELFLET_RESOURCES__SERVICES:
				return basicSetServices(null, msgs);
			case SelfletPackage.SELFLET_RESOURCES__RULES:
				return basicSetRules(null, msgs);
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
			case SelfletPackage.SELFLET_RESOURCES__ABILITIES:
				return getAbilities();
			case SelfletPackage.SELFLET_RESOURCES__ACTIONS:
				return getActions();
			case SelfletPackage.SELFLET_RESOURCES__CONDITIONS:
				return getConditions();
			case SelfletPackage.SELFLET_RESOURCES__SERVICES:
				return getServices();
			case SelfletPackage.SELFLET_RESOURCES__RULES:
				return getRules();
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
			case SelfletPackage.SELFLET_RESOURCES__ABILITIES:
				setAbilities((Abilities)newValue);
				return;
			case SelfletPackage.SELFLET_RESOURCES__ACTIONS:
				setActions((Actions)newValue);
				return;
			case SelfletPackage.SELFLET_RESOURCES__CONDITIONS:
				setConditions((Conditions)newValue);
				return;
			case SelfletPackage.SELFLET_RESOURCES__SERVICES:
				setServices((Services)newValue);
				return;
			case SelfletPackage.SELFLET_RESOURCES__RULES:
				setRules((Rules)newValue);
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
			case SelfletPackage.SELFLET_RESOURCES__ABILITIES:
				setAbilities((Abilities)null);
				return;
			case SelfletPackage.SELFLET_RESOURCES__ACTIONS:
				setActions((Actions)null);
				return;
			case SelfletPackage.SELFLET_RESOURCES__CONDITIONS:
				setConditions((Conditions)null);
				return;
			case SelfletPackage.SELFLET_RESOURCES__SERVICES:
				setServices((Services)null);
				return;
			case SelfletPackage.SELFLET_RESOURCES__RULES:
				setRules((Rules)null);
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
			case SelfletPackage.SELFLET_RESOURCES__ABILITIES:
				return abilities != null;
			case SelfletPackage.SELFLET_RESOURCES__ACTIONS:
				return actions != null;
			case SelfletPackage.SELFLET_RESOURCES__CONDITIONS:
				return conditions != null;
			case SelfletPackage.SELFLET_RESOURCES__SERVICES:
				return services != null;
			case SelfletPackage.SELFLET_RESOURCES__RULES:
				return rules != null;
		}
		return super.eIsSet(featureID);
	}

} //SelfletResourcesImpl
