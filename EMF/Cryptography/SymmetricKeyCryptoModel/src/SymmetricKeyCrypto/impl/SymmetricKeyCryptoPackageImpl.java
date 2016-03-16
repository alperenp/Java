/**
 */
package SymmetricKeyCrypto.impl;

import SymmetricKeyCrypto.Algorithm;
import SymmetricKeyCrypto.Cipher_Mode;
import SymmetricKeyCrypto.Padding;
import SymmetricKeyCrypto.SymmetricKeyCryptoFactory;
import SymmetricKeyCrypto.SymmetricKeyCryptoPackage;
import SymmetricKeyCrypto.SymmetricKeyFunction;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymmetricKeyCryptoPackageImpl extends EPackageImpl implements SymmetricKeyCryptoPackage {
        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EClass symmetricKeyFunctionEClass = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum algorithmEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum cipher_ModeEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EEnum paddingEEnum = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType invalidKeyExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType invalidAlgortihmParameterExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType noSuchAlgorithmExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType noSuchPaddingExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType illegalBlockSizeExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType badPaddingExceptionEDataType = null;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private EDataType cipherEDataType = null;

        /**
         * Creates an instance of the model <b>Package</b>, registered with
         * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
         * package URI value.
         * <p>Note: the correct way to create the package is via the static
         * factory method {@link #init init()}, which also performs
         * initialization of the package, or returns the registered package,
         * if one already exists.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.emf.ecore.EPackage.Registry
         * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage#eNS_URI
         * @see #init()
         * @generated
         */
        private SymmetricKeyCryptoPackageImpl() {
                super(eNS_URI, SymmetricKeyCryptoFactory.eINSTANCE);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private static boolean isInited = false;

        /**
         * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
         * 
         * <p>This method is used to initialize {@link SymmetricKeyCryptoPackage#eINSTANCE} when that field is accessed.
         * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #eNS_URI
         * @see #createPackageContents()
         * @see #initializePackageContents()
         * @generated
         */
        public static SymmetricKeyCryptoPackage init() {
                if (isInited) return (SymmetricKeyCryptoPackage)EPackage.Registry.INSTANCE.getEPackage(SymmetricKeyCryptoPackage.eNS_URI);

                // Obtain or create and register package
                SymmetricKeyCryptoPackageImpl theSymmetricKeyCryptoPackage = (SymmetricKeyCryptoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymmetricKeyCryptoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymmetricKeyCryptoPackageImpl());

                isInited = true;

                // Create package meta-data objects
                theSymmetricKeyCryptoPackage.createPackageContents();

                // Initialize created meta-data
                theSymmetricKeyCryptoPackage.initializePackageContents();

                // Mark meta-data to indicate it can't be changed
                theSymmetricKeyCryptoPackage.freeze();

  
                // Update the registry and return the package
                EPackage.Registry.INSTANCE.put(SymmetricKeyCryptoPackage.eNS_URI, theSymmetricKeyCryptoPackage);
                return theSymmetricKeyCryptoPackage;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EClass getSymmetricKeyFunction() {
                return symmetricKeyFunctionEClass;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EAttribute getSymmetricKeyFunction_Cipher() {
                return (EAttribute)symmetricKeyFunctionEClass.getEStructuralFeatures().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EOperation getSymmetricKeyFunction__Encrypt__byte_byte_byte() {
                return symmetricKeyFunctionEClass.getEOperations().get(0);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EOperation getSymmetricKeyFunction__GenerateCipherObject__Algorithm_Cipher_Mode_Padding() {
                return symmetricKeyFunctionEClass.getEOperations().get(1);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EOperation getSymmetricKeyFunction__Decrypt__byte_byte_byte() {
                return symmetricKeyFunctionEClass.getEOperations().get(2);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getAlgorithm() {
                return algorithmEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getCipher_Mode() {
                return cipher_ModeEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EEnum getPadding() {
                return paddingEEnum;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getInvalidKeyException() {
                return invalidKeyExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getInvalidAlgortihmParameterException() {
                return invalidAlgortihmParameterExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getNoSuchAlgorithmException() {
                return noSuchAlgorithmExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getNoSuchPaddingException() {
                return noSuchPaddingExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getIllegalBlockSizeException() {
                return illegalBlockSizeExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getBadPaddingException() {
                return badPaddingExceptionEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public EDataType getCipher() {
                return cipherEDataType;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SymmetricKeyCryptoFactory getSymmetricKeyCryptoFactory() {
                return (SymmetricKeyCryptoFactory)getEFactoryInstance();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isCreated = false;

        /**
         * Creates the meta-model objects for the package.  This method is
         * guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void createPackageContents() {
                if (isCreated) return;
                isCreated = true;

                // Create classes and their features
                symmetricKeyFunctionEClass = createEClass(SYMMETRIC_KEY_FUNCTION);
                createEAttribute(symmetricKeyFunctionEClass, SYMMETRIC_KEY_FUNCTION__CIPHER);
                createEOperation(symmetricKeyFunctionEClass, SYMMETRIC_KEY_FUNCTION___ENCRYPT__BYTE_BYTE_BYTE);
                createEOperation(symmetricKeyFunctionEClass, SYMMETRIC_KEY_FUNCTION___GENERATE_CIPHER_OBJECT__ALGORITHM_CIPHER_MODE_PADDING);
                createEOperation(symmetricKeyFunctionEClass, SYMMETRIC_KEY_FUNCTION___DECRYPT__BYTE_BYTE_BYTE);

                // Create enums
                algorithmEEnum = createEEnum(ALGORITHM);
                cipher_ModeEEnum = createEEnum(CIPHER_MODE);
                paddingEEnum = createEEnum(PADDING);

                // Create data types
                invalidKeyExceptionEDataType = createEDataType(INVALID_KEY_EXCEPTION);
                invalidAlgortihmParameterExceptionEDataType = createEDataType(INVALID_ALGORTIHM_PARAMETER_EXCEPTION);
                noSuchAlgorithmExceptionEDataType = createEDataType(NO_SUCH_ALGORITHM_EXCEPTION);
                noSuchPaddingExceptionEDataType = createEDataType(NO_SUCH_PADDING_EXCEPTION);
                illegalBlockSizeExceptionEDataType = createEDataType(ILLEGAL_BLOCK_SIZE_EXCEPTION);
                badPaddingExceptionEDataType = createEDataType(BAD_PADDING_EXCEPTION);
                cipherEDataType = createEDataType(CIPHER);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        private boolean isInitialized = false;

        /**
         * Complete the initialization of the package and its meta-model.  This
         * method is guarded to have no affect on any invocation but its first.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void initializePackageContents() {
                if (isInitialized) return;
                isInitialized = true;

                // Initialize package
                setName(eNAME);
                setNsPrefix(eNS_PREFIX);
                setNsURI(eNS_URI);

                // Create type parameters

                // Set bounds for type parameters

                // Add supertypes to classes

                // Initialize classes, features, and operations; add parameters
                initEClass(symmetricKeyFunctionEClass, SymmetricKeyFunction.class, "SymmetricKeyFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
                initEAttribute(getSymmetricKeyFunction_Cipher(), this.getCipher(), "cipher", null, 0, 1, SymmetricKeyFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

                EOperation op = initEOperation(getSymmetricKeyFunction__Encrypt__byte_byte_byte(), ecorePackage.getEByteArray(), "encrypt", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEByteArray(), "plaintext", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEByteArray(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEByteArray(), "IV", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getInvalidKeyException());
                addEException(op, this.getInvalidAlgortihmParameterException());
                addEException(op, this.getNoSuchAlgorithmException());
                addEException(op, this.getNoSuchPaddingException());
                addEException(op, this.getIllegalBlockSizeException());
                addEException(op, this.getBadPaddingException());

                op = initEOperation(getSymmetricKeyFunction__GenerateCipherObject__Algorithm_Cipher_Mode_Padding(), this.getCipher(), "generateCipherObject", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, this.getAlgorithm(), "algorithm", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, this.getCipher_Mode(), "cipher_mode", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, this.getPadding(), "padding", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getNoSuchAlgorithmException());
                addEException(op, this.getNoSuchPaddingException());

                op = initEOperation(getSymmetricKeyFunction__Decrypt__byte_byte_byte(), ecorePackage.getEByteArray(), "decrypt", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEByteArray(), "ciphertext", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEByteArray(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEParameter(op, ecorePackage.getEByteArray(), "IV", 0, 1, IS_UNIQUE, IS_ORDERED);
                addEException(op, this.getInvalidKeyException());
                addEException(op, this.getInvalidAlgortihmParameterException());
                addEException(op, this.getNoSuchAlgorithmException());
                addEException(op, this.getNoSuchPaddingException());
                addEException(op, this.getIllegalBlockSizeException());
                addEException(op, this.getBadPaddingException());

                // Initialize enums and add enum literals
                initEEnum(algorithmEEnum, Algorithm.class, "Algorithm");
                addEEnumLiteral(algorithmEEnum, Algorithm.DES);
                addEEnumLiteral(algorithmEEnum, Algorithm.AES);
                addEEnumLiteral(algorithmEEnum, Algorithm.BLOWFISH);

                initEEnum(cipher_ModeEEnum, Cipher_Mode.class, "Cipher_Mode");
                addEEnumLiteral(cipher_ModeEEnum, Cipher_Mode.ECB);
                addEEnumLiteral(cipher_ModeEEnum, Cipher_Mode.CBC);
                addEEnumLiteral(cipher_ModeEEnum, Cipher_Mode.OFB);
                addEEnumLiteral(cipher_ModeEEnum, Cipher_Mode.CTR);

                initEEnum(paddingEEnum, Padding.class, "Padding");
                addEEnumLiteral(paddingEEnum, Padding.NO_PADDING);
                addEEnumLiteral(paddingEEnum, Padding.PKCS1_PADDING);
                addEEnumLiteral(paddingEEnum, Padding.OAEP_WITH_SHA_1AND_MGF1_PADDING);
                addEEnumLiteral(paddingEEnum, Padding.OAEP_WITH_SHA_256_AND_MGF1_PADDING);
                addEEnumLiteral(paddingEEnum, Padding.PKCS5_PADDING);

                // Initialize data types
                initEDataType(invalidKeyExceptionEDataType, InvalidKeyException.class, "InvalidKeyException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(invalidAlgortihmParameterExceptionEDataType, InvalidAlgorithmParameterException.class, "InvalidAlgortihmParameterException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(noSuchAlgorithmExceptionEDataType, NoSuchAlgorithmException.class, "NoSuchAlgorithmException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(noSuchPaddingExceptionEDataType, NoSuchPaddingException.class, "NoSuchPaddingException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(illegalBlockSizeExceptionEDataType, IllegalBlockSizeException.class, "IllegalBlockSizeException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(badPaddingExceptionEDataType, BadPaddingException.class, "BadPaddingException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
                initEDataType(cipherEDataType, Cipher.class, "Cipher", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

                // Create resource
                createResource(eNS_URI);
        }

} //SymmetricKeyCryptoPackageImpl
