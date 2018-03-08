/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqModifyEntity;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Hardware Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.impl.APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl#getEntityModifications <em>Entity Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl extends AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl implements APSReqHardwareChangePropagationDueToSpecificationDependencies {
	/**
	 * The cached value of the '{@link #getEntityModifications() <em>Entity Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyEntity> entityModifications;
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
	public EList<APSReqModifyEntity> getEntityModifications() {
		if (entityModifications == null) {
			entityModifications = new EObjectResolvingEList<APSReqModifyEntity>(APSReqModifyEntity.class, this, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS);
		}
		return entityModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS:
				return getEntityModifications();
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS:
				getEntityModifications().clear();
				getEntityModifications().addAll((Collection<? extends APSReqModifyEntity>)newValue);
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS:
				getEntityModifications().clear();
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
			case Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ENTITY_MODIFICATIONS:
				return entityModifications != null && !entityModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqHardwareChangePropagationDueToSpecificationDependenciesImpl
