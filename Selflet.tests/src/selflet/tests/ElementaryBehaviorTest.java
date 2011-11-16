/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.tests;

import junit.textui.TestRunner;

import selflet.ElementaryBehavior;
import selflet.SelfletFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elementary Behavior</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementaryBehaviorTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementaryBehaviorTest.class);
	}

	/**
	 * Constructs a new Elementary Behavior test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryBehaviorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elementary Behavior test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementaryBehavior getFixture() {
		return (ElementaryBehavior)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SelfletFactory.eINSTANCE.createElementaryBehavior());
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

} //ElementaryBehaviorTest
