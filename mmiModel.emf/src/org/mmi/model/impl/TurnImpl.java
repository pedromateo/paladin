/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mmi.model.ModalityInfo;
import org.mmi.model.ModelPackage;
import org.mmi.model.Turn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getFeedbackDelay <em>Feedback Delay</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getFeedbackDuration <em>Feedback Duration</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getActionDuration <em>Action Duration</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getConcepts <em>Concepts</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getNoise <em>Noise</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link org.mmi.model.impl.TurnImpl#getModality <em>Modality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TurnImpl extends EObjectImpl implements Turn {
	/**
	 * The default value of the '{@link #getFeedbackDelay() <em>Feedback Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDelay()
	 * @generated
	 * @ordered
	 */
	protected static final long FEEDBACK_DELAY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFeedbackDelay() <em>Feedback Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDelay()
	 * @generated
	 * @ordered
	 */
	protected long feedbackDelay = FEEDBACK_DELAY_EDEFAULT;

	/**
	 * This is true if the Feedback Delay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedbackDelayESet;

	/**
	 * The default value of the '{@link #getFeedbackDuration() <em>Feedback Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long FEEDBACK_DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFeedbackDuration() <em>Feedback Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackDuration()
	 * @generated
	 * @ordered
	 */
	protected long feedbackDuration = FEEDBACK_DURATION_EDEFAULT;

	/**
	 * This is true if the Feedback Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedbackDurationESet;

	/**
	 * The default value of the '{@link #getActionDuration() <em>Action Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long ACTION_DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getActionDuration() <em>Action Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDuration()
	 * @generated
	 * @ordered
	 */
	protected long actionDuration = ACTION_DURATION_EDEFAULT;

	/**
	 * This is true if the Action Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionDurationESet;

	/**
	 * The default value of the '{@link #getElements() <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected static final long ELEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected long elements = ELEMENTS_EDEFAULT;

	/**
	 * This is true if the Elements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elementsESet;

	/**
	 * The default value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected static final long FEEDBACK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected long feedback = FEEDBACK_EDEFAULT;

	/**
	 * This is true if the Feedback attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean feedbackESet;

	/**
	 * The default value of the '{@link #getConcepts() <em>Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected static final long CONCEPTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected long concepts = CONCEPTS_EDEFAULT;

	/**
	 * This is true if the Concepts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conceptsESet;

	/**
	 * The default value of the '{@link #getNoise() <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoise()
	 * @generated
	 * @ordered
	 */
	protected static final long NOISE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNoise() <em>Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoise()
	 * @generated
	 * @ordered
	 */
	protected long noise = NOISE_EDEFAULT;

	/**
	 * This is true if the Noise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean noiseESet;

	/**
	 * The default value of the '{@link #getQuestions() <em>Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected static final long QUESTIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected long questions = QUESTIONS_EDEFAULT;

	/**
	 * This is true if the Questions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean questionsESet;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected ModalityInfo modality;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFeedbackDelay() {
		return feedbackDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackDelay(long newFeedbackDelay) {
		long oldFeedbackDelay = feedbackDelay;
		feedbackDelay = newFeedbackDelay;
		boolean oldFeedbackDelayESet = feedbackDelayESet;
		feedbackDelayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__FEEDBACK_DELAY, oldFeedbackDelay, feedbackDelay, !oldFeedbackDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeedbackDelay() {
		long oldFeedbackDelay = feedbackDelay;
		boolean oldFeedbackDelayESet = feedbackDelayESet;
		feedbackDelay = FEEDBACK_DELAY_EDEFAULT;
		feedbackDelayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__FEEDBACK_DELAY, oldFeedbackDelay, FEEDBACK_DELAY_EDEFAULT, oldFeedbackDelayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeedbackDelay() {
		return feedbackDelayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFeedbackDuration() {
		return feedbackDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedbackDuration(long newFeedbackDuration) {
		long oldFeedbackDuration = feedbackDuration;
		feedbackDuration = newFeedbackDuration;
		boolean oldFeedbackDurationESet = feedbackDurationESet;
		feedbackDurationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__FEEDBACK_DURATION, oldFeedbackDuration, feedbackDuration, !oldFeedbackDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeedbackDuration() {
		long oldFeedbackDuration = feedbackDuration;
		boolean oldFeedbackDurationESet = feedbackDurationESet;
		feedbackDuration = FEEDBACK_DURATION_EDEFAULT;
		feedbackDurationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__FEEDBACK_DURATION, oldFeedbackDuration, FEEDBACK_DURATION_EDEFAULT, oldFeedbackDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeedbackDuration() {
		return feedbackDurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getActionDuration() {
		return actionDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionDuration(long newActionDuration) {
		long oldActionDuration = actionDuration;
		actionDuration = newActionDuration;
		boolean oldActionDurationESet = actionDurationESet;
		actionDurationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__ACTION_DURATION, oldActionDuration, actionDuration, !oldActionDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActionDuration() {
		long oldActionDuration = actionDuration;
		boolean oldActionDurationESet = actionDurationESet;
		actionDuration = ACTION_DURATION_EDEFAULT;
		actionDurationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__ACTION_DURATION, oldActionDuration, ACTION_DURATION_EDEFAULT, oldActionDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionDuration() {
		return actionDurationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElements(long newElements) {
		long oldElements = elements;
		elements = newElements;
		boolean oldElementsESet = elementsESet;
		elementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__ELEMENTS, oldElements, elements, !oldElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElements() {
		long oldElements = elements;
		boolean oldElementsESet = elementsESet;
		elements = ELEMENTS_EDEFAULT;
		elementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__ELEMENTS, oldElements, ELEMENTS_EDEFAULT, oldElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElements() {
		return elementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFeedback() {
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(long newFeedback) {
		long oldFeedback = feedback;
		feedback = newFeedback;
		boolean oldFeedbackESet = feedbackESet;
		feedbackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__FEEDBACK, oldFeedback, feedback, !oldFeedbackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFeedback() {
		long oldFeedback = feedback;
		boolean oldFeedbackESet = feedbackESet;
		feedback = FEEDBACK_EDEFAULT;
		feedbackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__FEEDBACK, oldFeedback, FEEDBACK_EDEFAULT, oldFeedbackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeedback() {
		return feedbackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getConcepts() {
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcepts(long newConcepts) {
		long oldConcepts = concepts;
		concepts = newConcepts;
		boolean oldConceptsESet = conceptsESet;
		conceptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__CONCEPTS, oldConcepts, concepts, !oldConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcepts() {
		long oldConcepts = concepts;
		boolean oldConceptsESet = conceptsESet;
		concepts = CONCEPTS_EDEFAULT;
		conceptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__CONCEPTS, oldConcepts, CONCEPTS_EDEFAULT, oldConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcepts() {
		return conceptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNoise() {
		return noise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoise(long newNoise) {
		long oldNoise = noise;
		noise = newNoise;
		boolean oldNoiseESet = noiseESet;
		noiseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__NOISE, oldNoise, noise, !oldNoiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNoise() {
		long oldNoise = noise;
		boolean oldNoiseESet = noiseESet;
		noise = NOISE_EDEFAULT;
		noiseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__NOISE, oldNoise, NOISE_EDEFAULT, oldNoiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNoise() {
		return noiseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuestions() {
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestions(long newQuestions) {
		long oldQuestions = questions;
		questions = newQuestions;
		boolean oldQuestionsESet = questionsESet;
		questionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__QUESTIONS, oldQuestions, questions, !oldQuestionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuestions() {
		long oldQuestions = questions;
		boolean oldQuestionsESet = questionsESet;
		questions = QUESTIONS_EDEFAULT;
		questionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TURN__QUESTIONS, oldQuestions, QUESTIONS_EDEFAULT, oldQuestionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuestions() {
		return questionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityInfo getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModality(ModalityInfo newModality, NotificationChain msgs) {
		ModalityInfo oldModality = modality;
		modality = newModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__MODALITY, oldModality, newModality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(ModalityInfo newModality) {
		if (newModality != modality) {
			NotificationChain msgs = null;
			if (modality != null)
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TURN__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TURN__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TURN__MODALITY, newModality, newModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TURN__MODALITY:
				return basicSetModality(null, msgs);
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
			case ModelPackage.TURN__FEEDBACK_DELAY:
				return getFeedbackDelay();
			case ModelPackage.TURN__FEEDBACK_DURATION:
				return getFeedbackDuration();
			case ModelPackage.TURN__ACTION_DURATION:
				return getActionDuration();
			case ModelPackage.TURN__ELEMENTS:
				return getElements();
			case ModelPackage.TURN__FEEDBACK:
				return getFeedback();
			case ModelPackage.TURN__CONCEPTS:
				return getConcepts();
			case ModelPackage.TURN__NOISE:
				return getNoise();
			case ModelPackage.TURN__QUESTIONS:
				return getQuestions();
			case ModelPackage.TURN__MODALITY:
				return getModality();
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
			case ModelPackage.TURN__FEEDBACK_DELAY:
				setFeedbackDelay((Long)newValue);
				return;
			case ModelPackage.TURN__FEEDBACK_DURATION:
				setFeedbackDuration((Long)newValue);
				return;
			case ModelPackage.TURN__ACTION_DURATION:
				setActionDuration((Long)newValue);
				return;
			case ModelPackage.TURN__ELEMENTS:
				setElements((Long)newValue);
				return;
			case ModelPackage.TURN__FEEDBACK:
				setFeedback((Long)newValue);
				return;
			case ModelPackage.TURN__CONCEPTS:
				setConcepts((Long)newValue);
				return;
			case ModelPackage.TURN__NOISE:
				setNoise((Long)newValue);
				return;
			case ModelPackage.TURN__QUESTIONS:
				setQuestions((Long)newValue);
				return;
			case ModelPackage.TURN__MODALITY:
				setModality((ModalityInfo)newValue);
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
			case ModelPackage.TURN__FEEDBACK_DELAY:
				unsetFeedbackDelay();
				return;
			case ModelPackage.TURN__FEEDBACK_DURATION:
				unsetFeedbackDuration();
				return;
			case ModelPackage.TURN__ACTION_DURATION:
				unsetActionDuration();
				return;
			case ModelPackage.TURN__ELEMENTS:
				unsetElements();
				return;
			case ModelPackage.TURN__FEEDBACK:
				unsetFeedback();
				return;
			case ModelPackage.TURN__CONCEPTS:
				unsetConcepts();
				return;
			case ModelPackage.TURN__NOISE:
				unsetNoise();
				return;
			case ModelPackage.TURN__QUESTIONS:
				unsetQuestions();
				return;
			case ModelPackage.TURN__MODALITY:
				setModality((ModalityInfo)null);
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
			case ModelPackage.TURN__FEEDBACK_DELAY:
				return isSetFeedbackDelay();
			case ModelPackage.TURN__FEEDBACK_DURATION:
				return isSetFeedbackDuration();
			case ModelPackage.TURN__ACTION_DURATION:
				return isSetActionDuration();
			case ModelPackage.TURN__ELEMENTS:
				return isSetElements();
			case ModelPackage.TURN__FEEDBACK:
				return isSetFeedback();
			case ModelPackage.TURN__CONCEPTS:
				return isSetConcepts();
			case ModelPackage.TURN__NOISE:
				return isSetNoise();
			case ModelPackage.TURN__QUESTIONS:
				return isSetQuestions();
			case ModelPackage.TURN__MODALITY:
				return modality != null;
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
		result.append(" (feedbackDelay: ");
		if (feedbackDelayESet) result.append(feedbackDelay); else result.append("<unset>");
		result.append(", feedbackDuration: ");
		if (feedbackDurationESet) result.append(feedbackDuration); else result.append("<unset>");
		result.append(", actionDuration: ");
		if (actionDurationESet) result.append(actionDuration); else result.append("<unset>");
		result.append(", elements: ");
		if (elementsESet) result.append(elements); else result.append("<unset>");
		result.append(", feedback: ");
		if (feedbackESet) result.append(feedback); else result.append("<unset>");
		result.append(", concepts: ");
		if (conceptsESet) result.append(concepts); else result.append("<unset>");
		result.append(", noise: ");
		if (noiseESet) result.append(noise); else result.append("<unset>");
		result.append(", questions: ");
		if (questionsESet) result.append(questions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TurnImpl
