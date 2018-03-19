/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;
import apssoftwareoptions.APSReqAbstractPropertyOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECAbstractProperty;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Abstract Property Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqAbstractPropertyOptionImpl#getAbstractProperties <em>Abstract Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqAbstractPropertyOptionImpl extends APSReqOptionImpl implements APSReqAbstractPropertyOption {
	/**
	 * The cached value of the '{@link #getAbstractProperties() <em>Abstract Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<IECAbstractProperty> abstractProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqAbstractPropertyOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_ABSTRACT_PROPERTY_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECAbstractProperty> getAbstractProperties() {
		if (abstractProperties == null) {
			abstractProperties = new EObjectResolvingEList<IECAbstractProperty>(IECAbstractProperty.class, this, ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_PROPERTY_OPTION__ABSTRACT_PROPERTIES);
		}
		return abstractProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_PROPERTY_OPTION__ABSTRACT_PROPERTIES:
				return getAbstractProperties();
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
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_PROPERTY_OPTION__ABSTRACT_PROPERTIES:
				getAbstractProperties().clear();
				getAbstractProperties().addAll((Collection<? extends IECAbstractProperty>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_PROPERTY_OPTION__ABSTRACT_PROPERTIES:
				getAbstractProperties().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_ABSTRACT_PROPERTY_OPTION__ABSTRACT_PROPERTIES:
				return abstractProperties != null && !abstractProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqAbstractPropertyOptionImpl
