/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl#getOptionModifications <em>Option Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl#getApsiecSeedModifications <em>Apsiec Seed Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class APSReqSeedModificationsImpl<T extends AbstractSeedModifications> extends AbstractSeedModificationsImpl implements APSReqSeedModifications<T> {
	/**
	 * The cached value of the '{@link #getRequirementModifications() <em>Requirement Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyRequirement> requirementModifications;

	/**
	 * The cached value of the '{@link #getDecisionModifications() <em>Decision Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyDecision> decisionModifications;

	/**
	 * The cached value of the '{@link #getOptionModifications() <em>Option Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyOption> optionModifications;

	/**
	 * The cached value of the '{@link #getApsiecSeedModifications() <em>Apsiec Seed Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApsiecSeedModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<T> apsiecSeedModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyRequirement> getRequirementModifications() {
		if (requirementModifications == null) {
			requirementModifications = new EObjectContainmentEList<APSReqModifyRequirement>(APSReqModifyRequirement.class, this, ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
		}
		return requirementModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyDecision> getDecisionModifications() {
		if (decisionModifications == null) {
			decisionModifications = new EObjectContainmentEList<APSReqModifyDecision>(APSReqModifyDecision.class, this, ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
		}
		return decisionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyOption> getOptionModifications() {
		if (optionModifications == null) {
			optionModifications = new EObjectContainmentEList<APSReqModifyOption>(APSReqModifyOption.class, this, ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);
		}
		return optionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<T> getApsiecSeedModifications() {
		if (apsiecSeedModifications == null) {
			apsiecSeedModifications = new EObjectContainmentEList<T>(AbstractSeedModifications.class, this, ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS);
		}
		return apsiecSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return ((InternalEList<?>)getRequirementModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return ((InternalEList<?>)getDecisionModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return ((InternalEList<?>)getOptionModifications()).basicRemove(otherEnd, msgs);
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS:
				return ((InternalEList<?>)getApsiecSeedModifications()).basicRemove(otherEnd, msgs);
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
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return getRequirementModifications();
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return getDecisionModifications();
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return getOptionModifications();
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS:
				return getApsiecSeedModifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				getRequirementModifications().addAll((Collection<? extends APSReqModifyRequirement>)newValue);
				return;
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				getDecisionModifications().addAll((Collection<? extends APSReqModifyDecision>)newValue);
				return;
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
				getOptionModifications().addAll((Collection<? extends APSReqModifyOption>)newValue);
				return;
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS:
				getApsiecSeedModifications().clear();
				getApsiecSeedModifications().addAll((Collection<? extends T>)newValue);
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
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				return;
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				return;
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
				return;
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS:
				getApsiecSeedModifications().clear();
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
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return requirementModifications != null && !requirementModifications.isEmpty();
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return decisionModifications != null && !decisionModifications.isEmpty();
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return optionModifications != null && !optionModifications.isEmpty();
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS:
				return apsiecSeedModifications != null && !apsiecSeedModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqSeedModificationsImpl
