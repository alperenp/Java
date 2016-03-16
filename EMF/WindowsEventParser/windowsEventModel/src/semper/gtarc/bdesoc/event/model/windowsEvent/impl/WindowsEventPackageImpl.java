/**
 */
package semper.gtarc.bdesoc.event.model.windowsEvent.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import semper.gtarc.bdesoc.event.model.windowsEvent.Level;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventFactory;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WindowsEventPackageImpl extends EPackageImpl implements WindowsEventPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsEventLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WindowsEventPackageImpl() {
		super(eNS_URI, WindowsEventFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WindowsEventPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WindowsEventPackage init() {
		if (isInited) return (WindowsEventPackage)EPackage.Registry.INSTANCE.getEPackage(WindowsEventPackage.eNS_URI);

		// Obtain or create and register package
		WindowsEventPackageImpl theWindowsEventPackage = (WindowsEventPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WindowsEventPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WindowsEventPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWindowsEventPackage.createPackageContents();

		// Initialize created meta-data
		theWindowsEventPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWindowsEventPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WindowsEventPackage.eNS_URI, theWindowsEventPackage);
		return theWindowsEventPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindowsEventLog() {
		return windowsEventLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Source() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Event_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_User() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Operational_Code() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Log() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Task_Category() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Keywords() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Computer() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_DateAndTime() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Process_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Thread_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Processor_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Session_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Kernel_Time() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_User_Time() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Processor_Time() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Correlation_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Relative_Correlation_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_Level() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowsEventLog_S_Id() {
		return (EAttribute)windowsEventLogEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWindowsEventLog__ToString() {
		return windowsEventLogEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWindowsEventLog__ToString__String() {
		return windowsEventLogEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowsEventFactory getWindowsEventFactory() {
		return (WindowsEventFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		windowsEventLogEClass = createEClass(WINDOWS_EVENT_LOG);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__SOURCE);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__EVENT_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__USER);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__OPERATIONAL_CODE);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__LOG);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__TASK_CATEGORY);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__KEYWORDS);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__COMPUTER);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__DATE_AND_TIME);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__PROCESS_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__THREAD_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__PROCESSOR_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__SESSION_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__KERNEL_TIME);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__USER_TIME);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__PROCESSOR_TIME);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__CORRELATION_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__RELATIVE_CORRELATION_ID);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__LEVEL);
		createEAttribute(windowsEventLogEClass, WINDOWS_EVENT_LOG__SID);
		createEOperation(windowsEventLogEClass, WINDOWS_EVENT_LOG___TO_STRING);
		createEOperation(windowsEventLogEClass, WINDOWS_EVENT_LOG___TO_STRING__STRING);

		// Create enums
		levelEEnum = createEEnum(LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		windowsEventLogEClass.getESuperTypes().add(ecorePackage.getEObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(windowsEventLogEClass, WindowsEventLog.class, "WindowsEventLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindowsEventLog_Source(), ecorePackage.getEString(), "Source", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Event_Id(), ecorePackage.getEInt(), "Event_Id", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_User(), ecorePackage.getEString(), "User", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Operational_Code(), ecorePackage.getEInt(), "Operational_Code", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Log(), ecorePackage.getEString(), "Log", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Task_Category(), ecorePackage.getEString(), "Task_Category", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Keywords(), ecorePackage.getEString(), "Keywords", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Computer(), ecorePackage.getEString(), "Computer", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_DateAndTime(), ecorePackage.getEDate(), "dateAndTime", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Process_Id(), ecorePackage.getEInt(), "Process_Id", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Thread_Id(), ecorePackage.getEInt(), "Thread_Id", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Processor_Id(), ecorePackage.getEInt(), "Processor_Id", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Session_Id(), ecorePackage.getEInt(), "Session_Id", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Kernel_Time(), ecorePackage.getEDate(), "Kernel_Time", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_User_Time(), ecorePackage.getEDate(), "User_Time", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Processor_Time(), ecorePackage.getEDate(), "Processor_Time", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Correlation_Id(), ecorePackage.getEString(), "Correlation_Id", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Relative_Correlation_Id(), ecorePackage.getEInt(), "Relative_Correlation_Id", "-1", 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_Level(), this.getLevel(), "Level", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowsEventLog_S_Id(), ecorePackage.getEString(), "S_Id", null, 0, 1, WindowsEventLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getWindowsEventLog__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getWindowsEventLog__ToString__String(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "delimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.UNDEFINED);
		addEEnumLiteral(levelEEnum, Level.CRITICAL);
		addEEnumLiteral(levelEEnum, Level.ERROR);
		addEEnumLiteral(levelEEnum, Level.WARNING);
		addEEnumLiteral(levelEEnum, Level.INFORMATION);
		addEEnumLiteral(levelEEnum, Level.FAILURE_AUDIT);
		addEEnumLiteral(levelEEnum, Level.SUCCESS_AUDIT);

		// Create resource
		createResource(eNS_URI);
	}

} //WindowsEventPackageImpl
