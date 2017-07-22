/**
 */
package apsoptions.presentation;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;

import archoptions.provider.ArchoptionsEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.provider.DimensionsEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider.DimensiontypesEditPlugin;
import de.uka.ipd.sdq.dsexplore.qml.units.provider.UnitsEditPlugin;
import de.uka.ipd.sdq.identifier.provider.IdentifierEditPlugin;
import effects.provider.EffectsEditPlugin;
import glossary.provider.GlossaryEditPlugin;
import namedelement.provider.NamedelementEditPlugin;
import options.provider.OptionsEditPlugin;
import qualities.provider.QualitiesEditPlugin;
import relations.provider.RelationsEditPlugin;
import xPPU.provider.XPPUEditPlugin;

/**
 * This is the central singleton for the Apsoptions editor plugin. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public final class ApsoptionsEditorPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	public static final ApsoptionsEditorPlugin INSTANCE = new ApsoptionsEditorPlugin();

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
	public ApsoptionsEditorPlugin() {
		super(new ResourceLocator[] { ArchoptionsEditPlugin.INSTANCE, DimensionsEditPlugin.INSTANCE,
				DimensiontypesEditPlugin.INSTANCE, EffectsEditPlugin.INSTANCE, GlossaryEditPlugin.INSTANCE,
				IdentifierEditPlugin.INSTANCE, NamedelementEditPlugin.INSTANCE, OptionsEditPlugin.INSTANCE,
				QualitiesEditPlugin.INSTANCE, RelationsEditPlugin.INSTANCE, UnitsEditPlugin.INSTANCE,
				XPPUEditPlugin.INSTANCE, });
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
	public static class Implementation extends EclipseUIPlugin {
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
