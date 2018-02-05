/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.APSReqSeedModificationsImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage;

import edu.kit.ipd.sdq.kamp4iec.model.modificationmarks.IECSeedModifications;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Software Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class APSReqSoftwareSeedModificationsImpl extends APSReqSeedModificationsImpl<IECSeedModifications> implements APSReqSoftwareSeedModifications {
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
		return Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<IECSeedModifications> getApsiecSeedModifications() {
		if (apsiecSeedModifications == null) {
			apsiecSeedModifications = new EObjectContainmentEList<IECSeedModifications>(IECSeedModifications.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS);
		}
		return apsiecSeedModifications;
	}

} //APSReqSoftwareSeedModificationsImpl
