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
import org.mmi.model.SystemMetacomm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Metacomm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.SystemMetacommImpl#isIsASRReject <em>Is ASR Reject</em>}</li>
 *   <li>{@link org.mmi.model.impl.SystemMetacommImpl#isIsDIVReject <em>Is DIV Reject</em>}</li>
 *   <li>{@link org.mmi.model.impl.SystemMetacommImpl#isIsGRReject <em>Is GR Reject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemMetacommImpl extends MetacommImpl implements SystemMetacomm {
	/**
	 * The default value of the '{@link #isIsASRReject() <em>Is ASR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsASRReject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASR_REJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsASRReject() <em>Is ASR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsASRReject()
	 * @generated
	 * @ordered
	 */
	protected boolean isASRReject = IS_ASR_REJECT_EDEFAULT;

	/**
	 * This is true if the Is ASR Reject attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isASRRejectESet;

	/**
	 * The default value of the '{@link #isIsDIVReject() <em>Is DIV Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDIVReject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIV_REJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDIVReject() <em>Is DIV Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDIVReject()
	 * @generated
	 * @ordered
	 */
	protected boolean isDIVReject = IS_DIV_REJECT_EDEFAULT;

	/**
	 * This is true if the Is DIV Reject attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDIVRejectESet;

	/**
	 * The default value of the '{@link #isIsGRReject() <em>Is GR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGRReject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GR_REJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsGRReject() <em>Is GR Reject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsGRReject()
	 * @generated
	 * @ordered
	 */
	protected boolean isGRReject = IS_GR_REJECT_EDEFAULT;

	/**
	 * This is true if the Is GR Reject attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isGRRejectESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemMetacommImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SYSTEM_METACOMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsASRReject() {
		return isASRReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsASRReject(boolean newIsASRReject) {
		boolean oldIsASRReject = isASRReject;
		isASRReject = newIsASRReject;
		boolean oldIsASRRejectESet = isASRRejectESet;
		isASRRejectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_METACOMM__IS_ASR_REJECT, oldIsASRReject, isASRReject, !oldIsASRRejectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsASRReject() {
		boolean oldIsASRReject = isASRReject;
		boolean oldIsASRRejectESet = isASRRejectESet;
		isASRReject = IS_ASR_REJECT_EDEFAULT;
		isASRRejectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SYSTEM_METACOMM__IS_ASR_REJECT, oldIsASRReject, IS_ASR_REJECT_EDEFAULT, oldIsASRRejectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsASRReject() {
		return isASRRejectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDIVReject() {
		return isDIVReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDIVReject(boolean newIsDIVReject) {
		boolean oldIsDIVReject = isDIVReject;
		isDIVReject = newIsDIVReject;
		boolean oldIsDIVRejectESet = isDIVRejectESet;
		isDIVRejectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_METACOMM__IS_DIV_REJECT, oldIsDIVReject, isDIVReject, !oldIsDIVRejectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDIVReject() {
		boolean oldIsDIVReject = isDIVReject;
		boolean oldIsDIVRejectESet = isDIVRejectESet;
		isDIVReject = IS_DIV_REJECT_EDEFAULT;
		isDIVRejectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SYSTEM_METACOMM__IS_DIV_REJECT, oldIsDIVReject, IS_DIV_REJECT_EDEFAULT, oldIsDIVRejectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDIVReject() {
		return isDIVRejectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsGRReject() {
		return isGRReject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsGRReject(boolean newIsGRReject) {
		boolean oldIsGRReject = isGRReject;
		isGRReject = newIsGRReject;
		boolean oldIsGRRejectESet = isGRRejectESet;
		isGRRejectESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SYSTEM_METACOMM__IS_GR_REJECT, oldIsGRReject, isGRReject, !oldIsGRRejectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsGRReject() {
		boolean oldIsGRReject = isGRReject;
		boolean oldIsGRRejectESet = isGRRejectESet;
		isGRReject = IS_GR_REJECT_EDEFAULT;
		isGRRejectESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SYSTEM_METACOMM__IS_GR_REJECT, oldIsGRReject, IS_GR_REJECT_EDEFAULT, oldIsGRRejectESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsGRReject() {
		return isGRRejectESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SYSTEM_METACOMM__IS_ASR_REJECT:
				return isIsASRReject();
			case ModelPackage.SYSTEM_METACOMM__IS_DIV_REJECT:
				return isIsDIVReject();
			case ModelPackage.SYSTEM_METACOMM__IS_GR_REJECT:
				return isIsGRReject();
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
			case ModelPackage.SYSTEM_METACOMM__IS_ASR_REJECT:
				setIsASRReject((Boolean)newValue);
				return;
			case ModelPackage.SYSTEM_METACOMM__IS_DIV_REJECT:
				setIsDIVReject((Boolean)newValue);
				return;
			case ModelPackage.SYSTEM_METACOMM__IS_GR_REJECT:
				setIsGRReject((Boolean)newValue);
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
			case ModelPackage.SYSTEM_METACOMM__IS_ASR_REJECT:
				unsetIsASRReject();
				return;
			case ModelPackage.SYSTEM_METACOMM__IS_DIV_REJECT:
				unsetIsDIVReject();
				return;
			case ModelPackage.SYSTEM_METACOMM__IS_GR_REJECT:
				unsetIsGRReject();
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
			case ModelPackage.SYSTEM_METACOMM__IS_ASR_REJECT:
				return isSetIsASRReject();
			case ModelPackage.SYSTEM_METACOMM__IS_DIV_REJECT:
				return isSetIsDIVReject();
			case ModelPackage.SYSTEM_METACOMM__IS_GR_REJECT:
				return isSetIsGRReject();
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
		result.append(" (isASRReject: ");
		if (isASRRejectESet) result.append(isASRReject); else result.append("<unset>");
		result.append(", isDIVReject: ");
		if (isDIVRejectESet) result.append(isDIVReject); else result.append("<unset>");
		result.append(", isGRReject: ");
		if (isGRRejectESet) result.append(isGRReject); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SystemMetacommImpl
