/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.mmi.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.AVM: {
				Avm avm = (Avm)theEObject;
				T result = caseAvm(avm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.COOPERATIVITY: {
				Cooperativity cooperativity = (Cooperativity)theEObject;
				T result = caseCooperativity(cooperativity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIALOGUE: {
				Dialogue dialogue = (Dialogue)theEObject;
				T result = caseDialogue(dialogue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DIALOGUE_STEP_T: {
				DialogueStepT dialogueStepT = (DialogueStepT)theEObject;
				T result = caseDialogueStepT(dialogueStepT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GUI_INPUT: {
				GuiInput guiInput = (GuiInput)theEObject;
				T result = caseGuiInput(guiInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.METACOMM: {
				Metacomm metacomm = (Metacomm)theEObject;
				T result = caseMetacomm(metacomm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODALITY_APPROPRIATENESS: {
				ModalityAppropriateness modalityAppropriateness = (ModalityAppropriateness)theEObject;
				T result = caseModalityAppropriateness(modalityAppropriateness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODALITY_CHANGE: {
				ModalityChange modalityChange = (ModalityChange)theEObject;
				T result = caseModalityChange(modalityChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODALITY_INFO: {
				ModalityInfo modalityInfo = (ModalityInfo)theEObject;
				T result = caseModalityInfo(modalityInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MODALITY_SYNCHRONI: {
				ModalitySynchroni modalitySynchroni = (ModalitySynchroni)theEObject;
				T result = caseModalitySynchroni(modalitySynchroni);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPEECH_INPUT: {
				SpeechInput speechInput = (SpeechInput)theEObject;
				T result = caseSpeechInput(speechInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SPEECH_OUTPUT: {
				SpeechOutput speechOutput = (SpeechOutput)theEObject;
				T result = caseSpeechOutput(speechOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SYSTEM_METACOMM: {
				SystemMetacomm systemMetacomm = (SystemMetacomm)theEObject;
				T result = caseSystemMetacomm(systemMetacomm);
				if (result == null) result = caseMetacomm(systemMetacomm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SYSTEM_TURN: {
				SystemTurn systemTurn = (SystemTurn)theEObject;
				T result = caseSystemTurn(systemTurn);
				if (result == null) result = caseTurn(systemTurn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TURN: {
				Turn turn = (Turn)theEObject;
				T result = caseTurn(turn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USER_METACOMM: {
				UserMetacomm userMetacomm = (UserMetacomm)theEObject;
				T result = caseUserMetacomm(userMetacomm);
				if (result == null) result = caseMetacomm(userMetacomm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.USER_TURN: {
				UserTurn userTurn = (UserTurn)theEObject;
				T result = caseUserTurn(userTurn);
				if (result == null) result = caseTurn(userTurn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvm(Avm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cooperativity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cooperativity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCooperativity(Cooperativity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogue(Dialogue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialogue Step T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialogue Step T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialogueStepT(DialogueStepT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gui Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gui Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuiInput(GuiInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metacomm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metacomm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetacomm(Metacomm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modality Appropriateness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modality Appropriateness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalityAppropriateness(ModalityAppropriateness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modality Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modality Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalityChange(ModalityChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modality Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modality Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalityInfo(ModalityInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modality Synchroni</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modality Synchroni</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModalitySynchroni(ModalitySynchroni object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechInput(SpeechInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speech Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speech Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeechOutput(SpeechOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Metacomm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Metacomm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemMetacomm(SystemMetacomm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemTurn(SystemTurn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Metacomm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Metacomm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserMetacomm(UserMetacomm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTurn(UserTurn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
