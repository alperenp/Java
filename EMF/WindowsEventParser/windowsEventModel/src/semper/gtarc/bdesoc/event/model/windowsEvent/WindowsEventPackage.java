/**
 */
package semper.gtarc.bdesoc.event.model.windowsEvent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventFactory
 * @model kind="package"
 * @generated
 */
public interface WindowsEventPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "windowsEvent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/windowsEvent";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "windowsEvent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WindowsEventPackage eINSTANCE = semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventPackageImpl.init();

	/**
	 * The meta object id for the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl <em>Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventPackageImpl#getWindowsEventLog()
	 * @generated
	 */
	int WINDOWS_EVENT_LOG = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__SOURCE = EcorePackage.EOBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__EVENT_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__USER = EcorePackage.EOBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operational Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__OPERATIONAL_CODE = EcorePackage.EOBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__LOG = EcorePackage.EOBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Task Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__TASK_CATEGORY = EcorePackage.EOBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__KEYWORDS = EcorePackage.EOBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Computer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__COMPUTER = EcorePackage.EOBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__DATE_AND_TIME = EcorePackage.EOBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__PROCESS_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Thread Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__THREAD_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Processor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__PROCESSOR_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Session Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__SESSION_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Kernel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__KERNEL_TIME = EcorePackage.EOBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>User Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__USER_TIME = EcorePackage.EOBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Processor Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__PROCESSOR_TIME = EcorePackage.EOBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__CORRELATION_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Relative Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID = EcorePackage.EOBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__LEVEL = EcorePackage.EOBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>SId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG__SID = EcorePackage.EOBJECT_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG_FEATURE_COUNT = EcorePackage.EOBJECT_FEATURE_COUNT + 20;

	/**
	 * The operation id for the '<em>EClass</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ECLASS = EcorePackage.EOBJECT___ECLASS;

	/**
	 * The operation id for the '<em>EIs Proxy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EIS_PROXY = EcorePackage.EOBJECT___EIS_PROXY;

	/**
	 * The operation id for the '<em>EResource</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ERESOURCE = EcorePackage.EOBJECT___ERESOURCE;

	/**
	 * The operation id for the '<em>EContainer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ECONTAINER = EcorePackage.EOBJECT___ECONTAINER;

	/**
	 * The operation id for the '<em>EContaining Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ECONTAINING_FEATURE = EcorePackage.EOBJECT___ECONTAINING_FEATURE;

	/**
	 * The operation id for the '<em>EContainment Feature</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ECONTAINMENT_FEATURE = EcorePackage.EOBJECT___ECONTAINMENT_FEATURE;

	/**
	 * The operation id for the '<em>EContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ECONTENTS = EcorePackage.EOBJECT___ECONTENTS;

	/**
	 * The operation id for the '<em>EAll Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EALL_CONTENTS = EcorePackage.EOBJECT___EALL_CONTENTS;

	/**
	 * The operation id for the '<em>ECross References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ECROSS_REFERENCES = EcorePackage.EOBJECT___ECROSS_REFERENCES;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EGET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EGet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EGET__ESTRUCTURALFEATURE_BOOLEAN = EcorePackage.EOBJECT___EGET__ESTRUCTURALFEATURE_BOOLEAN;

	/**
	 * The operation id for the '<em>ESet</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___ESET__ESTRUCTURALFEATURE_OBJECT = EcorePackage.EOBJECT___ESET__ESTRUCTURALFEATURE_OBJECT;

	/**
	 * The operation id for the '<em>EIs Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EIS_SET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EIS_SET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EUnset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EUNSET__ESTRUCTURALFEATURE = EcorePackage.EOBJECT___EUNSET__ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>EInvoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___EINVOKE__EOPERATION_ELIST = EcorePackage.EOBJECT___EINVOKE__EOPERATION_ELIST;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___TO_STRING = EcorePackage.EOBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG___TO_STRING__STRING = EcorePackage.EOBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_EVENT_LOG_OPERATION_COUNT = EcorePackage.EOBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.Level
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventPackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 1;


	/**
	 * Returns the meta object for class '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog
	 * @generated
	 */
	EClass getWindowsEventLog();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSource()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Source();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getEvent_Id <em>Event Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getEvent_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Event_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_User();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getOperational_Code <em>Operational Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational Code</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getOperational_Code()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Operational_Code();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLog <em>Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLog()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Log();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getTask_Category <em>Task Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Category</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getTask_Category()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Task_Category();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKeywords()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getComputer <em>Computer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computer</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getComputer()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Computer();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getDateAndTime <em>Date And Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date And Time</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getDateAndTime()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_DateAndTime();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcess_Id <em>Process Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcess_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Process_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getThread_Id <em>Thread Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getThread_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Thread_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Id <em>Processor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Processor_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSession_Id <em>Session Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSession_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Session_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKernel_Time <em>Kernel Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Time</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKernel_Time()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Kernel_Time();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser_Time <em>User Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Time</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser_Time()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_User_Time();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Time <em>Processor Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor Time</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Time()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Processor_Time();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getCorrelation_Id <em>Correlation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getCorrelation_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Correlation_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getRelative_Correlation_Id <em>Relative Correlation Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Correlation Id</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getRelative_Correlation_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Relative_Correlation_Id();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLevel()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_Level();

	/**
	 * Returns the meta object for the attribute '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getS_Id <em>SId</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SId</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getS_Id()
	 * @see #getWindowsEventLog()
	 * @generated
	 */
	EAttribute getWindowsEventLog_S_Id();

	/**
	 * Returns the meta object for the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#toString()
	 * @generated
	 */
	EOperation getWindowsEventLog__ToString();

	/**
	 * Returns the meta object for the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#toString(java.lang.String) <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#toString(java.lang.String)
	 * @generated
	 */
	EOperation getWindowsEventLog__ToString__String();

	/**
	 * Returns the meta object for enum '{@link semper.gtarc.bdesoc.event.model.windowsEvent.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WindowsEventFactory getWindowsEventFactory();

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
		 * The meta object literal for the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl <em>Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl
		 * @see semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventPackageImpl#getWindowsEventLog()
		 * @generated
		 */
		EClass WINDOWS_EVENT_LOG = eINSTANCE.getWindowsEventLog();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__SOURCE = eINSTANCE.getWindowsEventLog_Source();

		/**
		 * The meta object literal for the '<em><b>Event Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__EVENT_ID = eINSTANCE.getWindowsEventLog_Event_Id();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__USER = eINSTANCE.getWindowsEventLog_User();

		/**
		 * The meta object literal for the '<em><b>Operational Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__OPERATIONAL_CODE = eINSTANCE.getWindowsEventLog_Operational_Code();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__LOG = eINSTANCE.getWindowsEventLog_Log();

		/**
		 * The meta object literal for the '<em><b>Task Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__TASK_CATEGORY = eINSTANCE.getWindowsEventLog_Task_Category();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__KEYWORDS = eINSTANCE.getWindowsEventLog_Keywords();

		/**
		 * The meta object literal for the '<em><b>Computer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__COMPUTER = eINSTANCE.getWindowsEventLog_Computer();

		/**
		 * The meta object literal for the '<em><b>Date And Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__DATE_AND_TIME = eINSTANCE.getWindowsEventLog_DateAndTime();

		/**
		 * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__PROCESS_ID = eINSTANCE.getWindowsEventLog_Process_Id();

		/**
		 * The meta object literal for the '<em><b>Thread Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__THREAD_ID = eINSTANCE.getWindowsEventLog_Thread_Id();

		/**
		 * The meta object literal for the '<em><b>Processor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__PROCESSOR_ID = eINSTANCE.getWindowsEventLog_Processor_Id();

		/**
		 * The meta object literal for the '<em><b>Session Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__SESSION_ID = eINSTANCE.getWindowsEventLog_Session_Id();

		/**
		 * The meta object literal for the '<em><b>Kernel Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__KERNEL_TIME = eINSTANCE.getWindowsEventLog_Kernel_Time();

		/**
		 * The meta object literal for the '<em><b>User Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__USER_TIME = eINSTANCE.getWindowsEventLog_User_Time();

		/**
		 * The meta object literal for the '<em><b>Processor Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__PROCESSOR_TIME = eINSTANCE.getWindowsEventLog_Processor_Time();

		/**
		 * The meta object literal for the '<em><b>Correlation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__CORRELATION_ID = eINSTANCE.getWindowsEventLog_Correlation_Id();

		/**
		 * The meta object literal for the '<em><b>Relative Correlation Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID = eINSTANCE.getWindowsEventLog_Relative_Correlation_Id();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__LEVEL = eINSTANCE.getWindowsEventLog_Level();

		/**
		 * The meta object literal for the '<em><b>SId</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOWS_EVENT_LOG__SID = eINSTANCE.getWindowsEventLog_S_Id();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WINDOWS_EVENT_LOG___TO_STRING = eINSTANCE.getWindowsEventLog__ToString();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WINDOWS_EVENT_LOG___TO_STRING__STRING = eINSTANCE.getWindowsEventLog__ToString__String();

		/**
		 * The meta object literal for the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see semper.gtarc.bdesoc.event.model.windowsEvent.Level
		 * @see semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventPackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

	}

} //WindowsEventPackage
