/**
 */
package apsoptions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Option Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.APSReqOptionContainer#getApsreqoption <em>Apsreqoption</em>}</li>
 * </ul>
 *
 * @see apsoptions.ApsoptionsPackage#getAPSReqOptionContainer()
 * @model
 * @generated
 */
public interface APSReqOptionContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Apsreqoption</b></em>' containment reference list.
	 * The list contents are of type {@link apsoptions.APSReqOption}.
	 * It is bidirectional and its opposite is '{@link apsoptions.APSReqOption#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apsreqoption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apsreqoption</em>' containment reference list.
	 * @see apsoptions.ApsoptionsPackage#getAPSReqOptionContainer_Apsreqoption()
	 * @see apsoptions.APSReqOption#getRepository
	 * @model opposite="repository" containment="true"
	 * @generated
	 */
	EList<APSReqOption> getApsreqoption();

} // APSReqOptionContainer
