/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org/mmiModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.mmi.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.AvmImpl <em>Avm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.AvmImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getAvm()
	 * @generated
	 */
	int AVM = 0;

	/**
	 * The number of structural features of the '<em>Avm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.CooperativityImpl <em>Cooperativity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.CooperativityImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getCooperativity()
	 * @generated
	 */
	int COOPERATIVITY = 1;

	/**
	 * The feature id for the '<em><b>Contextual Appropriateness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS = 0;

	/**
	 * The number of structural features of the '<em>Cooperativity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COOPERATIVITY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.DialogueImpl <em>Dialogue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.DialogueImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getDialogue()
	 * @generated
	 */
	int DIALOGUE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Base Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__BASE_TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__TASK = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE__STEP = 3;

	/**
	 * The number of structural features of the '<em>Dialogue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.DialogueStepTImpl <em>Dialogue Step T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.DialogueStepTImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getDialogueStepT()
	 * @generated
	 */
	int DIALOGUE_STEP_T = 3;

	/**
	 * The feature id for the '<em><b>System Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_STEP_T__SYSTEM_TURN = 0;

	/**
	 * The feature id for the '<em><b>User Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_STEP_T__USER_TURN = 1;

	/**
	 * The number of structural features of the '<em>Dialogue Step T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALOGUE_STEP_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.DocumentRootImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Avm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AVM = 3;

	/**
	 * The feature id for the '<em><b>Cooperativity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COOPERATIVITY = 4;

	/**
	 * The feature id for the '<em><b>Dialogue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIALOGUE = 5;

	/**
	 * The feature id for the '<em><b>Gui Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GUI_INPUT = 6;

	/**
	 * The feature id for the '<em><b>Modality Appropriateness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODALITY_APPROPRIATENESS = 7;

	/**
	 * The feature id for the '<em><b>Modality Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODALITY_CHANGE = 8;

	/**
	 * The feature id for the '<em><b>Modality Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODALITY_INFO = 9;

	/**
	 * The feature id for the '<em><b>Modality Synchroni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODALITY_SYNCHRONI = 10;

	/**
	 * The feature id for the '<em><b>Speech Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPEECH_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Speech Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPEECH_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>System Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_METACOMM = 13;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TASK = 14;

	/**
	 * The feature id for the '<em><b>Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TURN = 15;

	/**
	 * The feature id for the '<em><b>User Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__USER_METACOMM = 16;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.GuiInputImpl <em>Gui Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.GuiInputImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getGuiInput()
	 * @generated
	 */
	int GUI_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__TEXT_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Navigation Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__NAVIGATION_ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Navigation Moves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__NAVIGATION_MOVES = 2;

	/**
	 * The feature id for the '<em><b>Navigation Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__NAVIGATION_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Exploring Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__EXPLORING_ACTIONS = 4;

	/**
	 * The feature id for the '<em><b>Transferring Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT__TRANSFERRING_ACTIONS = 5;

	/**
	 * The number of structural features of the '<em>Gui Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUI_INPUT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.MetacommImpl <em>Metacomm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.MetacommImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getMetacomm()
	 * @generated
	 */
	int METACOMM = 6;

	/**
	 * The feature id for the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM__IS_HELP = 0;

	/**
	 * The feature id for the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM__IS_CORRECTION = 1;

	/**
	 * The number of structural features of the '<em>Metacomm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METACOMM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.ModalityAppropriatenessImpl <em>Modality Appropriateness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.ModalityAppropriatenessImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getModalityAppropriateness()
	 * @generated
	 */
	int MODALITY_APPROPRIATENESS = 7;

	/**
	 * The feature id for the '<em><b>Appropriateness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_APPROPRIATENESS__APPROPRIATENESS = 0;

	/**
	 * The number of structural features of the '<em>Modality Appropriateness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_APPROPRIATENESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.ModalityChangeImpl <em>Modality Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.ModalityChangeImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getModalityChange()
	 * @generated
	 */
	int MODALITY_CHANGE = 8;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_CHANGE__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_CHANGE__REASON = 1;

	/**
	 * The number of structural features of the '<em>Modality Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_CHANGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.ModalityInfoImpl <em>Modality Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.ModalityInfoImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getModalityInfo()
	 * @generated
	 */
	int MODALITY_INFO = 9;

	/**
	 * The feature id for the '<em><b>Modality Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__MODALITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mmi Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__MMI_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Appropriateness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__APPROPRIATENESS = 2;

	/**
	 * The feature id for the '<em><b>Synchroni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__SYNCHRONI = 3;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO__CHANGE = 4;

	/**
	 * The number of structural features of the '<em>Modality Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_INFO_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.ModalitySynchroniImpl <em>Modality Synchroni</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.ModalitySynchroniImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getModalitySynchroni()
	 * @generated
	 */
	int MODALITY_SYNCHRONI = 10;

	/**
	 * The feature id for the '<em><b>Nlags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI__NLAGS = 0;

	/**
	 * The feature id for the '<em><b>Lagtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI__LAGTIME = 1;

	/**
	 * The feature id for the '<em><b>Nevents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI__NEVENTS = 2;

	/**
	 * The number of structural features of the '<em>Modality Synchroni</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODALITY_SYNCHRONI_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.SpeechInputImpl <em>Speech Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.SpeechInputImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getSpeechInput()
	 * @generated
	 */
	int SPEECH_INPUT = 11;

	/**
	 * The feature id for the '<em><b>Overall Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__OVERALL_WORDS = 0;

	/**
	 * The feature id for the '<em><b>Substituted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__SUBSTITUTED_WORDS = 1;

	/**
	 * The feature id for the '<em><b>Deleted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__DELETED_WORDS = 2;

	/**
	 * The feature id for the '<em><b>Inserted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__INSERTED_WORDS = 3;

	/**
	 * The feature id for the '<em><b>Overall Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__OVERALL_SENTENCES = 4;

	/**
	 * The feature id for the '<em><b>Substituted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__SUBSTITUTED_SENTENCES = 5;

	/**
	 * The feature id for the '<em><b>Deleted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__DELETED_SENTENCES = 6;

	/**
	 * The feature id for the '<em><b>Inserted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__INSERTED_SENTENCES = 7;

	/**
	 * The feature id for the '<em><b>Overall Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__OVERALL_CONCEPTS = 8;

	/**
	 * The feature id for the '<em><b>Substituted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__SUBSTITUTED_CONCEPTS = 9;

	/**
	 * The feature id for the '<em><b>Deleted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__DELETED_CONCEPTS = 10;

	/**
	 * The feature id for the '<em><b>Inserted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__INSERTED_CONCEPTS = 11;

	/**
	 * The feature id for the '<em><b>Parsing Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT__PARSING_RESULT = 12;

	/**
	 * The number of structural features of the '<em>Speech Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_INPUT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.SpeechOutputImpl <em>Speech Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.SpeechOutputImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getSpeechOutput()
	 * @generated
	 */
	int SPEECH_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>ANCO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANCO = 0;

	/**
	 * The feature id for the '<em><b>ANIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANIN = 1;

	/**
	 * The feature id for the '<em><b>ANPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANPA = 2;

	/**
	 * The feature id for the '<em><b>ANFA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__ANFA = 3;

	/**
	 * The feature id for the '<em><b>Prompt Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT__PROMPT_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Speech Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_OUTPUT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.SystemMetacommImpl <em>System Metacomm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.SystemMetacommImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getSystemMetacomm()
	 * @generated
	 */
	int SYSTEM_METACOMM = 13;

	/**
	 * The feature id for the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_HELP = METACOMM__IS_HELP;

	/**
	 * The feature id for the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_CORRECTION = METACOMM__IS_CORRECTION;

	/**
	 * The feature id for the '<em><b>Is ASR Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_ASR_REJECT = METACOMM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is DIV Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_DIV_REJECT = METACOMM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is GR Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM__IS_GR_REJECT = METACOMM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Metacomm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_METACOMM_FEATURE_COUNT = METACOMM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.TurnImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 16;

	/**
	 * The feature id for the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__FEEDBACK_DELAY = 0;

	/**
	 * The feature id for the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__FEEDBACK_DURATION = 1;

	/**
	 * The feature id for the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ACTION_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__CONCEPTS = 5;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__NOISE = 6;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__QUESTIONS = 7;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__MODALITY = 8;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.SystemTurnImpl <em>System Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.SystemTurnImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getSystemTurn()
	 * @generated
	 */
	int SYSTEM_TURN = 14;

	/**
	 * The feature id for the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__FEEDBACK_DELAY = TURN__FEEDBACK_DELAY;

	/**
	 * The feature id for the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__FEEDBACK_DURATION = TURN__FEEDBACK_DURATION;

	/**
	 * The feature id for the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__ACTION_DURATION = TURN__ACTION_DURATION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__ELEMENTS = TURN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__FEEDBACK = TURN__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__CONCEPTS = TURN__CONCEPTS;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__NOISE = TURN__NOISE;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__QUESTIONS = TURN__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__MODALITY = TURN__MODALITY;

	/**
	 * The feature id for the '<em><b>Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__METACOMM = TURN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speech Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__SPEECH_OUTPUT = TURN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cooperativity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN__COOPERATIVITY = TURN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>System Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TURN_FEATURE_COUNT = TURN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.TaskImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 15;

	/**
	 * The feature id for the '<em><b>Success</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUCCESS = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__REASON = 1;

	/**
	 * The feature id for the '<em><b>Avm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__AVM = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.UserMetacommImpl <em>User Metacomm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.UserMetacommImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getUserMetacomm()
	 * @generated
	 */
	int USER_METACOMM = 17;

	/**
	 * The feature id for the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_HELP = METACOMM__IS_HELP;

	/**
	 * The feature id for the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_CORRECTION = METACOMM__IS_CORRECTION;

	/**
	 * The feature id for the '<em><b>Is Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_TIME_OUT = METACOMM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_CANCEL = METACOMM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_RESTART = METACOMM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Bargein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_BARGEIN = METACOMM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Successful Bargein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM__IS_SUCCESSFUL_BARGEIN = METACOMM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>User Metacomm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_METACOMM_FEATURE_COUNT = METACOMM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mmi.model.impl.UserTurnImpl <em>User Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.impl.UserTurnImpl
	 * @see org.mmi.model.impl.ModelPackageImpl#getUserTurn()
	 * @generated
	 */
	int USER_TURN = 18;

	/**
	 * The feature id for the '<em><b>Feedback Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__FEEDBACK_DELAY = TURN__FEEDBACK_DELAY;

	/**
	 * The feature id for the '<em><b>Feedback Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__FEEDBACK_DURATION = TURN__FEEDBACK_DURATION;

	/**
	 * The feature id for the '<em><b>Action Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__ACTION_DURATION = TURN__ACTION_DURATION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__ELEMENTS = TURN__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__FEEDBACK = TURN__FEEDBACK;

	/**
	 * The feature id for the '<em><b>Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__CONCEPTS = TURN__CONCEPTS;

	/**
	 * The feature id for the '<em><b>Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__NOISE = TURN__NOISE;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__QUESTIONS = TURN__QUESTIONS;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__MODALITY = TURN__MODALITY;

	/**
	 * The feature id for the '<em><b>Metacomm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__METACOMM = TURN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Speech Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__SPEECH_INPUT = TURN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Gui Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN__GUI_INPUT = TURN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>User Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TURN_FEATURE_COUNT = TURN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mmi.model.ContextualAppropriatenessT <em>Contextual Appropriateness T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ContextualAppropriatenessT
	 * @see org.mmi.model.impl.ModelPackageImpl#getContextualAppropriatenessT()
	 * @generated
	 */
	int CONTEXTUAL_APPROPRIATENESS_T = 19;

	/**
	 * The meta object id for the '{@link org.mmi.model.McReasonT <em>Mc Reason T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.McReasonT
	 * @see org.mmi.model.impl.ModelPackageImpl#getMcReasonT()
	 * @generated
	 */
	int MC_REASON_T = 20;

	/**
	 * The meta object id for the '{@link org.mmi.model.MmiTypeT <em>Mmi Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.MmiTypeT
	 * @see org.mmi.model.impl.ModelPackageImpl#getMmiTypeT()
	 * @generated
	 */
	int MMI_TYPE_T = 21;

	/**
	 * The meta object id for the '{@link org.mmi.model.ModAppropT <em>Mod Approp T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ModAppropT
	 * @see org.mmi.model.impl.ModelPackageImpl#getModAppropT()
	 * @generated
	 */
	int MOD_APPROP_T = 22;

	/**
	 * The meta object id for the '{@link org.mmi.model.ModTypeT <em>Mod Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ModTypeT
	 * @see org.mmi.model.impl.ModelPackageImpl#getModTypeT()
	 * @generated
	 */
	int MOD_TYPE_T = 23;

	/**
	 * The meta object id for the '{@link org.mmi.model.ParsingResultT <em>Parsing Result T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ParsingResultT
	 * @see org.mmi.model.impl.ModelPackageImpl#getParsingResultT()
	 * @generated
	 */
	int PARSING_RESULT_T = 24;

	/**
	 * The meta object id for the '{@link org.mmi.model.PromptTypeT <em>Prompt Type T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.PromptTypeT
	 * @see org.mmi.model.impl.ModelPackageImpl#getPromptTypeT()
	 * @generated
	 */
	int PROMPT_TYPE_T = 25;

	/**
	 * The meta object id for the '{@link org.mmi.model.RoleT <em>Role T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.RoleT
	 * @see org.mmi.model.impl.ModelPackageImpl#getRoleT()
	 * @generated
	 */
	int ROLE_T = 26;

	/**
	 * The meta object id for the '{@link org.mmi.model.TaskSuccessT <em>Task Success T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.TaskSuccessT
	 * @see org.mmi.model.impl.ModelPackageImpl#getTaskSuccessT()
	 * @generated
	 */
	int TASK_SUCCESS_T = 27;

	/**
	 * The meta object id for the '<em>Contextual Appropriateness TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ContextualAppropriatenessT
	 * @see org.mmi.model.impl.ModelPackageImpl#getContextualAppropriatenessTObject()
	 * @generated
	 */
	int CONTEXTUAL_APPROPRIATENESS_TOBJECT = 28;

	/**
	 * The meta object id for the '<em>Mc Reason TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.McReasonT
	 * @see org.mmi.model.impl.ModelPackageImpl#getMcReasonTObject()
	 * @generated
	 */
	int MC_REASON_TOBJECT = 29;

	/**
	 * The meta object id for the '<em>Mmi Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.MmiTypeT
	 * @see org.mmi.model.impl.ModelPackageImpl#getMmiTypeTObject()
	 * @generated
	 */
	int MMI_TYPE_TOBJECT = 30;

	/**
	 * The meta object id for the '<em>Mod Approp TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ModAppropT
	 * @see org.mmi.model.impl.ModelPackageImpl#getModAppropTObject()
	 * @generated
	 */
	int MOD_APPROP_TOBJECT = 31;

	/**
	 * The meta object id for the '<em>Mod Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ModTypeT
	 * @see org.mmi.model.impl.ModelPackageImpl#getModTypeTObject()
	 * @generated
	 */
	int MOD_TYPE_TOBJECT = 32;

	/**
	 * The meta object id for the '<em>Parsing Result TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.ParsingResultT
	 * @see org.mmi.model.impl.ModelPackageImpl#getParsingResultTObject()
	 * @generated
	 */
	int PARSING_RESULT_TOBJECT = 33;

	/**
	 * The meta object id for the '<em>Prompt Type TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.PromptTypeT
	 * @see org.mmi.model.impl.ModelPackageImpl#getPromptTypeTObject()
	 * @generated
	 */
	int PROMPT_TYPE_TOBJECT = 34;

	/**
	 * The meta object id for the '<em>Role TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.RoleT
	 * @see org.mmi.model.impl.ModelPackageImpl#getRoleTObject()
	 * @generated
	 */
	int ROLE_TOBJECT = 35;

	/**
	 * The meta object id for the '<em>Task Success TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mmi.model.TaskSuccessT
	 * @see org.mmi.model.impl.ModelPackageImpl#getTaskSuccessTObject()
	 * @generated
	 */
	int TASK_SUCCESS_TOBJECT = 36;


	/**
	 * Returns the meta object for class '{@link org.mmi.model.Avm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avm</em>'.
	 * @see org.mmi.model.Avm
	 * @generated
	 */
	EClass getAvm();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.Cooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cooperativity</em>'.
	 * @see org.mmi.model.Cooperativity
	 * @generated
	 */
	EClass getCooperativity();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Cooperativity#getContextualAppropriateness <em>Contextual Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Appropriateness</em>'.
	 * @see org.mmi.model.Cooperativity#getContextualAppropriateness()
	 * @see #getCooperativity()
	 * @generated
	 */
	EAttribute getCooperativity_ContextualAppropriateness();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue</em>'.
	 * @see org.mmi.model.Dialogue
	 * @generated
	 */
	EClass getDialogue();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Dialogue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mmi.model.Dialogue#getDescription()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Dialogue#getBaseTimestamp <em>Base Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Timestamp</em>'.
	 * @see org.mmi.model.Dialogue#getBaseTimestamp()
	 * @see #getDialogue()
	 * @generated
	 */
	EAttribute getDialogue_BaseTimestamp();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.Dialogue#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see org.mmi.model.Dialogue#getTask()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mmi.model.Dialogue#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see org.mmi.model.Dialogue#getStep()
	 * @see #getDialogue()
	 * @generated
	 */
	EReference getDialogue_Step();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.DialogueStepT <em>Dialogue Step T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialogue Step T</em>'.
	 * @see org.mmi.model.DialogueStepT
	 * @generated
	 */
	EClass getDialogueStepT();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DialogueStepT#getSystemTurn <em>System Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Turn</em>'.
	 * @see org.mmi.model.DialogueStepT#getSystemTurn()
	 * @see #getDialogueStepT()
	 * @generated
	 */
	EReference getDialogueStepT_SystemTurn();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DialogueStepT#getUserTurn <em>User Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Turn</em>'.
	 * @see org.mmi.model.DialogueStepT#getUserTurn()
	 * @see #getDialogueStepT()
	 * @generated
	 */
	EReference getDialogueStepT_UserTurn();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.mmi.model.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.mmi.model.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.mmi.model.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.mmi.model.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.mmi.model.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.mmi.model.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.mmi.model.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getAvm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Avm</em>'.
	 * @see org.mmi.model.DocumentRoot#getAvm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Avm();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getCooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cooperativity</em>'.
	 * @see org.mmi.model.DocumentRoot#getCooperativity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cooperativity();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getDialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dialogue</em>'.
	 * @see org.mmi.model.DocumentRoot#getDialogue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dialogue();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getGuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gui Input</em>'.
	 * @see org.mmi.model.DocumentRoot#getGuiInput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GuiInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getModalityAppropriateness <em>Modality Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality Appropriateness</em>'.
	 * @see org.mmi.model.DocumentRoot#getModalityAppropriateness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModalityAppropriateness();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getModalityChange <em>Modality Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality Change</em>'.
	 * @see org.mmi.model.DocumentRoot#getModalityChange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModalityChange();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getModalityInfo <em>Modality Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality Info</em>'.
	 * @see org.mmi.model.DocumentRoot#getModalityInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModalityInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getModalitySynchroni <em>Modality Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality Synchroni</em>'.
	 * @see org.mmi.model.DocumentRoot#getModalitySynchroni()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModalitySynchroni();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getSpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Input</em>'.
	 * @see org.mmi.model.DocumentRoot#getSpeechInput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpeechInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getSpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Output</em>'.
	 * @see org.mmi.model.DocumentRoot#getSpeechOutput()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpeechOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getSystemMetacomm <em>System Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Metacomm</em>'.
	 * @see org.mmi.model.DocumentRoot#getSystemMetacomm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SystemMetacomm();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see org.mmi.model.DocumentRoot#getTask()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Task();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getTurn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Turn</em>'.
	 * @see org.mmi.model.DocumentRoot#getTurn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Turn();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.DocumentRoot#getUserMetacomm <em>User Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Metacomm</em>'.
	 * @see org.mmi.model.DocumentRoot#getUserMetacomm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UserMetacomm();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.GuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gui Input</em>'.
	 * @see org.mmi.model.GuiInput
	 * @generated
	 */
	EClass getGuiInput();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.GuiInput#getTextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Elements</em>'.
	 * @see org.mmi.model.GuiInput#getTextElements()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_TextElements();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.GuiInput#getNavigationActions <em>Navigation Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Actions</em>'.
	 * @see org.mmi.model.GuiInput#getNavigationActions()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_NavigationActions();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.GuiInput#getNavigationMoves <em>Navigation Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Moves</em>'.
	 * @see org.mmi.model.GuiInput#getNavigationMoves()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_NavigationMoves();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.GuiInput#getNavigationLength <em>Navigation Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Length</em>'.
	 * @see org.mmi.model.GuiInput#getNavigationLength()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_NavigationLength();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.GuiInput#getExploringActions <em>Exploring Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exploring Actions</em>'.
	 * @see org.mmi.model.GuiInput#getExploringActions()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_ExploringActions();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.GuiInput#getTransferringActions <em>Transferring Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transferring Actions</em>'.
	 * @see org.mmi.model.GuiInput#getTransferringActions()
	 * @see #getGuiInput()
	 * @generated
	 */
	EAttribute getGuiInput_TransferringActions();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.Metacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metacomm</em>'.
	 * @see org.mmi.model.Metacomm
	 * @generated
	 */
	EClass getMetacomm();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Metacomm#isIsHelp <em>Is Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Help</em>'.
	 * @see org.mmi.model.Metacomm#isIsHelp()
	 * @see #getMetacomm()
	 * @generated
	 */
	EAttribute getMetacomm_IsHelp();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Metacomm#isIsCorrection <em>Is Correction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Correction</em>'.
	 * @see org.mmi.model.Metacomm#isIsCorrection()
	 * @see #getMetacomm()
	 * @generated
	 */
	EAttribute getMetacomm_IsCorrection();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.ModalityAppropriateness <em>Modality Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Appropriateness</em>'.
	 * @see org.mmi.model.ModalityAppropriateness
	 * @generated
	 */
	EClass getModalityAppropriateness();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalityAppropriateness#getAppropriateness <em>Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appropriateness</em>'.
	 * @see org.mmi.model.ModalityAppropriateness#getAppropriateness()
	 * @see #getModalityAppropriateness()
	 * @generated
	 */
	EAttribute getModalityAppropriateness_Appropriateness();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.ModalityChange <em>Modality Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Change</em>'.
	 * @see org.mmi.model.ModalityChange
	 * @generated
	 */
	EClass getModalityChange();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalityChange#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.mmi.model.ModalityChange#getOrigin()
	 * @see #getModalityChange()
	 * @generated
	 */
	EAttribute getModalityChange_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalityChange#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.mmi.model.ModalityChange#getReason()
	 * @see #getModalityChange()
	 * @generated
	 */
	EAttribute getModalityChange_Reason();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.ModalityInfo <em>Modality Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Info</em>'.
	 * @see org.mmi.model.ModalityInfo
	 * @generated
	 */
	EClass getModalityInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalityInfo#getModalityType <em>Modality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality Type</em>'.
	 * @see org.mmi.model.ModalityInfo#getModalityType()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EAttribute getModalityInfo_ModalityType();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalityInfo#getMmiType <em>Mmi Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mmi Type</em>'.
	 * @see org.mmi.model.ModalityInfo#getMmiType()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EAttribute getModalityInfo_MmiType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.ModalityInfo#getAppropriateness <em>Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Appropriateness</em>'.
	 * @see org.mmi.model.ModalityInfo#getAppropriateness()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EReference getModalityInfo_Appropriateness();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.ModalityInfo#getSynchroni <em>Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synchroni</em>'.
	 * @see org.mmi.model.ModalityInfo#getSynchroni()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EReference getModalityInfo_Synchroni();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.ModalityInfo#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change</em>'.
	 * @see org.mmi.model.ModalityInfo#getChange()
	 * @see #getModalityInfo()
	 * @generated
	 */
	EReference getModalityInfo_Change();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.ModalitySynchroni <em>Modality Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modality Synchroni</em>'.
	 * @see org.mmi.model.ModalitySynchroni
	 * @generated
	 */
	EClass getModalitySynchroni();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalitySynchroni#getNlags <em>Nlags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nlags</em>'.
	 * @see org.mmi.model.ModalitySynchroni#getNlags()
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	EAttribute getModalitySynchroni_Nlags();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalitySynchroni#getLagtime <em>Lagtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lagtime</em>'.
	 * @see org.mmi.model.ModalitySynchroni#getLagtime()
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	EAttribute getModalitySynchroni_Lagtime();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.ModalitySynchroni#getNevents <em>Nevents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nevents</em>'.
	 * @see org.mmi.model.ModalitySynchroni#getNevents()
	 * @see #getModalitySynchroni()
	 * @generated
	 */
	EAttribute getModalitySynchroni_Nevents();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.SpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Input</em>'.
	 * @see org.mmi.model.SpeechInput
	 * @generated
	 */
	EClass getSpeechInput();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getOverallWords <em>Overall Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Words</em>'.
	 * @see org.mmi.model.SpeechInput#getOverallWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_OverallWords();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getSubstitutedWords <em>Substituted Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substituted Words</em>'.
	 * @see org.mmi.model.SpeechInput#getSubstitutedWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_SubstitutedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getDeletedWords <em>Deleted Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Words</em>'.
	 * @see org.mmi.model.SpeechInput#getDeletedWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_DeletedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getInsertedWords <em>Inserted Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Words</em>'.
	 * @see org.mmi.model.SpeechInput#getInsertedWords()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_InsertedWords();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getOverallSentences <em>Overall Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Sentences</em>'.
	 * @see org.mmi.model.SpeechInput#getOverallSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_OverallSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getSubstitutedSentences <em>Substituted Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substituted Sentences</em>'.
	 * @see org.mmi.model.SpeechInput#getSubstitutedSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_SubstitutedSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getDeletedSentences <em>Deleted Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Sentences</em>'.
	 * @see org.mmi.model.SpeechInput#getDeletedSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_DeletedSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getInsertedSentences <em>Inserted Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Sentences</em>'.
	 * @see org.mmi.model.SpeechInput#getInsertedSentences()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_InsertedSentences();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getOverallConcepts <em>Overall Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overall Concepts</em>'.
	 * @see org.mmi.model.SpeechInput#getOverallConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_OverallConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getSubstitutedConcepts <em>Substituted Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substituted Concepts</em>'.
	 * @see org.mmi.model.SpeechInput#getSubstitutedConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_SubstitutedConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getDeletedConcepts <em>Deleted Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted Concepts</em>'.
	 * @see org.mmi.model.SpeechInput#getDeletedConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_DeletedConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getInsertedConcepts <em>Inserted Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserted Concepts</em>'.
	 * @see org.mmi.model.SpeechInput#getInsertedConcepts()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_InsertedConcepts();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechInput#getParsingResult <em>Parsing Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsing Result</em>'.
	 * @see org.mmi.model.SpeechInput#getParsingResult()
	 * @see #getSpeechInput()
	 * @generated
	 */
	EAttribute getSpeechInput_ParsingResult();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.SpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Output</em>'.
	 * @see org.mmi.model.SpeechOutput
	 * @generated
	 */
	EClass getSpeechOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechOutput#getANCO <em>ANCO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANCO</em>'.
	 * @see org.mmi.model.SpeechOutput#getANCO()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANCO();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechOutput#getANIN <em>ANIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANIN</em>'.
	 * @see org.mmi.model.SpeechOutput#getANIN()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANIN();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechOutput#getANPA <em>ANPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANPA</em>'.
	 * @see org.mmi.model.SpeechOutput#getANPA()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANPA();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechOutput#getANFA <em>ANFA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ANFA</em>'.
	 * @see org.mmi.model.SpeechOutput#getANFA()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_ANFA();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SpeechOutput#getPromptType <em>Prompt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt Type</em>'.
	 * @see org.mmi.model.SpeechOutput#getPromptType()
	 * @see #getSpeechOutput()
	 * @generated
	 */
	EAttribute getSpeechOutput_PromptType();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.SystemMetacomm <em>System Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Metacomm</em>'.
	 * @see org.mmi.model.SystemMetacomm
	 * @generated
	 */
	EClass getSystemMetacomm();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SystemMetacomm#isIsASRReject <em>Is ASR Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is ASR Reject</em>'.
	 * @see org.mmi.model.SystemMetacomm#isIsASRReject()
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	EAttribute getSystemMetacomm_IsASRReject();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SystemMetacomm#isIsDIVReject <em>Is DIV Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is DIV Reject</em>'.
	 * @see org.mmi.model.SystemMetacomm#isIsDIVReject()
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	EAttribute getSystemMetacomm_IsDIVReject();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.SystemMetacomm#isIsGRReject <em>Is GR Reject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is GR Reject</em>'.
	 * @see org.mmi.model.SystemMetacomm#isIsGRReject()
	 * @see #getSystemMetacomm()
	 * @generated
	 */
	EAttribute getSystemMetacomm_IsGRReject();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.SystemTurn <em>System Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Turn</em>'.
	 * @see org.mmi.model.SystemTurn
	 * @generated
	 */
	EClass getSystemTurn();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.SystemTurn#getMetacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metacomm</em>'.
	 * @see org.mmi.model.SystemTurn#getMetacomm()
	 * @see #getSystemTurn()
	 * @generated
	 */
	EReference getSystemTurn_Metacomm();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.SystemTurn#getSpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Output</em>'.
	 * @see org.mmi.model.SystemTurn#getSpeechOutput()
	 * @see #getSystemTurn()
	 * @generated
	 */
	EReference getSystemTurn_SpeechOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.SystemTurn#getCooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cooperativity</em>'.
	 * @see org.mmi.model.SystemTurn#getCooperativity()
	 * @see #getSystemTurn()
	 * @generated
	 */
	EReference getSystemTurn_Cooperativity();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.mmi.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Task#getSuccess <em>Success</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success</em>'.
	 * @see org.mmi.model.Task#getSuccess()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Success();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Task#getReason <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reason</em>'.
	 * @see org.mmi.model.Task#getReason()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Reason();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.Task#getAvm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Avm</em>'.
	 * @see org.mmi.model.Task#getAvm()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Avm();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see org.mmi.model.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getFeedbackDelay <em>Feedback Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Delay</em>'.
	 * @see org.mmi.model.Turn#getFeedbackDelay()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_FeedbackDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getFeedbackDuration <em>Feedback Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback Duration</em>'.
	 * @see org.mmi.model.Turn#getFeedbackDuration()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_FeedbackDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getActionDuration <em>Action Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Duration</em>'.
	 * @see org.mmi.model.Turn#getActionDuration()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_ActionDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elements</em>'.
	 * @see org.mmi.model.Turn#getElements()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Elements();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see org.mmi.model.Turn#getFeedback()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Feedback();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getConcepts <em>Concepts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concepts</em>'.
	 * @see org.mmi.model.Turn#getConcepts()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Concepts();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getNoise <em>Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noise</em>'.
	 * @see org.mmi.model.Turn#getNoise()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Noise();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.Turn#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Questions</em>'.
	 * @see org.mmi.model.Turn#getQuestions()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Questions();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.Turn#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Modality</em>'.
	 * @see org.mmi.model.Turn#getModality()
	 * @see #getTurn()
	 * @generated
	 */
	EReference getTurn_Modality();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.UserMetacomm <em>User Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Metacomm</em>'.
	 * @see org.mmi.model.UserMetacomm
	 * @generated
	 */
	EClass getUserMetacomm();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.UserMetacomm#isIsTimeOut <em>Is Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Time Out</em>'.
	 * @see org.mmi.model.UserMetacomm#isIsTimeOut()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsTimeOut();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.UserMetacomm#isIsCancel <em>Is Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cancel</em>'.
	 * @see org.mmi.model.UserMetacomm#isIsCancel()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsCancel();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.UserMetacomm#isIsRestart <em>Is Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Restart</em>'.
	 * @see org.mmi.model.UserMetacomm#isIsRestart()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsRestart();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.UserMetacomm#isIsBargein <em>Is Bargein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bargein</em>'.
	 * @see org.mmi.model.UserMetacomm#isIsBargein()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsBargein();

	/**
	 * Returns the meta object for the attribute '{@link org.mmi.model.UserMetacomm#isIsSuccessfulBargein <em>Is Successful Bargein</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Successful Bargein</em>'.
	 * @see org.mmi.model.UserMetacomm#isIsSuccessfulBargein()
	 * @see #getUserMetacomm()
	 * @generated
	 */
	EAttribute getUserMetacomm_IsSuccessfulBargein();

	/**
	 * Returns the meta object for class '{@link org.mmi.model.UserTurn <em>User Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Turn</em>'.
	 * @see org.mmi.model.UserTurn
	 * @generated
	 */
	EClass getUserTurn();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.UserTurn#getMetacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metacomm</em>'.
	 * @see org.mmi.model.UserTurn#getMetacomm()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_Metacomm();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.UserTurn#getSpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech Input</em>'.
	 * @see org.mmi.model.UserTurn#getSpeechInput()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_SpeechInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.mmi.model.UserTurn#getGuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gui Input</em>'.
	 * @see org.mmi.model.UserTurn#getGuiInput()
	 * @see #getUserTurn()
	 * @generated
	 */
	EReference getUserTurn_GuiInput();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.ContextualAppropriatenessT <em>Contextual Appropriateness T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contextual Appropriateness T</em>'.
	 * @see org.mmi.model.ContextualAppropriatenessT
	 * @generated
	 */
	EEnum getContextualAppropriatenessT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.McReasonT <em>Mc Reason T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mc Reason T</em>'.
	 * @see org.mmi.model.McReasonT
	 * @generated
	 */
	EEnum getMcReasonT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.MmiTypeT <em>Mmi Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mmi Type T</em>'.
	 * @see org.mmi.model.MmiTypeT
	 * @generated
	 */
	EEnum getMmiTypeT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.ModAppropT <em>Mod Approp T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mod Approp T</em>'.
	 * @see org.mmi.model.ModAppropT
	 * @generated
	 */
	EEnum getModAppropT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.ModTypeT <em>Mod Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mod Type T</em>'.
	 * @see org.mmi.model.ModTypeT
	 * @generated
	 */
	EEnum getModTypeT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.ParsingResultT <em>Parsing Result T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parsing Result T</em>'.
	 * @see org.mmi.model.ParsingResultT
	 * @generated
	 */
	EEnum getParsingResultT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.PromptTypeT <em>Prompt Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Prompt Type T</em>'.
	 * @see org.mmi.model.PromptTypeT
	 * @generated
	 */
	EEnum getPromptTypeT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.RoleT <em>Role T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role T</em>'.
	 * @see org.mmi.model.RoleT
	 * @generated
	 */
	EEnum getRoleT();

	/**
	 * Returns the meta object for enum '{@link org.mmi.model.TaskSuccessT <em>Task Success T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Task Success T</em>'.
	 * @see org.mmi.model.TaskSuccessT
	 * @generated
	 */
	EEnum getTaskSuccessT();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.ContextualAppropriatenessT <em>Contextual Appropriateness TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contextual Appropriateness TObject</em>'.
	 * @see org.mmi.model.ContextualAppropriatenessT
	 * @model instanceClass="org.mmi.model.ContextualAppropriatenessT"
	 *        extendedMetaData="name='contextual_appropriateness_t:Object' baseType='contextual_appropriateness_t'"
	 * @generated
	 */
	EDataType getContextualAppropriatenessTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.McReasonT <em>Mc Reason TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mc Reason TObject</em>'.
	 * @see org.mmi.model.McReasonT
	 * @model instanceClass="org.mmi.model.McReasonT"
	 *        extendedMetaData="name='mc_reason_t:Object' baseType='mc_reason_t'"
	 * @generated
	 */
	EDataType getMcReasonTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.MmiTypeT <em>Mmi Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mmi Type TObject</em>'.
	 * @see org.mmi.model.MmiTypeT
	 * @model instanceClass="org.mmi.model.MmiTypeT"
	 *        extendedMetaData="name='mmi_type_t:Object' baseType='mmi_type_t'"
	 * @generated
	 */
	EDataType getMmiTypeTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.ModAppropT <em>Mod Approp TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mod Approp TObject</em>'.
	 * @see org.mmi.model.ModAppropT
	 * @model instanceClass="org.mmi.model.ModAppropT"
	 *        extendedMetaData="name='mod_approp_t:Object' baseType='mod_approp_t'"
	 * @generated
	 */
	EDataType getModAppropTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.ModTypeT <em>Mod Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Mod Type TObject</em>'.
	 * @see org.mmi.model.ModTypeT
	 * @model instanceClass="org.mmi.model.ModTypeT"
	 *        extendedMetaData="name='mod_type_t:Object' baseType='mod_type_t'"
	 * @generated
	 */
	EDataType getModTypeTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.ParsingResultT <em>Parsing Result TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parsing Result TObject</em>'.
	 * @see org.mmi.model.ParsingResultT
	 * @model instanceClass="org.mmi.model.ParsingResultT"
	 *        extendedMetaData="name='parsing_result_t:Object' baseType='parsing_result_t'"
	 * @generated
	 */
	EDataType getParsingResultTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.PromptTypeT <em>Prompt Type TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Prompt Type TObject</em>'.
	 * @see org.mmi.model.PromptTypeT
	 * @model instanceClass="org.mmi.model.PromptTypeT"
	 *        extendedMetaData="name='prompt_type_t:Object' baseType='prompt_type_t'"
	 * @generated
	 */
	EDataType getPromptTypeTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.RoleT <em>Role TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Role TObject</em>'.
	 * @see org.mmi.model.RoleT
	 * @model instanceClass="org.mmi.model.RoleT"
	 *        extendedMetaData="name='role_t:Object' baseType='role_t'"
	 * @generated
	 */
	EDataType getRoleTObject();

	/**
	 * Returns the meta object for data type '{@link org.mmi.model.TaskSuccessT <em>Task Success TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Task Success TObject</em>'.
	 * @see org.mmi.model.TaskSuccessT
	 * @model instanceClass="org.mmi.model.TaskSuccessT"
	 *        extendedMetaData="name='task_success_t:Object' baseType='task_success_t'"
	 * @generated
	 */
	EDataType getTaskSuccessTObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.AvmImpl <em>Avm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.AvmImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getAvm()
		 * @generated
		 */
		EClass AVM = eINSTANCE.getAvm();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.CooperativityImpl <em>Cooperativity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.CooperativityImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getCooperativity()
		 * @generated
		 */
		EClass COOPERATIVITY = eINSTANCE.getCooperativity();

		/**
		 * The meta object literal for the '<em><b>Contextual Appropriateness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS = eINSTANCE.getCooperativity_ContextualAppropriateness();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.DialogueImpl <em>Dialogue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.DialogueImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getDialogue()
		 * @generated
		 */
		EClass DIALOGUE = eINSTANCE.getDialogue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__DESCRIPTION = eINSTANCE.getDialogue_Description();

		/**
		 * The meta object literal for the '<em><b>Base Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIALOGUE__BASE_TIMESTAMP = eINSTANCE.getDialogue_BaseTimestamp();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__TASK = eINSTANCE.getDialogue_Task();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE__STEP = eINSTANCE.getDialogue_Step();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.DialogueStepTImpl <em>Dialogue Step T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.DialogueStepTImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getDialogueStepT()
		 * @generated
		 */
		EClass DIALOGUE_STEP_T = eINSTANCE.getDialogueStepT();

		/**
		 * The meta object literal for the '<em><b>System Turn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE_STEP_T__SYSTEM_TURN = eINSTANCE.getDialogueStepT_SystemTurn();

		/**
		 * The meta object literal for the '<em><b>User Turn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALOGUE_STEP_T__USER_TURN = eINSTANCE.getDialogueStepT_UserTurn();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.DocumentRootImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Avm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AVM = eINSTANCE.getDocumentRoot_Avm();

		/**
		 * The meta object literal for the '<em><b>Cooperativity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COOPERATIVITY = eINSTANCE.getDocumentRoot_Cooperativity();

		/**
		 * The meta object literal for the '<em><b>Dialogue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIALOGUE = eINSTANCE.getDocumentRoot_Dialogue();

		/**
		 * The meta object literal for the '<em><b>Gui Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GUI_INPUT = eINSTANCE.getDocumentRoot_GuiInput();

		/**
		 * The meta object literal for the '<em><b>Modality Appropriateness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODALITY_APPROPRIATENESS = eINSTANCE.getDocumentRoot_ModalityAppropriateness();

		/**
		 * The meta object literal for the '<em><b>Modality Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODALITY_CHANGE = eINSTANCE.getDocumentRoot_ModalityChange();

		/**
		 * The meta object literal for the '<em><b>Modality Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODALITY_INFO = eINSTANCE.getDocumentRoot_ModalityInfo();

		/**
		 * The meta object literal for the '<em><b>Modality Synchroni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODALITY_SYNCHRONI = eINSTANCE.getDocumentRoot_ModalitySynchroni();

		/**
		 * The meta object literal for the '<em><b>Speech Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPEECH_INPUT = eINSTANCE.getDocumentRoot_SpeechInput();

		/**
		 * The meta object literal for the '<em><b>Speech Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPEECH_OUTPUT = eINSTANCE.getDocumentRoot_SpeechOutput();

		/**
		 * The meta object literal for the '<em><b>System Metacomm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYSTEM_METACOMM = eINSTANCE.getDocumentRoot_SystemMetacomm();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TASK = eINSTANCE.getDocumentRoot_Task();

		/**
		 * The meta object literal for the '<em><b>Turn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TURN = eINSTANCE.getDocumentRoot_Turn();

		/**
		 * The meta object literal for the '<em><b>User Metacomm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__USER_METACOMM = eINSTANCE.getDocumentRoot_UserMetacomm();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.GuiInputImpl <em>Gui Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.GuiInputImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getGuiInput()
		 * @generated
		 */
		EClass GUI_INPUT = eINSTANCE.getGuiInput();

		/**
		 * The meta object literal for the '<em><b>Text Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__TEXT_ELEMENTS = eINSTANCE.getGuiInput_TextElements();

		/**
		 * The meta object literal for the '<em><b>Navigation Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__NAVIGATION_ACTIONS = eINSTANCE.getGuiInput_NavigationActions();

		/**
		 * The meta object literal for the '<em><b>Navigation Moves</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__NAVIGATION_MOVES = eINSTANCE.getGuiInput_NavigationMoves();

		/**
		 * The meta object literal for the '<em><b>Navigation Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__NAVIGATION_LENGTH = eINSTANCE.getGuiInput_NavigationLength();

		/**
		 * The meta object literal for the '<em><b>Exploring Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__EXPLORING_ACTIONS = eINSTANCE.getGuiInput_ExploringActions();

		/**
		 * The meta object literal for the '<em><b>Transferring Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUI_INPUT__TRANSFERRING_ACTIONS = eINSTANCE.getGuiInput_TransferringActions();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.MetacommImpl <em>Metacomm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.MetacommImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getMetacomm()
		 * @generated
		 */
		EClass METACOMM = eINSTANCE.getMetacomm();

		/**
		 * The meta object literal for the '<em><b>Is Help</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METACOMM__IS_HELP = eINSTANCE.getMetacomm_IsHelp();

		/**
		 * The meta object literal for the '<em><b>Is Correction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METACOMM__IS_CORRECTION = eINSTANCE.getMetacomm_IsCorrection();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.ModalityAppropriatenessImpl <em>Modality Appropriateness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.ModalityAppropriatenessImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getModalityAppropriateness()
		 * @generated
		 */
		EClass MODALITY_APPROPRIATENESS = eINSTANCE.getModalityAppropriateness();

		/**
		 * The meta object literal for the '<em><b>Appropriateness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_APPROPRIATENESS__APPROPRIATENESS = eINSTANCE.getModalityAppropriateness_Appropriateness();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.ModalityChangeImpl <em>Modality Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.ModalityChangeImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getModalityChange()
		 * @generated
		 */
		EClass MODALITY_CHANGE = eINSTANCE.getModalityChange();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_CHANGE__ORIGIN = eINSTANCE.getModalityChange_Origin();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_CHANGE__REASON = eINSTANCE.getModalityChange_Reason();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.ModalityInfoImpl <em>Modality Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.ModalityInfoImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getModalityInfo()
		 * @generated
		 */
		EClass MODALITY_INFO = eINSTANCE.getModalityInfo();

		/**
		 * The meta object literal for the '<em><b>Modality Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_INFO__MODALITY_TYPE = eINSTANCE.getModalityInfo_ModalityType();

		/**
		 * The meta object literal for the '<em><b>Mmi Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_INFO__MMI_TYPE = eINSTANCE.getModalityInfo_MmiType();

		/**
		 * The meta object literal for the '<em><b>Appropriateness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY_INFO__APPROPRIATENESS = eINSTANCE.getModalityInfo_Appropriateness();

		/**
		 * The meta object literal for the '<em><b>Synchroni</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY_INFO__SYNCHRONI = eINSTANCE.getModalityInfo_Synchroni();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODALITY_INFO__CHANGE = eINSTANCE.getModalityInfo_Change();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.ModalitySynchroniImpl <em>Modality Synchroni</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.ModalitySynchroniImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getModalitySynchroni()
		 * @generated
		 */
		EClass MODALITY_SYNCHRONI = eINSTANCE.getModalitySynchroni();

		/**
		 * The meta object literal for the '<em><b>Nlags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_SYNCHRONI__NLAGS = eINSTANCE.getModalitySynchroni_Nlags();

		/**
		 * The meta object literal for the '<em><b>Lagtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_SYNCHRONI__LAGTIME = eINSTANCE.getModalitySynchroni_Lagtime();

		/**
		 * The meta object literal for the '<em><b>Nevents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODALITY_SYNCHRONI__NEVENTS = eINSTANCE.getModalitySynchroni_Nevents();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.SpeechInputImpl <em>Speech Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.SpeechInputImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getSpeechInput()
		 * @generated
		 */
		EClass SPEECH_INPUT = eINSTANCE.getSpeechInput();

		/**
		 * The meta object literal for the '<em><b>Overall Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__OVERALL_WORDS = eINSTANCE.getSpeechInput_OverallWords();

		/**
		 * The meta object literal for the '<em><b>Substituted Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__SUBSTITUTED_WORDS = eINSTANCE.getSpeechInput_SubstitutedWords();

		/**
		 * The meta object literal for the '<em><b>Deleted Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__DELETED_WORDS = eINSTANCE.getSpeechInput_DeletedWords();

		/**
		 * The meta object literal for the '<em><b>Inserted Words</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__INSERTED_WORDS = eINSTANCE.getSpeechInput_InsertedWords();

		/**
		 * The meta object literal for the '<em><b>Overall Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__OVERALL_SENTENCES = eINSTANCE.getSpeechInput_OverallSentences();

		/**
		 * The meta object literal for the '<em><b>Substituted Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__SUBSTITUTED_SENTENCES = eINSTANCE.getSpeechInput_SubstitutedSentences();

		/**
		 * The meta object literal for the '<em><b>Deleted Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__DELETED_SENTENCES = eINSTANCE.getSpeechInput_DeletedSentences();

		/**
		 * The meta object literal for the '<em><b>Inserted Sentences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__INSERTED_SENTENCES = eINSTANCE.getSpeechInput_InsertedSentences();

		/**
		 * The meta object literal for the '<em><b>Overall Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__OVERALL_CONCEPTS = eINSTANCE.getSpeechInput_OverallConcepts();

		/**
		 * The meta object literal for the '<em><b>Substituted Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__SUBSTITUTED_CONCEPTS = eINSTANCE.getSpeechInput_SubstitutedConcepts();

		/**
		 * The meta object literal for the '<em><b>Deleted Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__DELETED_CONCEPTS = eINSTANCE.getSpeechInput_DeletedConcepts();

		/**
		 * The meta object literal for the '<em><b>Inserted Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__INSERTED_CONCEPTS = eINSTANCE.getSpeechInput_InsertedConcepts();

		/**
		 * The meta object literal for the '<em><b>Parsing Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_INPUT__PARSING_RESULT = eINSTANCE.getSpeechInput_ParsingResult();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.SpeechOutputImpl <em>Speech Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.SpeechOutputImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getSpeechOutput()
		 * @generated
		 */
		EClass SPEECH_OUTPUT = eINSTANCE.getSpeechOutput();

		/**
		 * The meta object literal for the '<em><b>ANCO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANCO = eINSTANCE.getSpeechOutput_ANCO();

		/**
		 * The meta object literal for the '<em><b>ANIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANIN = eINSTANCE.getSpeechOutput_ANIN();

		/**
		 * The meta object literal for the '<em><b>ANPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANPA = eINSTANCE.getSpeechOutput_ANPA();

		/**
		 * The meta object literal for the '<em><b>ANFA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__ANFA = eINSTANCE.getSpeechOutput_ANFA();

		/**
		 * The meta object literal for the '<em><b>Prompt Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEECH_OUTPUT__PROMPT_TYPE = eINSTANCE.getSpeechOutput_PromptType();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.SystemMetacommImpl <em>System Metacomm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.SystemMetacommImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getSystemMetacomm()
		 * @generated
		 */
		EClass SYSTEM_METACOMM = eINSTANCE.getSystemMetacomm();

		/**
		 * The meta object literal for the '<em><b>Is ASR Reject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_METACOMM__IS_ASR_REJECT = eINSTANCE.getSystemMetacomm_IsASRReject();

		/**
		 * The meta object literal for the '<em><b>Is DIV Reject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_METACOMM__IS_DIV_REJECT = eINSTANCE.getSystemMetacomm_IsDIVReject();

		/**
		 * The meta object literal for the '<em><b>Is GR Reject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_METACOMM__IS_GR_REJECT = eINSTANCE.getSystemMetacomm_IsGRReject();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.SystemTurnImpl <em>System Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.SystemTurnImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getSystemTurn()
		 * @generated
		 */
		EClass SYSTEM_TURN = eINSTANCE.getSystemTurn();

		/**
		 * The meta object literal for the '<em><b>Metacomm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TURN__METACOMM = eINSTANCE.getSystemTurn_Metacomm();

		/**
		 * The meta object literal for the '<em><b>Speech Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TURN__SPEECH_OUTPUT = eINSTANCE.getSystemTurn_SpeechOutput();

		/**
		 * The meta object literal for the '<em><b>Cooperativity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TURN__COOPERATIVITY = eINSTANCE.getSystemTurn_Cooperativity();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.TaskImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Success</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SUCCESS = eINSTANCE.getTask_Success();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__REASON = eINSTANCE.getTask_Reason();

		/**
		 * The meta object literal for the '<em><b>Avm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__AVM = eINSTANCE.getTask_Avm();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.TurnImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Feedback Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__FEEDBACK_DELAY = eINSTANCE.getTurn_FeedbackDelay();

		/**
		 * The meta object literal for the '<em><b>Feedback Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__FEEDBACK_DURATION = eINSTANCE.getTurn_FeedbackDuration();

		/**
		 * The meta object literal for the '<em><b>Action Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__ACTION_DURATION = eINSTANCE.getTurn_ActionDuration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__ELEMENTS = eINSTANCE.getTurn_Elements();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__FEEDBACK = eINSTANCE.getTurn_Feedback();

		/**
		 * The meta object literal for the '<em><b>Concepts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__CONCEPTS = eINSTANCE.getTurn_Concepts();

		/**
		 * The meta object literal for the '<em><b>Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__NOISE = eINSTANCE.getTurn_Noise();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__QUESTIONS = eINSTANCE.getTurn_Questions();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN__MODALITY = eINSTANCE.getTurn_Modality();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.UserMetacommImpl <em>User Metacomm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.UserMetacommImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getUserMetacomm()
		 * @generated
		 */
		EClass USER_METACOMM = eINSTANCE.getUserMetacomm();

		/**
		 * The meta object literal for the '<em><b>Is Time Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_TIME_OUT = eINSTANCE.getUserMetacomm_IsTimeOut();

		/**
		 * The meta object literal for the '<em><b>Is Cancel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_CANCEL = eINSTANCE.getUserMetacomm_IsCancel();

		/**
		 * The meta object literal for the '<em><b>Is Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_RESTART = eINSTANCE.getUserMetacomm_IsRestart();

		/**
		 * The meta object literal for the '<em><b>Is Bargein</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_BARGEIN = eINSTANCE.getUserMetacomm_IsBargein();

		/**
		 * The meta object literal for the '<em><b>Is Successful Bargein</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_METACOMM__IS_SUCCESSFUL_BARGEIN = eINSTANCE.getUserMetacomm_IsSuccessfulBargein();

		/**
		 * The meta object literal for the '{@link org.mmi.model.impl.UserTurnImpl <em>User Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.impl.UserTurnImpl
		 * @see org.mmi.model.impl.ModelPackageImpl#getUserTurn()
		 * @generated
		 */
		EClass USER_TURN = eINSTANCE.getUserTurn();

		/**
		 * The meta object literal for the '<em><b>Metacomm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__METACOMM = eINSTANCE.getUserTurn_Metacomm();

		/**
		 * The meta object literal for the '<em><b>Speech Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__SPEECH_INPUT = eINSTANCE.getUserTurn_SpeechInput();

		/**
		 * The meta object literal for the '<em><b>Gui Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_TURN__GUI_INPUT = eINSTANCE.getUserTurn_GuiInput();

		/**
		 * The meta object literal for the '{@link org.mmi.model.ContextualAppropriatenessT <em>Contextual Appropriateness T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ContextualAppropriatenessT
		 * @see org.mmi.model.impl.ModelPackageImpl#getContextualAppropriatenessT()
		 * @generated
		 */
		EEnum CONTEXTUAL_APPROPRIATENESS_T = eINSTANCE.getContextualAppropriatenessT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.McReasonT <em>Mc Reason T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.McReasonT
		 * @see org.mmi.model.impl.ModelPackageImpl#getMcReasonT()
		 * @generated
		 */
		EEnum MC_REASON_T = eINSTANCE.getMcReasonT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.MmiTypeT <em>Mmi Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.MmiTypeT
		 * @see org.mmi.model.impl.ModelPackageImpl#getMmiTypeT()
		 * @generated
		 */
		EEnum MMI_TYPE_T = eINSTANCE.getMmiTypeT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.ModAppropT <em>Mod Approp T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ModAppropT
		 * @see org.mmi.model.impl.ModelPackageImpl#getModAppropT()
		 * @generated
		 */
		EEnum MOD_APPROP_T = eINSTANCE.getModAppropT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.ModTypeT <em>Mod Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ModTypeT
		 * @see org.mmi.model.impl.ModelPackageImpl#getModTypeT()
		 * @generated
		 */
		EEnum MOD_TYPE_T = eINSTANCE.getModTypeT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.ParsingResultT <em>Parsing Result T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ParsingResultT
		 * @see org.mmi.model.impl.ModelPackageImpl#getParsingResultT()
		 * @generated
		 */
		EEnum PARSING_RESULT_T = eINSTANCE.getParsingResultT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.PromptTypeT <em>Prompt Type T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.PromptTypeT
		 * @see org.mmi.model.impl.ModelPackageImpl#getPromptTypeT()
		 * @generated
		 */
		EEnum PROMPT_TYPE_T = eINSTANCE.getPromptTypeT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.RoleT <em>Role T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.RoleT
		 * @see org.mmi.model.impl.ModelPackageImpl#getRoleT()
		 * @generated
		 */
		EEnum ROLE_T = eINSTANCE.getRoleT();

		/**
		 * The meta object literal for the '{@link org.mmi.model.TaskSuccessT <em>Task Success T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.TaskSuccessT
		 * @see org.mmi.model.impl.ModelPackageImpl#getTaskSuccessT()
		 * @generated
		 */
		EEnum TASK_SUCCESS_T = eINSTANCE.getTaskSuccessT();

		/**
		 * The meta object literal for the '<em>Contextual Appropriateness TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ContextualAppropriatenessT
		 * @see org.mmi.model.impl.ModelPackageImpl#getContextualAppropriatenessTObject()
		 * @generated
		 */
		EDataType CONTEXTUAL_APPROPRIATENESS_TOBJECT = eINSTANCE.getContextualAppropriatenessTObject();

		/**
		 * The meta object literal for the '<em>Mc Reason TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.McReasonT
		 * @see org.mmi.model.impl.ModelPackageImpl#getMcReasonTObject()
		 * @generated
		 */
		EDataType MC_REASON_TOBJECT = eINSTANCE.getMcReasonTObject();

		/**
		 * The meta object literal for the '<em>Mmi Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.MmiTypeT
		 * @see org.mmi.model.impl.ModelPackageImpl#getMmiTypeTObject()
		 * @generated
		 */
		EDataType MMI_TYPE_TOBJECT = eINSTANCE.getMmiTypeTObject();

		/**
		 * The meta object literal for the '<em>Mod Approp TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ModAppropT
		 * @see org.mmi.model.impl.ModelPackageImpl#getModAppropTObject()
		 * @generated
		 */
		EDataType MOD_APPROP_TOBJECT = eINSTANCE.getModAppropTObject();

		/**
		 * The meta object literal for the '<em>Mod Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ModTypeT
		 * @see org.mmi.model.impl.ModelPackageImpl#getModTypeTObject()
		 * @generated
		 */
		EDataType MOD_TYPE_TOBJECT = eINSTANCE.getModTypeTObject();

		/**
		 * The meta object literal for the '<em>Parsing Result TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.ParsingResultT
		 * @see org.mmi.model.impl.ModelPackageImpl#getParsingResultTObject()
		 * @generated
		 */
		EDataType PARSING_RESULT_TOBJECT = eINSTANCE.getParsingResultTObject();

		/**
		 * The meta object literal for the '<em>Prompt Type TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.PromptTypeT
		 * @see org.mmi.model.impl.ModelPackageImpl#getPromptTypeTObject()
		 * @generated
		 */
		EDataType PROMPT_TYPE_TOBJECT = eINSTANCE.getPromptTypeTObject();

		/**
		 * The meta object literal for the '<em>Role TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.RoleT
		 * @see org.mmi.model.impl.ModelPackageImpl#getRoleTObject()
		 * @generated
		 */
		EDataType ROLE_TOBJECT = eINSTANCE.getRoleTObject();

		/**
		 * The meta object literal for the '<em>Task Success TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mmi.model.TaskSuccessT
		 * @see org.mmi.model.impl.ModelPackageImpl#getTaskSuccessTObject()
		 * @generated
		 */
		EDataType TASK_SUCCESS_TOBJECT = eINSTANCE.getTaskSuccessTObject();

	}

} //ModelPackage
