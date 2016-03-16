/**
 */
package file_app_audit.impl;

import file_app_audit.File_App_Audit_Log;
import file_app_audit.File_app_auditPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File App Audit Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getProcessName <em>Process Name</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getTime <em>Time</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getProcessId <em>Process Id</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getPpid <em>Ppid</em>}</li>
 *   <li>{@link file_app_audit.impl.File_App_Audit_LogImpl#getSyscall <em>Syscall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class File_App_Audit_LogImpl extends MinimalEObjectImpl.Container implements File_App_Audit_Log {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessName() <em>Process Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessName()
	 * @generated
	 * @ordered
	 */
	protected String processName = PROCESS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected String workingDirectory = WORKING_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESS_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected int processId = PROCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPpid() <em>Ppid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPpid()
	 * @generated
	 * @ordered
	 */
	protected static final int PPID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPpid() <em>Ppid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPpid()
	 * @generated
	 * @ordered
	 */
	protected int ppid = PPID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSyscall() <em>Syscall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyscall()
	 * @generated
	 * @ordered
	 */
	protected static final int SYSCALL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSyscall() <em>Syscall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyscall()
	 * @generated
	 * @ordered
	 */
	protected int syscall = SYSCALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected File_App_Audit_LogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return File_app_auditPackage.Literals.FILE_APP_AUDIT_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessName() {
		return processName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessName(String newProcessName) {
		String oldProcessName = processName;
		processName = newProcessName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_NAME, oldProcessName, processName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingDirectory(String newWorkingDirectory) {
		String oldWorkingDirectory = workingDirectory;
		workingDirectory = newWorkingDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__WORKING_DIRECTORY, oldWorkingDirectory, workingDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessId() {
		return processId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessId(int newProcessId) {
		int oldProcessId = processId;
		processId = newProcessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_ID, oldProcessId, processId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPpid() {
		return ppid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPpid(int newPpid) {
		int oldPpid = ppid;
		ppid = newPpid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__PPID, oldPpid, ppid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSyscall() {
		return syscall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyscall(int newSyscall) {
		int oldSyscall = syscall;
		syscall = newSyscall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, File_app_auditPackage.FILE_APP_AUDIT_LOG__SYSCALL, oldSyscall, syscall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString(final String delimiter) {
		if (eIsProxy()) return super.toString();		
		
		StringBuffer result = new StringBuffer();	
		result.append(time);
		result.append(delimiter);
		result.append(domainName);
		result.append(delimiter);
		result.append(userName);
		result.append(delimiter);
		result.append(fileName);
		result.append(delimiter);
		result.append(processName);
		result.append(delimiter);
		result.append(workingDirectory);
		result.append(delimiter);
		result.append(processId);
		result.append(delimiter);
		result.append(ppid);
		result.append(delimiter);
		result.append(syscall);
		
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		String result = null;
		try {
			result = toString("|");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__FILE_NAME:
				return getFileName();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_NAME:
				return getProcessName();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__WORKING_DIRECTORY:
				return getWorkingDirectory();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__TIME:
				return getTime();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__USER_NAME:
				return getUserName();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__DOMAIN_NAME:
				return getDomainName();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_ID:
				return getProcessId();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PPID:
				return getPpid();
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__SYSCALL:
				return getSyscall();
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
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__FILE_NAME:
				setFileName((String)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_NAME:
				setProcessName((String)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__WORKING_DIRECTORY:
				setWorkingDirectory((String)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__TIME:
				setTime((Date)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__USER_NAME:
				setUserName((String)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_ID:
				setProcessId((Integer)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PPID:
				setPpid((Integer)newValue);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__SYSCALL:
				setSyscall((Integer)newValue);
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
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_NAME:
				setProcessName(PROCESS_NAME_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__WORKING_DIRECTORY:
				setWorkingDirectory(WORKING_DIRECTORY_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_ID:
				setProcessId(PROCESS_ID_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PPID:
				setPpid(PPID_EDEFAULT);
				return;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__SYSCALL:
				setSyscall(SYSCALL_EDEFAULT);
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
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_NAME:
				return PROCESS_NAME_EDEFAULT == null ? processName != null : !PROCESS_NAME_EDEFAULT.equals(processName);
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__WORKING_DIRECTORY:
				return WORKING_DIRECTORY_EDEFAULT == null ? workingDirectory != null : !WORKING_DIRECTORY_EDEFAULT.equals(workingDirectory);
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PROCESS_ID:
				return processId != PROCESS_ID_EDEFAULT;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__PPID:
				return ppid != PPID_EDEFAULT;
			case File_app_auditPackage.FILE_APP_AUDIT_LOG__SYSCALL:
				return syscall != SYSCALL_EDEFAULT;
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
			case File_app_auditPackage.FILE_APP_AUDIT_LOG___TO_STRING__STRING:
				return toString((String)arguments.get(0));
			case File_app_auditPackage.FILE_APP_AUDIT_LOG___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //File_App_Audit_LogImpl
