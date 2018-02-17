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
public class ModificationmarksFactoryImpl extends EFactoryImpl implements ModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModificationmarksFactory init() {
		try {
			ModificationmarksFactory theModificationmarksFactory = (ModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(ModificationmarksPackage.eNS_URI);
			if (theModificationmarksFactory != null) {
				return theModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationmarksFactoryImpl() {
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
			case ModificationmarksPackage.APS_REQ_MODIFY_REQUIREMENT: return createAPSReqModifyRequirement();
			case ModificationmarksPackage.APS_REQ_MODIFY_DECISION: return createAPSReqModifyDecision();
			case ModificationmarksPackage.APS_REQ_MODIFY_OPTION: return createAPSReqModifyOption();
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
	public ModificationmarksPackage getModificationmarksPackage() {
		return (ModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModificationmarksPackage getPackage() {
		return ModificationmarksPackage.eINSTANCE;
	}

} //ModificationmarksFactoryImpl
