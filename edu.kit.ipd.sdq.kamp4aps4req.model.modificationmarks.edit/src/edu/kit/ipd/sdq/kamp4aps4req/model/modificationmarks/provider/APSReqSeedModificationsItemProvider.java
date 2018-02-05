/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider;


import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.AbstractSeedModificationsItemProvider;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.ModificationmarksPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.APSReqSeedModifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqSeedModificationsItemProvider extends AbstractSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSeedModificationsItemProvider(AdapterFactory adapterFactory) {
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS);
			childrenFeatures.add(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns APSReqSeedModifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APSReqSeedModifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_APSReqSeedModifications_type");
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

		switch (notification.getFeatureID(APSReqSeedModifications.class)) {
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS:
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS:
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS:
			case ModificationmarksPackage.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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
				(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__REQUIREMENT_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createAPSReqModifyRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__DECISION_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createAPSReqModifyDecision()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__OPTION_MODIFICATIONS,
				 ModificationmarksFactory.eINSTANCE.createAPSReqModifyOption()));

		newChildDescriptors.add
			(createChildParameter
				(ModificationmarksPackage.Literals.APS_REQ_SEED_MODIFICATIONS__APSIEC_SEED_MODIFICATIONS,
				 edu.kit.ipd.sdq.kamp.model.modificationmarks.ModificationmarksFactory.eINSTANCE.createSeedModifications()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModificationmarksEditPlugin.INSTANCE;
	}

}
