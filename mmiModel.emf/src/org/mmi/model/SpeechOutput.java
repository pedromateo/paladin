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
 * A representation of the model object '<em><b>Speech Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.SpeechOutput#getANCO <em>ANCO</em>}</li>
 *   <li>{@link org.mmi.model.SpeechOutput#getANIN <em>ANIN</em>}</li>
 *   <li>{@link org.mmi.model.SpeechOutput#getANPA <em>ANPA</em>}</li>
 *   <li>{@link org.mmi.model.SpeechOutput#getANFA <em>ANFA</em>}</li>
 *   <li>{@link org.mmi.model.SpeechOutput#getPromptType <em>Prompt Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getSpeechOutput()
 * @model extendedMetaData="name='SpeechOutput' kind='elementOnly'"
 * @generated
 */
public interface SpeechOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>ANCO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANCO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANCO</em>' attribute.
	 * @see #isSetANCO()
	 * @see #unsetANCO()
	 * @see #setANCO(long)
	 * @see org.mmi.model.ModelPackage#getSpeechOutput_ANCO()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='AN_CO' namespace='##targetNamespace'"
	 * @generated
	 */
	long getANCO();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechOutput#getANCO <em>ANCO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANCO</em>' attribute.
	 * @see #isSetANCO()
	 * @see #unsetANCO()
	 * @see #getANCO()
	 * @generated
	 */
	void setANCO(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechOutput#getANCO <em>ANCO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetANCO()
	 * @see #getANCO()
	 * @see #setANCO(long)
	 * @generated
	 */
	void unsetANCO();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechOutput#getANCO <em>ANCO</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ANCO</em>' attribute is set.
	 * @see #unsetANCO()
	 * @see #getANCO()
	 * @see #setANCO(long)
	 * @generated
	 */
	boolean isSetANCO();

	/**
	 * Returns the value of the '<em><b>ANIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANIN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANIN</em>' attribute.
	 * @see #isSetANIN()
	 * @see #unsetANIN()
	 * @see #setANIN(long)
	 * @see org.mmi.model.ModelPackage#getSpeechOutput_ANIN()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='AN_IN' namespace='##targetNamespace'"
	 * @generated
	 */
	long getANIN();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechOutput#getANIN <em>ANIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANIN</em>' attribute.
	 * @see #isSetANIN()
	 * @see #unsetANIN()
	 * @see #getANIN()
	 * @generated
	 */
	void setANIN(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechOutput#getANIN <em>ANIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetANIN()
	 * @see #getANIN()
	 * @see #setANIN(long)
	 * @generated
	 */
	void unsetANIN();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechOutput#getANIN <em>ANIN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ANIN</em>' attribute is set.
	 * @see #unsetANIN()
	 * @see #getANIN()
	 * @see #setANIN(long)
	 * @generated
	 */
	boolean isSetANIN();

	/**
	 * Returns the value of the '<em><b>ANPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANPA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANPA</em>' attribute.
	 * @see #isSetANPA()
	 * @see #unsetANPA()
	 * @see #setANPA(long)
	 * @see org.mmi.model.ModelPackage#getSpeechOutput_ANPA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='AN_PA' namespace='##targetNamespace'"
	 * @generated
	 */
	long getANPA();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechOutput#getANPA <em>ANPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANPA</em>' attribute.
	 * @see #isSetANPA()
	 * @see #unsetANPA()
	 * @see #getANPA()
	 * @generated
	 */
	void setANPA(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechOutput#getANPA <em>ANPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetANPA()
	 * @see #getANPA()
	 * @see #setANPA(long)
	 * @generated
	 */
	void unsetANPA();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechOutput#getANPA <em>ANPA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ANPA</em>' attribute is set.
	 * @see #unsetANPA()
	 * @see #getANPA()
	 * @see #setANPA(long)
	 * @generated
	 */
	boolean isSetANPA();

	/**
	 * Returns the value of the '<em><b>ANFA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ANFA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ANFA</em>' attribute.
	 * @see #isSetANFA()
	 * @see #unsetANFA()
	 * @see #setANFA(long)
	 * @see org.mmi.model.ModelPackage#getSpeechOutput_ANFA()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='AN_FA' namespace='##targetNamespace'"
	 * @generated
	 */
	long getANFA();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechOutput#getANFA <em>ANFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ANFA</em>' attribute.
	 * @see #isSetANFA()
	 * @see #unsetANFA()
	 * @see #getANFA()
	 * @generated
	 */
	void setANFA(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechOutput#getANFA <em>ANFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetANFA()
	 * @see #getANFA()
	 * @see #setANFA(long)
	 * @generated
	 */
	void unsetANFA();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechOutput#getANFA <em>ANFA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ANFA</em>' attribute is set.
	 * @see #unsetANFA()
	 * @see #getANFA()
	 * @see #setANFA(long)
	 * @generated
	 */
	boolean isSetANFA();

	/**
	 * Returns the value of the '<em><b>Prompt Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.PromptTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prompt Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prompt Type</em>' attribute.
	 * @see org.mmi.model.PromptTypeT
	 * @see #isSetPromptType()
	 * @see #unsetPromptType()
	 * @see #setPromptType(PromptTypeT)
	 * @see org.mmi.model.ModelPackage#getSpeechOutput_PromptType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='promptType' namespace='##targetNamespace'"
	 * @generated
	 */
	PromptTypeT getPromptType();

	/**
	 * Sets the value of the '{@link org.mmi.model.SpeechOutput#getPromptType <em>Prompt Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt Type</em>' attribute.
	 * @see org.mmi.model.PromptTypeT
	 * @see #isSetPromptType()
	 * @see #unsetPromptType()
	 * @see #getPromptType()
	 * @generated
	 */
	void setPromptType(PromptTypeT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SpeechOutput#getPromptType <em>Prompt Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPromptType()
	 * @see #getPromptType()
	 * @see #setPromptType(PromptTypeT)
	 * @generated
	 */
	void unsetPromptType();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SpeechOutput#getPromptType <em>Prompt Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prompt Type</em>' attribute is set.
	 * @see #unsetPromptType()
	 * @see #getPromptType()
	 * @see #setPromptType(PromptTypeT)
	 * @generated
	 */
	boolean isSetPromptType();

} // SpeechOutput
