/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mmi.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory("org/mmiModel"); 
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.AVM: return createAvm();
			case ModelPackage.COOPERATIVITY: return createCooperativity();
			case ModelPackage.DIALOGUE: return createDialogue();
			case ModelPackage.DIALOGUE_STEP_T: return createDialogueStepT();
			case ModelPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ModelPackage.GUI_INPUT: return createGuiInput();
			case ModelPackage.MODALITY_APPROPRIATENESS: return createModalityAppropriateness();
			case ModelPackage.MODALITY_CHANGE: return createModalityChange();
			case ModelPackage.MODALITY_INFO: return createModalityInfo();
			case ModelPackage.MODALITY_SYNCHRONI: return createModalitySynchroni();
			case ModelPackage.SPEECH_INPUT: return createSpeechInput();
			case ModelPackage.SPEECH_OUTPUT: return createSpeechOutput();
			case ModelPackage.SYSTEM_METACOMM: return createSystemMetacomm();
			case ModelPackage.SYSTEM_TURN: return createSystemTurn();
			case ModelPackage.TASK: return createTask();
			case ModelPackage.USER_METACOMM: return createUserMetacomm();
			case ModelPackage.USER_TURN: return createUserTurn();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.CONTEXTUAL_APPROPRIATENESS_T:
				return createContextualAppropriatenessTFromString(eDataType, initialValue);
			case ModelPackage.MC_REASON_T:
				return createMcReasonTFromString(eDataType, initialValue);
			case ModelPackage.MMI_TYPE_T:
				return createMmiTypeTFromString(eDataType, initialValue);
			case ModelPackage.MOD_APPROP_T:
				return createModAppropTFromString(eDataType, initialValue);
			case ModelPackage.MOD_TYPE_T:
				return createModTypeTFromString(eDataType, initialValue);
			case ModelPackage.PARSING_RESULT_T:
				return createParsingResultTFromString(eDataType, initialValue);
			case ModelPackage.PROMPT_TYPE_T:
				return createPromptTypeTFromString(eDataType, initialValue);
			case ModelPackage.ROLE_T:
				return createRoleTFromString(eDataType, initialValue);
			case ModelPackage.TASK_SUCCESS_T:
				return createTaskSuccessTFromString(eDataType, initialValue);
			case ModelPackage.CONTEXTUAL_APPROPRIATENESS_TOBJECT:
				return createContextualAppropriatenessTObjectFromString(eDataType, initialValue);
			case ModelPackage.MC_REASON_TOBJECT:
				return createMcReasonTObjectFromString(eDataType, initialValue);
			case ModelPackage.MMI_TYPE_TOBJECT:
				return createMmiTypeTObjectFromString(eDataType, initialValue);
			case ModelPackage.MOD_APPROP_TOBJECT:
				return createModAppropTObjectFromString(eDataType, initialValue);
			case ModelPackage.MOD_TYPE_TOBJECT:
				return createModTypeTObjectFromString(eDataType, initialValue);
			case ModelPackage.PARSING_RESULT_TOBJECT:
				return createParsingResultTObjectFromString(eDataType, initialValue);
			case ModelPackage.PROMPT_TYPE_TOBJECT:
				return createPromptTypeTObjectFromString(eDataType, initialValue);
			case ModelPackage.ROLE_TOBJECT:
				return createRoleTObjectFromString(eDataType, initialValue);
			case ModelPackage.TASK_SUCCESS_TOBJECT:
				return createTaskSuccessTObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ModelPackage.CONTEXTUAL_APPROPRIATENESS_T:
				return convertContextualAppropriatenessTToString(eDataType, instanceValue);
			case ModelPackage.MC_REASON_T:
				return convertMcReasonTToString(eDataType, instanceValue);
			case ModelPackage.MMI_TYPE_T:
				return convertMmiTypeTToString(eDataType, instanceValue);
			case ModelPackage.MOD_APPROP_T:
				return convertModAppropTToString(eDataType, instanceValue);
			case ModelPackage.MOD_TYPE_T:
				return convertModTypeTToString(eDataType, instanceValue);
			case ModelPackage.PARSING_RESULT_T:
				return convertParsingResultTToString(eDataType, instanceValue);
			case ModelPackage.PROMPT_TYPE_T:
				return convertPromptTypeTToString(eDataType, instanceValue);
			case ModelPackage.ROLE_T:
				return convertRoleTToString(eDataType, instanceValue);
			case ModelPackage.TASK_SUCCESS_T:
				return convertTaskSuccessTToString(eDataType, instanceValue);
			case ModelPackage.CONTEXTUAL_APPROPRIATENESS_TOBJECT:
				return convertContextualAppropriatenessTObjectToString(eDataType, instanceValue);
			case ModelPackage.MC_REASON_TOBJECT:
				return convertMcReasonTObjectToString(eDataType, instanceValue);
			case ModelPackage.MMI_TYPE_TOBJECT:
				return convertMmiTypeTObjectToString(eDataType, instanceValue);
			case ModelPackage.MOD_APPROP_TOBJECT:
				return convertModAppropTObjectToString(eDataType, instanceValue);
			case ModelPackage.MOD_TYPE_TOBJECT:
				return convertModTypeTObjectToString(eDataType, instanceValue);
			case ModelPackage.PARSING_RESULT_TOBJECT:
				return convertParsingResultTObjectToString(eDataType, instanceValue);
			case ModelPackage.PROMPT_TYPE_TOBJECT:
				return convertPromptTypeTObjectToString(eDataType, instanceValue);
			case ModelPackage.ROLE_TOBJECT:
				return convertRoleTObjectToString(eDataType, instanceValue);
			case ModelPackage.TASK_SUCCESS_TOBJECT:
				return convertTaskSuccessTObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avm createAvm() {
		AvmImpl avm = new AvmImpl();
		return avm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooperativity createCooperativity() {
		CooperativityImpl cooperativity = new CooperativityImpl();
		return cooperativity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue createDialogue() {
		DialogueImpl dialogue = new DialogueImpl();
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DialogueStepT createDialogueStepT() {
		DialogueStepTImpl dialogueStepT = new DialogueStepTImpl();
		return dialogueStepT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiInput createGuiInput() {
		GuiInputImpl guiInput = new GuiInputImpl();
		return guiInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityAppropriateness createModalityAppropriateness() {
		ModalityAppropriatenessImpl modalityAppropriateness = new ModalityAppropriatenessImpl();
		return modalityAppropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityChange createModalityChange() {
		ModalityChangeImpl modalityChange = new ModalityChangeImpl();
		return modalityChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityInfo createModalityInfo() {
		ModalityInfoImpl modalityInfo = new ModalityInfoImpl();
		return modalityInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalitySynchroni createModalitySynchroni() {
		ModalitySynchroniImpl modalitySynchroni = new ModalitySynchroniImpl();
		return modalitySynchroni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechInput createSpeechInput() {
		SpeechInputImpl speechInput = new SpeechInputImpl();
		return speechInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechOutput createSpeechOutput() {
		SpeechOutputImpl speechOutput = new SpeechOutputImpl();
		return speechOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetacomm createSystemMetacomm() {
		SystemMetacommImpl systemMetacomm = new SystemMetacommImpl();
		return systemMetacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTurn createSystemTurn() {
		SystemTurnImpl systemTurn = new SystemTurnImpl();
		return systemTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMetacomm createUserMetacomm() {
		UserMetacommImpl userMetacomm = new UserMetacommImpl();
		return userMetacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTurn createUserTurn() {
		UserTurnImpl userTurn = new UserTurnImpl();
		return userTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualAppropriatenessT createContextualAppropriatenessTFromString(EDataType eDataType, String initialValue) {
		ContextualAppropriatenessT result = ContextualAppropriatenessT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualAppropriatenessTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McReasonT createMcReasonTFromString(EDataType eDataType, String initialValue) {
		McReasonT result = McReasonT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMcReasonTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmiTypeT createMmiTypeTFromString(EDataType eDataType, String initialValue) {
		MmiTypeT result = MmiTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMmiTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModAppropT createModAppropTFromString(EDataType eDataType, String initialValue) {
		ModAppropT result = ModAppropT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModAppropTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModTypeT createModTypeTFromString(EDataType eDataType, String initialValue) {
		ModTypeT result = ModTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResultT createParsingResultTFromString(EDataType eDataType, String initialValue) {
		ParsingResultT result = ParsingResultT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParsingResultTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromptTypeT createPromptTypeTFromString(EDataType eDataType, String initialValue) {
		PromptTypeT result = PromptTypeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPromptTypeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleT createRoleTFromString(EDataType eDataType, String initialValue) {
		RoleT result = RoleT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessT createTaskSuccessTFromString(EDataType eDataType, String initialValue) {
		TaskSuccessT result = TaskSuccessT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSuccessTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualAppropriatenessT createContextualAppropriatenessTObjectFromString(EDataType eDataType, String initialValue) {
		return createContextualAppropriatenessTFromString(ModelPackage.Literals.CONTEXTUAL_APPROPRIATENESS_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContextualAppropriatenessTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContextualAppropriatenessTToString(ModelPackage.Literals.CONTEXTUAL_APPROPRIATENESS_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McReasonT createMcReasonTObjectFromString(EDataType eDataType, String initialValue) {
		return createMcReasonTFromString(ModelPackage.Literals.MC_REASON_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMcReasonTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMcReasonTToString(ModelPackage.Literals.MC_REASON_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmiTypeT createMmiTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createMmiTypeTFromString(ModelPackage.Literals.MMI_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMmiTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMmiTypeTToString(ModelPackage.Literals.MMI_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModAppropT createModAppropTObjectFromString(EDataType eDataType, String initialValue) {
		return createModAppropTFromString(ModelPackage.Literals.MOD_APPROP_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModAppropTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModAppropTToString(ModelPackage.Literals.MOD_APPROP_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModTypeT createModTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createModTypeTFromString(ModelPackage.Literals.MOD_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModTypeTToString(ModelPackage.Literals.MOD_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResultT createParsingResultTObjectFromString(EDataType eDataType, String initialValue) {
		return createParsingResultTFromString(ModelPackage.Literals.PARSING_RESULT_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParsingResultTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertParsingResultTToString(ModelPackage.Literals.PARSING_RESULT_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromptTypeT createPromptTypeTObjectFromString(EDataType eDataType, String initialValue) {
		return createPromptTypeTFromString(ModelPackage.Literals.PROMPT_TYPE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPromptTypeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPromptTypeTToString(ModelPackage.Literals.PROMPT_TYPE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleT createRoleTObjectFromString(EDataType eDataType, String initialValue) {
		return createRoleTFromString(ModelPackage.Literals.ROLE_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRoleTToString(ModelPackage.Literals.ROLE_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessT createTaskSuccessTObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskSuccessTFromString(ModelPackage.Literals.TASK_SUCCESS_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskSuccessTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskSuccessTToString(ModelPackage.Literals.TASK_SUCCESS_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
