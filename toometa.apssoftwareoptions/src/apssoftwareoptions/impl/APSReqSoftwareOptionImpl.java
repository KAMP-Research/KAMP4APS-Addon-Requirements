/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;

import apssoftwareoptions.APSReqSoftwareOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;
import apssoftwareoptions.IECComponentType;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.IECComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Software Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqSoftwareOptionImpl#getIecComponents <em>Iec Components</em>}</li>
 *   <li>{@link apssoftwareoptions.impl.APSReqSoftwareOptionImpl#getIecComponentType <em>Iec Component Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqSoftwareOptionImpl extends APSReqOptionImpl implements APSReqSoftwareOption {
	/**
	 * The cached value of the '{@link #getIecComponents() <em>Iec Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<IECComponent> iecComponents;

	/**
	 * The default value of the '{@link #getIecComponentType() <em>Iec Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecComponentType()
	 * @generated
	 * @ordered
	 */
	protected static final IECComponentType IEC_COMPONENT_TYPE_EDEFAULT = IECComponentType.PROGRAM;

	/**
	 * The cached value of the '{@link #getIecComponentType() <em>Iec Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecComponentType()
	 * @generated
	 * @ordered
	 */
	protected IECComponentType iecComponentType = IEC_COMPONENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqSoftwareOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_SOFTWARE_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECComponent> getIecComponents() {
		if (iecComponents == null) {
			iecComponents = new EObjectResolvingEList<IECComponent>(IECComponent.class, this, ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS);
		}
		return iecComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IECComponentType getIecComponentType() {
		return iecComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIecComponentType(IECComponentType newIecComponentType) {
		IECComponentType oldIecComponentType = iecComponentType;
		iecComponentType = newIecComponentType == null ? IEC_COMPONENT_TYPE_EDEFAULT : newIecComponentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE, oldIecComponentType, iecComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS:
				return getIecComponents();
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE:
				return getIecComponentType();
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
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS:
				getIecComponents().clear();
				getIecComponents().addAll((Collection<? extends IECComponent>)newValue);
				return;
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE:
				setIecComponentType((IECComponentType)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS:
				getIecComponents().clear();
				return;
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE:
				setIecComponentType(IEC_COMPONENT_TYPE_EDEFAULT);
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
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENTS:
				return iecComponents != null && !iecComponents.isEmpty();
			case ApssoftwareoptionsPackage.APS_REQ_SOFTWARE_OPTION__IEC_COMPONENT_TYPE:
				return iecComponentType != IEC_COMPONENT_TYPE_EDEFAULT;
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
		result.append(" (iecComponentType: ");
		result.append(iecComponentType);
		result.append(')');
		return result.toString();
	}

} //APSReqSoftwareOptionImpl
