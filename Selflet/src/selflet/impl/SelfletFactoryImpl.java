/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import selflet.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfletFactoryImpl extends EFactoryImpl implements SelfletFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SelfletFactory init() {
		try {
			SelfletFactory theSelfletFactory = (SelfletFactory)EPackage.Registry.INSTANCE.getEFactory("http://sourceforge.net/projects/selflet/"); 
			if (theSelfletFactory != null) {
				return theSelfletFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SelfletFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SelfletPackage.ABILITIES: return createAbilities();
			case SelfletPackage.ABILITY: return createAbility();
			case SelfletPackage.ACTIONS: return createActions();
			case SelfletPackage.ACTION: return createAction();
			case SelfletPackage.ACTIVE: return createActive();
			case SelfletPackage.BEHAVIOR: return createBehavior();
			case SelfletPackage.CONDITIONS: return createConditions();
			case SelfletPackage.CONDITION: return createCondition();
			case SelfletPackage.CPU_UTILIZATION: return createCPUUtilization();
			case SelfletPackage.EMPTY: return createEmpty();
			case SelfletPackage.GENERAL_KNOWLEDGE: return createGeneralKnowledge();
			case SelfletPackage.INPUT: return createInput();
			case SelfletPackage.METHOD: return createMethod();
			case SelfletPackage.METHODS: return createMethods();
			case SelfletPackage.OFFER_MODE: return createOfferMode();
			case SelfletPackage.OUTPUT: return createOutput();
			case SelfletPackage.PARAMETER: return createParameter();
			case SelfletPackage.REDS: return createReds();
			case SelfletPackage.RULES: return createRules();
			case SelfletPackage.RULE: return createRule();
			case SelfletPackage.SELFLET: return createSelflet();
			case SelfletPackage.SELFLET_PROPERTIES: return createSelfletProperties();
			case SelfletPackage.SELF_LET_PROPERTY: return createSelfLetProperty();
			case SelfletPackage.SELFLET_RESOURCES: return createSelfletResources();
			case SelfletPackage.SERVICES: return createServices();
			case SelfletPackage.SERVICE: return createService();
			case SelfletPackage.TYPE_KNOWLEDGE: return createTypeKnowledge();
			case SelfletPackage.ELEMENTARY_BEHAVIOR: return createElementaryBehavior();
			case SelfletPackage.COMPLEX_BEHAVIOR: return createComplexBehavior();
			case SelfletPackage.STATE: return createState();
			case SelfletPackage.INITIAL_STATE: return createInitialState();
			case SelfletPackage.FINAL_STATE: return createFinalState();
			case SelfletPackage.ABILITY_STATE: return createAbilityState();
			case SelfletPackage.INVOCATION_STATE: return createInvocationState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SelfletPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case SelfletPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case SelfletPackage.IP_ADDRESS:
				return createIpAddressFromString(eDataType, initialValue);
			case SelfletPackage.IP_ADDRESS_OBJECT:
				return createIpAddressObjectFromString(eDataType, initialValue);
			case SelfletPackage.LIME_PORT:
				return createLimePortFromString(eDataType, initialValue);
			case SelfletPackage.LIME_PORT_OBJECT:
				return createLimePortObjectFromString(eDataType, initialValue);
			case SelfletPackage.MODE_TYPE_OBJECT:
				return createModeTypeObjectFromString(eDataType, initialValue);
			case SelfletPackage.PORT:
				return createPortFromString(eDataType, initialValue);
			case SelfletPackage.PORT_OBJECT:
				return createPortObjectFromString(eDataType, initialValue);
			case SelfletPackage.TYPE_OBJECT:
				return createTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SelfletPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case SelfletPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case SelfletPackage.IP_ADDRESS:
				return convertIpAddressToString(eDataType, instanceValue);
			case SelfletPackage.IP_ADDRESS_OBJECT:
				return convertIpAddressObjectToString(eDataType, instanceValue);
			case SelfletPackage.LIME_PORT:
				return convertLimePortToString(eDataType, instanceValue);
			case SelfletPackage.LIME_PORT_OBJECT:
				return convertLimePortObjectToString(eDataType, instanceValue);
			case SelfletPackage.MODE_TYPE_OBJECT:
				return convertModeTypeObjectToString(eDataType, instanceValue);
			case SelfletPackage.PORT:
				return convertPortToString(eDataType, instanceValue);
			case SelfletPackage.PORT_OBJECT:
				return convertPortObjectToString(eDataType, instanceValue);
			case SelfletPackage.TYPE_OBJECT:
				return convertTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Abilities createAbilities() {
		AbilitiesImpl abilities = new AbilitiesImpl();
		return abilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actions createActions() {
		ActionsImpl actions = new ActionsImpl();
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Active createActive() {
		ActiveImpl active = new ActiveImpl();
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior createBehavior() {
		BehaviorImpl behavior = new BehaviorImpl();
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditions createConditions() {
		ConditionsImpl conditions = new ConditionsImpl();
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUUtilization createCPUUtilization() {
		CPUUtilizationImpl cpuUtilization = new CPUUtilizationImpl();
		return cpuUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Empty createEmpty() {
		EmptyImpl empty = new EmptyImpl();
		return empty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralKnowledge createGeneralKnowledge() {
		GeneralKnowledgeImpl generalKnowledge = new GeneralKnowledgeImpl();
		return generalKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethod() {
		MethodImpl method = new MethodImpl();
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Methods createMethods() {
		MethodsImpl methods = new MethodsImpl();
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfferMode createOfferMode() {
		OfferModeImpl offerMode = new OfferModeImpl();
		return offerMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reds createReds() {
		RedsImpl reds = new RedsImpl();
		return reds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selflet createSelflet() {
		SelfletImpl selflet = new SelfletImpl();
		return selflet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletProperties createSelfletProperties() {
		SelfletPropertiesImpl selfletProperties = new SelfletPropertiesImpl();
		return selfletProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfLetProperty createSelfLetProperty() {
		SelfLetPropertyImpl selfLetProperty = new SelfLetPropertyImpl();
		return selfLetProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletResources createSelfletResources() {
		SelfletResourcesImpl selfletResources = new SelfletResourcesImpl();
		return selfletResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeKnowledge createTypeKnowledge() {
		TypeKnowledgeImpl typeKnowledge = new TypeKnowledgeImpl();
		return typeKnowledge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryBehavior createElementaryBehavior() {
		ElementaryBehaviorImpl elementaryBehavior = new ElementaryBehaviorImpl();
		return elementaryBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBehavior createComplexBehavior() {
		ComplexBehaviorImpl complexBehavior = new ComplexBehaviorImpl();
		return complexBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState createInitialState() {
		InitialStateImpl initialState = new InitialStateImpl();
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityState createAbilityState() {
		AbilityStateImpl abilityState = new AbilityStateImpl();
		return abilityState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationState createInvocationState() {
		InvocationStateImpl invocationState = new InvocationStateImpl();
		return invocationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpAddressFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpAddressToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIpAddressObjectFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIpAddressObjectToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createLimePortFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLimePortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createLimePortObjectFromString(EDataType eDataType, String initialValue) {
		return createLimePortFromString(SelfletPackage.Literals.LIME_PORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLimePortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLimePortToString(SelfletPackage.Literals.LIME_PORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeFromString(SelfletPackage.Literals.MODE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeToString(SelfletPackage.Literals.MODE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPortFromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createPortObjectFromString(EDataType eDataType, String initialValue) {
		return createPortFromString(SelfletPackage.Literals.PORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPortToString(SelfletPackage.Literals.PORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeFromString(SelfletPackage.Literals.TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeToString(SelfletPackage.Literals.TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletPackage getSelfletPackage() {
		return (SelfletPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SelfletPackage getPackage() {
		return SelfletPackage.eINSTANCE;
	}

} //SelfletFactoryImpl
