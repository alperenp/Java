/**
 */
package file_app_audit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see file_app_audit.File_app_auditFactory
 * @model kind="package"
 * @generated
 */
public interface File_app_auditPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "file_app_audit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/file_app_audit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "file_app_audit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	File_app_auditPackage eINSTANCE = file_app_audit.impl.File_app_auditPackageImpl.init();

	/**
	 * The meta object id for the '{@link file_app_audit.impl.File_App_Audit_LogImpl <em>File App Audit Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see file_app_audit.impl.File_App_Audit_LogImpl
	 * @see file_app_audit.impl.File_app_auditPackageImpl#getFile_App_Audit_Log()
	 * @generated
	 */
	int FILE_APP_AUDIT_LOG = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Process Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__PROCESS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__WORKING_DIRECTORY = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__TIME = 3;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__USER_NAME = 4;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__DOMAIN_NAME = 5;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__PROCESS_ID = 6;

	/**
	 * The feature id for the '<em><b>Ppid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__PPID = 7;

	/**
	 * The feature id for the '<em><b>Syscall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG__SYSCALL = 8;

	/**
	 * The number of structural features of the '<em>File App Audit Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG___TO_STRING__STRING = 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG___TO_STRING = 1;

	/**
	 * The number of operations of the '<em>File App Audit Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_APP_AUDIT_LOG_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link file_app_audit.File_App_Audit_Log <em>File App Audit Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File App Audit Log</em>'.
	 * @see file_app_audit.File_App_Audit_Log
	 * @generated
	 */
	EClass getFile_App_Audit_Log();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getFileName()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_FileName();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getProcessName <em>Process Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Name</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getProcessName()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_ProcessName();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getWorkingDirectory()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_WorkingDirectory();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getTime()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_Time();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getUserName()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_UserName();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getDomainName()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getProcessId <em>Process Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Id</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getProcessId()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_ProcessId();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getPpid <em>Ppid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ppid</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getPpid()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_Ppid();

	/**
	 * Returns the meta object for the attribute '{@link file_app_audit.File_App_Audit_Log#getSyscall <em>Syscall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Syscall</em>'.
	 * @see file_app_audit.File_App_Audit_Log#getSyscall()
	 * @see #getFile_App_Audit_Log()
	 * @generated
	 */
	EAttribute getFile_App_Audit_Log_Syscall();

	/**
	 * Returns the meta object for the '{@link file_app_audit.File_App_Audit_Log#toString(java.lang.String) <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see file_app_audit.File_App_Audit_Log#toString(java.lang.String)
	 * @generated
	 */
	EOperation getFile_App_Audit_Log__ToString__String();

	/**
	 * Returns the meta object for the '{@link file_app_audit.File_App_Audit_Log#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see file_app_audit.File_App_Audit_Log#toString()
	 * @generated
	 */
	EOperation getFile_App_Audit_Log__ToString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	File_app_auditFactory getFile_app_auditFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link file_app_audit.impl.File_App_Audit_LogImpl <em>File App Audit Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see file_app_audit.impl.File_App_Audit_LogImpl
		 * @see file_app_audit.impl.File_app_auditPackageImpl#getFile_App_Audit_Log()
		 * @generated
		 */
		EClass FILE_APP_AUDIT_LOG = eINSTANCE.getFile_App_Audit_Log();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__FILE_NAME = eINSTANCE.getFile_App_Audit_Log_FileName();

		/**
		 * The meta object literal for the '<em><b>Process Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__PROCESS_NAME = eINSTANCE.getFile_App_Audit_Log_ProcessName();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__WORKING_DIRECTORY = eINSTANCE.getFile_App_Audit_Log_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__TIME = eINSTANCE.getFile_App_Audit_Log_Time();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__USER_NAME = eINSTANCE.getFile_App_Audit_Log_UserName();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__DOMAIN_NAME = eINSTANCE.getFile_App_Audit_Log_DomainName();

		/**
		 * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__PROCESS_ID = eINSTANCE.getFile_App_Audit_Log_ProcessId();

		/**
		 * The meta object literal for the '<em><b>Ppid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__PPID = eINSTANCE.getFile_App_Audit_Log_Ppid();

		/**
		 * The meta object literal for the '<em><b>Syscall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_APP_AUDIT_LOG__SYSCALL = eINSTANCE.getFile_App_Audit_Log_Syscall();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_APP_AUDIT_LOG___TO_STRING__STRING = eINSTANCE.getFile_App_Audit_Log__ToString__String();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FILE_APP_AUDIT_LOG___TO_STRING = eINSTANCE.getFile_App_Audit_Log__ToString();

	}

} //File_app_auditPackage
