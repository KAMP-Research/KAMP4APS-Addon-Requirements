/**
 */
package apshardwareoptions.impl;

import apshardwareoptions.APSReqRemoveEntities;
import apshardwareoptions.ApshardwareoptionsPackage;

import apshardwareoptions.EntityType;
import apsoptions.impl.APSReqRemoveOptionImpl;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Remove Entities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.impl.APSReqRemoveEntitiesImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link apshardwareoptions.impl.APSReqRemoveEntitiesImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqRemoveEntitiesImpl extends APSReqRemoveOptionImpl implements APSReqRemoveEntities {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The default value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected static final EntityType ENTITY_TYPE_EDEFAULT = EntityType.STRUCTURE;
	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EntityType entityType = ENTITY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqRemoveEntitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApshardwareoptionsPackage.Literals.APS_REQ_REMOVE_ENTITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectResolvingEList<Entity>(Entity.class, this, ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(EntityType newEntityType) {
		EntityType oldEntityType = entityType;
		entityType = newEntityType == null ? ENTITY_TYPE_EDEFAULT : newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITIES:
				return getEntities();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITY_TYPE:
				return getEntityType();
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
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITY_TYPE:
				setEntityType((EntityType)newValue);
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
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITIES:
				getEntities().clear();
				return;
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITY_TYPE:
				setEntityType(ENTITY_TYPE_EDEFAULT);
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
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITIES:
				return entities != null && !entities.isEmpty();
			case ApshardwareoptionsPackage.APS_REQ_REMOVE_ENTITIES__ENTITY_TYPE:
				return entityType != ENTITY_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (entityType: ");
		result.append(entityType);
		result.append(')');
		return result.toString();
	}

} //APSReqRemoveEntitiesImpl
