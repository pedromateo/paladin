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

import org.mmi.model.ModelPackage;
import org.mmi.model.UserMetacomm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Metacomm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.UserMetacommImpl#isIsTimeOut <em>Is Time Out</em>}</li>
 *   <li>{@link org.mmi.model.impl.UserMetacommImpl#isIsCancel <em>Is Cancel</em>}</li>
 *   <li>{@link org.mmi.model.impl.UserMetacommImpl#isIsRestart <em>Is Restart</em>}</li>
 *   <li>{@link org.mmi.model.impl.UserMetacommImpl#isIsBargein <em>Is Bargein</em>}</li>
 *   <li>{@link org.mmi.model.impl.UserMetacommImpl#isIsSuccessfulBargein <em>Is Successful Bargein</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserMetacommImpl extends MetacommImpl implements UserMetacomm {
	/**
	 * The default value of the '{@link #isIsTimeOut() <em>Is Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTimeOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TIME_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsTimeOut() <em>Is Time Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsTimeOut()
	 * @generated
	 * @ordered
	 */
	protected boolean isTimeOut = IS_TIME_OUT_EDEFAULT;

	/**
	 * This is true if the Is Time Out attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isTimeOutESet;

	/**
	 * The default value of the '{@link #isIsCancel() <em>Is Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCancel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CANCEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCancel() <em>Is Cancel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCancel()
	 * @generated
	 * @ordered
	 */
	protected boolean isCancel = IS_CANCEL_EDEFAULT;

	/**
	 * This is true if the Is Cancel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCancelESet;

	/**
	 * The default value of the '{@link #isIsRestart() <em>Is Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRestart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESTART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRestart() <em>Is Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean isRestart = IS_RESTART_EDEFAULT;

	/**
	 * This is true if the Is Restart attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRestartESet;

	/**
	 * The default value of the '{@link #isIsBargein() <em>Is Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBargein()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BARGEIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBargein() <em>Is Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBargein()
	 * @generated
	 * @ordered
	 */
	protected boolean isBargein = IS_BARGEIN_EDEFAULT;

	/**
	 * This is true if the Is Bargein attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBargeinESet;

	/**
	 * The default value of the '{@link #isIsSuccessfulBargein() <em>Is Successful Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSuccessfulBargein()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUCCESSFUL_BARGEIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSuccessfulBargein() <em>Is Successful Bargein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSuccessfulBargein()
	 * @generated
	 * @ordered
	 */
	protected boolean isSuccessfulBargein = IS_SUCCESSFUL_BARGEIN_EDEFAULT;

	/**
	 * This is true if the Is Successful Bargein attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSuccessfulBargeinESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserMetacommImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USER_METACOMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTimeOut() {
		return isTimeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTimeOut(boolean newIsTimeOut) {
		boolean oldIsTimeOut = isTimeOut;
		isTimeOut = newIsTimeOut;
		boolean oldIsTimeOutESet = isTimeOutESet;
		isTimeOutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_METACOMM__IS_TIME_OUT, oldIsTimeOut, isTimeOut, !oldIsTimeOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsTimeOut() {
		boolean oldIsTimeOut = isTimeOut;
		boolean oldIsTimeOutESet = isTimeOutESet;
		isTimeOut = IS_TIME_OUT_EDEFAULT;
		isTimeOutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.USER_METACOMM__IS_TIME_OUT, oldIsTimeOut, IS_TIME_OUT_EDEFAULT, oldIsTimeOutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsTimeOut() {
		return isTimeOutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCancel() {
		return isCancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCancel(boolean newIsCancel) {
		boolean oldIsCancel = isCancel;
		isCancel = newIsCancel;
		boolean oldIsCancelESet = isCancelESet;
		isCancelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_METACOMM__IS_CANCEL, oldIsCancel, isCancel, !oldIsCancelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCancel() {
		boolean oldIsCancel = isCancel;
		boolean oldIsCancelESet = isCancelESet;
		isCancel = IS_CANCEL_EDEFAULT;
		isCancelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.USER_METACOMM__IS_CANCEL, oldIsCancel, IS_CANCEL_EDEFAULT, oldIsCancelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCancel() {
		return isCancelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRestart() {
		return isRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRestart(boolean newIsRestart) {
		boolean oldIsRestart = isRestart;
		isRestart = newIsRestart;
		boolean oldIsRestartESet = isRestartESet;
		isRestartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_METACOMM__IS_RESTART, oldIsRestart, isRestart, !oldIsRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRestart() {
		boolean oldIsRestart = isRestart;
		boolean oldIsRestartESet = isRestartESet;
		isRestart = IS_RESTART_EDEFAULT;
		isRestartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.USER_METACOMM__IS_RESTART, oldIsRestart, IS_RESTART_EDEFAULT, oldIsRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRestart() {
		return isRestartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBargein() {
		return isBargein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBargein(boolean newIsBargein) {
		boolean oldIsBargein = isBargein;
		isBargein = newIsBargein;
		boolean oldIsBargeinESet = isBargeinESet;
		isBargeinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_METACOMM__IS_BARGEIN, oldIsBargein, isBargein, !oldIsBargeinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBargein() {
		boolean oldIsBargein = isBargein;
		boolean oldIsBargeinESet = isBargeinESet;
		isBargein = IS_BARGEIN_EDEFAULT;
		isBargeinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.USER_METACOMM__IS_BARGEIN, oldIsBargein, IS_BARGEIN_EDEFAULT, oldIsBargeinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBargein() {
		return isBargeinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSuccessfulBargein() {
		return isSuccessfulBargein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSuccessfulBargein(boolean newIsSuccessfulBargein) {
		boolean oldIsSuccessfulBargein = isSuccessfulBargein;
		isSuccessfulBargein = newIsSuccessfulBargein;
		boolean oldIsSuccessfulBargeinESet = isSuccessfulBargeinESet;
		isSuccessfulBargeinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USER_METACOMM__IS_SUCCESSFUL_BARGEIN, oldIsSuccessfulBargein, isSuccessfulBargein, !oldIsSuccessfulBargeinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSuccessfulBargein() {
		boolean oldIsSuccessfulBargein = isSuccessfulBargein;
		boolean oldIsSuccessfulBargeinESet = isSuccessfulBargeinESet;
		isSuccessfulBargein = IS_SUCCESSFUL_BARGEIN_EDEFAULT;
		isSuccessfulBargeinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.USER_METACOMM__IS_SUCCESSFUL_BARGEIN, oldIsSuccessfulBargein, IS_SUCCESSFUL_BARGEIN_EDEFAULT, oldIsSuccessfulBargeinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSuccessfulBargein() {
		return isSuccessfulBargeinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.USER_METACOMM__IS_TIME_OUT:
				return isIsTimeOut();
			case ModelPackage.USER_METACOMM__IS_CANCEL:
				return isIsCancel();
			case ModelPackage.USER_METACOMM__IS_RESTART:
				return isIsRestart();
			case ModelPackage.USER_METACOMM__IS_BARGEIN:
				return isIsBargein();
			case ModelPackage.USER_METACOMM__IS_SUCCESSFUL_BARGEIN:
				return isIsSuccessfulBargein();
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
			case ModelPackage.USER_METACOMM__IS_TIME_OUT:
				setIsTimeOut((Boolean)newValue);
				return;
			case ModelPackage.USER_METACOMM__IS_CANCEL:
				setIsCancel((Boolean)newValue);
				return;
			case ModelPackage.USER_METACOMM__IS_RESTART:
				setIsRestart((Boolean)newValue);
				return;
			case ModelPackage.USER_METACOMM__IS_BARGEIN:
				setIsBargein((Boolean)newValue);
				return;
			case ModelPackage.USER_METACOMM__IS_SUCCESSFUL_BARGEIN:
				setIsSuccessfulBargein((Boolean)newValue);
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
			case ModelPackage.USER_METACOMM__IS_TIME_OUT:
				unsetIsTimeOut();
				return;
			case ModelPackage.USER_METACOMM__IS_CANCEL:
				unsetIsCancel();
				return;
			case ModelPackage.USER_METACOMM__IS_RESTART:
				unsetIsRestart();
				return;
			case ModelPackage.USER_METACOMM__IS_BARGEIN:
				unsetIsBargein();
				return;
			case ModelPackage.USER_METACOMM__IS_SUCCESSFUL_BARGEIN:
				unsetIsSuccessfulBargein();
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
			case ModelPackage.USER_METACOMM__IS_TIME_OUT:
				return isSetIsTimeOut();
			case ModelPackage.USER_METACOMM__IS_CANCEL:
				return isSetIsCancel();
			case ModelPackage.USER_METACOMM__IS_RESTART:
				return isSetIsRestart();
			case ModelPackage.USER_METACOMM__IS_BARGEIN:
				return isSetIsBargein();
			case ModelPackage.USER_METACOMM__IS_SUCCESSFUL_BARGEIN:
				return isSetIsSuccessfulBargein();
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
		result.append(" (isTimeOut: ");
		if (isTimeOutESet) result.append(isTimeOut); else result.append("<unset>");
		result.append(", isCancel: ");
		if (isCancelESet) result.append(isCancel); else result.append("<unset>");
		result.append(", isRestart: ");
		if (isRestartESet) result.append(isRestart); else result.append("<unset>");
		result.append(", isBargein: ");
		if (isBargeinESet) result.append(isBargein); else result.append("<unset>");
		result.append(", isSuccessfulBargein: ");
		if (isSuccessfulBargeinESet) result.append(isSuccessfulBargein); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UserMetacommImpl
