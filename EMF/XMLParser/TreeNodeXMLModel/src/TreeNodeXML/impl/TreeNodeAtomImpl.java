/**
 */
package TreeNodeXML.impl;

import TreeNodeXML.TreeNodeAtom;
import TreeNodeXML.TreeNodeXMLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Node Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TreeNodeXML.impl.TreeNodeAtomImpl#getAttributeLocalName <em>Attribute Local Name</em>}</li>
 *   <li>{@link TreeNodeXML.impl.TreeNodeAtomImpl#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeNodeAtomImpl extends MinimalEObjectImpl.Container implements TreeNodeAtom {
    /**
     * The default value of the '{@link #getAttributeLocalName() <em>Attribute Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeLocalName()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTE_LOCAL_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttributeLocalName() <em>Attribute Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeLocalName()
     * @generated
     * @ordered
     */
    protected String attributeLocalName = ATTRIBUTE_LOCAL_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeValue()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTE_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttributeValue() <em>Attribute Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeValue()
     * @generated
     * @ordered
     */
    protected String attributeValue = ATTRIBUTE_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TreeNodeAtomImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TreeNodeXMLPackage.Literals.TREE_NODE_ATOM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttributeLocalName() {
        return attributeLocalName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeLocalName(String newAttributeLocalName) {
        String oldAttributeLocalName = attributeLocalName;
        attributeLocalName = newAttributeLocalName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME, oldAttributeLocalName, attributeLocalName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeValue(String newAttributeValue) {
        String oldAttributeValue = attributeValue;
        attributeValue = newAttributeValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_VALUE, oldAttributeValue, attributeValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME:
                return getAttributeLocalName();
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_VALUE:
                return getAttributeValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME:
                setAttributeLocalName((String)newValue);
                return;
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_VALUE:
                setAttributeValue((String)newValue);
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
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME:
                setAttributeLocalName(ATTRIBUTE_LOCAL_NAME_EDEFAULT);
                return;
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_VALUE:
                setAttributeValue(ATTRIBUTE_VALUE_EDEFAULT);
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
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_LOCAL_NAME:
                return ATTRIBUTE_LOCAL_NAME_EDEFAULT == null ? attributeLocalName != null : !ATTRIBUTE_LOCAL_NAME_EDEFAULT.equals(attributeLocalName);
            case TreeNodeXMLPackage.TREE_NODE_ATOM__ATTRIBUTE_VALUE:
                return ATTRIBUTE_VALUE_EDEFAULT == null ? attributeValue != null : !ATTRIBUTE_VALUE_EDEFAULT.equals(attributeValue);
        }
        return super.eIsSet(featureID);
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
        result.append(" (AttributeLocalName: ");
        result.append(attributeLocalName);
        result.append(", AttributeValue: ");
        result.append(attributeValue);
        result.append(')');
        return result.toString();
    }

} //TreeNodeAtomImpl
