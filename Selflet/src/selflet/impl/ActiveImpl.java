/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import selflet.Active;
import selflet.SelfletPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.ActiveImpl#getMainService <em>Main Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActiveImpl extends EObjectImpl implements Active {
	/**
	 * The default value of the '{@link #getMainService() <em>Main Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainService()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainService() <em>Main Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainService()
	 * @generated
	 * @ordered
	 */
	protected String mainService = MAIN_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.ACTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainService() {
		return mainService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainService(String newMainService) {
		String oldMainService = mainService;
		mainService = newMainService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.ACTIVE__MAIN_SERVICE, oldMainService, mainService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SelfletPackage.ACTIVE__MAIN_SERVICE:
				return getMainService();
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
			case SelfletPackage.ACTIVE__MAIN_SERVICE:
				setMainService((String)newValue);
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
			case SelfletPackage.ACTIVE__MAIN_SERVICE:
				setMainService(MAIN_SERVICE_EDEFAULT);
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
			case SelfletPackage.ACTIVE__MAIN_SERVICE:
				return MAIN_SERVICE_EDEFAULT == null ? mainService != null : !MAIN_SERVICE_EDEFAULT.equals(mainService);
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
		result.append(" (mainService: ");
		result.append(mainService);
		result.append(')');
		return result.toString();
	}

} //ActiveImpl
