/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ChangePropagationDueToHardwareChange;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Hardware Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl#getApsChangePropagationDueToHardwareChange <em>Aps Change Propagation Due To Hardware Change</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl extends AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl implements APSReqHardwareChangePropagationDueToSpecificationDependencies {
	/**
	 * The cached value of the '{@link #getApsChangePropagationDueToHardwareChange() <em>Aps Change Propagation Due To Hardware Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApsChangePropagationDueToHardwareChange()
	 * @generated
	 * @ordered
	 */
	protected ChangePropagationDueToHardwareChange apsChangePropagationDueToHardwareChange;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToHardwareChange getApsChangePropagationDueToHardwareChange() {
		if (apsChangePropagationDueToHardwareChange != null && apsChangePropagationDueToHardwareChange.eIsProxy()) {
			InternalEObject oldApsChangePropagationDueToHardwareChange = (InternalEObject)apsChangePropagationDueToHardwareChange;
			apsChangePropagationDueToHardwareChange = (ChangePropagationDueToHardwareChange)eResolveProxy(oldApsChangePropagationDueToHardwareChange);
			if (apsChangePropagationDueToHardwareChange != oldApsChangePropagationDueToHardwareChange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__APS_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE, oldApsChangePropagationDueToHardwareChange, apsChangePropagationDueToHardwareChange));
			}
		}
		return apsChangePropagationDueToHardwareChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangePropagationDueToHardwareChange basicGetApsChangePropagationDueToHardwareChange() {
		return apsChangePropagationDueToHardwareChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApsChangePropagationDueToHardwareChange(ChangePropagationDueToHardwareChange newApsChangePropagationDueToHardwareChange) {
		ChangePropagationDueToHardwareChange oldApsChangePropagationDueToHardwareChange = apsChangePropagationDueToHardwareChange;
		apsChangePropagationDueToHardwareChange = newApsChangePropagationDueToHardwareChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__APS_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE, oldApsChangePropagationDueToHardwareChange, apsChangePropagationDueToHardwareChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__APS_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE:
				if (resolve) return getApsChangePropagationDueToHardwareChange();
				return basicGetApsChangePropagationDueToHardwareChange();
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__APS_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE:
				setApsChangePropagationDueToHardwareChange((ChangePropagationDueToHardwareChange)newValue);
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__APS_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE:
				setApsChangePropagationDueToHardwareChange((ChangePropagationDueToHardwareChange)null);
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__APS_CHANGE_PROPAGATION_DUE_TO_HARDWARE_CHANGE:
				return apsChangePropagationDueToHardwareChange != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl
