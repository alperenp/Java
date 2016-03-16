/**
 */
package SymmetricKeyCrypto.impl;

import SymmetricKeyCrypto.*;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymmetricKeyCryptoFactoryImpl extends EFactoryImpl implements SymmetricKeyCryptoFactory {
        /**
         * Creates the default factory implementation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public static SymmetricKeyCryptoFactory init() {
                try {
                        SymmetricKeyCryptoFactory theSymmetricKeyCryptoFactory = (SymmetricKeyCryptoFactory)EPackage.Registry.INSTANCE.getEFactory(SymmetricKeyCryptoPackage.eNS_URI);
                        if (theSymmetricKeyCryptoFactory != null) {
                                return theSymmetricKeyCryptoFactory;
                        }
                }
                catch (Exception exception) {
                        EcorePlugin.INSTANCE.log(exception);
                }
                return new SymmetricKeyCryptoFactoryImpl();
        }

        /**
         * Creates an instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SymmetricKeyCryptoFactoryImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public EObject create(EClass eClass) {
                switch (eClass.getClassifierID()) {
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION: return createSymmetricKeyFunction();
                        default:
                                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object createFromString(EDataType eDataType, String initialValue) {
                switch (eDataType.getClassifierID()) {
                        case SymmetricKeyCryptoPackage.ALGORITHM:
                                return createAlgorithmFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.CIPHER_MODE:
                                return createCipher_ModeFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.PADDING:
                                return createPaddingFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.INVALID_KEY_EXCEPTION:
                                return createInvalidKeyExceptionFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.INVALID_ALGORTIHM_PARAMETER_EXCEPTION:
                                return createInvalidAlgortihmParameterExceptionFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.NO_SUCH_ALGORITHM_EXCEPTION:
                                return createNoSuchAlgorithmExceptionFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.NO_SUCH_PADDING_EXCEPTION:
                                return createNoSuchPaddingExceptionFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.ILLEGAL_BLOCK_SIZE_EXCEPTION:
                                return createIllegalBlockSizeExceptionFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.BAD_PADDING_EXCEPTION:
                                return createBadPaddingExceptionFromString(eDataType, initialValue);
                        case SymmetricKeyCryptoPackage.CIPHER:
                                return createCipherFromString(eDataType, initialValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String convertToString(EDataType eDataType, Object instanceValue) {
                switch (eDataType.getClassifierID()) {
                        case SymmetricKeyCryptoPackage.ALGORITHM:
                                return convertAlgorithmToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.CIPHER_MODE:
                                return convertCipher_ModeToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.PADDING:
                                return convertPaddingToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.INVALID_KEY_EXCEPTION:
                                return convertInvalidKeyExceptionToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.INVALID_ALGORTIHM_PARAMETER_EXCEPTION:
                                return convertInvalidAlgortihmParameterExceptionToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.NO_SUCH_ALGORITHM_EXCEPTION:
                                return convertNoSuchAlgorithmExceptionToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.NO_SUCH_PADDING_EXCEPTION:
                                return convertNoSuchPaddingExceptionToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.ILLEGAL_BLOCK_SIZE_EXCEPTION:
                                return convertIllegalBlockSizeExceptionToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.BAD_PADDING_EXCEPTION:
                                return convertBadPaddingExceptionToString(eDataType, instanceValue);
                        case SymmetricKeyCryptoPackage.CIPHER:
                                return convertCipherToString(eDataType, instanceValue);
                        default:
                                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
                }
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SymmetricKeyFunction createSymmetricKeyFunction() {
                SymmetricKeyFunctionImpl symmetricKeyFunction = new SymmetricKeyFunctionImpl();
                return symmetricKeyFunction;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Algorithm createAlgorithmFromString(EDataType eDataType, String initialValue) {
                Algorithm result = Algorithm.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertAlgorithmToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Cipher_Mode createCipher_ModeFromString(EDataType eDataType, String initialValue) {
                Cipher_Mode result = Cipher_Mode.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertCipher_ModeToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Padding createPaddingFromString(EDataType eDataType, String initialValue) {
                Padding result = Padding.get(initialValue);
                if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
                return result;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertPaddingToString(EDataType eDataType, Object instanceValue) {
                return instanceValue == null ? null : instanceValue.toString();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public InvalidKeyException createInvalidKeyExceptionFromString(EDataType eDataType, String initialValue) {
                return (InvalidKeyException)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertInvalidKeyExceptionToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public InvalidAlgorithmParameterException createInvalidAlgortihmParameterExceptionFromString(EDataType eDataType, String initialValue) {
                return (InvalidAlgorithmParameterException)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertInvalidAlgortihmParameterExceptionToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NoSuchAlgorithmException createNoSuchAlgorithmExceptionFromString(EDataType eDataType, String initialValue) {
                return (NoSuchAlgorithmException)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertNoSuchAlgorithmExceptionToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public NoSuchPaddingException createNoSuchPaddingExceptionFromString(EDataType eDataType, String initialValue) {
                return (NoSuchPaddingException)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertNoSuchPaddingExceptionToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public IllegalBlockSizeException createIllegalBlockSizeExceptionFromString(EDataType eDataType, String initialValue) {
                return (IllegalBlockSizeException)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertIllegalBlockSizeExceptionToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public BadPaddingException createBadPaddingExceptionFromString(EDataType eDataType, String initialValue) {
                return (BadPaddingException)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertBadPaddingExceptionToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Cipher createCipherFromString(EDataType eDataType, String initialValue) {
                return (Cipher)super.createFromString(eDataType, initialValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public String convertCipherToString(EDataType eDataType, Object instanceValue) {
                return super.convertToString(eDataType, instanceValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public SymmetricKeyCryptoPackage getSymmetricKeyCryptoPackage() {
                return (SymmetricKeyCryptoPackage)getEPackage();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @deprecated
         * @generated
         */
        @Deprecated
        public static SymmetricKeyCryptoPackage getPackage() {
                return SymmetricKeyCryptoPackage.eINSTANCE;
        }

} //SymmetricKeyCryptoFactoryImpl
