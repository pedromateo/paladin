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

import org.mmi.model.ModalitySynchroni;
import org.mmi.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modality Synchroni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.ModalitySynchroniImpl#getNlags <em>Nlags</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalitySynchroniImpl#getLagtime <em>Lagtime</em>}</li>
 *   <li>{@link org.mmi.model.impl.ModalitySynchroniImpl#getNevents <em>Nevents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModalitySynchroniImpl extends EObjectImpl implements ModalitySynchroni {
	/**
	 * The default value of the '{@link #getNlags() <em>Nlags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNlags()
	 * @generated
	 * @ordered
	 */
	protected static final long NLAGS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNlags() <em>Nlags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNlags()
	 * @generated
	 * @ordered
	 */
	protected long nlags = NLAGS_EDEFAULT;

	/**
	 * This is true if the Nlags attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nlagsESet;

	/**
	 * The default value of the '{@link #getLagtime() <em>Lagtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagtime()
	 * @generated
	 * @ordered
	 */
	protected static final long LAGTIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLagtime() <em>Lagtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLagtime()
	 * @generated
	 * @ordered
	 */
	protected long lagtime = LAGTIME_EDEFAULT;

	/**
	 * This is true if the Lagtime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lagtimeESet;

	/**
	 * The default value of the '{@link #getNevents() <em>Nevents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNevents()
	 * @generated
	 * @ordered
	 */
	protected static final long NEVENTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNevents() <em>Nevents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNevents()
	 * @generated
	 * @ordered
	 */
	protected long nevents = NEVENTS_EDEFAULT;

	/**
	 * This is true if the Nevents attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean neventsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModalitySynchroniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODALITY_SYNCHRONI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNlags() {
		return nlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNlags(long newNlags) {
		long oldNlags = nlags;
		nlags = newNlags;
		boolean oldNlagsESet = nlagsESet;
		nlagsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_SYNCHRONI__NLAGS, oldNlags, nlags, !oldNlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNlags() {
		long oldNlags = nlags;
		boolean oldNlagsESet = nlagsESet;
		nlags = NLAGS_EDEFAULT;
		nlagsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_SYNCHRONI__NLAGS, oldNlags, NLAGS_EDEFAULT, oldNlagsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNlags() {
		return nlagsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLagtime() {
		return lagtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLagtime(long newLagtime) {
		long oldLagtime = lagtime;
		lagtime = newLagtime;
		boolean oldLagtimeESet = lagtimeESet;
		lagtimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_SYNCHRONI__LAGTIME, oldLagtime, lagtime, !oldLagtimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLagtime() {
		long oldLagtime = lagtime;
		boolean oldLagtimeESet = lagtimeESet;
		lagtime = LAGTIME_EDEFAULT;
		lagtimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_SYNCHRONI__LAGTIME, oldLagtime, LAGTIME_EDEFAULT, oldLagtimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLagtime() {
		return lagtimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNevents() {
		return nevents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNevents(long newNevents) {
		long oldNevents = nevents;
		nevents = newNevents;
		boolean oldNeventsESet = neventsESet;
		neventsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODALITY_SYNCHRONI__NEVENTS, oldNevents, nevents, !oldNeventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNevents() {
		long oldNevents = nevents;
		boolean oldNeventsESet = neventsESet;
		nevents = NEVENTS_EDEFAULT;
		neventsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MODALITY_SYNCHRONI__NEVENTS, oldNevents, NEVENTS_EDEFAULT, oldNeventsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNevents() {
		return neventsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MODALITY_SYNCHRONI__NLAGS:
				return getNlags();
			case ModelPackage.MODALITY_SYNCHRONI__LAGTIME:
				return getLagtime();
			case ModelPackage.MODALITY_SYNCHRONI__NEVENTS:
				return getNevents();
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
			case ModelPackage.MODALITY_SYNCHRONI__NLAGS:
				setNlags((Long)newValue);
				return;
			case ModelPackage.MODALITY_SYNCHRONI__LAGTIME:
				setLagtime((Long)newValue);
				return;
			case ModelPackage.MODALITY_SYNCHRONI__NEVENTS:
				setNevents((Long)newValue);
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
			case ModelPackage.MODALITY_SYNCHRONI__NLAGS:
				unsetNlags();
				return;
			case ModelPackage.MODALITY_SYNCHRONI__LAGTIME:
				unsetLagtime();
				return;
			case ModelPackage.MODALITY_SYNCHRONI__NEVENTS:
				unsetNevents();
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
			case ModelPackage.MODALITY_SYNCHRONI__NLAGS:
				return isSetNlags();
			case ModelPackage.MODALITY_SYNCHRONI__LAGTIME:
				return isSetLagtime();
			case ModelPackage.MODALITY_SYNCHRONI__NEVENTS:
				return isSetNevents();
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
		result.append(" (nlags: ");
		if (nlagsESet) result.append(nlags); else result.append("<unset>");
		result.append(", lagtime: ");
		if (lagtimeESet) result.append(lagtime); else result.append("<unset>");
		result.append(", nevents: ");
		if (neventsESet) result.append(nevents); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ModalitySynchroniImpl
