/**
 */
package SymmetricKeyCrypto;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SymmetricKeyCrypto.SymmetricKeyCryptoFactory
 * @model kind="package"
 * @generated
 */
public interface SymmetricKeyCryptoPackage extends EPackage {
        /**
         * The package name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNAME = "SymmetricKeyCrypto";

        /**
         * The package namespace URI.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_URI = "http://www.example.org/SymmetricKeyCrypto";

        /**
         * The package namespace name.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        String eNS_PREFIX = "SymmetricKeyCrypto";

        /**
         * The singleton instance of the package.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        SymmetricKeyCryptoPackage eINSTANCE = SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl.init();

        /**
         * The meta object id for the '{@link SymmetricKeyCrypto.impl.SymmetricKeyFunctionImpl <em>Symmetric Key Function</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see SymmetricKeyCrypto.impl.SymmetricKeyFunctionImpl
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getSymmetricKeyFunction()
         * @generated
         */
        int SYMMETRIC_KEY_FUNCTION = 0;

        /**
         * The feature id for the '<em><b>Cipher</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYMMETRIC_KEY_FUNCTION__CIPHER = 0;

        /**
         * The number of structural features of the '<em>Symmetric Key Function</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYMMETRIC_KEY_FUNCTION_FEATURE_COUNT = 1;

        /**
         * The operation id for the '<em>Encrypt</em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYMMETRIC_KEY_FUNCTION___ENCRYPT__BYTE_BYTE_BYTE = 0;

        /**
         * The operation id for the '<em>Generate Cipher Object</em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYMMETRIC_KEY_FUNCTION___GENERATE_CIPHER_OBJECT__ALGORITHM_CIPHER_MODE_PADDING = 1;

        /**
         * The operation id for the '<em>Decrypt</em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYMMETRIC_KEY_FUNCTION___DECRYPT__BYTE_BYTE_BYTE = 2;

        /**
         * The number of operations of the '<em>Symmetric Key Function</em>' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         * @ordered
         */
        int SYMMETRIC_KEY_FUNCTION_OPERATION_COUNT = 3;

        /**
         * The meta object id for the '{@link SymmetricKeyCrypto.Algorithm <em>Algorithm</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see SymmetricKeyCrypto.Algorithm
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getAlgorithm()
         * @generated
         */
        int ALGORITHM = 1;

        /**
         * The meta object id for the '{@link SymmetricKeyCrypto.Cipher_Mode <em>Cipher Mode</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see SymmetricKeyCrypto.Cipher_Mode
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getCipher_Mode()
         * @generated
         */
        int CIPHER_MODE = 2;

        /**
         * The meta object id for the '{@link SymmetricKeyCrypto.Padding <em>Padding</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see SymmetricKeyCrypto.Padding
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getPadding()
         * @generated
         */
        int PADDING = 3;

        /**
         * The meta object id for the '<em>Invalid Key Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.security.InvalidKeyException
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getInvalidKeyException()
         * @generated
         */
        int INVALID_KEY_EXCEPTION = 4;

        /**
         * The meta object id for the '<em>Invalid Algortihm Parameter Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.security.InvalidAlgorithmParameterException
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getInvalidAlgortihmParameterException()
         * @generated
         */
        int INVALID_ALGORTIHM_PARAMETER_EXCEPTION = 5;

        /**
         * The meta object id for the '<em>No Such Algorithm Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.security.NoSuchAlgorithmException
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getNoSuchAlgorithmException()
         * @generated
         */
        int NO_SUCH_ALGORITHM_EXCEPTION = 6;

        /**
         * The meta object id for the '<em>No Such Padding Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.crypto.NoSuchPaddingException
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getNoSuchPaddingException()
         * @generated
         */
        int NO_SUCH_PADDING_EXCEPTION = 7;

        /**
         * The meta object id for the '<em>Illegal Block Size Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.crypto.IllegalBlockSizeException
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getIllegalBlockSizeException()
         * @generated
         */
        int ILLEGAL_BLOCK_SIZE_EXCEPTION = 8;

        /**
         * The meta object id for the '<em>Bad Padding Exception</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.crypto.BadPaddingException
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getBadPaddingException()
         * @generated
         */
        int BAD_PADDING_EXCEPTION = 9;

        /**
         * The meta object id for the '<em>Cipher</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see javax.crypto.Cipher
         * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getCipher()
         * @generated
         */
        int CIPHER = 10;


        /**
         * Returns the meta object for class '{@link SymmetricKeyCrypto.SymmetricKeyFunction <em>Symmetric Key Function</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for class '<em>Symmetric Key Function</em>'.
         * @see SymmetricKeyCrypto.SymmetricKeyFunction
         * @generated
         */
        EClass getSymmetricKeyFunction();

        /**
         * Returns the meta object for the attribute '{@link SymmetricKeyCrypto.SymmetricKeyFunction#getCipher <em>Cipher</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the attribute '<em>Cipher</em>'.
         * @see SymmetricKeyCrypto.SymmetricKeyFunction#getCipher()
         * @see #getSymmetricKeyFunction()
         * @generated
         */
        EAttribute getSymmetricKeyFunction_Cipher();

        /**
         * Returns the meta object for the '{@link SymmetricKeyCrypto.SymmetricKeyFunction#encrypt(byte[], byte[], byte[]) <em>Encrypt</em>}' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the '<em>Encrypt</em>' operation.
         * @see SymmetricKeyCrypto.SymmetricKeyFunction#encrypt(byte[], byte[], byte[])
         * @generated
         */
        EOperation getSymmetricKeyFunction__Encrypt__byte_byte_byte();

        /**
         * Returns the meta object for the '{@link SymmetricKeyCrypto.SymmetricKeyFunction#generateCipherObject(SymmetricKeyCrypto.Algorithm, SymmetricKeyCrypto.Cipher_Mode, SymmetricKeyCrypto.Padding) <em>Generate Cipher Object</em>}' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the '<em>Generate Cipher Object</em>' operation.
         * @see SymmetricKeyCrypto.SymmetricKeyFunction#generateCipherObject(SymmetricKeyCrypto.Algorithm, SymmetricKeyCrypto.Cipher_Mode, SymmetricKeyCrypto.Padding)
         * @generated
         */
        EOperation getSymmetricKeyFunction__GenerateCipherObject__Algorithm_Cipher_Mode_Padding();

        /**
         * Returns the meta object for the '{@link SymmetricKeyCrypto.SymmetricKeyFunction#decrypt(byte[], byte[], byte[]) <em>Decrypt</em>}' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for the '<em>Decrypt</em>' operation.
         * @see SymmetricKeyCrypto.SymmetricKeyFunction#decrypt(byte[], byte[], byte[])
         * @generated
         */
        EOperation getSymmetricKeyFunction__Decrypt__byte_byte_byte();

        /**
         * Returns the meta object for enum '{@link SymmetricKeyCrypto.Algorithm <em>Algorithm</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Algorithm</em>'.
         * @see SymmetricKeyCrypto.Algorithm
         * @generated
         */
        EEnum getAlgorithm();

        /**
         * Returns the meta object for enum '{@link SymmetricKeyCrypto.Cipher_Mode <em>Cipher Mode</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Cipher Mode</em>'.
         * @see SymmetricKeyCrypto.Cipher_Mode
         * @generated
         */
        EEnum getCipher_Mode();

        /**
         * Returns the meta object for enum '{@link SymmetricKeyCrypto.Padding <em>Padding</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for enum '<em>Padding</em>'.
         * @see SymmetricKeyCrypto.Padding
         * @generated
         */
        EEnum getPadding();

        /**
         * Returns the meta object for data type '{@link java.security.InvalidKeyException <em>Invalid Key Exception</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Invalid Key Exception</em>'.
         * @see java.security.InvalidKeyException
         * @model instanceClass="java.security.InvalidKeyException"
         * @generated
         */
        EDataType getInvalidKeyException();

        /**
         * Returns the meta object for data type '{@link java.security.InvalidAlgorithmParameterException <em>Invalid Algortihm Parameter Exception</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Invalid Algortihm Parameter Exception</em>'.
         * @see java.security.InvalidAlgorithmParameterException
         * @model instanceClass="java.security.InvalidAlgorithmParameterException"
         * @generated
         */
        EDataType getInvalidAlgortihmParameterException();

        /**
         * Returns the meta object for data type '{@link java.security.NoSuchAlgorithmException <em>No Such Algorithm Exception</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>No Such Algorithm Exception</em>'.
         * @see java.security.NoSuchAlgorithmException
         * @model instanceClass="java.security.NoSuchAlgorithmException"
         * @generated
         */
        EDataType getNoSuchAlgorithmException();

        /**
         * Returns the meta object for data type '{@link javax.crypto.NoSuchPaddingException <em>No Such Padding Exception</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>No Such Padding Exception</em>'.
         * @see javax.crypto.NoSuchPaddingException
         * @model instanceClass="javax.crypto.NoSuchPaddingException"
         * @generated
         */
        EDataType getNoSuchPaddingException();

        /**
         * Returns the meta object for data type '{@link javax.crypto.IllegalBlockSizeException <em>Illegal Block Size Exception</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Illegal Block Size Exception</em>'.
         * @see javax.crypto.IllegalBlockSizeException
         * @model instanceClass="javax.crypto.IllegalBlockSizeException"
         * @generated
         */
        EDataType getIllegalBlockSizeException();

        /**
         * Returns the meta object for data type '{@link javax.crypto.BadPaddingException <em>Bad Padding Exception</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Bad Padding Exception</em>'.
         * @see javax.crypto.BadPaddingException
         * @model instanceClass="javax.crypto.BadPaddingException"
         * @generated
         */
        EDataType getBadPaddingException();

        /**
         * Returns the meta object for data type '{@link javax.crypto.Cipher <em>Cipher</em>}'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the meta object for data type '<em>Cipher</em>'.
         * @see javax.crypto.Cipher
         * @model instanceClass="javax.crypto.Cipher"
         * @generated
         */
        EDataType getCipher();

        /**
         * Returns the factory that creates the instances of the model.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the factory that creates the instances of the model.
         * @generated
         */
        SymmetricKeyCryptoFactory getSymmetricKeyCryptoFactory();

        /**
         * <!-- begin-user-doc -->
         * Defines literals for the meta objects that represent
         * <ul>
         *   <li>each class,</li>
         *   <li>each feature of each class,</li>
         *   <li>each operation of each class,</li>
         *   <li>each enum,</li>
         *   <li>and each data type</li>
         * </ul>
         * <!-- end-user-doc -->
         * @generated
         */
        interface Literals {
                /**
                 * The meta object literal for the '{@link SymmetricKeyCrypto.impl.SymmetricKeyFunctionImpl <em>Symmetric Key Function</em>}' class.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyFunctionImpl
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getSymmetricKeyFunction()
                 * @generated
                 */
                EClass SYMMETRIC_KEY_FUNCTION = eINSTANCE.getSymmetricKeyFunction();

                /**
                 * The meta object literal for the '<em><b>Cipher</b></em>' attribute feature.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EAttribute SYMMETRIC_KEY_FUNCTION__CIPHER = eINSTANCE.getSymmetricKeyFunction_Cipher();

                /**
                 * The meta object literal for the '<em><b>Encrypt</b></em>' operation.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EOperation SYMMETRIC_KEY_FUNCTION___ENCRYPT__BYTE_BYTE_BYTE = eINSTANCE.getSymmetricKeyFunction__Encrypt__byte_byte_byte();

                /**
                 * The meta object literal for the '<em><b>Generate Cipher Object</b></em>' operation.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EOperation SYMMETRIC_KEY_FUNCTION___GENERATE_CIPHER_OBJECT__ALGORITHM_CIPHER_MODE_PADDING = eINSTANCE.getSymmetricKeyFunction__GenerateCipherObject__Algorithm_Cipher_Mode_Padding();

                /**
                 * The meta object literal for the '<em><b>Decrypt</b></em>' operation.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @generated
                 */
                EOperation SYMMETRIC_KEY_FUNCTION___DECRYPT__BYTE_BYTE_BYTE = eINSTANCE.getSymmetricKeyFunction__Decrypt__byte_byte_byte();

                /**
                 * The meta object literal for the '{@link SymmetricKeyCrypto.Algorithm <em>Algorithm</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see SymmetricKeyCrypto.Algorithm
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getAlgorithm()
                 * @generated
                 */
                EEnum ALGORITHM = eINSTANCE.getAlgorithm();

                /**
                 * The meta object literal for the '{@link SymmetricKeyCrypto.Cipher_Mode <em>Cipher Mode</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see SymmetricKeyCrypto.Cipher_Mode
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getCipher_Mode()
                 * @generated
                 */
                EEnum CIPHER_MODE = eINSTANCE.getCipher_Mode();

                /**
                 * The meta object literal for the '{@link SymmetricKeyCrypto.Padding <em>Padding</em>}' enum.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see SymmetricKeyCrypto.Padding
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getPadding()
                 * @generated
                 */
                EEnum PADDING = eINSTANCE.getPadding();

                /**
                 * The meta object literal for the '<em>Invalid Key Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see java.security.InvalidKeyException
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getInvalidKeyException()
                 * @generated
                 */
                EDataType INVALID_KEY_EXCEPTION = eINSTANCE.getInvalidKeyException();

                /**
                 * The meta object literal for the '<em>Invalid Algortihm Parameter Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see java.security.InvalidAlgorithmParameterException
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getInvalidAlgortihmParameterException()
                 * @generated
                 */
                EDataType INVALID_ALGORTIHM_PARAMETER_EXCEPTION = eINSTANCE.getInvalidAlgortihmParameterException();

                /**
                 * The meta object literal for the '<em>No Such Algorithm Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see java.security.NoSuchAlgorithmException
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getNoSuchAlgorithmException()
                 * @generated
                 */
                EDataType NO_SUCH_ALGORITHM_EXCEPTION = eINSTANCE.getNoSuchAlgorithmException();

                /**
                 * The meta object literal for the '<em>No Such Padding Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.crypto.NoSuchPaddingException
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getNoSuchPaddingException()
                 * @generated
                 */
                EDataType NO_SUCH_PADDING_EXCEPTION = eINSTANCE.getNoSuchPaddingException();

                /**
                 * The meta object literal for the '<em>Illegal Block Size Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.crypto.IllegalBlockSizeException
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getIllegalBlockSizeException()
                 * @generated
                 */
                EDataType ILLEGAL_BLOCK_SIZE_EXCEPTION = eINSTANCE.getIllegalBlockSizeException();

                /**
                 * The meta object literal for the '<em>Bad Padding Exception</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.crypto.BadPaddingException
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getBadPaddingException()
                 * @generated
                 */
                EDataType BAD_PADDING_EXCEPTION = eINSTANCE.getBadPaddingException();

                /**
                 * The meta object literal for the '<em>Cipher</em>' data type.
                 * <!-- begin-user-doc -->
                 * <!-- end-user-doc -->
                 * @see javax.crypto.Cipher
                 * @see SymmetricKeyCrypto.impl.SymmetricKeyCryptoPackageImpl#getCipher()
                 * @generated
                 */
                EDataType CIPHER = eINSTANCE.getCipher();

        }

} //SymmetricKeyCryptoPackage
