/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.provider;


import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider.AbstractAPSReqChangePropagationDueToSpecificationDependenciesItemProvider;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqHardwareChangePropagationDueToSpecificationDependenciesItemProvider extends AbstractAPSReqChangePropagationDueToSpecificationDependenciesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareChangePropagationDueToSpecificationDependenciesItemProvider(AdapterFactory adapterFactory) {
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

			addStructureModificationsPropertyDescriptor(object);
			addModuleModificationsPropertyDescriptor(object);
			addComponentModificationsPropertyDescriptor(object);
			addInterfaceModificationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Structure Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStructureModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_structureModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_structureModifications_feature", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__STRUCTURE_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Module Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModuleModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_moduleModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_moduleModifications_feature", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__MODULE_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_componentModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_componentModifications_feature", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__COMPONENT_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Interface Modifications feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfaceModificationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_interfaceModifications_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_interfaceModifications_feature", "_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_type"),
				 Modificationmarks_hardwarePackage.Literals.APS_REQ_HARDWARE_CHANGE_PROPAGATION_DUE_TO_SPECIFICATION_DEPENDENCIES__INTERFACE_MODIFICATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns APSReqHardwareChangePropagationDueToSpecificationDependencies.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APSReqHardwareChangePropagationDueToSpecificationDependencies"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_APSReqHardwareChangePropagationDueToSpecificationDependencies_type");
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
		return Modificationmarks_hardwareEditPlugin.INSTANCE;
	}

}
