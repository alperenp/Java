/**
 */
package HashFunctions.impl;

import HashFunctions.*;

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
public class HashFunctionsFactoryImpl extends EFactoryImpl implements HashFunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HashFunctionsFactory init() {
		try {
			HashFunctionsFactory theHashFunctionsFactory = (HashFunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(HashFunctionsPackage.eNS_URI);
			if (theHashFunctionsFactory != null) {
				return theHashFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HashFunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashFunctionsFactoryImpl() {
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
			case HashFunctionsPackage.CRYPTO_HASH: return createCryptoHash();
			case HashFunctionsPackage.HMAC: return createHMAC();
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
			case HashFunctionsPackage.MESSAGE_DIGEST_FOO_NAMES:
				return createMessageDigestFooNamesFromString(eDataType, initialValue);
			case HashFunctionsPackage.NO_SUCH_ALGORITHM_EXCEPTION:
				return createNoSuchAlgorithmExceptionFromString(eDataType, initialValue);
			case HashFunctionsPackage.INVALID_KEY_EXCEPTION:
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
			case HashFunctionsPackage.MESSAGE_DIGEST_FOO_NAMES:
				return convertMessageDigestFooNamesToString(eDataType, instanceValue);
			case HashFunctionsPackage.NO_SUCH_ALGORITHM_EXCEPTION:
				return convertNoSuchAlgorithmExceptionToString(eDataType, instanceValue);
			case HashFunctionsPackage.INVALID_KEY_EXCEPTION:
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
	public CryptoHash createCryptoHash() {
		CryptoHashImpl cryptoHash = new CryptoHashImpl();
		return cryptoHash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HMAC createHMAC() {
		HMACImpl hmac = new HMACImpl();
		return hmac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageDigestFooNames createMessageDigestFooNamesFromString(EDataType eDataType, String initialValue) {
		MessageDigestFooNames result = MessageDigestFooNames.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageDigestFooNamesToString(EDataType eDataType, Object instanceValue) {
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
	public HashFunctionsPackage getHashFunctionsPackage() {
		return (HashFunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HashFunctionsPackage getPackage() {
		return HashFunctionsPackage.eINSTANCE;
	}

} //HashFunctionsFactoryImpl
