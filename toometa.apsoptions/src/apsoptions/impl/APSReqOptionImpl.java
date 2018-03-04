/**
 */
package apsoptions.impl;

import apsoptions.APSReqOption;
import apsoptions.ApsoptionsPackage;
import apsoptions.OptionType;

import options.impl.OptionImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.APSReqOptionImpl#getOptionType <em>Option Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class APSReqOptionImpl extends OptionImpl implements APSReqOption {
	/**
	 * The default value of the '{@link #getOptionType() <em>Option Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionType()
	 * @generated
	 * @ordered
	 */
	protected static final OptionType OPTION_TYPE_EDEFAULT = OptionType.INTRODUCE_NEW;

	/**
	 * The cached value of the '{@link #getOptionType() <em>Option Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionType()
	 * @generated
	 * @ordered
	 */
	protected OptionType optionType = OPTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApsoptionsPackage.Literals.APS_REQ_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType getOptionType() {
		return optionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionType(OptionType newOptionType) {
		OptionType oldOptionType = optionType;
		optionType = newOptionType == null ? OPTION_TYPE_EDEFAULT : newOptionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE, oldOptionType, optionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE:
				return getOptionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE:
				setOptionType((OptionType)newValue);
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
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE:
				setOptionType(OPTION_TYPE_EDEFAULT);
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
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION_TYPE:
				return optionType != OPTION_TYPE_EDEFAULT;
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
		result.append(" (optionType: ");
		result.append(optionType);
		result.append(')');
		return result.toString();
	}

} //APSReqOptionImpl
