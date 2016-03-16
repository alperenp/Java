/**
 */
package FileIntegrityTest;

import HashFunctions.HashFunctionsPackage;

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
 * @see FileIntegrityTest.FileIntegrityTestFactory
 * @model kind="package"
 * @generated
 */
public interface FileIntegrityTestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FileIntegrityTest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/FileIntegrityTest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FileIntegrityTest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileIntegrityTestPackage eINSTANCE = FileIntegrityTest.impl.FileIntegrityTestPackageImpl.init();

	/**
	 * The meta object id for the '{@link FileIntegrityTest.impl.FileIntegrityCheckerImpl <em>File Integrity Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileIntegrityTest.impl.FileIntegrityCheckerImpl
	 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getFileIntegrityChecker()
	 * @generated
	 */
	int FILE_INTEGRITY_CHECKER = 0;

	/**
	 * The number of structural features of the '<em>File Integrity Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER_FEATURE_COUNT = HashFunctionsPackage.CRYPTO_HASH_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___CALCULATE_HASH__BYTE = HashFunctionsPackage.CRYPTO_HASH___CALCULATE_HASH__BYTE;

	/**
	 * The operation id for the '<em>Calculate Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___CALCULATE_HASH__BYTE_MESSAGEDIGESTFOONAMES = HashFunctionsPackage.CRYPTO_HASH___CALCULATE_HASH__BYTE_MESSAGEDIGESTFOONAMES;

	/**
	 * The operation id for the '<em>Calculate HMAC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calculate HMAC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___CALCULATE_HMAC__BYTE_BYTE = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Integrated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Integrated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Integrated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES_BYTE = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Integrated</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_BYTE = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>File Integrity Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INTEGRITY_CHECKER_OPERATION_COUNT = HashFunctionsPackage.CRYPTO_HASH_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link FileIntegrityTest.CryptoHashFunctions <em>Crypto Hash Functions</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FileIntegrityTest.CryptoHashFunctions
	 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getCryptoHashFunctions()
	 * @generated
	 */
	int CRYPTO_HASH_FUNCTIONS = 1;

	/**
	 * The meta object id for the '<em>No Such Algorithm Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.NoSuchAlgorithmException
	 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getNoSuchAlgorithmException()
	 * @generated
	 */
	int NO_SUCH_ALGORITHM_EXCEPTION = 2;

	/**
	 * The meta object id for the '<em>Invalid Key Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.security.InvalidKeyException
	 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getInvalidKeyException()
	 * @generated
	 */
	int INVALID_KEY_EXCEPTION = 3;


	/**
	 * Returns the meta object for class '{@link FileIntegrityTest.FileIntegrityChecker <em>File Integrity Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Integrity Checker</em>'.
	 * @see FileIntegrityTest.FileIntegrityChecker
	 * @generated
	 */
	EClass getFileIntegrityChecker();

	/**
	 * Returns the meta object for the '{@link FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[]) <em>Is Integrated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integrated</em>' operation.
	 * @see FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[])
	 * @generated
	 */
	EOperation getFileIntegrityChecker__IsIntegrated__byte_byte();

	/**
	 * Returns the meta object for the '{@link FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[], HashFunctions.MessageDigestFooNames) <em>Is Integrated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integrated</em>' operation.
	 * @see FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[], HashFunctions.MessageDigestFooNames)
	 * @generated
	 */
	EOperation getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames();

	/**
	 * Returns the meta object for the '{@link FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[], HashFunctions.MessageDigestFooNames, byte[]) <em>Is Integrated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integrated</em>' operation.
	 * @see FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[], HashFunctions.MessageDigestFooNames, byte[])
	 * @generated
	 */
	EOperation getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames_byte();

	/**
	 * Returns the meta object for the '{@link FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[], byte[]) <em>Is Integrated</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integrated</em>' operation.
	 * @see FileIntegrityTest.FileIntegrityChecker#IsIntegrated(byte[], byte[], byte[])
	 * @generated
	 */
	EOperation getFileIntegrityChecker__IsIntegrated__byte_byte_byte();

	/**
	 * Returns the meta object for enum '{@link FileIntegrityTest.CryptoHashFunctions <em>Crypto Hash Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Crypto Hash Functions</em>'.
	 * @see FileIntegrityTest.CryptoHashFunctions
	 * @generated
	 */
	EEnum getCryptoHashFunctions();

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
	FileIntegrityTestFactory getFileIntegrityTestFactory();

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
		 * The meta object literal for the '{@link FileIntegrityTest.impl.FileIntegrityCheckerImpl <em>File Integrity Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileIntegrityTest.impl.FileIntegrityCheckerImpl
		 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getFileIntegrityChecker()
		 * @generated
		 */
		EClass FILE_INTEGRITY_CHECKER = eINSTANCE.getFileIntegrityChecker();

		/**
		 * The meta object literal for the '<em><b>Is Integrated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE = eINSTANCE.getFileIntegrityChecker__IsIntegrated__byte_byte();

		/**
		 * The meta object literal for the '<em><b>Is Integrated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES = eINSTANCE.getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames();

		/**
		 * The meta object literal for the '<em><b>Is Integrated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES_BYTE = eINSTANCE.getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames_byte();

		/**
		 * The meta object literal for the '<em><b>Is Integrated</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_BYTE = eINSTANCE.getFileIntegrityChecker__IsIntegrated__byte_byte_byte();

		/**
		 * The meta object literal for the '{@link FileIntegrityTest.CryptoHashFunctions <em>Crypto Hash Functions</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FileIntegrityTest.CryptoHashFunctions
		 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getCryptoHashFunctions()
		 * @generated
		 */
		EEnum CRYPTO_HASH_FUNCTIONS = eINSTANCE.getCryptoHashFunctions();

		/**
		 * The meta object literal for the '<em>No Such Algorithm Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.NoSuchAlgorithmException
		 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getNoSuchAlgorithmException()
		 * @generated
		 */
		EDataType NO_SUCH_ALGORITHM_EXCEPTION = eINSTANCE.getNoSuchAlgorithmException();

		/**
		 * The meta object literal for the '<em>Invalid Key Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.security.InvalidKeyException
		 * @see FileIntegrityTest.impl.FileIntegrityTestPackageImpl#getInvalidKeyException()
		 * @generated
		 */
		EDataType INVALID_KEY_EXCEPTION = eINSTANCE.getInvalidKeyException();

	}

} //FileIntegrityTestPackage
