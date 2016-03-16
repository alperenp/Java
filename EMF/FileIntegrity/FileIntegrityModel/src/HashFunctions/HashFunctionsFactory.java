/**
 */
package HashFunctions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see HashFunctions.HashFunctionsPackage
 * @generated
 */
public interface HashFunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HashFunctionsFactory eINSTANCE = HashFunctions.impl.HashFunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Crypto Hash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crypto Hash</em>'.
	 * @generated
	 */
	CryptoHash createCryptoHash();

	/**
	 * Returns a new object of class '<em>HMAC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HMAC</em>'.
	 * @generated
	 */
	HMAC createHMAC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HashFunctionsPackage getHashFunctionsPackage();

} //HashFunctionsFactory
