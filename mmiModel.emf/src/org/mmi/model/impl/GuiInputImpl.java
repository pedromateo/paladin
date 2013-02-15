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

import org.mmi.model.GuiInput;
import org.mmi.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gui Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.GuiInputImpl#getTextElements <em>Text Elements</em>}</li>
 *   <li>{@link org.mmi.model.impl.GuiInputImpl#getNavigationActions <em>Navigation Actions</em>}</li>
 *   <li>{@link org.mmi.model.impl.GuiInputImpl#getNavigationMoves <em>Navigation Moves</em>}</li>
 *   <li>{@link org.mmi.model.impl.GuiInputImpl#getNavigationLength <em>Navigation Length</em>}</li>
 *   <li>{@link org.mmi.model.impl.GuiInputImpl#getExploringActions <em>Exploring Actions</em>}</li>
 *   <li>{@link org.mmi.model.impl.GuiInputImpl#getTransferringActions <em>Transferring Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuiInputImpl extends EObjectImpl implements GuiInput {
	/**
	 * The default value of the '{@link #getTextElements() <em>Text Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextElements()
	 * @generated
	 * @ordered
	 */
	protected static final long TEXT_ELEMENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTextElements() <em>Text Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextElements()
	 * @generated
	 * @ordered
	 */
	protected long textElements = TEXT_ELEMENTS_EDEFAULT;

	/**
	 * This is true if the Text Elements attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textElementsESet;

	/**
	 * The default value of the '{@link #getNavigationActions() <em>Navigation Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationActions()
	 * @generated
	 * @ordered
	 */
	protected static final long NAVIGATION_ACTIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNavigationActions() <em>Navigation Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationActions()
	 * @generated
	 * @ordered
	 */
	protected long navigationActions = NAVIGATION_ACTIONS_EDEFAULT;

	/**
	 * This is true if the Navigation Actions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean navigationActionsESet;

	/**
	 * The default value of the '{@link #getNavigationMoves() <em>Navigation Moves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationMoves()
	 * @generated
	 * @ordered
	 */
	protected static final long NAVIGATION_MOVES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNavigationMoves() <em>Navigation Moves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationMoves()
	 * @generated
	 * @ordered
	 */
	protected long navigationMoves = NAVIGATION_MOVES_EDEFAULT;

	/**
	 * This is true if the Navigation Moves attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean navigationMovesESet;

	/**
	 * The default value of the '{@link #getNavigationLength() <em>Navigation Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLength()
	 * @generated
	 * @ordered
	 */
	protected static final long NAVIGATION_LENGTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNavigationLength() <em>Navigation Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationLength()
	 * @generated
	 * @ordered
	 */
	protected long navigationLength = NAVIGATION_LENGTH_EDEFAULT;

	/**
	 * This is true if the Navigation Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean navigationLengthESet;

	/**
	 * The default value of the '{@link #getExploringActions() <em>Exploring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploringActions()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPLORING_ACTIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExploringActions() <em>Exploring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploringActions()
	 * @generated
	 * @ordered
	 */
	protected long exploringActions = EXPLORING_ACTIONS_EDEFAULT;

	/**
	 * This is true if the Exploring Actions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exploringActionsESet;

	/**
	 * The default value of the '{@link #getTransferringActions() <em>Transferring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferringActions()
	 * @generated
	 * @ordered
	 */
	protected static final long TRANSFERRING_ACTIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTransferringActions() <em>Transferring Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferringActions()
	 * @generated
	 * @ordered
	 */
	protected long transferringActions = TRANSFERRING_ACTIONS_EDEFAULT;

	/**
	 * This is true if the Transferring Actions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferringActionsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuiInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GUI_INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTextElements() {
		return textElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextElements(long newTextElements) {
		long oldTextElements = textElements;
		textElements = newTextElements;
		boolean oldTextElementsESet = textElementsESet;
		textElementsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_INPUT__TEXT_ELEMENTS, oldTextElements, textElements, !oldTextElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextElements() {
		long oldTextElements = textElements;
		boolean oldTextElementsESet = textElementsESet;
		textElements = TEXT_ELEMENTS_EDEFAULT;
		textElementsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GUI_INPUT__TEXT_ELEMENTS, oldTextElements, TEXT_ELEMENTS_EDEFAULT, oldTextElementsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextElements() {
		return textElementsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNavigationActions() {
		return navigationActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationActions(long newNavigationActions) {
		long oldNavigationActions = navigationActions;
		navigationActions = newNavigationActions;
		boolean oldNavigationActionsESet = navigationActionsESet;
		navigationActionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_INPUT__NAVIGATION_ACTIONS, oldNavigationActions, navigationActions, !oldNavigationActionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNavigationActions() {
		long oldNavigationActions = navigationActions;
		boolean oldNavigationActionsESet = navigationActionsESet;
		navigationActions = NAVIGATION_ACTIONS_EDEFAULT;
		navigationActionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GUI_INPUT__NAVIGATION_ACTIONS, oldNavigationActions, NAVIGATION_ACTIONS_EDEFAULT, oldNavigationActionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNavigationActions() {
		return navigationActionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNavigationMoves() {
		return navigationMoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationMoves(long newNavigationMoves) {
		long oldNavigationMoves = navigationMoves;
		navigationMoves = newNavigationMoves;
		boolean oldNavigationMovesESet = navigationMovesESet;
		navigationMovesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_INPUT__NAVIGATION_MOVES, oldNavigationMoves, navigationMoves, !oldNavigationMovesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNavigationMoves() {
		long oldNavigationMoves = navigationMoves;
		boolean oldNavigationMovesESet = navigationMovesESet;
		navigationMoves = NAVIGATION_MOVES_EDEFAULT;
		navigationMovesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GUI_INPUT__NAVIGATION_MOVES, oldNavigationMoves, NAVIGATION_MOVES_EDEFAULT, oldNavigationMovesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNavigationMoves() {
		return navigationMovesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNavigationLength() {
		return navigationLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationLength(long newNavigationLength) {
		long oldNavigationLength = navigationLength;
		navigationLength = newNavigationLength;
		boolean oldNavigationLengthESet = navigationLengthESet;
		navigationLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_INPUT__NAVIGATION_LENGTH, oldNavigationLength, navigationLength, !oldNavigationLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNavigationLength() {
		long oldNavigationLength = navigationLength;
		boolean oldNavigationLengthESet = navigationLengthESet;
		navigationLength = NAVIGATION_LENGTH_EDEFAULT;
		navigationLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GUI_INPUT__NAVIGATION_LENGTH, oldNavigationLength, NAVIGATION_LENGTH_EDEFAULT, oldNavigationLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNavigationLength() {
		return navigationLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExploringActions() {
		return exploringActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExploringActions(long newExploringActions) {
		long oldExploringActions = exploringActions;
		exploringActions = newExploringActions;
		boolean oldExploringActionsESet = exploringActionsESet;
		exploringActionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_INPUT__EXPLORING_ACTIONS, oldExploringActions, exploringActions, !oldExploringActionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExploringActions() {
		long oldExploringActions = exploringActions;
		boolean oldExploringActionsESet = exploringActionsESet;
		exploringActions = EXPLORING_ACTIONS_EDEFAULT;
		exploringActionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GUI_INPUT__EXPLORING_ACTIONS, oldExploringActions, EXPLORING_ACTIONS_EDEFAULT, oldExploringActionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExploringActions() {
		return exploringActionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTransferringActions() {
		return transferringActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferringActions(long newTransferringActions) {
		long oldTransferringActions = transferringActions;
		transferringActions = newTransferringActions;
		boolean oldTransferringActionsESet = transferringActionsESet;
		transferringActionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GUI_INPUT__TRANSFERRING_ACTIONS, oldTransferringActions, transferringActions, !oldTransferringActionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransferringActions() {
		long oldTransferringActions = transferringActions;
		boolean oldTransferringActionsESet = transferringActionsESet;
		transferringActions = TRANSFERRING_ACTIONS_EDEFAULT;
		transferringActionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.GUI_INPUT__TRANSFERRING_ACTIONS, oldTransferringActions, TRANSFERRING_ACTIONS_EDEFAULT, oldTransferringActionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransferringActions() {
		return transferringActionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.GUI_INPUT__TEXT_ELEMENTS:
				return getTextElements();
			case ModelPackage.GUI_INPUT__NAVIGATION_ACTIONS:
				return getNavigationActions();
			case ModelPackage.GUI_INPUT__NAVIGATION_MOVES:
				return getNavigationMoves();
			case ModelPackage.GUI_INPUT__NAVIGATION_LENGTH:
				return getNavigationLength();
			case ModelPackage.GUI_INPUT__EXPLORING_ACTIONS:
				return getExploringActions();
			case ModelPackage.GUI_INPUT__TRANSFERRING_ACTIONS:
				return getTransferringActions();
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
			case ModelPackage.GUI_INPUT__TEXT_ELEMENTS:
				setTextElements((Long)newValue);
				return;
			case ModelPackage.GUI_INPUT__NAVIGATION_ACTIONS:
				setNavigationActions((Long)newValue);
				return;
			case ModelPackage.GUI_INPUT__NAVIGATION_MOVES:
				setNavigationMoves((Long)newValue);
				return;
			case ModelPackage.GUI_INPUT__NAVIGATION_LENGTH:
				setNavigationLength((Long)newValue);
				return;
			case ModelPackage.GUI_INPUT__EXPLORING_ACTIONS:
				setExploringActions((Long)newValue);
				return;
			case ModelPackage.GUI_INPUT__TRANSFERRING_ACTIONS:
				setTransferringActions((Long)newValue);
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
			case ModelPackage.GUI_INPUT__TEXT_ELEMENTS:
				unsetTextElements();
				return;
			case ModelPackage.GUI_INPUT__NAVIGATION_ACTIONS:
				unsetNavigationActions();
				return;
			case ModelPackage.GUI_INPUT__NAVIGATION_MOVES:
				unsetNavigationMoves();
				return;
			case ModelPackage.GUI_INPUT__NAVIGATION_LENGTH:
				unsetNavigationLength();
				return;
			case ModelPackage.GUI_INPUT__EXPLORING_ACTIONS:
				unsetExploringActions();
				return;
			case ModelPackage.GUI_INPUT__TRANSFERRING_ACTIONS:
				unsetTransferringActions();
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
			case ModelPackage.GUI_INPUT__TEXT_ELEMENTS:
				return isSetTextElements();
			case ModelPackage.GUI_INPUT__NAVIGATION_ACTIONS:
				return isSetNavigationActions();
			case ModelPackage.GUI_INPUT__NAVIGATION_MOVES:
				return isSetNavigationMoves();
			case ModelPackage.GUI_INPUT__NAVIGATION_LENGTH:
				return isSetNavigationLength();
			case ModelPackage.GUI_INPUT__EXPLORING_ACTIONS:
				return isSetExploringActions();
			case ModelPackage.GUI_INPUT__TRANSFERRING_ACTIONS:
				return isSetTransferringActions();
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
		result.append(" (textElements: ");
		if (textElementsESet) result.append(textElements); else result.append("<unset>");
		result.append(", navigationActions: ");
		if (navigationActionsESet) result.append(navigationActions); else result.append("<unset>");
		result.append(", navigationMoves: ");
		if (navigationMovesESet) result.append(navigationMoves); else result.append("<unset>");
		result.append(", navigationLength: ");
		if (navigationLengthESet) result.append(navigationLength); else result.append("<unset>");
		result.append(", exploringActions: ");
		if (exploringActionsESet) result.append(exploringActions); else result.append("<unset>");
		result.append(", transferringActions: ");
		if (transferringActionsESet) result.append(transferringActions); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GuiInputImpl
