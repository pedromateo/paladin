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
 * A representation of the literals of the enumeration '<em><b>Mmi Type T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getMmiTypeT()
 * @model extendedMetaData="name='mmi_type_t'"
 * @generated
 */
public enum MmiTypeT implements Enumerator {
	/**
	 * The '<em><b>UNIMODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIMODAL_VALUE
	 * @generated
	 * @ordered
	 */
	UNIMODAL(0, "UNIMODAL", "UNIMODAL"),

	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(1, "EQUIVALENT", "EQUIVALENT"),

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNED(2, "ASSIGNED", "ASSIGNED"),

	/**
	 * The '<em><b>REDUNDANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUNDANT_VALUE
	 * @generated
	 * @ordered
	 */
	REDUNDANT(3, "REDUNDANT", "REDUNDANT"),

	/**
	 * The '<em><b>COMPLEMENTARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENTARY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLEMENTARY(4, "COMPLEMENTARY", "COMPLEMENTARY");

	/**
	 * The '<em><b>UNIMODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIMODAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIMODAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIMODAL_VALUE = 0;

	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EQUIVALENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUIVALENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 1;

	/**
	 * The '<em><b>ASSIGNED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSIGNED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNED_VALUE = 2;

	/**
	 * The '<em><b>REDUNDANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REDUNDANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDUNDANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDUNDANT_VALUE = 3;

	/**
	 * The '<em><b>COMPLEMENTARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLEMENTARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLEMENTARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLEMENTARY_VALUE = 4;

	/**
	 * An array of all the '<em><b>Mmi Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MmiTypeT[] VALUES_ARRAY =
		new MmiTypeT[] {
			UNIMODAL,
			EQUIVALENT,
			ASSIGNED,
			REDUNDANT,
			COMPLEMENTARY,
		};

	/**
	 * A public read-only list of all the '<em><b>Mmi Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MmiTypeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mmi Type T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmiTypeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MmiTypeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mmi Type T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmiTypeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MmiTypeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mmi Type T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MmiTypeT get(int value) {
		switch (value) {
			case UNIMODAL_VALUE: return UNIMODAL;
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case ASSIGNED_VALUE: return ASSIGNED;
			case REDUNDANT_VALUE: return REDUNDANT;
			case COMPLEMENTARY_VALUE: return COMPLEMENTARY;
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
	private MmiTypeT(int value, String name, String literal) {
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
	
} //MmiTypeT
