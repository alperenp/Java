/**
 */
package FileIntegrityTest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see FileIntegrityTest.FileIntegrityTestPackage
 * @generated
 */
public interface FileIntegrityTestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileIntegrityTestFactory eINSTANCE = FileIntegrityTest.impl.FileIntegrityTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Integrity Checker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Integrity Checker</em>'.
	 * @generated
	 */
	FileIntegrityChecker createFileIntegrityChecker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FileIntegrityTestPackage getFileIntegrityTestPackage();

} //FileIntegrityTestFactory
