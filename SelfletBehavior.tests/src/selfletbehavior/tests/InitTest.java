/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.tests;

import junit.textui.TestRunner;

import selfletbehavior.Init;
import selfletbehavior.SelfletbehaviorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Init</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitTest.class);
	}

	/**
	 * Constructs a new Init test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Init test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Init getFixture() {
		return (Init)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SelfletbehaviorFactory.eINSTANCE.createInit());
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

} //InitTest
