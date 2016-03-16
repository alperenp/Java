/**
 */
package HashFunctions.impl;

import HashFunctions.HMAC;
import HashFunctions.HashFunctionsPackage;
import HashFunctions.MessageDigestFooNames;

import java.lang.reflect.InvocationTargetException;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HMAC</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HMACImpl extends MinimalEObjectImpl.Container implements HMAC {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HMACImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HashFunctionsPackage.Literals.HMAC;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HashFunctionsPackage.HMAC___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE:
				try {
					return CalculateHMAC((byte[])arguments.get(0), (MessageDigestFooNames) arguments.get(1), (byte[])arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HashFunctionsPackage.HMAC___CALCULATE_HMAC__BYTE_BYTE:
				try {
					return CalculateHMAC((byte[])arguments.get(0), (byte[])arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //HMACImpl
