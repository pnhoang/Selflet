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

import selflet.Active;
import selflet.Empty;
import selflet.GeneralKnowledge;
import selflet.Reds;
import selflet.SelfletPackage;
import selflet.SelfletProperties;
import selflet.TypeKnowledge;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getPassive <em>Passive</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getActive <em>Active</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getReds <em>Reds</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getLimePort <em>Lime Port</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getGeneralknowledge <em>Generalknowledge</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#getTypeKnowledge <em>Type Knowledge</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#isEnableOptimizationPolicy <em>Enable Optimization Policy</em>}</li>
 *   <li>{@link selflet.impl.SelfletPropertiesImpl#isEnableCloudOptimizationPolicy <em>Enable Cloud Optimization Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfletPropertiesImpl extends EObjectImpl implements SelfletProperties {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPassive() <em>Passive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassive()
	 * @generated
	 * @ordered
	 */
	protected Empty passive;

	/**
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected Active active;

	/**
	 * The cached value of the '{@link #getReds() <em>Reds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReds()
	 * @generated
	 * @ordered
	 */
	protected Reds reds;

	/**
	 * The default value of the '{@link #getLimePort() <em>Lime Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimePort()
	 * @generated
	 * @ordered
	 */
	protected static final int LIME_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimePort() <em>Lime Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimePort()
	 * @generated
	 * @ordered
	 */
	protected int limePort = LIME_PORT_EDEFAULT;

	/**
	 * This is true if the Lime Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean limePortESet;

	/**
	 * The cached value of the '{@link #getGeneralknowledge() <em>Generalknowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralknowledge()
	 * @generated
	 * @ordered
	 */
	protected GeneralKnowledge generalknowledge;

	/**
	 * The cached value of the '{@link #getTypeKnowledge() <em>Type Knowledge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeKnowledge()
	 * @generated
	 * @ordered
	 */
	protected TypeKnowledge typeKnowledge;

	/**
	 * The default value of the '{@link #isEnableOptimizationPolicy() <em>Enable Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableOptimizationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_OPTIMIZATION_POLICY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableOptimizationPolicy() <em>Enable Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableOptimizationPolicy()
	 * @generated
	 * @ordered
	 */
	protected boolean enableOptimizationPolicy = ENABLE_OPTIMIZATION_POLICY_EDEFAULT;

	/**
	 * This is true if the Enable Optimization Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableOptimizationPolicyESet;

	/**
	 * The default value of the '{@link #isEnableCloudOptimizationPolicy() <em>Enable Cloud Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableCloudOptimizationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_CLOUD_OPTIMIZATION_POLICY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableCloudOptimizationPolicy() <em>Enable Cloud Optimization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableCloudOptimizationPolicy()
	 * @generated
	 * @ordered
	 */
	protected boolean enableCloudOptimizationPolicy = ENABLE_CLOUD_OPTIMIZATION_POLICY_EDEFAULT;

	/**
	 * This is true if the Enable Cloud Optimization Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableCloudOptimizationPolicyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfletPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelfletPackage.Literals.SELFLET_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty getPassive() {
		return passive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassive(Empty newPassive, NotificationChain msgs) {
		Empty oldPassive = passive;
		passive = newPassive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__PASSIVE, oldPassive, newPassive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassive(Empty newPassive) {
		if (newPassive != passive) {
			NotificationChain msgs = null;
			if (passive != null)
				msgs = ((InternalEObject)passive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__PASSIVE, null, msgs);
			if (newPassive != null)
				msgs = ((InternalEObject)newPassive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__PASSIVE, null, msgs);
			msgs = basicSetPassive(newPassive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__PASSIVE, newPassive, newPassive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Active getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(Active newActive, NotificationChain msgs) {
		Active oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__ACTIVE, oldActive, newActive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(Active newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reds getReds() {
		return reds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReds(Reds newReds, NotificationChain msgs) {
		Reds oldReds = reds;
		reds = newReds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__REDS, oldReds, newReds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReds(Reds newReds) {
		if (newReds != reds) {
			NotificationChain msgs = null;
			if (reds != null)
				msgs = ((InternalEObject)reds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__REDS, null, msgs);
			if (newReds != null)
				msgs = ((InternalEObject)newReds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__REDS, null, msgs);
			msgs = basicSetReds(newReds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__REDS, newReds, newReds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimePort() {
		return limePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimePort(int newLimePort) {
		int oldLimePort = limePort;
		limePort = newLimePort;
		boolean oldLimePortESet = limePortESet;
		limePortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__LIME_PORT, oldLimePort, limePort, !oldLimePortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLimePort() {
		int oldLimePort = limePort;
		boolean oldLimePortESet = limePortESet;
		limePort = LIME_PORT_EDEFAULT;
		limePortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.SELFLET_PROPERTIES__LIME_PORT, oldLimePort, LIME_PORT_EDEFAULT, oldLimePortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLimePort() {
		return limePortESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralKnowledge getGeneralknowledge() {
		return generalknowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralknowledge(GeneralKnowledge newGeneralknowledge, NotificationChain msgs) {
		GeneralKnowledge oldGeneralknowledge = generalknowledge;
		generalknowledge = newGeneralknowledge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE, oldGeneralknowledge, newGeneralknowledge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralknowledge(GeneralKnowledge newGeneralknowledge) {
		if (newGeneralknowledge != generalknowledge) {
			NotificationChain msgs = null;
			if (generalknowledge != null)
				msgs = ((InternalEObject)generalknowledge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE, null, msgs);
			if (newGeneralknowledge != null)
				msgs = ((InternalEObject)newGeneralknowledge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE, null, msgs);
			msgs = basicSetGeneralknowledge(newGeneralknowledge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE, newGeneralknowledge, newGeneralknowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeKnowledge getTypeKnowledge() {
		return typeKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeKnowledge(TypeKnowledge newTypeKnowledge, NotificationChain msgs) {
		TypeKnowledge oldTypeKnowledge = typeKnowledge;
		typeKnowledge = newTypeKnowledge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE, oldTypeKnowledge, newTypeKnowledge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeKnowledge(TypeKnowledge newTypeKnowledge) {
		if (newTypeKnowledge != typeKnowledge) {
			NotificationChain msgs = null;
			if (typeKnowledge != null)
				msgs = ((InternalEObject)typeKnowledge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE, null, msgs);
			if (newTypeKnowledge != null)
				msgs = ((InternalEObject)newTypeKnowledge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE, null, msgs);
			msgs = basicSetTypeKnowledge(newTypeKnowledge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE, newTypeKnowledge, newTypeKnowledge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableOptimizationPolicy() {
		return enableOptimizationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableOptimizationPolicy(boolean newEnableOptimizationPolicy) {
		boolean oldEnableOptimizationPolicy = enableOptimizationPolicy;
		enableOptimizationPolicy = newEnableOptimizationPolicy;
		boolean oldEnableOptimizationPolicyESet = enableOptimizationPolicyESet;
		enableOptimizationPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY, oldEnableOptimizationPolicy, enableOptimizationPolicy, !oldEnableOptimizationPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableOptimizationPolicy() {
		boolean oldEnableOptimizationPolicy = enableOptimizationPolicy;
		boolean oldEnableOptimizationPolicyESet = enableOptimizationPolicyESet;
		enableOptimizationPolicy = ENABLE_OPTIMIZATION_POLICY_EDEFAULT;
		enableOptimizationPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY, oldEnableOptimizationPolicy, ENABLE_OPTIMIZATION_POLICY_EDEFAULT, oldEnableOptimizationPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableOptimizationPolicy() {
		return enableOptimizationPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableCloudOptimizationPolicy() {
		return enableCloudOptimizationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableCloudOptimizationPolicy(boolean newEnableCloudOptimizationPolicy) {
		boolean oldEnableCloudOptimizationPolicy = enableCloudOptimizationPolicy;
		enableCloudOptimizationPolicy = newEnableCloudOptimizationPolicy;
		boolean oldEnableCloudOptimizationPolicyESet = enableCloudOptimizationPolicyESet;
		enableCloudOptimizationPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelfletPackage.SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY, oldEnableCloudOptimizationPolicy, enableCloudOptimizationPolicy, !oldEnableCloudOptimizationPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableCloudOptimizationPolicy() {
		boolean oldEnableCloudOptimizationPolicy = enableCloudOptimizationPolicy;
		boolean oldEnableCloudOptimizationPolicyESet = enableCloudOptimizationPolicyESet;
		enableCloudOptimizationPolicy = ENABLE_CLOUD_OPTIMIZATION_POLICY_EDEFAULT;
		enableCloudOptimizationPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SelfletPackage.SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY, oldEnableCloudOptimizationPolicy, ENABLE_CLOUD_OPTIMIZATION_POLICY_EDEFAULT, oldEnableCloudOptimizationPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableCloudOptimizationPolicy() {
		return enableCloudOptimizationPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelfletPackage.SELFLET_PROPERTIES__PASSIVE:
				return basicSetPassive(null, msgs);
			case SelfletPackage.SELFLET_PROPERTIES__ACTIVE:
				return basicSetActive(null, msgs);
			case SelfletPackage.SELFLET_PROPERTIES__REDS:
				return basicSetReds(null, msgs);
			case SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE:
				return basicSetGeneralknowledge(null, msgs);
			case SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE:
				return basicSetTypeKnowledge(null, msgs);
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
			case SelfletPackage.SELFLET_PROPERTIES__AUTHOR:
				return getAuthor();
			case SelfletPackage.SELFLET_PROPERTIES__DESCRIPTION:
				return getDescription();
			case SelfletPackage.SELFLET_PROPERTIES__PASSIVE:
				return getPassive();
			case SelfletPackage.SELFLET_PROPERTIES__ACTIVE:
				return getActive();
			case SelfletPackage.SELFLET_PROPERTIES__REDS:
				return getReds();
			case SelfletPackage.SELFLET_PROPERTIES__LIME_PORT:
				return getLimePort();
			case SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE:
				return getGeneralknowledge();
			case SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE:
				return getTypeKnowledge();
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY:
				return isEnableOptimizationPolicy();
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY:
				return isEnableCloudOptimizationPolicy();
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
			case SelfletPackage.SELFLET_PROPERTIES__AUTHOR:
				setAuthor((String)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__PASSIVE:
				setPassive((Empty)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__ACTIVE:
				setActive((Active)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__REDS:
				setReds((Reds)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__LIME_PORT:
				setLimePort((Integer)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE:
				setGeneralknowledge((GeneralKnowledge)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE:
				setTypeKnowledge((TypeKnowledge)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY:
				setEnableOptimizationPolicy((Boolean)newValue);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY:
				setEnableCloudOptimizationPolicy((Boolean)newValue);
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
			case SelfletPackage.SELFLET_PROPERTIES__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__PASSIVE:
				setPassive((Empty)null);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__ACTIVE:
				setActive((Active)null);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__REDS:
				setReds((Reds)null);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__LIME_PORT:
				unsetLimePort();
				return;
			case SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE:
				setGeneralknowledge((GeneralKnowledge)null);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE:
				setTypeKnowledge((TypeKnowledge)null);
				return;
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY:
				unsetEnableOptimizationPolicy();
				return;
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY:
				unsetEnableCloudOptimizationPolicy();
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
			case SelfletPackage.SELFLET_PROPERTIES__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case SelfletPackage.SELFLET_PROPERTIES__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SelfletPackage.SELFLET_PROPERTIES__PASSIVE:
				return passive != null;
			case SelfletPackage.SELFLET_PROPERTIES__ACTIVE:
				return active != null;
			case SelfletPackage.SELFLET_PROPERTIES__REDS:
				return reds != null;
			case SelfletPackage.SELFLET_PROPERTIES__LIME_PORT:
				return isSetLimePort();
			case SelfletPackage.SELFLET_PROPERTIES__GENERALKNOWLEDGE:
				return generalknowledge != null;
			case SelfletPackage.SELFLET_PROPERTIES__TYPE_KNOWLEDGE:
				return typeKnowledge != null;
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY:
				return isSetEnableOptimizationPolicy();
			case SelfletPackage.SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY:
				return isSetEnableCloudOptimizationPolicy();
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
		result.append(" (author: ");
		result.append(author);
		result.append(", description: ");
		result.append(description);
		result.append(", limePort: ");
		if (limePortESet) result.append(limePort); else result.append("<unset>");
		result.append(", enableOptimizationPolicy: ");
		if (enableOptimizationPolicyESet) result.append(enableOptimizationPolicy); else result.append("<unset>");
		result.append(", enableCloudOptimizationPolicy: ");
		if (enableCloudOptimizationPolicyESet) result.append(enableCloudOptimizationPolicy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SelfletPropertiesImpl
