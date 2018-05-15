/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;

import apssoftwareoptions.APSReqIECPropertyOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IsProperty;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req IEC Property Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqIECPropertyOptionImpl#getIecProperties <em>Iec Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqIECPropertyOptionImpl extends APSReqOptionImpl implements APSReqIECPropertyOption {
	/**
	 * The cached value of the '{@link #getIecProperties() <em>Iec Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IsProperty> iecProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqIECPropertyOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_IEC_PROPERTY_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IsProperty> getIecProperties() {
		if (iecProperties == null) {
			iecProperties = new EObjectResolvingEList<IsProperty>(IsProperty.class, this, ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES);
		}
		return iecProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES:
				return getIecProperties();
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES:
				getIecProperties().clear();
				getIecProperties().addAll((Collection<? extends IsProperty>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES:
				getIecProperties().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_PROPERTY_OPTION__IEC_PROPERTIES:
				return iecProperties != null && !iecProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqIECPropertyOptionImpl
