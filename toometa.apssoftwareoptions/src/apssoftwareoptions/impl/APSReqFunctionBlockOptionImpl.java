/**
 */
package apssoftwareoptions.impl;

import apsoptions.impl.APSReqOptionImpl;

import apssoftwareoptions.APSReqFunctionBlockOption;
import apssoftwareoptions.ApssoftwareoptionsPackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.FunctionBlock;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Function Block Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apssoftwareoptions.impl.APSReqFunctionBlockOptionImpl#getFunctionBlocks <em>Function Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqFunctionBlockOptionImpl extends APSReqOptionImpl implements APSReqFunctionBlockOption {
	/**
	 * The cached value of the '{@link #getFunctionBlocks() <em>Function Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionBlock> functionBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqFunctionBlockOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApssoftwareoptionsPackage.Literals.APS_REQ_FUNCTION_BLOCK_OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionBlock> getFunctionBlocks() {
		if (functionBlocks == null) {
			functionBlocks = new EObjectResolvingEList<FunctionBlock>(FunctionBlock.class, this, ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS);
		}
		return functionBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS:
				return getFunctionBlocks();
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
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS:
				getFunctionBlocks().clear();
				getFunctionBlocks().addAll((Collection<? extends FunctionBlock>)newValue);
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
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS:
				getFunctionBlocks().clear();
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
			case ApssoftwareoptionsPackage.APS_REQ_FUNCTION_BLOCK_OPTION__FUNCTION_BLOCKS:
				return functionBlocks != null && !functionBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqFunctionBlockOptionImpl
