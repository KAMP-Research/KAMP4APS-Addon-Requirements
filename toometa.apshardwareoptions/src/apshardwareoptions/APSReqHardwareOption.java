/**
 */
package apshardwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqHardwareOption#getEntities <em>Entities</em>}</li>
 *   <li>{@link apshardwareoptions.APSReqHardwareOption#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqHardwareOption()
 * @model
 * @generated
 */
public interface APSReqHardwareOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.basic.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqHardwareOption_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link apshardwareoptions.EntityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' attribute.
	 * @see apshardwareoptions.EntityType
	 * @see #setEntityType(EntityType)
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqHardwareOption_EntityType()
	 * @model required="true"
	 * @generated
	 */
	EntityType getEntityType();

	/**
	 * Sets the value of the '{@link apshardwareoptions.APSReqHardwareOption#getEntityType <em>Entity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' attribute.
	 * @see apshardwareoptions.EntityType
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(EntityType value);

} // APSReqHardwareOption
