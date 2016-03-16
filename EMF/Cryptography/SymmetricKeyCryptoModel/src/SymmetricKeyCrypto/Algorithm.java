/**
 */
package SymmetricKeyCrypto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Algorithm</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage#getAlgorithm()
 * @model instanceClass="SymmetricKeyCrypto.Algorithm"
 * @generated
 */
public enum Algorithm implements Enumerator {
        /**
         * The '<em><b>DES</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #DES_VALUE
         * @generated
         * @ordered
         */
        DES(0, "DES", "DES"),

        /**
         * The '<em><b>AES</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #AES_VALUE
         * @generated
         * @ordered
         */
        AES(1, "AES", "AES"),

        /**
         * The '<em><b>Blowfish</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #BLOWFISH_VALUE
         * @generated
         * @ordered
         */
        BLOWFISH(2, "Blowfish", "Blowfish");

        /**
         * The '<em><b>DES</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>DES</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #DES
         * @model
         * @generated
         * @ordered
         */
        public static final int DES_VALUE = 0;

        /**
         * The '<em><b>AES</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>AES</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #AES
         * @model
         * @generated
         * @ordered
         */
        public static final int AES_VALUE = 1;

        /**
         * The '<em><b>Blowfish</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>Blowfish</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #BLOWFISH
         * @model name="Blowfish"
         * @generated
         * @ordered
         */
        public static final int BLOWFISH_VALUE = 2;

        /**
         * An array of all the '<em><b>Algorithm</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final Algorithm[] VALUES_ARRAY =
                new Algorithm[] {
                        DES,
                        AES,
                        BLOWFISH,
                };

        /**
         * A public read-only list of all the '<em><b>Algorithm</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<Algorithm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Algorithm</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param literal the literal.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Algorithm get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Algorithm result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Algorithm</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param name the name.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Algorithm getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Algorithm result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Algorithm</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the integer value.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Algorithm get(int value) {
                switch (value) {
                        case DES_VALUE: return DES;
                        case AES_VALUE: return AES;
                        case BLOWFISH_VALUE: return BLOWFISH;
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
        private Algorithm(int value, String name, String literal) {
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
        
} //Algorithm
