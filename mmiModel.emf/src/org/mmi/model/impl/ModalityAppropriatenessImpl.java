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

import org.mmi.model.ModAppropT;
import org.mmi.model.ModalityAppropriateness;
import org.mmi.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modality Appropriateness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.ModalityAppropriatenessImpl#getAppropriateness <em>Appropriateness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModalityAppropriatenessImpl extends EObjectImpl implements ModalityAppropriateness {
	/**
	 * The default value of the '{@link #getAppropriateness() <em>Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected static final ModAppropT APPROPRIATENESS_EDEFAULT = ModAppropT.APPROPRIATE;

	/**
	 * The cached value of the '{@link #getAppropriateness() <em>Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected ModAppropT appropriateness = APPROPRIATENESS_EDEFAULT;

	/**
	 * This is true if the Appropriateness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appropriatenessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalityAppropriatenessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODALITY_APPROPRIATENESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModAppropT getAppropriateness() {
		return appropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppropriateness(ModAppropT newAppropriateness) {
		ModAppropT oldAppropriateness = appropriateness;
		appropriateness = newAppropriateness == null ? APPROPRIATENESS_EDEFAULT : newAppropriateness;
		boolean oldAppropriatenessESet = appropriatenessESet;
		appropriatenessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_APPROPRIATENESS__APPROPRIATENESS, oldAppropriateness, appropriateness, !oldAppropriatenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppropriateness() {
		ModAppropT oldAppropriateness = appropriateness;
		boolean oldAppropriatenessESet = appropriatenessESet;
		appropriateness = APPROPRIATENESS_EDEFAULT;
		appropriatenessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_APPROPRIATENESS__APPROPRIATENESS, oldAppropriateness, APPROPRIATENESS_EDEFAULT, oldAppropriatenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppropriateness() {
		return appropriatenessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MODALITY_APPROPRIATENESS__APPROPRIATENESS:
				return getAppropriateness();
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
			case ModelPackage.MODALITY_APPROPRIATENESS__APPROPRIATENESS:
				setAppropriateness((ModAppropT)newValue);
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
			case ModelPackage.MODALITY_APPROPRIATENESS__APPROPRIATENESS:
				unsetAppropriateness();
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
			case ModelPackage.MODALITY_APPROPRIATENESS__APPROPRIATENESS:
				return isSetAppropriateness();
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
		result.append(" (appropriateness: ");
		if (appropriatenessESet) result.append(appropriateness); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModalityAppropriatenessImpl
