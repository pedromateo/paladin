/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialogue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.Dialogue#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mmi.model.Dialogue#getBaseTimestamp <em>Base Timestamp</em>}</li>
 *   <li>{@link org.mmi.model.Dialogue#getTask <em>Task</em>}</li>
 *   <li>{@link org.mmi.model.Dialogue#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getDialogue()
 * @model extendedMetaData="name='Dialogue' kind='elementOnly'"
 * @generated
 */
public interface Dialogue extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mmi.model.ModelPackage#getDialogue_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mmi.model.Dialogue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Timestamp</em>' attribute.
	 * @see #isSetBaseTimestamp()
	 * @see #unsetBaseTimestamp()
	 * @see #setBaseTimestamp(long)
	 * @see org.mmi.model.ModelPackage#getDialogue_BaseTimestamp()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='baseTimestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	long getBaseTimestamp();

	/**
	 * Sets the value of the '{@link org.mmi.model.Dialogue#getBaseTimestamp <em>Base Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Timestamp</em>' attribute.
	 * @see #isSetBaseTimestamp()
	 * @see #unsetBaseTimestamp()
	 * @see #getBaseTimestamp()
	 * @generated
	 */
	void setBaseTimestamp(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.Dialogue#getBaseTimestamp <em>Base Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaseTimestamp()
	 * @see #getBaseTimestamp()
	 * @see #setBaseTimestamp(long)
	 * @generated
	 */
	void unsetBaseTimestamp();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.Dialogue#getBaseTimestamp <em>Base Timestamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Base Timestamp</em>' attribute is set.
	 * @see #unsetBaseTimestamp()
	 * @see #getBaseTimestamp()
	 * @see #setBaseTimestamp(long)
	 * @generated
	 */
	boolean isSetBaseTimestamp();

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(Task)
	 * @see org.mmi.model.ModelPackage#getDialogue_Task()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='task' namespace='##targetNamespace'"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.mmi.model.Dialogue#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link org.mmi.model.DialogueStepT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see org.mmi.model.ModelPackage#getDialogue_Step()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='step' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DialogueStepT> getStep();

} // Dialogue
