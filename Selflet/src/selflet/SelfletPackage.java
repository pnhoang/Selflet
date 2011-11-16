/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see selflet.SelfletFactory
 * @model kind="package"
 * @generated
 */
public interface SelfletPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "selflet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sourceforge.net/projects/selflet/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "selflet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelfletPackage eINSTANCE = selflet.impl.SelfletPackageImpl.init();

	/**
	 * The meta object id for the '{@link selflet.impl.AbilitiesImpl <em>Abilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.AbilitiesImpl
	 * @see selflet.impl.SelfletPackageImpl#getAbilities()
	 * @generated
	 */
	int ABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITIES__ABILITY = 0;

	/**
	 * The number of structural features of the '<em>Abilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.AbilityImpl
	 * @see selflet.impl.SelfletPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__METHODS = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__FILE = 2;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link selflet.impl.ActionsImpl <em>Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ActionsImpl
	 * @see selflet.impl.SelfletPackageImpl#getActions()
	 * @generated
	 */
	int ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ActionImpl
	 * @see selflet.impl.SelfletPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FILE = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ActiveImpl <em>Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ActiveImpl
	 * @see selflet.impl.SelfletPackageImpl#getActive()
	 * @generated
	 */
	int ACTIVE = 4;

	/**
	 * The feature id for the '<em><b>Main Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE__MAIN_SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.BehaviorImpl
	 * @see selflet.impl.SelfletPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 5;

	/**
	 * The feature id for the '<em><b>Elementary Behavior Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ELEMENTARY_BEHAVIOR_COST = 0;

	/**
	 * The feature id for the '<em><b>Elementary Behavior CPU Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__FILE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Is Default Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IS_DEFAULT_BEHAVIOR = 3;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__IMPLEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__NAME = 5;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link selflet.impl.ConditionsImpl <em>Conditions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ConditionsImpl
	 * @see selflet.impl.SelfletPackageImpl#getConditions()
	 * @generated
	 */
	int CONDITIONS = 6;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ConditionImpl
	 * @see selflet.impl.SelfletPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FILE = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.CPUUtilizationImpl <em>CPU Utilization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.CPUUtilizationImpl
	 * @see selflet.impl.SelfletPackageImpl#getCPUUtilization()
	 * @generated
	 */
	int CPU_UTILIZATION = 8;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>CPU Utilization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link selflet.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.EmptyImpl
	 * @see selflet.impl.SelfletPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 9;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link selflet.impl.GeneralKnowledgeImpl <em>General Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.GeneralKnowledgeImpl
	 * @see selflet.impl.SelfletPackageImpl#getGeneralKnowledge()
	 * @generated
	 */
	int GENERAL_KNOWLEDGE = 10;

	/**
	 * The feature id for the '<em><b>Self Let Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_KNOWLEDGE__SELF_LET_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>General Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_KNOWLEDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.InputImpl
	 * @see selflet.impl.SelfletPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 11;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.MethodImpl
	 * @see selflet.impl.SelfletPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 12;

	/**
	 * The feature id for the '<em><b>Param Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link selflet.impl.MethodsImpl <em>Methods</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.MethodsImpl
	 * @see selflet.impl.SelfletPackageImpl#getMethods()
	 * @generated
	 */
	int METHODS = 13;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Methods</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHODS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.OfferModeImpl <em>Offer Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.OfferModeImpl
	 * @see selflet.impl.SelfletPackageImpl#getOfferMode()
	 * @generated
	 */
	int OFFER_MODE = 14;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_MODE__MODE = 0;

	/**
	 * The number of structural features of the '<em>Offer Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFER_MODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.OutputImpl
	 * @see selflet.impl.SelfletPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 15;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ParameterImpl
	 * @see selflet.impl.SelfletPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link selflet.impl.RedsImpl <em>Reds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.RedsImpl
	 * @see selflet.impl.SelfletPackageImpl#getReds()
	 * @generated
	 */
	int REDS = 17;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDS__IP_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDS__PORT = 1;

	/**
	 * The number of structural features of the '<em>Reds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link selflet.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.RulesImpl
	 * @see selflet.impl.SelfletPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 18;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__RULE = 0;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.RuleImpl
	 * @see selflet.impl.SelfletPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 19;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FILE = 0;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.SelfletImpl <em>Selflet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.SelfletImpl
	 * @see selflet.impl.SelfletPackageImpl#getSelflet()
	 * @generated
	 */
	int SELFLET = 20;

	/**
	 * The feature id for the '<em><b>Selflet Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET__SELFLET_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Selflet Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET__SELFLET_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET__NAME = 2;

	/**
	 * The number of structural features of the '<em>Selflet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link selflet.impl.SelfletPropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.SelfletPropertiesImpl
	 * @see selflet.impl.SelfletPackageImpl#getSelfletProperties()
	 * @generated
	 */
	int SELFLET_PROPERTIES = 21;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Passive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__PASSIVE = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Reds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__REDS = 4;

	/**
	 * The feature id for the '<em><b>Lime Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__LIME_PORT = 5;

	/**
	 * The feature id for the '<em><b>Generalknowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__GENERALKNOWLEDGE = 6;

	/**
	 * The feature id for the '<em><b>Type Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__TYPE_KNOWLEDGE = 7;

	/**
	 * The feature id for the '<em><b>Enable Optimization Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Enable Cloud Optimization Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY = 9;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_PROPERTIES_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link selflet.impl.SelfLetPropertyImpl <em>Self Let Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.SelfLetPropertyImpl
	 * @see selflet.impl.SelfletPackageImpl#getSelfLetProperty()
	 * @generated
	 */
	int SELF_LET_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_LET_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_LET_PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_LET_PROPERTY__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Self Let Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_LET_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link selflet.impl.SelfletResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.SelfletResourcesImpl
	 * @see selflet.impl.SelfletPackageImpl#getSelfletResources()
	 * @generated
	 */
	int SELFLET_RESOURCES = 23;

	/**
	 * The feature id for the '<em><b>Abilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_RESOURCES__ABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_RESOURCES__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_RESOURCES__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_RESOURCES__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_RESOURCES__RULES = 4;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELFLET_RESOURCES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link selflet.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ServicesImpl
	 * @see selflet.impl.SelfletPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 24;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ServiceImpl
	 * @see selflet.impl.SelfletPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 25;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Offermode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__OFFERMODE = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Revenue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__REVENUE = 4;

	/**
	 * The feature id for the '<em><b>Max Response Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__MAX_RESPONSE_TIME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Implementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMPLEMENTATIONS = 7;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link selflet.impl.TypeKnowledgeImpl <em>Type Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.TypeKnowledgeImpl
	 * @see selflet.impl.SelfletPackageImpl#getTypeKnowledge()
	 * @generated
	 */
	int TYPE_KNOWLEDGE = 26;

	/**
	 * The feature id for the '<em><b>Self Let Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_KNOWLEDGE__SELF_LET_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Type Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_KNOWLEDGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ElementaryBehaviorImpl <em>Elementary Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ElementaryBehaviorImpl
	 * @see selflet.impl.SelfletPackageImpl#getElementaryBehavior()
	 * @generated
	 */
	int ELEMENTARY_BEHAVIOR = 27;

	/**
	 * The feature id for the '<em><b>Elementary Behavior Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__ELEMENTARY_BEHAVIOR_COST = BEHAVIOR__ELEMENTARY_BEHAVIOR_COST;

	/**
	 * The feature id for the '<em><b>Elementary Behavior CPU Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME = BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__FILE_NAME = BEHAVIOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Is Default Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__IS_DEFAULT_BEHAVIOR = BEHAVIOR__IS_DEFAULT_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__IMPLEMENTS = BEHAVIOR__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR__STATES = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elementary Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link selflet.impl.ComplexBehaviorImpl <em>Complex Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.ComplexBehaviorImpl
	 * @see selflet.impl.SelfletPackageImpl#getComplexBehavior()
	 * @generated
	 */
	int COMPLEX_BEHAVIOR = 28;

	/**
	 * The feature id for the '<em><b>Elementary Behavior Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__ELEMENTARY_BEHAVIOR_COST = BEHAVIOR__ELEMENTARY_BEHAVIOR_COST;

	/**
	 * The feature id for the '<em><b>Elementary Behavior CPU Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME = BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__FILE_NAME = BEHAVIOR__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Is Default Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__IS_DEFAULT_BEHAVIOR = BEHAVIOR__IS_DEFAULT_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__IMPLEMENTS = BEHAVIOR__IMPLEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__NAME = BEHAVIOR__NAME;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR__STATES = BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_BEHAVIOR_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link selflet.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.StateImpl
	 * @see selflet.impl.SelfletPackageImpl#getState()
	 * @generated
	 */
	int STATE = 29;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link selflet.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.InitialStateImpl
	 * @see selflet.impl.SelfletPackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 30;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NEXT = STATE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link selflet.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.FinalStateImpl
	 * @see selflet.impl.SelfletPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 31;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NEXT = STATE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link selflet.impl.AbilityStateImpl <em>Ability State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.AbilityStateImpl
	 * @see selflet.impl.SelfletPackageImpl#getAbilityState()
	 * @generated
	 */
	int ABILITY_STATE = 32;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_STATE__NEXT = STATE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Do</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_STATE__DO = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ability State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link selflet.impl.InvocationStateImpl <em>Invocation State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.InvocationStateImpl
	 * @see selflet.impl.SelfletPackageImpl#getInvocationState()
	 * @generated
	 */
	int INVOCATION_STATE = 33;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_STATE__NEXT = STATE__NEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Invoke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_STATE__INVOKE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Invocation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOCATION_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link selflet.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.Mode
	 * @see selflet.impl.SelfletPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 34;

	/**
	 * The meta object id for the '{@link selflet.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.Type
	 * @see selflet.impl.SelfletPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 35;

	/**
	 * The meta object id for the '<em>Ip Address</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see selflet.impl.SelfletPackageImpl#getIpAddress()
	 * @generated
	 */
	int IP_ADDRESS = 36;

	/**
	 * The meta object id for the '<em>Ip Address Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see selflet.impl.SelfletPackageImpl#getIpAddressObject()
	 * @generated
	 */
	int IP_ADDRESS_OBJECT = 37;

	/**
	 * The meta object id for the '<em>Lime Port</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.SelfletPackageImpl#getLimePort()
	 * @generated
	 */
	int LIME_PORT = 38;

	/**
	 * The meta object id for the '<em>Lime Port Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see selflet.impl.SelfletPackageImpl#getLimePortObject()
	 * @generated
	 */
	int LIME_PORT_OBJECT = 39;

	/**
	 * The meta object id for the '<em>Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.Mode
	 * @see selflet.impl.SelfletPackageImpl#getModeTypeObject()
	 * @generated
	 */
	int MODE_TYPE_OBJECT = 40;

	/**
	 * The meta object id for the '<em>Port</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.impl.SelfletPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 41;

	/**
	 * The meta object id for the '<em>Port Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see selflet.impl.SelfletPackageImpl#getPortObject()
	 * @generated
	 */
	int PORT_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see selflet.Type
	 * @see selflet.impl.SelfletPackageImpl#getTypeObject()
	 * @generated
	 */
	int TYPE_OBJECT = 43;


	/**
	 * Returns the meta object for class '{@link selflet.Abilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abilities</em>'.
	 * @see selflet.Abilities
	 * @generated
	 */
	EClass getAbilities();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Abilities#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ability</em>'.
	 * @see selflet.Abilities#getAbility()
	 * @see #getAbilities()
	 * @generated
	 */
	EReference getAbilities_Ability();

	/**
	 * Returns the meta object for class '{@link selflet.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see selflet.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Ability#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see selflet.Ability#getService()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Service();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Ability#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Methods</em>'.
	 * @see selflet.Ability#getMethods()
	 * @see #getAbility()
	 * @generated
	 */
	EReference getAbility_Methods();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Ability#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see selflet.Ability#getFile()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_File();

	/**
	 * Returns the meta object for class '{@link selflet.Actions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actions</em>'.
	 * @see selflet.Actions
	 * @generated
	 */
	EClass getActions();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Actions#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see selflet.Actions#getAction()
	 * @see #getActions()
	 * @generated
	 */
	EReference getActions_Action();

	/**
	 * Returns the meta object for class '{@link selflet.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see selflet.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Action#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see selflet.Action#getFile()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_File();

	/**
	 * Returns the meta object for class '{@link selflet.Active <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active</em>'.
	 * @see selflet.Active
	 * @generated
	 */
	EClass getActive();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Active#getMainService <em>Main Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Service</em>'.
	 * @see selflet.Active#getMainService()
	 * @see #getActive()
	 * @generated
	 */
	EAttribute getActive_MainService();

	/**
	 * Returns the meta object for class '{@link selflet.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see selflet.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Behavior#getElementaryBehaviorCost <em>Elementary Behavior Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elementary Behavior Cost</em>'.
	 * @see selflet.Behavior#getElementaryBehaviorCost()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_ElementaryBehaviorCost();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Behavior#getElementaryBehaviorCPUTime <em>Elementary Behavior CPU Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elementary Behavior CPU Time</em>'.
	 * @see selflet.Behavior#getElementaryBehaviorCPUTime()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_ElementaryBehaviorCPUTime();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Behavior#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see selflet.Behavior#getFileName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_FileName();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Behavior#isIsDefaultBehavior <em>Is Default Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Behavior</em>'.
	 * @see selflet.Behavior#isIsDefaultBehavior()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_IsDefaultBehavior();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Behavior#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implements</em>'.
	 * @see selflet.Behavior#getImplements()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_Implements();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Behavior#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.Behavior#getName()
	 * @see #getBehavior()
	 * @generated
	 */
	EAttribute getBehavior_Name();

	/**
	 * Returns the meta object for class '{@link selflet.Conditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditions</em>'.
	 * @see selflet.Conditions
	 * @generated
	 */
	EClass getConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Conditions#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see selflet.Conditions#getCondition()
	 * @see #getConditions()
	 * @generated
	 */
	EReference getConditions_Condition();

	/**
	 * Returns the meta object for class '{@link selflet.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see selflet.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Condition#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see selflet.Condition#getFile()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_File();

	/**
	 * Returns the meta object for class '{@link selflet.CPUUtilization <em>CPU Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Utilization</em>'.
	 * @see selflet.CPUUtilization
	 * @generated
	 */
	EClass getCPUUtilization();

	/**
	 * Returns the meta object for the attribute '{@link selflet.CPUUtilization#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see selflet.CPUUtilization#getLowerBound()
	 * @see #getCPUUtilization()
	 * @generated
	 */
	EAttribute getCPUUtilization_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link selflet.CPUUtilization#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see selflet.CPUUtilization#getUpperBound()
	 * @see #getCPUUtilization()
	 * @generated
	 */
	EAttribute getCPUUtilization_UpperBound();

	/**
	 * Returns the meta object for class '{@link selflet.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see selflet.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link selflet.GeneralKnowledge <em>General Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Knowledge</em>'.
	 * @see selflet.GeneralKnowledge
	 * @generated
	 */
	EClass getGeneralKnowledge();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.GeneralKnowledge#getSelfLetProperty <em>Self Let Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Self Let Property</em>'.
	 * @see selflet.GeneralKnowledge#getSelfLetProperty()
	 * @see #getGeneralKnowledge()
	 * @generated
	 */
	EReference getGeneralKnowledge_SelfLetProperty();

	/**
	 * Returns the meta object for class '{@link selflet.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see selflet.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Input#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see selflet.Input#getParameter()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Parameter();

	/**
	 * Returns the meta object for class '{@link selflet.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see selflet.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute list '{@link selflet.Method#getParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Param Type</em>'.
	 * @see selflet.Method#getParamType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_ParamType();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for class '{@link selflet.Methods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Methods</em>'.
	 * @see selflet.Methods
	 * @generated
	 */
	EClass getMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Methods#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see selflet.Methods#getMethod()
	 * @see #getMethods()
	 * @generated
	 */
	EReference getMethods_Method();

	/**
	 * Returns the meta object for class '{@link selflet.OfferMode <em>Offer Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offer Mode</em>'.
	 * @see selflet.OfferMode
	 * @generated
	 */
	EClass getOfferMode();

	/**
	 * Returns the meta object for the attribute '{@link selflet.OfferMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see selflet.OfferMode#getMode()
	 * @see #getOfferMode()
	 * @generated
	 */
	EAttribute getOfferMode_Mode();

	/**
	 * Returns the meta object for class '{@link selflet.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see selflet.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Output#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see selflet.Output#getParameter()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Parameter();

	/**
	 * Returns the meta object for class '{@link selflet.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see selflet.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see selflet.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for class '{@link selflet.Reds <em>Reds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reds</em>'.
	 * @see selflet.Reds
	 * @generated
	 */
	EClass getReds();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Reds#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see selflet.Reds#getIpAddress()
	 * @see #getReds()
	 * @generated
	 */
	EAttribute getReds_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Reds#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see selflet.Reds#getPort()
	 * @see #getReds()
	 * @generated
	 */
	EAttribute getReds_Port();

	/**
	 * Returns the meta object for class '{@link selflet.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see selflet.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Rules#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see selflet.Rules#getRule()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Rule();

	/**
	 * Returns the meta object for class '{@link selflet.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see selflet.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Rule#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see selflet.Rule#getFile()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_File();

	/**
	 * Returns the meta object for class '{@link selflet.Selflet <em>Selflet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selflet</em>'.
	 * @see selflet.Selflet
	 * @generated
	 */
	EClass getSelflet();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Selflet#getSelfletProperties <em>Selflet Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selflet Properties</em>'.
	 * @see selflet.Selflet#getSelfletProperties()
	 * @see #getSelflet()
	 * @generated
	 */
	EReference getSelflet_SelfletProperties();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Selflet#getSelfletResources <em>Selflet Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selflet Resources</em>'.
	 * @see selflet.Selflet#getSelfletResources()
	 * @see #getSelflet()
	 * @generated
	 */
	EReference getSelflet_SelfletResources();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Selflet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.Selflet#getName()
	 * @see #getSelflet()
	 * @generated
	 */
	EAttribute getSelflet_Name();

	/**
	 * Returns the meta object for class '{@link selflet.SelfletProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see selflet.SelfletProperties
	 * @generated
	 */
	EClass getSelfletProperties();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfletProperties#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see selflet.SelfletProperties#getAuthor()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EAttribute getSelfletProperties_Author();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfletProperties#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see selflet.SelfletProperties#getDescription()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EAttribute getSelfletProperties_Description();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletProperties#getPassive <em>Passive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passive</em>'.
	 * @see selflet.SelfletProperties#getPassive()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EReference getSelfletProperties_Passive();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletProperties#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Active</em>'.
	 * @see selflet.SelfletProperties#getActive()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EReference getSelfletProperties_Active();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletProperties#getReds <em>Reds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reds</em>'.
	 * @see selflet.SelfletProperties#getReds()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EReference getSelfletProperties_Reds();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfletProperties#getLimePort <em>Lime Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lime Port</em>'.
	 * @see selflet.SelfletProperties#getLimePort()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EAttribute getSelfletProperties_LimePort();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletProperties#getGeneralknowledge <em>Generalknowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generalknowledge</em>'.
	 * @see selflet.SelfletProperties#getGeneralknowledge()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EReference getSelfletProperties_Generalknowledge();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletProperties#getTypeKnowledge <em>Type Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Knowledge</em>'.
	 * @see selflet.SelfletProperties#getTypeKnowledge()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EReference getSelfletProperties_TypeKnowledge();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfletProperties#isEnableOptimizationPolicy <em>Enable Optimization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Optimization Policy</em>'.
	 * @see selflet.SelfletProperties#isEnableOptimizationPolicy()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EAttribute getSelfletProperties_EnableOptimizationPolicy();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfletProperties#isEnableCloudOptimizationPolicy <em>Enable Cloud Optimization Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Cloud Optimization Policy</em>'.
	 * @see selflet.SelfletProperties#isEnableCloudOptimizationPolicy()
	 * @see #getSelfletProperties()
	 * @generated
	 */
	EAttribute getSelfletProperties_EnableCloudOptimizationPolicy();

	/**
	 * Returns the meta object for class '{@link selflet.SelfLetProperty <em>Self Let Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Let Property</em>'.
	 * @see selflet.SelfLetProperty
	 * @generated
	 */
	EClass getSelfLetProperty();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfLetProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.SelfLetProperty#getName()
	 * @see #getSelfLetProperty()
	 * @generated
	 */
	EAttribute getSelfLetProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfLetProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see selflet.SelfLetProperty#getType()
	 * @see #getSelfLetProperty()
	 * @generated
	 */
	EAttribute getSelfLetProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link selflet.SelfLetProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see selflet.SelfLetProperty#getValue()
	 * @see #getSelfLetProperty()
	 * @generated
	 */
	EAttribute getSelfLetProperty_Value();

	/**
	 * Returns the meta object for class '{@link selflet.SelfletResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see selflet.SelfletResources
	 * @generated
	 */
	EClass getSelfletResources();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletResources#getAbilities <em>Abilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abilities</em>'.
	 * @see selflet.SelfletResources#getAbilities()
	 * @see #getSelfletResources()
	 * @generated
	 */
	EReference getSelfletResources_Abilities();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletResources#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actions</em>'.
	 * @see selflet.SelfletResources#getActions()
	 * @see #getSelfletResources()
	 * @generated
	 */
	EReference getSelfletResources_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletResources#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditions</em>'.
	 * @see selflet.SelfletResources#getConditions()
	 * @see #getSelfletResources()
	 * @generated
	 */
	EReference getSelfletResources_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletResources#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see selflet.SelfletResources#getServices()
	 * @see #getSelfletResources()
	 * @generated
	 */
	EReference getSelfletResources_Services();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.SelfletResources#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rules</em>'.
	 * @see selflet.SelfletResources#getRules()
	 * @see #getSelfletResources()
	 * @generated
	 */
	EReference getSelfletResources_Rules();

	/**
	 * Returns the meta object for class '{@link selflet.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see selflet.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Services#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see selflet.Services#getService()
	 * @see #getServices()
	 * @generated
	 */
	EReference getServices_Service();

	/**
	 * Returns the meta object for class '{@link selflet.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see selflet.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Service#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see selflet.Service#getInput()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Input();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Service#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see selflet.Service#getOutput()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Output();

	/**
	 * Returns the meta object for the containment reference '{@link selflet.Service#getOffermode <em>Offermode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Offermode</em>'.
	 * @see selflet.Service#getOffermode()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Offermode();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Service#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see selflet.Service#isActive()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Active();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Service#getRevenue <em>Revenue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revenue</em>'.
	 * @see selflet.Service#getRevenue()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Revenue();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Service#getMaxResponseTime <em>Max Response Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Response Time</em>'.
	 * @see selflet.Service#getMaxResponseTime()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_MaxResponseTime();

	/**
	 * Returns the meta object for the attribute '{@link selflet.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.Service#getImplementations <em>Implementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementations</em>'.
	 * @see selflet.Service#getImplementations()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Implementations();

	/**
	 * Returns the meta object for class '{@link selflet.TypeKnowledge <em>Type Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Knowledge</em>'.
	 * @see selflet.TypeKnowledge
	 * @generated
	 */
	EClass getTypeKnowledge();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.TypeKnowledge#getSelfLetProperty <em>Self Let Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Self Let Property</em>'.
	 * @see selflet.TypeKnowledge#getSelfLetProperty()
	 * @see #getTypeKnowledge()
	 * @generated
	 */
	EReference getTypeKnowledge_SelfLetProperty();

	/**
	 * Returns the meta object for class '{@link selflet.ElementaryBehavior <em>Elementary Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Behavior</em>'.
	 * @see selflet.ElementaryBehavior
	 * @generated
	 */
	EClass getElementaryBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.ElementaryBehavior#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see selflet.ElementaryBehavior#getStates()
	 * @see #getElementaryBehavior()
	 * @generated
	 */
	EReference getElementaryBehavior_States();

	/**
	 * Returns the meta object for class '{@link selflet.ComplexBehavior <em>Complex Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Behavior</em>'.
	 * @see selflet.ComplexBehavior
	 * @generated
	 */
	EClass getComplexBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link selflet.ComplexBehavior#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see selflet.ComplexBehavior#getStates()
	 * @see #getComplexBehavior()
	 * @generated
	 */
	EReference getComplexBehavior_States();

	/**
	 * Returns the meta object for class '{@link selflet.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see selflet.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link selflet.State#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next</em>'.
	 * @see selflet.State#getNext()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Next();

	/**
	 * Returns the meta object for the attribute '{@link selflet.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see selflet.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link selflet.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see selflet.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link selflet.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see selflet.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link selflet.AbilityState <em>Ability State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability State</em>'.
	 * @see selflet.AbilityState
	 * @generated
	 */
	EClass getAbilityState();

	/**
	 * Returns the meta object for the reference '{@link selflet.AbilityState#getDo <em>Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Do</em>'.
	 * @see selflet.AbilityState#getDo()
	 * @see #getAbilityState()
	 * @generated
	 */
	EReference getAbilityState_Do();

	/**
	 * Returns the meta object for class '{@link selflet.InvocationState <em>Invocation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invocation State</em>'.
	 * @see selflet.InvocationState
	 * @generated
	 */
	EClass getInvocationState();

	/**
	 * Returns the meta object for the reference '{@link selflet.InvocationState#getInvoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoke</em>'.
	 * @see selflet.InvocationState#getInvoke()
	 * @see #getInvocationState()
	 * @generated
	 */
	EReference getInvocationState_Invoke();

	/**
	 * Returns the meta object for enum '{@link selflet.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see selflet.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link selflet.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see selflet.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ipAddress' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getIpAddress();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Ip Address Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ip Address Object</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ipAddress_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]).){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])'"
	 * @generated
	 */
	EDataType getIpAddressObject();

	/**
	 * Returns the meta object for data type '<em>Lime Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lime Port</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='limePort_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getLimePort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Lime Port Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lime Port Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='limePort_._type:Object' baseType='limePort_._type'"
	 * @generated
	 */
	EDataType getLimePortObject();

	/**
	 * Returns the meta object for data type '{@link selflet.Mode <em>Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mode Type Object</em>'.
	 * @see selflet.Mode
	 * @model instanceClass="selflet.Mode"
	 *        extendedMetaData="name='mode_._type:Object' baseType='mode_._type'"
	 * @generated
	 */
	EDataType getModeTypeObject();

	/**
	 * Returns the meta object for data type '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='port_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#int' minInclusive='1' maxInclusive='65535'"
	 * @generated
	 */
	EDataType getPort();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Port Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Port Object</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='port_._type:Object' baseType='port_._type'"
	 * @generated
	 */
	EDataType getPortObject();

	/**
	 * Returns the meta object for data type '{@link selflet.Type <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Object</em>'.
	 * @see selflet.Type
	 * @model instanceClass="selflet.Type"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SelfletFactory getSelfletFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link selflet.impl.AbilitiesImpl <em>Abilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.AbilitiesImpl
		 * @see selflet.impl.SelfletPackageImpl#getAbilities()
		 * @generated
		 */
		EClass ABILITIES = eINSTANCE.getAbilities();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITIES__ABILITY = eINSTANCE.getAbilities_Ability();

		/**
		 * The meta object literal for the '{@link selflet.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.AbilityImpl
		 * @see selflet.impl.SelfletPackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__SERVICE = eINSTANCE.getAbility_Service();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY__METHODS = eINSTANCE.getAbility_Methods();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__FILE = eINSTANCE.getAbility_File();

		/**
		 * The meta object literal for the '{@link selflet.impl.ActionsImpl <em>Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ActionsImpl
		 * @see selflet.impl.SelfletPackageImpl#getActions()
		 * @generated
		 */
		EClass ACTIONS = eINSTANCE.getActions();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIONS__ACTION = eINSTANCE.getActions_Action();

		/**
		 * The meta object literal for the '{@link selflet.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ActionImpl
		 * @see selflet.impl.SelfletPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FILE = eINSTANCE.getAction_File();

		/**
		 * The meta object literal for the '{@link selflet.impl.ActiveImpl <em>Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ActiveImpl
		 * @see selflet.impl.SelfletPackageImpl#getActive()
		 * @generated
		 */
		EClass ACTIVE = eINSTANCE.getActive();

		/**
		 * The meta object literal for the '<em><b>Main Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE__MAIN_SERVICE = eINSTANCE.getActive_MainService();

		/**
		 * The meta object literal for the '{@link selflet.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.BehaviorImpl
		 * @see selflet.impl.SelfletPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Elementary Behavior Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__ELEMENTARY_BEHAVIOR_COST = eINSTANCE.getBehavior_ElementaryBehaviorCost();

		/**
		 * The meta object literal for the '<em><b>Elementary Behavior CPU Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME = eINSTANCE.getBehavior_ElementaryBehaviorCPUTime();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__FILE_NAME = eINSTANCE.getBehavior_FileName();

		/**
		 * The meta object literal for the '<em><b>Is Default Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__IS_DEFAULT_BEHAVIOR = eINSTANCE.getBehavior_IsDefaultBehavior();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__IMPLEMENTS = eINSTANCE.getBehavior_Implements();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR__NAME = eINSTANCE.getBehavior_Name();

		/**
		 * The meta object literal for the '{@link selflet.impl.ConditionsImpl <em>Conditions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ConditionsImpl
		 * @see selflet.impl.SelfletPackageImpl#getConditions()
		 * @generated
		 */
		EClass CONDITIONS = eINSTANCE.getConditions();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONS__CONDITION = eINSTANCE.getConditions_Condition();

		/**
		 * The meta object literal for the '{@link selflet.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ConditionImpl
		 * @see selflet.impl.SelfletPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__FILE = eINSTANCE.getCondition_File();

		/**
		 * The meta object literal for the '{@link selflet.impl.CPUUtilizationImpl <em>CPU Utilization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.CPUUtilizationImpl
		 * @see selflet.impl.SelfletPackageImpl#getCPUUtilization()
		 * @generated
		 */
		EClass CPU_UTILIZATION = eINSTANCE.getCPUUtilization();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_UTILIZATION__LOWER_BOUND = eINSTANCE.getCPUUtilization_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_UTILIZATION__UPPER_BOUND = eINSTANCE.getCPUUtilization_UpperBound();

		/**
		 * The meta object literal for the '{@link selflet.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.EmptyImpl
		 * @see selflet.impl.SelfletPackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link selflet.impl.GeneralKnowledgeImpl <em>General Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.GeneralKnowledgeImpl
		 * @see selflet.impl.SelfletPackageImpl#getGeneralKnowledge()
		 * @generated
		 */
		EClass GENERAL_KNOWLEDGE = eINSTANCE.getGeneralKnowledge();

		/**
		 * The meta object literal for the '<em><b>Self Let Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_KNOWLEDGE__SELF_LET_PROPERTY = eINSTANCE.getGeneralKnowledge_SelfLetProperty();

		/**
		 * The meta object literal for the '{@link selflet.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.InputImpl
		 * @see selflet.impl.SelfletPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__PARAMETER = eINSTANCE.getInput_Parameter();

		/**
		 * The meta object literal for the '{@link selflet.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.MethodImpl
		 * @see selflet.impl.SelfletPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Param Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__PARAM_TYPE = eINSTANCE.getMethod_ParamType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '{@link selflet.impl.MethodsImpl <em>Methods</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.MethodsImpl
		 * @see selflet.impl.SelfletPackageImpl#getMethods()
		 * @generated
		 */
		EClass METHODS = eINSTANCE.getMethods();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHODS__METHOD = eINSTANCE.getMethods_Method();

		/**
		 * The meta object literal for the '{@link selflet.impl.OfferModeImpl <em>Offer Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.OfferModeImpl
		 * @see selflet.impl.SelfletPackageImpl#getOfferMode()
		 * @generated
		 */
		EClass OFFER_MODE = eINSTANCE.getOfferMode();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFER_MODE__MODE = eINSTANCE.getOfferMode_Mode();

		/**
		 * The meta object literal for the '{@link selflet.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.OutputImpl
		 * @see selflet.impl.SelfletPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__PARAMETER = eINSTANCE.getOutput_Parameter();

		/**
		 * The meta object literal for the '{@link selflet.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ParameterImpl
		 * @see selflet.impl.SelfletPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link selflet.impl.RedsImpl <em>Reds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.RedsImpl
		 * @see selflet.impl.SelfletPackageImpl#getReds()
		 * @generated
		 */
		EClass REDS = eINSTANCE.getReds();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDS__IP_ADDRESS = eINSTANCE.getReds_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDS__PORT = eINSTANCE.getReds_Port();

		/**
		 * The meta object literal for the '{@link selflet.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.RulesImpl
		 * @see selflet.impl.SelfletPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__RULE = eINSTANCE.getRules_Rule();

		/**
		 * The meta object literal for the '{@link selflet.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.RuleImpl
		 * @see selflet.impl.SelfletPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__FILE = eINSTANCE.getRule_File();

		/**
		 * The meta object literal for the '{@link selflet.impl.SelfletImpl <em>Selflet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.SelfletImpl
		 * @see selflet.impl.SelfletPackageImpl#getSelflet()
		 * @generated
		 */
		EClass SELFLET = eINSTANCE.getSelflet();

		/**
		 * The meta object literal for the '<em><b>Selflet Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET__SELFLET_PROPERTIES = eINSTANCE.getSelflet_SelfletProperties();

		/**
		 * The meta object literal for the '<em><b>Selflet Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET__SELFLET_RESOURCES = eINSTANCE.getSelflet_SelfletResources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELFLET__NAME = eINSTANCE.getSelflet_Name();

		/**
		 * The meta object literal for the '{@link selflet.impl.SelfletPropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.SelfletPropertiesImpl
		 * @see selflet.impl.SelfletPackageImpl#getSelfletProperties()
		 * @generated
		 */
		EClass SELFLET_PROPERTIES = eINSTANCE.getSelfletProperties();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELFLET_PROPERTIES__AUTHOR = eINSTANCE.getSelfletProperties_Author();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELFLET_PROPERTIES__DESCRIPTION = eINSTANCE.getSelfletProperties_Description();

		/**
		 * The meta object literal for the '<em><b>Passive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_PROPERTIES__PASSIVE = eINSTANCE.getSelfletProperties_Passive();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_PROPERTIES__ACTIVE = eINSTANCE.getSelfletProperties_Active();

		/**
		 * The meta object literal for the '<em><b>Reds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_PROPERTIES__REDS = eINSTANCE.getSelfletProperties_Reds();

		/**
		 * The meta object literal for the '<em><b>Lime Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELFLET_PROPERTIES__LIME_PORT = eINSTANCE.getSelfletProperties_LimePort();

		/**
		 * The meta object literal for the '<em><b>Generalknowledge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_PROPERTIES__GENERALKNOWLEDGE = eINSTANCE.getSelfletProperties_Generalknowledge();

		/**
		 * The meta object literal for the '<em><b>Type Knowledge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_PROPERTIES__TYPE_KNOWLEDGE = eINSTANCE.getSelfletProperties_TypeKnowledge();

		/**
		 * The meta object literal for the '<em><b>Enable Optimization Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY = eINSTANCE.getSelfletProperties_EnableOptimizationPolicy();

		/**
		 * The meta object literal for the '<em><b>Enable Cloud Optimization Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY = eINSTANCE.getSelfletProperties_EnableCloudOptimizationPolicy();

		/**
		 * The meta object literal for the '{@link selflet.impl.SelfLetPropertyImpl <em>Self Let Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.SelfLetPropertyImpl
		 * @see selflet.impl.SelfletPackageImpl#getSelfLetProperty()
		 * @generated
		 */
		EClass SELF_LET_PROPERTY = eINSTANCE.getSelfLetProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_LET_PROPERTY__NAME = eINSTANCE.getSelfLetProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_LET_PROPERTY__TYPE = eINSTANCE.getSelfLetProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELF_LET_PROPERTY__VALUE = eINSTANCE.getSelfLetProperty_Value();

		/**
		 * The meta object literal for the '{@link selflet.impl.SelfletResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.SelfletResourcesImpl
		 * @see selflet.impl.SelfletPackageImpl#getSelfletResources()
		 * @generated
		 */
		EClass SELFLET_RESOURCES = eINSTANCE.getSelfletResources();

		/**
		 * The meta object literal for the '<em><b>Abilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_RESOURCES__ABILITIES = eINSTANCE.getSelfletResources_Abilities();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_RESOURCES__ACTIONS = eINSTANCE.getSelfletResources_Actions();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_RESOURCES__CONDITIONS = eINSTANCE.getSelfletResources_Conditions();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_RESOURCES__SERVICES = eINSTANCE.getSelfletResources_Services();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELFLET_RESOURCES__RULES = eINSTANCE.getSelfletResources_Rules();

		/**
		 * The meta object literal for the '{@link selflet.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ServicesImpl
		 * @see selflet.impl.SelfletPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES__SERVICE = eINSTANCE.getServices_Service();

		/**
		 * The meta object literal for the '{@link selflet.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ServiceImpl
		 * @see selflet.impl.SelfletPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INPUT = eINSTANCE.getService_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OUTPUT = eINSTANCE.getService_Output();

		/**
		 * The meta object literal for the '<em><b>Offermode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__OFFERMODE = eINSTANCE.getService_Offermode();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ACTIVE = eINSTANCE.getService_Active();

		/**
		 * The meta object literal for the '<em><b>Revenue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__REVENUE = eINSTANCE.getService_Revenue();

		/**
		 * The meta object literal for the '<em><b>Max Response Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__MAX_RESPONSE_TIME = eINSTANCE.getService_MaxResponseTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Implementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__IMPLEMENTATIONS = eINSTANCE.getService_Implementations();

		/**
		 * The meta object literal for the '{@link selflet.impl.TypeKnowledgeImpl <em>Type Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.TypeKnowledgeImpl
		 * @see selflet.impl.SelfletPackageImpl#getTypeKnowledge()
		 * @generated
		 */
		EClass TYPE_KNOWLEDGE = eINSTANCE.getTypeKnowledge();

		/**
		 * The meta object literal for the '<em><b>Self Let Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_KNOWLEDGE__SELF_LET_PROPERTY = eINSTANCE.getTypeKnowledge_SelfLetProperty();

		/**
		 * The meta object literal for the '{@link selflet.impl.ElementaryBehaviorImpl <em>Elementary Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ElementaryBehaviorImpl
		 * @see selflet.impl.SelfletPackageImpl#getElementaryBehavior()
		 * @generated
		 */
		EClass ELEMENTARY_BEHAVIOR = eINSTANCE.getElementaryBehavior();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_BEHAVIOR__STATES = eINSTANCE.getElementaryBehavior_States();

		/**
		 * The meta object literal for the '{@link selflet.impl.ComplexBehaviorImpl <em>Complex Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.ComplexBehaviorImpl
		 * @see selflet.impl.SelfletPackageImpl#getComplexBehavior()
		 * @generated
		 */
		EClass COMPLEX_BEHAVIOR = eINSTANCE.getComplexBehavior();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_BEHAVIOR__STATES = eINSTANCE.getComplexBehavior_States();

		/**
		 * The meta object literal for the '{@link selflet.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.StateImpl
		 * @see selflet.impl.SelfletPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__NEXT = eINSTANCE.getState_Next();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link selflet.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.InitialStateImpl
		 * @see selflet.impl.SelfletPackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link selflet.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.FinalStateImpl
		 * @see selflet.impl.SelfletPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link selflet.impl.AbilityStateImpl <em>Ability State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.AbilityStateImpl
		 * @see selflet.impl.SelfletPackageImpl#getAbilityState()
		 * @generated
		 */
		EClass ABILITY_STATE = eINSTANCE.getAbilityState();

		/**
		 * The meta object literal for the '<em><b>Do</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABILITY_STATE__DO = eINSTANCE.getAbilityState_Do();

		/**
		 * The meta object literal for the '{@link selflet.impl.InvocationStateImpl <em>Invocation State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.InvocationStateImpl
		 * @see selflet.impl.SelfletPackageImpl#getInvocationState()
		 * @generated
		 */
		EClass INVOCATION_STATE = eINSTANCE.getInvocationState();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOCATION_STATE__INVOKE = eINSTANCE.getInvocationState_Invoke();

		/**
		 * The meta object literal for the '{@link selflet.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.Mode
		 * @see selflet.impl.SelfletPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link selflet.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.Type
		 * @see selflet.impl.SelfletPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Ip Address</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see selflet.impl.SelfletPackageImpl#getIpAddress()
		 * @generated
		 */
		EDataType IP_ADDRESS = eINSTANCE.getIpAddress();

		/**
		 * The meta object literal for the '<em>Ip Address Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see selflet.impl.SelfletPackageImpl#getIpAddressObject()
		 * @generated
		 */
		EDataType IP_ADDRESS_OBJECT = eINSTANCE.getIpAddressObject();

		/**
		 * The meta object literal for the '<em>Lime Port</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.SelfletPackageImpl#getLimePort()
		 * @generated
		 */
		EDataType LIME_PORT = eINSTANCE.getLimePort();

		/**
		 * The meta object literal for the '<em>Lime Port Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see selflet.impl.SelfletPackageImpl#getLimePortObject()
		 * @generated
		 */
		EDataType LIME_PORT_OBJECT = eINSTANCE.getLimePortObject();

		/**
		 * The meta object literal for the '<em>Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.Mode
		 * @see selflet.impl.SelfletPackageImpl#getModeTypeObject()
		 * @generated
		 */
		EDataType MODE_TYPE_OBJECT = eINSTANCE.getModeTypeObject();

		/**
		 * The meta object literal for the '<em>Port</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.impl.SelfletPackageImpl#getPort()
		 * @generated
		 */
		EDataType PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em>Port Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see selflet.impl.SelfletPackageImpl#getPortObject()
		 * @generated
		 */
		EDataType PORT_OBJECT = eINSTANCE.getPortObject();

		/**
		 * The meta object literal for the '<em>Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see selflet.Type
		 * @see selflet.impl.SelfletPackageImpl#getTypeObject()
		 * @generated
		 */
		EDataType TYPE_OBJECT = eINSTANCE.getTypeObject();

	}

} //SelfletPackage
