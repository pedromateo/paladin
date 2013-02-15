/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speech Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.SpeechInput#getOverallWords <em>Overall Words</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getSubstitutedWords <em>Substituted Words</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getDeletedWords <em>Deleted Words</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getInsertedWords <em>Inserted Words</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getOverallSentences <em>Overall Sentences</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getSubstitutedSentences <em>Substituted Sentences</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getDeletedSentences <em>Deleted Sentences</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getInsertedSentences <em>Inserted Sentences</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getOverallConcepts <em>Overall Concepts</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getSubstitutedConcepts <em>Substituted Concepts</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getDeletedConcepts <em>Deleted Concepts</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getInsertedConcepts <em>Inserted Concepts</em>}</li>
 *   <li>{@link org.mmi.model.SpeechInput#getParsingResult <em>Parsing Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getSpeechInput()
 * @model extendedMetaData="name='SpeechInput' kind='elementOnly'"
 * @generated
 */
public interface SpeechInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Overall Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Words</em>' attribute.
	 * @see #isSetOverallWords()
	 * @see #unsetOverallWords()
	 * @see #setOverallWords(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_OverallWords()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='overallWords' namespace='##targetNamespace'"
	 * @generated
	 */
	long getOverallWords();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getOverallWords <em>Overall Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Words</em>' attribute.
	 * @see #isSetOverallWords()
	 * @see #unsetOverallWords()
	 * @see #getOverallWords()
	 * @generated
	 */
	void setOverallWords(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getOverallWords <em>Overall Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallWords()
	 * @see #getOverallWords()
	 * @see #setOverallWords(long)
	 * @generated
	 */
	void unsetOverallWords();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getOverallWords <em>Overall Words</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Words</em>' attribute is set.
	 * @see #unsetOverallWords()
	 * @see #getOverallWords()
	 * @see #setOverallWords(long)
	 * @generated
	 */
	boolean isSetOverallWords();

	/**
	 * Returns the value of the '<em><b>Substituted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substituted Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substituted Words</em>' attribute.
	 * @see #isSetSubstitutedWords()
	 * @see #unsetSubstitutedWords()
	 * @see #setSubstitutedWords(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_SubstitutedWords()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='substitutedWords' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubstitutedWords();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedWords <em>Substituted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substituted Words</em>' attribute.
	 * @see #isSetSubstitutedWords()
	 * @see #unsetSubstitutedWords()
	 * @see #getSubstitutedWords()
	 * @generated
	 */
	void setSubstitutedWords(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedWords <em>Substituted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubstitutedWords()
	 * @see #getSubstitutedWords()
	 * @see #setSubstitutedWords(long)
	 * @generated
	 */
	void unsetSubstitutedWords();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedWords <em>Substituted Words</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Substituted Words</em>' attribute is set.
	 * @see #unsetSubstitutedWords()
	 * @see #getSubstitutedWords()
	 * @see #setSubstitutedWords(long)
	 * @generated
	 */
	boolean isSetSubstitutedWords();

	/**
	 * Returns the value of the '<em><b>Deleted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Words</em>' attribute.
	 * @see #isSetDeletedWords()
	 * @see #unsetDeletedWords()
	 * @see #setDeletedWords(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_DeletedWords()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='deletedWords' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDeletedWords();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getDeletedWords <em>Deleted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Words</em>' attribute.
	 * @see #isSetDeletedWords()
	 * @see #unsetDeletedWords()
	 * @see #getDeletedWords()
	 * @generated
	 */
	void setDeletedWords(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getDeletedWords <em>Deleted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletedWords()
	 * @see #getDeletedWords()
	 * @see #setDeletedWords(long)
	 * @generated
	 */
	void unsetDeletedWords();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getDeletedWords <em>Deleted Words</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deleted Words</em>' attribute is set.
	 * @see #unsetDeletedWords()
	 * @see #getDeletedWords()
	 * @see #setDeletedWords(long)
	 * @generated
	 */
	boolean isSetDeletedWords();

	/**
	 * Returns the value of the '<em><b>Inserted Words</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserted Words</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted Words</em>' attribute.
	 * @see #isSetInsertedWords()
	 * @see #unsetInsertedWords()
	 * @see #setInsertedWords(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_InsertedWords()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='insertedWords' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInsertedWords();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getInsertedWords <em>Inserted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserted Words</em>' attribute.
	 * @see #isSetInsertedWords()
	 * @see #unsetInsertedWords()
	 * @see #getInsertedWords()
	 * @generated
	 */
	void setInsertedWords(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getInsertedWords <em>Inserted Words</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsertedWords()
	 * @see #getInsertedWords()
	 * @see #setInsertedWords(long)
	 * @generated
	 */
	void unsetInsertedWords();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getInsertedWords <em>Inserted Words</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inserted Words</em>' attribute is set.
	 * @see #unsetInsertedWords()
	 * @see #getInsertedWords()
	 * @see #setInsertedWords(long)
	 * @generated
	 */
	boolean isSetInsertedWords();

	/**
	 * Returns the value of the '<em><b>Overall Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Sentences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Sentences</em>' attribute.
	 * @see #isSetOverallSentences()
	 * @see #unsetOverallSentences()
	 * @see #setOverallSentences(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_OverallSentences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='overallSentences' namespace='##targetNamespace'"
	 * @generated
	 */
	long getOverallSentences();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getOverallSentences <em>Overall Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Sentences</em>' attribute.
	 * @see #isSetOverallSentences()
	 * @see #unsetOverallSentences()
	 * @see #getOverallSentences()
	 * @generated
	 */
	void setOverallSentences(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getOverallSentences <em>Overall Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallSentences()
	 * @see #getOverallSentences()
	 * @see #setOverallSentences(long)
	 * @generated
	 */
	void unsetOverallSentences();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getOverallSentences <em>Overall Sentences</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Sentences</em>' attribute is set.
	 * @see #unsetOverallSentences()
	 * @see #getOverallSentences()
	 * @see #setOverallSentences(long)
	 * @generated
	 */
	boolean isSetOverallSentences();

	/**
	 * Returns the value of the '<em><b>Substituted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substituted Sentences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substituted Sentences</em>' attribute.
	 * @see #isSetSubstitutedSentences()
	 * @see #unsetSubstitutedSentences()
	 * @see #setSubstitutedSentences(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_SubstitutedSentences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='substitutedSentences' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubstitutedSentences();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedSentences <em>Substituted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substituted Sentences</em>' attribute.
	 * @see #isSetSubstitutedSentences()
	 * @see #unsetSubstitutedSentences()
	 * @see #getSubstitutedSentences()
	 * @generated
	 */
	void setSubstitutedSentences(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedSentences <em>Substituted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubstitutedSentences()
	 * @see #getSubstitutedSentences()
	 * @see #setSubstitutedSentences(long)
	 * @generated
	 */
	void unsetSubstitutedSentences();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedSentences <em>Substituted Sentences</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Substituted Sentences</em>' attribute is set.
	 * @see #unsetSubstitutedSentences()
	 * @see #getSubstitutedSentences()
	 * @see #setSubstitutedSentences(long)
	 * @generated
	 */
	boolean isSetSubstitutedSentences();

	/**
	 * Returns the value of the '<em><b>Deleted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Sentences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Sentences</em>' attribute.
	 * @see #isSetDeletedSentences()
	 * @see #unsetDeletedSentences()
	 * @see #setDeletedSentences(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_DeletedSentences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='deletedSentences' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDeletedSentences();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getDeletedSentences <em>Deleted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Sentences</em>' attribute.
	 * @see #isSetDeletedSentences()
	 * @see #unsetDeletedSentences()
	 * @see #getDeletedSentences()
	 * @generated
	 */
	void setDeletedSentences(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getDeletedSentences <em>Deleted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletedSentences()
	 * @see #getDeletedSentences()
	 * @see #setDeletedSentences(long)
	 * @generated
	 */
	void unsetDeletedSentences();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getDeletedSentences <em>Deleted Sentences</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deleted Sentences</em>' attribute is set.
	 * @see #unsetDeletedSentences()
	 * @see #getDeletedSentences()
	 * @see #setDeletedSentences(long)
	 * @generated
	 */
	boolean isSetDeletedSentences();

	/**
	 * Returns the value of the '<em><b>Inserted Sentences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserted Sentences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted Sentences</em>' attribute.
	 * @see #isSetInsertedSentences()
	 * @see #unsetInsertedSentences()
	 * @see #setInsertedSentences(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_InsertedSentences()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='insertedSentences' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInsertedSentences();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getInsertedSentences <em>Inserted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserted Sentences</em>' attribute.
	 * @see #isSetInsertedSentences()
	 * @see #unsetInsertedSentences()
	 * @see #getInsertedSentences()
	 * @generated
	 */
	void setInsertedSentences(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getInsertedSentences <em>Inserted Sentences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsertedSentences()
	 * @see #getInsertedSentences()
	 * @see #setInsertedSentences(long)
	 * @generated
	 */
	void unsetInsertedSentences();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getInsertedSentences <em>Inserted Sentences</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inserted Sentences</em>' attribute is set.
	 * @see #unsetInsertedSentences()
	 * @see #getInsertedSentences()
	 * @see #setInsertedSentences(long)
	 * @generated
	 */
	boolean isSetInsertedSentences();

	/**
	 * Returns the value of the '<em><b>Overall Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overall Concepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overall Concepts</em>' attribute.
	 * @see #isSetOverallConcepts()
	 * @see #unsetOverallConcepts()
	 * @see #setOverallConcepts(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_OverallConcepts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='overallConcepts' namespace='##targetNamespace'"
	 * @generated
	 */
	long getOverallConcepts();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getOverallConcepts <em>Overall Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overall Concepts</em>' attribute.
	 * @see #isSetOverallConcepts()
	 * @see #unsetOverallConcepts()
	 * @see #getOverallConcepts()
	 * @generated
	 */
	void setOverallConcepts(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getOverallConcepts <em>Overall Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverallConcepts()
	 * @see #getOverallConcepts()
	 * @see #setOverallConcepts(long)
	 * @generated
	 */
	void unsetOverallConcepts();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getOverallConcepts <em>Overall Concepts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Overall Concepts</em>' attribute is set.
	 * @see #unsetOverallConcepts()
	 * @see #getOverallConcepts()
	 * @see #setOverallConcepts(long)
	 * @generated
	 */
	boolean isSetOverallConcepts();

	/**
	 * Returns the value of the '<em><b>Substituted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substituted Concepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substituted Concepts</em>' attribute.
	 * @see #isSetSubstitutedConcepts()
	 * @see #unsetSubstitutedConcepts()
	 * @see #setSubstitutedConcepts(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_SubstitutedConcepts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='substitutedConcepts' namespace='##targetNamespace'"
	 * @generated
	 */
	long getSubstitutedConcepts();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedConcepts <em>Substituted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substituted Concepts</em>' attribute.
	 * @see #isSetSubstitutedConcepts()
	 * @see #unsetSubstitutedConcepts()
	 * @see #getSubstitutedConcepts()
	 * @generated
	 */
	void setSubstitutedConcepts(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedConcepts <em>Substituted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSubstitutedConcepts()
	 * @see #getSubstitutedConcepts()
	 * @see #setSubstitutedConcepts(long)
	 * @generated
	 */
	void unsetSubstitutedConcepts();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getSubstitutedConcepts <em>Substituted Concepts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Substituted Concepts</em>' attribute is set.
	 * @see #unsetSubstitutedConcepts()
	 * @see #getSubstitutedConcepts()
	 * @see #setSubstitutedConcepts(long)
	 * @generated
	 */
	boolean isSetSubstitutedConcepts();

	/**
	 * Returns the value of the '<em><b>Deleted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted Concepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted Concepts</em>' attribute.
	 * @see #isSetDeletedConcepts()
	 * @see #unsetDeletedConcepts()
	 * @see #setDeletedConcepts(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_DeletedConcepts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='deletedConcepts' namespace='##targetNamespace'"
	 * @generated
	 */
	long getDeletedConcepts();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getDeletedConcepts <em>Deleted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted Concepts</em>' attribute.
	 * @see #isSetDeletedConcepts()
	 * @see #unsetDeletedConcepts()
	 * @see #getDeletedConcepts()
	 * @generated
	 */
	void setDeletedConcepts(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getDeletedConcepts <em>Deleted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeletedConcepts()
	 * @see #getDeletedConcepts()
	 * @see #setDeletedConcepts(long)
	 * @generated
	 */
	void unsetDeletedConcepts();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getDeletedConcepts <em>Deleted Concepts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deleted Concepts</em>' attribute is set.
	 * @see #unsetDeletedConcepts()
	 * @see #getDeletedConcepts()
	 * @see #setDeletedConcepts(long)
	 * @generated
	 */
	boolean isSetDeletedConcepts();

	/**
	 * Returns the value of the '<em><b>Inserted Concepts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserted Concepts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted Concepts</em>' attribute.
	 * @see #isSetInsertedConcepts()
	 * @see #unsetInsertedConcepts()
	 * @see #setInsertedConcepts(long)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_InsertedConcepts()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='insertedConcepts' namespace='##targetNamespace'"
	 * @generated
	 */
	long getInsertedConcepts();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getInsertedConcepts <em>Inserted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserted Concepts</em>' attribute.
	 * @see #isSetInsertedConcepts()
	 * @see #unsetInsertedConcepts()
	 * @see #getInsertedConcepts()
	 * @generated
	 */
	void setInsertedConcepts(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getInsertedConcepts <em>Inserted Concepts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInsertedConcepts()
	 * @see #getInsertedConcepts()
	 * @see #setInsertedConcepts(long)
	 * @generated
	 */
	void unsetInsertedConcepts();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getInsertedConcepts <em>Inserted Concepts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inserted Concepts</em>' attribute is set.
	 * @see #unsetInsertedConcepts()
	 * @see #getInsertedConcepts()
	 * @see #setInsertedConcepts(long)
	 * @generated
	 */
	boolean isSetInsertedConcepts();

	/**
	 * Returns the value of the '<em><b>Parsing Result</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.ParsingResultT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parsing Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsing Result</em>' attribute.
	 * @see org.mmi.model.ParsingResultT
	 * @see #isSetParsingResult()
	 * @see #unsetParsingResult()
	 * @see #setParsingResult(ParsingResultT)
	 * @see org.mmi.model.ModelPackage#getSpeechInput_ParsingResult()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='parsingResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ParsingResultT getParsingResult();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechInput#getParsingResult <em>Parsing Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsing Result</em>' attribute.
	 * @see org.mmi.model.ParsingResultT
	 * @see #isSetParsingResult()
	 * @see #unsetParsingResult()
	 * @see #getParsingResult()
	 * @generated
	 */
	void setParsingResult(ParsingResultT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechInput#getParsingResult <em>Parsing Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParsingResult()
	 * @see #getParsingResult()
	 * @see #setParsingResult(ParsingResultT)
	 * @generated
	 */
	void unsetParsingResult();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechInput#getParsingResult <em>Parsing Result</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parsing Result</em>' attribute is set.
	 * @see #unsetParsingResult()
	 * @see #getParsingResult()
	 * @see #setParsingResult(ParsingResultT)
	 * @generated
	 */
	boolean isSetParsingResult();

} // SpeechInput
