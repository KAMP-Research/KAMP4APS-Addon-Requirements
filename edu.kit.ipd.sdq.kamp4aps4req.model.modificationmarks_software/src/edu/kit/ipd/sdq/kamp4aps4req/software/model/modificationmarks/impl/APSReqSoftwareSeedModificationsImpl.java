/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;

import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareSeedModifications;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.impl.IECSeedModificationsImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Software Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl#getRequirementModifications <em>Requirement Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl#getDecisionModifications <em>Decision Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareSeedModificationsImpl#getOptionModifications <em>Option Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqSoftwareSeedModificationsImpl extends IECSeedModificationsImpl implements APSReqSoftwareSeedModifications {
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
	protected APSReqSoftwareSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APSReqSoftwareModificationmarksPackage.Literals.APS_REQ_SOFTWARE_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyRequirement> getRequirementModifications() {
		if (requirementModifications == null) {
			requirementModifications = new EObjectContainmentEList<APSReqModifyRequirement>(APSReqModifyRequirement.class, this, APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
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
			decisionModifications = new EObjectContainmentEList<APSReqModifyDecision>(APSReqModifyDecision.class, this, APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
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
			optionModifications = new EObjectContainmentEList<APSReqModifyOption>(APSReqModifyOption.class, this, APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return ((InternalEList<?>)getRequirementModifications()).basicRemove(otherEnd, msgs);
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return ((InternalEList<?>)getDecisionModifications()).basicRemove(otherEnd, msgs);
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return getRequirementModifications();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return getDecisionModifications();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				getRequirementModifications().addAll((Collection<? extends APSReqModifyRequirement>)newValue);
				return;
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				getDecisionModifications().addAll((Collection<? extends APSReqModifyDecision>)newValue);
				return;
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				return;
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				return;
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
				return requirementModifications != null && !requirementModifications.isEmpty();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
				return decisionModifications != null && !decisionModifications.isEmpty();
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
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
				case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS: return APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS;
				case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS: return APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS;
				case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS: return APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS;
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
				case APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS: return APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS;
				case APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS: return APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__DECISION_MODIFICATIONS;
				case APSReqModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS: return APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__OPTION_MODIFICATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //APSReqSoftwareSeedModificationsImpl
