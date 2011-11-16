/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package selflet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see selflet.SelfletPackage#getMode()
 * @model extendedMetaData="name='mode_._type'"
 * @generated
 */
public enum Mode implements Enumerator {
	/**
	 * The '<em><b>Can Do</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_DO_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_DO(0, "CanDo", "CanDo"),

	/**
	 * The '<em><b>Can Teach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAN_TEACH_VALUE
	 * @generated
	 * @ordered
	 */
	CAN_TEACH(1, "CanTeach", "CanTeach"),

	/**
	 * The '<em><b>Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH(2, "Both", "Both"),

	/**
	 * The '<em><b>Knows Who Can Both</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOWS_WHO_CAN_BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	KNOWS_WHO_CAN_BOTH(3, "KnowsWhoCanBoth", "KnowsWhoCanBoth"),

	/**
	 * The '<em><b>Knows Who Can Do</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOWS_WHO_CAN_DO_VALUE
	 * @generated
	 * @ordered
	 */
	KNOWS_WHO_CAN_DO(4, "KnowsWhoCanDo", "KnowsWhoCanDo"),

	/**
	 * The '<em><b>Knows Who Can Teach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOWS_WHO_CAN_TEACH_VALUE
	 * @generated
	 * @ordered
	 */
	KNOWS_WHO_CAN_TEACH(5, "KnowsWhoCanTeach", "KnowsWhoCanTeach"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(6, "None", "None");

	/**
	 * The '<em><b>Can Do</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Can Do</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN_DO
	 * @model name="CanDo"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_DO_VALUE = 0;

	/**
	 * The '<em><b>Can Teach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Can Teach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAN_TEACH
	 * @model name="CanTeach"
	 * @generated
	 * @ordered
	 */
	public static final int CAN_TEACH_VALUE = 1;

	/**
	 * The '<em><b>Both</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Both</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @model name="Both"
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_VALUE = 2;

	/**
	 * The '<em><b>Knows Who Can Both</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Knows Who Can Both</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOWS_WHO_CAN_BOTH
	 * @model name="KnowsWhoCanBoth"
	 * @generated
	 * @ordered
	 */
	public static final int KNOWS_WHO_CAN_BOTH_VALUE = 3;

	/**
	 * The '<em><b>Knows Who Can Do</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Knows Who Can Do</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOWS_WHO_CAN_DO
	 * @model name="KnowsWhoCanDo"
	 * @generated
	 * @ordered
	 */
	public static final int KNOWS_WHO_CAN_DO_VALUE = 4;

	/**
	 * The '<em><b>Knows Who Can Teach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Knows Who Can Teach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOWS_WHO_CAN_TEACH
	 * @model name="KnowsWhoCanTeach"
	 * @generated
	 * @ordered
	 */
	public static final int KNOWS_WHO_CAN_TEACH_VALUE = 5;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Mode[] VALUES_ARRAY =
		new Mode[] {
			CAN_DO,
			CAN_TEACH,
			BOTH,
			KNOWS_WHO_CAN_BOTH,
			KNOWS_WHO_CAN_DO,
			KNOWS_WHO_CAN_TEACH,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Mode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Mode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mode get(int value) {
		switch (value) {
			case CAN_DO_VALUE: return CAN_DO;
			case CAN_TEACH_VALUE: return CAN_TEACH;
			case BOTH_VALUE: return BOTH;
			case KNOWS_WHO_CAN_BOTH_VALUE: return KNOWS_WHO_CAN_BOTH;
			case KNOWS_WHO_CAN_DO_VALUE: return KNOWS_WHO_CAN_DO;
			case KNOWS_WHO_CAN_TEACH_VALUE: return KNOWS_WHO_CAN_TEACH;
			case NONE_VALUE: return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Mode(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Mode
