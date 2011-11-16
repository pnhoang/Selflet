/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import selflet.Behavior;
import selflet.Input;
import selflet.OfferMode;
import selflet.Output;
import selflet.SelfletPackage;
import selflet.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.ServiceImpl#getInput <em>Input</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#getOffermode <em>Offermode</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#isActive <em>Active</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#getMaxResponseTime <em>Max Response Time</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link selflet.impl.ServiceImpl#getImplementations <em>Implementations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected Input input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * The cached value of the '{@link #getOffermode() <em>Offermode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffermode()
	 * @generated
	 * @ordered
	 */
	protected OfferMode offermode;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * This is true if the Active attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activeESet;

	/**
	 * The default value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected static final int REVENUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevenue() <em>Revenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevenue()
	 * @generated
	 * @ordered
	 */
	protected int revenue = REVENUE_EDEFAULT;

	/**
	 * This is true if the Revenue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean revenueESet;

	/**
	 * The default value of the '{@link #getMaxResponseTime() <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseTime()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_RESPONSE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxResponseTime() <em>Max Response Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxResponseTime()
	 * @generated
	 * @ordered
	 */
	protected double maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;

	/**
	 * This is true if the Max Response Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxResponseTimeESet;

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
	 * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> implementations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(Input newInput, NotificationChain msgs) {
		Input oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__INPUT, oldInput, newInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Input newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SERVICE__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SERVICE__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__INPUT, newInput, newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SERVICE__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SERVICE__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferMode getOffermode() {
		return offermode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffermode(OfferMode newOffermode, NotificationChain msgs) {
		OfferMode oldOffermode = offermode;
		offermode = newOffermode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__OFFERMODE, oldOffermode, newOffermode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffermode(OfferMode newOffermode) {
		if (newOffermode != offermode) {
			NotificationChain msgs = null;
			if (offermode != null)
				msgs = ((InternalEObject)offermode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SERVICE__OFFERMODE, null, msgs);
			if (newOffermode != null)
				msgs = ((InternalEObject)newOffermode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SERVICE__OFFERMODE, null, msgs);
			msgs = basicSetOffermode(newOffermode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__OFFERMODE, newOffermode, newOffermode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		boolean oldActiveESet = activeESet;
		activeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__ACTIVE, oldActive, active, !oldActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActive() {
		boolean oldActive = active;
		boolean oldActiveESet = activeESet;
		active = ACTIVE_EDEFAULT;
		activeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.SERVICE__ACTIVE, oldActive, ACTIVE_EDEFAULT, oldActiveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActive() {
		return activeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevenue() {
		return revenue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevenue(int newRevenue) {
		int oldRevenue = revenue;
		revenue = newRevenue;
		boolean oldRevenueESet = revenueESet;
		revenueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__REVENUE, oldRevenue, revenue, !oldRevenueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRevenue() {
		int oldRevenue = revenue;
		boolean oldRevenueESet = revenueESet;
		revenue = REVENUE_EDEFAULT;
		revenueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.SERVICE__REVENUE, oldRevenue, REVENUE_EDEFAULT, oldRevenueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRevenue() {
		return revenueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxResponseTime() {
		return maxResponseTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxResponseTime(double newMaxResponseTime) {
		double oldMaxResponseTime = maxResponseTime;
		maxResponseTime = newMaxResponseTime;
		boolean oldMaxResponseTimeESet = maxResponseTimeESet;
		maxResponseTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__MAX_RESPONSE_TIME, oldMaxResponseTime, maxResponseTime, !oldMaxResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxResponseTime() {
		double oldMaxResponseTime = maxResponseTime;
		boolean oldMaxResponseTimeESet = maxResponseTimeESet;
		maxResponseTime = MAX_RESPONSE_TIME_EDEFAULT;
		maxResponseTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.SERVICE__MAX_RESPONSE_TIME, oldMaxResponseTime, MAX_RESPONSE_TIME_EDEFAULT, oldMaxResponseTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxResponseTime() {
		return maxResponseTimeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getImplementations() {
		if (implementations == null) {
			implementations = new EObjectContainmentEList<Behavior>(Behavior.class, this, SelfletPackage.SERVICE__IMPLEMENTATIONS);
		}
		return implementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletPackage.SERVICE__INPUT:
				return basicSetInput(null, msgs);
			case SelfletPackage.SERVICE__OUTPUT:
				return basicSetOutput(null, msgs);
			case SelfletPackage.SERVICE__OFFERMODE:
				return basicSetOffermode(null, msgs);
			case SelfletPackage.SERVICE__IMPLEMENTATIONS:
				return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
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
			case SelfletPackage.SERVICE__INPUT:
				return getInput();
			case SelfletPackage.SERVICE__OUTPUT:
				return getOutput();
			case SelfletPackage.SERVICE__OFFERMODE:
				return getOffermode();
			case SelfletPackage.SERVICE__ACTIVE:
				return isActive();
			case SelfletPackage.SERVICE__REVENUE:
				return getRevenue();
			case SelfletPackage.SERVICE__MAX_RESPONSE_TIME:
				return getMaxResponseTime();
			case SelfletPackage.SERVICE__NAME:
				return getName();
			case SelfletPackage.SERVICE__IMPLEMENTATIONS:
				return getImplementations();
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
			case SelfletPackage.SERVICE__INPUT:
				setInput((Input)newValue);
				return;
			case SelfletPackage.SERVICE__OUTPUT:
				setOutput((Output)newValue);
				return;
			case SelfletPackage.SERVICE__OFFERMODE:
				setOffermode((OfferMode)newValue);
				return;
			case SelfletPackage.SERVICE__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case SelfletPackage.SERVICE__REVENUE:
				setRevenue((Integer)newValue);
				return;
			case SelfletPackage.SERVICE__MAX_RESPONSE_TIME:
				setMaxResponseTime((Double)newValue);
				return;
			case SelfletPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case SelfletPackage.SERVICE__IMPLEMENTATIONS:
				getImplementations().clear();
				getImplementations().addAll((Collection<? extends Behavior>)newValue);
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
			case SelfletPackage.SERVICE__INPUT:
				setInput((Input)null);
				return;
			case SelfletPackage.SERVICE__OUTPUT:
				setOutput((Output)null);
				return;
			case SelfletPackage.SERVICE__OFFERMODE:
				setOffermode((OfferMode)null);
				return;
			case SelfletPackage.SERVICE__ACTIVE:
				unsetActive();
				return;
			case SelfletPackage.SERVICE__REVENUE:
				unsetRevenue();
				return;
			case SelfletPackage.SERVICE__MAX_RESPONSE_TIME:
				unsetMaxResponseTime();
				return;
			case SelfletPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SelfletPackage.SERVICE__IMPLEMENTATIONS:
				getImplementations().clear();
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
			case SelfletPackage.SERVICE__INPUT:
				return input != null;
			case SelfletPackage.SERVICE__OUTPUT:
				return output != null;
			case SelfletPackage.SERVICE__OFFERMODE:
				return offermode != null;
			case SelfletPackage.SERVICE__ACTIVE:
				return isSetActive();
			case SelfletPackage.SERVICE__REVENUE:
				return isSetRevenue();
			case SelfletPackage.SERVICE__MAX_RESPONSE_TIME:
				return isSetMaxResponseTime();
			case SelfletPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SelfletPackage.SERVICE__IMPLEMENTATIONS:
				return implementations != null && !implementations.isEmpty();
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
		result.append(" (active: ");
		if (activeESet) result.append(active); else result.append("<unset>");
		result.append(", revenue: ");
		if (revenueESet) result.append(revenue); else result.append("<unset>");
		result.append(", maxResponseTime: ");
		if (maxResponseTimeESet) result.append(maxResponseTime); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
