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
 * A representation of the model object '<em><b>Modality Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.ModalityInfo#getModalityType <em>Modality Type</em>}</li>
 *   <li>{@link org.mmi.model.ModalityInfo#getMmiType <em>Mmi Type</em>}</li>
 *   <li>{@link org.mmi.model.ModalityInfo#getAppropriateness <em>Appropriateness</em>}</li>
 *   <li>{@link org.mmi.model.ModalityInfo#getSynchroni <em>Synchroni</em>}</li>
 *   <li>{@link org.mmi.model.ModalityInfo#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getModalityInfo()
 * @model extendedMetaData="name='ModalityInfo' kind='elementOnly'"
 * @generated
 */
public interface ModalityInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Modality Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.ModTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality Type</em>' attribute.
	 * @see org.mmi.model.ModTypeT
	 * @see #isSetModalityType()
	 * @see #unsetModalityType()
	 * @see #setModalityType(ModTypeT)
	 * @see org.mmi.model.ModelPackage#getModalityInfo_ModalityType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='modalityType' namespace='##targetNamespace'"
	 * @generated
	 */
	ModTypeT getModalityType();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityInfo#getModalityType <em>Modality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality Type</em>' attribute.
	 * @see org.mmi.model.ModTypeT
	 * @see #isSetModalityType()
	 * @see #unsetModalityType()
	 * @see #getModalityType()
	 * @generated
	 */
	void setModalityType(ModTypeT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalityInfo#getModalityType <em>Modality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModalityType()
	 * @see #getModalityType()
	 * @see #setModalityType(ModTypeT)
	 * @generated
	 */
	void unsetModalityType();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalityInfo#getModalityType <em>Modality Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modality Type</em>' attribute is set.
	 * @see #unsetModalityType()
	 * @see #getModalityType()
	 * @see #setModalityType(ModTypeT)
	 * @generated
	 */
	boolean isSetModalityType();

	/**
	 * Returns the value of the '<em><b>Mmi Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.MmiTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mmi Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mmi Type</em>' attribute.
	 * @see org.mmi.model.MmiTypeT
	 * @see #isSetMmiType()
	 * @see #unsetMmiType()
	 * @see #setMmiType(MmiTypeT)
	 * @see org.mmi.model.ModelPackage#getModalityInfo_MmiType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='mmiType' namespace='##targetNamespace'"
	 * @generated
	 */
	MmiTypeT getMmiType();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityInfo#getMmiType <em>Mmi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mmi Type</em>' attribute.
	 * @see org.mmi.model.MmiTypeT
	 * @see #isSetMmiType()
	 * @see #unsetMmiType()
	 * @see #getMmiType()
	 * @generated
	 */
	void setMmiType(MmiTypeT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalityInfo#getMmiType <em>Mmi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMmiType()
	 * @see #getMmiType()
	 * @see #setMmiType(MmiTypeT)
	 * @generated
	 */
	void unsetMmiType();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalityInfo#getMmiType <em>Mmi Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mmi Type</em>' attribute is set.
	 * @see #unsetMmiType()
	 * @see #getMmiType()
	 * @see #setMmiType(MmiTypeT)
	 * @generated
	 */
	boolean isSetMmiType();

	/**
	 * Returns the value of the '<em><b>Appropriateness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appropriateness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appropriateness</em>' containment reference.
	 * @see #setAppropriateness(ModalityAppropriateness)
	 * @see org.mmi.model.ModelPackage#getModalityInfo_Appropriateness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appropriateness' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityAppropriateness getAppropriateness();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityInfo#getAppropriateness <em>Appropriateness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appropriateness</em>' containment reference.
	 * @see #getAppropriateness()
	 * @generated
	 */
	void setAppropriateness(ModalityAppropriateness value);

	/**
	 * Returns the value of the '<em><b>Synchroni</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchroni</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchroni</em>' containment reference.
	 * @see #setSynchroni(ModalitySynchroni)
	 * @see org.mmi.model.ModelPackage#getModalityInfo_Synchroni()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synchroni' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalitySynchroni getSynchroni();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityInfo#getSynchroni <em>Synchroni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchroni</em>' containment reference.
	 * @see #getSynchroni()
	 * @generated
	 */
	void setSynchroni(ModalitySynchroni value);

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference.
	 * @see #setChange(ModalityChange)
	 * @see org.mmi.model.ModelPackage#getModalityInfo_Change()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='change' namespace='##targetNamespace'"
	 * @generated
	 */
	ModalityChange getChange();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityInfo#getChange <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change</em>' containment reference.
	 * @see #getChange()
	 * @generated
	 */
	void setChange(ModalityChange value);

} // ModalityInfo
