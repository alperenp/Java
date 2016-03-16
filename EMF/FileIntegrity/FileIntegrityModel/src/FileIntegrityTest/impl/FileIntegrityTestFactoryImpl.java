/**
 */
package FileIntegrityTest.impl;

import FileIntegrityTest.*;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

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
public class FileIntegrityTestFactoryImpl extends EFactoryImpl implements FileIntegrityTestFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileIntegrityTestFactory init() {
		try {
			FileIntegrityTestFactory theFileIntegrityTestFactory = (FileIntegrityTestFactory)EPackage.Registry.INSTANCE.getEFactory(FileIntegrityTestPackage.eNS_URI);
			if (theFileIntegrityTestFactory != null) {
				return theFileIntegrityTestFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FileIntegrityTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileIntegrityTestFactoryImpl() {
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
			case FileIntegrityTestPackage.FILE_INTEGRITY_CHECKER: return createFileIntegrityChecker();
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
			case FileIntegrityTestPackage.CRYPTO_HASH_FUNCTIONS:
				return createCryptoHashFunctionsFromString(eDataType, initialValue);
			case FileIntegrityTestPackage.NO_SUCH_ALGORITHM_EXCEPTION:
				return createNoSuchAlgorithmExceptionFromString(eDataType, initialValue);
			case FileIntegrityTestPackage.INVALID_KEY_EXCEPTION:
				return createInvalidKeyExceptionFromString(eDataType, initialValue);
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
			case FileIntegrityTestPackage.CRYPTO_HASH_FUNCTIONS:
				return convertCryptoHashFunctionsToString(eDataType, instanceValue);
			case FileIntegrityTestPackage.NO_SUCH_ALGORITHM_EXCEPTION:
				return convertNoSuchAlgorithmExceptionToString(eDataType, instanceValue);
			case FileIntegrityTestPackage.INVALID_KEY_EXCEPTION:
				return convertInvalidKeyExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileIntegrityChecker createFileIntegrityChecker() {
		FileIntegrityCheckerImpl fileIntegrityChecker = new FileIntegrityCheckerImpl();
		return fileIntegrityChecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoHashFunctions createCryptoHashFunctionsFromString(EDataType eDataType, String initialValue) {
		CryptoHashFunctions result = CryptoHashFunctions.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoHashFunctionsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public FileIntegrityTestPackage getFileIntegrityTestPackage() {
		return (FileIntegrityTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FileIntegrityTestPackage getPackage() {
		return FileIntegrityTestPackage.eINSTANCE;
	}

} //FileIntegrityTestFactoryImpl
