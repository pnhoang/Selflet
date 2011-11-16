/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.tests;

import junit.textui.TestRunner;

import selflet.AbilityState;
import selflet.SelfletFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ability State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AbilityStateTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbilityStateTest.class);
	}

	/**
	 * Constructs a new Ability State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ability State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AbilityState getFixture() {
		return (AbilityState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SelfletFactory.eINSTANCE.createAbilityState());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AbilityStateTest
