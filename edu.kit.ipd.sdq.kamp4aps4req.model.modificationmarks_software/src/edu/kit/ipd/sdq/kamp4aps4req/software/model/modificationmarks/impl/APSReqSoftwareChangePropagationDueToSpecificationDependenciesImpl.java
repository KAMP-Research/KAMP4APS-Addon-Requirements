/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl;

import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqModifyIECComponent;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.APSReqSoftwareModificationmarksPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Software Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.software.model.modificationmarks.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getIecComponentModifications <em>Iec Component Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl extends AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl implements APSReqSoftwareChangePropagationDueToSpecificationDependencies {
	/**
	 * The cached value of the '{@link #getIecComponentModifications() <em>Iec Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyIECComponent> iecComponentModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return APSReqSoftwareModificationmarksPackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyIECComponent> getIecComponentModifications() {
		if (iecComponentModifications == null) {
			iecComponentModifications = new EObjectContainmentEList<APSReqModifyIECComponent>(APSReqModifyIECComponent.class, this, APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS);
		}
		return iecComponentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getIecComponentModifications()).basicRemove(otherEnd, msgs);
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				return getIecComponentModifications();
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				getIecComponentModifications().clear();
				getIecComponentModifications().addAll((Collection<? extends APSReqModifyIECComponent>)newValue);
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				getIecComponentModifications().clear();
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
			case APSReqSoftwareModificationmarksPackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				return iecComponentModifications != null && !iecComponentModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl
