/**
 */
package modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;
import modificationmarks.impl.APSReqSeedModificationsImpl;
import modificationmarks_hardware.APSReqHardwareSeedModifications;
import modificationmarks_hardware.Modificationmarks_hardwarePackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Hardware Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class APSReqHardwareSeedModificationsImpl extends APSReqSeedModificationsImpl<KAMP4aPSSeedModifications> implements APSReqHardwareSeedModifications {
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
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<KAMP4aPSSeedModifications> getApsiecSeedModifications() {
		if (apsiecSeedModifications == null) {
			apsiecSeedModifications = new EObjectContainmentEList<KAMP4aPSSeedModifications>(KAMP4aPSSeedModifications.class, this, Modificationmarks_hardwarePackage.APS_REQ_HARDWARE_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS);
		}
		return apsiecSeedModifications;
	}

} //APSReqHardwareSeedModificationsImpl
