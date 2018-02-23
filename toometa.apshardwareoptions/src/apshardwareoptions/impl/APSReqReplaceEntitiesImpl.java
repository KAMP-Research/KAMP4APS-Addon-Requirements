/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqReplaceEntities;
import apshardwareoptions.ApshardwareoptionsPackage;

import apsoptions.impl.APSReqReplaceOptionImpl;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Replace Entities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceEntitiesImpl#getOldEntities <em>Old Entities</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqReplaceEntitiesImpl#getNewEntities <em>New Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqReplaceEntitiesImpl extends APSReqReplaceOptionImpl implements APSReqReplaceEntities {
	/**
	 * The cached value of the '{@link #getOldEntities() <em>Old Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> oldEntities;

	/**
	 * The cached value of the '{@link #getNewEntities() <em>New Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> newEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqReplaceEntitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REPLACE_ENTITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getOldEntities() {
		if (oldEntities == null) {
			oldEntities = new EObjectResolvingEList<Entity>(Entity.class, this, ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES);
		}
		return oldEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getNewEntities() {
		if (newEntities == null) {
			newEntities = new EObjectResolvingEList<Entity>(Entity.class, this, ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES);
		}
		return newEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES:
				return getOldEntities();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES:
				return getNewEntities();
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES:
				getOldEntities().clear();
				getOldEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES:
				getNewEntities().clear();
				getNewEntities().addAll((Collection<? extends Entity>)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES:
				getOldEntities().clear();
				return;
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES:
				getNewEntities().clear();
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
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__OLD_ENTITIES:
				return oldEntities != null && !oldEntities.isEmpty();
			case ApshardwareoptionsPackage.APS_REQ_REPLACE_ENTITIES__NEW_ENTITIES:
				return newEntities != null && !newEntities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqReplaceEntitiesImpl
