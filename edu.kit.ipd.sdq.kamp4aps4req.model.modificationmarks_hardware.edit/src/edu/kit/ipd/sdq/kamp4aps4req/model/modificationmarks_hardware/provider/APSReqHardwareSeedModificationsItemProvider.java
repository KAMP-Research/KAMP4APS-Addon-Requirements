/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.provider;


import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.KAMP4aPSModificationmarksFactory;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider.APSReqSeedModificationsItemProvider;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwareFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareSeedModifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqHardwareSeedModificationsItemProvider extends APSReqSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqHardwareSeedModificationsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns APSReqHardwareSeedModifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APSReqHardwareSeedModifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_APSReqHardwareSeedModifications_type");
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

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS,
				 Modificationmarks_hardwareFactory.eINSTANCE.createAPSReqHardwareSeedModifications()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS,
				 KAMP4aPSModificationmarksFactory.eINSTANCE.createKAMP4aPSSeedModifications()));
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
