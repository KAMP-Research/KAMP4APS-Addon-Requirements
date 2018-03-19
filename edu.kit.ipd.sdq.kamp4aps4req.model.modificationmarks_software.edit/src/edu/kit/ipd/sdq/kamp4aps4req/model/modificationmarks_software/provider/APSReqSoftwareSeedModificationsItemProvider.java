/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.provider;


import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider.APSReqSeedModificationsItemProvider;

import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareSeedModifications;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.Modificationmarks_softwarePackage;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksFactory;
import edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.IECModificationmarksPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.APSReqSoftwareSeedModifications} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APSReqSoftwareSeedModificationsItemProvider extends APSReqSeedModificationsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APSReqSoftwareSeedModificationsItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS);
			childrenFeatures.add(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS);
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
	 * This returns APSReqSoftwareSeedModifications.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/APSReqSoftwareSeedModifications"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_APSReqSoftwareSeedModifications_type");
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

		switch (notification.getFeatureID(APSReqSoftwareSeedModifications.class)) {
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__METHOD_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS:
			case Modificationmarks_softwarePackage.APS_REQ_SOFTWARE_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS:
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
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__GLOBAL_VARIABLE_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyGlobalVariable()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyInterface()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_METHOD_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyAbstractMethod()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__ABSTRACT_PROPERTY_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyAbstractProperty()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_BLOCK_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyFunctionBlock()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__METHOD_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyMethod()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROPERTY_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyProperty()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__FUNCTION_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyFunction()));

		newChildDescriptors.add
			(createChildParameter
				(IECModificationmarksPackage.Literals.IEC_SEED_MODIFICATIONS__PROGRAM_MODIFICATIONS,
				 IECModificationmarksFactory.eINSTANCE.createIECModifyProgram()));
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
