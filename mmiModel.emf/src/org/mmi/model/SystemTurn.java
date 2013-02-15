/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.SystemTurn#getMetacomm <em>Metacomm</em>}</li>
 *   <li>{@link org.mmi.model.SystemTurn#getSpeechOutput <em>Speech Output</em>}</li>
 *   <li>{@link org.mmi.model.SystemTurn#getCooperativity <em>Cooperativity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getSystemTurn()
 * @model extendedMetaData="name='SystemTurn' kind='elementOnly'"
 * @generated
 */
public interface SystemTurn extends Turn {
	/**
	 * Returns the value of the '<em><b>Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metacomm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metacomm</em>' containment reference.
	 * @see #setMetacomm(SystemMetacomm)
	 * @see org.mmi.model.ModelPackage#getSystemTurn_Metacomm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metacomm' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemMetacomm getMetacomm();

	/**
	 * Sets the value of the '{@link org.mmi.model.SystemTurn#getMetacomm <em>Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metacomm</em>' containment reference.
	 * @see #getMetacomm()
	 * @generated
	 */
	void setMetacomm(SystemMetacomm value);

	/**
	 * Returns the value of the '<em><b>Speech Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speech Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speech Output</em>' containment reference.
	 * @see #setSpeechOutput(SpeechOutput)
	 * @see org.mmi.model.ModelPackage#getSystemTurn_SpeechOutput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speechOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechOutput getSpeechOutput();

	/**
	 * Sets the value of the '{@link org.mmi.model.SystemTurn#getSpeechOutput <em>Speech Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Output</em>' containment reference.
	 * @see #getSpeechOutput()
	 * @generated
	 */
	void setSpeechOutput(SpeechOutput value);

	/**
	 * Returns the value of the '<em><b>Cooperativity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cooperativity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cooperativity</em>' containment reference.
	 * @see #setCooperativity(Cooperativity)
	 * @see org.mmi.model.ModelPackage#getSystemTurn_Cooperativity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cooperativity' namespace='##targetNamespace'"
	 * @generated
	 */
	Cooperativity getCooperativity();

	/**
	 * Sets the value of the '{@link org.mmi.model.SystemTurn#getCooperativity <em>Cooperativity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooperativity</em>' containment reference.
	 * @see #getCooperativity()
	 * @generated
	 */
	void setCooperativity(Cooperativity value);

} // SystemTurn
