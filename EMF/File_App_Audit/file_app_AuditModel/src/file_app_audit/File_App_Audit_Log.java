/**
 */
package file_app_audit;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File App Audit Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getFileName <em>File Name</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getProcessName <em>Process Name</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getTime <em>Time</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getUserName <em>User Name</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getPpid <em>Ppid</em>}</li>
 *   <li>{@link file_app_audit.File_App_Audit_Log#getSyscall <em>Syscall</em>}</li>
 * </ul>
 *
 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log()
 * @model
 * @generated
 */
public interface File_App_Audit_Log extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Process Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Name</em>' attribute.
	 * @see #setProcessName(String)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_ProcessName()
	 * @model
	 * @generated
	 */
	String getProcessName();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getProcessName <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Name</em>' attribute.
	 * @see #getProcessName()
	 * @generated
	 */
	void setProcessName(String value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #setWorkingDirectory(String)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_WorkingDirectory()
	 * @model
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_DomainName()
	 * @model
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Process Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Id</em>' attribute.
	 * @see #setProcessId(int)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_ProcessId()
	 * @model default="-1"
	 * @generated
	 */
	int getProcessId();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #getProcessId()
	 * @generated
	 */
	void setProcessId(int value);

	/**
	 * Returns the value of the '<em><b>Ppid</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ppid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ppid</em>' attribute.
	 * @see #setPpid(int)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_Ppid()
	 * @model default="-1"
	 * @generated
	 */
	int getPpid();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getPpid <em>Ppid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ppid</em>' attribute.
	 * @see #getPpid()
	 * @generated
	 */
	void setPpid(int value);

	/**
	 * Returns the value of the '<em><b>Syscall</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Syscall</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Syscall</em>' attribute.
	 * @see #setSyscall(int)
	 * @see file_app_audit.File_app_auditPackage#getFile_App_Audit_Log_Syscall()
	 * @model default="-1"
	 * @generated
	 */
	int getSyscall();

	/**
	 * Sets the value of the '{@link file_app_audit.File_App_Audit_Log#getSyscall <em>Syscall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Syscall</em>' attribute.
	 * @see #getSyscall()
	 * @generated
	 */
	void setSyscall(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\t\t\r\n\r\nStringBuffer result = new StringBuffer();\t\r\nresult.append(time);\r\nresult.append(delimiter);\r\nresult.append(domainName);\r\nresult.append(delimiter);\r\nresult.append(userName);\r\nresult.append(delimiter);\r\nresult.append(fileName);\r\nresult.append(delimiter);\r\nresult.append(processName);\r\nresult.append(delimiter);\r\nresult.append(workingDirectory);\r\nresult.append(delimiter);\r\nresult.append(processId);\r\nresult.append(delimiter);\r\nresult.append(ppid);\r\nresult.append(delimiter);\r\nresult.append(syscall);\r\n\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString(String delimiter);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String result = null;\r\ntry {\r\n\tresult = toString(\"|\");\r\n}\r\ncatch(Exception e) {\r\n\te.printStackTrace();\r\n}\r\nreturn result;'"
	 * @generated
	 */
	String toString();

} // File_App_Audit_Log
