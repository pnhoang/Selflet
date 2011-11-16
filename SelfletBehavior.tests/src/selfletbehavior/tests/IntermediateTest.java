/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.tests;

import junit.textui.TestRunner;

import selfletbehavior.Intermediate;
import selfletbehavior.SelfletbehaviorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intermediate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermediateTest extends StateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntermediateTest.class);
	}

	/**
	 * Constructs a new Intermediate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intermediate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Intermediate getFixture() {
		return (Intermediate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SelfletbehaviorFactory.eINSTANCE.createIntermediate());
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

} //IntermediateTest
