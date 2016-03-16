/**
 */
package file_app_audit.impl;

import file_app_audit.File_App_Audit_Log;
import file_app_audit.File_app_auditFactory;
import file_app_audit.File_app_auditPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class File_app_auditPackageImpl extends EPackageImpl implements File_app_auditPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass file_App_Audit_LogEClass = null;

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
	 * @see file_app_audit.File_app_auditPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private File_app_auditPackageImpl() {
		super(eNS_URI, File_app_auditFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link File_app_auditPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static File_app_auditPackage init() {
		if (isInited) return (File_app_auditPackage)EPackage.Registry.INSTANCE.getEPackage(File_app_auditPackage.eNS_URI);

		// Obtain or create and register package
		File_app_auditPackageImpl theFile_app_auditPackage = (File_app_auditPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof File_app_auditPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new File_app_auditPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFile_app_auditPackage.createPackageContents();

		// Initialize created meta-data
		theFile_app_auditPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFile_app_auditPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(File_app_auditPackage.eNS_URI, theFile_app_auditPackage);
		return theFile_app_auditPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile_App_Audit_Log() {
		return file_App_Audit_LogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_FileName() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_ProcessName() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_WorkingDirectory() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_Time() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_UserName() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_DomainName() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_ProcessId() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_Ppid() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_App_Audit_Log_Syscall() {
		return (EAttribute)file_App_Audit_LogEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile_App_Audit_Log__ToString__String() {
		return file_App_Audit_LogEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFile_App_Audit_Log__ToString() {
		return file_App_Audit_LogEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File_app_auditFactory getFile_app_auditFactory() {
		return (File_app_auditFactory)getEFactoryInstance();
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
		file_App_Audit_LogEClass = createEClass(FILE_APP_AUDIT_LOG);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__FILE_NAME);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__PROCESS_NAME);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__WORKING_DIRECTORY);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__TIME);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__USER_NAME);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__DOMAIN_NAME);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__PROCESS_ID);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__PPID);
		createEAttribute(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG__SYSCALL);
		createEOperation(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG___TO_STRING__STRING);
		createEOperation(file_App_Audit_LogEClass, FILE_APP_AUDIT_LOG___TO_STRING);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(file_App_Audit_LogEClass, File_App_Audit_Log.class, "File_App_Audit_Log", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_App_Audit_Log_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_ProcessName(), ecorePackage.getEString(), "processName", null, 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_WorkingDirectory(), ecorePackage.getEString(), "workingDirectory", null, 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_Time(), ecorePackage.getEDate(), "time", null, 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_DomainName(), ecorePackage.getEString(), "domainName", null, 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_ProcessId(), ecorePackage.getEInt(), "processId", "-1", 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_Ppid(), ecorePackage.getEInt(), "ppid", "-1", 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_App_Audit_Log_Syscall(), ecorePackage.getEInt(), "syscall", "-1", 0, 1, File_App_Audit_Log.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getFile_App_Audit_Log__ToString__String(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "delimiter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFile_App_Audit_Log__ToString(), ecorePackage.getEString(), "toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //File_app_auditPackageImpl
