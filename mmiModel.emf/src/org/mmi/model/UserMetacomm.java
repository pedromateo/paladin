/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Metacomm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.UserMetacomm#isIsTimeOut <em>Is Time Out</em>}</li>
 *   <li>{@link org.mmi.model.UserMetacomm#isIsCancel <em>Is Cancel</em>}</li>
 *   <li>{@link org.mmi.model.UserMetacomm#isIsRestart <em>Is Restart</em>}</li>
 *   <li>{@link org.mmi.model.UserMetacomm#isIsBargein <em>Is Bargein</em>}</li>
 *   <li>{@link org.mmi.model.UserMetacomm#isIsSuccessfulBargein <em>Is Successful Bargein</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getUserMetacomm()
 * @model extendedMetaData="name='UserMetacomm' kind='elementOnly'"
 * @generated
 */
public interface UserMetacomm extends Metacomm {
	/**
	 * Returns the value of the '<em><b>Is Time Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Time Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Time Out</em>' attribute.
	 * @see #isSetIsTimeOut()
	 * @see #unsetIsTimeOut()
	 * @see #setIsTimeOut(boolean)
	 * @see org.mmi.model.ModelPackage#getUserMetacomm_IsTimeOut()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isTimeOut' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsTimeOut();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserMetacomm#isIsTimeOut <em>Is Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Time Out</em>' attribute.
	 * @see #isSetIsTimeOut()
	 * @see #unsetIsTimeOut()
	 * @see #isIsTimeOut()
	 * @generated
	 */
	void setIsTimeOut(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.UserMetacomm#isIsTimeOut <em>Is Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsTimeOut()
	 * @see #isIsTimeOut()
	 * @see #setIsTimeOut(boolean)
	 * @generated
	 */
	void unsetIsTimeOut();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.UserMetacomm#isIsTimeOut <em>Is Time Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Time Out</em>' attribute is set.
	 * @see #unsetIsTimeOut()
	 * @see #isIsTimeOut()
	 * @see #setIsTimeOut(boolean)
	 * @generated
	 */
	boolean isSetIsTimeOut();

	/**
	 * Returns the value of the '<em><b>Is Cancel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cancel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cancel</em>' attribute.
	 * @see #isSetIsCancel()
	 * @see #unsetIsCancel()
	 * @see #setIsCancel(boolean)
	 * @see org.mmi.model.ModelPackage#getUserMetacomm_IsCancel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isCancel' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsCancel();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserMetacomm#isIsCancel <em>Is Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cancel</em>' attribute.
	 * @see #isSetIsCancel()
	 * @see #unsetIsCancel()
	 * @see #isIsCancel()
	 * @generated
	 */
	void setIsCancel(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.UserMetacomm#isIsCancel <em>Is Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCancel()
	 * @see #isIsCancel()
	 * @see #setIsCancel(boolean)
	 * @generated
	 */
	void unsetIsCancel();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.UserMetacomm#isIsCancel <em>Is Cancel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Cancel</em>' attribute is set.
	 * @see #unsetIsCancel()
	 * @see #isIsCancel()
	 * @see #setIsCancel(boolean)
	 * @generated
	 */
	boolean isSetIsCancel();

	/**
	 * Returns the value of the '<em><b>Is Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Restart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Restart</em>' attribute.
	 * @see #isSetIsRestart()
	 * @see #unsetIsRestart()
	 * @see #setIsRestart(boolean)
	 * @see org.mmi.model.ModelPackage#getUserMetacomm_IsRestart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isRestart' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsRestart();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserMetacomm#isIsRestart <em>Is Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Restart</em>' attribute.
	 * @see #isSetIsRestart()
	 * @see #unsetIsRestart()
	 * @see #isIsRestart()
	 * @generated
	 */
	void setIsRestart(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.UserMetacomm#isIsRestart <em>Is Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRestart()
	 * @see #isIsRestart()
	 * @see #setIsRestart(boolean)
	 * @generated
	 */
	void unsetIsRestart();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.UserMetacomm#isIsRestart <em>Is Restart</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Restart</em>' attribute is set.
	 * @see #unsetIsRestart()
	 * @see #isIsRestart()
	 * @see #setIsRestart(boolean)
	 * @generated
	 */
	boolean isSetIsRestart();

	/**
	 * Returns the value of the '<em><b>Is Bargein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Bargein</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Bargein</em>' attribute.
	 * @see #isSetIsBargein()
	 * @see #unsetIsBargein()
	 * @see #setIsBargein(boolean)
	 * @see org.mmi.model.ModelPackage#getUserMetacomm_IsBargein()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isBargein' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsBargein();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserMetacomm#isIsBargein <em>Is Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Bargein</em>' attribute.
	 * @see #isSetIsBargein()
	 * @see #unsetIsBargein()
	 * @see #isIsBargein()
	 * @generated
	 */
	void setIsBargein(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.UserMetacomm#isIsBargein <em>Is Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBargein()
	 * @see #isIsBargein()
	 * @see #setIsBargein(boolean)
	 * @generated
	 */
	void unsetIsBargein();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.UserMetacomm#isIsBargein <em>Is Bargein</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Bargein</em>' attribute is set.
	 * @see #unsetIsBargein()
	 * @see #isIsBargein()
	 * @see #setIsBargein(boolean)
	 * @generated
	 */
	boolean isSetIsBargein();

	/**
	 * Returns the value of the '<em><b>Is Successful Bargein</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Successful Bargein</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Successful Bargein</em>' attribute.
	 * @see #isSetIsSuccessfulBargein()
	 * @see #unsetIsSuccessfulBargein()
	 * @see #setIsSuccessfulBargein(boolean)
	 * @see org.mmi.model.ModelPackage#getUserMetacomm_IsSuccessfulBargein()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isSuccessfulBargein' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsSuccessfulBargein();

	/**
	 * Sets the value of the '{@link org.mmi.model.UserMetacomm#isIsSuccessfulBargein <em>Is Successful Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Successful Bargein</em>' attribute.
	 * @see #isSetIsSuccessfulBargein()
	 * @see #unsetIsSuccessfulBargein()
	 * @see #isIsSuccessfulBargein()
	 * @generated
	 */
	void setIsSuccessfulBargein(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.UserMetacomm#isIsSuccessfulBargein <em>Is Successful Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSuccessfulBargein()
	 * @see #isIsSuccessfulBargein()
	 * @see #setIsSuccessfulBargein(boolean)
	 * @generated
	 */
	void unsetIsSuccessfulBargein();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.UserMetacomm#isIsSuccessfulBargein <em>Is Successful Bargein</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Successful Bargein</em>' attribute is set.
	 * @see #unsetIsSuccessfulBargein()
	 * @see #isIsSuccessfulBargein()
	 * @see #setIsSuccessfulBargein(boolean)
	 * @generated
	 */
	boolean isSetIsSuccessfulBargein();

} // UserMetacomm
