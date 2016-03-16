/**
 */
package FileIntegrityTest.impl;

import FileIntegrityTest.CryptoHashFunctions;
import FileIntegrityTest.FileIntegrityChecker;
import FileIntegrityTest.FileIntegrityTestFactory;
import FileIntegrityTest.FileIntegrityTestPackage;

import HashFunctions.HashFunctionsPackage;

import HashFunctions.impl.HashFunctionsPackageImpl;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileIntegrityTestPackageImpl extends EPackageImpl implements FileIntegrityTestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileIntegrityCheckerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cryptoHashFunctionsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType noSuchAlgorithmExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType invalidKeyExceptionEDataType = null;

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
	 * @see FileIntegrityTest.FileIntegrityTestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FileIntegrityTestPackageImpl() {
		super(eNS_URI, FileIntegrityTestFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FileIntegrityTestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FileIntegrityTestPackage init() {
		if (isInited) return (FileIntegrityTestPackage)EPackage.Registry.INSTANCE.getEPackage(FileIntegrityTestPackage.eNS_URI);

		// Obtain or create and register package
		FileIntegrityTestPackageImpl theFileIntegrityTestPackage = (FileIntegrityTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FileIntegrityTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FileIntegrityTestPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		HashFunctionsPackageImpl theHashFunctionsPackage = (HashFunctionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HashFunctionsPackage.eNS_URI) instanceof HashFunctionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HashFunctionsPackage.eNS_URI) : HashFunctionsPackage.eINSTANCE);

		// Create package meta-data objects
		theFileIntegrityTestPackage.createPackageContents();
		theHashFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theFileIntegrityTestPackage.initializePackageContents();
		theHashFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFileIntegrityTestPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FileIntegrityTestPackage.eNS_URI, theFileIntegrityTestPackage);
		return theFileIntegrityTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileIntegrityChecker() {
		return fileIntegrityCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileIntegrityChecker__IsIntegrated__byte_byte() {
		return fileIntegrityCheckerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames() {
		return fileIntegrityCheckerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames_byte() {
		return fileIntegrityCheckerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFileIntegrityChecker__IsIntegrated__byte_byte_byte() {
		return fileIntegrityCheckerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCryptoHashFunctions() {
		return cryptoHashFunctionsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNoSuchAlgorithmException() {
		return noSuchAlgorithmExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInvalidKeyException() {
		return invalidKeyExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileIntegrityTestFactory getFileIntegrityTestFactory() {
		return (FileIntegrityTestFactory)getEFactoryInstance();
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
		fileIntegrityCheckerEClass = createEClass(FILE_INTEGRITY_CHECKER);
		createEOperation(fileIntegrityCheckerEClass, FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE);
		createEOperation(fileIntegrityCheckerEClass, FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES);
		createEOperation(fileIntegrityCheckerEClass, FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_MESSAGEDIGESTFOONAMES_BYTE);
		createEOperation(fileIntegrityCheckerEClass, FILE_INTEGRITY_CHECKER___IS_INTEGRATED__BYTE_BYTE_BYTE);

		// Create enums
		cryptoHashFunctionsEEnum = createEEnum(CRYPTO_HASH_FUNCTIONS);

		// Create data types
		noSuchAlgorithmExceptionEDataType = createEDataType(NO_SUCH_ALGORITHM_EXCEPTION);
		invalidKeyExceptionEDataType = createEDataType(INVALID_KEY_EXCEPTION);
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

		// Obtain other dependent packages
		HashFunctionsPackage theHashFunctionsPackage = (HashFunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(HashFunctionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fileIntegrityCheckerEClass.getESuperTypes().add(theHashFunctionsPackage.getCryptoHash());
		fileIntegrityCheckerEClass.getESuperTypes().add(theHashFunctionsPackage.getHMAC());

		// Initialize classes, features, and operations; add parameters
		initEClass(fileIntegrityCheckerEClass, FileIntegrityChecker.class, "FileIntegrityChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getFileIntegrityChecker__IsIntegrated__byte_byte(), ecorePackage.getEBoolean(), "IsIntegrated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "fileBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "integrityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());

		op = initEOperation(getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames(), ecorePackage.getEBoolean(), "IsIntegrated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "fileBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "integrityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHashFunctionsPackage.getMessageDigestFooNames(), "IntegrityFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());

		op = initEOperation(getFileIntegrityChecker__IsIntegrated__byte_byte_MessageDigestFooNames_byte(), ecorePackage.getEBoolean(), "IsIntegrated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "fileBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "integrityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theHashFunctionsPackage.getMessageDigestFooNames(), "IntegrityFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());
		addEException(op, this.getInvalidKeyException());

		op = initEOperation(getFileIntegrityChecker__IsIntegrated__byte_byte_byte(), ecorePackage.getEBoolean(), "IsIntegrated", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "fileBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "integrityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());
		addEException(op, this.getInvalidKeyException());

		// Initialize enums and add enum literals
		initEEnum(cryptoHashFunctionsEEnum, CryptoHashFunctions.class, "CryptoHashFunctions");
		addEEnumLiteral(cryptoHashFunctionsEEnum, CryptoHashFunctions.MD5);
		addEEnumLiteral(cryptoHashFunctionsEEnum, CryptoHashFunctions.SHA1);
		addEEnumLiteral(cryptoHashFunctionsEEnum, CryptoHashFunctions.SHA256);
		addEEnumLiteral(cryptoHashFunctionsEEnum, CryptoHashFunctions.SHA384);
		addEEnumLiteral(cryptoHashFunctionsEEnum, CryptoHashFunctions.SHA512);

		// Initialize data types
		initEDataType(noSuchAlgorithmExceptionEDataType, NoSuchAlgorithmException.class, "NoSuchAlgorithmException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidKeyExceptionEDataType, InvalidKeyException.class, "InvalidKeyException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FileIntegrityTestPackageImpl
