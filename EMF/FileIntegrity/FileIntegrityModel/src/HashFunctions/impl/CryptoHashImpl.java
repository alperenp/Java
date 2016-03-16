/**
 */
package HashFunctions.impl;

import HashFunctions.CryptoHash;
import HashFunctions.HashFunctionsPackage;
import HashFunctions.MessageDigestFooNames;

import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Hash</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CryptoHashImpl extends MinimalEObjectImpl.Container implements CryptoHash {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoHashImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HashFunctionsPackage.Literals.CRYPTO_HASH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] CalculateHash(final byte[] inputBytes) throws NoSuchAlgorithmException {
		return CalculateHash(inputBytes, MessageDigestFooNames.SHA256);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] CalculateHash(final byte[] inputBytes, final MessageDigestFooNames selectedFunction) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(selectedFunction.getLiteral());
		md.update(inputBytes);
		byte[] hashresult = md.digest();
		return hashresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HashFunctionsPackage.CRYPTO_HASH___CALCULATE_HASH__BYTE:
				try {
					return CalculateHash((byte[])arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HashFunctionsPackage.CRYPTO_HASH___CALCULATE_HASH__BYTE_MESSAGEDIGESTFOONAMES:
				try {
					return CalculateHash((byte[])arguments.get(0), (MessageDigestFooNames) arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //CryptoHashImpl
