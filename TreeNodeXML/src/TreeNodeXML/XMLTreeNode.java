/**
 */
package TreeNodeXML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TreeNodeXML.XMLTreeNode#getLocalName <em>Local Name</em>}</li>
 *   <li>{@link TreeNodeXML.XMLTreeNode#getElementText <em>Element Text</em>}</li>
 *   <li>{@link TreeNodeXML.XMLTreeNode#getChildren <em>Children</em>}</li>
 *   <li>{@link TreeNodeXML.XMLTreeNode#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see TreeNodeXML.TreeNodeXMLPackage#getXMLTreeNode()
 * @model
 * @generated
 */
public interface XMLTreeNode extends EObject {
    /**
     * Returns the value of the '<em><b>Local Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Name</em>' attribute.
     * @see #setLocalName(String)
     * @see TreeNodeXML.TreeNodeXMLPackage#getXMLTreeNode_LocalName()
     * @model
     * @generated
     */
    String getLocalName();

    /**
     * Sets the value of the '{@link TreeNodeXML.XMLTreeNode#getLocalName <em>Local Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Name</em>' attribute.
     * @see #getLocalName()
     * @generated
     */
    void setLocalName(String value);

    /**
     * Returns the value of the '<em><b>Element Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Text</em>' attribute.
     * @see #setElementText(String)
     * @see TreeNodeXML.TreeNodeXMLPackage#getXMLTreeNode_ElementText()
     * @model
     * @generated
     */
    String getElementText();

    /**
     * Sets the value of the '{@link TreeNodeXML.XMLTreeNode#getElementText <em>Element Text</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Text</em>' attribute.
     * @see #getElementText()
     * @generated
     */
    void setElementText(String value);

    /**
     * Returns the value of the '<em><b>Children</b></em>' containment reference list.
     * The list contents are of type {@link TreeNodeXML.XMLTreeNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Children</em>' containment reference list.
     * @see TreeNodeXML.TreeNodeXMLPackage#getXMLTreeNode_Children()
     * @model containment="true"
     * @generated
     */
    EList<XMLTreeNode> getChildren();

    /**
     * Returns the value of the '<em><b>Values</b></em>' containment reference list.
     * The list contents are of type {@link TreeNodeXML.TreeNodeAtom}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Values</em>' containment reference list.
     * @see TreeNodeXML.TreeNodeXMLPackage#getXMLTreeNode_Values()
     * @model containment="true"
     * @generated
     */
    EList<TreeNodeAtom> getValues();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='getValues().add(nodeAtom);'"
     * @generated
     */
    void addTreeNodeAtom(TreeNodeAtom nodeAtom);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='getChildren().add(newChild);'"
     * @generated
     */
    void addChild(XMLTreeNode newChild);

} // XMLTreeNode
