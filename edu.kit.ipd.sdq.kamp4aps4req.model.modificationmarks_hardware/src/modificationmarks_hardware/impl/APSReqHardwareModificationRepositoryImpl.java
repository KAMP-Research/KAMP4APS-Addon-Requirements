/**
 */
package modificationmarks_hardware.impl;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSSeedModifications;
import modificationmarks.APSReqSeedModifications;
import modificationmarks.impl.AbstractKAMP4aPS4ReqModificationRepositoryImpl;

import modificationmarks_hardware.APSReqHardwareModificationRepository;
import modificationmarks_hardware.Modificationmarks_hardwarePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Hardware Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class APSReqHardwareModificationRepositoryImpl extends AbstractKAMP4aPS4ReqModificationRepositoryImpl<APSReqSeedModifications<KAMP4aPSSeedModifications>> implements APSReqHardwareModificationRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqHardwareModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_MODIFICATION_REPOSITORY;
	}

} //APSReqHardwareModificationRepositoryImpl
