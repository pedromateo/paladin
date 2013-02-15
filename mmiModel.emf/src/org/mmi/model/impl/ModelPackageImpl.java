/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mmi.model.Avm;
import org.mmi.model.ContextualAppropriatenessT;
import org.mmi.model.Cooperativity;
import org.mmi.model.Dialogue;
import org.mmi.model.DialogueStepT;
import org.mmi.model.DocumentRoot;
import org.mmi.model.GuiInput;
import org.mmi.model.McReasonT;
import org.mmi.model.Metacomm;
import org.mmi.model.MmiTypeT;
import org.mmi.model.ModAppropT;
import org.mmi.model.ModTypeT;
import org.mmi.model.ModalityAppropriateness;
import org.mmi.model.ModalityChange;
import org.mmi.model.ModalityInfo;
import org.mmi.model.ModalitySynchroni;
import org.mmi.model.ModelFactory;
import org.mmi.model.ModelPackage;
import org.mmi.model.ParsingResultT;
import org.mmi.model.PromptTypeT;
import org.mmi.model.RoleT;
import org.mmi.model.SpeechInput;
import org.mmi.model.SpeechOutput;
import org.mmi.model.SystemMetacomm;
import org.mmi.model.SystemTurn;
import org.mmi.model.Task;
import org.mmi.model.TaskSuccessT;
import org.mmi.model.Turn;
import org.mmi.model.UserMetacomm;
import org.mmi.model.UserTurn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooperativityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialogueStepTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guiInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metacommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityAppropriatenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalitySynchroniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speechOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemMetacommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTurnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userMetacommEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTurnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextualAppropriatenessTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mcReasonTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mmiTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modAppropTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parsingResultTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum promptTypeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskSuccessTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contextualAppropriatenessTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mcReasonTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mmiTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modAppropTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType parsingResultTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType promptTypeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType roleTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskSuccessTObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mmi.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvm() {
		return avmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooperativity() {
		return cooperativityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCooperativity_ContextualAppropriateness() {
		return (EAttribute)cooperativityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogue() {
		return dialogueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogue_Description() {
		return (EAttribute)dialogueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDialogue_BaseTimestamp() {
		return (EAttribute)dialogueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogue_Task() {
		return (EReference)dialogueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogue_Step() {
		return (EReference)dialogueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialogueStepT() {
		return dialogueStepTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogueStepT_SystemTurn() {
		return (EReference)dialogueStepTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialogueStepT_UserTurn() {
		return (EReference)dialogueStepTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Avm() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cooperativity() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dialogue() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GuiInput() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModalityAppropriateness() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModalityChange() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModalityInfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModalitySynchroni() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpeechInput() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpeechOutput() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemMetacomm() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Task() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Turn() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UserMetacomm() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuiInput() {
		return guiInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_TextElements() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_NavigationActions() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_NavigationMoves() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_NavigationLength() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_ExploringActions() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuiInput_TransferringActions() {
		return (EAttribute)guiInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetacomm() {
		return metacommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetacomm_IsHelp() {
		return (EAttribute)metacommEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetacomm_IsCorrection() {
		return (EAttribute)metacommEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalityAppropriateness() {
		return modalityAppropriatenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityAppropriateness_Appropriateness() {
		return (EAttribute)modalityAppropriatenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalityChange() {
		return modalityChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityChange_Origin() {
		return (EAttribute)modalityChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityChange_Reason() {
		return (EAttribute)modalityChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalityInfo() {
		return modalityInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityInfo_ModalityType() {
		return (EAttribute)modalityInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalityInfo_MmiType() {
		return (EAttribute)modalityInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalityInfo_Appropriateness() {
		return (EReference)modalityInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalityInfo_Synchroni() {
		return (EReference)modalityInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModalityInfo_Change() {
		return (EReference)modalityInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModalitySynchroni() {
		return modalitySynchroniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalitySynchroni_Nlags() {
		return (EAttribute)modalitySynchroniEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalitySynchroni_Lagtime() {
		return (EAttribute)modalitySynchroniEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModalitySynchroni_Nevents() {
		return (EAttribute)modalitySynchroniEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechInput() {
		return speechInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_OverallWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_SubstitutedWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_DeletedWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_InsertedWords() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_OverallSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_SubstitutedSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_DeletedSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_InsertedSentences() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_OverallConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_SubstitutedConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_DeletedConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_InsertedConcepts() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechInput_ParsingResult() {
		return (EAttribute)speechInputEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeechOutput() {
		return speechOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANCO() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANIN() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANPA() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_ANFA() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeechOutput_PromptType() {
		return (EAttribute)speechOutputEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemMetacomm() {
		return systemMetacommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemMetacomm_IsASRReject() {
		return (EAttribute)systemMetacommEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemMetacomm_IsDIVReject() {
		return (EAttribute)systemMetacommEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemMetacomm_IsGRReject() {
		return (EAttribute)systemMetacommEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemTurn() {
		return systemTurnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTurn_Metacomm() {
		return (EReference)systemTurnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTurn_SpeechOutput() {
		return (EReference)systemTurnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemTurn_Cooperativity() {
		return (EReference)systemTurnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Success() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Reason() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Avm() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_FeedbackDelay() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_FeedbackDuration() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_ActionDuration() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Elements() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Feedback() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Concepts() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Noise() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Questions() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurn_Modality() {
		return (EReference)turnEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserMetacomm() {
		return userMetacommEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsTimeOut() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsCancel() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsRestart() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsBargein() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserMetacomm_IsSuccessfulBargein() {
		return (EAttribute)userMetacommEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTurn() {
		return userTurnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_Metacomm() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_SpeechInput() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTurn_GuiInput() {
		return (EReference)userTurnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContextualAppropriatenessT() {
		return contextualAppropriatenessTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMcReasonT() {
		return mcReasonTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMmiTypeT() {
		return mmiTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModAppropT() {
		return modAppropTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModTypeT() {
		return modTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParsingResultT() {
		return parsingResultTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPromptTypeT() {
		return promptTypeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRoleT() {
		return roleTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaskSuccessT() {
		return taskSuccessTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContextualAppropriatenessTObject() {
		return contextualAppropriatenessTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMcReasonTObject() {
		return mcReasonTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMmiTypeTObject() {
		return mmiTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModAppropTObject() {
		return modAppropTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModTypeTObject() {
		return modTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParsingResultTObject() {
		return parsingResultTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPromptTypeTObject() {
		return promptTypeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoleTObject() {
		return roleTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTaskSuccessTObject() {
		return taskSuccessTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		avmEClass = createEClass(AVM);

		cooperativityEClass = createEClass(COOPERATIVITY);
		createEAttribute(cooperativityEClass, COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS);

		dialogueEClass = createEClass(DIALOGUE);
		createEAttribute(dialogueEClass, DIALOGUE__DESCRIPTION);
		createEAttribute(dialogueEClass, DIALOGUE__BASE_TIMESTAMP);
		createEReference(dialogueEClass, DIALOGUE__TASK);
		createEReference(dialogueEClass, DIALOGUE__STEP);

		dialogueStepTEClass = createEClass(DIALOGUE_STEP_T);
		createEReference(dialogueStepTEClass, DIALOGUE_STEP_T__SYSTEM_TURN);
		createEReference(dialogueStepTEClass, DIALOGUE_STEP_T__USER_TURN);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AVM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COOPERATIVITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIALOGUE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GUI_INPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODALITY_APPROPRIATENESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODALITY_CHANGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODALITY_INFO);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODALITY_SYNCHRONI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPEECH_INPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPEECH_OUTPUT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM_METACOMM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TASK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TURN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__USER_METACOMM);

		guiInputEClass = createEClass(GUI_INPUT);
		createEAttribute(guiInputEClass, GUI_INPUT__TEXT_ELEMENTS);
		createEAttribute(guiInputEClass, GUI_INPUT__NAVIGATION_ACTIONS);
		createEAttribute(guiInputEClass, GUI_INPUT__NAVIGATION_MOVES);
		createEAttribute(guiInputEClass, GUI_INPUT__NAVIGATION_LENGTH);
		createEAttribute(guiInputEClass, GUI_INPUT__EXPLORING_ACTIONS);
		createEAttribute(guiInputEClass, GUI_INPUT__TRANSFERRING_ACTIONS);

		metacommEClass = createEClass(METACOMM);
		createEAttribute(metacommEClass, METACOMM__IS_HELP);
		createEAttribute(metacommEClass, METACOMM__IS_CORRECTION);

		modalityAppropriatenessEClass = createEClass(MODALITY_APPROPRIATENESS);
		createEAttribute(modalityAppropriatenessEClass, MODALITY_APPROPRIATENESS__APPROPRIATENESS);

		modalityChangeEClass = createEClass(MODALITY_CHANGE);
		createEAttribute(modalityChangeEClass, MODALITY_CHANGE__ORIGIN);
		createEAttribute(modalityChangeEClass, MODALITY_CHANGE__REASON);

		modalityInfoEClass = createEClass(MODALITY_INFO);
		createEAttribute(modalityInfoEClass, MODALITY_INFO__MODALITY_TYPE);
		createEAttribute(modalityInfoEClass, MODALITY_INFO__MMI_TYPE);
		createEReference(modalityInfoEClass, MODALITY_INFO__APPROPRIATENESS);
		createEReference(modalityInfoEClass, MODALITY_INFO__SYNCHRONI);
		createEReference(modalityInfoEClass, MODALITY_INFO__CHANGE);

		modalitySynchroniEClass = createEClass(MODALITY_SYNCHRONI);
		createEAttribute(modalitySynchroniEClass, MODALITY_SYNCHRONI__NLAGS);
		createEAttribute(modalitySynchroniEClass, MODALITY_SYNCHRONI__LAGTIME);
		createEAttribute(modalitySynchroniEClass, MODALITY_SYNCHRONI__NEVENTS);

		speechInputEClass = createEClass(SPEECH_INPUT);
		createEAttribute(speechInputEClass, SPEECH_INPUT__OVERALL_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__SUBSTITUTED_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__DELETED_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__INSERTED_WORDS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__OVERALL_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__SUBSTITUTED_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__DELETED_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__INSERTED_SENTENCES);
		createEAttribute(speechInputEClass, SPEECH_INPUT__OVERALL_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__SUBSTITUTED_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__DELETED_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__INSERTED_CONCEPTS);
		createEAttribute(speechInputEClass, SPEECH_INPUT__PARSING_RESULT);

		speechOutputEClass = createEClass(SPEECH_OUTPUT);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANCO);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANIN);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANPA);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__ANFA);
		createEAttribute(speechOutputEClass, SPEECH_OUTPUT__PROMPT_TYPE);

		systemMetacommEClass = createEClass(SYSTEM_METACOMM);
		createEAttribute(systemMetacommEClass, SYSTEM_METACOMM__IS_ASR_REJECT);
		createEAttribute(systemMetacommEClass, SYSTEM_METACOMM__IS_DIV_REJECT);
		createEAttribute(systemMetacommEClass, SYSTEM_METACOMM__IS_GR_REJECT);

		systemTurnEClass = createEClass(SYSTEM_TURN);
		createEReference(systemTurnEClass, SYSTEM_TURN__METACOMM);
		createEReference(systemTurnEClass, SYSTEM_TURN__SPEECH_OUTPUT);
		createEReference(systemTurnEClass, SYSTEM_TURN__COOPERATIVITY);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__SUCCESS);
		createEAttribute(taskEClass, TASK__REASON);
		createEReference(taskEClass, TASK__AVM);

		turnEClass = createEClass(TURN);
		createEAttribute(turnEClass, TURN__FEEDBACK_DELAY);
		createEAttribute(turnEClass, TURN__FEEDBACK_DURATION);
		createEAttribute(turnEClass, TURN__ACTION_DURATION);
		createEAttribute(turnEClass, TURN__ELEMENTS);
		createEAttribute(turnEClass, TURN__FEEDBACK);
		createEAttribute(turnEClass, TURN__CONCEPTS);
		createEAttribute(turnEClass, TURN__NOISE);
		createEAttribute(turnEClass, TURN__QUESTIONS);
		createEReference(turnEClass, TURN__MODALITY);

		userMetacommEClass = createEClass(USER_METACOMM);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_TIME_OUT);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_CANCEL);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_RESTART);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_BARGEIN);
		createEAttribute(userMetacommEClass, USER_METACOMM__IS_SUCCESSFUL_BARGEIN);

		userTurnEClass = createEClass(USER_TURN);
		createEReference(userTurnEClass, USER_TURN__METACOMM);
		createEReference(userTurnEClass, USER_TURN__SPEECH_INPUT);
		createEReference(userTurnEClass, USER_TURN__GUI_INPUT);

		// Create enums
		contextualAppropriatenessTEEnum = createEEnum(CONTEXTUAL_APPROPRIATENESS_T);
		mcReasonTEEnum = createEEnum(MC_REASON_T);
		mmiTypeTEEnum = createEEnum(MMI_TYPE_T);
		modAppropTEEnum = createEEnum(MOD_APPROP_T);
		modTypeTEEnum = createEEnum(MOD_TYPE_T);
		parsingResultTEEnum = createEEnum(PARSING_RESULT_T);
		promptTypeTEEnum = createEEnum(PROMPT_TYPE_T);
		roleTEEnum = createEEnum(ROLE_T);
		taskSuccessTEEnum = createEEnum(TASK_SUCCESS_T);

		// Create data types
		contextualAppropriatenessTObjectEDataType = createEDataType(CONTEXTUAL_APPROPRIATENESS_TOBJECT);
		mcReasonTObjectEDataType = createEDataType(MC_REASON_TOBJECT);
		mmiTypeTObjectEDataType = createEDataType(MMI_TYPE_TOBJECT);
		modAppropTObjectEDataType = createEDataType(MOD_APPROP_TOBJECT);
		modTypeTObjectEDataType = createEDataType(MOD_TYPE_TOBJECT);
		parsingResultTObjectEDataType = createEDataType(PARSING_RESULT_TOBJECT);
		promptTypeTObjectEDataType = createEDataType(PROMPT_TYPE_TOBJECT);
		roleTObjectEDataType = createEDataType(ROLE_TOBJECT);
		taskSuccessTObjectEDataType = createEDataType(TASK_SUCCESS_TOBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemMetacommEClass.getESuperTypes().add(this.getMetacomm());
		systemTurnEClass.getESuperTypes().add(this.getTurn());
		userMetacommEClass.getESuperTypes().add(this.getMetacomm());
		userTurnEClass.getESuperTypes().add(this.getTurn());

		// Initialize classes and features; add operations and parameters
		initEClass(avmEClass, Avm.class, "Avm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cooperativityEClass, Cooperativity.class, "Cooperativity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCooperativity_ContextualAppropriateness(), this.getContextualAppropriatenessT(), "contextualAppropriateness", null, 1, 1, Cooperativity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogueEClass, Dialogue.class, "Dialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDialogue_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDialogue_BaseTimestamp(), theXMLTypePackage.getLong(), "baseTimestamp", null, 1, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogue_Task(), this.getTask(), null, "task", null, 0, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogue_Step(), this.getDialogueStepT(), null, "step", null, 0, -1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dialogueStepTEClass, DialogueStepT.class, "DialogueStepT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialogueStepT_SystemTurn(), this.getSystemTurn(), null, "systemTurn", null, 1, 1, DialogueStepT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDialogueStepT_UserTurn(), this.getUserTurn(), null, "userTurn", null, 1, 1, DialogueStepT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Avm(), this.getAvm(), null, "avm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cooperativity(), this.getCooperativity(), null, "cooperativity", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dialogue(), this.getDialogue(), null, "dialogue", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GuiInput(), this.getGuiInput(), null, "guiInput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModalityAppropriateness(), this.getModalityAppropriateness(), null, "modalityAppropriateness", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModalityChange(), this.getModalityChange(), null, "modalityChange", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModalityInfo(), this.getModalityInfo(), null, "modalityInfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ModalitySynchroni(), this.getModalitySynchroni(), null, "modalitySynchroni", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpeechInput(), this.getSpeechInput(), null, "speechInput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SpeechOutput(), this.getSpeechOutput(), null, "speechOutput", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SystemMetacomm(), this.getSystemMetacomm(), null, "systemMetacomm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Task(), this.getTask(), null, "task", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Turn(), this.getTurn(), null, "turn", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UserMetacomm(), this.getUserMetacomm(), null, "userMetacomm", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(guiInputEClass, GuiInput.class, "GuiInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuiInput_TextElements(), theXMLTypePackage.getLong(), "textElements", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_NavigationActions(), theXMLTypePackage.getLong(), "navigationActions", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_NavigationMoves(), theXMLTypePackage.getLong(), "navigationMoves", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_NavigationLength(), theXMLTypePackage.getLong(), "navigationLength", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_ExploringActions(), theXMLTypePackage.getLong(), "exploringActions", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGuiInput_TransferringActions(), theXMLTypePackage.getLong(), "transferringActions", null, 1, 1, GuiInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metacommEClass, Metacomm.class, "Metacomm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetacomm_IsHelp(), theXMLTypePackage.getBoolean(), "isHelp", null, 1, 1, Metacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetacomm_IsCorrection(), theXMLTypePackage.getBoolean(), "isCorrection", null, 1, 1, Metacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityAppropriatenessEClass, ModalityAppropriateness.class, "ModalityAppropriateness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalityAppropriateness_Appropriateness(), this.getModAppropT(), "appropriateness", null, 1, 1, ModalityAppropriateness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityChangeEClass, ModalityChange.class, "ModalityChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalityChange_Origin(), this.getRoleT(), "origin", null, 1, 1, ModalityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalityChange_Reason(), this.getMcReasonT(), "reason", null, 1, 1, ModalityChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalityInfoEClass, ModalityInfo.class, "ModalityInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalityInfo_ModalityType(), this.getModTypeT(), "modalityType", null, 1, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalityInfo_MmiType(), this.getMmiTypeT(), "mmiType", null, 1, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalityInfo_Appropriateness(), this.getModalityAppropriateness(), null, "appropriateness", null, 0, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalityInfo_Synchroni(), this.getModalitySynchroni(), null, "synchroni", null, 0, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModalityInfo_Change(), this.getModalityChange(), null, "change", null, 0, 1, ModalityInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modalitySynchroniEClass, ModalitySynchroni.class, "ModalitySynchroni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModalitySynchroni_Nlags(), theXMLTypePackage.getLong(), "nlags", null, 1, 1, ModalitySynchroni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalitySynchroni_Lagtime(), theXMLTypePackage.getLong(), "lagtime", null, 1, 1, ModalitySynchroni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModalitySynchroni_Nevents(), theXMLTypePackage.getLong(), "nevents", null, 1, 1, ModalitySynchroni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechInputEClass, SpeechInput.class, "SpeechInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechInput_OverallWords(), theXMLTypePackage.getLong(), "overallWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_SubstitutedWords(), theXMLTypePackage.getLong(), "substitutedWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_DeletedWords(), theXMLTypePackage.getLong(), "deletedWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_InsertedWords(), theXMLTypePackage.getLong(), "insertedWords", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_OverallSentences(), theXMLTypePackage.getLong(), "overallSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_SubstitutedSentences(), theXMLTypePackage.getLong(), "substitutedSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_DeletedSentences(), theXMLTypePackage.getLong(), "deletedSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_InsertedSentences(), theXMLTypePackage.getLong(), "insertedSentences", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_OverallConcepts(), theXMLTypePackage.getLong(), "overallConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_SubstitutedConcepts(), theXMLTypePackage.getLong(), "substitutedConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_DeletedConcepts(), theXMLTypePackage.getLong(), "deletedConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_InsertedConcepts(), theXMLTypePackage.getLong(), "insertedConcepts", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechInput_ParsingResult(), this.getParsingResultT(), "parsingResult", null, 1, 1, SpeechInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speechOutputEClass, SpeechOutput.class, "SpeechOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeechOutput_ANCO(), theXMLTypePackage.getLong(), "aNCO", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_ANIN(), theXMLTypePackage.getLong(), "aNIN", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_ANPA(), theXMLTypePackage.getLong(), "aNPA", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_ANFA(), theXMLTypePackage.getLong(), "aNFA", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeechOutput_PromptType(), this.getPromptTypeT(), "promptType", null, 1, 1, SpeechOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemMetacommEClass, SystemMetacomm.class, "SystemMetacomm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemMetacomm_IsASRReject(), theXMLTypePackage.getBoolean(), "isASRReject", null, 1, 1, SystemMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemMetacomm_IsDIVReject(), theXMLTypePackage.getBoolean(), "isDIVReject", null, 1, 1, SystemMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemMetacomm_IsGRReject(), theXMLTypePackage.getBoolean(), "isGRReject", null, 1, 1, SystemMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemTurnEClass, SystemTurn.class, "SystemTurn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemTurn_Metacomm(), this.getSystemMetacomm(), null, "metacomm", null, 1, 1, SystemTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTurn_SpeechOutput(), this.getSpeechOutput(), null, "speechOutput", null, 0, 1, SystemTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemTurn_Cooperativity(), this.getCooperativity(), null, "cooperativity", null, 0, 1, SystemTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Success(), this.getTaskSuccessT(), "success", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Reason(), theXMLTypePackage.getString(), "reason", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Avm(), this.getAvm(), null, "avm", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnEClass, Turn.class, "Turn", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurn_FeedbackDelay(), theXMLTypePackage.getLong(), "feedbackDelay", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_FeedbackDuration(), theXMLTypePackage.getLong(), "feedbackDuration", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_ActionDuration(), theXMLTypePackage.getLong(), "actionDuration", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Elements(), theXMLTypePackage.getLong(), "elements", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Feedback(), theXMLTypePackage.getLong(), "feedback", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Concepts(), theXMLTypePackage.getLong(), "concepts", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Noise(), theXMLTypePackage.getLong(), "noise", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Questions(), theXMLTypePackage.getLong(), "questions", null, 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurn_Modality(), this.getModalityInfo(), null, "modality", null, 0, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userMetacommEClass, UserMetacomm.class, "UserMetacomm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserMetacomm_IsTimeOut(), theXMLTypePackage.getBoolean(), "isTimeOut", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsCancel(), theXMLTypePackage.getBoolean(), "isCancel", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsRestart(), theXMLTypePackage.getBoolean(), "isRestart", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsBargein(), theXMLTypePackage.getBoolean(), "isBargein", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserMetacomm_IsSuccessfulBargein(), theXMLTypePackage.getBoolean(), "isSuccessfulBargein", null, 1, 1, UserMetacomm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userTurnEClass, UserTurn.class, "UserTurn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserTurn_Metacomm(), this.getUserMetacomm(), null, "metacomm", null, 1, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTurn_SpeechInput(), this.getSpeechInput(), null, "speechInput", null, 0, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserTurn_GuiInput(), this.getGuiInput(), null, "guiInput", null, 0, 1, UserTurn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.class, "ContextualAppropriatenessT");
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.APPROPRIATE);
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.INAPPROPRIATE);
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.TOTALFAILURE);
		addEEnumLiteral(contextualAppropriatenessTEEnum, ContextualAppropriatenessT.INCOMPREHENSIBLE);

		initEEnum(mcReasonTEEnum, McReasonT.class, "McReasonT");
		addEEnumLiteral(mcReasonTEEnum, McReasonT.RECOGNITIONERROR);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.ENVIRONMENTCHANGE);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.LOWMODAPPROPRIATENESS);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.USERDECISION);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.SYSTEMDECISION);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.INTERFACEADAPTATION);
		addEEnumLiteral(mcReasonTEEnum, McReasonT.OTHER);

		initEEnum(mmiTypeTEEnum, MmiTypeT.class, "MmiTypeT");
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.UNIMODAL);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.EQUIVALENT);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.ASSIGNED);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.REDUNDANT);
		addEEnumLiteral(mmiTypeTEEnum, MmiTypeT.COMPLEMENTARY);

		initEEnum(modAppropTEEnum, ModAppropT.class, "ModAppropT");
		addEEnumLiteral(modAppropTEEnum, ModAppropT.APPROPRIATE);
		addEEnumLiteral(modAppropTEEnum, ModAppropT.PARTIALLY);
		addEEnumLiteral(modAppropTEEnum, ModAppropT.INAPPROPRIATE);

		initEEnum(modTypeTEEnum, ModTypeT.class, "ModTypeT");
		addEEnumLiteral(modTypeTEEnum, ModTypeT.S);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.V);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.G);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.SV);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.SG);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.VG);
		addEEnumLiteral(modTypeTEEnum, ModTypeT.SVG);

		initEEnum(parsingResultTEEnum, ParsingResultT.class, "ParsingResultT");
		addEEnumLiteral(parsingResultTEEnum, ParsingResultT.CORRECTLYUNDERSTOOD);
		addEEnumLiteral(parsingResultTEEnum, ParsingResultT.PARTIALLYUNDERSTOOD);
		addEEnumLiteral(parsingResultTEEnum, ParsingResultT.NOTHINGUNDERSTOOD);

		initEEnum(promptTypeTEEnum, PromptTypeT.class, "PromptTypeT");
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.OPEN);
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.HALFOPEN);
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.CLOSED);
		addEEnumLiteral(promptTypeTEEnum, PromptTypeT.NOQUESTION);

		initEEnum(roleTEEnum, RoleT.class, "RoleT");
		addEEnumLiteral(roleTEEnum, RoleT.SYSTEM);
		addEEnumLiteral(roleTEEnum, RoleT.USER);

		initEEnum(taskSuccessTEEnum, TaskSuccessT.class, "TaskSuccessT");
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCEEDED);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCONSTRAINTRELAXATIONSYSTEM);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCONSTRAINTRELAXATIONUSER);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCCONSTRAINTRELAXATIONBOTH);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.SUCNOSOLUTION);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.FAILEDSYSTEM);
		addEEnumLiteral(taskSuccessTEEnum, TaskSuccessT.FAILEDUSER);

		// Initialize data types
		initEDataType(contextualAppropriatenessTObjectEDataType, ContextualAppropriatenessT.class, "ContextualAppropriatenessTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mcReasonTObjectEDataType, McReasonT.class, "McReasonTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mmiTypeTObjectEDataType, MmiTypeT.class, "MmiTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modAppropTObjectEDataType, ModAppropT.class, "ModAppropTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modTypeTObjectEDataType, ModTypeT.class, "ModTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(parsingResultTObjectEDataType, ParsingResultT.class, "ParsingResultTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(promptTypeTObjectEDataType, PromptTypeT.class, "PromptTypeTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(roleTObjectEDataType, RoleT.class, "RoleTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(taskSuccessTObjectEDataType, TaskSuccessT.class, "TaskSuccessTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (avmEClass, 
		   source, 
		   new String[] {
			 "name", "Avm",
			 "kind", "empty"
		   });		
		addAnnotation
		  (contextualAppropriatenessTEEnum, 
		   source, 
		   new String[] {
			 "name", "contextual_appropriateness_t"
		   });		
		addAnnotation
		  (contextualAppropriatenessTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "contextual_appropriateness_t:Object",
			 "baseType", "contextual_appropriateness_t"
		   });		
		addAnnotation
		  (cooperativityEClass, 
		   source, 
		   new String[] {
			 "name", "Cooperativity",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCooperativity_ContextualAppropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contextualAppropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dialogueEClass, 
		   source, 
		   new String[] {
			 "name", "Dialogue",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDialogue_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogue_BaseTimestamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "baseTimestamp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogue_Task(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "task",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogue_Step(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dialogueStepTEClass, 
		   source, 
		   new String[] {
			 "name", "dialogue_step_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDialogueStepT_SystemTurn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "systemTurn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDialogueStepT_UserTurn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "userTurn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Avm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Avm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Cooperativity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Cooperativity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Dialogue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Dialogue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GuiInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GuiInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModalityAppropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModalityAppropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModalityChange(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModalityChange",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModalityInfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModalityInfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ModalitySynchroni(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModalitySynchroni",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpeechInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpeechInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SpeechOutput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SpeechOutput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SystemMetacomm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SystemMetacomm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Task(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Task",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Turn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Turn",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_UserMetacomm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UserMetacomm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (guiInputEClass, 
		   source, 
		   new String[] {
			 "name", "GuiInput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGuiInput_TextElements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textElements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_NavigationActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigationActions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_NavigationMoves(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigationMoves",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_NavigationLength(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "navigationLength",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_ExploringActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exploringActions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGuiInput_TransferringActions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "transferringActions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (mcReasonTEEnum, 
		   source, 
		   new String[] {
			 "name", "mc_reason_t"
		   });		
		addAnnotation
		  (mcReasonTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mc_reason_t:Object",
			 "baseType", "mc_reason_t"
		   });		
		addAnnotation
		  (metacommEClass, 
		   source, 
		   new String[] {
			 "name", "Metacomm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetacomm_IsHelp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isHelp",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMetacomm_IsCorrection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isCorrection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (mmiTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "mmi_type_t"
		   });		
		addAnnotation
		  (mmiTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mmi_type_t:Object",
			 "baseType", "mmi_type_t"
		   });		
		addAnnotation
		  (modalityAppropriatenessEClass, 
		   source, 
		   new String[] {
			 "name", "ModalityAppropriateness",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalityAppropriateness_Appropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modalityChangeEClass, 
		   source, 
		   new String[] {
			 "name", "ModalityChange",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalityChange_Origin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "origin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityChange_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modalityInfoEClass, 
		   source, 
		   new String[] {
			 "name", "ModalityInfo",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalityInfo_ModalityType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modalityType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_MmiType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mmiType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_Appropriateness(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appropriateness",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_Synchroni(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "synchroni",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalityInfo_Change(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "change",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modalitySynchroniEClass, 
		   source, 
		   new String[] {
			 "name", "ModalitySynchroni",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModalitySynchroni_Nlags(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nlags",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalitySynchroni_Lagtime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lagtime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModalitySynchroni_Nevents(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "nevents",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modAppropTEEnum, 
		   source, 
		   new String[] {
			 "name", "mod_approp_t"
		   });		
		addAnnotation
		  (modAppropTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mod_approp_t:Object",
			 "baseType", "mod_approp_t"
		   });		
		addAnnotation
		  (modTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "mod_type_t"
		   });		
		addAnnotation
		  (modTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "mod_type_t:Object",
			 "baseType", "mod_type_t"
		   });		
		addAnnotation
		  (parsingResultTEEnum, 
		   source, 
		   new String[] {
			 "name", "parsing_result_t"
		   });		
		addAnnotation
		  (parsingResultTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "parsing_result_t:Object",
			 "baseType", "parsing_result_t"
		   });		
		addAnnotation
		  (promptTypeTEEnum, 
		   source, 
		   new String[] {
			 "name", "prompt_type_t"
		   });		
		addAnnotation
		  (promptTypeTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "prompt_type_t:Object",
			 "baseType", "prompt_type_t"
		   });		
		addAnnotation
		  (roleTEEnum, 
		   source, 
		   new String[] {
			 "name", "role_t"
		   });		
		addAnnotation
		  (roleTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "role_t:Object",
			 "baseType", "role_t"
		   });		
		addAnnotation
		  (speechInputEClass, 
		   source, 
		   new String[] {
			 "name", "SpeechInput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpeechInput_OverallWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overallWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_SubstitutedWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substitutedWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_DeletedWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletedWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_InsertedWords(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insertedWords",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_OverallSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overallSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_SubstitutedSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substitutedSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_DeletedSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletedSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_InsertedSentences(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insertedSentences",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_OverallConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overallConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_SubstitutedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substitutedConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_DeletedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deletedConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_InsertedConcepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "insertedConcepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechInput_ParsingResult(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parsingResult",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (speechOutputEClass, 
		   source, 
		   new String[] {
			 "name", "SpeechOutput",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSpeechOutput_ANCO(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_CO",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_ANIN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_IN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_ANPA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_PA",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_ANFA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AN_FA",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSpeechOutput_PromptType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "promptType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (systemMetacommEClass, 
		   source, 
		   new String[] {
			 "name", "SystemMetacomm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSystemMetacomm_IsASRReject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isASRReject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemMetacomm_IsDIVReject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isDIVReject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemMetacomm_IsGRReject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isGRReject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (systemTurnEClass, 
		   source, 
		   new String[] {
			 "name", "SystemTurn",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSystemTurn_Metacomm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metacomm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemTurn_SpeechOutput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speechOutput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSystemTurn_Cooperativity(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cooperativity",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taskEClass, 
		   source, 
		   new String[] {
			 "name", "Task",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTask_Success(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "success",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTask_Reason(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reason",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTask_Avm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "avm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taskSuccessTEEnum, 
		   source, 
		   new String[] {
			 "name", "task_success_t"
		   });		
		addAnnotation
		  (taskSuccessTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "task_success_t:Object",
			 "baseType", "task_success_t"
		   });		
		addAnnotation
		  (turnEClass, 
		   source, 
		   new String[] {
			 "name", "Turn",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTurn_FeedbackDelay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feedbackDelay",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_FeedbackDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feedbackDuration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_ActionDuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "actionDuration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Elements(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "elements",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Feedback(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feedback",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Concepts(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "concepts",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Noise(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "noise",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Questions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "questions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTurn_Modality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "modality",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userMetacommEClass, 
		   source, 
		   new String[] {
			 "name", "UserMetacomm",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserMetacomm_IsTimeOut(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isTimeOut",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsCancel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isCancel",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsRestart(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isRestart",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsBargein(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isBargein",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserMetacomm_IsSuccessfulBargein(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "isSuccessfulBargein",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (userTurnEClass, 
		   source, 
		   new String[] {
			 "name", "UserTurn",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUserTurn_Metacomm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metacomm",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserTurn_SpeechInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "speechInput",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUserTurn_GuiInput(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "guiInput",
			 "namespace", "##targetNamespace"
		   });
	}

} //ModelPackageImpl
