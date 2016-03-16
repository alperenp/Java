/**
 */
package semper.gtarc.bdesoc.event.model.windowsEvent;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSource <em>Source</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getEvent_Id <em>Event Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser <em>User</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getOperational_Code <em>Operational Code</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLog <em>Log</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getTask_Category <em>Task Category</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getComputer <em>Computer</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getDateAndTime <em>Date And Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcess_Id <em>Process Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getThread_Id <em>Thread Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Id <em>Processor Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSession_Id <em>Session Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKernel_Time <em>Kernel Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser_Time <em>User Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Time <em>Processor Time</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getCorrelation_Id <em>Correlation Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getRelative_Correlation_Id <em>Relative Correlation Id</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLevel <em>Level</em>}</li>
 *   <li>{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getS_Id <em>SId</em>}</li>
 * </ul>
 *
 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog()
 * @model
 * @generated
 */
public interface WindowsEventLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Event Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Id</em>' attribute.
	 * @see #setEvent_Id(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Event_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getEvent_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getEvent_Id <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Id</em>' attribute.
	 * @see #getEvent_Id()
	 * @generated
	 */
	void setEvent_Id(int value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Operational Code</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Code</em>' attribute.
	 * @see #setOperational_Code(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Operational_Code()
	 * @model default="-1"
	 * @generated
	 */
	int getOperational_Code();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getOperational_Code <em>Operational Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Code</em>' attribute.
	 * @see #getOperational_Code()
	 * @generated
	 */
	void setOperational_Code(int value);

	/**
	 * Returns the value of the '<em><b>Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' attribute.
	 * @see #setLog(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Log()
	 * @model
	 * @generated
	 */
	String getLog();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLog <em>Log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log</em>' attribute.
	 * @see #getLog()
	 * @generated
	 */
	void setLog(String value);

	/**
	 * Returns the value of the '<em><b>Task Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Category</em>' attribute.
	 * @see #setTask_Category(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Task_Category()
	 * @model
	 * @generated
	 */
	String getTask_Category();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getTask_Category <em>Task Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Category</em>' attribute.
	 * @see #getTask_Category()
	 * @generated
	 */
	void setTask_Category(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywords</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' attribute.
	 * @see #setKeywords(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Keywords()
	 * @model
	 * @generated
	 */
	String getKeywords();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKeywords <em>Keywords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' attribute.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(String value);

	/**
	 * Returns the value of the '<em><b>Computer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computer</em>' attribute.
	 * @see #setComputer(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Computer()
	 * @model
	 * @generated
	 */
	String getComputer();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getComputer <em>Computer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computer</em>' attribute.
	 * @see #getComputer()
	 * @generated
	 */
	void setComputer(String value);

	/**
	 * Returns the value of the '<em><b>Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date And Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date And Time</em>' attribute.
	 * @see #setDateAndTime(Date)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_DateAndTime()
	 * @model
	 * @generated
	 */
	Date getDateAndTime();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getDateAndTime <em>Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date And Time</em>' attribute.
	 * @see #getDateAndTime()
	 * @generated
	 */
	void setDateAndTime(Date value);

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
	 * @see #setProcess_Id(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Process_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getProcess_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcess_Id <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #getProcess_Id()
	 * @generated
	 */
	void setProcess_Id(int value);

	/**
	 * Returns the value of the '<em><b>Thread Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Id</em>' attribute.
	 * @see #setThread_Id(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Thread_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getThread_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getThread_Id <em>Thread Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Id</em>' attribute.
	 * @see #getThread_Id()
	 * @generated
	 */
	void setThread_Id(int value);

	/**
	 * Returns the value of the '<em><b>Processor Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Id</em>' attribute.
	 * @see #setProcessor_Id(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Processor_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getProcessor_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Id <em>Processor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Id</em>' attribute.
	 * @see #getProcessor_Id()
	 * @generated
	 */
	void setProcessor_Id(int value);

	/**
	 * Returns the value of the '<em><b>Session Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Id</em>' attribute.
	 * @see #setSession_Id(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Session_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getSession_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getSession_Id <em>Session Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Id</em>' attribute.
	 * @see #getSession_Id()
	 * @generated
	 */
	void setSession_Id(int value);

	/**
	 * Returns the value of the '<em><b>Kernel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kernel Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Time</em>' attribute.
	 * @see #setKernel_Time(Date)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Kernel_Time()
	 * @model
	 * @generated
	 */
	Date getKernel_Time();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getKernel_Time <em>Kernel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Time</em>' attribute.
	 * @see #getKernel_Time()
	 * @generated
	 */
	void setKernel_Time(Date value);

	/**
	 * Returns the value of the '<em><b>User Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Time</em>' attribute.
	 * @see #setUser_Time(Date)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_User_Time()
	 * @model
	 * @generated
	 */
	Date getUser_Time();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getUser_Time <em>User Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Time</em>' attribute.
	 * @see #getUser_Time()
	 * @generated
	 */
	void setUser_Time(Date value);

	/**
	 * Returns the value of the '<em><b>Processor Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Time</em>' attribute.
	 * @see #setProcessor_Time(Date)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Processor_Time()
	 * @model
	 * @generated
	 */
	Date getProcessor_Time();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getProcessor_Time <em>Processor Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Time</em>' attribute.
	 * @see #getProcessor_Time()
	 * @generated
	 */
	void setProcessor_Time(Date value);

	/**
	 * Returns the value of the '<em><b>Correlation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Id</em>' attribute.
	 * @see #setCorrelation_Id(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Correlation_Id()
	 * @model
	 * @generated
	 */
	String getCorrelation_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getCorrelation_Id <em>Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Id</em>' attribute.
	 * @see #getCorrelation_Id()
	 * @generated
	 */
	void setCorrelation_Id(String value);

	/**
	 * Returns the value of the '<em><b>Relative Correlation Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Correlation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Correlation Id</em>' attribute.
	 * @see #setRelative_Correlation_Id(int)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Relative_Correlation_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getRelative_Correlation_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getRelative_Correlation_Id <em>Relative Correlation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Correlation Id</em>' attribute.
	 * @see #getRelative_Correlation_Id()
	 * @generated
	 */
	void setRelative_Correlation_Id(int value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link semper.gtarc.bdesoc.event.model.windowsEvent.Level}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.Level
	 * @see #setLevel(Level)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_Level()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel 0='\"Success Audit\"' 1='\"Critical\"' 2='\"Error\"' 3='\"Warning\"' 4='\"Information\"' 5='\"Failure Audit\"'"
	 * @generated
	 */
	Level getLevel();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.Level
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(Level value);

	/**
	 * Returns the value of the '<em><b>SId</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SId</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SId</em>' attribute.
	 * @see #setS_Id(String)
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#getWindowsEventLog_S_Id()
	 * @model
	 * @generated
	 */
	String getS_Id();

	/**
	 * Sets the value of the '{@link semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog#getS_Id <em>SId</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SId</em>' attribute.
	 * @see #getS_Id()
	 * @generated
	 */
	void setS_Id(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String result = null;\r\ntry {\r\n\tresult = toString(\"|\");\r\n}\r\ncatch(Exception e) {\r\n\te.printStackTrace();\r\n}\r\nreturn result;'"
	 * @generated
	 */
	String toString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * |Source                    |EventID|Level      |User  |opCode|Log Name   |Task Category|Keywords|Computer|dateAndTime        |ProcessID|ThreadID|ProcessorID|SessionID|KernelTime                    |UserTime|ProcessorTime|CorrelationID|RelativeCorrelationID|Security Id|
	 * |--------------------------|-------|-----------|------|------|-----------|-------------|--------|--------|-------------------|---------|--------|-----------|---------|------------------------------|--------|-------------|-------------|---------------------|-----------|
	 * |Microsoft-Windows-Winlogon|6000   |Information|SYSTEM|0     |Application|None         |Classic |PC_NAME |08.12.2015 08:47:32|0        |0       |           |         |2015-12-08T06:47:32.000000000Z|        |             |             |                     |S-1-5-18   |
	 * | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString();\r\n\t\t\r\nif(level.getValue() < 0 || level.getValue() > 5)\r\n\tthrow new IllegalArgumentException(\"Invalid level index. Index must be between [0..5]!\");\r\n\r\nStringBuffer result = new StringBuffer();\t\t\r\nresult.append(source);\r\nresult.append(delimiter);\r\nresult.append(event_Id);\r\nresult.append(delimiter);\r\nresult.append(level);\r\nresult.append(delimiter);\r\nresult.append(user);\r\nresult.append(delimiter);\r\nresult.append(operational_Code);\r\nresult.append(delimiter);\r\nresult.append(log);\r\nresult.append(delimiter);\r\nresult.append(task_Category);\r\nresult.append(delimiter);\r\nresult.append(keywords);\r\nresult.append(delimiter);\r\nresult.append(computer);\r\nresult.append(delimiter);\r\nresult.append(dateAndTime);\r\nresult.append(delimiter);\r\nresult.append(process_Id);\r\nresult.append(delimiter);\r\nresult.append(thread_Id);\r\nresult.append(delimiter);\r\nresult.append(processor_Id);\r\nresult.append(delimiter);\r\nresult.append(session_Id);\r\nresult.append(delimiter);\r\nresult.append(kernel_Time);\r\nresult.append(delimiter);\r\nresult.append(user_Time);\r\nresult.append(delimiter);\r\nresult.append(processor_Time);\r\nresult.append(delimiter);\r\nresult.append(correlation_Id);\r\nresult.append(delimiter);\r\nresult.append(relative_Correlation_Id);\r\nresult.append(delimiter);\r\nresult.append(s_Id);\r\n\t\t\r\nreturn result.toString();'"
	 * @generated
	 */
	String toString(String delimiter);

} // WindowsEventLog
