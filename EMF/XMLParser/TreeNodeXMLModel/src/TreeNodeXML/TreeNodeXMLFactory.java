/**
 */
package TreeNodeXML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TreeNodeXML.TreeNodeXMLPackage
 * @generated
 */
public interface TreeNodeXMLFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TreeNodeXMLFactory eINSTANCE = TreeNodeXML.impl.TreeNodeXMLFactoryImpl.init();

    /**
     * Returns a new object of class '<em>XML Tree Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>XML Tree Node</em>'.
     * @generated
     */
    XMLTreeNode createXMLTreeNode();

    /**
     * Returns a new object of class '<em>Tree Node Atom</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Tree Node Atom</em>'.
     * @generated
     */
    TreeNodeAtom createTreeNodeAtom();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    TreeNodeXMLPackage getTreeNodeXMLPackage();

} //TreeNodeXMLFactory
