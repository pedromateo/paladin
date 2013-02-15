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
 * A representation of the literals of the enumeration '<em><b>Parsing Result T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getParsingResultT()
 * @model extendedMetaData="name='parsing_result_t'"
 * @generated
 */
public enum ParsingResultT implements Enumerator {
	/**
	 * The '<em><b>CORRECTLYUNDERSTOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRECTLYUNDERSTOOD_VALUE
	 * @generated
	 * @ordered
	 */
	CORRECTLYUNDERSTOOD(0, "CORRECTLYUNDERSTOOD", "CORRECTLY_UNDERSTOOD"),

	/**
	 * The '<em><b>PARTIALLYUNDERSTOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYUNDERSTOOD_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLYUNDERSTOOD(1, "PARTIALLYUNDERSTOOD", "PARTIALLY_UNDERSTOOD"),

	/**
	 * The '<em><b>NOTHINGUNDERSTOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTHINGUNDERSTOOD_VALUE
	 * @generated
	 * @ordered
	 */
	NOTHINGUNDERSTOOD(2, "NOTHINGUNDERSTOOD", "NOTHING_UNDERSTOOD");

	/**
	 * The '<em><b>CORRECTLYUNDERSTOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORRECTLYUNDERSTOOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORRECTLYUNDERSTOOD
	 * @model literal="CORRECTLY_UNDERSTOOD"
	 * @generated
	 * @ordered
	 */
	public static final int CORRECTLYUNDERSTOOD_VALUE = 0;

	/**
	 * The '<em><b>PARTIALLYUNDERSTOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIALLYUNDERSTOOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYUNDERSTOOD
	 * @model literal="PARTIALLY_UNDERSTOOD"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLYUNDERSTOOD_VALUE = 1;

	/**
	 * The '<em><b>NOTHINGUNDERSTOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTHINGUNDERSTOOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTHINGUNDERSTOOD
	 * @model literal="NOTHING_UNDERSTOOD"
	 * @generated
	 * @ordered
	 */
	public static final int NOTHINGUNDERSTOOD_VALUE = 2;

	/**
	 * An array of all the '<em><b>Parsing Result T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ParsingResultT[] VALUES_ARRAY =
		new ParsingResultT[] {
			CORRECTLYUNDERSTOOD,
			PARTIALLYUNDERSTOOD,
			NOTHINGUNDERSTOOD,
		};

	/**
	 * A public read-only list of all the '<em><b>Parsing Result T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ParsingResultT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Parsing Result T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParsingResultT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParsingResultT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parsing Result T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParsingResultT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ParsingResultT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Parsing Result T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParsingResultT get(int value) {
		switch (value) {
			case CORRECTLYUNDERSTOOD_VALUE: return CORRECTLYUNDERSTOOD;
			case PARTIALLYUNDERSTOOD_VALUE: return PARTIALLYUNDERSTOOD;
			case NOTHINGUNDERSTOOD_VALUE: return NOTHINGUNDERSTOOD;
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
	private ParsingResultT(int value, String name, String literal) {
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
	
} //ParsingResultT
