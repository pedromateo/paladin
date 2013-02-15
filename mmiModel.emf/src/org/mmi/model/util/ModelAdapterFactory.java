/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mmi.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mmi.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mmi.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAvm(Avm object) {
				return createAvmAdapter();
			}
			@Override
			public Adapter caseCooperativity(Cooperativity object) {
				return createCooperativityAdapter();
			}
			@Override
			public Adapter caseDialogue(Dialogue object) {
				return createDialogueAdapter();
			}
			@Override
			public Adapter caseDialogueStepT(DialogueStepT object) {
				return createDialogueStepTAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseGuiInput(GuiInput object) {
				return createGuiInputAdapter();
			}
			@Override
			public Adapter caseMetacomm(Metacomm object) {
				return createMetacommAdapter();
			}
			@Override
			public Adapter caseModalityAppropriateness(ModalityAppropriateness object) {
				return createModalityAppropriatenessAdapter();
			}
			@Override
			public Adapter caseModalityChange(ModalityChange object) {
				return createModalityChangeAdapter();
			}
			@Override
			public Adapter caseModalityInfo(ModalityInfo object) {
				return createModalityInfoAdapter();
			}
			@Override
			public Adapter caseModalitySynchroni(ModalitySynchroni object) {
				return createModalitySynchroniAdapter();
			}
			@Override
			public Adapter caseSpeechInput(SpeechInput object) {
				return createSpeechInputAdapter();
			}
			@Override
			public Adapter caseSpeechOutput(SpeechOutput object) {
				return createSpeechOutputAdapter();
			}
			@Override
			public Adapter caseSystemMetacomm(SystemMetacomm object) {
				return createSystemMetacommAdapter();
			}
			@Override
			public Adapter caseSystemTurn(SystemTurn object) {
				return createSystemTurnAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseTurn(Turn object) {
				return createTurnAdapter();
			}
			@Override
			public Adapter caseUserMetacomm(UserMetacomm object) {
				return createUserMetacommAdapter();
			}
			@Override
			public Adapter caseUserTurn(UserTurn object) {
				return createUserTurnAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.Avm <em>Avm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.Avm
	 * @generated
	 */
	public Adapter createAvmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.Cooperativity <em>Cooperativity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.Cooperativity
	 * @generated
	 */
	public Adapter createCooperativityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.Dialogue <em>Dialogue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.Dialogue
	 * @generated
	 */
	public Adapter createDialogueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.DialogueStepT <em>Dialogue Step T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.DialogueStepT
	 * @generated
	 */
	public Adapter createDialogueStepTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.GuiInput <em>Gui Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.GuiInput
	 * @generated
	 */
	public Adapter createGuiInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.Metacomm <em>Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.Metacomm
	 * @generated
	 */
	public Adapter createMetacommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.ModalityAppropriateness <em>Modality Appropriateness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.ModalityAppropriateness
	 * @generated
	 */
	public Adapter createModalityAppropriatenessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.ModalityChange <em>Modality Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.ModalityChange
	 * @generated
	 */
	public Adapter createModalityChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.ModalityInfo <em>Modality Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.ModalityInfo
	 * @generated
	 */
	public Adapter createModalityInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.ModalitySynchroni <em>Modality Synchroni</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.ModalitySynchroni
	 * @generated
	 */
	public Adapter createModalitySynchroniAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.SpeechInput <em>Speech Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.SpeechInput
	 * @generated
	 */
	public Adapter createSpeechInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.SpeechOutput <em>Speech Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.SpeechOutput
	 * @generated
	 */
	public Adapter createSpeechOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.SystemMetacomm <em>System Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.SystemMetacomm
	 * @generated
	 */
	public Adapter createSystemMetacommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.SystemTurn <em>System Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.SystemTurn
	 * @generated
	 */
	public Adapter createSystemTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.UserMetacomm <em>User Metacomm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.UserMetacomm
	 * @generated
	 */
	public Adapter createUserMetacommAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mmi.model.UserTurn <em>User Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mmi.model.UserTurn
	 * @generated
	 */
	public Adapter createUserTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
