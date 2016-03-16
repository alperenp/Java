/**
 */
package FileIntegrityTest.impl;

import FileIntegrityTest.FileIntegrityChecker;
import FileIntegrityTest.FileIntegrityTestPackage;

import HashFunctions.HMAC;
import HashFunctions.HashFunctionsPackage;
import HashFunctions.MessageDigestFooNames;

import HashFunctions.impl.CryptoHashImpl;

import java.lang.reflect.InvocationTargetException;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Integrity Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FileIntegrityCheckerImpl extends CryptoHashImpl implements FileIntegrityChecker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileIntegrityCheckerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FileIntegrityTestPackage.Literals.FILE_INTEGRITY_CHECKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsIntegrated(final byte[] fileBytes, final byte[] integrityCode) throws NoSuchAlgorithmException {
		return IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.SHA256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsIntegrated(final byte[] fileBytes, final byte[] integrityCode, final MessageDigestFooNames IntegrityFunction) throws NoSuchAlgorithmException {
		byte[] digest = CalculateHash(fileBytes, IntegrityFunction);
		//check if digest of file and integrity code matches
		if(java.util.Arrays.equals(digest,integrityCode)) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsIntegrated(final byte[] fileBytes, final byte[] integrityCode, final MessageDigestFooNames IntegrityFunction, final byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
		byte[] digest = CalculateHMAC(fileBytes, IntegrityFunction, key);
		//check if digest of file and integrity code matches
		if(java.util.Arrays.equals(digest,integrityCode)) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IsIntegrated(final byte[] fileBytes, final byte[] integrityCode, final byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
		return IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.SHA256, key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] CalculateHMAC(final byte[] inputBytes, final MessageDigestFooNames selectedFunction, final byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
		SecretKeySpec keySpec = new SecretKeySpec(key, "Hmac" + selectedFunction.getName());
		Mac mac = Mac.getInstance(keySpec.getAlgorithm());
		mac.init(keySpec);
		byte[] hashresult = mac.doFinal(inputBytes);
		return hashresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] CalculateHMAC(final byte[] inputBytes, final byte[] key) throws NoSuchAlgorithmException, InvalidKeyException {
		return CalculateHMAC(inputBytes, MessageDigestFooNames.SHA256, key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == HMAC.class) {
			switch (baseOperationID) {
				case HashFunctionsPackage.HMAC___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE: return FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE;
				case HashFunctionsPackage.HMAC___CALCULATE_HMAC__BYTE_BYTE: return FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___CALCULATE_HMAC__BYTE_BYTE;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE:
				try {
					return IsIntegrated((byte[])arguments.get(0), (byte[])arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES:
				try {
					return IsIntegrated((byte[])arguments.get(0), (byte[])arguments.get(1), (MessageDigestFooNames) arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES_BYTE:
				try {
					return IsIntegrated((byte[])arguments.get(0), (byte[])arguments.get(1), (MessageDigestFooNames) arguments.get(2), (byte[])arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_BYTE:
				try {
					return IsIntegrated((byte[])arguments.get(0), (byte[])arguments.get(1), (byte[])arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE:
				try {
					return CalculateHMAC((byte[])arguments.get(0), (MessageDigestFooNames) arguments.get(1), (byte[])arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER___CALCULATE_HMAC__BYTE_BYTE:
				try {
					return CalculateHMAC((byte[])arguments.get(0), (byte[])arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //FileIntegrityCheckerImpl
