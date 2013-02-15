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
 * A representation of the literals of the enumeration '<em><b>Mod Approp T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getModAppropT()
 * @model extendedMetaData="name='mod_approp_t'"
 * @generated
 */
public enum ModAppropT implements Enumerator {
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
	 * The '<em><b>PARTIALLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY(1, "PARTIALLY", "PARTIALLY"),

	/**
	 * The '<em><b>INAPPROPRIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INAPPROPRIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INAPPROPRIATE(2, "INAPPROPRIATE", "INAPPROPRIATE");

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
	 * The '<em><b>PARTIALLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIALLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_VALUE = 1;

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
	public static final int INAPPROPRIATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mod Approp T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModAppropT[] VALUES_ARRAY =
		new ModAppropT[] {
			APPROPRIATE,
			PARTIALLY,
			INAPPROPRIATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mod Approp T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModAppropT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mod Approp T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModAppropT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModAppropT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mod Approp T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModAppropT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModAppropT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mod Approp T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModAppropT get(int value) {
		switch (value) {
			case APPROPRIATE_VALUE: return APPROPRIATE;
			case PARTIALLY_VALUE: return PARTIALLY;
			case INAPPROPRIATE_VALUE: return INAPPROPRIATE;
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
	private ModAppropT(int value, String name, String literal) {
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
	
} //ModAppropT
