/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Metacomm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.SystemMetacomm#isIsASRReject <em>Is ASR Reject</em>}</li>
 *   <li>{@link org.mmi.model.SystemMetacomm#isIsDIVReject <em>Is DIV Reject</em>}</li>
 *   <li>{@link org.mmi.model.SystemMetacomm#isIsGRReject <em>Is GR Reject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getSystemMetacomm()
 * @model extendedMetaData="name='SystemMetacomm' kind='elementOnly'"
 * @generated
 */
public interface SystemMetacomm extends Metacomm {
	/**
	 * Returns the value of the '<em><b>Is ASR Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ASR Reject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ASR Reject</em>' attribute.
	 * @see #isSetIsASRReject()
	 * @see #unsetIsASRReject()
	 * @see #setIsASRReject(boolean)
	 * @see org.mmi.model.ModelPackage#getSystemMetacomm_IsASRReject()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isASRReject' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsASRReject();

	/**
	 * Sets the value of the '{@link org.mmi.model.SystemMetacomm#isIsASRReject <em>Is ASR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ASR Reject</em>' attribute.
	 * @see #isSetIsASRReject()
	 * @see #unsetIsASRReject()
	 * @see #isIsASRReject()
	 * @generated
	 */
	void setIsASRReject(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SystemMetacomm#isIsASRReject <em>Is ASR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsASRReject()
	 * @see #isIsASRReject()
	 * @see #setIsASRReject(boolean)
	 * @generated
	 */
	void unsetIsASRReject();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SystemMetacomm#isIsASRReject <em>Is ASR Reject</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is ASR Reject</em>' attribute is set.
	 * @see #unsetIsASRReject()
	 * @see #isIsASRReject()
	 * @see #setIsASRReject(boolean)
	 * @generated
	 */
	boolean isSetIsASRReject();

	/**
	 * Returns the value of the '<em><b>Is DIV Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is DIV Reject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is DIV Reject</em>' attribute.
	 * @see #isSetIsDIVReject()
	 * @see #unsetIsDIVReject()
	 * @see #setIsDIVReject(boolean)
	 * @see org.mmi.model.ModelPackage#getSystemMetacomm_IsDIVReject()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isDIVReject' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsDIVReject();

	/**
	 * Sets the value of the '{@link org.mmi.model.SystemMetacomm#isIsDIVReject <em>Is DIV Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is DIV Reject</em>' attribute.
	 * @see #isSetIsDIVReject()
	 * @see #unsetIsDIVReject()
	 * @see #isIsDIVReject()
	 * @generated
	 */
	void setIsDIVReject(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SystemMetacomm#isIsDIVReject <em>Is DIV Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDIVReject()
	 * @see #isIsDIVReject()
	 * @see #setIsDIVReject(boolean)
	 * @generated
	 */
	void unsetIsDIVReject();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SystemMetacomm#isIsDIVReject <em>Is DIV Reject</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is DIV Reject</em>' attribute is set.
	 * @see #unsetIsDIVReject()
	 * @see #isIsDIVReject()
	 * @see #setIsDIVReject(boolean)
	 * @generated
	 */
	boolean isSetIsDIVReject();

	/**
	 * Returns the value of the '<em><b>Is GR Reject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is GR Reject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is GR Reject</em>' attribute.
	 * @see #isSetIsGRReject()
	 * @see #unsetIsGRReject()
	 * @see #setIsGRReject(boolean)
	 * @see org.mmi.model.ModelPackage#getSystemMetacomm_IsGRReject()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isGRReject' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsGRReject();

	/**
	 * Sets the value of the '{@link org.mmi.model.SystemMetacomm#isIsGRReject <em>Is GR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is GR Reject</em>' attribute.
	 * @see #isSetIsGRReject()
	 * @see #unsetIsGRReject()
	 * @see #isIsGRReject()
	 * @generated
	 */
	void setIsGRReject(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.SystemMetacomm#isIsGRReject <em>Is GR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsGRReject()
	 * @see #isIsGRReject()
	 * @see #setIsGRReject(boolean)
	 * @generated
	 */
	void unsetIsGRReject();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.SystemMetacomm#isIsGRReject <em>Is GR Reject</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is GR Reject</em>' attribute is set.
	 * @see #unsetIsGRReject()
	 * @see #isIsGRReject()
	 * @see #setIsGRReject(boolean)
	 * @generated
	 */
	boolean isSetIsGRReject();

} // SystemMetacomm
