/**
 */
package TreeNodeXML.impl;

import TreeNodeXML.TreeNodeAtom;
import TreeNodeXML.TreeNodeXMLFactory;
import TreeNodeXML.TreeNodeXMLPackage;
import TreeNodeXML.XMLTreeNode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TreeNodeXMLPackageImpl extends EPackageImpl implements TreeNodeXMLPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass xmlTreeNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass treeNodeAtomEClass = null;

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
     * @see TreeNodeXML.TreeNodeXMLPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private TreeNodeXMLPackageImpl() {
        super(eNS_URI, TreeNodeXMLFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link TreeNodeXMLPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static TreeNodeXMLPackage init() {
        if (isInited) return (TreeNodeXMLPackage)EPackage.Registry.INSTANCE.getEPackage(TreeNodeXMLPackage.eNS_URI);

        // Obtain or create and register package
        TreeNodeXMLPackageImpl theTreeNodeXMLPackage = (TreeNodeXMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TreeNodeXMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TreeNodeXMLPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theTreeNodeXMLPackage.createPackageContents();

        // Initialize created meta-data
        theTreeNodeXMLPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theTreeNodeXMLPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(TreeNodeXMLPackage.eNS_URI, theTreeNodeXMLPackage);
        return theTreeNodeXMLPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getXMLTreeNode() {
        return xmlTreeNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLTreeNode_LocalName() {
        return (EAttribute)xmlTreeNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getXMLTreeNode_ElementText() {
        return (EAttribute)xmlTreeNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXMLTreeNode_Children() {
        return (EReference)xmlTreeNodeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getXMLTreeNode_Values() {
        return (EReference)xmlTreeNodeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getXMLTreeNode__AddTreeNodeAtom__TreeNodeAtom() {
        return xmlTreeNodeEClass.getEOperations().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EOperation getXMLTreeNode__AddChild__XMLTreeNode() {
        return xmlTreeNodeEClass.getEOperations().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTreeNodeAtom() {
        return treeNodeAtomEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNodeAtom_AttributeLocalName() {
        return (EAttribute)treeNodeAtomEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTreeNodeAtom_AttributeValue() {
        return (EAttribute)treeNodeAtomEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TreeNodeXMLFactory getTreeNodeXMLFactory() {
        return (TreeNodeXMLFactory)getEFactoryInstance();
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
        xmlTreeNodeEClass = createEClass(XML_TREE_NODE);
        createEAttribute(xmlTreeNodeEClass, XML_TREE_NODE__LOCAL_NAME);
        createEAttribute(xmlTreeNodeEClass, XML_TREE_NODE__ELEMENT_TEXT);
        createEReference(xmlTreeNodeEClass, XML_TREE_NODE__CHILDREN);
        createEReference(xmlTreeNodeEClass, XML_TREE_NODE__VALUES);
        createEOperation(xmlTreeNodeEClass, XML_TREE_NODE___ADD_TREE_NODE_ATOM__TREENODEATOM);
        createEOperation(xmlTreeNodeEClass, XML_TREE_NODE___ADD_CHILD__XMLTREENODE);

        treeNodeAtomEClass = createEClass(TREE_NODE_ATOM);
        createEAttribute(treeNodeAtomEClass, TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME);
        createEAttribute(treeNodeAtomEClass, TREE_NODE_ATOM__ATTRIBUTE_VALUE);
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
        initEClass(xmlTreeNodeEClass, XMLTreeNode.class, "XMLTreeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getXMLTreeNode_LocalName(), ecorePackage.getEString(), "LocalName", null, 0, 1, XMLTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getXMLTreeNode_ElementText(), ecorePackage.getEString(), "ElementText", null, 0, 1, XMLTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXMLTreeNode_Children(), this.getXMLTreeNode(), null, "children", null, 0, -1, XMLTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getXMLTreeNode_Values(), this.getTreeNodeAtom(), null, "values", null, 0, -1, XMLTreeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = initEOperation(getXMLTreeNode__AddTreeNodeAtom__TreeNodeAtom(), null, "addTreeNodeAtom", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getTreeNodeAtom(), "nodeAtom", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = initEOperation(getXMLTreeNode__AddChild__XMLTreeNode(), null, "addChild", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, this.getXMLTreeNode(), "newChild", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(treeNodeAtomEClass, TreeNodeAtom.class, "TreeNodeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTreeNodeAtom_AttributeLocalName(), ecorePackage.getEString(), "AttributeLocalName", null, 0, 1, TreeNodeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTreeNodeAtom_AttributeValue(), ecorePackage.getEString(), "AttributeValue", null, 0, 1, TreeNodeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //TreeNodeXMLPackageImpl
