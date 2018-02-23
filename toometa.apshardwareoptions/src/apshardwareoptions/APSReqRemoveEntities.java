/**
 */
package apshardwareoptions;

import apsoptions.APSReqRemoveOption;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Remove Entities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqRemoveEntities#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqRemoveEntities()
 * @model
 * @generated
 */
public interface APSReqRemoveEntities extends APSReqRemoveOption {
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
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqRemoveEntities_Entities()
	 * @model
	 * @generated
	 */
	EList<Entity> getEntities();

} // APSReqRemoveEntities
