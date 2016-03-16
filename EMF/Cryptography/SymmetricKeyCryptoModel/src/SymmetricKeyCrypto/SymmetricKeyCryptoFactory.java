/**
 */
package SymmetricKeyCrypto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SymmetricKeyCrypto.SymmetricKeyCryptoPackage
 * @generated
 */
public interface SymmetricKeyCryptoFactory extends EFactory {
        /**
         * The singleton instance of the factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        SymmetricKeyCryptoFactory eINSTANCE = SymmetricKeyCrypto.impl.SymmetricKeyCryptoFactoryImpl.init();

        /**
         * Returns a new object of class '<em>Symmetric Key Function</em>'.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return a new object of class '<em>Symmetric Key Function</em>'.
         * @generated
         */
        SymmetricKeyFunction createSymmetricKeyFunction();

        /**
         * Returns the package supported by this factory.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @return the package supported by this factory.
         * @generated
         */
        SymmetricKeyCryptoPackage getSymmetricKeyCryptoPackage();

} //SymmetricKeyCryptoFactory
