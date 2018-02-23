/**
 */
package apsoptions.impl;

import apsoptions.APSReqOption;
import apsoptions.APSReqOptionContainer;
import apsoptions.ApsoptionsPackage;
import options.Option;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apsoptions.impl.APSReqOptionImpl#getOption <em>Option</em>}</li>
 *   <li>{@link apsoptions.impl.APSReqOptionImpl#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class APSReqOptionImpl extends MinimalEObjectImpl.Container implements APSReqOption {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected Option option;

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
	public Option getOption() {
		if (option != null && ((EObject)option).eIsProxy()) {
			InternalEObject oldOption = (InternalEObject)option;
			option = (Option)eResolveProxy(oldOption);
			if (option != oldOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApsoptionsPackage.APS_REQ_OPTION__OPTION, oldOption, option));
			}
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option basicGetOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(Option newOption) {
		Option oldOption = option;
		option = newOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApsoptionsPackage.APS_REQ_OPTION__OPTION, oldOption, option));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqOptionContainer getRepository() {
		if (eContainerFeatureID() != ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY) return null;
		return (APSReqOptionContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(APSReqOptionContainer newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(APSReqOptionContainer newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION, APSReqOptionContainer.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((APSReqOptionContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				return basicSetRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, ApsoptionsPackage.APS_REQ_OPTION_CONTAINER__APSREQOPTION, APSReqOptionContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION:
				if (resolve) return getOption();
				return basicGetOption();
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				return getRepository();
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
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION:
				setOption((Option)newValue);
				return;
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				setRepository((APSReqOptionContainer)newValue);
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
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION:
				setOption((Option)null);
				return;
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				setRepository((APSReqOptionContainer)null);
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
			case ApsoptionsPackage.APS_REQ_OPTION__OPTION:
				return option != null;
			case ApsoptionsPackage.APS_REQ_OPTION__REPOSITORY:
				return getRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //APSReqOptionImpl
