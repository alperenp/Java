/**
 */
package FileIntegrityTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Crypto Hash Functions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see FileIntegrityTest.FileIntegrityTestPackage#getCryptoHashFunctions()
 * @model
 * @generated
 */
public enum CryptoHashFunctions implements Enumerator {
	/**
	 * The '<em><b>MD5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MD5_VALUE
	 * @generated
	 * @ordered
	 */
	MD5(0, "MD5", "MD5"),

	/**
	 * The '<em><b>SHA1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA1_VALUE
	 * @generated
	 * @ordered
	 */
	SHA1(1, "SHA1", "SHA-1"),

	/**
	 * The '<em><b>SHA256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA256_VALUE
	 * @generated
	 * @ordered
	 */
	SHA256(2, "SHA256", "SHA-256"),

	/**
	 * The '<em><b>SHA384</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA384_VALUE
	 * @generated
	 * @ordered
	 */
	SHA384(3, "SHA384", "SHA-384"),

	/**
	 * The '<em><b>SHA512</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHA512_VALUE
	 * @generated
	 * @ordered
	 */
	SHA512(5, "SHA512", "SHA-512");

	/**
	 * The '<em><b>MD5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MD5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MD5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MD5_VALUE = 0;

	/**
	 * The '<em><b>SHA1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHA1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHA1
	 * @model literal="SHA-1"
	 * @generated
	 * @ordered
	 */
	public static final int SHA1_VALUE = 1;

	/**
	 * The '<em><b>SHA256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHA256</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHA256
	 * @model literal="SHA-256"
	 * @generated
	 * @ordered
	 */
	public static final int SHA256_VALUE = 2;

	/**
	 * The '<em><b>SHA384</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHA384</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHA384
	 * @model literal="SHA-384"
	 * @generated
	 * @ordered
	 */
	public static final int SHA384_VALUE = 3;

	/**
	 * The '<em><b>SHA512</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHA512</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHA512
	 * @model literal="SHA-512"
	 * @generated
	 * @ordered
	 */
	public static final int SHA512_VALUE = 5;

	/**
	 * An array of all the '<em><b>Crypto Hash Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CryptoHashFunctions[] VALUES_ARRAY =
		new CryptoHashFunctions[] {
			MD5,
			SHA1,
			SHA256,
			SHA384,
			SHA512,
		};

	/**
	 * A public read-only list of all the '<em><b>Crypto Hash Functions</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CryptoHashFunctions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Crypto Hash Functions</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoHashFunctions get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CryptoHashFunctions result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crypto Hash Functions</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoHashFunctions getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CryptoHashFunctions result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Crypto Hash Functions</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CryptoHashFunctions get(int value) {
		switch (value) {
			case MD5_VALUE: return MD5;
			case SHA1_VALUE: return SHA1;
			case SHA256_VALUE: return SHA256;
			case SHA384_VALUE: return SHA384;
			case SHA512_VALUE: return SHA512;
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
	private CryptoHashFunctions(int value, String name, String literal) {
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
	
} //CryptoHashFunctions
