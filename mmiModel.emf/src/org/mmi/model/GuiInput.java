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
 * A representation of the model object '<em><b>Gui Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mmi.model.GuiInput#getTextElements <em>Text Elements</em>}</li>
 *   <li>{@link org.mmi.model.GuiInput#getNavigationActions <em>Navigation Actions</em>}</li>
 *   <li>{@link org.mmi.model.GuiInput#getNavigationMoves <em>Navigation Moves</em>}</li>
 *   <li>{@link org.mmi.model.GuiInput#getNavigationLength <em>Navigation Length</em>}</li>
 *   <li>{@link org.mmi.model.GuiInput#getExploringActions <em>Exploring Actions</em>}</li>
 *   <li>{@link org.mmi.model.GuiInput#getTransferringActions <em>Transferring Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mmi.model.ModelPackage#getGuiInput()
 * @model extendedMetaData="name='GuiInput' kind='elementOnly'"
 * @generated
 */
public interface GuiInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Text Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Elements</em>' attribute.
	 * @see #isSetTextElements()
	 * @see #unsetTextElements()
	 * @see #setTextElements(long)
	 * @see org.mmi.model.ModelPackage#getGuiInput_TextElements()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='textElements' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTextElements();

	/**
	 * Sets the value of the '{@link org.mmi.model.GuiInput#getTextElements <em>Text Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Elements</em>' attribute.
	 * @see #isSetTextElements()
	 * @see #unsetTextElements()
	 * @see #getTextElements()
	 * @generated
	 */
	void setTextElements(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.GuiInput#getTextElements <em>Text Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextElements()
	 * @see #getTextElements()
	 * @see #setTextElements(long)
	 * @generated
	 */
	void unsetTextElements();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.GuiInput#getTextElements <em>Text Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Elements</em>' attribute is set.
	 * @see #unsetTextElements()
	 * @see #getTextElements()
	 * @see #setTextElements(long)
	 * @generated
	 */
	boolean isSetTextElements();

	/**
	 * Returns the value of the '<em><b>Navigation Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Actions</em>' attribute.
	 * @see #isSetNavigationActions()
	 * @see #unsetNavigationActions()
	 * @see #setNavigationActions(long)
	 * @see org.mmi.model.ModelPackage#getGuiInput_NavigationActions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='navigationActions' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNavigationActions();

	/**
	 * Sets the value of the '{@link org.mmi.model.GuiInput#getNavigationActions <em>Navigation Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Actions</em>' attribute.
	 * @see #isSetNavigationActions()
	 * @see #unsetNavigationActions()
	 * @see #getNavigationActions()
	 * @generated
	 */
	void setNavigationActions(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.GuiInput#getNavigationActions <em>Navigation Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNavigationActions()
	 * @see #getNavigationActions()
	 * @see #setNavigationActions(long)
	 * @generated
	 */
	void unsetNavigationActions();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.GuiInput#getNavigationActions <em>Navigation Actions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Navigation Actions</em>' attribute is set.
	 * @see #unsetNavigationActions()
	 * @see #getNavigationActions()
	 * @see #setNavigationActions(long)
	 * @generated
	 */
	boolean isSetNavigationActions();

	/**
	 * Returns the value of the '<em><b>Navigation Moves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Moves</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Moves</em>' attribute.
	 * @see #isSetNavigationMoves()
	 * @see #unsetNavigationMoves()
	 * @see #setNavigationMoves(long)
	 * @see org.mmi.model.ModelPackage#getGuiInput_NavigationMoves()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='navigationMoves' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNavigationMoves();

	/**
	 * Sets the value of the '{@link org.mmi.model.GuiInput#getNavigationMoves <em>Navigation Moves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Moves</em>' attribute.
	 * @see #isSetNavigationMoves()
	 * @see #unsetNavigationMoves()
	 * @see #getNavigationMoves()
	 * @generated
	 */
	void setNavigationMoves(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.GuiInput#getNavigationMoves <em>Navigation Moves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNavigationMoves()
	 * @see #getNavigationMoves()
	 * @see #setNavigationMoves(long)
	 * @generated
	 */
	void unsetNavigationMoves();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.GuiInput#getNavigationMoves <em>Navigation Moves</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Navigation Moves</em>' attribute is set.
	 * @see #unsetNavigationMoves()
	 * @see #getNavigationMoves()
	 * @see #setNavigationMoves(long)
	 * @generated
	 */
	boolean isSetNavigationMoves();

	/**
	 * Returns the value of the '<em><b>Navigation Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Length</em>' attribute.
	 * @see #isSetNavigationLength()
	 * @see #unsetNavigationLength()
	 * @see #setNavigationLength(long)
	 * @see org.mmi.model.ModelPackage#getGuiInput_NavigationLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='navigationLength' namespace='##targetNamespace'"
	 * @generated
	 */
	long getNavigationLength();

	/**
	 * Sets the value of the '{@link org.mmi.model.GuiInput#getNavigationLength <em>Navigation Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Length</em>' attribute.
	 * @see #isSetNavigationLength()
	 * @see #unsetNavigationLength()
	 * @see #getNavigationLength()
	 * @generated
	 */
	void setNavigationLength(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.GuiInput#getNavigationLength <em>Navigation Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNavigationLength()
	 * @see #getNavigationLength()
	 * @see #setNavigationLength(long)
	 * @generated
	 */
	void unsetNavigationLength();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.GuiInput#getNavigationLength <em>Navigation Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Navigation Length</em>' attribute is set.
	 * @see #unsetNavigationLength()
	 * @see #getNavigationLength()
	 * @see #setNavigationLength(long)
	 * @generated
	 */
	boolean isSetNavigationLength();

	/**
	 * Returns the value of the '<em><b>Exploring Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploring Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploring Actions</em>' attribute.
	 * @see #isSetExploringActions()
	 * @see #unsetExploringActions()
	 * @see #setExploringActions(long)
	 * @see org.mmi.model.ModelPackage#getGuiInput_ExploringActions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='exploringActions' namespace='##targetNamespace'"
	 * @generated
	 */
	long getExploringActions();

	/**
	 * Sets the value of the '{@link org.mmi.model.GuiInput#getExploringActions <em>Exploring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exploring Actions</em>' attribute.
	 * @see #isSetExploringActions()
	 * @see #unsetExploringActions()
	 * @see #getExploringActions()
	 * @generated
	 */
	void setExploringActions(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.GuiInput#getExploringActions <em>Exploring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExploringActions()
	 * @see #getExploringActions()
	 * @see #setExploringActions(long)
	 * @generated
	 */
	void unsetExploringActions();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.GuiInput#getExploringActions <em>Exploring Actions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exploring Actions</em>' attribute is set.
	 * @see #unsetExploringActions()
	 * @see #getExploringActions()
	 * @see #setExploringActions(long)
	 * @generated
	 */
	boolean isSetExploringActions();

	/**
	 * Returns the value of the '<em><b>Transferring Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transferring Actions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transferring Actions</em>' attribute.
	 * @see #isSetTransferringActions()
	 * @see #unsetTransferringActions()
	 * @see #setTransferringActions(long)
	 * @see org.mmi.model.ModelPackage#getGuiInput_TransferringActions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='element' name='transferringActions' namespace='##targetNamespace'"
	 * @generated
	 */
	long getTransferringActions();

	/**
	 * Sets the value of the '{@link org.mmi.model.GuiInput#getTransferringActions <em>Transferring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transferring Actions</em>' attribute.
	 * @see #isSetTransferringActions()
	 * @see #unsetTransferringActions()
	 * @see #getTransferringActions()
	 * @generated
	 */
	void setTransferringActions(long value);

	/**
	 * Unsets the value of the '{@link org.mmi.model.GuiInput#getTransferringActions <em>Transferring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferringActions()
	 * @see #getTransferringActions()
	 * @see #setTransferringActions(long)
	 * @generated
	 */
	void unsetTransferringActions();

	/**
	 * Returns whether the value of the '{@link org.mmi.model.GuiInput#getTransferringActions <em>Transferring Actions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transferring Actions</em>' attribute is set.
	 * @see #unsetTransferringActions()
	 * @see #getTransferringActions()
	 * @see #setTransferringActions(long)
	 * @generated
	 */
	boolean isSetTransferringActions();

} // GuiInput
