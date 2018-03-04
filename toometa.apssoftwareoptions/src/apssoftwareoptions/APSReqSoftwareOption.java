/**
 */
package apssoftwareoptions;

import apsoptions.APSReqOption;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Software Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.APSReqSoftwareOption#getIecComponents <em>Iec Components</em>}</li>
 *   <li>{@link apssoftwareoptions.APSReqSoftwareOption#getIecComponentType <em>Iec Component Type</em>}</li>
 * </ul>
 *
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqSoftwareOption()
 * @model
 * @generated
 */
public interface APSReqSoftwareOption extends APSReqOption {
	/**
	 * Returns the value of the '<em><b>Iec Components</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Components</em>' reference list.
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqSoftwareOption_IecComponents()
	 * @model
	 * @generated
	 */
	EList<IECComponent> getIecComponents();

	/**
	 * Returns the value of the '<em><b>Iec Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link apssoftwareoptions.IECComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iec Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iec Component Type</em>' attribute.
	 * @see apssoftwareoptions.IECComponentType
	 * @see #setIecComponentType(IECComponentType)
	 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getAPSReqSoftwareOption_IecComponentType()
	 * @model required="true"
	 * @generated
	 */
	IECComponentType getIecComponentType();

	/**
	 * Sets the value of the '{@link apssoftwareoptions.APSReqSoftwareOption#getIecComponentType <em>Iec Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iec Component Type</em>' attribute.
	 * @see apssoftwareoptions.IECComponentType
	 * @see #getIecComponentType()
	 * @generated
	 */
	void setIecComponentType(IECComponentType value);

} // APSReqSoftwareOption
