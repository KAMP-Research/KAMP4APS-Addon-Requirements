/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyDecision;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyInterface;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyModule;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyOption;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyRequirement;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqModifyStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>APS Req
 * Change Propagation Due To Specification Dependencies</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getDecisionModifications
 * <em>Decision Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getOptionModifications
 * <em>Option Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getRequirementModifications
 * <em>Requirement Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getComponentModifications
 * <em>Component Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getModuleModifications
 * <em>Module Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getStructureModifications
 * <em>Structure Modifications</em>}</li>
 * <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl#getInterfaceModifications
 * <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqChangePropagationDueToSpecificationDependenciesImpl extends ChangePropagationStepImpl
		implements APSReqChangePropagationDueToSpecificationDependencies {
	/**
	 * The cached value of the '{@link #getDecisionModifications() <em>Decision
	 * Modifications</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDecisionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyDecision> decisionModifications;

	/**
	 * The cached value of the '{@link #getOptionModifications() <em>Option
	 * Modifications</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getOptionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyOption> optionModifications;

	/**
	 * The cached value of the '{@link #getRequirementModifications()
	 * <em>Requirement Modifications</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRequirementModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyRequirement> requirementModifications;

	/**
	 * The cached value of the '{@link #getComponentModifications()
	 * <em>Component Modifications</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyComponent> componentModifications;

	/**
	 * The cached value of the '{@link #getModuleModifications() <em>Module
	 * Modifications</em>}' containment reference list. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getModuleModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyModule> moduleModifications;

	/**
	 * The cached value of the '{@link #getStructureModifications()
	 * <em>Structure Modifications</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStructureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyStructure> structureModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications()
	 * <em>Interface Modifications</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyInterface> interfaceModifications;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected APSReqChangePropagationDueToSpecificationDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APSReqModificationmarksPackage.Literals.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyDecision> getDecisionModifications() {
		if (decisionModifications == null) {
			decisionModifications = new EObjectContainmentEList<APSReqModifyDecision>(APSReqModifyDecision.class, this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS);
		}
		return decisionModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyOption> getOptionModifications() {
		if (optionModifications == null) {
			optionModifications = new EObjectContainmentEList<APSReqModifyOption>(APSReqModifyOption.class, this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS);
		}
		return optionModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyRequirement> getRequirementModifications() {
		if (requirementModifications == null) {
			requirementModifications = new EObjectContainmentEList<APSReqModifyRequirement>(
					APSReqModifyRequirement.class, this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS);
		}
		return requirementModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyComponent> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<APSReqModifyComponent>(APSReqModifyComponent.class,
					this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyModule> getModuleModifications() {
		if (moduleModifications == null) {
			moduleModifications = new EObjectContainmentEList<APSReqModifyModule>(APSReqModifyModule.class, this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS);
		}
		return moduleModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyStructure> getStructureModifications() {
		if (structureModifications == null) {
			structureModifications = new EObjectContainmentEList<APSReqModifyStructure>(APSReqModifyStructure.class,
					this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS);
		}
		return structureModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<APSReqModifyInterface> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<APSReqModifyInterface>(APSReqModifyInterface.class,
					this,
					APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
				return ((InternalEList<?>) getDecisionModifications()).basicRemove(otherEnd, msgs);
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
				return ((InternalEList<?>) getOptionModifications()).basicRemove(otherEnd, msgs);
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
				return ((InternalEList<?>) getRequirementModifications()).basicRemove(otherEnd, msgs);
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>) getComponentModifications()).basicRemove(otherEnd, msgs);
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS:
				return ((InternalEList<?>) getModuleModifications()).basicRemove(otherEnd, msgs);
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS:
				return ((InternalEList<?>) getStructureModifications()).basicRemove(otherEnd, msgs);
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>) getInterfaceModifications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
				return getDecisionModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
				return getOptionModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
				return getRequirementModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS:
				return getModuleModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS:
				return getStructureModifications();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				getDecisionModifications().addAll((Collection<? extends APSReqModifyDecision>) newValue);
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
				getOptionModifications().addAll((Collection<? extends APSReqModifyOption>) newValue);
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				getRequirementModifications().addAll((Collection<? extends APSReqModifyRequirement>) newValue);
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends APSReqModifyComponent>) newValue);
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				getModuleModifications().addAll((Collection<? extends APSReqModifyModule>) newValue);
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				getStructureModifications().addAll((Collection<? extends APSReqModifyStructure>) newValue);
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends APSReqModifyInterface>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
				getDecisionModifications().clear();
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
				getOptionModifications().clear();
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
				getRequirementModifications().clear();
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS:
				getModuleModifications().clear();
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS:
				getStructureModifications().clear();
				return;
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__DECISION_MODIFICATIONS:
				return decisionModifications != null && !decisionModifications.isEmpty();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__OPTION_MODIFICATIONS:
				return optionModifications != null && !optionModifications.isEmpty();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__REQUIREMENT_MODIFICATIONS:
				return requirementModifications != null && !requirementModifications.isEmpty();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS:
				return moduleModifications != null && !moduleModifications.isEmpty();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS:
				return structureModifications != null && !structureModifications.isEmpty();
			case APSReqModificationmarksPackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // APSReqChangePropagationDueToSpecificationDependenciesImpl
