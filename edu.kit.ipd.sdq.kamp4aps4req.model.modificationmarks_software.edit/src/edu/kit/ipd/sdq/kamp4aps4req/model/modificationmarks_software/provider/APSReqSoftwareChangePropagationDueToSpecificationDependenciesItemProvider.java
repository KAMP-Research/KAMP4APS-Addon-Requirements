/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.provider;


import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider.AbstractAPSReqChangePropagationDueToSpecificationDependenciesItemProvider;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareChangePropagationDueToSpecificationDependencies} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqSoftwareChangePropagationDueToSpecificationDependenciesItemProvider extends AbstractAPSReqChangePropagationDueToSpecificationDependenciesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareChangePropagationDueToSpecificationDependenciesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConfigurationModificationsPropertyDescriptor(object);
			addProgramModificationsPropertyDescriptor(object);
			addFunctionModificationsPropertyDescriptor(object);
			addFunctionBlockModificationsPropertyDescriptor(object);
			addGlobalVariableModificationsPropertyDescriptor(object);
			addIecInterfaceModificationsPropertyDescriptor(object);
			addAbstractIECMethodModificationsPropertyDescriptor(object);
			addIecMethodModificationsPropertyDescriptor(object);
			addAbstractIECPropertyModificationsPropertyDescriptor(object);
			addIecPropertyModificationsPropertyDescriptor(object);
			addIecComponentModificationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Configuration Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigurationModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_configurationModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_configurationModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__CONFIGURATION_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_programModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_programModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__PROGRAM_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_functionModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_functionModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function Block Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionBlockModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_functionBlockModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_functionBlockModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__FUNCTION_BLOCK_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global Variable Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalVariableModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_globalVariableModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_globalVariableModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__GLOBAL_VARIABLE_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Iec Interface Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIecInterfaceModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecInterfaceModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecInterfaceModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_INTERFACE_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract IEC Method Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractIECMethodModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_abstractIECMethodModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_abstractIECMethodModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_METHOD_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Iec Method Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIecMethodModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecMethodModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecMethodModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_METHOD_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Abstract IEC Property Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractIECPropertyModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_abstractIECPropertyModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_abstractIECPropertyModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__ABSTRACT_IEC_PROPERTY_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Iec Property Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIecPropertyModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecPropertyModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecPropertyModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_PROPERTY_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Iec Component Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIecComponentModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecComponentModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_iecComponentModifications_feature", "_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_softwarePackage.Literals.APS_REQ_SOFTWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__IEC_COMPONENT_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns APSReqSoftwareChangePropagationDueToSpecificationDependencies.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APSReqSoftwareChangePropagationDueToSpecificationDependencies"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_APSReqSoftwareChangePropagationDueToSpecificationDependencies_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Modificationmarks_softwareEditPlugin.INSTANCE;
	}

}
