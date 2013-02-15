/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mmi.model.ModelPackage;
import org.mmi.model.ParsingResultT;
import org.mmi.model.SpeechInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getOverallWords <em>Overall Words</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getSubstitutedWords <em>Substituted Words</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getDeletedWords <em>Deleted Words</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getInsertedWords <em>Inserted Words</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getOverallSentences <em>Overall Sentences</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getSubstitutedSentences <em>Substituted Sentences</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getDeletedSentences <em>Deleted Sentences</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getInsertedSentences <em>Inserted Sentences</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getOverallConcepts <em>Overall Concepts</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getSubstitutedConcepts <em>Substituted Concepts</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getDeletedConcepts <em>Deleted Concepts</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getInsertedConcepts <em>Inserted Concepts</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechInputImpl#getParsingResult <em>Parsing Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpeechInputImpl extends EObjectImpl implements SpeechInput {
	/**
	 * The default value of the '{@link #getOverallWords() <em>Overall Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWords()
	 * @generated
	 * @ordered
	 */
	protected static final long OVERALL_WORDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOverallWords() <em>Overall Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWords()
	 * @generated
	 * @ordered
	 */
	protected long overallWords = OVERALL_WORDS_EDEFAULT;

	/**
	 * This is true if the Overall Words attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallWordsESet;

	/**
	 * The default value of the '{@link #getSubstitutedWords() <em>Substituted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedWords()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSTITUTED_WORDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubstitutedWords() <em>Substituted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedWords()
	 * @generated
	 * @ordered
	 */
	protected long substitutedWords = SUBSTITUTED_WORDS_EDEFAULT;

	/**
	 * This is true if the Substituted Words attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean substitutedWordsESet;

	/**
	 * The default value of the '{@link #getDeletedWords() <em>Deleted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedWords()
	 * @generated
	 * @ordered
	 */
	protected static final long DELETED_WORDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeletedWords() <em>Deleted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedWords()
	 * @generated
	 * @ordered
	 */
	protected long deletedWords = DELETED_WORDS_EDEFAULT;

	/**
	 * This is true if the Deleted Words attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deletedWordsESet;

	/**
	 * The default value of the '{@link #getInsertedWords() <em>Inserted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedWords()
	 * @generated
	 * @ordered
	 */
	protected static final long INSERTED_WORDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInsertedWords() <em>Inserted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedWords()
	 * @generated
	 * @ordered
	 */
	protected long insertedWords = INSERTED_WORDS_EDEFAULT;

	/**
	 * This is true if the Inserted Words attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insertedWordsESet;

	/**
	 * The default value of the '{@link #getOverallSentences() <em>Overall Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallSentences()
	 * @generated
	 * @ordered
	 */
	protected static final long OVERALL_SENTENCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOverallSentences() <em>Overall Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallSentences()
	 * @generated
	 * @ordered
	 */
	protected long overallSentences = OVERALL_SENTENCES_EDEFAULT;

	/**
	 * This is true if the Overall Sentences attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallSentencesESet;

	/**
	 * The default value of the '{@link #getSubstitutedSentences() <em>Substituted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedSentences()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSTITUTED_SENTENCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubstitutedSentences() <em>Substituted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedSentences()
	 * @generated
	 * @ordered
	 */
	protected long substitutedSentences = SUBSTITUTED_SENTENCES_EDEFAULT;

	/**
	 * This is true if the Substituted Sentences attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean substitutedSentencesESet;

	/**
	 * The default value of the '{@link #getDeletedSentences() <em>Deleted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedSentences()
	 * @generated
	 * @ordered
	 */
	protected static final long DELETED_SENTENCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeletedSentences() <em>Deleted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedSentences()
	 * @generated
	 * @ordered
	 */
	protected long deletedSentences = DELETED_SENTENCES_EDEFAULT;

	/**
	 * This is true if the Deleted Sentences attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deletedSentencesESet;

	/**
	 * The default value of the '{@link #getInsertedSentences() <em>Inserted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedSentences()
	 * @generated
	 * @ordered
	 */
	protected static final long INSERTED_SENTENCES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInsertedSentences() <em>Inserted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedSentences()
	 * @generated
	 * @ordered
	 */
	protected long insertedSentences = INSERTED_SENTENCES_EDEFAULT;

	/**
	 * This is true if the Inserted Sentences attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insertedSentencesESet;

	/**
	 * The default value of the '{@link #getOverallConcepts() <em>Overall Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallConcepts()
	 * @generated
	 * @ordered
	 */
	protected static final long OVERALL_CONCEPTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOverallConcepts() <em>Overall Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallConcepts()
	 * @generated
	 * @ordered
	 */
	protected long overallConcepts = OVERALL_CONCEPTS_EDEFAULT;

	/**
	 * This is true if the Overall Concepts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overallConceptsESet;

	/**
	 * The default value of the '{@link #getSubstitutedConcepts() <em>Substituted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedConcepts()
	 * @generated
	 * @ordered
	 */
	protected static final long SUBSTITUTED_CONCEPTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSubstitutedConcepts() <em>Substituted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedConcepts()
	 * @generated
	 * @ordered
	 */
	protected long substitutedConcepts = SUBSTITUTED_CONCEPTS_EDEFAULT;

	/**
	 * This is true if the Substituted Concepts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean substitutedConceptsESet;

	/**
	 * The default value of the '{@link #getDeletedConcepts() <em>Deleted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedConcepts()
	 * @generated
	 * @ordered
	 */
	protected static final long DELETED_CONCEPTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeletedConcepts() <em>Deleted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedConcepts()
	 * @generated
	 * @ordered
	 */
	protected long deletedConcepts = DELETED_CONCEPTS_EDEFAULT;

	/**
	 * This is true if the Deleted Concepts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deletedConceptsESet;

	/**
	 * The default value of the '{@link #getInsertedConcepts() <em>Inserted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedConcepts()
	 * @generated
	 * @ordered
	 */
	protected static final long INSERTED_CONCEPTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getInsertedConcepts() <em>Inserted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertedConcepts()
	 * @generated
	 * @ordered
	 */
	protected long insertedConcepts = INSERTED_CONCEPTS_EDEFAULT;

	/**
	 * This is true if the Inserted Concepts attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean insertedConceptsESet;

	/**
	 * The default value of the '{@link #getParsingResult() <em>Parsing Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsingResult()
	 * @generated
	 * @ordered
	 */
	protected static final ParsingResultT PARSING_RESULT_EDEFAULT = ParsingResultT.CORRECTLYUNDERSTOOD;

	/**
	 * The cached value of the '{@link #getParsingResult() <em>Parsing Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParsingResult()
	 * @generated
	 * @ordered
	 */
	protected ParsingResultT parsingResult = PARSING_RESULT_EDEFAULT;

	/**
	 * This is true if the Parsing Result attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean parsingResultESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SPEECH_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOverallWords() {
		return overallWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWords(long newOverallWords) {
		long oldOverallWords = overallWords;
		overallWords = newOverallWords;
		boolean oldOverallWordsESet = overallWordsESet;
		overallWordsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__OVERALL_WORDS, oldOverallWords, overallWords, !oldOverallWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallWords() {
		long oldOverallWords = overallWords;
		boolean oldOverallWordsESet = overallWordsESet;
		overallWords = OVERALL_WORDS_EDEFAULT;
		overallWordsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__OVERALL_WORDS, oldOverallWords, OVERALL_WORDS_EDEFAULT, oldOverallWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallWords() {
		return overallWordsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubstitutedWords() {
		return substitutedWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutedWords(long newSubstitutedWords) {
		long oldSubstitutedWords = substitutedWords;
		substitutedWords = newSubstitutedWords;
		boolean oldSubstitutedWordsESet = substitutedWordsESet;
		substitutedWordsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__SUBSTITUTED_WORDS, oldSubstitutedWords, substitutedWords, !oldSubstitutedWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubstitutedWords() {
		long oldSubstitutedWords = substitutedWords;
		boolean oldSubstitutedWordsESet = substitutedWordsESet;
		substitutedWords = SUBSTITUTED_WORDS_EDEFAULT;
		substitutedWordsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__SUBSTITUTED_WORDS, oldSubstitutedWords, SUBSTITUTED_WORDS_EDEFAULT, oldSubstitutedWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubstitutedWords() {
		return substitutedWordsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDeletedWords() {
		return deletedWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedWords(long newDeletedWords) {
		long oldDeletedWords = deletedWords;
		deletedWords = newDeletedWords;
		boolean oldDeletedWordsESet = deletedWordsESet;
		deletedWordsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__DELETED_WORDS, oldDeletedWords, deletedWords, !oldDeletedWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletedWords() {
		long oldDeletedWords = deletedWords;
		boolean oldDeletedWordsESet = deletedWordsESet;
		deletedWords = DELETED_WORDS_EDEFAULT;
		deletedWordsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__DELETED_WORDS, oldDeletedWords, DELETED_WORDS_EDEFAULT, oldDeletedWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletedWords() {
		return deletedWordsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInsertedWords() {
		return insertedWords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertedWords(long newInsertedWords) {
		long oldInsertedWords = insertedWords;
		insertedWords = newInsertedWords;
		boolean oldInsertedWordsESet = insertedWordsESet;
		insertedWordsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__INSERTED_WORDS, oldInsertedWords, insertedWords, !oldInsertedWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInsertedWords() {
		long oldInsertedWords = insertedWords;
		boolean oldInsertedWordsESet = insertedWordsESet;
		insertedWords = INSERTED_WORDS_EDEFAULT;
		insertedWordsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__INSERTED_WORDS, oldInsertedWords, INSERTED_WORDS_EDEFAULT, oldInsertedWordsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInsertedWords() {
		return insertedWordsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOverallSentences() {
		return overallSentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallSentences(long newOverallSentences) {
		long oldOverallSentences = overallSentences;
		overallSentences = newOverallSentences;
		boolean oldOverallSentencesESet = overallSentencesESet;
		overallSentencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__OVERALL_SENTENCES, oldOverallSentences, overallSentences, !oldOverallSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallSentences() {
		long oldOverallSentences = overallSentences;
		boolean oldOverallSentencesESet = overallSentencesESet;
		overallSentences = OVERALL_SENTENCES_EDEFAULT;
		overallSentencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__OVERALL_SENTENCES, oldOverallSentences, OVERALL_SENTENCES_EDEFAULT, oldOverallSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallSentences() {
		return overallSentencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubstitutedSentences() {
		return substitutedSentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutedSentences(long newSubstitutedSentences) {
		long oldSubstitutedSentences = substitutedSentences;
		substitutedSentences = newSubstitutedSentences;
		boolean oldSubstitutedSentencesESet = substitutedSentencesESet;
		substitutedSentencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__SUBSTITUTED_SENTENCES, oldSubstitutedSentences, substitutedSentences, !oldSubstitutedSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubstitutedSentences() {
		long oldSubstitutedSentences = substitutedSentences;
		boolean oldSubstitutedSentencesESet = substitutedSentencesESet;
		substitutedSentences = SUBSTITUTED_SENTENCES_EDEFAULT;
		substitutedSentencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__SUBSTITUTED_SENTENCES, oldSubstitutedSentences, SUBSTITUTED_SENTENCES_EDEFAULT, oldSubstitutedSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubstitutedSentences() {
		return substitutedSentencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDeletedSentences() {
		return deletedSentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedSentences(long newDeletedSentences) {
		long oldDeletedSentences = deletedSentences;
		deletedSentences = newDeletedSentences;
		boolean oldDeletedSentencesESet = deletedSentencesESet;
		deletedSentencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__DELETED_SENTENCES, oldDeletedSentences, deletedSentences, !oldDeletedSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletedSentences() {
		long oldDeletedSentences = deletedSentences;
		boolean oldDeletedSentencesESet = deletedSentencesESet;
		deletedSentences = DELETED_SENTENCES_EDEFAULT;
		deletedSentencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__DELETED_SENTENCES, oldDeletedSentences, DELETED_SENTENCES_EDEFAULT, oldDeletedSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletedSentences() {
		return deletedSentencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInsertedSentences() {
		return insertedSentences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertedSentences(long newInsertedSentences) {
		long oldInsertedSentences = insertedSentences;
		insertedSentences = newInsertedSentences;
		boolean oldInsertedSentencesESet = insertedSentencesESet;
		insertedSentencesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__INSERTED_SENTENCES, oldInsertedSentences, insertedSentences, !oldInsertedSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInsertedSentences() {
		long oldInsertedSentences = insertedSentences;
		boolean oldInsertedSentencesESet = insertedSentencesESet;
		insertedSentences = INSERTED_SENTENCES_EDEFAULT;
		insertedSentencesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__INSERTED_SENTENCES, oldInsertedSentences, INSERTED_SENTENCES_EDEFAULT, oldInsertedSentencesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInsertedSentences() {
		return insertedSentencesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getOverallConcepts() {
		return overallConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallConcepts(long newOverallConcepts) {
		long oldOverallConcepts = overallConcepts;
		overallConcepts = newOverallConcepts;
		boolean oldOverallConceptsESet = overallConceptsESet;
		overallConceptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__OVERALL_CONCEPTS, oldOverallConcepts, overallConcepts, !oldOverallConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverallConcepts() {
		long oldOverallConcepts = overallConcepts;
		boolean oldOverallConceptsESet = overallConceptsESet;
		overallConcepts = OVERALL_CONCEPTS_EDEFAULT;
		overallConceptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__OVERALL_CONCEPTS, oldOverallConcepts, OVERALL_CONCEPTS_EDEFAULT, oldOverallConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverallConcepts() {
		return overallConceptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSubstitutedConcepts() {
		return substitutedConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstitutedConcepts(long newSubstitutedConcepts) {
		long oldSubstitutedConcepts = substitutedConcepts;
		substitutedConcepts = newSubstitutedConcepts;
		boolean oldSubstitutedConceptsESet = substitutedConceptsESet;
		substitutedConceptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__SUBSTITUTED_CONCEPTS, oldSubstitutedConcepts, substitutedConcepts, !oldSubstitutedConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSubstitutedConcepts() {
		long oldSubstitutedConcepts = substitutedConcepts;
		boolean oldSubstitutedConceptsESet = substitutedConceptsESet;
		substitutedConcepts = SUBSTITUTED_CONCEPTS_EDEFAULT;
		substitutedConceptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__SUBSTITUTED_CONCEPTS, oldSubstitutedConcepts, SUBSTITUTED_CONCEPTS_EDEFAULT, oldSubstitutedConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSubstitutedConcepts() {
		return substitutedConceptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDeletedConcepts() {
		return deletedConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeletedConcepts(long newDeletedConcepts) {
		long oldDeletedConcepts = deletedConcepts;
		deletedConcepts = newDeletedConcepts;
		boolean oldDeletedConceptsESet = deletedConceptsESet;
		deletedConceptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__DELETED_CONCEPTS, oldDeletedConcepts, deletedConcepts, !oldDeletedConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeletedConcepts() {
		long oldDeletedConcepts = deletedConcepts;
		boolean oldDeletedConceptsESet = deletedConceptsESet;
		deletedConcepts = DELETED_CONCEPTS_EDEFAULT;
		deletedConceptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__DELETED_CONCEPTS, oldDeletedConcepts, DELETED_CONCEPTS_EDEFAULT, oldDeletedConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeletedConcepts() {
		return deletedConceptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getInsertedConcepts() {
		return insertedConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertedConcepts(long newInsertedConcepts) {
		long oldInsertedConcepts = insertedConcepts;
		insertedConcepts = newInsertedConcepts;
		boolean oldInsertedConceptsESet = insertedConceptsESet;
		insertedConceptsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__INSERTED_CONCEPTS, oldInsertedConcepts, insertedConcepts, !oldInsertedConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInsertedConcepts() {
		long oldInsertedConcepts = insertedConcepts;
		boolean oldInsertedConceptsESet = insertedConceptsESet;
		insertedConcepts = INSERTED_CONCEPTS_EDEFAULT;
		insertedConceptsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__INSERTED_CONCEPTS, oldInsertedConcepts, INSERTED_CONCEPTS_EDEFAULT, oldInsertedConceptsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInsertedConcepts() {
		return insertedConceptsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingResultT getParsingResult() {
		return parsingResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParsingResult(ParsingResultT newParsingResult) {
		ParsingResultT oldParsingResult = parsingResult;
		parsingResult = newParsingResult == null ? PARSING_RESULT_EDEFAULT : newParsingResult;
		boolean oldParsingResultESet = parsingResultESet;
		parsingResultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_INPUT__PARSING_RESULT, oldParsingResult, parsingResult, !oldParsingResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetParsingResult() {
		ParsingResultT oldParsingResult = parsingResult;
		boolean oldParsingResultESet = parsingResultESet;
		parsingResult = PARSING_RESULT_EDEFAULT;
		parsingResultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_INPUT__PARSING_RESULT, oldParsingResult, PARSING_RESULT_EDEFAULT, oldParsingResultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParsingResult() {
		return parsingResultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SPEECH_INPUT__OVERALL_WORDS:
				return getOverallWords();
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_WORDS:
				return getSubstitutedWords();
			case ModelPackage.SPEECH_INPUT__DELETED_WORDS:
				return getDeletedWords();
			case ModelPackage.SPEECH_INPUT__INSERTED_WORDS:
				return getInsertedWords();
			case ModelPackage.SPEECH_INPUT__OVERALL_SENTENCES:
				return getOverallSentences();
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_SENTENCES:
				return getSubstitutedSentences();
			case ModelPackage.SPEECH_INPUT__DELETED_SENTENCES:
				return getDeletedSentences();
			case ModelPackage.SPEECH_INPUT__INSERTED_SENTENCES:
				return getInsertedSentences();
			case ModelPackage.SPEECH_INPUT__OVERALL_CONCEPTS:
				return getOverallConcepts();
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_CONCEPTS:
				return getSubstitutedConcepts();
			case ModelPackage.SPEECH_INPUT__DELETED_CONCEPTS:
				return getDeletedConcepts();
			case ModelPackage.SPEECH_INPUT__INSERTED_CONCEPTS:
				return getInsertedConcepts();
			case ModelPackage.SPEECH_INPUT__PARSING_RESULT:
				return getParsingResult();
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
			case ModelPackage.SPEECH_INPUT__OVERALL_WORDS:
				setOverallWords((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_WORDS:
				setSubstitutedWords((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__DELETED_WORDS:
				setDeletedWords((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__INSERTED_WORDS:
				setInsertedWords((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__OVERALL_SENTENCES:
				setOverallSentences((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_SENTENCES:
				setSubstitutedSentences((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__DELETED_SENTENCES:
				setDeletedSentences((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__INSERTED_SENTENCES:
				setInsertedSentences((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__OVERALL_CONCEPTS:
				setOverallConcepts((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_CONCEPTS:
				setSubstitutedConcepts((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__DELETED_CONCEPTS:
				setDeletedConcepts((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__INSERTED_CONCEPTS:
				setInsertedConcepts((Long)newValue);
				return;
			case ModelPackage.SPEECH_INPUT__PARSING_RESULT:
				setParsingResult((ParsingResultT)newValue);
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
			case ModelPackage.SPEECH_INPUT__OVERALL_WORDS:
				unsetOverallWords();
				return;
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_WORDS:
				unsetSubstitutedWords();
				return;
			case ModelPackage.SPEECH_INPUT__DELETED_WORDS:
				unsetDeletedWords();
				return;
			case ModelPackage.SPEECH_INPUT__INSERTED_WORDS:
				unsetInsertedWords();
				return;
			case ModelPackage.SPEECH_INPUT__OVERALL_SENTENCES:
				unsetOverallSentences();
				return;
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_SENTENCES:
				unsetSubstitutedSentences();
				return;
			case ModelPackage.SPEECH_INPUT__DELETED_SENTENCES:
				unsetDeletedSentences();
				return;
			case ModelPackage.SPEECH_INPUT__INSERTED_SENTENCES:
				unsetInsertedSentences();
				return;
			case ModelPackage.SPEECH_INPUT__OVERALL_CONCEPTS:
				unsetOverallConcepts();
				return;
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_CONCEPTS:
				unsetSubstitutedConcepts();
				return;
			case ModelPackage.SPEECH_INPUT__DELETED_CONCEPTS:
				unsetDeletedConcepts();
				return;
			case ModelPackage.SPEECH_INPUT__INSERTED_CONCEPTS:
				unsetInsertedConcepts();
				return;
			case ModelPackage.SPEECH_INPUT__PARSING_RESULT:
				unsetParsingResult();
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
			case ModelPackage.SPEECH_INPUT__OVERALL_WORDS:
				return isSetOverallWords();
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_WORDS:
				return isSetSubstitutedWords();
			case ModelPackage.SPEECH_INPUT__DELETED_WORDS:
				return isSetDeletedWords();
			case ModelPackage.SPEECH_INPUT__INSERTED_WORDS:
				return isSetInsertedWords();
			case ModelPackage.SPEECH_INPUT__OVERALL_SENTENCES:
				return isSetOverallSentences();
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_SENTENCES:
				return isSetSubstitutedSentences();
			case ModelPackage.SPEECH_INPUT__DELETED_SENTENCES:
				return isSetDeletedSentences();
			case ModelPackage.SPEECH_INPUT__INSERTED_SENTENCES:
				return isSetInsertedSentences();
			case ModelPackage.SPEECH_INPUT__OVERALL_CONCEPTS:
				return isSetOverallConcepts();
			case ModelPackage.SPEECH_INPUT__SUBSTITUTED_CONCEPTS:
				return isSetSubstitutedConcepts();
			case ModelPackage.SPEECH_INPUT__DELETED_CONCEPTS:
				return isSetDeletedConcepts();
			case ModelPackage.SPEECH_INPUT__INSERTED_CONCEPTS:
				return isSetInsertedConcepts();
			case ModelPackage.SPEECH_INPUT__PARSING_RESULT:
				return isSetParsingResult();
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
		result.append(" (overallWords: ");
		if (overallWordsESet) result.append(overallWords); else result.append("<unset>");
		result.append(", substitutedWords: ");
		if (substitutedWordsESet) result.append(substitutedWords); else result.append("<unset>");
		result.append(", deletedWords: ");
		if (deletedWordsESet) result.append(deletedWords); else result.append("<unset>");
		result.append(", insertedWords: ");
		if (insertedWordsESet) result.append(insertedWords); else result.append("<unset>");
		result.append(", overallSentences: ");
		if (overallSentencesESet) result.append(overallSentences); else result.append("<unset>");
		result.append(", substitutedSentences: ");
		if (substitutedSentencesESet) result.append(substitutedSentences); else result.append("<unset>");
		result.append(", deletedSentences: ");
		if (deletedSentencesESet) result.append(deletedSentences); else result.append("<unset>");
		result.append(", insertedSentences: ");
		if (insertedSentencesESet) result.append(insertedSentences); else result.append("<unset>");
		result.append(", overallConcepts: ");
		if (overallConceptsESet) result.append(overallConcepts); else result.append("<unset>");
		result.append(", substitutedConcepts: ");
		if (substitutedConceptsESet) result.append(substitutedConcepts); else result.append("<unset>");
		result.append(", deletedConcepts: ");
		if (deletedConceptsESet) result.append(deletedConcepts); else result.append("<unset>");
		result.append(", insertedConcepts: ");
		if (insertedConceptsESet) result.append(insertedConcepts); else result.append("<unset>");
		result.append(", parsingResult: ");
		if (parsingResultESet) result.append(parsingResult); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpeechInputImpl
