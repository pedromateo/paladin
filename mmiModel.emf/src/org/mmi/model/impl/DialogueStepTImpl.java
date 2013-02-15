/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mmi.model.DialogueStepT;
import org.mmi.model.ModelPackage;
import org.mmi.model.SystemTurn;
import org.mmi.model.UserTurn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialogue Step T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.DialogueStepTImpl#getSystemTurn <em>System Turn</em>}</li>
 *   <li>{@link org.mmi.model.impl.DialogueStepTImpl#getUserTurn <em>User Turn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DialogueStepTImpl extends EObjectImpl implements DialogueStepT {
	/**
	 * The cached value of the '{@link #getSystemTurn() <em>System Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemTurn()
	 * @generated
	 * @ordered
	 */
	protected SystemTurn systemTurn;

	/**
	 * The cached value of the '{@link #getUserTurn() <em>User Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTurn()
	 * @generated
	 * @ordered
	 */
	protected UserTurn userTurn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DialogueStepTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DIALOGUE_STEP_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTurn getSystemTurn() {
		return systemTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemTurn(SystemTurn newSystemTurn, NotificationChain msgs) {
		SystemTurn oldSystemTurn = systemTurn;
		systemTurn = newSystemTurn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN, oldSystemTurn, newSystemTurn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemTurn(SystemTurn newSystemTurn) {
		if (newSystemTurn != systemTurn) {
			NotificationChain msgs = null;
			if (systemTurn != null)
				msgs = ((InternalEObject)systemTurn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN, null, msgs);
			if (newSystemTurn != null)
				msgs = ((InternalEObject)newSystemTurn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN, null, msgs);
			msgs = basicSetSystemTurn(newSystemTurn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN, newSystemTurn, newSystemTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTurn getUserTurn() {
		return userTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserTurn(UserTurn newUserTurn, NotificationChain msgs) {
		UserTurn oldUserTurn = userTurn;
		userTurn = newUserTurn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DIALOGUE_STEP_T__USER_TURN, oldUserTurn, newUserTurn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTurn(UserTurn newUserTurn) {
		if (newUserTurn != userTurn) {
			NotificationChain msgs = null;
			if (userTurn != null)
				msgs = ((InternalEObject)userTurn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DIALOGUE_STEP_T__USER_TURN, null, msgs);
			if (newUserTurn != null)
				msgs = ((InternalEObject)newUserTurn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DIALOGUE_STEP_T__USER_TURN, null, msgs);
			msgs = basicSetUserTurn(newUserTurn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DIALOGUE_STEP_T__USER_TURN, newUserTurn, newUserTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN:
				return basicSetSystemTurn(null, msgs);
			case ModelPackage.DIALOGUE_STEP_T__USER_TURN:
				return basicSetUserTurn(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN:
				return getSystemTurn();
			case ModelPackage.DIALOGUE_STEP_T__USER_TURN:
				return getUserTurn();
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
			case ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN:
				setSystemTurn((SystemTurn)newValue);
				return;
			case ModelPackage.DIALOGUE_STEP_T__USER_TURN:
				setUserTurn((UserTurn)newValue);
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
			case ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN:
				setSystemTurn((SystemTurn)null);
				return;
			case ModelPackage.DIALOGUE_STEP_T__USER_TURN:
				setUserTurn((UserTurn)null);
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
			case ModelPackage.DIALOGUE_STEP_T__SYSTEM_TURN:
				return systemTurn != null;
			case ModelPackage.DIALOGUE_STEP_T__USER_TURN:
				return userTurn != null;
		}
		return super.eIsSet(featureID);
	}

} //DialogueStepTImpl
