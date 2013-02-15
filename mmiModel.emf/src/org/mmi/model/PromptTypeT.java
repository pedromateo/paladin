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
 * A representation of the literals of the enumeration '<em><b>Prompt Type T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getPromptTypeT()
 * @model extendedMetaData="name='prompt_type_t'"
 * @generated
 */
public enum PromptTypeT implements Enumerator {
	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(0, "OPEN", "OPEN"),

	/**
	 * The '<em><b>HALFOPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFOPEN_VALUE
	 * @generated
	 * @ordered
	 */
	HALFOPEN(1, "HALFOPEN", "HALF_OPEN"),

	/**
	 * The '<em><b>CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(2, "CLOSED", "CLOSED"),

	/**
	 * The '<em><b>NOQUESTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOQUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	NOQUESTION(3, "NOQUESTION", "NO_QUESTION");

	/**
	 * The '<em><b>OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 0;

	/**
	 * The '<em><b>HALFOPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALFOPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALFOPEN
	 * @model literal="HALF_OPEN"
	 * @generated
	 * @ordered
	 */
	public static final int HALFOPEN_VALUE = 1;

	/**
	 * The '<em><b>CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 2;

	/**
	 * The '<em><b>NOQUESTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOQUESTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOQUESTION
	 * @model literal="NO_QUESTION"
	 * @generated
	 * @ordered
	 */
	public static final int NOQUESTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Prompt Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PromptTypeT[] VALUES_ARRAY =
		new PromptTypeT[] {
			OPEN,
			HALFOPEN,
			CLOSED,
			NOQUESTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Prompt Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PromptTypeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prompt Type T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PromptTypeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PromptTypeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prompt Type T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PromptTypeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PromptTypeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prompt Type T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PromptTypeT get(int value) {
		switch (value) {
			case OPEN_VALUE: return OPEN;
			case HALFOPEN_VALUE: return HALFOPEN;
			case CLOSED_VALUE: return CLOSED;
			case NOQUESTION_VALUE: return NOQUESTION;
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
	private PromptTypeT(int value, String name, String literal) {
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
	
} //PromptTypeT
