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

import org.mmi.model.ModelPackage;
import org.mmi.model.PromptTypeT;
import org.mmi.model.SpeechOutput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speech Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mmi.model.impl.SpeechOutputImpl#getANCO <em>ANCO</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechOutputImpl#getANIN <em>ANIN</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechOutputImpl#getANPA <em>ANPA</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechOutputImpl#getANFA <em>ANFA</em>}</li>
 *   <li>{@link org.mmi.model.impl.SpeechOutputImpl#getPromptType <em>Prompt Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpeechOutputImpl extends EObjectImpl implements SpeechOutput {
	/**
	 * The default value of the '{@link #getANCO() <em>ANCO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANCO()
	 * @generated
	 * @ordered
	 */
	protected static final long ANCO_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getANCO() <em>ANCO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANCO()
	 * @generated
	 * @ordered
	 */
	protected long aNCO = ANCO_EDEFAULT;

	/**
	 * This is true if the ANCO attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aNCOESet;

	/**
	 * The default value of the '{@link #getANIN() <em>ANIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANIN()
	 * @generated
	 * @ordered
	 */
	protected static final long ANIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getANIN() <em>ANIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANIN()
	 * @generated
	 * @ordered
	 */
	protected long aNIN = ANIN_EDEFAULT;

	/**
	 * This is true if the ANIN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aNINESet;

	/**
	 * The default value of the '{@link #getANPA() <em>ANPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANPA()
	 * @generated
	 * @ordered
	 */
	protected static final long ANPA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getANPA() <em>ANPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANPA()
	 * @generated
	 * @ordered
	 */
	protected long aNPA = ANPA_EDEFAULT;

	/**
	 * This is true if the ANPA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aNPAESet;

	/**
	 * The default value of the '{@link #getANFA() <em>ANFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANFA()
	 * @generated
	 * @ordered
	 */
	protected static final long ANFA_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getANFA() <em>ANFA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getANFA()
	 * @generated
	 * @ordered
	 */
	protected long aNFA = ANFA_EDEFAULT;

	/**
	 * This is true if the ANFA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aNFAESet;

	/**
	 * The default value of the '{@link #getPromptType() <em>Prompt Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromptType()
	 * @generated
	 * @ordered
	 */
	protected static final PromptTypeT PROMPT_TYPE_EDEFAULT = PromptTypeT.OPEN;

	/**
	 * The cached value of the '{@link #getPromptType() <em>Prompt Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromptType()
	 * @generated
	 * @ordered
	 */
	protected PromptTypeT promptType = PROMPT_TYPE_EDEFAULT;

	/**
	 * This is true if the Prompt Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean promptTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeechOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SPEECH_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getANCO() {
		return aNCO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANCO(long newANCO) {
		long oldANCO = aNCO;
		aNCO = newANCO;
		boolean oldANCOESet = aNCOESet;
		aNCOESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_OUTPUT__ANCO, oldANCO, aNCO, !oldANCOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetANCO() {
		long oldANCO = aNCO;
		boolean oldANCOESet = aNCOESet;
		aNCO = ANCO_EDEFAULT;
		aNCOESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_OUTPUT__ANCO, oldANCO, ANCO_EDEFAULT, oldANCOESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetANCO() {
		return aNCOESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getANIN() {
		return aNIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANIN(long newANIN) {
		long oldANIN = aNIN;
		aNIN = newANIN;
		boolean oldANINESet = aNINESet;
		aNINESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_OUTPUT__ANIN, oldANIN, aNIN, !oldANINESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetANIN() {
		long oldANIN = aNIN;
		boolean oldANINESet = aNINESet;
		aNIN = ANIN_EDEFAULT;
		aNINESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_OUTPUT__ANIN, oldANIN, ANIN_EDEFAULT, oldANINESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetANIN() {
		return aNINESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getANPA() {
		return aNPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANPA(long newANPA) {
		long oldANPA = aNPA;
		aNPA = newANPA;
		boolean oldANPAESet = aNPAESet;
		aNPAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_OUTPUT__ANPA, oldANPA, aNPA, !oldANPAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetANPA() {
		long oldANPA = aNPA;
		boolean oldANPAESet = aNPAESet;
		aNPA = ANPA_EDEFAULT;
		aNPAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_OUTPUT__ANPA, oldANPA, ANPA_EDEFAULT, oldANPAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetANPA() {
		return aNPAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getANFA() {
		return aNFA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setANFA(long newANFA) {
		long oldANFA = aNFA;
		aNFA = newANFA;
		boolean oldANFAESet = aNFAESet;
		aNFAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_OUTPUT__ANFA, oldANFA, aNFA, !oldANFAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetANFA() {
		long oldANFA = aNFA;
		boolean oldANFAESet = aNFAESet;
		aNFA = ANFA_EDEFAULT;
		aNFAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_OUTPUT__ANFA, oldANFA, ANFA_EDEFAULT, oldANFAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetANFA() {
		return aNFAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromptTypeT getPromptType() {
		return promptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromptType(PromptTypeT newPromptType) {
		PromptTypeT oldPromptType = promptType;
		promptType = newPromptType == null ? PROMPT_TYPE_EDEFAULT : newPromptType;
		boolean oldPromptTypeESet = promptTypeESet;
		promptTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SPEECH_OUTPUT__PROMPT_TYPE, oldPromptType, promptType, !oldPromptTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPromptType() {
		PromptTypeT oldPromptType = promptType;
		boolean oldPromptTypeESet = promptTypeESet;
		promptType = PROMPT_TYPE_EDEFAULT;
		promptTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SPEECH_OUTPUT__PROMPT_TYPE, oldPromptType, PROMPT_TYPE_EDEFAULT, oldPromptTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPromptType() {
		return promptTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SPEECH_OUTPUT__ANCO:
				return getANCO();
			case ModelPackage.SPEECH_OUTPUT__ANIN:
				return getANIN();
			case ModelPackage.SPEECH_OUTPUT__ANPA:
				return getANPA();
			case ModelPackage.SPEECH_OUTPUT__ANFA:
				return getANFA();
			case ModelPackage.SPEECH_OUTPUT__PROMPT_TYPE:
				return getPromptType();
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
			case ModelPackage.SPEECH_OUTPUT__ANCO:
				setANCO((Long)newValue);
				return;
			case ModelPackage.SPEECH_OUTPUT__ANIN:
				setANIN((Long)newValue);
				return;
			case ModelPackage.SPEECH_OUTPUT__ANPA:
				setANPA((Long)newValue);
				return;
			case ModelPackage.SPEECH_OUTPUT__ANFA:
				setANFA((Long)newValue);
				return;
			case ModelPackage.SPEECH_OUTPUT__PROMPT_TYPE:
				setPromptType((PromptTypeT)newValue);
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
			case ModelPackage.SPEECH_OUTPUT__ANCO:
				unsetANCO();
				return;
			case ModelPackage.SPEECH_OUTPUT__ANIN:
				unsetANIN();
				return;
			case ModelPackage.SPEECH_OUTPUT__ANPA:
				unsetANPA();
				return;
			case ModelPackage.SPEECH_OUTPUT__ANFA:
				unsetANFA();
				return;
			case ModelPackage.SPEECH_OUTPUT__PROMPT_TYPE:
				unsetPromptType();
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
			case ModelPackage.SPEECH_OUTPUT__ANCO:
				return isSetANCO();
			case ModelPackage.SPEECH_OUTPUT__ANIN:
				return isSetANIN();
			case ModelPackage.SPEECH_OUTPUT__ANPA:
				return isSetANPA();
			case ModelPackage.SPEECH_OUTPUT__ANFA:
				return isSetANFA();
			case ModelPackage.SPEECH_OUTPUT__PROMPT_TYPE:
				return isSetPromptType();
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
		result.append(" (aNCO: ");
		if (aNCOESet) result.append(aNCO); else result.append("<unset>");
		result.append(", aNIN: ");
		if (aNINESet) result.append(aNIN); else result.append("<unset>");
		result.append(", aNPA: ");
		if (aNPAESet) result.append(aNPA); else result.append("<unset>");
		result.append(", aNFA: ");
		if (aNFAESet) result.append(aNFA); else result.append("<unset>");
		result.append(", promptType: ");
		if (promptTypeESet) result.append(promptType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SpeechOutputImpl
