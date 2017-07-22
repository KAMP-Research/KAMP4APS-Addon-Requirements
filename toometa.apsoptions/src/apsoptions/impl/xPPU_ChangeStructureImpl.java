/**
 */
package apsoptions.impl;

import apsoptions.ApsoptionsPackage;
import apsoptions.xPPU_ChangeStructure;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import xPPU.StructureRepository.Structure;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>xPPU Change Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.xPPU_ChangeStructureImpl#getOldStructures <em>Old Structures</em>}</li>
 *   <li>{@link apsoptions.impl.xPPU_ChangeStructureImpl#getNewStructures <em>New Structures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class xPPU_ChangeStructureImpl extends xPPU_OptionImpl implements xPPU_ChangeStructure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected xPPU_ChangeStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.XPPU_CHANGE_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Structure> getOldStructures() {
		return (EList<Structure>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES, ApsoptionsPackage.Literals.XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Structure> getNewStructures() {
		return (EList<Structure>)eDynamicGet(ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES, ApsoptionsPackage.Literals.XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES:
				return getOldStructures();
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES:
				return getNewStructures();
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
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES:
				getOldStructures().clear();
				getOldStructures().addAll((Collection<? extends Structure>)newValue);
				return;
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES:
				getNewStructures().clear();
				getNewStructures().addAll((Collection<? extends Structure>)newValue);
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
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES:
				getOldStructures().clear();
				return;
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES:
				getNewStructures().clear();
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
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__OLD_STRUCTURES:
				return !getOldStructures().isEmpty();
			case ApsoptionsPackage.XPPU_CHANGE_STRUCTURE__NEW_STRUCTURES:
				return !getNewStructures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //xPPU_ChangeStructureImpl
