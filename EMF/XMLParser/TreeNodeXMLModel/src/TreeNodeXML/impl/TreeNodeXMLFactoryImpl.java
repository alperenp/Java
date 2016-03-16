/**
 */
package TreeNodeXML.impl;

import TreeNodeXML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeNodeXMLFactoryImpl extends EFactoryImpl implements TreeNodeXMLFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static TreeNodeXMLFactory init() {
        try {
            TreeNodeXMLFactory theTreeNodeXMLFactory = (TreeNodeXMLFactory)EPackage.Registry.INSTANCE.getEFactory(TreeNodeXMLPackage.eNS_URI);
            if (theTreeNodeXMLFactory != null) {
                return theTreeNodeXMLFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TreeNodeXMLFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreeNodeXMLFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TreeNodeXMLPackage.XML_TREE_NODE: return createXMLTreeNode();
            case TreeNodeXMLPackage.TREE_NODE_ATOM: return createTreeNodeAtom();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLTreeNode createXMLTreeNode() {
        XMLTreeNodeImpl xmlTreeNode = new XMLTreeNodeImpl();
        return xmlTreeNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreeNodeAtom createTreeNodeAtom() {
        TreeNodeAtomImpl treeNodeAtom = new TreeNodeAtomImpl();
        return treeNodeAtom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreeNodeXMLPackage getTreeNodeXMLPackage() {
        return (TreeNodeXMLPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static TreeNodeXMLPackage getPackage() {
        return TreeNodeXMLPackage.eINSTANCE;
    }

} //TreeNodeXMLFactoryImpl
