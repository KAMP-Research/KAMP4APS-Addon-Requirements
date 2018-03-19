/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;

import apssoftwareoptions.APSReqIECInterfaceOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECInterface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req IEC Interface Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqIECInterfaceOptionImpl#getIecInterfaces <em>Iec Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqIECInterfaceOptionImpl extends APSReqOptionImpl implements APSReqIECInterfaceOption {
	/**
	 * The cached value of the '{@link #getIecInterfaces() <em>Iec Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<IECInterface> iecInterfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqIECInterfaceOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_IEC_INTERFACE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECInterface> getIecInterfaces() {
		if (iecInterfaces == null) {
			iecInterfaces = new EObjectResolvingEList<IECInterface>(IECInterface.class, this, ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES);
		}
		return iecInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES:
				return getIecInterfaces();
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES:
				getIecInterfaces().clear();
				getIecInterfaces().addAll((Collection<? extends IECInterface>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES:
				getIecInterfaces().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_IEC_INTERFACE_OPTION__IEC_INTERFACES:
				return iecInterfaces != null && !iecInterfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqIECInterfaceOptionImpl
