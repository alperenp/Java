/**
 */
package HashFunctions;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HMAC</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HashFunctions.HashFunctionsPackage#getHMAC()
 * @model
 * @generated
 */
public interface HMAC extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="HashFunctions.NoSuchAlgorithmException HashFunctions.InvalidKeyException" selectedFunctionDataType="HashFunctions.MessageDigestFooNames"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='SecretKeySpec keySpec = new SecretKeySpec(key, \"Hmac\" + selectedFunction.getName());\r\nMac mac = Mac.getInstance(keySpec.getAlgorithm());\r\nmac.init(keySpec);\r\nbyte[] hashresult = mac.doFinal(inputBytes);\r\nreturn hashresult;' document='Default Hash function is set as SHA256'"
	 * @generated
	 */
	byte[] CalculateHMAC(byte[] inputBytes, MessageDigestFooNames selectedFunction, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="HashFunctions.NoSuchAlgorithmException HashFunctions.InvalidKeyException"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return CalculateHMAC(inputBytes, MessageDigestFooNames.SHA256, key);' EStringToStringMapEntry0=''"
	 * @generated
	 */
	byte[] CalculateHMAC(byte[] inputBytes, byte[] key) throws NoSuchAlgorithmException, InvalidKeyException;

} // HMAC
