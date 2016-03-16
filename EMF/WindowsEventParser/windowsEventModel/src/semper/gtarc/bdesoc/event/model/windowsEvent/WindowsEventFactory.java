/**
 */
package semper.gtarc.bdesoc.event.model.windowsEvent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventPackage
 * @generated
 */
public interface WindowsEventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WindowsEventFactory eINSTANCE = semper.gtarc.bdesoc.event.model.windowsEvent.impl.WindowsEventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log</em>'.
	 * @generated
	 */
	WindowsEventLog createWindowsEventLog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WindowsEventPackage getWindowsEventPackage();

} //WindowsEventFactory
