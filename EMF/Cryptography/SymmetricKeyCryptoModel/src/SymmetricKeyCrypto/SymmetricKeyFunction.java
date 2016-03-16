/**
 */
package SymmetricKeyCrypto;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Key Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SymmetricKeyCrypto.SymmetricKeyFunction#getCipher <em>Cipher</em>}</li>
 * </ul>
 *
 * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage#getSymmetricKeyFunction()
 * @model
 * @generated
 */
public interface SymmetricKeyFunction extends EObject {
        /**
         * Returns the value of the '<em><b>Cipher</b></em>' attribute.
         * <!-- begin-user-doc -->
         * <p>
         * If the meaning of the '<em>Cipher</em>' attribute isn't clear,
         * there really should be more of a description here...
         * </p>
         * <!-- end-user-doc -->
         * @return the value of the '<em>Cipher</em>' attribute.
         * @see #setCipher(Cipher)
         * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage#getSymmetricKeyFunction_Cipher()
         * @model dataType="SymmetricKeyCrypto.Cipher"
         * @generated
         */
        Cipher getCipher();

        /**
         * Sets the value of the '{@link SymmetricKeyCrypto.SymmetricKeyFunction#getCipher <em>Cipher</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @param value the new value of the '<em>Cipher</em>' attribute.
         * @see #getCipher()
         * @generated
         */
        void setCipher(Cipher value);

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model exceptions="SymmetricKeyCrypto.InvalidKeyException SymmetricKeyCrypto.InvalidAlgortihmParameterException SymmetricKeyCrypto.NoSuchAlgorithmException SymmetricKeyCrypto.NoSuchPaddingException SymmetricKeyCrypto.IllegalBlockSizeException SymmetricKeyCrypto.BadPaddingException"
         *        annotation="http://www.eclipse.org/emf/2002/GenModel body='IvParameterSpec ivspec = new IvParameterSpec(IV);\r\nString algorithm = cipher.getAlgorithm();\r\nalgorithm = algorithm.substring(0, algorithm.indexOf(\"/\"));\r\nSecretKeySpec skeySpec = new SecretKeySpec(key, algorithm);\r\n\r\n// initialize the cipher for encrypt mode\r\ncipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivspec);\r\n\r\n// encrypt the message\r\nbyte[] encrypted = cipher.doFinal(plaintext);\r\n        \r\nreturn encrypted;'"
         * @generated
         */
        byte[] encrypt(byte[] plaintext, byte[] key, byte[] IV) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model dataType="SymmetricKeyCrypto.Cipher" exceptions="SymmetricKeyCrypto.NoSuchAlgorithmException SymmetricKeyCrypto.NoSuchPaddingException" algorithmDataType="SymmetricKeyCrypto.Algorithm"
         *        annotation="http://www.eclipse.org/emf/2002/GenModel body='//Select symmetric key algorithm with block cipher mode and padding\r\ncipher = Cipher.getInstance(algorithm.getLiteral() + \"/\" + cipher_mode.getLiteral() + \"/\" + padding.getLiteral());\r\n\r\nreturn cipher;'"
         * @generated
         */
        Cipher generateCipherObject(Algorithm algorithm, Cipher_Mode cipher_mode, Padding padding) throws NoSuchAlgorithmException, NoSuchPaddingException;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @model exceptions="SymmetricKeyCrypto.InvalidKeyException SymmetricKeyCrypto.InvalidAlgortihmParameterException SymmetricKeyCrypto.NoSuchAlgorithmException SymmetricKeyCrypto.NoSuchPaddingException SymmetricKeyCrypto.IllegalBlockSizeException SymmetricKeyCrypto.BadPaddingException"
         *        annotation="http://www.eclipse.org/emf/2002/GenModel body='IvParameterSpec ivspec = new IvParameterSpec(IV);\r\nString algorithm = cipher.getAlgorithm();\r\nalgorithm = algorithm.substring(0, algorithm.indexOf(\"/\"));\r\nSecretKeySpec skeySpec = new SecretKeySpec(key, algorithm);\r\n\r\n// initialize the cipher for decryptmode\r\ncipher.init(Cipher.DECRYPT_MODE, skeySpec, ivspec);\r\n\r\n// decrypt the message\r\nbyte[] decrypted = cipher.doFinal(ciphertext);\r\n        \r\nreturn decrypted;'"
         * @generated
         */
        byte[] decrypt(byte[] ciphertext, byte[] key, byte[] IV) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException;

} // SymmetricKeyFunction
