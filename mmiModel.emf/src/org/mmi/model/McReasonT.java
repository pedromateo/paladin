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
 * A representation of the literals of the enumeration '<em><b>Mc Reason T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getMcReasonT()
 * @model extendedMetaData="name='mc_reason_t'"
 * @generated
 */
public enum McReasonT implements Enumerator {
	/**
	 * The '<em><b>RECOGNITIONERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECOGNITIONERROR_VALUE
	 * @generated
	 * @ordered
	 */
	RECOGNITIONERROR(0, "RECOGNITIONERROR", "RECOGNITION_ERROR"),

	/**
	 * The '<em><b>ENVIRONMENTCHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENTCHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENTCHANGE(1, "ENVIRONMENTCHANGE", "ENVIRONMENT_CHANGE"),

	/**
	 * The '<em><b>LOWMODAPPROPRIATENESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWMODAPPROPRIATENESS_VALUE
	 * @generated
	 * @ordered
	 */
	LOWMODAPPROPRIATENESS(2, "LOWMODAPPROPRIATENESS", "LOW_MOD_APPROPRIATENESS"),

	/**
	 * The '<em><b>USERDECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDECISION_VALUE
	 * @generated
	 * @ordered
	 */
	USERDECISION(3, "USERDECISION", "USER_DECISION"),

	/**
	 * The '<em><b>SYSTEMDECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEMDECISION_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEMDECISION(4, "SYSTEMDECISION", "SYSTEM_DECISION"),

	/**
	 * The '<em><b>INTERFACEADAPTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACEADAPTATION_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACEADAPTATION(5, "INTERFACEADAPTATION", "INTERFACE_ADAPTATION"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "OTHER", "OTHER");

	/**
	 * The '<em><b>RECOGNITIONERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECOGNITIONERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECOGNITIONERROR
	 * @model literal="RECOGNITION_ERROR"
	 * @generated
	 * @ordered
	 */
	public static final int RECOGNITIONERROR_VALUE = 0;

	/**
	 * The '<em><b>ENVIRONMENTCHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENVIRONMENTCHANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENTCHANGE
	 * @model literal="ENVIRONMENT_CHANGE"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENTCHANGE_VALUE = 1;

	/**
	 * The '<em><b>LOWMODAPPROPRIATENESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOWMODAPPROPRIATENESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWMODAPPROPRIATENESS
	 * @model literal="LOW_MOD_APPROPRIATENESS"
	 * @generated
	 * @ordered
	 */
	public static final int LOWMODAPPROPRIATENESS_VALUE = 2;

	/**
	 * The '<em><b>USERDECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDECISION
	 * @model literal="USER_DECISION"
	 * @generated
	 * @ordered
	 */
	public static final int USERDECISION_VALUE = 3;

	/**
	 * The '<em><b>SYSTEMDECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEMDECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEMDECISION
	 * @model literal="SYSTEM_DECISION"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEMDECISION_VALUE = 4;

	/**
	 * The '<em><b>INTERFACEADAPTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACEADAPTATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACEADAPTATION
	 * @model literal="INTERFACE_ADAPTATION"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACEADAPTATION_VALUE = 5;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OTHER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Mc Reason T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final McReasonT[] VALUES_ARRAY =
		new McReasonT[] {
			RECOGNITIONERROR,
			ENVIRONMENTCHANGE,
			LOWMODAPPROPRIATENESS,
			USERDECISION,
			SYSTEMDECISION,
			INTERFACEADAPTATION,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Mc Reason T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<McReasonT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mc Reason T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static McReasonT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			McReasonT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mc Reason T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static McReasonT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			McReasonT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mc Reason T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static McReasonT get(int value) {
		switch (value) {
			case RECOGNITIONERROR_VALUE: return RECOGNITIONERROR;
			case ENVIRONMENTCHANGE_VALUE: return ENVIRONMENTCHANGE;
			case LOWMODAPPROPRIATENESS_VALUE: return LOWMODAPPROPRIATENESS;
			case USERDECISION_VALUE: return USERDECISION;
			case SYSTEMDECISION_VALUE: return SYSTEMDECISION;
			case INTERFACEADAPTATION_VALUE: return INTERFACEADAPTATION;
			case OTHER_VALUE: return OTHER;
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
	private McReasonT(int value, String name, String literal) {
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
	
} //McReasonT
