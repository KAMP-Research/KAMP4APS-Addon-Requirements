package edu.kit.ipd.sdq.kamp4aps4req.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import decisions.Decision;
import edu.kit.ipd.sdq.kamp.architecture.ArchitectureModelLookup;
import edu.kit.ipd.sdq.kamp.util.MapUtil;
import options.Option;
import relations.CouldResolveObject;
import relations.DependencyObject;
import relations.ResolveObject;
import relations.TriggerObject;
import requirements.Requirement;

public class APSReqArchitectureModelLookup extends ArchitectureModelLookup {

	
	
	/*	########################################################################################################################
	 * 	#  REQUIREMENTS LOOKUP SECTION  ########################################################################################
	 *  ########################################################################################################################              
	 */
	/**
	 * Maps Requirements to the TriggerObjects they are triggering.
	 * @param triggeredObjects TriggerObjects triggered by requirements.
	 * @return Map with Requirements and their TriggerObjects
	 */
	public static Map<Requirement, Set<TriggerObject>> lookUpRequirementsTriggeringTriggerObjects(
			Collection<? extends TriggerObject> triggeredObjects) {
		Map<Requirement, Set<TriggerObject>> results = new HashMap<Requirement, Set<TriggerObject>>();
		
		for (TriggerObject triggeredObject: triggeredObjects) {
			for (TriggerObject trigger: triggeredObject.getTriggeredBy()) {
				if (trigger instanceof Requirement) {
					MapUtil.putOrAddToMap(results, (Requirement) trigger, triggeredObject);
				}
			}
		}
		return results;
	}
	
	/**
	 * Maps Decisions to TriggerObjects
	 * @param triggers TriggerObjects triggering the Decisions
	 * @return Map with Decisions and their triggers
	 */
	public static Map<Decision, Set<TriggerObject>> lookUpDecisionsTriggeredByTriggerObjects(
			Collection<? extends TriggerObject> triggers) {
		Map<Decision, Set<TriggerObject>> results = new HashMap<Decision, Set<TriggerObject>>();
		
		for (TriggerObject trigger: triggers) {
			for (TriggerObject triggeredObject : trigger.getTriggerOf()) {
				if (triggeredObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) triggeredObject, trigger);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Maps Options to TriggerObjects
	 * @param triggers Triggers of options
	 * @return Map with Options and their triggers
	 */
	public static Map<Option, Set<TriggerObject>> lookUpOptionsTriggeredByTriggerObjects(
			Collection<? extends TriggerObject> triggers) {
		Map<Option, Set<TriggerObject>> results = new HashMap<Option, Set<TriggerObject>>();
		
		for (TriggerObject trigger: triggers) {
			for (TriggerObject triggeredObject : trigger.getTriggerOf()) {
				if (triggeredObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) triggeredObject, trigger);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Maps Decisions to ResolveObjects
	 * @param objectsToBeResolved Objects resolved by decisions
	 * @return Map with Decisions and the objects to be resolved
	 */
	public static Map<Decision, Set<ResolveObject>> lookUpDecisionsResolvingResolveObjects(
			Collection<? extends ResolveObject> objectsToBeResolved) {
		Map<Decision, Set<ResolveObject>> results = new HashMap<Decision, Set<ResolveObject>>();
		
		for (ResolveObject objectToBeResolved: objectsToBeResolved) {
			for (ResolveObject resolvingObject : objectToBeResolved.getResolvedBy()) {
				if (resolvingObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) resolvingObject, objectToBeResolved);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Maps Options to ResolveObjects
	 * @param objectsToBeResolved Objects resolved by options
	 * @return Map with Options and the objects to be resolved
	 */
	public static Map<Option, Set<ResolveObject>> lookUpOptionsResolvingResolveObjects(
			Collection<? extends ResolveObject> objectsToBeResolved) {
		Map<Option, Set<ResolveObject>> results = new HashMap<Option, Set<ResolveObject>>();

		for (ResolveObject objectToBeResolved : objectsToBeResolved) {
			for (ResolveObject resolvingObject : objectToBeResolved.getResolvedBy()) {
				if (resolvingObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) resolvingObject, objectToBeResolved);
				}
			}
		}

		return results;
	}
	
	/**
	 * Maps Decisions to CouldResolveObjects
	 * @param objectsToBeResolved Objects to be resolved by decisions
	 * @return Map with Decisions and objects to be resolved
	 */
	public static Map<Decision, Set<CouldResolveObject>> lookUpDecisionsCouldBeResolvingResolveObjects(
			Collection<? extends CouldResolveObject> objectsToBeResolved) {
		Map<Decision, Set<CouldResolveObject>> results = new HashMap<Decision, Set<CouldResolveObject>>();
		
		for (CouldResolveObject objectToBeResolved: objectsToBeResolved) {
			for (CouldResolveObject resolvingObject : objectToBeResolved.getCouldBeResolvedBy()) {
				if (resolvingObject instanceof Decision) {
					MapUtil.putOrAddToMap(results, (Decision) resolvingObject, objectToBeResolved);
				}
			}
		}
		
		return results;
	}

	/**
	 * Maps Options to the CouldResolveObjects
	 * @param objectsToBeResolved The objects to be resolved by options
	 * @return Map with options and objects to be resolved
	 */
	public static Map<Option, Set<CouldResolveObject>> lookUpOptionsCouldBeResolvingResolveObjects(
			Collection<? extends CouldResolveObject> objectsToBeResolved) {
		Map<Option, Set<CouldResolveObject>> results = new HashMap<Option, Set<CouldResolveObject>>();
		
		for (CouldResolveObject objectToBeResolved: objectsToBeResolved) {
			for (CouldResolveObject resolvingObject : objectToBeResolved.getCouldBeResolvedBy()) {
				if (resolvingObject instanceof Option) {
					MapUtil.putOrAddToMap(results, (Option) resolvingObject, objectToBeResolved);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Finds all DependencyObjects that are directly or indirectly (transitive closure) 
	 * dependent on at least on of the DependencyObject passed as a parameter and that 
	 * have a certain type (or one of its sub-types). The causing objects are the values
	 * of the map, the affected objects are the keys.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends DependencyObject> Map<T, Set<DependencyObject>> lookUpObjectsDependOnObjects(
			Collection<? extends DependencyObject> sourceDependencyObjects, Class<T> dependencyObjectsClass) {
		Map<T, Set<DependencyObject>> results = new HashMap<T, Set<DependencyObject>>();
		List<DependencyObject> dependenciesToVisit = new LinkedList<DependencyObject>(
				sourceDependencyObjects);
		
		while(!dependenciesToVisit.isEmpty()) {
			DependencyObject sourceDependencyObject = dependenciesToVisit.remove(0);
			for (DependencyObject targetDependencyObject: sourceDependencyObject.getHasDependents()) {
				if (dependencyObjectsClass.isAssignableFrom(targetDependencyObject.getClass())) {
					// Analyze each object only once, but always update causes
					if (!dependenciesToVisit.contains(targetDependencyObject) && 
							!results.containsKey(targetDependencyObject)) {
						dependenciesToVisit.add(targetDependencyObject);
					}
					MapUtil.putOrAddToMap(results, (T) targetDependencyObject, sourceDependencyObject);
				}
			}
		}
		
		return results;
	}
	
	/**
	 * Finds all DependencyObjects which at least one of the DependencyObjects passed 
	 * as a parameter directly or indirectly (transitive closure) depends on and that 
	 * have a certain type (or one of its sub-types). The causes (dependent objects) are
	 * stored as the value of the map, the affected objects are the keys.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends DependencyObject> Map<T, Set<DependencyObject>> lookUpObjectsAnotherObjectDependsOn(
			Collection<? extends DependencyObject> targetDependencyObjects, Class<T> dependencyObjectClass) {
		Map<T, Set<DependencyObject>> results = new HashMap<T, Set<DependencyObject>>();
		List<DependencyObject> dependenciesToVisit = new LinkedList<DependencyObject>(
				targetDependencyObjects);
		
		while(!dependenciesToVisit.isEmpty()) {
			DependencyObject targetDependencyObject = dependenciesToVisit.remove(0);
			for (DependencyObject sourceDependencyObject: targetDependencyObject.getDependsOn()) {
				if (dependencyObjectClass.isAssignableFrom(sourceDependencyObject.getClass())) {
					// Analyze each object only once, but always update causes
					if (!dependenciesToVisit.contains(sourceDependencyObject) && 
							!results.containsKey(sourceDependencyObject)) {
						dependenciesToVisit.add(sourceDependencyObject);
					}
					MapUtil.putOrAddToMap(results, (T) sourceDependencyObject, targetDependencyObject);
				}
			}
		}
		
		return results;
	}
	
}
