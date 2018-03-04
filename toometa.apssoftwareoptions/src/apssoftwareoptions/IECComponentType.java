/**
 */
package apssoftwareoptions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IEC Component Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see apssoftwareoptions.ApssoftwareoptionsPackage#getIECComponentType()
 * @model
 * @generated
 */
public enum IECComponentType implements Enumerator {
	/**
	 * The '<em><b>Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM(0, "program", "Program"),

	/**
	 * The '<em><b>Configuration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIGURATION(1, "configuration", "Configuration"),

	/**
	 * The '<em><b>Function Block</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_BLOCK(2, "functionBlock", "Function Block"),

	/**
	 * The '<em><b>Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(3, "function", "Function"),

	/**
	 * The '<em><b>Global Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	GLOBAL_VARIABLE(4, "globalVariable", "Global Variable"),

	/**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(5, "interface", "Interface"),

	/**
	 * The '<em><b>Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(6, "method", "Method"),

	/**
	 * The '<em><b>Abstract Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_METHOD(7, "abstractMethod", "Abstract Method"),

	/**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(8, "property", "Property"),

	/**
	 * The '<em><b>Abstract Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT_PROPERTY(9, "abstractProperty", "Abstract Property");

	/**
	 * The '<em><b>Program</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Program</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRAM
	 * @model name="program" literal="Program"
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAM_VALUE = 0;

	/**
	 * The '<em><b>Configuration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Configuration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIGURATION
	 * @model name="configuration" literal="Configuration"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIGURATION_VALUE = 1;

	/**
	 * The '<em><b>Function Block</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Block</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_BLOCK
	 * @model name="functionBlock" literal="Function Block"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_BLOCK_VALUE = 2;

	/**
	 * The '<em><b>Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model name="function" literal="Function"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 3;

	/**
	 * The '<em><b>Global Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Global Variable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLOBAL_VARIABLE
	 * @model name="globalVariable" literal="Global Variable"
	 * @generated
	 * @ordered
	 */
	public static final int GLOBAL_VARIABLE_VALUE = 4;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="interface" literal="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 5;

	/**
	 * The '<em><b>Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model name="method" literal="Method"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 6;

	/**
	 * The '<em><b>Abstract Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstract Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_METHOD
	 * @model name="abstractMethod" literal="Abstract Method"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_METHOD_VALUE = 7;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="property" literal="Property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 8;

	/**
	 * The '<em><b>Abstract Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstract Property</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_PROPERTY
	 * @model name="abstractProperty" literal="Abstract Property"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_PROPERTY_VALUE = 9;

	/**
	 * An array of all the '<em><b>IEC Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IECComponentType[] VALUES_ARRAY =
		new IECComponentType[] {
			PROGRAM,
			CONFIGURATION,
			FUNCTION_BLOCK,
			FUNCTION,
			GLOBAL_VARIABLE,
			INTERFACE,
			METHOD,
			ABSTRACT_METHOD,
			PROPERTY,
			ABSTRACT_PROPERTY,
		};

	/**
	 * A public read-only list of all the '<em><b>IEC Component Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IECComponentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IEC Component Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IECComponentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IECComponentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IEC Component Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IECComponentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IECComponentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IEC Component Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IECComponentType get(int value) {
		switch (value) {
			case PROGRAM_VALUE: return PROGRAM;
			case CONFIGURATION_VALUE: return CONFIGURATION;
			case FUNCTION_BLOCK_VALUE: return FUNCTION_BLOCK;
			case FUNCTION_VALUE: return FUNCTION;
			case GLOBAL_VARIABLE_VALUE: return GLOBAL_VARIABLE;
			case INTERFACE_VALUE: return INTERFACE;
			case METHOD_VALUE: return METHOD;
			case ABSTRACT_METHOD_VALUE: return ABSTRACT_METHOD;
			case PROPERTY_VALUE: return PROPERTY;
			case ABSTRACT_PROPERTY_VALUE: return ABSTRACT_PROPERTY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IECComponentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IECComponentType
