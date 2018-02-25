/**
 */
package apsoptions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Option Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see apsoptions.ApsoptionsPackage#getOptionType()
 * @model
 * @generated
 */
public enum OptionType implements Enumerator {
	/**
	 * The '<em><b>Introduce New</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTRODUCE_NEW_VALUE
	 * @generated
	 * @ordered
	 */
	INTRODUCE_NEW(0, "introduceNew", "IntroduceNew"),

	/**
	 * The '<em><b>Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE(1, "remove", "remove"),

	/**
	 * The '<em><b>Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE(2, "change", "change");

	/**
	 * The '<em><b>Introduce New</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTRODUCE NEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTRODUCE_NEW
	 * @model name="introduceNew" literal="IntroduceNew"
	 * @generated
	 * @ordered
	 */
	public static final int INTRODUCE_NEW_VALUE = 0;

	/**
	 * The '<em><b>Remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE
	 * @model name="remove"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_VALUE = 1;

	/**
	 * The '<em><b>Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGE
	 * @model name="change"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Option Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OptionType[] VALUES_ARRAY =
		new OptionType[] {
			INTRODUCE_NEW,
			REMOVE,
			CHANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Option Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Option Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OptionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Option Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OptionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Option Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OptionType get(int value) {
		switch (value) {
			case INTRODUCE_NEW_VALUE: return INTRODUCE_NEW;
			case REMOVE_VALUE: return REMOVE;
			case CHANGE_VALUE: return CHANGE;
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
	private OptionType(int value, String name, String literal) {
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
	
} //OptionType
