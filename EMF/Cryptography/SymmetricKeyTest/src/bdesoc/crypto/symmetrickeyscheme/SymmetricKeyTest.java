package bdesoc.crypto.symmetrickeyscheme;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import SymmetricKeyCrypto.Algorithm;
import SymmetricKeyCrypto.Cipher_Mode;
import SymmetricKeyCrypto.Padding;
import SymmetricKeyCrypto.SymmetricKeyCryptoFactory;
import SymmetricKeyCrypto.SymmetricKeyFunction;

/**
 * Purpose: 		This module is designed for showing how to use symmetric key crypto library 
 * Usage: 			Function demo for future use
 * Input, output: 	plaintext, ciphertext or visa versa
 * Author: 			alperenp
 * e-mail: 			alperen.pulur@semper-tech.com
 * Date: 			26.01.2016
 * Any known bugs: 	N/A  
 * References: 		bdesoc.crypto.SymmetricKeyCrypto
*/
public class SymmetricKeyTest
{	
	public static void main(String[] args)
	{
		// Initialization of crypto class
		SymmetricKeyCryptoFactory symmetrickeyfac = SymmetricKeyCryptoFactory.eINSTANCE;
		SymmetricKeyFunction symmetricfoo = symmetrickeyfac.createSymmetricKeyFunction();
		
		
		String plaintext = "This is my test message.";
		
		//128-bit symmetric key
		String key = "thisiskeystring.";
		
		//128-bit initialization vector
		String IV = "thisismyIvector.";
		
		// Select symmetric key scheme, block cipher and padding
		try {
			// AES with CBC mode with pkcs5-padding
			// uses 128-bit key
			symmetricfoo.generateCipherObject(Algorithm.AES, Cipher_Mode.CBC, Padding.PKCS5_PADDING);
			
			//encrypt plaintext
			byte[] cipherbytes = symmetricfoo.encrypt(plaintext.getBytes(), key.getBytes(), IV.getBytes());			
			
			
			//decrypt ciphertext
			byte[] decryptedbytes = symmetricfoo.decrypt(cipherbytes, key.getBytes(), IV.getBytes());
			
			
			System.out.println(plaintext);
			System.out.println(new String(cipherbytes));
			System.out.println(new String(decryptedbytes));
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
