/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.UserTurn#getMetacomm <em>Metacomm</em>}</li>
 *   <li>{@link org.mmi.model.UserTurn#getSpeechInput <em>Speech Input</em>}</li>
 *   <li>{@link org.mmi.model.UserTurn#getGuiInput <em>Gui Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getUserTurn()
 * @model extendedMetaData="name='UserTurn' kind='elementOnly'"
 * @generated
 */
public interface UserTurn extends Turn {
	/**
	 * Returns the value of the '<em><b>Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metacomm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metacomm</em>' containment reference.
	 * @see #setMetacomm(UserMetacomm)
	 * @see org.mmi.model.ModelPackage#getUserTurn_Metacomm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metacomm' namespace='##targetNamespace'"
	 * @generated
	 */
	UserMetacomm getMetacomm();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserTurn#getMetacomm <em>Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metacomm</em>' containment reference.
	 * @see #getMetacomm()
	 * @generated
	 */
	void setMetacomm(UserMetacomm value);

	/**
	 * Returns the value of the '<em><b>Speech Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speech Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speech Input</em>' containment reference.
	 * @see #setSpeechInput(SpeechInput)
	 * @see org.mmi.model.ModelPackage#getUserTurn_SpeechInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speechInput' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechInput getSpeechInput();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserTurn#getSpeechInput <em>Speech Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Input</em>' containment reference.
	 * @see #getSpeechInput()
	 * @generated
	 */
	void setSpeechInput(SpeechInput value);

	/**
	 * Returns the value of the '<em><b>Gui Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gui Input</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gui Input</em>' containment reference.
	 * @see #setGuiInput(GuiInput)
	 * @see org.mmi.model.ModelPackage#getUserTurn_GuiInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='guiInput' namespace='##targetNamespace'"
	 * @generated
	 */
	GuiInput getGuiInput();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserTurn#getGuiInput <em>Gui Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Input</em>' containment reference.
	 * @see #getGuiInput()
	 * @generated
	 */
	void setGuiInput(GuiInput value);

} // UserTurn
