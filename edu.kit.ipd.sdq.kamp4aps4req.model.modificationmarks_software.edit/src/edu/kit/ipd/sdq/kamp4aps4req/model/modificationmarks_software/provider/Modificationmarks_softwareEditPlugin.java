/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_software.provider;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;

import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;

import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;

import decisions.provider.DecisionsEditPlugin;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ModificationmarksEditPlugin;

import edu.kit.ipd.sdq.kamp4iec.model.IECModel.provider.IECModelEditPlugin;

import edu.kit.ipd.sdq.kamp4iec.model.IECRepository.provider.IECRepositoryEditPlugin;
import effects.provider.EffectsEditPlugin;

import glossary.provider.GlossaryEditPlugin;

import namedelement.provider.NamedelementEditPlugin;

import options.provider.OptionsEditPlugin;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import qualities.provider.QualitiesEditPlugin;

import relations.provider.RelationsEditPlugin;

import requirements.provider.RequirementsEditPlugin;

/**
 * This is the central singleton for the Modificationmarks_software edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class Modificationmarks_softwareEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Modificationmarks_softwareEditPlugin INSTANCE = new Modificationmarks_softwareEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modificationmarks_softwareEditPlugin() {
		super
		  (new ResourceLocator [] {
		     DecisionsEditPlugin.INSTANCE,
		     DimensionsEditPlugin.INSTANCE,
		     DimensiontypesEditPlugin.INSTANCE,
		     EffectsEditPlugin.INSTANCE,
		     GlossaryEditPlugin.INSTANCE,
		     IdentifierEditPlugin.INSTANCE,
		     IECModelEditPlugin.INSTANCE,
		     edu.kit.ipd.sdq.kamp4iec.model.IECModificationmarks.provider.IECModificationmarksEditPlugin.INSTANCE,
		     IECRepositoryEditPlugin.INSTANCE,
		     ModificationmarksEditPlugin.INSTANCE,
		     edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider.ModificationmarksEditPlugin.INSTANCE,
		     NamedelementEditPlugin.INSTANCE,
		     OptionsEditPlugin.INSTANCE,
		     QualitiesEditPlugin.INSTANCE,
		     RelationsEditPlugin.INSTANCE,
		     RequirementsEditPlugin.INSTANCE,
		     UnitsEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
