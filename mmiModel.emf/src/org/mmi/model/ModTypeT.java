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
 * A representation of the literals of the enumeration '<em><b>Mod Type T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getModTypeT()
 * @model extendedMetaData="name='mod_type_t'"
 * @generated
 */
public enum ModTypeT implements Enumerator {
	/**
	 * The '<em><b>S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #S_VALUE
	 * @generated
	 * @ordered
	 */
	S(0, "S", "S"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(1, "V", "V"),

	/**
	 * The '<em><b>G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #G_VALUE
	 * @generated
	 * @ordered
	 */
	G(2, "G", "G"),

	/**
	 * The '<em><b>SV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SV_VALUE
	 * @generated
	 * @ordered
	 */
	SV(3, "SV", "SV"),

	/**
	 * The '<em><b>SG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SG_VALUE
	 * @generated
	 * @ordered
	 */
	SG(4, "SG", "SG"),

	/**
	 * The '<em><b>VG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VG_VALUE
	 * @generated
	 * @ordered
	 */
	VG(5, "VG", "VG"),

	/**
	 * The '<em><b>SVG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SVG_VALUE
	 * @generated
	 * @ordered
	 */
	SVG(6, "SVG", "SVG");

	/**
	 * The '<em><b>S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #S
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int S_VALUE = 0;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 1;

	/**
	 * The '<em><b>G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #G
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int G_VALUE = 2;

	/**
	 * The '<em><b>SV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SV_VALUE = 3;

	/**
	 * The '<em><b>SG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SG_VALUE = 4;

	/**
	 * The '<em><b>VG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VG_VALUE = 5;

	/**
	 * The '<em><b>SVG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SVG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SVG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SVG_VALUE = 6;

	/**
	 * An array of all the '<em><b>Mod Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModTypeT[] VALUES_ARRAY =
		new ModTypeT[] {
			S,
			V,
			G,
			SV,
			SG,
			VG,
			SVG,
		};

	/**
	 * A public read-only list of all the '<em><b>Mod Type T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModTypeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mod Type T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModTypeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModTypeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mod Type T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModTypeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModTypeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mod Type T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModTypeT get(int value) {
		switch (value) {
			case S_VALUE: return S;
			case V_VALUE: return V;
			case G_VALUE: return G;
			case SV_VALUE: return SV;
			case SG_VALUE: return SG;
			case VG_VALUE: return VG;
			case SVG_VALUE: return SVG;
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
	private ModTypeT(int value, String name, String literal) {
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
	
} //ModTypeT
