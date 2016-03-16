/**
 */
package FileIntegrityTest.util;

import FileIntegrityTest.*;

import HashFunctions.CryptoHash;
import HashFunctions.HMAC;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FileIntegrityTest.FileIntegrityTestPackage
 * @generated
 */
public class FileIntegrityTestAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FileIntegrityTestPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileIntegrityTestAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FileIntegrityTestPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileIntegrityTestSwitch<Adapter> modelSwitch =
		new FileIntegrityTestSwitch<Adapter>() {
			@Override
			public Adapter caseFileIntegrityChecker(FileIntegrityChecker object) {
				return createFileIntegrityCheckerAdapter();
			}
			@Override
			public Adapter caseCryptoHash(CryptoHash object) {
				return createCryptoHashAdapter();
			}
			@Override
			public Adapter caseHMAC(HMAC object) {
				return createHMACAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FileIntegrityTest.FileIntegrityChecker <em>File Integrity Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FileIntegrityTest.FileIntegrityChecker
	 * @generated
	 */
	public Adapter createFileIntegrityCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HashFunctions.CryptoHash <em>Crypto Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HashFunctions.CryptoHash
	 * @generated
	 */
	public Adapter createCryptoHashAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link HashFunctions.HMAC <em>HMAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see HashFunctions.HMAC
	 * @generated
	 */
	public Adapter createHMACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FileIntegrityTestAdapterFactory
