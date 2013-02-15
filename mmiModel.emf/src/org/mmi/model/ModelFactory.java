/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = org.mmi.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Avm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Avm</em>'.
	 * @generated
	 */
	Avm createAvm();

	/**
	 * Returns a new object of class '<em>Cooperativity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cooperativity</em>'.
	 * @generated
	 */
	Cooperativity createCooperativity();

	/**
	 * Returns a new object of class '<em>Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialogue</em>'.
	 * @generated
	 */
	Dialogue createDialogue();

	/**
	 * Returns a new object of class '<em>Dialogue Step T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dialogue Step T</em>'.
	 * @generated
	 */
	DialogueStepT createDialogueStepT();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Gui Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gui Input</em>'.
	 * @generated
	 */
	GuiInput createGuiInput();

	/**
	 * Returns a new object of class '<em>Modality Appropriateness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modality Appropriateness</em>'.
	 * @generated
	 */
	ModalityAppropriateness createModalityAppropriateness();

	/**
	 * Returns a new object of class '<em>Modality Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modality Change</em>'.
	 * @generated
	 */
	ModalityChange createModalityChange();

	/**
	 * Returns a new object of class '<em>Modality Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modality Info</em>'.
	 * @generated
	 */
	ModalityInfo createModalityInfo();

	/**
	 * Returns a new object of class '<em>Modality Synchroni</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modality Synchroni</em>'.
	 * @generated
	 */
	ModalitySynchroni createModalitySynchroni();

	/**
	 * Returns a new object of class '<em>Speech Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Input</em>'.
	 * @generated
	 */
	SpeechInput createSpeechInput();

	/**
	 * Returns a new object of class '<em>Speech Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speech Output</em>'.
	 * @generated
	 */
	SpeechOutput createSpeechOutput();

	/**
	 * Returns a new object of class '<em>System Metacomm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Metacomm</em>'.
	 * @generated
	 */
	SystemMetacomm createSystemMetacomm();

	/**
	 * Returns a new object of class '<em>System Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Turn</em>'.
	 * @generated
	 */
	SystemTurn createSystemTurn();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>User Metacomm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Metacomm</em>'.
	 * @generated
	 */
	UserMetacomm createUserMetacomm();

	/**
	 * Returns a new object of class '<em>User Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Turn</em>'.
	 * @generated
	 */
	UserTurn createUserTurn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
