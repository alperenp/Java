/**
 */
package TreeNodeXML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Node Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TreeNodeXML.TreeNodeAtom#getAttributeLocalName <em>Attribute Local Name</em>}</li>
 *   <li>{@link TreeNodeXML.TreeNodeAtom#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 *
 * @see TreeNodeXML.TreeNodeXMLPackage#getTreeNodeAtom()
 * @model
 * @generated
 */
public interface TreeNodeAtom extends EObject {
    /**
     * Returns the value of the '<em><b>Attribute Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Local Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Local Name</em>' attribute.
     * @see #setAttributeLocalName(String)
     * @see TreeNodeXML.TreeNodeXMLPackage#getTreeNodeAtom_AttributeLocalName()
     * @model
     * @generated
     */
    String getAttributeLocalName();

    /**
     * Sets the value of the '{@link TreeNodeXML.TreeNodeAtom#getAttributeLocalName <em>Attribute Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute Local Name</em>' attribute.
     * @see #getAttributeLocalName()
     * @generated
     */
    void setAttributeLocalName(String value);

    /**
     * Returns the value of the '<em><b>Attribute Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Value</em>' attribute.
     * @see #setAttributeValue(String)
     * @see TreeNodeXML.TreeNodeXMLPackage#getTreeNodeAtom_AttributeValue()
     * @model
     * @generated
     */
    String getAttributeValue();

    /**
     * Sets the value of the '{@link TreeNodeXML.TreeNodeAtom#getAttributeValue <em>Attribute Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute Value</em>' attribute.
     * @see #getAttributeValue()
     * @generated
     */
    void setAttributeValue(String value);

} // TreeNodeAtom
