/**
 */
package SymmetricKeyCrypto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Padding</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage#getPadding()
 * @model
 * @generated
 */
public enum Padding implements Enumerator {
        /**
         * The '<em><b>No Padding</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #NO_PADDING_VALUE
         * @generated
         * @ordered
         */
        NO_PADDING(0, "NoPadding", "NoPadding"),

        /**
         * The '<em><b>PKCS1 Padding</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PKCS1_PADDING_VALUE
         * @generated
         * @ordered
         */
        PKCS1_PADDING(1, "PKCS1Padding", "PKCS1Padding"),

        /**
         * The '<em><b>OAEP With SHA 1And MGF1 Padding</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OAEP_WITH_SHA_1AND_MGF1_PADDING_VALUE
         * @generated
         * @ordered
         */
        OAEP_WITH_SHA_1AND_MGF1_PADDING(2, "OAEPWithSHA_1AndMGF1Padding", "OAEPWithSHA-1AndMGF1Padding"),

        /**
         * The '<em><b>OAEP With SHA 256 And MGF1 Padding</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #OAEP_WITH_SHA_256_AND_MGF1_PADDING_VALUE
         * @generated
         * @ordered
         */
        OAEP_WITH_SHA_256_AND_MGF1_PADDING(3, "OAEPWithSHA_256AndMGF1Padding", "OAEPWithSHA-256AndMGF1Padding"),

        /**
         * The '<em><b>PKCS5 Padding</b></em>' literal object.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #PKCS5_PADDING_VALUE
         * @generated
         * @ordered
         */
        PKCS5_PADDING(5, "PKCS5Padding", "PKCS5Padding");

        /**
         * The '<em><b>No Padding</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>No Padding</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #NO_PADDING
         * @model name="NoPadding"
         * @generated
         * @ordered
         */
        public static final int NO_PADDING_VALUE = 0;

        /**
         * The '<em><b>PKCS1 Padding</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PKCS1 Padding</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PKCS1_PADDING
         * @model name="PKCS1Padding"
         * @generated
         * @ordered
         */
        public static final int PKCS1_PADDING_VALUE = 1;

        /**
         * The '<em><b>OAEP With SHA 1And MGF1 Padding</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>OAEP With SHA 1And MGF1 Padding</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #OAEP_WITH_SHA_1AND_MGF1_PADDING
         * @model name="OAEPWithSHA_1AndMGF1Padding" literal="OAEPWithSHA-1AndMGF1Padding"
         * @generated
         * @ordered
         */
        public static final int OAEP_WITH_SHA_1AND_MGF1_PADDING_VALUE = 2;

        /**
         * The '<em><b>OAEP With SHA 256 And MGF1 Padding</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>OAEP With SHA 256 And MGF1 Padding</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #OAEP_WITH_SHA_256_AND_MGF1_PADDING
         * @model name="OAEPWithSHA_256AndMGF1Padding" literal="OAEPWithSHA-256AndMGF1Padding"
         * @generated
         * @ordered
         */
        public static final int OAEP_WITH_SHA_256_AND_MGF1_PADDING_VALUE = 3;

        /**
         * The '<em><b>PKCS5 Padding</b></em>' literal value.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of '<em><b>PKCS5 Padding</b></em>' literal object isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @see #PKCS5_PADDING
         * @model name="PKCS5Padding"
         * @generated
         * @ordered
         */
        public static final int PKCS5_PADDING_VALUE = 5;

        /**
         * An array of all the '<em><b>Padding</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static final Padding[] VALUES_ARRAY =
                new Padding[] {
                        NO_PADDING,
                        PKCS1_PADDING,
                        OAEP_WITH_SHA_1AND_MGF1_PADDING,
                        OAEP_WITH_SHA_256_AND_MGF1_PADDING,
                        PKCS5_PADDING,
                };

        /**
         * A public read-only list of all the '<em><b>Padding</b></em>' enumerators.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static final List<Padding> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

        /**
         * Returns the '<em><b>Padding</b></em>' literal with the specified literal value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param literal the literal.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Padding get(String literal) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Padding result = VALUES_ARRAY[i];
                        if (result.toString().equals(literal)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Padding</b></em>' literal with the specified name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param name the name.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Padding getByName(String name) {
                for (int i = 0; i < VALUES_ARRAY.length; ++i) {
                        Padding result = VALUES_ARRAY[i];
                        if (result.getName().equals(name)) {
                                return result;
                        }
                }
                return null;
        }

        /**
         * Returns the '<em><b>Padding</b></em>' literal with the specified integer value.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the integer value.
         * @return the matching enumerator or <code>null</code>.
         * @generated
         */
        public static Padding get(int value) {
                switch (value) {
                        case NO_PADDING_VALUE: return NO_PADDING;
                        case PKCS1_PADDING_VALUE: return PKCS1_PADDING;
                        case OAEP_WITH_SHA_1AND_MGF1_PADDING_VALUE: return OAEP_WITH_SHA_1AND_MGF1_PADDING;
                        case OAEP_WITH_SHA_256_AND_MGF1_PADDING_VALUE: return OAEP_WITH_SHA_256_AND_MGF1_PADDING;
                        case PKCS5_PADDING_VALUE: return PKCS5_PADDING;
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
        private Padding(int value, String name, String literal) {
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
        
} //Padding
