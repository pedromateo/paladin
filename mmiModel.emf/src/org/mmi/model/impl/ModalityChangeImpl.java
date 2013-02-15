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

import org.mmi.model.McReasonT;
import org.mmi.model.ModalityChange;
import org.mmi.model.ModelPackage;
import org.mmi.model.RoleT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modality Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.ModalityChangeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalityChangeImpl#getReason <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModalityChangeImpl extends EObjectImpl implements ModalityChange {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final RoleT ORIGIN_EDEFAULT = RoleT.SYSTEM;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected RoleT origin = ORIGIN_EDEFAULT;

	/**
	 * This is true if the Origin attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean originESet;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final McReasonT REASON_EDEFAULT = McReasonT.RECOGNITIONERROR;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected McReasonT reason = REASON_EDEFAULT;

	/**
	 * This is true if the Reason attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reasonESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalityChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODALITY_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleT getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(RoleT newOrigin) {
		RoleT oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		boolean oldOriginESet = originESet;
		originESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_CHANGE__ORIGIN, oldOrigin, origin, !oldOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOrigin() {
		RoleT oldOrigin = origin;
		boolean oldOriginESet = originESet;
		origin = ORIGIN_EDEFAULT;
		originESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_CHANGE__ORIGIN, oldOrigin, ORIGIN_EDEFAULT, oldOriginESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOrigin() {
		return originESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McReasonT getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(McReasonT newReason) {
		McReasonT oldReason = reason;
		reason = newReason == null ? REASON_EDEFAULT : newReason;
		boolean oldReasonESet = reasonESet;
		reasonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_CHANGE__REASON, oldReason, reason, !oldReasonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReason() {
		McReasonT oldReason = reason;
		boolean oldReasonESet = reasonESet;
		reason = REASON_EDEFAULT;
		reasonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_CHANGE__REASON, oldReason, REASON_EDEFAULT, oldReasonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReason() {
		return reasonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MODALITY_CHANGE__ORIGIN:
				return getOrigin();
			case ModelPackage.MODALITY_CHANGE__REASON:
				return getReason();
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
			case ModelPackage.MODALITY_CHANGE__ORIGIN:
				setOrigin((RoleT)newValue);
				return;
			case ModelPackage.MODALITY_CHANGE__REASON:
				setReason((McReasonT)newValue);
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
			case ModelPackage.MODALITY_CHANGE__ORIGIN:
				unsetOrigin();
				return;
			case ModelPackage.MODALITY_CHANGE__REASON:
				unsetReason();
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
			case ModelPackage.MODALITY_CHANGE__ORIGIN:
				return isSetOrigin();
			case ModelPackage.MODALITY_CHANGE__REASON:
				return isSetReason();
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
		result.append(" (origin: ");
		if (originESet) result.append(origin); else result.append("<unset>");
		result.append(", reason: ");
		if (reasonESet) result.append(reason); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModalityChangeImpl
