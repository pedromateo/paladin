/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getAvm <em>Avm</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getCooperativity <em>Cooperativity</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getGuiInput <em>Gui Input</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getModalityAppropriateness <em>Modality Appropriateness</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getModalityChange <em>Modality Change</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getModalityInfo <em>Modality Info</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getModalitySynchroni <em>Modality Synchroni</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getSpeechInput <em>Speech Input</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getSpeechOutput <em>Speech Output</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getSystemMetacomm <em>System Metacomm</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getTask <em>Task</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getTurn <em>Turn</em>}</li>
 *   <li>{@link org.mmi.model.DocumentRoot#getUserMetacomm <em>User Metacomm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_Avm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Avm' namespace='##targetNamespace'"
	 * @generated
	 */
	Avm getAvm();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getAvm <em>Avm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avm</em>' containment reference.
	 * @see #getAvm()
	 * @generated
	 */
	void setAvm(Avm value);

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
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_Cooperativity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cooperativity' namespace='##targetNamespace'"
	 * @generated
	 */
	Cooperativity getCooperativity();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getCooperativity <em>Cooperativity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cooperativity</em>' containment reference.
	 * @see #getCooperativity()
	 * @generated
	 */
	void setCooperativity(Cooperativity value);

	/**
	 * Returns the value of the '<em><b>Dialogue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialogue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialogue</em>' containment reference.
	 * @see #setDialogue(Dialogue)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_Dialogue()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dialogue' namespace='##targetNamespace'"
	 * @generated
	 */
	Dialogue getDialogue();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getDialogue <em>Dialogue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialogue</em>' containment reference.
	 * @see #getDialogue()
	 * @generated
	 */
	void setDialogue(Dialogue value);

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
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_GuiInput()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GuiInput' namespace='##targetNamespace'"
	 * @generated
	 */
	GuiInput getGuiInput();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getGuiInput <em>Gui Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gui Input</em>' containment reference.
	 * @see #getGuiInput()
	 * @generated
	 */
	void setGuiInput(GuiInput value);

	/**
	 * Returns the value of the '<em><b>Modality Appropriateness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality Appropriateness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality Appropriateness</em>' containment reference.
	 * @see #setModalityAppropriateness(ModalityAppropriateness)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_ModalityAppropriateness()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModalityAppropriateness' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityAppropriateness getModalityAppropriateness();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getModalityAppropriateness <em>Modality Appropriateness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality Appropriateness</em>' containment reference.
	 * @see #getModalityAppropriateness()
	 * @generated
	 */
	void setModalityAppropriateness(ModalityAppropriateness value);

	/**
	 * Returns the value of the '<em><b>Modality Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality Change</em>' containment reference.
	 * @see #setModalityChange(ModalityChange)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_ModalityChange()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModalityChange' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityChange getModalityChange();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getModalityChange <em>Modality Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality Change</em>' containment reference.
	 * @see #getModalityChange()
	 * @generated
	 */
	void setModalityChange(ModalityChange value);

	/**
	 * Returns the value of the '<em><b>Modality Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality Info</em>' containment reference.
	 * @see #setModalityInfo(ModalityInfo)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_ModalityInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModalityInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityInfo getModalityInfo();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getModalityInfo <em>Modality Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality Info</em>' containment reference.
	 * @see #getModalityInfo()
	 * @generated
	 */
	void setModalityInfo(ModalityInfo value);

	/**
	 * Returns the value of the '<em><b>Modality Synchroni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality Synchroni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality Synchroni</em>' containment reference.
	 * @see #setModalitySynchroni(ModalitySynchroni)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_ModalitySynchroni()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModalitySynchroni' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalitySynchroni getModalitySynchroni();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getModalitySynchroni <em>Modality Synchroni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality Synchroni</em>' containment reference.
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	void setModalitySynchroni(ModalitySynchroni value);

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
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_SpeechInput()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpeechInput' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechInput getSpeechInput();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getSpeechInput <em>Speech Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Input</em>' containment reference.
	 * @see #getSpeechInput()
	 * @generated
	 */
	void setSpeechInput(SpeechInput value);

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
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_SpeechOutput()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SpeechOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeechOutput getSpeechOutput();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getSpeechOutput <em>Speech Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speech Output</em>' containment reference.
	 * @see #getSpeechOutput()
	 * @generated
	 */
	void setSpeechOutput(SpeechOutput value);

	/**
	 * Returns the value of the '<em><b>System Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Metacomm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Metacomm</em>' containment reference.
	 * @see #setSystemMetacomm(SystemMetacomm)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_SystemMetacomm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemMetacomm' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemMetacomm getSystemMetacomm();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getSystemMetacomm <em>System Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Metacomm</em>' containment reference.
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	void setSystemMetacomm(SystemMetacomm value);

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
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_Task()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Task' namespace='##targetNamespace'"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn</em>' containment reference.
	 * @see #setTurn(Turn)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_Turn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Turn' namespace='##targetNamespace'"
	 * @generated
	 */
	Turn getTurn();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getTurn <em>Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn</em>' containment reference.
	 * @see #getTurn()
	 * @generated
	 */
	void setTurn(Turn value);

	/**
	 * Returns the value of the '<em><b>User Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Metacomm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Metacomm</em>' containment reference.
	 * @see #setUserMetacomm(UserMetacomm)
	 * @see org.mmi.model.ModelPackage#getDocumentRoot_UserMetacomm()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UserMetacomm' namespace='##targetNamespace'"
	 * @generated
	 */
	UserMetacomm getUserMetacomm();

	/**
	 * Sets the value of the '{@link org.mmi.model.DocumentRoot#getUserMetacomm <em>User Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Metacomm</em>' containment reference.
	 * @see #getUserMetacomm()
	 * @generated
	 */
	void setUserMetacomm(UserMetacomm value);

} // DocumentRoot
