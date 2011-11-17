/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.tests;

import junit.textui.TestRunner;

import selfletbehavior.Elementary;
import selfletbehavior.SelfletbehaviorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Elementary</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementaryTest extends BehaviorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementaryTest.class);
	}

	/**
	 * Constructs a new Elementary test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Elementary test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Elementary getFixture() {
		return (Elementary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SelfletbehaviorFactory.eINSTANCE.createElementary());
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

} //ElementaryTest
