/**
 */
package HashFunctions;

import java.security.NoSuchAlgorithmException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crypto Hash</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see HashFunctions.HashFunctionsPackage#getCryptoHash()
 * @model
 * @generated
 */
public interface CryptoHash extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="HashFunctions.NoSuchAlgorithmException"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return CalculateHash(inputBytes, MessageDigestFooNames.SHA256);' document='Default Hash function is set as SHA256'"
	 * @generated
	 */
	byte[] CalculateHash(byte[] inputBytes) throws NoSuchAlgorithmException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="HashFunctions.NoSuchAlgorithmException" selectedFunctionDataType="HashFunctions.MessageDigestFooNames"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='MessageDigest md = MessageDigest.getInstance(selectedFunction.getLiteral());\r\nmd.update(inputBytes);\r\nbyte[] hashresult = md.digest();\r\nreturn hashresult;'"
	 * @generated
	 */
	byte[] CalculateHash(byte[] inputBytes, MessageDigestFooNames selectedFunction) throws NoSuchAlgorithmException;

} // CryptoHash
