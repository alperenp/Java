/**
 */
package TreeNodeXML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TreeNodeXML.TreeNodeXMLFactory
 * @model kind="package"
 * @generated
 */
public interface TreeNodeXMLPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "TreeNodeXML";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/TreeNodeXML";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TreeNodeXML";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TreeNodeXMLPackage eINSTANCE = TreeNodeXML.impl.TreeNodeXMLPackageImpl.init();

    /**
     * The meta object id for the '{@link TreeNodeXML.impl.XMLTreeNodeImpl <em>XML Tree Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TreeNodeXML.impl.XMLTreeNodeImpl
     * @see TreeNodeXML.impl.TreeNodeXMLPackageImpl#getXMLTreeNode()
     * @generated
     */
    int XML_TREE_NODE = 0;

    /**
     * The feature id for the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE__LOCAL_NAME = 0;

    /**
     * The feature id for the '<em><b>Element Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE__ELEMENT_TEXT = 1;

    /**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE__CHILDREN = 2;

    /**
     * The feature id for the '<em><b>Values</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE__VALUES = 3;

    /**
     * The number of structural features of the '<em>XML Tree Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE_FEATURE_COUNT = 4;

    /**
     * The operation id for the '<em>Add Tree Node Atom</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE___ADD_TREE_NODE_ATOM__TREENODEATOM = 0;

    /**
     * The operation id for the '<em>Add Child</em>' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE___ADD_CHILD__XMLTREENODE = 1;

    /**
     * The number of operations of the '<em>XML Tree Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TREE_NODE_OPERATION_COUNT = 2;

    /**
     * The meta object id for the '{@link TreeNodeXML.impl.TreeNodeAtomImpl <em>Tree Node Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see TreeNodeXML.impl.TreeNodeAtomImpl
     * @see TreeNodeXML.impl.TreeNodeXMLPackageImpl#getTreeNodeAtom()
     * @generated
     */
    int TREE_NODE_ATOM = 1;

    /**
     * The feature id for the '<em><b>Attribute Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME = 0;

    /**
     * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_ATOM__ATTRIBUTE_VALUE = 1;

    /**
     * The number of structural features of the '<em>Tree Node Atom</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_ATOM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Tree Node Atom</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TREE_NODE_ATOM_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link TreeNodeXML.XMLTreeNode <em>XML Tree Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>XML Tree Node</em>'.
     * @see TreeNodeXML.XMLTreeNode
     * @generated
     */
    EClass getXMLTreeNode();

    /**
     * Returns the meta object for the attribute '{@link TreeNodeXML.XMLTreeNode#getLocalName <em>Local Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Local Name</em>'.
     * @see TreeNodeXML.XMLTreeNode#getLocalName()
     * @see #getXMLTreeNode()
     * @generated
     */
    EAttribute getXMLTreeNode_LocalName();

    /**
     * Returns the meta object for the attribute '{@link TreeNodeXML.XMLTreeNode#getElementText <em>Element Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Element Text</em>'.
     * @see TreeNodeXML.XMLTreeNode#getElementText()
     * @see #getXMLTreeNode()
     * @generated
     */
    EAttribute getXMLTreeNode_ElementText();

    /**
     * Returns the meta object for the containment reference list '{@link TreeNodeXML.XMLTreeNode#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see TreeNodeXML.XMLTreeNode#getChildren()
     * @see #getXMLTreeNode()
     * @generated
     */
    EReference getXMLTreeNode_Children();

    /**
     * Returns the meta object for the containment reference list '{@link TreeNodeXML.XMLTreeNode#getValues <em>Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Values</em>'.
     * @see TreeNodeXML.XMLTreeNode#getValues()
     * @see #getXMLTreeNode()
     * @generated
     */
    EReference getXMLTreeNode_Values();

    /**
     * Returns the meta object for the '{@link TreeNodeXML.XMLTreeNode#addTreeNodeAtom(TreeNodeXML.TreeNodeAtom) <em>Add Tree Node Atom</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Tree Node Atom</em>' operation.
     * @see TreeNodeXML.XMLTreeNode#addTreeNodeAtom(TreeNodeXML.TreeNodeAtom)
     * @generated
     */
    EOperation getXMLTreeNode__AddTreeNodeAtom__TreeNodeAtom();

    /**
     * Returns the meta object for the '{@link TreeNodeXML.XMLTreeNode#addChild(TreeNodeXML.XMLTreeNode) <em>Add Child</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the '<em>Add Child</em>' operation.
     * @see TreeNodeXML.XMLTreeNode#addChild(TreeNodeXML.XMLTreeNode)
     * @generated
     */
    EOperation getXMLTreeNode__AddChild__XMLTreeNode();

    /**
     * Returns the meta object for class '{@link TreeNodeXML.TreeNodeAtom <em>Tree Node Atom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tree Node Atom</em>'.
     * @see TreeNodeXML.TreeNodeAtom
     * @generated
     */
    EClass getTreeNodeAtom();

    /**
     * Returns the meta object for the attribute '{@link TreeNodeXML.TreeNodeAtom#getAttributeLocalName <em>Attribute Local Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute Local Name</em>'.
     * @see TreeNodeXML.TreeNodeAtom#getAttributeLocalName()
     * @see #getTreeNodeAtom()
     * @generated
     */
    EAttribute getTreeNodeAtom_AttributeLocalName();

    /**
     * Returns the meta object for the attribute '{@link TreeNodeXML.TreeNodeAtom#getAttributeValue <em>Attribute Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attribute Value</em>'.
     * @see TreeNodeXML.TreeNodeAtom#getAttributeValue()
     * @see #getTreeNodeAtom()
     * @generated
     */
    EAttribute getTreeNodeAtom_AttributeValue();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TreeNodeXMLFactory getTreeNodeXMLFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link TreeNodeXML.impl.XMLTreeNodeImpl <em>XML Tree Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TreeNodeXML.impl.XMLTreeNodeImpl
         * @see TreeNodeXML.impl.TreeNodeXMLPackageImpl#getXMLTreeNode()
         * @generated
         */
        EClass XML_TREE_NODE = eINSTANCE.getXMLTreeNode();

        /**
         * The meta object literal for the '<em><b>Local Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_TREE_NODE__LOCAL_NAME = eINSTANCE.getXMLTreeNode_LocalName();

        /**
         * The meta object literal for the '<em><b>Element Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute XML_TREE_NODE__ELEMENT_TEXT = eINSTANCE.getXMLTreeNode_ElementText();

        /**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XML_TREE_NODE__CHILDREN = eINSTANCE.getXMLTreeNode_Children();

        /**
         * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference XML_TREE_NODE__VALUES = eINSTANCE.getXMLTreeNode_Values();

        /**
         * The meta object literal for the '<em><b>Add Tree Node Atom</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation XML_TREE_NODE___ADD_TREE_NODE_ATOM__TREENODEATOM = eINSTANCE.getXMLTreeNode__AddTreeNodeAtom__TreeNodeAtom();

        /**
         * The meta object literal for the '<em><b>Add Child</b></em>' operation.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EOperation XML_TREE_NODE___ADD_CHILD__XMLTREENODE = eINSTANCE.getXMLTreeNode__AddChild__XMLTreeNode();

        /**
         * The meta object literal for the '{@link TreeNodeXML.impl.TreeNodeAtomImpl <em>Tree Node Atom</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see TreeNodeXML.impl.TreeNodeAtomImpl
         * @see TreeNodeXML.impl.TreeNodeXMLPackageImpl#getTreeNodeAtom()
         * @generated
         */
        EClass TREE_NODE_ATOM = eINSTANCE.getTreeNodeAtom();

        /**
         * The meta object literal for the '<em><b>Attribute Local Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME = eINSTANCE.getTreeNodeAtom_AttributeLocalName();

        /**
         * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TREE_NODE_ATOM__ATTRIBUTE_VALUE = eINSTANCE.getTreeNodeAtom_AttributeValue();

    }

} //TreeNodeXMLPackage
