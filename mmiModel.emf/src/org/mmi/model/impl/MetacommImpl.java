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

import org.mmi.model.Metacomm;
import org.mmi.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metacomm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.MetacommImpl#isIsHelp <em>Is Help</em>}</li>
 *   <li>{@link org.mmi.model.impl.MetacommImpl#isIsCorrection <em>Is Correction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MetacommImpl extends EObjectImpl implements Metacomm {
	/**
	 * The default value of the '{@link #isIsHelp() <em>Is Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHelp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HELP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHelp() <em>Is Help</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHelp()
	 * @generated
	 * @ordered
	 */
	protected boolean isHelp = IS_HELP_EDEFAULT;

	/**
	 * This is true if the Is Help attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isHelpESet;

	/**
	 * The default value of the '{@link #isIsCorrection() <em>Is Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCorrection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CORRECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCorrection() <em>Is Correction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCorrection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCorrection = IS_CORRECTION_EDEFAULT;

	/**
	 * This is true if the Is Correction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCorrectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetacommImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.METACOMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHelp() {
		return isHelp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHelp(boolean newIsHelp) {
		boolean oldIsHelp = isHelp;
		isHelp = newIsHelp;
		boolean oldIsHelpESet = isHelpESet;
		isHelpESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METACOMM__IS_HELP, oldIsHelp, isHelp, !oldIsHelpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsHelp() {
		boolean oldIsHelp = isHelp;
		boolean oldIsHelpESet = isHelpESet;
		isHelp = IS_HELP_EDEFAULT;
		isHelpESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.METACOMM__IS_HELP, oldIsHelp, IS_HELP_EDEFAULT, oldIsHelpESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsHelp() {
		return isHelpESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCorrection() {
		return isCorrection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCorrection(boolean newIsCorrection) {
		boolean oldIsCorrection = isCorrection;
		isCorrection = newIsCorrection;
		boolean oldIsCorrectionESet = isCorrectionESet;
		isCorrectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.METACOMM__IS_CORRECTION, oldIsCorrection, isCorrection, !oldIsCorrectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCorrection() {
		boolean oldIsCorrection = isCorrection;
		boolean oldIsCorrectionESet = isCorrectionESet;
		isCorrection = IS_CORRECTION_EDEFAULT;
		isCorrectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.METACOMM__IS_CORRECTION, oldIsCorrection, IS_CORRECTION_EDEFAULT, oldIsCorrectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCorrection() {
		return isCorrectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.METACOMM__IS_HELP:
				return isIsHelp();
			case ModelPackage.METACOMM__IS_CORRECTION:
				return isIsCorrection();
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
			case ModelPackage.METACOMM__IS_HELP:
				setIsHelp((Boolean)newValue);
				return;
			case ModelPackage.METACOMM__IS_CORRECTION:
				setIsCorrection((Boolean)newValue);
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
			case ModelPackage.METACOMM__IS_HELP:
				unsetIsHelp();
				return;
			case ModelPackage.METACOMM__IS_CORRECTION:
				unsetIsCorrection();
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
			case ModelPackage.METACOMM__IS_HELP:
				return isSetIsHelp();
			case ModelPackage.METACOMM__IS_CORRECTION:
				return isSetIsCorrection();
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
		result.append(" (isHelp: ");
		if (isHelpESet) result.append(isHelp); else result.append("<unset>");
		result.append(", isCorrection: ");
		if (isCorrectionESet) result.append(isCorrection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MetacommImpl
