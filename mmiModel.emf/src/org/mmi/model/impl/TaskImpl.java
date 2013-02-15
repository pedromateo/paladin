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

import org.mmi.model.Avm;
import org.mmi.model.ModelPackage;
import org.mmi.model.Task;
import org.mmi.model.TaskSuccessT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.TaskImpl#getSuccess <em>Success</em>}</li>
 *   <li>{@link org.mmi.model.impl.TaskImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.mmi.model.impl.TaskImpl#getAvm <em>Avm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final TaskSuccessT SUCCESS_EDEFAULT = TaskSuccessT.SUCCEEDED;

	/**
	 * The cached value of the '{@link #getSuccess() <em>Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccess()
	 * @generated
	 * @ordered
	 */
	protected TaskSuccessT success = SUCCESS_EDEFAULT;

	/**
	 * This is true if the Success attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean successESet;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvm() <em>Avm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvm()
	 * @generated
	 * @ordered
	 */
	protected Avm avm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSuccessT getSuccess() {
		return success;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccess(TaskSuccessT newSuccess) {
		TaskSuccessT oldSuccess = success;
		success = newSuccess == null ? SUCCESS_EDEFAULT : newSuccess;
		boolean oldSuccessESet = successESet;
		successESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__SUCCESS, oldSuccess, success, !oldSuccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuccess() {
		TaskSuccessT oldSuccess = success;
		boolean oldSuccessESet = successESet;
		success = SUCCESS_EDEFAULT;
		successESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.TASK__SUCCESS, oldSuccess, SUCCESS_EDEFAULT, oldSuccessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuccess() {
		return successESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Avm getAvm() {
		return avm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvm(Avm newAvm, NotificationChain msgs) {
		Avm oldAvm = avm;
		avm = newAvm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__AVM, oldAvm, newAvm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvm(Avm newAvm) {
		if (newAvm != avm) {
			NotificationChain msgs = null;
			if (avm != null)
				msgs = ((InternalEObject)avm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TASK__AVM, null, msgs);
			if (newAvm != null)
				msgs = ((InternalEObject)newAvm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.TASK__AVM, null, msgs);
			msgs = basicSetAvm(newAvm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TASK__AVM, newAvm, newAvm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.TASK__AVM:
				return basicSetAvm(null, msgs);
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
			case ModelPackage.TASK__SUCCESS:
				return getSuccess();
			case ModelPackage.TASK__REASON:
				return getReason();
			case ModelPackage.TASK__AVM:
				return getAvm();
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
			case ModelPackage.TASK__SUCCESS:
				setSuccess((TaskSuccessT)newValue);
				return;
			case ModelPackage.TASK__REASON:
				setReason((String)newValue);
				return;
			case ModelPackage.TASK__AVM:
				setAvm((Avm)newValue);
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
			case ModelPackage.TASK__SUCCESS:
				unsetSuccess();
				return;
			case ModelPackage.TASK__REASON:
				setReason(REASON_EDEFAULT);
				return;
			case ModelPackage.TASK__AVM:
				setAvm((Avm)null);
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
			case ModelPackage.TASK__SUCCESS:
				return isSetSuccess();
			case ModelPackage.TASK__REASON:
				return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
			case ModelPackage.TASK__AVM:
				return avm != null;
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
		result.append(" (success: ");
		if (successESet) result.append(success); else result.append("<unset>");
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
