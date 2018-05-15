/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqModificationmarksFactoryImpl extends EFactoryImpl implements APSReqModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static APSReqModificationmarksFactory init() {
		try {
			APSReqModificationmarksFactory theAPSReqModificationmarksFactory = (APSReqModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(APSReqModificationmarksPackage.eNS_URI);
			if (theAPSReqModificationmarksFactory != null) {
				return theAPSReqModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new APSReqModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_REQUIREMENT: return createAPSReqModifyRequirement();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_DECISION: return createAPSReqModifyDecision();
			case APSReqModificationmarksPackage.APS_REQ_MODIFY_OPTION: return createAPSReqModifyOption();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModifyRequirement createAPSReqModifyRequirement() {
		APSReqModifyRequirementImpl apsReqModifyRequirement = new APSReqModifyRequirementImpl();
		return apsReqModifyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModifyDecision createAPSReqModifyDecision() {
		APSReqModifyDecisionImpl apsReqModifyDecision = new APSReqModifyDecisionImpl();
		return apsReqModifyDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModifyOption createAPSReqModifyOption() {
		APSReqModifyOptionImpl apsReqModifyOption = new APSReqModifyOptionImpl();
		return apsReqModifyOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqModificationmarksPackage getAPSReqModificationmarksPackage() {
		return (APSReqModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static APSReqModificationmarksPackage getPackage() {
		return APSReqModificationmarksPackage.eINSTANCE;
	}

} //APSReqModificationmarksFactoryImpl
