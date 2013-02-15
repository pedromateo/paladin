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
 * A representation of the model object '<em><b>Dialogue Step T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.DialogueStepT#getSystemTurn <em>System Turn</em>}</li>
 *   <li>{@link org.mmi.model.DialogueStepT#getUserTurn <em>User Turn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getDialogueStepT()
 * @model extendedMetaData="name='dialogue_step_t' kind='elementOnly'"
 * @generated
 */
public interface DialogueStepT extends EObject {
	/**
	 * Returns the value of the '<em><b>System Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Turn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Turn</em>' containment reference.
	 * @see #setSystemTurn(SystemTurn)
	 * @see org.mmi.model.ModelPackage#getDialogueStepT_SystemTurn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='systemTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemTurn getSystemTurn();

	/**
	 * Sets the value of the '{@link org.mmi.model.DialogueStepT#getSystemTurn <em>System Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Turn</em>' containment reference.
	 * @see #getSystemTurn()
	 * @generated
	 */
	void setSystemTurn(SystemTurn value);

	/**
	 * Returns the value of the '<em><b>User Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Turn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Turn</em>' containment reference.
	 * @see #setUserTurn(UserTurn)
	 * @see org.mmi.model.ModelPackage#getDialogueStepT_UserTurn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='userTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	UserTurn getUserTurn();

	/**
	 * Sets the value of the '{@link org.mmi.model.DialogueStepT#getUserTurn <em>User Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Turn</em>' containment reference.
	 * @see #getUserTurn()
	 * @generated
	 */
	void setUserTurn(UserTurn value);

} // DialogueStepT
