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
 * A representation of the model object '<em><b>Metacomm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.Metacomm#isIsHelp <em>Is Help</em>}</li>
 *   <li>{@link org.mmi.model.Metacomm#isIsCorrection <em>Is Correction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getMetacomm()
 * @model abstract="true"
 *        extendedMetaData="name='Metacomm' kind='elementOnly'"
 * @generated
 */
public interface Metacomm extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Help</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Help</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Help</em>' attribute.
	 * @see #isSetIsHelp()
	 * @see #unsetIsHelp()
	 * @see #setIsHelp(boolean)
	 * @see org.mmi.model.ModelPackage#getMetacomm_IsHelp()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isHelp' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsHelp();

	/**
	 * Sets the value of the '{@link org.mmi.model.Metacomm#isIsHelp <em>Is Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Help</em>' attribute.
	 * @see #isSetIsHelp()
	 * @see #unsetIsHelp()
	 * @see #isIsHelp()
	 * @generated
	 */
	void setIsHelp(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.Metacomm#isIsHelp <em>Is Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsHelp()
	 * @see #isIsHelp()
	 * @see #setIsHelp(boolean)
	 * @generated
	 */
	void unsetIsHelp();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.Metacomm#isIsHelp <em>Is Help</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Help</em>' attribute is set.
	 * @see #unsetIsHelp()
	 * @see #isIsHelp()
	 * @see #setIsHelp(boolean)
	 * @generated
	 */
	boolean isSetIsHelp();

	/**
	 * Returns the value of the '<em><b>Is Correction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Correction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Correction</em>' attribute.
	 * @see #isSetIsCorrection()
	 * @see #unsetIsCorrection()
	 * @see #setIsCorrection(boolean)
	 * @see org.mmi.model.ModelPackage#getMetacomm_IsCorrection()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='isCorrection' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsCorrection();

	/**
	 * Sets the value of the '{@link org.mmi.model.Metacomm#isIsCorrection <em>Is Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Correction</em>' attribute.
	 * @see #isSetIsCorrection()
	 * @see #unsetIsCorrection()
	 * @see #isIsCorrection()
	 * @generated
	 */
	void setIsCorrection(boolean value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.Metacomm#isIsCorrection <em>Is Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCorrection()
	 * @see #isIsCorrection()
	 * @see #setIsCorrection(boolean)
	 * @generated
	 */
	void unsetIsCorrection();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.Metacomm#isIsCorrection <em>Is Correction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Correction</em>' attribute is set.
	 * @see #unsetIsCorrection()
	 * @see #isIsCorrection()
	 * @see #setIsCorrection(boolean)
	 * @generated
	 */
	boolean isSetIsCorrection();

} // Metacomm
