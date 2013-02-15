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
 * A representation of the literals of the enumeration '<em><b>Task Success T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage#getTaskSuccessT()
 * @model extendedMetaData="name='task_success_t'"
 * @generated
 */
public enum TaskSuccessT implements Enumerator {
	/**
	 * The '<em><b>SUCCEEDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCEEDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCEEDED(0, "SUCCEEDED", "SUCCEEDED"),

	/**
	 * The '<em><b>SUCCONSTRAINTRELAXATIONSYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCONSTRAINTRELAXATIONSYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCONSTRAINTRELAXATIONSYSTEM(1, "SUCCONSTRAINTRELAXATIONSYSTEM", "SUC_CONSTRAINT_RELAXATION_SYSTEM"),

	/**
	 * The '<em><b>SUCCONSTRAINTRELAXATIONUSER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCONSTRAINTRELAXATIONUSER_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCONSTRAINTRELAXATIONUSER(2, "SUCCONSTRAINTRELAXATIONUSER", "SUC_CONSTRAINT_RELAXATION_USER"),

	/**
	 * The '<em><b>SUCCONSTRAINTRELAXATIONBOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCONSTRAINTRELAXATIONBOTH_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCONSTRAINTRELAXATIONBOTH(3, "SUCCONSTRAINTRELAXATIONBOTH", "SUC_CONSTRAINT_RELAXATION_BOTH"),

	/**
	 * The '<em><b>SUCNOSOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCNOSOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUCNOSOLUTION(4, "SUCNOSOLUTION", "SUC_NO_SOLUTION"),

	/**
	 * The '<em><b>FAILEDSYSTEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILEDSYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	FAILEDSYSTEM(5, "FAILEDSYSTEM", "FAILED_SYSTEM"),

	/**
	 * The '<em><b>FAILEDUSER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAILEDUSER_VALUE
	 * @generated
	 * @ordered
	 */
	FAILEDUSER(6, "FAILEDUSER", "FAILED_USER");

	/**
	 * The '<em><b>SUCCEEDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCEEDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCEEDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUCCEEDED_VALUE = 0;

	/**
	 * The '<em><b>SUCCONSTRAINTRELAXATIONSYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCONSTRAINTRELAXATIONSYSTEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCONSTRAINTRELAXATIONSYSTEM
	 * @model literal="SUC_CONSTRAINT_RELAXATION_SYSTEM"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCONSTRAINTRELAXATIONSYSTEM_VALUE = 1;

	/**
	 * The '<em><b>SUCCONSTRAINTRELAXATIONUSER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCONSTRAINTRELAXATIONUSER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCONSTRAINTRELAXATIONUSER
	 * @model literal="SUC_CONSTRAINT_RELAXATION_USER"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCONSTRAINTRELAXATIONUSER_VALUE = 2;

	/**
	 * The '<em><b>SUCCONSTRAINTRELAXATIONBOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCCONSTRAINTRELAXATIONBOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCCONSTRAINTRELAXATIONBOTH
	 * @model literal="SUC_CONSTRAINT_RELAXATION_BOTH"
	 * @generated
	 * @ordered
	 */
	public static final int SUCCONSTRAINTRELAXATIONBOTH_VALUE = 3;

	/**
	 * The '<em><b>SUCNOSOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUCNOSOLUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUCNOSOLUTION
	 * @model literal="SUC_NO_SOLUTION"
	 * @generated
	 * @ordered
	 */
	public static final int SUCNOSOLUTION_VALUE = 4;

	/**
	 * The '<em><b>FAILEDSYSTEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILEDSYSTEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILEDSYSTEM
	 * @model literal="FAILED_SYSTEM"
	 * @generated
	 * @ordered
	 */
	public static final int FAILEDSYSTEM_VALUE = 5;

	/**
	 * The '<em><b>FAILEDUSER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAILEDUSER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAILEDUSER
	 * @model literal="FAILED_USER"
	 * @generated
	 * @ordered
	 */
	public static final int FAILEDUSER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Task Success T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaskSuccessT[] VALUES_ARRAY =
		new TaskSuccessT[] {
			SUCCEEDED,
			SUCCONSTRAINTRELAXATIONSYSTEM,
			SUCCONSTRAINTRELAXATIONUSER,
			SUCCONSTRAINTRELAXATIONBOTH,
			SUCNOSOLUTION,
			FAILEDSYSTEM,
			FAILEDUSER,
		};

	/**
	 * A public read-only list of all the '<em><b>Task Success T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaskSuccessT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Task Success T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskSuccessT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskSuccessT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Success T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskSuccessT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaskSuccessT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Task Success T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskSuccessT get(int value) {
		switch (value) {
			case SUCCEEDED_VALUE: return SUCCEEDED;
			case SUCCONSTRAINTRELAXATIONSYSTEM_VALUE: return SUCCONSTRAINTRELAXATIONSYSTEM;
			case SUCCONSTRAINTRELAXATIONUSER_VALUE: return SUCCONSTRAINTRELAXATIONUSER;
			case SUCCONSTRAINTRELAXATIONBOTH_VALUE: return SUCCONSTRAINTRELAXATIONBOTH;
			case SUCNOSOLUTION_VALUE: return SUCNOSOLUTION;
			case FAILEDSYSTEM_VALUE: return FAILEDSYSTEM;
			case FAILEDUSER_VALUE: return FAILEDUSER;
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
	private TaskSuccessT(int value, String name, String literal) {
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
	
} //TaskSuccessT
