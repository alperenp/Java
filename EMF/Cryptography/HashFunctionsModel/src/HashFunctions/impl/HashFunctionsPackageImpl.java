/**
 */
package HashFunctions.impl;

import HashFunctions.CryptoHash;
import HashFunctions.HashFunctionsFactory;
import HashFunctions.HashFunctionsPackage;
import HashFunctions.MessageDigestFooNames;

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
public class HashFunctionsPackageImpl extends EPackageImpl implements HashFunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptoHashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hmacEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageDigestFooNamesEEnum = null;

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
	 * @see HashFunctions.HashFunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HashFunctionsPackageImpl() {
		super(eNS_URI, HashFunctionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HashFunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HashFunctionsPackage init() {
		if (isInited) return (HashFunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(HashFunctionsPackage.eNS_URI);

		// Obtain or create and register package
		HashFunctionsPackageImpl theHashFunctionsPackage = (HashFunctionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HashFunctionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HashFunctionsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theHashFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theHashFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHashFunctionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HashFunctionsPackage.eNS_URI, theHashFunctionsPackage);
		return theHashFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCryptoHash() {
		return cryptoHashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCryptoHash__CalculateHash__byte() {
		return cryptoHashEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCryptoHash__CalculateHash__byte_MessageDigestFooNames() {
		return cryptoHashEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHMAC() {
		return hmacEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMAC__CalculateHMAC__byte_MessageDigestFooNames_byte() {
		return hmacEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHMAC__CalculateHMAC__byte_byte() {
		return hmacEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageDigestFooNames() {
		return messageDigestFooNamesEEnum;
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
	public HashFunctionsFactory getHashFunctionsFactory() {
		return (HashFunctionsFactory)getEFactoryInstance();
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
		cryptoHashEClass = createEClass(CRYPTO_HASH);
		createEOperation(cryptoHashEClass, CRYPTO_HASH___CALCULATE_HASH__BYTE);
		createEOperation(cryptoHashEClass, CRYPTO_HASH___CALCULATE_HASH__BYTE_MESSAGEDIGESTFOONAMES);

		hmacEClass = createEClass(HMAC);
		createEOperation(hmacEClass, HMAC___CALCULATE_HMAC__BYTE_MESSAGEDIGESTFOONAMES_BYTE);
		createEOperation(hmacEClass, HMAC___CALCULATE_HMAC__BYTE_BYTE);

		// Create enums
		messageDigestFooNamesEEnum = createEEnum(MESSAGE_DIGEST_FOO_NAMES);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cryptoHashEClass, CryptoHash.class, "CryptoHash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCryptoHash__CalculateHash__byte(), ecorePackage.getEByteArray(), "CalculateHash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "inputBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());

		op = initEOperation(getCryptoHash__CalculateHash__byte_MessageDigestFooNames(), ecorePackage.getEByteArray(), "CalculateHash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "inputBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageDigestFooNames(), "selectedFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());

		initEClass(hmacEClass, HashFunctions.HMAC.class, "HMAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHMAC__CalculateHMAC__byte_MessageDigestFooNames_byte(), ecorePackage.getEByteArray(), "CalculateHMAC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "inputBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMessageDigestFooNames(), "selectedFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());
		addEException(op, this.getInvalidKeyException());

		op = initEOperation(getHMAC__CalculateHMAC__byte_byte(), ecorePackage.getEByteArray(), "CalculateHMAC", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "inputBytes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getNoSuchAlgorithmException());
		addEException(op, this.getInvalidKeyException());

		// Initialize enums and add enum literals
		initEEnum(messageDigestFooNamesEEnum, MessageDigestFooNames.class, "MessageDigestFooNames");
		addEEnumLiteral(messageDigestFooNamesEEnum, MessageDigestFooNames.MD5);
		addEEnumLiteral(messageDigestFooNamesEEnum, MessageDigestFooNames.SHA1);
		addEEnumLiteral(messageDigestFooNamesEEnum, MessageDigestFooNames.SHA256);
		addEEnumLiteral(messageDigestFooNamesEEnum, MessageDigestFooNames.SHA384);
		addEEnumLiteral(messageDigestFooNamesEEnum, MessageDigestFooNames.SHA512);

		// Initialize data types
		initEDataType(noSuchAlgorithmExceptionEDataType, NoSuchAlgorithmException.class, "NoSuchAlgorithmException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(invalidKeyExceptionEDataType, InvalidKeyException.class, "InvalidKeyException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HashFunctionsPackageImpl
