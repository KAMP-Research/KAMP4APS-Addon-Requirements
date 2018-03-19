/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.impl.AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqModifyComponent;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage;

import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyAbstractProperty;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyConfiguration;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunction;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyFunctionBlock;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyGlobalVariable;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyInterface;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyMethod;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProgram;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModifyProperty;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APS Req Software Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getConfigurationModifications <em>Configuration Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getProgramModifications <em>Program Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getFunctionModifications <em>Function Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getFunctionBlockModifications <em>Function Block Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getGlobalVariableModifications <em>Global Variable Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getIecInterfaceModifications <em>Iec Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getAbstractIECMethodModifications <em>Abstract IEC Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getIecMethodModifications <em>Iec Method Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getAbstractIECPropertyModifications <em>Abstract IEC Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getIecPropertyModifications <em>Iec Property Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.impl.APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl#getIecComponentModifications <em>Iec Component Modifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl extends AbstractAPSReqChangePropagationDueToSpecificationDependenciesImpl implements APSReqSoftwareChangePropagationDueToSpecificationDependencies {
	/**
	 * The cached value of the '{@link #getConfigurationModifications() <em>Configuration Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyConfiguration> configurationModifications;
	/**
	 * The cached value of the '{@link #getProgramModifications() <em>Program Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyProgram> programModifications;
	/**
	 * The cached value of the '{@link #getFunctionModifications() <em>Function Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyFunction> functionModifications;
	/**
	 * The cached value of the '{@link #getFunctionBlockModifications() <em>Function Block Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionBlockModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyFunctionBlock> functionBlockModifications;
	/**
	 * The cached value of the '{@link #getGlobalVariableModifications() <em>Global Variable Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVariableModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyGlobalVariable> globalVariableModifications;
	/**
	 * The cached value of the '{@link #getIecInterfaceModifications() <em>Iec Interface Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyInterface> iecInterfaceModifications;
	/**
	 * The cached value of the '{@link #getAbstractIECMethodModifications() <em>Abstract IEC Method Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractIECMethodModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyAbstractMethod> abstractIECMethodModifications;
	/**
	 * The cached value of the '{@link #getIecMethodModifications() <em>Iec Method Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecMethodModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyMethod> iecMethodModifications;
	/**
	 * The cached value of the '{@link #getAbstractIECPropertyModifications() <em>Abstract IEC Property Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractIECPropertyModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyAbstractProperty> abstractIECPropertyModifications;
	/**
	 * The cached value of the '{@link #getIecPropertyModifications() <em>Iec Property Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecPropertyModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<IECModifyProperty> iecPropertyModifications;

	/**
	 * The cached value of the '{@link #getIecComponentModifications() <em>Iec Component Modifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIecComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<APSReqModifyComponent> iecComponentModifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyConfiguration> getConfigurationModifications() {
		if (configurationModifications == null) {
			configurationModifications = new EObjectResolvingEList<IECModifyConfiguration>(IECModifyConfiguration.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS);
		}
		return configurationModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyProgram> getProgramModifications() {
		if (programModifications == null) {
			programModifications = new EObjectResolvingEList<IECModifyProgram>(IECModifyProgram.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS);
		}
		return programModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyFunction> getFunctionModifications() {
		if (functionModifications == null) {
			functionModifications = new EObjectResolvingEList<IECModifyFunction>(IECModifyFunction.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS);
		}
		return functionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyFunctionBlock> getFunctionBlockModifications() {
		if (functionBlockModifications == null) {
			functionBlockModifications = new EObjectResolvingEList<IECModifyFunctionBlock>(IECModifyFunctionBlock.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS);
		}
		return functionBlockModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyGlobalVariable> getGlobalVariableModifications() {
		if (globalVariableModifications == null) {
			globalVariableModifications = new EObjectResolvingEList<IECModifyGlobalVariable>(IECModifyGlobalVariable.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS);
		}
		return globalVariableModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyInterface> getIecInterfaceModifications() {
		if (iecInterfaceModifications == null) {
			iecInterfaceModifications = new EObjectResolvingEList<IECModifyInterface>(IECModifyInterface.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS);
		}
		return iecInterfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyAbstractMethod> getAbstractIECMethodModifications() {
		if (abstractIECMethodModifications == null) {
			abstractIECMethodModifications = new EObjectResolvingEList<IECModifyAbstractMethod>(IECModifyAbstractMethod.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS);
		}
		return abstractIECMethodModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyMethod> getIecMethodModifications() {
		if (iecMethodModifications == null) {
			iecMethodModifications = new EObjectResolvingEList<IECModifyMethod>(IECModifyMethod.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS);
		}
		return iecMethodModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyAbstractProperty> getAbstractIECPropertyModifications() {
		if (abstractIECPropertyModifications == null) {
			abstractIECPropertyModifications = new EObjectResolvingEList<IECModifyAbstractProperty>(IECModifyAbstractProperty.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS);
		}
		return abstractIECPropertyModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IECModifyProperty> getIecPropertyModifications() {
		if (iecPropertyModifications == null) {
			iecPropertyModifications = new EObjectResolvingEList<IECModifyProperty>(IECModifyProperty.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS);
		}
		return iecPropertyModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APSReqModifyComponent> getIecComponentModifications() {
		if (iecComponentModifications == null) {
			iecComponentModifications = new EObjectResolvingEList<APSReqModifyComponent>(APSReqModifyComponent.class, this, Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS);
		}
		return iecComponentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS:
				return getConfigurationModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS:
				return getProgramModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS:
				return getFunctionModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS:
				return getFunctionBlockModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS:
				return getGlobalVariableModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS:
				return getIecInterfaceModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS:
				return getAbstractIECMethodModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS:
				return getIecMethodModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS:
				return getAbstractIECPropertyModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS:
				return getIecPropertyModifications();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				return getIecComponentModifications();
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
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS:
				getConfigurationModifications().clear();
				getConfigurationModifications().addAll((Collection<? extends IECModifyConfiguration>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS:
				getProgramModifications().clear();
				getProgramModifications().addAll((Collection<? extends IECModifyProgram>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS:
				getFunctionModifications().clear();
				getFunctionModifications().addAll((Collection<? extends IECModifyFunction>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS:
				getFunctionBlockModifications().clear();
				getFunctionBlockModifications().addAll((Collection<? extends IECModifyFunctionBlock>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				getGlobalVariableModifications().addAll((Collection<? extends IECModifyGlobalVariable>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS:
				getIecInterfaceModifications().clear();
				getIecInterfaceModifications().addAll((Collection<? extends IECModifyInterface>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS:
				getAbstractIECMethodModifications().clear();
				getAbstractIECMethodModifications().addAll((Collection<? extends IECModifyAbstractMethod>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS:
				getIecMethodModifications().clear();
				getIecMethodModifications().addAll((Collection<? extends IECModifyMethod>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS:
				getAbstractIECPropertyModifications().clear();
				getAbstractIECPropertyModifications().addAll((Collection<? extends IECModifyAbstractProperty>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS:
				getIecPropertyModifications().clear();
				getIecPropertyModifications().addAll((Collection<? extends IECModifyProperty>)newValue);
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				getIecComponentModifications().clear();
				getIecComponentModifications().addAll((Collection<? extends APSReqModifyComponent>)newValue);
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
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS:
				getConfigurationModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS:
				getProgramModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS:
				getFunctionModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS:
				getFunctionBlockModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS:
				getGlobalVariableModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS:
				getIecInterfaceModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS:
				getAbstractIECMethodModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS:
				getIecMethodModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS:
				getAbstractIECPropertyModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS:
				getIecPropertyModifications().clear();
				return;
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				getIecComponentModifications().clear();
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
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS:
				return configurationModifications != null && !configurationModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS:
				return programModifications != null && !programModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS:
				return functionModifications != null && !functionModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS:
				return functionBlockModifications != null && !functionBlockModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS:
				return globalVariableModifications != null && !globalVariableModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS:
				return iecInterfaceModifications != null && !iecInterfaceModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS:
				return abstractIECMethodModifications != null && !abstractIECMethodModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS:
				return iecMethodModifications != null && !iecMethodModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS:
				return abstractIECPropertyModifications != null && !abstractIECPropertyModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS:
				return iecPropertyModifications != null && !iecPropertyModifications.isEmpty();
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS:
				return iecComponentModifications != null && !iecComponentModifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //APSReqSoftwareChangePropagationDueToSpecificationDependenciesImpl
