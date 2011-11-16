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

import selflet.Behavior;
import selflet.SelfletPackage;
import selflet.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.BehaviorImpl#getElementaryBehaviorCost <em>Elementary Behavior Cost</em>}</li>
 *   <li>{@link selflet.impl.BehaviorImpl#getElementaryBehaviorCPUTime <em>Elementary Behavior CPU Time</em>}</li>
 *   <li>{@link selflet.impl.BehaviorImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link selflet.impl.BehaviorImpl#isIsDefaultBehavior <em>Is Default Behavior</em>}</li>
 *   <li>{@link selflet.impl.BehaviorImpl#getImplements <em>Implements</em>}</li>
 *   <li>{@link selflet.impl.BehaviorImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorImpl extends EObjectImpl implements Behavior {
	/**
	 * The default value of the '{@link #getElementaryBehaviorCost() <em>Elementary Behavior Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryBehaviorCost()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEMENTARY_BEHAVIOR_COST_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElementaryBehaviorCost() <em>Elementary Behavior Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryBehaviorCost()
	 * @generated
	 * @ordered
	 */
	protected double elementaryBehaviorCost = ELEMENTARY_BEHAVIOR_COST_EDEFAULT;

	/**
	 * This is true if the Elementary Behavior Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementaryBehaviorCostESet;

	/**
	 * The default value of the '{@link #getElementaryBehaviorCPUTime() <em>Elementary Behavior CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryBehaviorCPUTime()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEMENTARY_BEHAVIOR_CPU_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElementaryBehaviorCPUTime() <em>Elementary Behavior CPU Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementaryBehaviorCPUTime()
	 * @generated
	 * @ordered
	 */
	protected double elementaryBehaviorCPUTime = ELEMENTARY_BEHAVIOR_CPU_TIME_EDEFAULT;

	/**
	 * This is true if the Elementary Behavior CPU Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementaryBehaviorCPUTimeESet;

	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDefaultBehavior() <em>Is Default Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefaultBehavior() <em>Is Default Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultBehavior = IS_DEFAULT_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Is Default Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultBehaviorESet;

	/**
	 * The cached value of the '{@link #getImplements() <em>Implements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplements()
	 * @generated
	 * @ordered
	 */
	protected Service implements_;

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
		return SelfletPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElementaryBehaviorCost() {
		return elementaryBehaviorCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementaryBehaviorCost(double newElementaryBehaviorCost) {
		double oldElementaryBehaviorCost = elementaryBehaviorCost;
		elementaryBehaviorCost = newElementaryBehaviorCost;
		boolean oldElementaryBehaviorCostESet = elementaryBehaviorCostESet;
		elementaryBehaviorCostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_COST, oldElementaryBehaviorCost, elementaryBehaviorCost, !oldElementaryBehaviorCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementaryBehaviorCost() {
		double oldElementaryBehaviorCost = elementaryBehaviorCost;
		boolean oldElementaryBehaviorCostESet = elementaryBehaviorCostESet;
		elementaryBehaviorCost = ELEMENTARY_BEHAVIOR_COST_EDEFAULT;
		elementaryBehaviorCostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_COST, oldElementaryBehaviorCost, ELEMENTARY_BEHAVIOR_COST_EDEFAULT, oldElementaryBehaviorCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementaryBehaviorCost() {
		return elementaryBehaviorCostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElementaryBehaviorCPUTime() {
		return elementaryBehaviorCPUTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementaryBehaviorCPUTime(double newElementaryBehaviorCPUTime) {
		double oldElementaryBehaviorCPUTime = elementaryBehaviorCPUTime;
		elementaryBehaviorCPUTime = newElementaryBehaviorCPUTime;
		boolean oldElementaryBehaviorCPUTimeESet = elementaryBehaviorCPUTimeESet;
		elementaryBehaviorCPUTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME, oldElementaryBehaviorCPUTime, elementaryBehaviorCPUTime, !oldElementaryBehaviorCPUTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElementaryBehaviorCPUTime() {
		double oldElementaryBehaviorCPUTime = elementaryBehaviorCPUTime;
		boolean oldElementaryBehaviorCPUTimeESet = elementaryBehaviorCPUTimeESet;
		elementaryBehaviorCPUTime = ELEMENTARY_BEHAVIOR_CPU_TIME_EDEFAULT;
		elementaryBehaviorCPUTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME, oldElementaryBehaviorCPUTime, ELEMENTARY_BEHAVIOR_CPU_TIME_EDEFAULT, oldElementaryBehaviorCPUTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElementaryBehaviorCPUTime() {
		return elementaryBehaviorCPUTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefaultBehavior() {
		return isDefaultBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefaultBehavior(boolean newIsDefaultBehavior) {
		boolean oldIsDefaultBehavior = isDefaultBehavior;
		isDefaultBehavior = newIsDefaultBehavior;
		boolean oldIsDefaultBehaviorESet = isDefaultBehaviorESet;
		isDefaultBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__IS_DEFAULT_BEHAVIOR, oldIsDefaultBehavior, isDefaultBehavior, !oldIsDefaultBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDefaultBehavior() {
		boolean oldIsDefaultBehavior = isDefaultBehavior;
		boolean oldIsDefaultBehaviorESet = isDefaultBehaviorESet;
		isDefaultBehavior = IS_DEFAULT_BEHAVIOR_EDEFAULT;
		isDefaultBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.BEHAVIOR__IS_DEFAULT_BEHAVIOR, oldIsDefaultBehavior, IS_DEFAULT_BEHAVIOR_EDEFAULT, oldIsDefaultBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDefaultBehavior() {
		return isDefaultBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getImplements() {
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplements(Service newImplements, NotificationChain msgs) {
		Service oldImplements = implements_;
		implements_ = newImplements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__IMPLEMENTS, oldImplements, newImplements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplements(Service newImplements) {
		if (newImplements != implements_) {
			NotificationChain msgs = null;
			if (implements_ != null)
				msgs = ((InternalEObject)implements_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.BEHAVIOR__IMPLEMENTS, null, msgs);
			if (newImplements != null)
				msgs = ((InternalEObject)newImplements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.BEHAVIOR__IMPLEMENTS, null, msgs);
			msgs = basicSetImplements(newImplements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__IMPLEMENTS, newImplements, newImplements));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.BEHAVIOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletPackage.BEHAVIOR__IMPLEMENTS:
				return basicSetImplements(null, msgs);
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
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_COST:
				return getElementaryBehaviorCost();
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME:
				return getElementaryBehaviorCPUTime();
			case SelfletPackage.BEHAVIOR__FILE_NAME:
				return getFileName();
			case SelfletPackage.BEHAVIOR__IS_DEFAULT_BEHAVIOR:
				return isIsDefaultBehavior();
			case SelfletPackage.BEHAVIOR__IMPLEMENTS:
				return getImplements();
			case SelfletPackage.BEHAVIOR__NAME:
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
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_COST:
				setElementaryBehaviorCost((Double)newValue);
				return;
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME:
				setElementaryBehaviorCPUTime((Double)newValue);
				return;
			case SelfletPackage.BEHAVIOR__FILE_NAME:
				setFileName((String)newValue);
				return;
			case SelfletPackage.BEHAVIOR__IS_DEFAULT_BEHAVIOR:
				setIsDefaultBehavior((Boolean)newValue);
				return;
			case SelfletPackage.BEHAVIOR__IMPLEMENTS:
				setImplements((Service)newValue);
				return;
			case SelfletPackage.BEHAVIOR__NAME:
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
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_COST:
				unsetElementaryBehaviorCost();
				return;
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME:
				unsetElementaryBehaviorCPUTime();
				return;
			case SelfletPackage.BEHAVIOR__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case SelfletPackage.BEHAVIOR__IS_DEFAULT_BEHAVIOR:
				unsetIsDefaultBehavior();
				return;
			case SelfletPackage.BEHAVIOR__IMPLEMENTS:
				setImplements((Service)null);
				return;
			case SelfletPackage.BEHAVIOR__NAME:
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
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_COST:
				return isSetElementaryBehaviorCost();
			case SelfletPackage.BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME:
				return isSetElementaryBehaviorCPUTime();
			case SelfletPackage.BEHAVIOR__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case SelfletPackage.BEHAVIOR__IS_DEFAULT_BEHAVIOR:
				return isSetIsDefaultBehavior();
			case SelfletPackage.BEHAVIOR__IMPLEMENTS:
				return implements_ != null;
			case SelfletPackage.BEHAVIOR__NAME:
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
		result.append(" (elementaryBehaviorCost: ");
		if (elementaryBehaviorCostESet) result.append(elementaryBehaviorCost); else result.append("<unset>");
		result.append(", elementaryBehaviorCPUTime: ");
		if (elementaryBehaviorCPUTimeESet) result.append(elementaryBehaviorCPUTime); else result.append("<unset>");
		result.append(", fileName: ");
		result.append(fileName);
		result.append(", isDefaultBehavior: ");
		if (isDefaultBehaviorESet) result.append(isDefaultBehavior); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
