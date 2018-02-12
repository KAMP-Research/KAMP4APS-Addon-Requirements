/**
 */
package apshardwareoptions;

import edu.kit.ipd.sdq.kamp4aps.model.basic.Entity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Introduce New Hardware Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apshardwareoptions.APSReqIntroduceNewHardwareOption#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqIntroduceNewHardwareOption()
 * @model
 * @generated
 */
public interface APSReqIntroduceNewHardwareOption<T extends Entity> extends APSReqHardwareOption<T> {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see apshardwareoptions.ApshardwareoptionsPackage#getAPSReqIntroduceNewHardwareOption_Entities()
	 * @model
	 * @generated
	 */
	EList<T> getEntities();

} // APSReqIntroduceNewHardwareOption
