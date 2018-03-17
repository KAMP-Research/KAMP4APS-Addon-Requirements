/**
 */
package edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware;

import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule;
import edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module;
import edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractAPSReqChangePropagationDueToSpecificationDependencies;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APS Req Hardware Change Propagation Due To Specification Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies#getStructureModifications <em>Structure Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies#getModuleModifications <em>Module Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.APSReqHardwareChangePropagationDueToSpecificationDependencies#getInterfaceModifications <em>Interface Modifications</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies()
 * @model
 * @generated
 */
public interface APSReqHardwareChangePropagationDueToSpecificationDependencies extends AbstractAPSReqChangePropagationDueToSpecificationDependencies {
	/**
	 * Returns the value of the '<em><b>Structure Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyStructure}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.StructureRepository.Structure>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies_StructureModifications()
	 * @model
	 * @generated
	 */
	EList<ModifyStructure<Structure>> getStructureModifications();

	/**
	 * Returns the value of the '<em><b>Module Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyModule}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.ModuleRepository.Module>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies_ModuleModifications()
	 * @model
	 * @generated
	 */
	EList<ModifyModule<Module>> getModuleModifications();

	/**
	 * Returns the value of the '<em><b>Component Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyComponent}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.ComponentRepository.Component>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies_ComponentModifications()
	 * @model
	 * @generated
	 */
	EList<ModifyComponent<Component>> getComponentModifications();

	/**
	 * Returns the value of the '<em><b>Interface Modifications</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4aps.model.KAMP4aPSModificationmarks.ModifyInterface}&lt;edu.kit.ipd.sdq.kamp4aps.model.aPS.InterfaceRepository.Interface>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Modifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Modifications</em>' reference list.
	 * @see edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks_hardware.Modificationmarks_hardwarePackage#getAPSReqHardwareChangePropagationDueToSpecificationDependencies_InterfaceModifications()
	 * @model
	 * @generated
	 */
	EList<ModifyInterface<Interface>> getInterfaceModifications();

} // APSReqHardwareChangePropagationDueToSpecificationDependencies
