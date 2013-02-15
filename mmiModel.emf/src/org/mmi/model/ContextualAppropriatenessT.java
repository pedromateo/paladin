/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contextual Appropriateness T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getContextualAppropriatenessT()
 * @model extendedMetaData="name='contextual_appropriateness_t'"
 * @generated
 */
public enum ContextualAppropriatenessT implements Enumerator {
	/**
	 * The '<em><b>APPROPRIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPROPRIATE_VALUE
	 * @generated
	 * @ordered
	 */
	APPROPRIATE(0, "APPROPRIATE", "APPROPRIATE"),

	/**
	 * The '<em><b>INAPPROPRIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INAPPROPRIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INAPPROPRIATE(1, "INAPPROPRIATE", "INAPPROPRIATE"),

	/**
	 * The '<em><b>TOTALFAILURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOTALFAILURE_VALUE
	 * @generated
	 * @ordered
	 */
	TOTALFAILURE(2, "TOTALFAILURE", "TOTAL_FAILURE"),

	/**
	 * The '<em><b>INCOMPREHENSIBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOMPREHENSIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPREHENSIBLE(3, "INCOMPREHENSIBLE", "INCOMPREHENSIBLE");

	/**
	 * The '<em><b>APPROPRIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPROPRIATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPROPRIATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPROPRIATE_VALUE = 0;

	/**
	 * The '<em><b>INAPPROPRIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INAPPROPRIATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INAPPROPRIATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INAPPROPRIATE_VALUE = 1;

	/**
	 * The '<em><b>TOTALFAILURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOTALFAILURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOTALFAILURE
	 * @model literal="TOTAL_FAILURE"
	 * @generated
	 * @ordered
	 */
	public static final int TOTALFAILURE_VALUE = 2;

	/**
	 * The '<em><b>INCOMPREHENSIBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCOMPREHENSIBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCOMPREHENSIBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPREHENSIBLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Contextual Appropriateness T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContextualAppropriatenessT[] VALUES_ARRAY =
		new ContextualAppropriatenessT[] {
			APPROPRIATE,
			INAPPROPRIATE,
			TOTALFAILURE,
			INCOMPREHENSIBLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Contextual Appropriateness T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContextualAppropriatenessT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contextual Appropriateness T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextualAppropriatenessT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextualAppropriatenessT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contextual Appropriateness T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextualAppropriatenessT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextualAppropriatenessT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contextual Appropriateness T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContextualAppropriatenessT get(int value) {
		switch (value) {
			case APPROPRIATE_VALUE: return APPROPRIATE;
			case INAPPROPRIATE_VALUE: return INAPPROPRIATE;
			case TOTALFAILURE_VALUE: return TOTALFAILURE;
			case INCOMPREHENSIBLE_VALUE: return INCOMPREHENSIBLE;
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
	private ContextualAppropriatenessT(int value, String name, String literal) {
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
	
} //ContextualAppropriatenessT
