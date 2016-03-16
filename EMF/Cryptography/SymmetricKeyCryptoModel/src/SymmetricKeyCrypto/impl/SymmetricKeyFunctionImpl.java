/**
 */
package SymmetricKeyCrypto.impl;

import SymmetricKeyCrypto.Algorithm;
import SymmetricKeyCrypto.Cipher_Mode;
import SymmetricKeyCrypto.Padding;
import SymmetricKeyCrypto.SymmetricKeyCryptoPackage;
import SymmetricKeyCrypto.SymmetricKeyFunction;

import java.lang.reflect.InvocationTargetException;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symmetric Key Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SymmetricKeyCrypto.impl.SymmetricKeyFunctionImpl#getCipher <em>Cipher</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymmetricKeyFunctionImpl extends MinimalEObjectImpl.Container implements SymmetricKeyFunction {
        /**
         * The default value of the '{@link #getCipher() <em>Cipher</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCipher()
         * @generated
         * @ordered
         */
        protected static final Cipher CIPHER_EDEFAULT = null;

        /**
         * The cached value of the '{@link #getCipher() <em>Cipher</em>}' attribute.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see #getCipher()
         * @generated
         * @ordered
         */
        protected Cipher cipher = CIPHER_EDEFAULT;

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        protected SymmetricKeyFunctionImpl() {
                super();
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        protected EClass eStaticClass() {
                return SymmetricKeyCryptoPackage.Literals.SYMMETRIC_KEY_FUNCTION;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Cipher getCipher() {
                return cipher;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public void setCipher(Cipher newCipher) {
                Cipher oldCipher = cipher;
                cipher = newCipher;
                if (eNotificationRequired())
                        eNotify(new ENotificationImpl(this, Notification.SET, SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION__CIPHER, oldCipher, cipher));
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public byte[] encrypt(final byte[] plaintext, final byte[] key, final byte[] IV) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
                IvParameterSpec ivspec = new IvParameterSpec(IV);
                String algorithm = cipher.getAlgorithm();
                algorithm = algorithm.substring(0, algorithm.indexOf("/"));
                SecretKeySpec skeySpec = new SecretKeySpec(key, algorithm);
                
                // initialize the cipher for encrypt mode
                cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivspec);
                
                // encrypt the message
                byte[] encrypted = cipher.doFinal(plaintext);
                        
                return encrypted;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public Cipher generateCipherObject(final Algorithm algorithm, final Cipher_Mode cipher_mode, final Padding padding) throws NoSuchAlgorithmException, NoSuchPaddingException {
                //Select symmetric key algorithm with block cipher mode and padding
                cipher = Cipher.getInstance(algorithm.getLiteral() + "/" + cipher_mode.getLiteral() + "/" + padding.getLiteral());
                
                return cipher;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        public byte[] decrypt(final byte[] ciphertext, final byte[] key, final byte[] IV) throws InvalidKeyException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
                IvParameterSpec ivspec = new IvParameterSpec(IV);
                String algorithm = cipher.getAlgorithm();
                algorithm = algorithm.substring(0, algorithm.indexOf("/"));
                SecretKeySpec skeySpec = new SecretKeySpec(key, algorithm);
                
                // initialize the cipher for decryptmode
                cipher.init(Cipher.DECRYPT_MODE, skeySpec, ivspec);
                
                // decrypt the message
                byte[] decrypted = cipher.doFinal(ciphertext);
                        
                return decrypted;
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eGet(int featureID, boolean resolve, boolean coreType) {
                switch (featureID) {
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION__CIPHER:
                                return getCipher();
                }
                return super.eGet(featureID, resolve, coreType);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eSet(int featureID, Object newValue) {
                switch (featureID) {
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION__CIPHER:
                                setCipher((Cipher)newValue);
                                return;
                }
                super.eSet(featureID, newValue);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public void eUnset(int featureID) {
                switch (featureID) {
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION__CIPHER:
                                setCipher(CIPHER_EDEFAULT);
                                return;
                }
                super.eUnset(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public boolean eIsSet(int featureID) {
                switch (featureID) {
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION__CIPHER:
                                return CIPHER_EDEFAULT == null ? cipher != null : !CIPHER_EDEFAULT.equals(cipher);
                }
                return super.eIsSet(featureID);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
                switch (operationID) {
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION___ENCRYPT__BYTE_BYTE_BYTE:
                                try {
                                        return encrypt((byte[])arguments.get(0), (byte[])arguments.get(1), (byte[])arguments.get(2));
                                }
                                catch (Throwable throwable) {
                                        throw new InvocationTargetException(throwable);
                                }
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION___GENERATE_CIPHER_OBJECT__ALGORITHM_CIPHER_MODE_PADDING:
                                try {
                                        return generateCipherObject((Algorithm) arguments.get(0), (Cipher_Mode)arguments.get(1), (Padding)arguments.get(2));
                                }
                                catch (Throwable throwable) {
                                        throw new InvocationTargetException(throwable);
                                }
                        case SymmetricKeyCryptoPackage.SYMMETRIC_KEY_FUNCTION___DECRYPT__BYTE_BYTE_BYTE:
                                try {
                                        return decrypt((byte[])arguments.get(0), (byte[])arguments.get(1), (byte[])arguments.get(2));
                                }
                                catch (Throwable throwable) {
                                        throw new InvocationTargetException(throwable);
                                }
                }
                return super.eInvoke(operationID, arguments);
        }

        /**
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        @Override
        public String toString() {
                if (eIsProxy()) return super.toString();

                StringBuffer result = new StringBuffer(super.toString());
                result.append(" (cipher: ");
                result.append(cipher);
                result.append(')');
                return result.toString();
        }

} //SymmetricKeyFunctionImpl
