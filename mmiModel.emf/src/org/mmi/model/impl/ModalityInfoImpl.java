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

import org.mmi.model.MmiTypeT;
import org.mmi.model.ModTypeT;
import org.mmi.model.ModalityAppropriateness;
import org.mmi.model.ModalityChange;
import org.mmi.model.ModalityInfo;
import org.mmi.model.ModalitySynchroni;
import org.mmi.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modality Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.ModalityInfoImpl#getModalityType <em>Modality Type</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalityInfoImpl#getMmiType <em>Mmi Type</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalityInfoImpl#getAppropriateness <em>Appropriateness</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalityInfoImpl#getSynchroni <em>Synchroni</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalityInfoImpl#getChange <em>Change</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModalityInfoImpl extends EObjectImpl implements ModalityInfo {
	/**
	 * The default value of the '{@link #getModalityType() <em>Modality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalityType()
	 * @generated
	 * @ordered
	 */
	protected static final ModTypeT MODALITY_TYPE_EDEFAULT = ModTypeT.S;

	/**
	 * The cached value of the '{@link #getModalityType() <em>Modality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModalityType()
	 * @generated
	 * @ordered
	 */
	protected ModTypeT modalityType = MODALITY_TYPE_EDEFAULT;

	/**
	 * This is true if the Modality Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modalityTypeESet;

	/**
	 * The default value of the '{@link #getMmiType() <em>Mmi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMmiType()
	 * @generated
	 * @ordered
	 */
	protected static final MmiTypeT MMI_TYPE_EDEFAULT = MmiTypeT.UNIMODAL;

	/**
	 * The cached value of the '{@link #getMmiType() <em>Mmi Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMmiType()
	 * @generated
	 * @ordered
	 */
	protected MmiTypeT mmiType = MMI_TYPE_EDEFAULT;

	/**
	 * This is true if the Mmi Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mmiTypeESet;

	/**
	 * The cached value of the '{@link #getAppropriateness() <em>Appropriateness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected ModalityAppropriateness appropriateness;

	/**
	 * The cached value of the '{@link #getSynchroni() <em>Synchroni</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchroni()
	 * @generated
	 * @ordered
	 */
	protected ModalitySynchroni synchroni;

	/**
	 * The cached value of the '{@link #getChange() <em>Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChange()
	 * @generated
	 * @ordered
	 */
	protected ModalityChange change;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalityInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODALITY_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModTypeT getModalityType() {
		return modalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModalityType(ModTypeT newModalityType) {
		ModTypeT oldModalityType = modalityType;
		modalityType = newModalityType == null ? MODALITY_TYPE_EDEFAULT : newModalityType;
		boolean oldModalityTypeESet = modalityTypeESet;
		modalityTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__MODALITY_TYPE, oldModalityType, modalityType, !oldModalityTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModalityType() {
		ModTypeT oldModalityType = modalityType;
		boolean oldModalityTypeESet = modalityTypeESet;
		modalityType = MODALITY_TYPE_EDEFAULT;
		modalityTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_INFO__MODALITY_TYPE, oldModalityType, MODALITY_TYPE_EDEFAULT, oldModalityTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModalityType() {
		return modalityTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MmiTypeT getMmiType() {
		return mmiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMmiType(MmiTypeT newMmiType) {
		MmiTypeT oldMmiType = mmiType;
		mmiType = newMmiType == null ? MMI_TYPE_EDEFAULT : newMmiType;
		boolean oldMmiTypeESet = mmiTypeESet;
		mmiTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__MMI_TYPE, oldMmiType, mmiType, !oldMmiTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMmiType() {
		MmiTypeT oldMmiType = mmiType;
		boolean oldMmiTypeESet = mmiTypeESet;
		mmiType = MMI_TYPE_EDEFAULT;
		mmiTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_INFO__MMI_TYPE, oldMmiType, MMI_TYPE_EDEFAULT, oldMmiTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMmiType() {
		return mmiTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityAppropriateness getAppropriateness() {
		return appropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppropriateness(ModalityAppropriateness newAppropriateness, NotificationChain msgs) {
		ModalityAppropriateness oldAppropriateness = appropriateness;
		appropriateness = newAppropriateness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__APPROPRIATENESS, oldAppropriateness, newAppropriateness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppropriateness(ModalityAppropriateness newAppropriateness) {
		if (newAppropriateness != appropriateness) {
			NotificationChain msgs = null;
			if (appropriateness != null)
				msgs = ((InternalEObject)appropriateness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODALITY_INFO__APPROPRIATENESS, null, msgs);
			if (newAppropriateness != null)
				msgs = ((InternalEObject)newAppropriateness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODALITY_INFO__APPROPRIATENESS, null, msgs);
			msgs = basicSetAppropriateness(newAppropriateness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__APPROPRIATENESS, newAppropriateness, newAppropriateness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalitySynchroni getSynchroni() {
		return synchroni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchroni(ModalitySynchroni newSynchroni, NotificationChain msgs) {
		ModalitySynchroni oldSynchroni = synchroni;
		synchroni = newSynchroni;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__SYNCHRONI, oldSynchroni, newSynchroni);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchroni(ModalitySynchroni newSynchroni) {
		if (newSynchroni != synchroni) {
			NotificationChain msgs = null;
			if (synchroni != null)
				msgs = ((InternalEObject)synchroni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODALITY_INFO__SYNCHRONI, null, msgs);
			if (newSynchroni != null)
				msgs = ((InternalEObject)newSynchroni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODALITY_INFO__SYNCHRONI, null, msgs);
			msgs = basicSetSynchroni(newSynchroni, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__SYNCHRONI, newSynchroni, newSynchroni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModalityChange getChange() {
		return change;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChange(ModalityChange newChange, NotificationChain msgs) {
		ModalityChange oldChange = change;
		change = newChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__CHANGE, oldChange, newChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChange(ModalityChange newChange) {
		if (newChange != change) {
			NotificationChain msgs = null;
			if (change != null)
				msgs = ((InternalEObject)change).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODALITY_INFO__CHANGE, null, msgs);
			if (newChange != null)
				msgs = ((InternalEObject)newChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODALITY_INFO__CHANGE, null, msgs);
			msgs = basicSetChange(newChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_INFO__CHANGE, newChange, newChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MODALITY_INFO__APPROPRIATENESS:
				return basicSetAppropriateness(null, msgs);
			case ModelPackage.MODALITY_INFO__SYNCHRONI:
				return basicSetSynchroni(null, msgs);
			case ModelPackage.MODALITY_INFO__CHANGE:
				return basicSetChange(null, msgs);
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
			case ModelPackage.MODALITY_INFO__MODALITY_TYPE:
				return getModalityType();
			case ModelPackage.MODALITY_INFO__MMI_TYPE:
				return getMmiType();
			case ModelPackage.MODALITY_INFO__APPROPRIATENESS:
				return getAppropriateness();
			case ModelPackage.MODALITY_INFO__SYNCHRONI:
				return getSynchroni();
			case ModelPackage.MODALITY_INFO__CHANGE:
				return getChange();
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
			case ModelPackage.MODALITY_INFO__MODALITY_TYPE:
				setModalityType((ModTypeT)newValue);
				return;
			case ModelPackage.MODALITY_INFO__MMI_TYPE:
				setMmiType((MmiTypeT)newValue);
				return;
			case ModelPackage.MODALITY_INFO__APPROPRIATENESS:
				setAppropriateness((ModalityAppropriateness)newValue);
				return;
			case ModelPackage.MODALITY_INFO__SYNCHRONI:
				setSynchroni((ModalitySynchroni)newValue);
				return;
			case ModelPackage.MODALITY_INFO__CHANGE:
				setChange((ModalityChange)newValue);
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
			case ModelPackage.MODALITY_INFO__MODALITY_TYPE:
				unsetModalityType();
				return;
			case ModelPackage.MODALITY_INFO__MMI_TYPE:
				unsetMmiType();
				return;
			case ModelPackage.MODALITY_INFO__APPROPRIATENESS:
				setAppropriateness((ModalityAppropriateness)null);
				return;
			case ModelPackage.MODALITY_INFO__SYNCHRONI:
				setSynchroni((ModalitySynchroni)null);
				return;
			case ModelPackage.MODALITY_INFO__CHANGE:
				setChange((ModalityChange)null);
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
			case ModelPackage.MODALITY_INFO__MODALITY_TYPE:
				return isSetModalityType();
			case ModelPackage.MODALITY_INFO__MMI_TYPE:
				return isSetMmiType();
			case ModelPackage.MODALITY_INFO__APPROPRIATENESS:
				return appropriateness != null;
			case ModelPackage.MODALITY_INFO__SYNCHRONI:
				return synchroni != null;
			case ModelPackage.MODALITY_INFO__CHANGE:
				return change != null;
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
		result.append(" (modalityType: ");
		if (modalityTypeESet) result.append(modalityType); else result.append("<unset>");
		result.append(", mmiType: ");
		if (mmiTypeESet) result.append(mmiType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModalityInfoImpl
