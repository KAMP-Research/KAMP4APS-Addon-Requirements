/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqChangePropagationDueToSpecificationDependenciesImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqChangePropagationDueToHardwareChanges;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Change Propagation Due To Hardware Changes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.APSReqChangePropagationDueToHardwareChangesImpl#getHardwareChanges <em>Hardware Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqChangePropagationDueToHardwareChangesImpl extends APSReqChangePropagationDueToSpecificationDependenciesImpl implements APSReqChangePropagationDueToHardwareChanges {
	/**
	 * The cached value of the '{@link #getHardwareChanges() <em>Hardware Changes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangePropagationDueToHardwareChange> hardwareChanges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqChangePropagationDueToHardwareChangesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modificationmarks_hardwarePackage.Literals.APS_REQ_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangePropagationDueToHardwareChange> getHardwareChanges() {
		if (hardwareChanges == null) {
			hardwareChanges = new EObjectResolvingEList<ChangePropagationDueToHardwareChange>(ChangePropagationDueToHardwareChange.class, this, Modificationmarks_hardwarePackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGES__HARDWARE_CHANGES);
		}
		return hardwareChanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Modificationmarks_hardwarePackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGES__HARDWARE_CHANGES:
				return getHardwareChanges();
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
			case Modificationmarks_hardwarePackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGES__HARDWARE_CHANGES:
				getHardwareChanges().clear();
				getHardwareChanges().addAll((Collection<? extends ChangePropagationDueToHardwareChange>)newValue);
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
			case Modificationmarks_hardwarePackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGES__HARDWARE_CHANGES:
				getHardwareChanges().clear();
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
			case Modificationmarks_hardwarePackage.APS_REQ_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGES__HARDWARE_CHANGES:
				return hardwareChanges != null && !hardwareChanges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqChangePropagationDueToHardwareChangesImpl
