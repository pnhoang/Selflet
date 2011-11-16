/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import selflet.Conditions;
import selflet.SelfletFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditions</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionsTest extends TestCase {

	/**
	 * The fixture for this Conditions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conditions fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionsTest.class);
	}

	/**
	 * Constructs a new Conditions test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Conditions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Conditions fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Conditions test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Conditions getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SelfletFactory.eINSTANCE.createConditions());
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

} //ConditionsTest
