package openiocschemagui;

//other libraries
import java.text.ParseException;
import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.stream.XMLStreamException;
import org.eclipse.emf.common.util.EList;

//GUI libraries
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

//Classes implemented in bdesoc.openIOC.schema.tree.node
import TreeNodeXML.XMLTreeNode;
import bdesoc.openIOC.schema.parser.openIOC_XML_parser;
import TreeNodeXML.TreeNodeAtom;

/**
 * Purpose:                 This module is designed for parsing xml, converting into tree and showing the tree with a GUI
 * Usage:                   Tree structure is represented with GUI
 * Input, output:           schemas from http://schemas.mandiant.com/ as xml, ouput is a tree structured of node objects on GUI
 * Author:                  alperenp
 * e-mail:                  alperen.pulur@semper-tech.com
 * Date:                    02.03.2016
 * Known missing features:  1- Tree nodes may collide or child nodes get mixed;
 *                             To fix it one can change parameter "horizontalSpaceBetweenChildren" or "FRACTION" to resize the tree
 *                          2- Tree nodes may not seen if left most children number increases
 *                             To fix it one can change x coordiante of root "rootX" parameter in order to shift tree to right
 *                          3- Program may got memory exception because xml parser and also GUI utilises a recursive method to work
 *                             To fix it please send an e-mail to Author.
 *                          4- Button size may required to be changed
 *                             To change its size, use parameters "width" and "height"
 * References:              bdesoc.openIOC.schema.tree.node & bdesoc.openIOC.schema.parser.openIOC_XML_parser
 * Note:                    theoratically this module can represent any tree on GUI
 */

public class View extends ViewPart
{
     //auto-generated global parameter
     public static final String ID = "openIOCSchemaGUI.view";

     // Required parameters for GUI
     private FormToolkit toolkit;
     private ScrolledForm form;
     

     //Required parameters for graphical representation
     private int rootX = 8192, rootY = 0;                   //location of starting point (location of root)
     private int horizontalSpaceBetweenChildren = 2048;     //whitespace between child nodes
     private int buttonWidth = 100, buttonHeight = 75;      //size of node
     private int verticalSpace = 150;                       //vertical space between children and parent
     private double FRACTION = (double) 3 / 4;              //fraction for horizontal space from parent to child (childspace = parentspace * FRACTION)

     //auto generated class
     class ViewLabelProvider extends LabelProvider
     {
          public String getColumnText(Object obj, int index)
          {
               return getText(obj);
          }

          public Image getColumnImage(Object obj, int index)
          {
               return getImage(obj);
          }

          public Image getImage(Object obj)
          {
               return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
          }
     }

     /* This function gets the absolute file path to read data (for reading input) */
     private String getFilePath()
     {
          String filename = "mir.w32eventlogs.xsd.xml";
          String workingDirectory = System.getProperty("user.dir");
          //***************************************************************
          //***************************************************************
          //C:\Program Files(x86)\eclipse\  inputForPluginDir \ fileName
          String absoluteFilePath = workingDirectory + File.separator + "inputForPluginDir" + File.separator + filename;
          //***************************************************************
          //***************************************************************
          return absoluteFilePath;
     }

     /* Reads XML file to generate a tree and returns root of the tree */
     public XMLTreeNode getRoot() throws FileNotFoundException, XMLStreamException, ParseException
     {
          String absoluteFilePath = getFilePath();
          openIOC_XML_parser xmlParser = new openIOC_XML_parser(absoluteFilePath);
          XMLTreeNode treeNode = xmlParser.readXML();
          return treeNode;
     }

     /* This function puts tree into GUI as button nodes. To do it, it utilizes recursion */
     private void putNodesInGraph(XMLTreeNode root)
     {
          recursivelyPutButtonAsNode(root, rootX, rootY, horizontalSpaceBetweenChildren);
     }

     /* Recursive funcion to put nodes as GUI Button and calls itself for child nodes (recursion)*/
     private void recursivelyPutButtonAsNode(XMLTreeNode node, double x, int y, double horizontalSpaceBetweenChildren)
     {
          generateNodeAsButton(form.getBody(), node, (int) x, y, buttonWidth, buttonHeight);
          EList<XMLTreeNode> children = node.getChildren();
          if (children.size() > 0)
          {
               //horizontal space calculation from parent to child (childspace = parentspace * FRACTION)
               double newHorizontalSpace = (horizontalSpaceBetweenChildren * FRACTION);
               
               //total width of children nodes = (children# * buttonwidth) + (totalSpaceBetweenChildren)
               int childrenTotalWidth = (children.size() * buttonWidth) + ((children.size() - 1) * (int) newHorizontalSpace);
               
               for (int i = 0; i < children.size(); i++)
               {
                    XMLTreeNode child = children.get(i);
                    double xCoordinateOfChild = x - (childrenTotalWidth / 2) + (i * (newHorizontalSpace + buttonWidth));
                    
				//drawing a line between parent and child nodes
                    drawLine((int) x + (buttonWidth/2), y + buttonHeight, (int) xCoordinateOfChild + (buttonWidth/2), y + verticalSpace);
                    
                    recursivelyPutButtonAsNode(child, xCoordinateOfChild, y + verticalSpace, newHorizontalSpace);
               }
          }
     }
     
     /* This function draws a line starting from (fromX, fromY), to (toX, toY) points on the scrolledForm */
     private void drawLine(int fromX, int fromY, int toX, int toY)
     {
          form.getBody().addPaintListener(new PaintListener() {
               public void paintControl(PaintEvent e) {
                    e.gc.drawLine(fromX, fromY, toX, toY);
                }
          });
     }

     /* Generates buttons which is going to represent nodes of the graph.
     * If user would like to see details, s/he simply pushes the button*/
     private Button generateNodeAsButton(Composite guiParent, XMLTreeNode node, int x, int y, int width, int height)
     {
          Button button = new Button(guiParent, SWT.PUSH);
          button.setText(node.getLocalName());
          //set button location and size from component information
          button.setBounds(x, y, width, height);
          //add button listener for click event
          pressTreeNodeListener(guiParent, button, node);
          return button;
     }

     /* Button Click Listener function for given button to open a new dialog for details of node */
     private void pressTreeNodeListener(Composite guiParent, Button button, XMLTreeNode node)
     {
          button.addListener(SWT.Selection, new Listener()
          {
               int fontHeight = 28;
               int initialYcoordinate = 10;
               int initialXcoordinate = 10;

               public void handleEvent(Event e)
               {
                    switch (e.type)
                    {
                         case SWT.Selection:
                              // Generate a new dialog for showing details of node
                              Shell dialog = new Shell(guiParent.getShell(), SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM);
                              dialog.setText("Node Details");
                              dialog.setSize(300, 300);
                              for (int i = 0; i < node.getValues().size(); i++)
                              {
                                   TreeNodeAtom atom = node.getValues().get(i);
                                   String labelTxt = atom.getAttributeLocalName() + " = " + atom.getAttributeValue();
                                   generateLabel(dialog, labelTxt, initialXcoordinate, initialYcoordinate + ((i + 1) * fontHeight), fontHeight, labelTxt.length() * 6);
                              }
                              dialog.open();
                              break;
                    }
               }
          });
     }

     /* generates a label with given parent, text, location and size */
     private Label generateLabel(Shell parent, String text, int x, int y, int height, int width)
     {
          Label label = new Label(parent, SWT.NONE);
          label.setText(text);
          label.setBounds(x, y, text.length() * 6, height);
          return label;
     }

     /**
     * This is a callback that will allow us to create the viewer and initialize
     * it. (Main function to develop GUI functionalities)
     */
     public void createPartControl(Composite parent)
     {
          toolkit = new FormToolkit(parent.getDisplay());
          form = toolkit.createScrolledForm(parent);
          form.setText("openIOC Schema");
          
          try
          {
               //get test nodes for visualisation
               XMLTreeNode root = getRoot();
               putNodesInGraph(root);
          }
          catch (FileNotFoundException e)
          {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }
          catch (XMLStreamException e)
          {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }
          catch (ParseException e)
          {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }
     }
     
     
     
     /**
      * Passing the focus request to the form.
      */
     public void setFocus()
     {
          form.setFocus();
     }

     /**
     * Disposes the toolkit
     */
     public void dispose()
     {
          toolkit.dispose();
          super.dispose();
     }
}