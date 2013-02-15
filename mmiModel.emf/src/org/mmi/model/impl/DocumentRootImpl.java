/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mmi.model.Avm;
import org.mmi.model.Cooperativity;
import org.mmi.model.Dialogue;
import org.mmi.model.DocumentRoot;
import org.mmi.model.GuiInput;
import org.mmi.model.ModalityAppropriateness;
import org.mmi.model.ModalityChange;
import org.mmi.model.ModalityInfo;
import org.mmi.model.ModalitySynchroni;
import org.mmi.model.ModelPackage;
import org.mmi.model.SpeechInput;
import org.mmi.model.SpeechOutput;
import org.mmi.model.SystemMetacomm;
import org.mmi.model.Task;
import org.mmi.model.Turn;
import org.mmi.model.UserMetacomm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getAvm <em>Avm</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getCooperativity <em>Cooperativity</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getGuiInput <em>Gui Input</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getModalityAppropriateness <em>Modality Appropriateness</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getModalityChange <em>Modality Change</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getModalityInfo <em>Modality Info</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getModalitySynchroni <em>Modality Synchroni</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getSpeechInput <em>Speech Input</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getSpeechOutput <em>Speech Output</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getSystemMetacomm <em>System Metacomm</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getTurn <em>Turn</em>}</li>
 *   <li>{@link org.mmi.model.impl.DocumentRootImpl#getUserMetacomm <em>User Metacomm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ModelPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avm getAvm() {
		return (Avm)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__AVM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvm(Avm newAvm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__AVM, newAvm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvm(Avm newAvm) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__AVM, newAvm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cooperativity getCooperativity() {
		return (Cooperativity)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__COOPERATIVITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCooperativity(Cooperativity newCooperativity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__COOPERATIVITY, newCooperativity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCooperativity(Cooperativity newCooperativity) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__COOPERATIVITY, newCooperativity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dialogue getDialogue() {
		return (Dialogue)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__DIALOGUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDialogue(Dialogue newDialogue, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__DIALOGUE, newDialogue, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogue(Dialogue newDialogue) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__DIALOGUE, newDialogue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiInput getGuiInput() {
		return (GuiInput)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__GUI_INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuiInput(GuiInput newGuiInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__GUI_INPUT, newGuiInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuiInput(GuiInput newGuiInput) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__GUI_INPUT, newGuiInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityAppropriateness getModalityAppropriateness() {
		return (ModalityAppropriateness)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModalityAppropriateness(ModalityAppropriateness newModalityAppropriateness, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS, newModalityAppropriateness, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalityAppropriateness(ModalityAppropriateness newModalityAppropriateness) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS, newModalityAppropriateness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityChange getModalityChange() {
		return (ModalityChange)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_CHANGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModalityChange(ModalityChange newModalityChange, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_CHANGE, newModalityChange, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalityChange(ModalityChange newModalityChange) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_CHANGE, newModalityChange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityInfo getModalityInfo() {
		return (ModalityInfo)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModalityInfo(ModalityInfo newModalityInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_INFO, newModalityInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalityInfo(ModalityInfo newModalityInfo) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_INFO, newModalityInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalitySynchroni getModalitySynchroni() {
		return (ModalitySynchroni)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_SYNCHRONI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModalitySynchroni(ModalitySynchroni newModalitySynchroni, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_SYNCHRONI, newModalitySynchroni, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalitySynchroni(ModalitySynchroni newModalitySynchroni) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__MODALITY_SYNCHRONI, newModalitySynchroni);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechInput getSpeechInput() {
		return (SpeechInput)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__SPEECH_INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechInput(SpeechInput newSpeechInput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__SPEECH_INPUT, newSpeechInput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeechInput(SpeechInput newSpeechInput) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__SPEECH_INPUT, newSpeechInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechOutput getSpeechOutput() {
		return (SpeechOutput)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__SPEECH_OUTPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechOutput(SpeechOutput newSpeechOutput, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__SPEECH_OUTPUT, newSpeechOutput, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeechOutput(SpeechOutput newSpeechOutput) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__SPEECH_OUTPUT, newSpeechOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMetacomm getSystemMetacomm() {
		return (SystemMetacomm)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__SYSTEM_METACOMM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemMetacomm(SystemMetacomm newSystemMetacomm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__SYSTEM_METACOMM, newSystemMetacomm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemMetacomm(SystemMetacomm newSystemMetacomm) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__SYSTEM_METACOMM, newSystemMetacomm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		return (Task)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__TASK, newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__TASK, newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn getTurn() {
		return (Turn)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__TURN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurn(Turn newTurn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__TURN, newTurn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurn(Turn newTurn) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__TURN, newTurn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMetacomm getUserMetacomm() {
		return (UserMetacomm)getMixed().get(ModelPackage.Literals.DOCUMENT_ROOT__USER_METACOMM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserMetacomm(UserMetacomm newUserMetacomm, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ModelPackage.Literals.DOCUMENT_ROOT__USER_METACOMM, newUserMetacomm, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserMetacomm(UserMetacomm newUserMetacomm) {
		((FeatureMap.Internal)getMixed()).set(ModelPackage.Literals.DOCUMENT_ROOT__USER_METACOMM, newUserMetacomm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ModelPackage.DOCUMENT_ROOT__AVM:
				return basicSetAvm(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__COOPERATIVITY:
				return basicSetCooperativity(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__DIALOGUE:
				return basicSetDialogue(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__GUI_INPUT:
				return basicSetGuiInput(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS:
				return basicSetModalityAppropriateness(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__MODALITY_CHANGE:
				return basicSetModalityChange(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__MODALITY_INFO:
				return basicSetModalityInfo(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__MODALITY_SYNCHRONI:
				return basicSetModalitySynchroni(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__SPEECH_INPUT:
				return basicSetSpeechInput(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__SPEECH_OUTPUT:
				return basicSetSpeechOutput(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__SYSTEM_METACOMM:
				return basicSetSystemMetacomm(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__TASK:
				return basicSetTask(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__TURN:
				return basicSetTurn(null, msgs);
			case ModelPackage.DOCUMENT_ROOT__USER_METACOMM:
				return basicSetUserMetacomm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ModelPackage.DOCUMENT_ROOT__AVM:
				return getAvm();
			case ModelPackage.DOCUMENT_ROOT__COOPERATIVITY:
				return getCooperativity();
			case ModelPackage.DOCUMENT_ROOT__DIALOGUE:
				return getDialogue();
			case ModelPackage.DOCUMENT_ROOT__GUI_INPUT:
				return getGuiInput();
			case ModelPackage.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS:
				return getModalityAppropriateness();
			case ModelPackage.DOCUMENT_ROOT__MODALITY_CHANGE:
				return getModalityChange();
			case ModelPackage.DOCUMENT_ROOT__MODALITY_INFO:
				return getModalityInfo();
			case ModelPackage.DOCUMENT_ROOT__MODALITY_SYNCHRONI:
				return getModalitySynchroni();
			case ModelPackage.DOCUMENT_ROOT__SPEECH_INPUT:
				return getSpeechInput();
			case ModelPackage.DOCUMENT_ROOT__SPEECH_OUTPUT:
				return getSpeechOutput();
			case ModelPackage.DOCUMENT_ROOT__SYSTEM_METACOMM:
				return getSystemMetacomm();
			case ModelPackage.DOCUMENT_ROOT__TASK:
				return getTask();
			case ModelPackage.DOCUMENT_ROOT__TURN:
				return getTurn();
			case ModelPackage.DOCUMENT_ROOT__USER_METACOMM:
				return getUserMetacomm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__AVM:
				setAvm((Avm)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__COOPERATIVITY:
				setCooperativity((Cooperativity)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__DIALOGUE:
				setDialogue((Dialogue)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__GUI_INPUT:
				setGuiInput((GuiInput)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS:
				setModalityAppropriateness((ModalityAppropriateness)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_CHANGE:
				setModalityChange((ModalityChange)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_INFO:
				setModalityInfo((ModalityInfo)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_SYNCHRONI:
				setModalitySynchroni((ModalitySynchroni)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__SPEECH_INPUT:
				setSpeechInput((SpeechInput)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__SPEECH_OUTPUT:
				setSpeechOutput((SpeechOutput)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__SYSTEM_METACOMM:
				setSystemMetacomm((SystemMetacomm)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__TURN:
				setTurn((Turn)newValue);
				return;
			case ModelPackage.DOCUMENT_ROOT__USER_METACOMM:
				setUserMetacomm((UserMetacomm)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ModelPackage.DOCUMENT_ROOT__AVM:
				setAvm((Avm)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__COOPERATIVITY:
				setCooperativity((Cooperativity)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__DIALOGUE:
				setDialogue((Dialogue)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__GUI_INPUT:
				setGuiInput((GuiInput)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS:
				setModalityAppropriateness((ModalityAppropriateness)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_CHANGE:
				setModalityChange((ModalityChange)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_INFO:
				setModalityInfo((ModalityInfo)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_SYNCHRONI:
				setModalitySynchroni((ModalitySynchroni)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__SPEECH_INPUT:
				setSpeechInput((SpeechInput)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__SPEECH_OUTPUT:
				setSpeechOutput((SpeechOutput)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__SYSTEM_METACOMM:
				setSystemMetacomm((SystemMetacomm)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__TASK:
				setTask((Task)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__TURN:
				setTurn((Turn)null);
				return;
			case ModelPackage.DOCUMENT_ROOT__USER_METACOMM:
				setUserMetacomm((UserMetacomm)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ModelPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ModelPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ModelPackage.DOCUMENT_ROOT__AVM:
				return getAvm() != null;
			case ModelPackage.DOCUMENT_ROOT__COOPERATIVITY:
				return getCooperativity() != null;
			case ModelPackage.DOCUMENT_ROOT__DIALOGUE:
				return getDialogue() != null;
			case ModelPackage.DOCUMENT_ROOT__GUI_INPUT:
				return getGuiInput() != null;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_APPROPRIATENESS:
				return getModalityAppropriateness() != null;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_CHANGE:
				return getModalityChange() != null;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_INFO:
				return getModalityInfo() != null;
			case ModelPackage.DOCUMENT_ROOT__MODALITY_SYNCHRONI:
				return getModalitySynchroni() != null;
			case ModelPackage.DOCUMENT_ROOT__SPEECH_INPUT:
				return getSpeechInput() != null;
			case ModelPackage.DOCUMENT_ROOT__SPEECH_OUTPUT:
				return getSpeechOutput() != null;
			case ModelPackage.DOCUMENT_ROOT__SYSTEM_METACOMM:
				return getSystemMetacomm() != null;
			case ModelPackage.DOCUMENT_ROOT__TASK:
				return getTask() != null;
			case ModelPackage.DOCUMENT_ROOT__TURN:
				return getTurn() != null;
			case ModelPackage.DOCUMENT_ROOT__USER_METACOMM:
				return getUserMetacomm() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
