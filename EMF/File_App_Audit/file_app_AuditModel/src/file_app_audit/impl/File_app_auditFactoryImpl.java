/**
 */
package file_app_audit.impl;

import file_app_audit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class File_app_auditFactoryImpl extends EFactoryImpl implements File_app_auditFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static File_app_auditFactory init() {
		try {
			File_app_auditFactory theFile_app_auditFactory = (File_app_auditFactory)EPackage.Registry.INSTANCE.getEFactory(File_app_auditPackage.eNS_URI);
			if (theFile_app_auditFactory != null) {
				return theFile_app_auditFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new File_app_auditFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File_app_auditFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case File_app_auditPackage.FILE_APP_AUDIT_LOG: return createFile_App_Audit_Log();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File_App_Audit_Log createFile_App_Audit_Log() {
		File_App_Audit_LogImpl file_App_Audit_Log = new File_App_Audit_LogImpl();
		return file_App_Audit_Log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File_app_auditPackage getFile_app_auditPackage() {
		return (File_app_auditPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static File_app_auditPackage getPackage() {
		return File_app_auditPackage.eINSTANCE;
	}

} //File_app_auditFactoryImpl
