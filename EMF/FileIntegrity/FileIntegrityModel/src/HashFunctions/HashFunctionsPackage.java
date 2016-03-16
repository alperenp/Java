/**
 */
package HashFunctions;

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
 * @see HashFunctions.HashFunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface HashFunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "HashFunctions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/HashFunctions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "HashFunctions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HashFunctionsPackage eINSTANCE = HashFunctions.impl.HashFunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link HashFunctions.impl.CryptoHashImpl <em>Crypto Hash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HashFunctions.impl.CryptoHashImpl
	 * @see HashFunctions.impl.HashFunctionsPackageImpl#getCryptoHash()
	 * @generated
	 */
	int CRYPTO_HASH = 0;

	/**
	 * The number of structural features of the '<em>Crypto Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_HASH_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_HASH___CALCULATE_HASH__BYTE = 0;

	/**
	 * The operation id for the '<em>Calculate Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_HASH___CALCULATE_HASH__BYTE_MESSAGEDIGESTFOONAMES = 1;

	/**
	 * The number of operations of the '<em>Crypto Hash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_HASH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link HashFunctions.impl.HMACImpl <em>HMAC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HashFunctions.impl.HMACImpl
	 * @see HashFunctions.impl.HashFunctionsPackageImpl#getHMAC()
	 * @generated
	 */
	int HMAC = 1;

	/**
	 * The number of structural features of the '<em>HMAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate HMAC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE = 0;

	/**
	 * The operation id for the '<em>Calculate HMAC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC___CALCULATE_HMAC__BYTE_BYTE = 1;

	/**
	 * The number of operations of the '<em>HMAC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HMAC_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link HashFunctions.MessageDigestFooNames <em>Message Digest Foo Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see HashFunctions.MessageDigestFooNames
	 * @see HashFunctions.impl.HashFunctionsPackageImpl#getMessageDigestFooNames()
	 * @generated
	 */
	int MESSAGE_DIGEST_FOO_NAMES = 2;

	/**
	 * The meta object id for the '<em>No Such Algorithm Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.NoSuchAlgorithmException
	 * @see HashFunctions.impl.HashFunctionsPackageImpl#getNoSuchAlgorithmException()
	 * @generated
	 */
	int NO_SUCH_ALGORITHM_EXCEPTION = 3;

	/**
	 * The meta object id for the '<em>Invalid Key Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.InvalidKeyException
	 * @see HashFunctions.impl.HashFunctionsPackageImpl#getInvalidKeyException()
	 * @generated
	 */
	int INVALID_KEY_EXCEPTION = 4;


	/**
	 * Returns the meta object for class '{@link HashFunctions.CryptoHash <em>Crypto Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Hash</em>'.
	 * @see HashFunctions.CryptoHash
	 * @generated
	 */
	EClass getCryptoHash();

	/**
	 * Returns the meta object for the '{@link HashFunctions.CryptoHash#CalculateHash(byte[]) <em>Calculate Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Hash</em>' operation.
	 * @see HashFunctions.CryptoHash#CalculateHash(byte[])
	 * @generated
	 */
	EOperation getCryptoHash__CalculateHash__byte();

	/**
	 * Returns the meta object for the '{@link HashFunctions.CryptoHash#CalculateHash(byte[], HashFunctions.MessageDigestFooNames) <em>Calculate Hash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Hash</em>' operation.
	 * @see HashFunctions.CryptoHash#CalculateHash(byte[], HashFunctions.MessageDigestFooNames)
	 * @generated
	 */
	EOperation getCryptoHash__CalculateHash__byte_MessageDigestFooNames();

	/**
	 * Returns the meta object for class '{@link HashFunctions.HMAC <em>HMAC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HMAC</em>'.
	 * @see HashFunctions.HMAC
	 * @generated
	 */
	EClass getHMAC();

	/**
	 * Returns the meta object for the '{@link HashFunctions.HMAC#CalculateHMAC(byte[], HashFunctions.MessageDigestFooNames, byte[]) <em>Calculate HMAC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate HMAC</em>' operation.
	 * @see HashFunctions.HMAC#CalculateHMAC(byte[], HashFunctions.MessageDigestFooNames, byte[])
	 * @generated
	 */
	EOperation getHMAC__CalculateHMAC__byte_MessageDigestFooNames_byte();

	/**
	 * Returns the meta object for the '{@link HashFunctions.HMAC#CalculateHMAC(byte[], byte[]) <em>Calculate HMAC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate HMAC</em>' operation.
	 * @see HashFunctions.HMAC#CalculateHMAC(byte[], byte[])
	 * @generated
	 */
	EOperation getHMAC__CalculateHMAC__byte_byte();

	/**
	 * Returns the meta object for enum '{@link HashFunctions.MessageDigestFooNames <em>Message Digest Foo Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message Digest Foo Names</em>'.
	 * @see HashFunctions.MessageDigestFooNames
	 * @generated
	 */
	EEnum getMessageDigestFooNames();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HashFunctionsFactory getHashFunctionsFactory();

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
		 * The meta object literal for the '{@link HashFunctions.impl.CryptoHashImpl <em>Crypto Hash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HashFunctions.impl.CryptoHashImpl
		 * @see HashFunctions.impl.HashFunctionsPackageImpl#getCryptoHash()
		 * @generated
		 */
		EClass CRYPTO_HASH = eINSTANCE.getCryptoHash();

		/**
		 * The meta object literal for the '<em><b>Calculate Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRYPTO_HASH___CALCULATE_HASH__BYTE = eINSTANCE.getCryptoHash__CalculateHash__byte();

		/**
		 * The meta object literal for the '<em><b>Calculate Hash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRYPTO_HASH___CALCULATE_HASH__BYTE_MESSAGEDIGESTFOONAMES = eINSTANCE.getCryptoHash__CalculateHash__byte_MessageDigestFooNames();

		/**
		 * The meta object literal for the '{@link HashFunctions.impl.HMACImpl <em>HMAC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HashFunctions.impl.HMACImpl
		 * @see HashFunctions.impl.HashFunctionsPackageImpl#getHMAC()
		 * @generated
		 */
		EClass HMAC = eINSTANCE.getHMAC();

		/**
		 * The meta object literal for the '<em><b>Calculate HMAC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMAC___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE = eINSTANCE.getHMAC__CalculateHMAC__byte_MessageDigestFooNames_byte();

		/**
		 * The meta object literal for the '<em><b>Calculate HMAC</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HMAC___CALCULATE_HMAC__BYTE_BYTE = eINSTANCE.getHMAC__CalculateHMAC__byte_byte();

		/**
		 * The meta object literal for the '{@link HashFunctions.MessageDigestFooNames <em>Message Digest Foo Names</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see HashFunctions.MessageDigestFooNames
		 * @see HashFunctions.impl.HashFunctionsPackageImpl#getMessageDigestFooNames()
		 * @generated
		 */
		EEnum MESSAGE_DIGEST_FOO_NAMES = eINSTANCE.getMessageDigestFooNames();

		/**
		 * The meta object literal for the '<em>No Such Algorithm Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.NoSuchAlgorithmException
		 * @see HashFunctions.impl.HashFunctionsPackageImpl#getNoSuchAlgorithmException()
		 * @generated
		 */
		EDataType NO_SUCH_ALGORITHM_EXCEPTION = eINSTANCE.getNoSuchAlgorithmException();

		/**
		 * The meta object literal for the '<em>Invalid Key Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.InvalidKeyException
		 * @see HashFunctions.impl.HashFunctionsPackageImpl#getInvalidKeyException()
		 * @generated
		 */
		EDataType INVALID_KEY_EXCEPTION = eINSTANCE.getInvalidKeyException();

	}

} //HashFunctionsPackage
