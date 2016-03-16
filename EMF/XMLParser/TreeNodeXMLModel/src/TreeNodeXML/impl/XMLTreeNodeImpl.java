/**
 */
package TreeNodeXML.impl;

import TreeNodeXML.TreeNodeAtom;
import TreeNodeXML.TreeNodeXMLPackage;
import TreeNodeXML.XMLTreeNode;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TreeNodeXML.impl.XMLTreeNodeImpl#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link TreeNodeXML.impl.XMLTreeNodeImpl#getElementText <em>Element Text</em>}</li>
 *   <li>{@link TreeNodeXML.impl.XMLTreeNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link TreeNodeXML.impl.XMLTreeNodeImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLTreeNodeImpl extends MinimalEObjectImpl.Container implements XMLTreeNode {
    /**
     * The default value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalName()
     * @generated
     * @ordered
     */
    protected static final String LOCAL_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocalName() <em>Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalName()
     * @generated
     * @ordered
     */
    protected String localName = LOCAL_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getElementText() <em>Element Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementText()
     * @generated
     * @ordered
     */
    protected static final String ELEMENT_TEXT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getElementText() <em>Element Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementText()
     * @generated
     * @ordered
     */
    protected String elementText = ELEMENT_TEXT_EDEFAULT;

    /**
     * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChildren()
     * @generated
     * @ordered
     */
    protected EList<XMLTreeNode> children;

    /**
     * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValues()
     * @generated
     * @ordered
     */
    protected EList<TreeNodeAtom> values;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTreeNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TreeNodeXMLPackage.Literals.XML_TREE_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalName(String newLocalName) {
        String oldLocalName = localName;
        localName = newLocalName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TreeNodeXMLPackage.XML_TREE_NODE__LOCAL_NAME, oldLocalName, localName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getElementText() {
        return elementText;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElementText(String newElementText) {
        String oldElementText = elementText;
        elementText = newElementText;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TreeNodeXMLPackage.XML_TREE_NODE__ELEMENT_TEXT, oldElementText, elementText));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<XMLTreeNode> getChildren() {
        if (children == null) {
            children = new EObjectContainmentEList<XMLTreeNode>(XMLTreeNode.class, this, TreeNodeXMLPackage.XML_TREE_NODE__CHILDREN);
        }
        return children;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TreeNodeAtom> getValues() {
        if (values == null) {
            values = new EObjectContainmentEList<TreeNodeAtom>(TreeNodeAtom.class, this, TreeNodeXMLPackage.XML_TREE_NODE__VALUES);
        }
        return values;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addTreeNodeAtom(final TreeNodeAtom nodeAtom) {
        getValues().add(nodeAtom);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addChild(final XMLTreeNode newChild) {
        getChildren().add(newChild);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TreeNodeXMLPackage.XML_TREE_NODE__CHILDREN:
                return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
            case TreeNodeXMLPackage.XML_TREE_NODE__VALUES:
                return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TreeNodeXMLPackage.XML_TREE_NODE__LOCAL_NAME:
                return getLocalName();
            case TreeNodeXMLPackage.XML_TREE_NODE__ELEMENT_TEXT:
                return getElementText();
            case TreeNodeXMLPackage.XML_TREE_NODE__CHILDREN:
                return getChildren();
            case TreeNodeXMLPackage.XML_TREE_NODE__VALUES:
                return getValues();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TreeNodeXMLPackage.XML_TREE_NODE__LOCAL_NAME:
                setLocalName((String)newValue);
                return;
            case TreeNodeXMLPackage.XML_TREE_NODE__ELEMENT_TEXT:
                setElementText((String)newValue);
                return;
            case TreeNodeXMLPackage.XML_TREE_NODE__CHILDREN:
                getChildren().clear();
                getChildren().addAll((Collection<? extends XMLTreeNode>)newValue);
                return;
            case TreeNodeXMLPackage.XML_TREE_NODE__VALUES:
                getValues().clear();
                getValues().addAll((Collection<? extends TreeNodeAtom>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TreeNodeXMLPackage.XML_TREE_NODE__LOCAL_NAME:
                setLocalName(LOCAL_NAME_EDEFAULT);
                return;
            case TreeNodeXMLPackage.XML_TREE_NODE__ELEMENT_TEXT:
                setElementText(ELEMENT_TEXT_EDEFAULT);
                return;
            case TreeNodeXMLPackage.XML_TREE_NODE__CHILDREN:
                getChildren().clear();
                return;
            case TreeNodeXMLPackage.XML_TREE_NODE__VALUES:
                getValues().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TreeNodeXMLPackage.XML_TREE_NODE__LOCAL_NAME:
                return LOCAL_NAME_EDEFAULT == null ? localName != null : !LOCAL_NAME_EDEFAULT.equals(localName);
            case TreeNodeXMLPackage.XML_TREE_NODE__ELEMENT_TEXT:
                return ELEMENT_TEXT_EDEFAULT == null ? elementText != null : !ELEMENT_TEXT_EDEFAULT.equals(elementText);
            case TreeNodeXMLPackage.XML_TREE_NODE__CHILDREN:
                return children != null && !children.isEmpty();
            case TreeNodeXMLPackage.XML_TREE_NODE__VALUES:
                return values != null && !values.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case TreeNodeXMLPackage.XML_TREE_NODE___ADD_TREE_NODE_ATOM__TREENODEATOM:
                addTreeNodeAtom((TreeNodeAtom)arguments.get(0));
                return null;
            case TreeNodeXMLPackage.XML_TREE_NODE___ADD_CHILD__XMLTREENODE:
                addChild((XMLTreeNode)arguments.get(0));
                return null;
        }
        return super.eInvoke(operationID, arguments);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (LocalName: ");
        result.append(localName);
        result.append(", ElementText: ");
        result.append(elementText);
        result.append(')');
        return result.toString();
    }

} //XMLTreeNodeImpl
