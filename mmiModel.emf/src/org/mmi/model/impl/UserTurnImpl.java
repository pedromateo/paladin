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

import org.mmi.model.GuiInput;
import org.mmi.model.ModelPackage;
import org.mmi.model.SpeechInput;
import org.mmi.model.UserMetacomm;
import org.mmi.model.UserTurn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.UserTurnImpl#getMetacomm <em>Metacomm</em>}</li>
 *   <li>{@link org.mmi.model.impl.UserTurnImpl#getSpeechInput <em>Speech Input</em>}</li>
 *   <li>{@link org.mmi.model.impl.UserTurnImpl#getGuiInput <em>Gui Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserTurnImpl extends TurnImpl implements UserTurn {
	/**
	 * The cached value of the '{@link #getMetacomm() <em>Metacomm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetacomm()
	 * @generated
	 * @ordered
	 */
	protected UserMetacomm metacomm;

	/**
	 * The cached value of the '{@link #getSpeechInput() <em>Speech Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeechInput()
	 * @generated
	 * @ordered
	 */
	protected SpeechInput speechInput;

	/**
	 * The cached value of the '{@link #getGuiInput() <em>Gui Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuiInput()
	 * @generated
	 * @ordered
	 */
	protected GuiInput guiInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserTurnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USER_TURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserMetacomm getMetacomm() {
		return metacomm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetacomm(UserMetacomm newMetacomm, NotificationChain msgs) {
		UserMetacomm oldMetacomm = metacomm;
		metacomm = newMetacomm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USER_TURN__METACOMM, oldMetacomm, newMetacomm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetacomm(UserMetacomm newMetacomm) {
		if (newMetacomm != metacomm) {
			NotificationChain msgs = null;
			if (metacomm != null)
				msgs = ((InternalEObject)metacomm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USER_TURN__METACOMM, null, msgs);
			if (newMetacomm != null)
				msgs = ((InternalEObject)newMetacomm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USER_TURN__METACOMM, null, msgs);
			msgs = basicSetMetacomm(newMetacomm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_TURN__METACOMM, newMetacomm, newMetacomm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechInput getSpeechInput() {
		return speechInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeechInput(SpeechInput newSpeechInput, NotificationChain msgs) {
		SpeechInput oldSpeechInput = speechInput;
		speechInput = newSpeechInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USER_TURN__SPEECH_INPUT, oldSpeechInput, newSpeechInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeechInput(SpeechInput newSpeechInput) {
		if (newSpeechInput != speechInput) {
			NotificationChain msgs = null;
			if (speechInput != null)
				msgs = ((InternalEObject)speechInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USER_TURN__SPEECH_INPUT, null, msgs);
			if (newSpeechInput != null)
				msgs = ((InternalEObject)newSpeechInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USER_TURN__SPEECH_INPUT, null, msgs);
			msgs = basicSetSpeechInput(newSpeechInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_TURN__SPEECH_INPUT, newSpeechInput, newSpeechInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuiInput getGuiInput() {
		return guiInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuiInput(GuiInput newGuiInput, NotificationChain msgs) {
		GuiInput oldGuiInput = guiInput;
		guiInput = newGuiInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.USER_TURN__GUI_INPUT, oldGuiInput, newGuiInput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuiInput(GuiInput newGuiInput) {
		if (newGuiInput != guiInput) {
			NotificationChain msgs = null;
			if (guiInput != null)
				msgs = ((InternalEObject)guiInput).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USER_TURN__GUI_INPUT, null, msgs);
			if (newGuiInput != null)
				msgs = ((InternalEObject)newGuiInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.USER_TURN__GUI_INPUT, null, msgs);
			msgs = basicSetGuiInput(newGuiInput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_TURN__GUI_INPUT, newGuiInput, newGuiInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.USER_TURN__METACOMM:
				return basicSetMetacomm(null, msgs);
			case ModelPackage.USER_TURN__SPEECH_INPUT:
				return basicSetSpeechInput(null, msgs);
			case ModelPackage.USER_TURN__GUI_INPUT:
				return basicSetGuiInput(null, msgs);
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
			case ModelPackage.USER_TURN__METACOMM:
				return getMetacomm();
			case ModelPackage.USER_TURN__SPEECH_INPUT:
				return getSpeechInput();
			case ModelPackage.USER_TURN__GUI_INPUT:
				return getGuiInput();
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
			case ModelPackage.USER_TURN__METACOMM:
				setMetacomm((UserMetacomm)newValue);
				return;
			case ModelPackage.USER_TURN__SPEECH_INPUT:
				setSpeechInput((SpeechInput)newValue);
				return;
			case ModelPackage.USER_TURN__GUI_INPUT:
				setGuiInput((GuiInput)newValue);
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
			case ModelPackage.USER_TURN__METACOMM:
				setMetacomm((UserMetacomm)null);
				return;
			case ModelPackage.USER_TURN__SPEECH_INPUT:
				setSpeechInput((SpeechInput)null);
				return;
			case ModelPackage.USER_TURN__GUI_INPUT:
				setGuiInput((GuiInput)null);
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
			case ModelPackage.USER_TURN__METACOMM:
				return metacomm != null;
			case ModelPackage.USER_TURN__SPEECH_INPUT:
				return speechInput != null;
			case ModelPackage.USER_TURN__GUI_INPUT:
				return guiInput != null;
		}
		return super.eIsSet(featureID);
	}

} //UserTurnImpl
