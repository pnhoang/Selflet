/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import selflet.SelfletFactory;
import selflet.SelfletResources;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfletResourcesTest extends TestCase {

	/**
	 * The fixture for this Resources test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfletResources fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfletResourcesTest.class);
	}

	/**
	 * Constructs a new Resources test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfletResourcesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resources test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SelfletResources fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resources test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfletResources getFixture() {
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
		setFixture(SelfletFactory.eINSTANCE.createSelfletResources());
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

} //SelfletResourcesTest
