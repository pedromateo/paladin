/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.Task#getSuccess <em>Success</em>}</li>
 *   <li>{@link org.mmi.model.Task#getReason <em>Reason</em>}</li>
 *   <li>{@link org.mmi.model.Task#getAvm <em>Avm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Success</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.TaskSuccessT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success</em>' attribute.
	 * @see org.mmi.model.TaskSuccessT
	 * @see #isSetSuccess()
	 * @see #unsetSuccess()
	 * @see #setSuccess(TaskSuccessT)
	 * @see org.mmi.model.ModelPackage#getTask_Success()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='success' namespace='##targetNamespace'"
	 * @generated
	 */
	TaskSuccessT getSuccess();

	/**
	 * Sets the value of the '{@link org.mmi.model.Task#getSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success</em>' attribute.
	 * @see org.mmi.model.TaskSuccessT
	 * @see #isSetSuccess()
	 * @see #unsetSuccess()
	 * @see #getSuccess()
	 * @generated
	 */
	void setSuccess(TaskSuccessT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.Task#getSuccess <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuccess()
	 * @see #getSuccess()
	 * @see #setSuccess(TaskSuccessT)
	 * @generated
	 */
	void unsetSuccess();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.Task#getSuccess <em>Success</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Success</em>' attribute is set.
	 * @see #unsetSuccess()
	 * @see #getSuccess()
	 * @see #setSuccess(TaskSuccessT)
	 * @generated
	 */
	boolean isSetSuccess();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see org.mmi.model.ModelPackage#getTask_Reason()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link org.mmi.model.Task#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Avm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avm</em>' containment reference.
	 * @see #setAvm(Avm)
	 * @see org.mmi.model.ModelPackage#getTask_Avm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='avm' namespace='##targetNamespace'"
	 * @generated
	 */
	Avm getAvm();

	/**
	 * Sets the value of the '{@link org.mmi.model.Task#getAvm <em>Avm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avm</em>' containment reference.
	 * @see #getAvm()
	 * @generated
	 */
	void setAvm(Avm value);

} // Task
