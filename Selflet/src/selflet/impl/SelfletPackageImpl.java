/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import selflet.Abilities;
import selflet.Ability;
import selflet.AbilityState;
import selflet.Action;
import selflet.Actions;
import selflet.Active;
import selflet.Behavior;
import selflet.CPUUtilization;
import selflet.ComplexBehavior;
import selflet.Condition;
import selflet.Conditions;
import selflet.ElementaryBehavior;
import selflet.Empty;
import selflet.FinalState;
import selflet.GeneralKnowledge;
import selflet.InitialState;
import selflet.Input;
import selflet.InvocationState;
import selflet.Method;
import selflet.Methods;
import selflet.Mode;
import selflet.OfferMode;
import selflet.Output;
import selflet.Parameter;
import selflet.Reds;
import selflet.Rule;
import selflet.Rules;
import selflet.SelfLetProperty;
import selflet.Selflet;
import selflet.SelfletFactory;
import selflet.SelfletPackage;
import selflet.SelfletProperties;
import selflet.SelfletResources;
import selflet.Service;
import selflet.Services;
import selflet.State;
import selflet.Type;
import selflet.TypeKnowledge;

import selflet.util.SelfletValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfletPackageImpl extends EPackageImpl implements SelfletPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuUtilizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalKnowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offerModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfletPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfLetPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfletResourcesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeKnowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ipAddressObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType limePortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType limePortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType portObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see selflet.SelfletPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SelfletPackageImpl() {
		super(eNS_URI, SelfletFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SelfletPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SelfletPackage init() {
		if (isInited) return (SelfletPackage)EPackage.Registry.INSTANCE.getEPackage(SelfletPackage.eNS_URI);

		// Obtain or create and register package
		SelfletPackageImpl theSelfletPackage = (SelfletPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SelfletPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SelfletPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSelfletPackage.createPackageContents();

		// Initialize created meta-data
		theSelfletPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSelfletPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SelfletValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSelfletPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SelfletPackage.eNS_URI, theSelfletPackage);
		return theSelfletPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbilities() {
		return abilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbilities_Ability() {
		return (EReference)abilitiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbility() {
		return abilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Service() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbility_Methods() {
		return (EReference)abilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_File() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActions() {
		return actionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActions_Action() {
		return (EReference)actionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_File() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActive() {
		return activeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActive_MainService() {
		return (EAttribute)activeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_ElementaryBehaviorCost() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_ElementaryBehaviorCPUTime() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_FileName() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsDefaultBehavior() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Implements() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_Name() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditions() {
		return conditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditions_Condition() {
		return (EReference)conditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_File() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCPUUtilization() {
		return cpuUtilizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPUUtilization_LowerBound() {
		return (EAttribute)cpuUtilizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCPUUtilization_UpperBound() {
		return (EAttribute)cpuUtilizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmpty() {
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralKnowledge() {
		return generalKnowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralKnowledge_SelfLetProperty() {
		return (EReference)generalKnowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Parameter() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_ParamType() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethods() {
		return methodsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethods_Method() {
		return (EReference)methodsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfferMode() {
		return offerModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfferMode_Mode() {
		return (EAttribute)offerModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Parameter() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReds() {
		return redsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReds_IpAddress() {
		return (EAttribute)redsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReds_Port() {
		return (EAttribute)redsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRules() {
		return rulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRules_Rule() {
		return (EReference)rulesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_File() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelflet() {
		return selfletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelflet_SelfletProperties() {
		return (EReference)selfletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelflet_SelfletResources() {
		return (EReference)selfletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelflet_Name() {
		return (EAttribute)selfletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfletProperties() {
		return selfletPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfletProperties_Author() {
		return (EAttribute)selfletPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfletProperties_Description() {
		return (EAttribute)selfletPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletProperties_Passive() {
		return (EReference)selfletPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletProperties_Active() {
		return (EReference)selfletPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletProperties_Reds() {
		return (EReference)selfletPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfletProperties_LimePort() {
		return (EAttribute)selfletPropertiesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletProperties_Generalknowledge() {
		return (EReference)selfletPropertiesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletProperties_TypeKnowledge() {
		return (EReference)selfletPropertiesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfletProperties_EnableOptimizationPolicy() {
		return (EAttribute)selfletPropertiesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfletProperties_EnableCloudOptimizationPolicy() {
		return (EAttribute)selfletPropertiesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfLetProperty() {
		return selfLetPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfLetProperty_Name() {
		return (EAttribute)selfLetPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfLetProperty_Type() {
		return (EAttribute)selfLetPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelfLetProperty_Value() {
		return (EAttribute)selfLetPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfletResources() {
		return selfletResourcesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletResources_Abilities() {
		return (EReference)selfletResourcesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletResources_Actions() {
		return (EReference)selfletResourcesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletResources_Conditions() {
		return (EReference)selfletResourcesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletResources_Services() {
		return (EReference)selfletResourcesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfletResources_Rules() {
		return (EReference)selfletResourcesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServices_Service() {
		return (EReference)servicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Input() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Output() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Offermode() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Active() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Revenue() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_MaxResponseTime() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Implementations() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeKnowledge() {
		return typeKnowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeKnowledge_SelfLetProperty() {
		return (EReference)typeKnowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryBehavior() {
		return elementaryBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryBehavior_States() {
		return (EReference)elementaryBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexBehavior() {
		return complexBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexBehavior_States() {
		return (EReference)complexBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Next() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Name() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialState() {
		return initialStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbilityState() {
		return abilityStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbilityState_Do() {
		return (EReference)abilityStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationState() {
		return invocationStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationState_Invoke() {
		return (EReference)invocationStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddress() {
		return ipAddressEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIpAddressObject() {
		return ipAddressObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLimePort() {
		return limePortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLimePortObject() {
		return limePortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModeTypeObject() {
		return modeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPort() {
		return portEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPortObject() {
		return portObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeObject() {
		return typeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletFactory getSelfletFactory() {
		return (SelfletFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abilitiesEClass = createEClass(ABILITIES);
		createEReference(abilitiesEClass, ABILITIES__ABILITY);

		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__SERVICE);
		createEReference(abilityEClass, ABILITY__METHODS);
		createEAttribute(abilityEClass, ABILITY__FILE);

		actionsEClass = createEClass(ACTIONS);
		createEReference(actionsEClass, ACTIONS__ACTION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__FILE);

		activeEClass = createEClass(ACTIVE);
		createEAttribute(activeEClass, ACTIVE__MAIN_SERVICE);

		behaviorEClass = createEClass(BEHAVIOR);
		createEAttribute(behaviorEClass, BEHAVIOR__ELEMENTARY_BEHAVIOR_COST);
		createEAttribute(behaviorEClass, BEHAVIOR__ELEMENTARY_BEHAVIOR_CPU_TIME);
		createEAttribute(behaviorEClass, BEHAVIOR__FILE_NAME);
		createEAttribute(behaviorEClass, BEHAVIOR__IS_DEFAULT_BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__IMPLEMENTS);
		createEAttribute(behaviorEClass, BEHAVIOR__NAME);

		conditionsEClass = createEClass(CONDITIONS);
		createEReference(conditionsEClass, CONDITIONS__CONDITION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__FILE);

		cpuUtilizationEClass = createEClass(CPU_UTILIZATION);
		createEAttribute(cpuUtilizationEClass, CPU_UTILIZATION__LOWER_BOUND);
		createEAttribute(cpuUtilizationEClass, CPU_UTILIZATION__UPPER_BOUND);

		emptyEClass = createEClass(EMPTY);

		generalKnowledgeEClass = createEClass(GENERAL_KNOWLEDGE);
		createEReference(generalKnowledgeEClass, GENERAL_KNOWLEDGE__SELF_LET_PROPERTY);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__PARAMETER);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__PARAM_TYPE);
		createEAttribute(methodEClass, METHOD__NAME);

		methodsEClass = createEClass(METHODS);
		createEReference(methodsEClass, METHODS__METHOD);

		offerModeEClass = createEClass(OFFER_MODE);
		createEAttribute(offerModeEClass, OFFER_MODE__MODE);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__PARAMETER);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEAttribute(parameterEClass, PARAMETER__TYPE);

		redsEClass = createEClass(REDS);
		createEAttribute(redsEClass, REDS__IP_ADDRESS);
		createEAttribute(redsEClass, REDS__PORT);

		rulesEClass = createEClass(RULES);
		createEReference(rulesEClass, RULES__RULE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__FILE);

		selfletEClass = createEClass(SELFLET);
		createEReference(selfletEClass, SELFLET__SELFLET_PROPERTIES);
		createEReference(selfletEClass, SELFLET__SELFLET_RESOURCES);
		createEAttribute(selfletEClass, SELFLET__NAME);

		selfletPropertiesEClass = createEClass(SELFLET_PROPERTIES);
		createEAttribute(selfletPropertiesEClass, SELFLET_PROPERTIES__AUTHOR);
		createEAttribute(selfletPropertiesEClass, SELFLET_PROPERTIES__DESCRIPTION);
		createEReference(selfletPropertiesEClass, SELFLET_PROPERTIES__PASSIVE);
		createEReference(selfletPropertiesEClass, SELFLET_PROPERTIES__ACTIVE);
		createEReference(selfletPropertiesEClass, SELFLET_PROPERTIES__REDS);
		createEAttribute(selfletPropertiesEClass, SELFLET_PROPERTIES__LIME_PORT);
		createEReference(selfletPropertiesEClass, SELFLET_PROPERTIES__GENERALKNOWLEDGE);
		createEReference(selfletPropertiesEClass, SELFLET_PROPERTIES__TYPE_KNOWLEDGE);
		createEAttribute(selfletPropertiesEClass, SELFLET_PROPERTIES__ENABLE_OPTIMIZATION_POLICY);
		createEAttribute(selfletPropertiesEClass, SELFLET_PROPERTIES__ENABLE_CLOUD_OPTIMIZATION_POLICY);

		selfLetPropertyEClass = createEClass(SELF_LET_PROPERTY);
		createEAttribute(selfLetPropertyEClass, SELF_LET_PROPERTY__NAME);
		createEAttribute(selfLetPropertyEClass, SELF_LET_PROPERTY__TYPE);
		createEAttribute(selfLetPropertyEClass, SELF_LET_PROPERTY__VALUE);

		selfletResourcesEClass = createEClass(SELFLET_RESOURCES);
		createEReference(selfletResourcesEClass, SELFLET_RESOURCES__ABILITIES);
		createEReference(selfletResourcesEClass, SELFLET_RESOURCES__ACTIONS);
		createEReference(selfletResourcesEClass, SELFLET_RESOURCES__CONDITIONS);
		createEReference(selfletResourcesEClass, SELFLET_RESOURCES__SERVICES);
		createEReference(selfletResourcesEClass, SELFLET_RESOURCES__RULES);

		servicesEClass = createEClass(SERVICES);
		createEReference(servicesEClass, SERVICES__SERVICE);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__INPUT);
		createEReference(serviceEClass, SERVICE__OUTPUT);
		createEReference(serviceEClass, SERVICE__OFFERMODE);
		createEAttribute(serviceEClass, SERVICE__ACTIVE);
		createEAttribute(serviceEClass, SERVICE__REVENUE);
		createEAttribute(serviceEClass, SERVICE__MAX_RESPONSE_TIME);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEReference(serviceEClass, SERVICE__IMPLEMENTATIONS);

		typeKnowledgeEClass = createEClass(TYPE_KNOWLEDGE);
		createEReference(typeKnowledgeEClass, TYPE_KNOWLEDGE__SELF_LET_PROPERTY);

		elementaryBehaviorEClass = createEClass(ELEMENTARY_BEHAVIOR);
		createEReference(elementaryBehaviorEClass, ELEMENTARY_BEHAVIOR__STATES);

		complexBehaviorEClass = createEClass(COMPLEX_BEHAVIOR);
		createEReference(complexBehaviorEClass, COMPLEX_BEHAVIOR__STATES);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__NEXT);
		createEAttribute(stateEClass, STATE__NAME);

		initialStateEClass = createEClass(INITIAL_STATE);

		finalStateEClass = createEClass(FINAL_STATE);

		abilityStateEClass = createEClass(ABILITY_STATE);
		createEReference(abilityStateEClass, ABILITY_STATE__DO);

		invocationStateEClass = createEClass(INVOCATION_STATE);
		createEReference(invocationStateEClass, INVOCATION_STATE__INVOKE);

		// Create enums
		modeEEnum = createEEnum(MODE);
		typeEEnum = createEEnum(TYPE);

		// Create data types
		ipAddressEDataType = createEDataType(IP_ADDRESS);
		ipAddressObjectEDataType = createEDataType(IP_ADDRESS_OBJECT);
		limePortEDataType = createEDataType(LIME_PORT);
		limePortObjectEDataType = createEDataType(LIME_PORT_OBJECT);
		modeTypeObjectEDataType = createEDataType(MODE_TYPE_OBJECT);
		portEDataType = createEDataType(PORT);
		portObjectEDataType = createEDataType(PORT_OBJECT);
		typeObjectEDataType = createEDataType(TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementaryBehaviorEClass.getESuperTypes().add(this.getBehavior());
		complexBehaviorEClass.getESuperTypes().add(this.getBehavior());
		initialStateEClass.getESuperTypes().add(this.getState());
		finalStateEClass.getESuperTypes().add(this.getState());
		abilityStateEClass.getESuperTypes().add(this.getState());
		invocationStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes and features; add operations and parameters
		initEClass(abilitiesEClass, Abilities.class, "Abilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbilities_Ability(), this.getAbility(), null, "ability", null, 0, -1, Abilities.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Service(), theXMLTypePackage.getString(), "service", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbility_Methods(), this.getMethods(), null, "methods", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_File(), theXMLTypePackage.getString(), "file", null, 1, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionsEClass, Actions.class, "Actions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActions_Action(), this.getAction(), null, "action", null, 0, -1, Actions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_File(), theXMLTypePackage.getString(), "file", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activeEClass, Active.class, "Active", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActive_MainService(), theXMLTypePackage.getString(), "mainService", null, 1, 1, Active.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavior_ElementaryBehaviorCost(), theXMLTypePackage.getDouble(), "elementaryBehaviorCost", "0", 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_ElementaryBehaviorCPUTime(), theXMLTypePackage.getDouble(), "elementaryBehaviorCPUTime", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_FileName(), theXMLTypePackage.getString(), "fileName", null, 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_IsDefaultBehavior(), theXMLTypePackage.getBoolean(), "isDefaultBehavior", "false", 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_Implements(), this.getService(), null, "implements", null, 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehavior_Name(), ecorePackage.getEString(), "name", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionsEClass, Conditions.class, "Conditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditions_Condition(), this.getCondition(), null, "condition", null, 0, -1, Conditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_File(), theXMLTypePackage.getString(), "file", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuUtilizationEClass, CPUUtilization.class, "CPUUtilization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPUUtilization_LowerBound(), theXMLTypePackage.getDouble(), "lowerBound", null, 1, 1, CPUUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCPUUtilization_UpperBound(), theXMLTypePackage.getDouble(), "upperBound", null, 1, 1, CPUUtilization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalKnowledgeEClass, GeneralKnowledge.class, "GeneralKnowledge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralKnowledge_SelfLetProperty(), this.getSelfLetProperty(), null, "selfLetProperty", null, 1, -1, GeneralKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_ParamType(), theXMLTypePackage.getString(), "paramType", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethod_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodsEClass, Methods.class, "Methods", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMethods_Method(), this.getMethod(), null, "method", null, 0, -1, Methods.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offerModeEClass, OfferMode.class, "OfferMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfferMode_Mode(), this.getMode(), "mode", null, 0, 1, OfferMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(redsEClass, Reds.class, "Reds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReds_IpAddress(), this.getIpAddressObject(), "ipAddress", null, 1, 1, Reds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReds_Port(), this.getPort(), "port", null, 1, 1, Reds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulesEClass, Rules.class, "Rules", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRules_Rule(), this.getRule(), null, "rule", null, 0, -1, Rules.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_File(), theXMLTypePackage.getString(), "file", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfletEClass, Selflet.class, "Selflet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelflet_SelfletProperties(), this.getSelfletProperties(), null, "selfletProperties", null, 1, 1, Selflet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelflet_SelfletResources(), this.getSelfletResources(), null, "selfletResources", null, 1, 1, Selflet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelflet_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Selflet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfletPropertiesEClass, SelfletProperties.class, "SelfletProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelfletProperties_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelfletProperties_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletProperties_Passive(), this.getEmpty(), null, "passive", null, 0, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletProperties_Active(), this.getActive(), null, "active", null, 0, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletProperties_Reds(), this.getReds(), null, "reds", null, 1, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelfletProperties_LimePort(), this.getLimePort(), "limePort", null, 1, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletProperties_Generalknowledge(), this.getGeneralKnowledge(), null, "generalknowledge", null, 0, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletProperties_TypeKnowledge(), this.getTypeKnowledge(), null, "typeKnowledge", null, 0, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelfletProperties_EnableOptimizationPolicy(), theXMLTypePackage.getBoolean(), "enableOptimizationPolicy", "false", 0, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelfletProperties_EnableCloudOptimizationPolicy(), theXMLTypePackage.getBoolean(), "enableCloudOptimizationPolicy", "false", 0, 1, SelfletProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfLetPropertyEClass, SelfLetProperty.class, "SelfLetProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelfLetProperty_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SelfLetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelfLetProperty_Type(), this.getType(), "type", null, 1, 1, SelfLetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelfLetProperty_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, SelfLetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selfletResourcesEClass, SelfletResources.class, "SelfletResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelfletResources_Abilities(), this.getAbilities(), null, "abilities", null, 1, 1, SelfletResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletResources_Actions(), this.getActions(), null, "actions", null, 1, 1, SelfletResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletResources_Conditions(), this.getConditions(), null, "conditions", null, 1, 1, SelfletResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletResources_Services(), this.getServices(), null, "services", null, 1, 1, SelfletResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelfletResources_Rules(), this.getRules(), null, "rules", null, 1, 1, SelfletResources.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServices_Service(), this.getService(), null, "service", null, 0, -1, Services.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Input(), this.getInput(), null, "input", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Output(), this.getOutput(), null, "output", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Offermode(), this.getOfferMode(), null, "offermode", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Active(), theXMLTypePackage.getBoolean(), "active", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Revenue(), theXMLTypePackage.getInt(), "revenue", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_MaxResponseTime(), theXMLTypePackage.getDouble(), "maxResponseTime", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_Implementations(), this.getBehavior(), null, "implementations", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeKnowledgeEClass, TypeKnowledge.class, "TypeKnowledge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeKnowledge_SelfLetProperty(), this.getSelfLetProperty(), null, "selfLetProperty", null, 1, -1, TypeKnowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryBehaviorEClass, ElementaryBehavior.class, "ElementaryBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryBehavior_States(), this.getState(), null, "states", null, 3, 3, ElementaryBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexBehaviorEClass, ComplexBehavior.class, "ComplexBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexBehavior_States(), this.getState(), null, "states", null, 3, -1, ComplexBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Next(), this.getState(), null, "next", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialStateEClass, InitialState.class, "InitialState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abilityStateEClass, AbilityState.class, "AbilityState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbilityState_Do(), this.getAction(), null, "do", null, 1, 1, AbilityState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invocationStateEClass, InvocationState.class, "InvocationState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationState_Invoke(), this.getService(), null, "invoke", null, 0, 1, InvocationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.CAN_DO);
		addEEnumLiteral(modeEEnum, Mode.CAN_TEACH);
		addEEnumLiteral(modeEEnum, Mode.BOTH);
		addEEnumLiteral(modeEEnum, Mode.KNOWS_WHO_CAN_BOTH);
		addEEnumLiteral(modeEEnum, Mode.KNOWS_WHO_CAN_DO);
		addEEnumLiteral(modeEEnum, Mode.KNOWS_WHO_CAN_TEACH);
		addEEnumLiteral(modeEEnum, Mode.NONE);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.DOUBLE);
		addEEnumLiteral(typeEEnum, Type.INTEGER);
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);
		addEEnumLiteral(typeEEnum, Type.SERVICE_ASK_MODE);
		addEEnumLiteral(typeEEnum, Type.SERVICE_OFFER_MODE);
		addEEnumLiteral(typeEEnum, Type.DOUBLE1);
		addEEnumLiteral(typeEEnum, Type.INTEGER1);
		addEEnumLiteral(typeEEnum, Type.STRING1);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN1);

		// Initialize data types
		initEDataType(ipAddressEDataType, String.class, "IpAddress", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ipAddressObjectEDataType, String.class, "IpAddressObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(limePortEDataType, int.class, "LimePort", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(limePortObjectEDataType, Integer.class, "LimePortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modeTypeObjectEDataType, Mode.class, "ModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portEDataType, int.class, "Port", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(portObjectEDataType, Integer.class, "PortObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeObjectEDataType, Type.class, "TypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (abilitiesEClass, 
		   source, 
		   new String[] {
			 "name", "abilitiesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbilities_Ability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ability",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (abilityEClass, 
		   source, 
		   new String[] {
			 "name", "abilityType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbility_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbility_Methods(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "methods",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAbility_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (actionsEClass, 
		   source, 
		   new String[] {
			 "name", "actionsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getActions_Action(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "action",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (actionEClass, 
		   source, 
		   new String[] {
			 "name", "actionType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAction_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (activeEClass, 
		   source, 
		   new String[] {
			 "name", "activeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getActive_MainService(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mainService"
		   });		
		addAnnotation
		  (behaviorEClass, 
		   source, 
		   new String[] {
			 "name", "behaviorType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBehavior_ElementaryBehaviorCost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementaryBehaviorCost"
		   });		
		addAnnotation
		  (getBehavior_ElementaryBehaviorCPUTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementaryBehaviorCPUTime"
		   });		
		addAnnotation
		  (getBehavior_FileName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fileName"
		   });		
		addAnnotation
		  (getBehavior_IsDefaultBehavior(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isDefaultBehavior"
		   });		
		addAnnotation
		  (conditionsEClass, 
		   source, 
		   new String[] {
			 "name", "conditionsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConditions_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "condition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "name", "conditionType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCondition_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (cpuUtilizationEClass, 
		   source, 
		   new String[] {
			 "name", "CPUUtilizationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCPUUtilization_LowerBound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lowerBound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCPUUtilization_UpperBound(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "upperBound",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (emptyEClass, 
		   source, 
		   new String[] {
			 "name", "empty",
			 "kind", "empty"
		   });		
		addAnnotation
		  (generalKnowledgeEClass, 
		   source, 
		   new String[] {
			 "name", "generalKnowledgeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGeneralKnowledge_SelfLetProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selfLetProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (inputEClass, 
		   source, 
		   new String[] {
			 "name", "inputType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInput_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (ipAddressEDataType, 
		   source, 
		   new String[] {
			 "name", "ipAddress",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (ipAddressObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ipAddress_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "((1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]).){3}(1?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])"
		   });		
		addAnnotation
		  (limePortEDataType, 
		   source, 
		   new String[] {
			 "name", "limePort_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1",
			 "maxInclusive", "65535"
		   });		
		addAnnotation
		  (limePortObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "limePort_._type:Object",
			 "baseType", "limePort_._type"
		   });		
		addAnnotation
		  (methodEClass, 
		   source, 
		   new String[] {
			 "name", "method",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMethod_ParamType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "paramType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMethod_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (methodsEClass, 
		   source, 
		   new String[] {
			 "name", "methodsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMethods_Method(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "method",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modeEEnum, 
		   source, 
		   new String[] {
			 "name", "mode_._type"
		   });		
		addAnnotation
		  (modeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mode_._type:Object",
			 "baseType", "mode_._type"
		   });		
		addAnnotation
		  (offerModeEClass, 
		   source, 
		   new String[] {
			 "name", "offerModeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOfferMode_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });		
		addAnnotation
		  (outputEClass, 
		   source, 
		   new String[] {
			 "name", "outputType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutput_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "name", "parameterType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParameter_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getParameter_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (portEDataType, 
		   source, 
		   new String[] {
			 "name", "port_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#int",
			 "minInclusive", "1",
			 "maxInclusive", "65535"
		   });		
		addAnnotation
		  (portObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "port_._type:Object",
			 "baseType", "port_._type"
		   });		
		addAnnotation
		  (redsEClass, 
		   source, 
		   new String[] {
			 "name", "redsType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReds_IpAddress(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ipAddress",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReds_Port(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "port",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (rulesEClass, 
		   source, 
		   new String[] {
			 "name", "rulesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRules_Rule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (ruleEClass, 
		   source, 
		   new String[] {
			 "name", "ruleType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRule_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });		
		addAnnotation
		  (selfletEClass, 
		   source, 
		   new String[] {
			 "name", "selflet",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSelflet_SelfletProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selfletProperties",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelflet_SelfletResources(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selfletResources",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelflet_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (selfletPropertiesEClass, 
		   source, 
		   new String[] {
			 "name", "selfletProperties",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSelfletProperties_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_Passive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "passive",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_Active(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "active",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_Reds(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reds",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_LimePort(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "limePort",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_Generalknowledge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "generalknowledge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_TypeKnowledge(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "typeKnowledge",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_EnableOptimizationPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enableOptimizationPolicy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletProperties_EnableCloudOptimizationPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enableCloudOptimizationPolicy",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (selfLetPropertyEClass, 
		   source, 
		   new String[] {
			 "name", "selfLetProperty",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getSelfLetProperty_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getSelfLetProperty_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getSelfLetProperty_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (selfletResourcesEClass, 
		   source, 
		   new String[] {
			 "name", "selfletResources",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSelfletResources_Abilities(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abilities",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletResources_Actions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletResources_Conditions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conditions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletResources_Services(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "services",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSelfletResources_Rules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rules",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (servicesEClass, 
		   source, 
		   new String[] {
			 "name", "servicesType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getServices_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (serviceEClass, 
		   source, 
		   new String[] {
			 "name", "serviceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getService_Input(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "input",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Output(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "output",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Offermode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "offermode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Active(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "active",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Revenue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revenue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_MaxResponseTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxResponseTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getService_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (typeKnowledgeEClass, 
		   source, 
		   new String[] {
			 "name", "typeKnowledgeType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTypeKnowledge_SelfLetProperty(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "selfLetProperty",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });		
		addAnnotation
		  (typeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });
	}

} //SelfletPackageImpl
