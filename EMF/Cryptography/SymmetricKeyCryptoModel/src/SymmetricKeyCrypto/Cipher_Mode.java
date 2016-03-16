/**
 */
package SymmetricKeyCrypto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cipher Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage#getCipher_Mode()
 * @model
 * @generated
 */
public enum Cipher_Mode implements Enumerator {
        /**
         * The '<em><b>ECB</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #ECB_VALUE
         * @generated
         * @ordered
         */
        ECB(0, "ECB", "ECB"),

        /**
         * The '<em><b>CBC</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #CBC_VALUE
         * @generated
         * @ordered
         */
        CBC(1, "CBC", "CBC"),

        /**
         * The '<em><b>OFB</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OFB_VALUE
         * @generated
         * @ordered
         */
        OFB(2, "OFB", "OFB"),

        /**
         * The '<em><b>CTR</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #CTR_VALUE
         * @generated
         * @ordered
         */
        CTR(3, "CTR", "CTR");

        /**
         * The '<em><b>ECB</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>ECB</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #ECB
         * @model
         * @generated
         * @ordered
         */
        public static final int ECB_VALUE = 0;

        /**
         * The '<em><b>CBC</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>CBC</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #CBC
         * @model
         * @generated
         * @ordered
         */
        public static final int CBC_VALUE = 1;

        /**
         * The '<em><b>OFB</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>OFB</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #OFB
         * @model
         * @generated
         * @ordered
         */
        public static final int OFB_VALUE = 2;

        /**
         * The '<em><b>CTR</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>CTR</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #CTR
         * @model
         * @generated
         * @ordered
         */
        public static final int CTR_VALUE = 3;

        /**
         * An array of all the '<em><b>Cipher Mode</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final Cipher_Mode[] VALUES_ARRAY =
                new Cipher_Mode[] {
                        ECB,
                        CBC,
                        OFB,
                        CTR,
                };

        /**
         * A public read-only list of all the '<em><b>Cipher Mode</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<Cipher_Mode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Cipher Mode</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param literal the literal.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Cipher_Mode get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Cipher_Mode result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Cipher Mode</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param name the name.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Cipher_Mode getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Cipher_Mode result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Cipher Mode</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the integer value.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Cipher_Mode get(int value) {
                switch (value) {
                        case ECB_VALUE: return ECB;
                        case CBC_VALUE: return CBC;
                        case OFB_VALUE: return OFB;
                        case CTR_VALUE: return CTR;
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
        private Cipher_Mode(int value, String name, String literal) {
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
        
} //Cipher_Mode
