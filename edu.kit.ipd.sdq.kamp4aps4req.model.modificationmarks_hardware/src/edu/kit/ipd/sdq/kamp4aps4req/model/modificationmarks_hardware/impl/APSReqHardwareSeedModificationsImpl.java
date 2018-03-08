/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.impl.KAMP4aPSSeedModificationsImpl;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Hardware Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.APSReqHardwareSeedModificationsImpl#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.APSReqHardwareSeedModificationsImpl#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.APSReqHardwareSeedModificationsImpl#getOptionModifications <em>Option Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqHardwareSeedModificationsImpl extends KAMP4aPSSeedModificationsImpl implements APSReqHardwareSeedModifications {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqHardwareSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyRequirement> getRequirementModifications() {
		if (requirementModifications == null) {
			requirementModifications = new EObjectContainmentEList<APSReqModifyRequirement>(APSReqModifyRequirement.class, this, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
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
			decisionModifications = new EObjectContainmentEList<APSReqModifyDecision>(APSReqModifyDecision.class, this, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
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
			optionModifications = new EObjectContainmentEList<APSReqModifyOption>(APSReqModifyOption.class, this, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);
		}
		return optionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return ((InternalEList<?>)getRequirementModifications()).basicRemove(otherEnd, msgs);
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return ((InternalEList<?>)getDecisionModifications()).basicRemove(otherEnd, msgs);
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return ((InternalEList<?>)getOptionModifications()).basicRemove(otherEnd, msgs);
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return getRequirementModifications();
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return getDecisionModifications();
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return getOptionModifications();
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				getRequirementModifications().addAll((Collection<? extends APSReqModifyRequirement>)newValue);
				return;
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				getDecisionModifications().addAll((Collection<? extends APSReqModifyDecision>)newValue);
				return;
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
				getOptionModifications().addAll((Collection<? extends APSReqModifyOption>)newValue);
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				return;
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				return;
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return requirementModifications != null && !requirementModifications.isEmpty();
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return decisionModifications != null && !decisionModifications.isEmpty();
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
				return optionModifications != null && !optionModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == APSReqSeedModifications.class) {
			switch (derivedFeatureID) {
				case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS: return ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS;
				case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS: return ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS;
				case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS: return ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == APSReqSeedModifications.class) {
			switch (baseFeatureID) {
				case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS: return Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS;
				case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS: return Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS;
				case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS: return Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //APSReqHardwareSeedModificationsImpl
