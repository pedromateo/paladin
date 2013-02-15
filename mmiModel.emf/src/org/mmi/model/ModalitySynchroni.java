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
 * A representation of the model object '<em><b>Modality Synchroni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.ModalitySynchroni#getNlags <em>Nlags</em>}</li>
 *   <li>{@link org.mmi.model.ModalitySynchroni#getLagtime <em>Lagtime</em>}</li>
 *   <li>{@link org.mmi.model.ModalitySynchroni#getNevents <em>Nevents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getModalitySynchroni()
 * @model extendedMetaData="name='ModalitySynchroni' kind='elementOnly'"
 * @generated
 */
public interface ModalitySynchroni extends EObject {
	/**
	 * Returns the value of the '<em><b>Nlags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nlags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nlags</em>' attribute.
	 * @see #isSetNlags()
	 * @see #unsetNlags()
	 * @see #setNlags(long)
	 * @see org.mmi.model.ModelPackage#getModalitySynchroni_Nlags()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='nlags' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNlags();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalitySynchroni#getNlags <em>Nlags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nlags</em>' attribute.
	 * @see #isSetNlags()
	 * @see #unsetNlags()
	 * @see #getNlags()
	 * @generated
	 */
	void setNlags(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalitySynchroni#getNlags <em>Nlags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNlags()
	 * @see #getNlags()
	 * @see #setNlags(long)
	 * @generated
	 */
	void unsetNlags();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalitySynchroni#getNlags <em>Nlags</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nlags</em>' attribute is set.
	 * @see #unsetNlags()
	 * @see #getNlags()
	 * @see #setNlags(long)
	 * @generated
	 */
	boolean isSetNlags();

	/**
	 * Returns the value of the '<em><b>Lagtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lagtime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lagtime</em>' attribute.
	 * @see #isSetLagtime()
	 * @see #unsetLagtime()
	 * @see #setLagtime(long)
	 * @see org.mmi.model.ModelPackage#getModalitySynchroni_Lagtime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='lagtime' namespace='##targetNamespace'"
	 * @generated
	 */
	long getLagtime();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalitySynchroni#getLagtime <em>Lagtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lagtime</em>' attribute.
	 * @see #isSetLagtime()
	 * @see #unsetLagtime()
	 * @see #getLagtime()
	 * @generated
	 */
	void setLagtime(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalitySynchroni#getLagtime <em>Lagtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLagtime()
	 * @see #getLagtime()
	 * @see #setLagtime(long)
	 * @generated
	 */
	void unsetLagtime();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalitySynchroni#getLagtime <em>Lagtime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lagtime</em>' attribute is set.
	 * @see #unsetLagtime()
	 * @see #getLagtime()
	 * @see #setLagtime(long)
	 * @generated
	 */
	boolean isSetLagtime();

	/**
	 * Returns the value of the '<em><b>Nevents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nevents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nevents</em>' attribute.
	 * @see #isSetNevents()
	 * @see #unsetNevents()
	 * @see #setNevents(long)
	 * @see org.mmi.model.ModelPackage#getModalitySynchroni_Nevents()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='nevents' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNevents();

	/**
	 * Sets the value of the '{@link org.mmi.model.ModalitySynchroni#getNevents <em>Nevents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nevents</em>' attribute.
	 * @see #isSetNevents()
	 * @see #unsetNevents()
	 * @see #getNevents()
	 * @generated
	 */
	void setNevents(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.ModalitySynchroni#getNevents <em>Nevents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNevents()
	 * @see #getNevents()
	 * @see #setNevents(long)
	 * @generated
	 */
	void unsetNevents();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.ModalitySynchroni#getNevents <em>Nevents</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nevents</em>' attribute is set.
	 * @see #unsetNevents()
	 * @see #getNevents()
	 * @see #setNevents(long)
	 * @generated
	 */
	boolean isSetNevents();

} // ModalitySynchroni
