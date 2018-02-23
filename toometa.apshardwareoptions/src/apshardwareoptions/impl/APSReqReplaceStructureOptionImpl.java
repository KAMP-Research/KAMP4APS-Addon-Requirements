/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqReplaceStructureOption;
import apshardwareoptions.ApshardwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Structure Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceStructureOptionImpl#getOldStructure <em>Old Structure</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceStructureOptionImpl#getNewStructure <em>New Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceStructureOptionImpl extends APSReqStructureHardwareOptionImpl implements APSReqReplaceStructureOption {
	/**
	 * The cached value of the '{@link #getOldStructure() <em>Old Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure oldStructure;

	/**
	 * The cached value of the '{@link #getNewStructure() <em>New Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewStructure()
	 * @generated
	 * @ordered
	 */
	protected Structure newStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceStructureOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REPLACE_STRUCTURE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getOldStructure() {
		if (oldStructure != null && oldStructure.eIsProxy()) {
			InternalEObject oldOldStructure = (InternalEObject)oldStructure;
			oldStructure = (Structure)eResolveProxy(oldOldStructure);
			if (oldStructure != oldOldStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE, oldOldStructure, oldStructure));
			}
		}
		return oldStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetOldStructure() {
		return oldStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldStructure(Structure newOldStructure) {
		Structure oldOldStructure = oldStructure;
		oldStructure = newOldStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE, oldOldStructure, oldStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getNewStructure() {
		if (newStructure != null && newStructure.eIsProxy()) {
			InternalEObject oldNewStructure = (InternalEObject)newStructure;
			newStructure = (Structure)eResolveProxy(oldNewStructure);
			if (newStructure != oldNewStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE, oldNewStructure, newStructure));
			}
		}
		return newStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure basicGetNewStructure() {
		return newStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewStructure(Structure newNewStructure) {
		Structure oldNewStructure = newStructure;
		newStructure = newNewStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE, oldNewStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE:
				if (resolve) return getOldStructure();
				return basicGetOldStructure();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE:
				if (resolve) return getNewStructure();
				return basicGetNewStructure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE:
				setOldStructure((Structure)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE:
				setNewStructure((Structure)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE:
				setOldStructure((Structure)null);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE:
				setNewStructure((Structure)null);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__OLD_STRUCTURE:
				return oldStructure != null;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_STRUCTURE_OPTION__NEW_STRUCTURE:
				return newStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceStructureOptionImpl
