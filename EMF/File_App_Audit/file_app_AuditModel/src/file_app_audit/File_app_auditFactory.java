/**
 */
package file_app_audit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see file_app_audit.File_app_auditPackage
 * @generated
 */
public interface File_app_auditFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	File_app_auditFactory eINSTANCE = file_app_audit.impl.File_app_auditFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File App Audit Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File App Audit Log</em>'.
	 * @generated
	 */
	File_App_Audit_Log createFile_App_Audit_Log();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	File_app_auditPackage getFile_app_auditPackage();

} //File_app_auditFactory
