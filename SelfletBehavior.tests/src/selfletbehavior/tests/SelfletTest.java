/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selfletbehavior.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import selfletbehavior.Selflet;
import selfletbehavior.SelfletbehaviorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selflet</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfletTest extends TestCase {

	/**
	 * The fixture for this Selflet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Selflet fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfletTest.class);
	}

	/**
	 * Constructs a new Selflet test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Selflet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Selflet fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Selflet test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Selflet getFixture() {
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
		setFixture(SelfletbehaviorFactory.eINSTANCE.createSelflet());
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

} //SelfletTest
