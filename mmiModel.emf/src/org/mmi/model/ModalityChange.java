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
 * A representation of the model object '<em><b>Modality Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.ModalityChange#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.mmi.model.ModalityChange#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getModalityChange()
 * @model extendedMetaData="name='ModalityChange' kind='elementOnly'"
 * @generated
 */
public interface ModalityChange extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.RoleT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see org.mmi.model.RoleT
	 * @see #isSetOrigin()
	 * @see #unsetOrigin()
	 * @see #setOrigin(RoleT)
	 * @see org.mmi.model.ModelPackage#getModalityChange_Origin()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='origin' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleT getOrigin();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityChange#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see org.mmi.model.RoleT
	 * @see #isSetOrigin()
	 * @see #unsetOrigin()
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(RoleT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalityChange#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrigin()
	 * @see #getOrigin()
	 * @see #setOrigin(RoleT)
	 * @generated
	 */
	void unsetOrigin();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalityChange#getOrigin <em>Origin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Origin</em>' attribute is set.
	 * @see #unsetOrigin()
	 * @see #getOrigin()
	 * @see #setOrigin(RoleT)
	 * @generated
	 */
	boolean isSetOrigin();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mmi.model.McReasonT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see org.mmi.model.McReasonT
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #setReason(McReasonT)
	 * @see org.mmi.model.ModelPackage#getModalityChange_Reason()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	McReasonT getReason();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalityChange#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see org.mmi.model.McReasonT
	 * @see #isSetReason()
	 * @see #unsetReason()
	 * @see #getReason()
	 * @generated
	 */
	void setReason(McReasonT value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalityChange#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReason()
	 * @see #getReason()
	 * @see #setReason(McReasonT)
	 * @generated
	 */
	void unsetReason();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalityChange#getReason <em>Reason</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reason</em>' attribute is set.
	 * @see #unsetReason()
	 * @see #getReason()
	 * @see #setReason(McReasonT)
	 * @generated
	 */
	boolean isSetReason();

} // ModalityChange
