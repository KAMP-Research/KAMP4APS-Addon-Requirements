/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractKAMP4aPS4ReqModificationRepositoryImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareModificationRepository;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Software Modification Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class APSReqSoftwareModificationRepositoryImpl extends AbstractKAMP4aPS4ReqModificationRepositoryImpl<APSReqSeedModifications<edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECSeedModifications>> implements APSReqSoftwareModificationRepository {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqSoftwareModificationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_MODIFICATION_REPOSITORY;
	}

} //APSReqSoftwareModificationRepositoryImpl
