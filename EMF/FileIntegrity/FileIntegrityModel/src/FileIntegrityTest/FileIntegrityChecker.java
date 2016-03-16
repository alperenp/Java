/**
 */
package FileIntegrityTest;

import HashFunctions.CryptoHash;
import HashFunctions.HMAC;
import HashFunctions.MessageDigestFooNames;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Integrity Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see FileIntegrityTest.FileIntegrityTestPackage#getFileIntegrityChecker()
 * @model
 * @generated
 */
public interface FileIntegrityChecker extends CryptoHash, HMAC {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checks given files bytes yield same result in integrityCode under default cryptographic hash operation
	 * Default option is SHA256
	 * <!-- end-model-doc -->
	 * @model exceptions="FileIntegrityTest.NoSuchAlgorithmException"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.SHA256);'"
	 * @generated
	 */
	boolean IsIntegrated(byte[] fileBytes, byte[] integrityCode) throws NoSuchAlgorithmException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checks given files bytes yield same result in integrityCode under cryptographic hash operation
	 * In addition user can select integrity function. Current options:
	 *  - MD5
	 *  - SHA1
	 *  - SHA256
	 *  - SHA384
	 *  - SHA512
	 * <!-- end-model-doc -->
	 * @model exceptions="FileIntegrityTest.NoSuchAlgorithmException" IntegrityFunctionDataType="HashFunctions.MessageDigestFooNames"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='byte[] digest = CalculateHash(fileBytes, IntegrityFunction);\r\n//check if digest of file and integrity code matches\r\nif(java.util.Arrays.equals(digest,integrityCode))\r\n{\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean IsIntegrated(byte[] fileBytes, byte[] integrityCode, MessageDigestFooNames IntegrityFunction) throws NoSuchAlgorithmException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checks given files bytes yield same result in integrityCode under cryptographic hash operation
	 * In addition user can select integrity function. Current options:
	 *  - MD5
	 *  - SHA1
	 *  - SHA256
	 *  - SHA384
	 *  - SHA512
	 * <!-- end-model-doc -->
	 * @model exceptions="FileIntegrityTest.NoSuchAlgorithmException FileIntegrityTest.InvalidKeyException" IntegrityFunctionDataType="HashFunctions.MessageDigestFooNames"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='byte[] digest = CalculateHMAC(fileBytes, IntegrityFunction, key);\r\n//check if digest of file and integrity code matches\r\nif(java.util.Arrays.equals(digest,integrityCode))\r\n{\r\n\treturn true;\r\n}\r\nreturn false;'"
	 * @generated
	 */
	boolean IsIntegrated(byte[] fileBytes, byte[] integrityCode, MessageDigestFooNames IntegrityFunction, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Checks given files bytes yield same result in integrityCode under default cryptographic hash operation
	 * Default option is SHA256
	 * <!-- end-model-doc -->
	 * @model exceptions="FileIntegrityTest.NoSuchAlgorithmException FileIntegrityTest.InvalidKeyException"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.SHA256, key);'"
	 * @generated
	 */
	boolean IsIntegrated(byte[] fileBytes, byte[] integrityCode, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException;

} // FileIntegrityChecker
