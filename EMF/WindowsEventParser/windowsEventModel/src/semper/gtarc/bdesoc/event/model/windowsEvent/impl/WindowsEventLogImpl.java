/**
 */
package semper.gtarc.bdesoc.event.model.windowsEvent.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import semper.gtarc.bdesoc.event.model.windowsEvent.Level;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getSource <em>Source</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getEvent_Id <em>Event Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getUser <em>User</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getOperational_Code <em>Operational Code</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getLog <em>Log</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getTask_Category <em>Task Category</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getComputer <em>Computer</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getDateAndTime <em>Date And Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getProcess_Id <em>Process Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getThread_Id <em>Thread Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getProcessor_Id <em>Processor Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getSession_Id <em>Session Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getKernel_Time <em>Kernel Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getUser_Time <em>User Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getProcessor_Time <em>Processor Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getCorrelation_Id <em>Correlation Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getRelative_Correlation_Id <em>Relative Correlation Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventLogImpl#getS_Id <em>SId</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowsEventLogImpl extends EObjectImpl implements WindowsEventLog {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvent_Id() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_Id()
	 * @generated
	 * @ordered
	 */
	protected static final int EVENT_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getEvent_Id() <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent_Id()
	 * @generated
	 * @ordered
	 */
	protected int event_Id = EVENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperational_Code() <em>Operational Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperational_Code()
	 * @generated
	 * @ordered
	 */
	protected static final int OPERATIONAL_CODE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getOperational_Code() <em>Operational Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperational_Code()
	 * @generated
	 * @ordered
	 */
	protected int operational_Code = OPERATIONAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLog() <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected String log = LOG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTask_Category() <em>Task Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_Category()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask_Category() <em>Task Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask_Category()
	 * @generated
	 * @ordered
	 */
	protected String task_Category = TASK_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywords() <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywords()
	 * @generated
	 * @ordered
	 */
	protected String keywords = KEYWORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputer() <em>Computer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputer()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputer() <em>Computer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputer()
	 * @generated
	 * @ordered
	 */
	protected String computer = COMPUTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateAndTime() <em>Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_AND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAndTime() <em>Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateAndTime = DATE_AND_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcess_Id() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess_Id()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESS_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getProcess_Id() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess_Id()
	 * @generated
	 * @ordered
	 */
	protected int process_Id = PROCESS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getThread_Id() <em>Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread_Id()
	 * @generated
	 * @ordered
	 */
	protected static final int THREAD_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getThread_Id() <em>Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread_Id()
	 * @generated
	 * @ordered
	 */
	protected int thread_Id = THREAD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessor_Id() <em>Processor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor_Id()
	 * @generated
	 * @ordered
	 */
	protected static final int PROCESSOR_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getProcessor_Id() <em>Processor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor_Id()
	 * @generated
	 * @ordered
	 */
	protected int processor_Id = PROCESSOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSession_Id() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession_Id()
	 * @generated
	 * @ordered
	 */
	protected static final int SESSION_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSession_Id() <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession_Id()
	 * @generated
	 * @ordered
	 */
	protected int session_Id = SESSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernel_Time() <em>Kernel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_Time()
	 * @generated
	 * @ordered
	 */
	protected static final Date KERNEL_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernel_Time() <em>Kernel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernel_Time()
	 * @generated
	 * @ordered
	 */
	protected Date kernel_Time = KERNEL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_Time() <em>User Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_Time()
	 * @generated
	 * @ordered
	 */
	protected static final Date USER_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser_Time() <em>User Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_Time()
	 * @generated
	 * @ordered
	 */
	protected Date user_Time = USER_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessor_Time() <em>Processor Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor_Time()
	 * @generated
	 * @ordered
	 */
	protected static final Date PROCESSOR_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessor_Time() <em>Processor Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor_Time()
	 * @generated
	 * @ordered
	 */
	protected Date processor_Time = PROCESSOR_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorrelation_Id() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelation_Id()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelation_Id() <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelation_Id()
	 * @generated
	 * @ordered
	 */
	protected String correlation_Id = CORRELATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelative_Correlation_Id() <em>Relative Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative_Correlation_Id()
	 * @generated
	 * @ordered
	 */
	protected static final int RELATIVE_CORRELATION_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getRelative_Correlation_Id() <em>Relative Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative_Correlation_Id()
	 * @generated
	 * @ordered
	 */
	protected int relative_Correlation_Id = RELATIVE_CORRELATION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Level LEVEL_EDEFAULT = Level.UNDEFINED;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected Level level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getS_Id() <em>SId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS_Id()
	 * @generated
	 * @ordered
	 */
	protected static final String SID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS_Id() <em>SId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS_Id()
	 * @generated
	 * @ordered
	 */
	protected String s_Id = SID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowsEventLogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WindowsEventPackage.Literals.WINDOWS_EVENT_LOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEvent_Id() {
		return event_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent_Id(int newEvent_Id) {
		int oldEvent_Id = event_Id;
		event_Id = newEvent_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__EVENT_ID, oldEvent_Id, event_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOperational_Code() {
		return operational_Code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational_Code(int newOperational_Code) {
		int oldOperational_Code = operational_Code;
		operational_Code = newOperational_Code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__OPERATIONAL_CODE, oldOperational_Code, operational_Code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLog() {
		return log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLog(String newLog) {
		String oldLog = log;
		log = newLog;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__LOG, oldLog, log));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTask_Category() {
		return task_Category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask_Category(String newTask_Category) {
		String oldTask_Category = task_Category;
		task_Category = newTask_Category;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__TASK_CATEGORY, oldTask_Category, task_Category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeywords() {
		return keywords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywords(String newKeywords) {
		String oldKeywords = keywords;
		keywords = newKeywords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__KEYWORDS, oldKeywords, keywords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputer() {
		return computer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputer(String newComputer) {
		String oldComputer = computer;
		computer = newComputer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__COMPUTER, oldComputer, computer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateAndTime() {
		return dateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAndTime(Date newDateAndTime) {
		Date oldDateAndTime = dateAndTime;
		dateAndTime = newDateAndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__DATE_AND_TIME, oldDateAndTime, dateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcess_Id() {
		return process_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess_Id(int newProcess_Id) {
		int oldProcess_Id = process_Id;
		process_Id = newProcess_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESS_ID, oldProcess_Id, process_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThread_Id() {
		return thread_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread_Id(int newThread_Id) {
		int oldThread_Id = thread_Id;
		thread_Id = newThread_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__THREAD_ID, oldThread_Id, thread_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProcessor_Id() {
		return processor_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor_Id(int newProcessor_Id) {
		int oldProcessor_Id = processor_Id;
		processor_Id = newProcessor_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_ID, oldProcessor_Id, processor_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSession_Id() {
		return session_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession_Id(int newSession_Id) {
		int oldSession_Id = session_Id;
		session_Id = newSession_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__SESSION_ID, oldSession_Id, session_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getKernel_Time() {
		return kernel_Time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKernel_Time(Date newKernel_Time) {
		Date oldKernel_Time = kernel_Time;
		kernel_Time = newKernel_Time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__KERNEL_TIME, oldKernel_Time, kernel_Time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getUser_Time() {
		return user_Time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_Time(Date newUser_Time) {
		Date oldUser_Time = user_Time;
		user_Time = newUser_Time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__USER_TIME, oldUser_Time, user_Time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getProcessor_Time() {
		return processor_Time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor_Time(Date newProcessor_Time) {
		Date oldProcessor_Time = processor_Time;
		processor_Time = newProcessor_Time;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_TIME, oldProcessor_Time, processor_Time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelation_Id() {
		return correlation_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelation_Id(String newCorrelation_Id) {
		String oldCorrelation_Id = correlation_Id;
		correlation_Id = newCorrelation_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__CORRELATION_ID, oldCorrelation_Id, correlation_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelative_Correlation_Id() {
		return relative_Correlation_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelative_Correlation_Id(int newRelative_Correlation_Id) {
		int oldRelative_Correlation_Id = relative_Correlation_Id;
		relative_Correlation_Id = newRelative_Correlation_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID, oldRelative_Correlation_Id, relative_Correlation_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(Level newLevel) {
		Level oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_Id() {
		return s_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_Id(String newS_Id) {
		String oldS_Id = s_Id;
		s_Id = newS_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WindowsEventPackage.WINDOWS_EVENT_LOG__SID, oldS_Id, s_Id));
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
	public String toString(final String delimiter) {
		if (eIsProxy()) return super.toString();
				
		if(level.getValue() < 0 || level.getValue() > 5)
			throw new IllegalArgumentException("Invalid level index. Index must be between [0..5]!");
		
		StringBuffer result = new StringBuffer();		
		result.append(source);
		result.append(delimiter);
		result.append(event_Id);
		result.append(delimiter);
		result.append(level);
		result.append(delimiter);
		result.append(user);
		result.append(delimiter);
		result.append(operational_Code);
		result.append(delimiter);
		result.append(log);
		result.append(delimiter);
		result.append(task_Category);
		result.append(delimiter);
		result.append(keywords);
		result.append(delimiter);
		result.append(computer);
		result.append(delimiter);
		result.append(dateAndTime);
		result.append(delimiter);
		result.append(process_Id);
		result.append(delimiter);
		result.append(thread_Id);
		result.append(delimiter);
		result.append(processor_Id);
		result.append(delimiter);
		result.append(session_Id);
		result.append(delimiter);
		result.append(kernel_Time);
		result.append(delimiter);
		result.append(user_Time);
		result.append(delimiter);
		result.append(processor_Time);
		result.append(delimiter);
		result.append(correlation_Id);
		result.append(delimiter);
		result.append(relative_Correlation_Id);
		result.append(delimiter);
		result.append(s_Id);
				
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SOURCE:
				return getSource();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__EVENT_ID:
				return getEvent_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER:
				return getUser();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__OPERATIONAL_CODE:
				return getOperational_Code();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LOG:
				return getLog();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__TASK_CATEGORY:
				return getTask_Category();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KEYWORDS:
				return getKeywords();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__COMPUTER:
				return getComputer();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__DATE_AND_TIME:
				return getDateAndTime();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESS_ID:
				return getProcess_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__THREAD_ID:
				return getThread_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_ID:
				return getProcessor_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SESSION_ID:
				return getSession_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KERNEL_TIME:
				return getKernel_Time();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER_TIME:
				return getUser_Time();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_TIME:
				return getProcessor_Time();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__CORRELATION_ID:
				return getCorrelation_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID:
				return getRelative_Correlation_Id();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LEVEL:
				return getLevel();
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SID:
				return getS_Id();
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
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SOURCE:
				setSource((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__EVENT_ID:
				setEvent_Id((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER:
				setUser((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__OPERATIONAL_CODE:
				setOperational_Code((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LOG:
				setLog((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__TASK_CATEGORY:
				setTask_Category((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KEYWORDS:
				setKeywords((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__COMPUTER:
				setComputer((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__DATE_AND_TIME:
				setDateAndTime((Date)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESS_ID:
				setProcess_Id((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__THREAD_ID:
				setThread_Id((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_ID:
				setProcessor_Id((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SESSION_ID:
				setSession_Id((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KERNEL_TIME:
				setKernel_Time((Date)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER_TIME:
				setUser_Time((Date)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_TIME:
				setProcessor_Time((Date)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__CORRELATION_ID:
				setCorrelation_Id((String)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID:
				setRelative_Correlation_Id((Integer)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LEVEL:
				setLevel((Level)newValue);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SID:
				setS_Id((String)newValue);
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
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__EVENT_ID:
				setEvent_Id(EVENT_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER:
				setUser(USER_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__OPERATIONAL_CODE:
				setOperational_Code(OPERATIONAL_CODE_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LOG:
				setLog(LOG_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__TASK_CATEGORY:
				setTask_Category(TASK_CATEGORY_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KEYWORDS:
				setKeywords(KEYWORDS_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__COMPUTER:
				setComputer(COMPUTER_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__DATE_AND_TIME:
				setDateAndTime(DATE_AND_TIME_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESS_ID:
				setProcess_Id(PROCESS_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__THREAD_ID:
				setThread_Id(THREAD_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_ID:
				setProcessor_Id(PROCESSOR_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SESSION_ID:
				setSession_Id(SESSION_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KERNEL_TIME:
				setKernel_Time(KERNEL_TIME_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER_TIME:
				setUser_Time(USER_TIME_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_TIME:
				setProcessor_Time(PROCESSOR_TIME_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__CORRELATION_ID:
				setCorrelation_Id(CORRELATION_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID:
				setRelative_Correlation_Id(RELATIVE_CORRELATION_ID_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SID:
				setS_Id(SID_EDEFAULT);
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
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__EVENT_ID:
				return event_Id != EVENT_ID_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__OPERATIONAL_CODE:
				return operational_Code != OPERATIONAL_CODE_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LOG:
				return LOG_EDEFAULT == null ? log != null : !LOG_EDEFAULT.equals(log);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__TASK_CATEGORY:
				return TASK_CATEGORY_EDEFAULT == null ? task_Category != null : !TASK_CATEGORY_EDEFAULT.equals(task_Category);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KEYWORDS:
				return KEYWORDS_EDEFAULT == null ? keywords != null : !KEYWORDS_EDEFAULT.equals(keywords);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__COMPUTER:
				return COMPUTER_EDEFAULT == null ? computer != null : !COMPUTER_EDEFAULT.equals(computer);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__DATE_AND_TIME:
				return DATE_AND_TIME_EDEFAULT == null ? dateAndTime != null : !DATE_AND_TIME_EDEFAULT.equals(dateAndTime);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESS_ID:
				return process_Id != PROCESS_ID_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__THREAD_ID:
				return thread_Id != THREAD_ID_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_ID:
				return processor_Id != PROCESSOR_ID_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SESSION_ID:
				return session_Id != SESSION_ID_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__KERNEL_TIME:
				return KERNEL_TIME_EDEFAULT == null ? kernel_Time != null : !KERNEL_TIME_EDEFAULT.equals(kernel_Time);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__USER_TIME:
				return USER_TIME_EDEFAULT == null ? user_Time != null : !USER_TIME_EDEFAULT.equals(user_Time);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__PROCESSOR_TIME:
				return PROCESSOR_TIME_EDEFAULT == null ? processor_Time != null : !PROCESSOR_TIME_EDEFAULT.equals(processor_Time);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__CORRELATION_ID:
				return CORRELATION_ID_EDEFAULT == null ? correlation_Id != null : !CORRELATION_ID_EDEFAULT.equals(correlation_Id);
			case WindowsEventPackage.WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID:
				return relative_Correlation_Id != RELATIVE_CORRELATION_ID_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__LEVEL:
				return level != LEVEL_EDEFAULT;
			case WindowsEventPackage.WINDOWS_EVENT_LOG__SID:
				return SID_EDEFAULT == null ? s_Id != null : !SID_EDEFAULT.equals(s_Id);
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
			case WindowsEventPackage.WINDOWS_EVENT_LOG___TO_STRING:
				return toString();
			case WindowsEventPackage.WINDOWS_EVENT_LOG___TO_STRING__STRING:
				return toString((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //WindowsEventLogImpl
