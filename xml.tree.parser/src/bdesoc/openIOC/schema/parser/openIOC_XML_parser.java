package bdesoc.openIOC.schema.parser;

//java libraries used in this file
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.Queue;

// XML reader limbraries
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

//EMF List library
import org.eclipse.emf.common.util.EList;

// Classes implemented in bdesoc.openIOC.schema.tree.node
import TreeNodeXML.TreeNodeAtom;
import TreeNodeXML.TreeNodeXMLFactory;
import TreeNodeXML.XMLTreeNode;

/**
 * Purpose:                 This module is designed for parsing xml and put it into a tree structure
 * Usage:                   Function demo for future use
 * Input, output:           schemas from http://schemas.mandiant.com/ as xml, ouput is a tree structured of node objects
 * Author:                  alperenp
 * e-mail:                  alperen.pulur@semper-tech.com
 * Date:                    26.02.2016
 * Known missing features:  N/A                            
 * References:              bdesoc.openIOC.schema.tree.node
 * Note:                    theoratically this parser could parse xml and put the xml into a tree structure
 */
public class openIOC_XML_parser
{

     private String filename;
     private XMLStreamReader reader;
     private TreeNodeXMLFactory treeNodeFactory;

     private void generateFactories() throws FileNotFoundException, XMLStreamException
     {
          XMLInputFactory factory = XMLInputFactory.newInstance();
          reader = factory.createXMLStreamReader(new FileInputStream(filename));
          treeNodeFactory = TreeNodeXMLFactory.eINSTANCE;
     }

     /* recursively reads xml to construct a tree with pre-assumed xml properties.
     * Pre-assumed properties:
     *  - An xml node has name
     *  - An xml node have values those may change in number
     *  - An xml node have children which may change in number
     */
     private XMLTreeNode recursivelyRead() throws XMLStreamException
     {
          XMLTreeNode treeNode = null;
          while (reader.hasNext())
          {
               int event = reader.next();
               if (event == XMLStreamConstants.START_ELEMENT)
               {
                    treeNode = treeNodeFactory.createXMLTreeNode();
                    //Set name of current node
                    treeNode.setLocalName(reader.getLocalName());

                    //set values into current node
                    for (int i = 0; i < reader.getAttributeCount(); i++)
                    {
                         TreeNodeAtom nodeAtom = treeNodeFactory.createTreeNodeAtom();
                         reader.getAttributeName(i);
                         nodeAtom.setAttributeLocalName(reader.getAttributeName(i).toString());
                         nodeAtom.setAttributeValue(reader.getAttributeValue(i));
                         treeNode.addTreeNodeAtom(nodeAtom);
                    }

                    // Recursive calls for generating tree
                    // after each function terminates, parent node assigns returned result as its child
                    for (XMLTreeNode child = recursivelyRead(); child != null; child = recursivelyRead())
                    {
                         //System.out.println(treeNode.getLocalName() + " has child " + child.getLocalName());
                         treeNode.addChild(child);
                    }
                    return treeNode;
               } else if (event == XMLStreamConstants.END_ELEMENT)
               {
                    break;
               }
          }
          return treeNode;
     }

     /**
     *      
     * PUBLIC FUNCTIONS
     * 
     */
     /*--- Constructor ---*/
     /* convert windows path to java compatible (linux-type) file path and sets filename */
     public openIOC_XML_parser(String absolutePath)
     {
          this.filename = absolutePath.replaceAll("\\\\", "/");
     }

     /*
     * reads xml file which is located in "filename"
     * 
     * returns root of xml tree
     * */
     public XMLTreeNode readXML() throws XMLStreamException, FileNotFoundException, ParseException
     {
          generateFactories();
          //construct tree here
          XMLTreeNode root = recursivelyRead();
          //construct tree here        
          reader.close();
          return root;
     }

     /*prints given tree with respect to FIFO order */
     public static void printBFS(XMLTreeNode root)
     {
          Queue<XMLTreeNode> bfsQueue = new LinkedList<XMLTreeNode>();
          bfsQueue.add(root);
          while (bfsQueue.isEmpty() == false)
          {
               XMLTreeNode node = bfsQueue.poll();
               EList<TreeNodeAtom> values = node.getValues();
               System.out.println(node.getLocalName());
               for (TreeNodeAtom atom : values)
               {
                    System.out.println(atom.getAttributeLocalName() + " = " + atom.getAttributeValue());
               }

               EList<XMLTreeNode> children = node.getChildren();
               for (XMLTreeNode child : children)
               {
                    bfsQueue.add(child);
               }
               System.out.println();
          }
     }

     /*public static void main(String[] args)
     {
        String filename = "mir.w32eventlogs.xsd.xml";
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = workingDirectory + File.separator + filename;
        
        openIOC_XML_parser xmlParser = new openIOC_XML_parser(absoluteFilePath);
        try {
            XMLTreeNode treeNode = xmlParser.readXML();            
            xmlParser.printBFS(treeNode);            
        } catch (FileNotFoundException | XMLStreamException | ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }*/
}
