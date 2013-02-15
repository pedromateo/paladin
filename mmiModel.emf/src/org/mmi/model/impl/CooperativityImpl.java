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

import org.mmi.model.ContextualAppropriatenessT;
import org.mmi.model.Cooperativity;
import org.mmi.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cooperativity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.CooperativityImpl#getContextualAppropriateness <em>Contextual Appropriateness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CooperativityImpl extends EObjectImpl implements Cooperativity {
	/**
	 * The default value of the '{@link #getContextualAppropriateness() <em>Contextual Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected static final ContextualAppropriatenessT CONTEXTUAL_APPROPRIATENESS_EDEFAULT = ContextualAppropriatenessT.APPROPRIATE;

	/**
	 * The cached value of the '{@link #getContextualAppropriateness() <em>Contextual Appropriateness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualAppropriateness()
	 * @generated
	 * @ordered
	 */
	protected ContextualAppropriatenessT contextualAppropriateness = CONTEXTUAL_APPROPRIATENESS_EDEFAULT;

	/**
	 * This is true if the Contextual Appropriateness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextualAppropriatenessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CooperativityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COOPERATIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualAppropriatenessT getContextualAppropriateness() {
		return contextualAppropriateness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualAppropriateness(ContextualAppropriatenessT newContextualAppropriateness) {
		ContextualAppropriatenessT oldContextualAppropriateness = contextualAppropriateness;
		contextualAppropriateness = newContextualAppropriateness == null ? CONTEXTUAL_APPROPRIATENESS_EDEFAULT : newContextualAppropriateness;
		boolean oldContextualAppropriatenessESet = contextualAppropriatenessESet;
		contextualAppropriatenessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS, oldContextualAppropriateness, contextualAppropriateness, !oldContextualAppropriatenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextualAppropriateness() {
		ContextualAppropriatenessT oldContextualAppropriateness = contextualAppropriateness;
		boolean oldContextualAppropriatenessESet = contextualAppropriatenessESet;
		contextualAppropriateness = CONTEXTUAL_APPROPRIATENESS_EDEFAULT;
		contextualAppropriatenessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS, oldContextualAppropriateness, CONTEXTUAL_APPROPRIATENESS_EDEFAULT, oldContextualAppropriatenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextualAppropriateness() {
		return contextualAppropriatenessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS:
				return getContextualAppropriateness();
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
			case ModelPackage.COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS:
				setContextualAppropriateness((ContextualAppropriatenessT)newValue);
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
			case ModelPackage.COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS:
				unsetContextualAppropriateness();
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
			case ModelPackage.COOPERATIVITY__CONTEXTUAL_APPROPRIATENESS:
				return isSetContextualAppropriateness();
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
		result.append(" (contextualAppropriateness: ");
		if (contextualAppropriatenessESet) result.append(contextualAppropriateness); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CooperativityImpl
