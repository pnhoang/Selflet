/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import selflet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see selflet.SelfletPackage
 * @generated
 */
public class SelfletValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SelfletValidator INSTANCE = new SelfletValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "selflet";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SelfletPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SelfletPackage.ABILITIES:
				return validateAbilities((Abilities)value, diagnostics, context);
			case SelfletPackage.ABILITY:
				return validateAbility((Ability)value, diagnostics, context);
			case SelfletPackage.ACTIONS:
				return validateActions((Actions)value, diagnostics, context);
			case SelfletPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case SelfletPackage.ACTIVE:
				return validateActive((Active)value, diagnostics, context);
			case SelfletPackage.BEHAVIOR:
				return validateBehavior((Behavior)value, diagnostics, context);
			case SelfletPackage.CONDITIONS:
				return validateConditions((Conditions)value, diagnostics, context);
			case SelfletPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case SelfletPackage.CPU_UTILIZATION:
				return validateCPUUtilization((CPUUtilization)value, diagnostics, context);
			case SelfletPackage.EMPTY:
				return validateEmpty((Empty)value, diagnostics, context);
			case SelfletPackage.GENERAL_KNOWLEDGE:
				return validateGeneralKnowledge((GeneralKnowledge)value, diagnostics, context);
			case SelfletPackage.INPUT:
				return validateInput((Input)value, diagnostics, context);
			case SelfletPackage.METHOD:
				return validateMethod((Method)value, diagnostics, context);
			case SelfletPackage.METHODS:
				return validateMethods((Methods)value, diagnostics, context);
			case SelfletPackage.OFFER_MODE:
				return validateOfferMode((OfferMode)value, diagnostics, context);
			case SelfletPackage.OUTPUT:
				return validateOutput((Output)value, diagnostics, context);
			case SelfletPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case SelfletPackage.REDS:
				return validateReds((Reds)value, diagnostics, context);
			case SelfletPackage.RULES:
				return validateRules((Rules)value, diagnostics, context);
			case SelfletPackage.RULE:
				return validateRule((Rule)value, diagnostics, context);
			case SelfletPackage.SELFLET:
				return validateSelflet((Selflet)value, diagnostics, context);
			case SelfletPackage.SELFLET_PROPERTIES:
				return validateSelfletProperties((SelfletProperties)value, diagnostics, context);
			case SelfletPackage.SELF_LET_PROPERTY:
				return validateSelfLetProperty((SelfLetProperty)value, diagnostics, context);
			case SelfletPackage.SELFLET_RESOURCES:
				return validateSelfletResources((SelfletResources)value, diagnostics, context);
			case SelfletPackage.SERVICES:
				return validateServices((Services)value, diagnostics, context);
			case SelfletPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case SelfletPackage.TYPE_KNOWLEDGE:
				return validateTypeKnowledge((TypeKnowledge)value, diagnostics, context);
			case SelfletPackage.ELEMENTARY_BEHAVIOR:
				return validateElementaryBehavior((ElementaryBehavior)value, diagnostics, context);
			case SelfletPackage.COMPLEX_BEHAVIOR:
				return validateComplexBehavior((ComplexBehavior)value, diagnostics, context);
			case SelfletPackage.STATE:
				return validateState((State)value, diagnostics, context);
			case SelfletPackage.INITIAL_STATE:
				return validateInitialState((InitialState)value, diagnostics, context);
			case SelfletPackage.FINAL_STATE:
				return validateFinalState((FinalState)value, diagnostics, context);
			case SelfletPackage.ABILITY_STATE:
				return validateAbilityState((AbilityState)value, diagnostics, context);
			case SelfletPackage.INVOCATION_STATE:
				return validateInvocationState((InvocationState)value, diagnostics, context);
			case SelfletPackage.MODE:
				return validateMode((Mode)value, diagnostics, context);
			case SelfletPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case SelfletPackage.IP_ADDRESS:
				return validateIpAddress((String)value, diagnostics, context);
			case SelfletPackage.IP_ADDRESS_OBJECT:
				return validateIpAddressObject((String)value, diagnostics, context);
			case SelfletPackage.LIME_PORT:
				return validateLimePort((Integer)value, diagnostics, context);
			case SelfletPackage.LIME_PORT_OBJECT:
				return validateLimePortObject((Integer)value, diagnostics, context);
			case SelfletPackage.MODE_TYPE_OBJECT:
				return validateModeTypeObject((Mode)value, diagnostics, context);
			case SelfletPackage.PORT:
				return validatePort((Integer)value, diagnostics, context);
			case SelfletPackage.PORT_OBJECT:
				return validatePortObject((Integer)value, diagnostics, context);
			case SelfletPackage.TYPE_OBJECT:
				return validateTypeObject((Type)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbilities(Abilities abilities, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abilities, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbility(Ability ability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActions(Actions actions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActive(Active active, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(active, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBehavior(Behavior behavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditions(Conditions conditions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCPUUtilization(CPUUtilization cpuUtilization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpuUtilization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmpty(Empty empty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(empty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralKnowledge(GeneralKnowledge generalKnowledge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(generalKnowledge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(input, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethod(Method method, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(method, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethods(Methods methods, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methods, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOfferMode(OfferMode offerMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(offerMode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(output, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReds(Reds reds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reds, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRules(Rules rules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rules, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRule(Rule rule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelflet(Selflet selflet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selflet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfletProperties(SelfletProperties selfletProperties, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selfletProperties, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfLetProperty(SelfLetProperty selfLetProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selfLetProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelfletResources(SelfletResources selfletResources, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selfletResources, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServices(Services services, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(services, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeKnowledge(TypeKnowledge typeKnowledge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeKnowledge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementaryBehavior(ElementaryBehavior elementaryBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementaryBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexBehavior(ComplexBehavior complexBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexBehavior, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(state, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialState(InitialState initialState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(initialState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinalState(FinalState finalState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(finalState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbilityState(AbilityState abilityState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abilityState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInvocationState(InvocationState invocationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(invocationState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMode(Mode mode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddress(String ipAddress, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddressObject(String ipAddressObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateIpAddressObject_Pattern(ipAddressObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateIpAddressObject_Pattern
	 */
	public static final  PatternMatcher [][] IP_ADDRESS_OBJECT__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]).){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Ip Address Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpAddressObject_Pattern(String ipAddressObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(SelfletPackage.Literals.IP_ADDRESS_OBJECT, ipAddressObject, IP_ADDRESS_OBJECT__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimePort(int limePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLimePort_Min(limePort, diagnostics, context);
		if (result || diagnostics != null) result &= validateLimePort_Max(limePort, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLimePort_Min
	 */
	public static final int LIME_PORT__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Lime Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimePort_Min(int limePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = limePort >= LIME_PORT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(SelfletPackage.Literals.LIME_PORT, limePort, LIME_PORT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLimePort_Max
	 */
	public static final int LIME_PORT__MAX__VALUE = 65535;

	/**
	 * Validates the Max constraint of '<em>Lime Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimePort_Max(int limePort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = limePort <= LIME_PORT__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(SelfletPackage.Literals.LIME_PORT, limePort, LIME_PORT__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLimePortObject(Integer limePortObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLimePort_Min(limePortObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLimePort_Max(limePortObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeTypeObject(Mode modeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(int port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePort_Min(port, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_Max(port, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePort_Min
	 */
	public static final int PORT__MIN__VALUE = 1;

	/**
	 * Validates the Min constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_Min(int port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = port >= PORT__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(SelfletPackage.Literals.PORT, port, PORT__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePort_Max
	 */
	public static final int PORT__MAX__VALUE = 65535;

	/**
	 * Validates the Max constraint of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort_Max(int port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = port <= PORT__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(SelfletPackage.Literals.PORT, port, PORT__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortObject(Integer portObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePort_Min(portObject, diagnostics, context);
		if (result || diagnostics != null) result &= validatePort_Max(portObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeObject(Type typeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SelfletValidator
