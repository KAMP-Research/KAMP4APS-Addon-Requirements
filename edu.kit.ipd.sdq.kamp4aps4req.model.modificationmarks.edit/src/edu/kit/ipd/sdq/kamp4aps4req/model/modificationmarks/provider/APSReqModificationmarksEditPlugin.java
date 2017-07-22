/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.provider;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;
import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;
import decisions.provider.DecisionsEditPlugin;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.provider.ModificationmarksEditPlugin;
import edu.kit.ipd.sdq.kamp4aps.model.modificationmarks.provider.KAPSModificationmarksEditPlugin;
import effects.provider.EffectsEditPlugin;
import glossary.provider.GlossaryEditPlugin;
import namedelement.provider.NamedelementEditPlugin;
import options.provider.OptionsEditPlugin;
import qualities.provider.QualitiesEditPlugin;
import relations.provider.RelationsEditPlugin;
import requirements.provider.RequirementsEditPlugin;
import xPPU.provider.XPPUEditPlugin;

/**
 * This is the central singleton for the APSReqModificationmarks edit plugin.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public final class APSReqModificationmarksEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	public static final APSReqModificationmarksEditPlugin INSTANCE = new APSReqModificationmarksEditPlugin();

	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public APSReqModificationmarksEditPlugin() {
		super(new ResourceLocator[] { DecisionsEditPlugin.INSTANCE, DimensionsEditPlugin.INSTANCE,
				DimensiontypesEditPlugin.INSTANCE, EffectsEditPlugin.INSTANCE, GlossaryEditPlugin.INSTANCE,
				IdentifierEditPlugin.INSTANCE, KAPSModificationmarksEditPlugin.INSTANCE,
				ModificationmarksEditPlugin.INSTANCE, NamedelementEditPlugin.INSTANCE, OptionsEditPlugin.INSTANCE,
				QualitiesEditPlugin.INSTANCE, RelationsEditPlugin.INSTANCE, RequirementsEditPlugin.INSTANCE,
				UnitsEditPlugin.INSTANCE, XPPUEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
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
