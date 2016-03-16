package bdesoc.log.analysis.windowseventparser;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import semper.gtarc.bdesoc.event.model.windowsEvent.Level;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventFactory;
import semper.gtarc.bdesoc.event.model.windowsEvent.WindowsEventLog;

/**
 * Purpose: 				This module is designed for showing parse operation for Windows Event files from XML.
 * Usage:					Function demo for future use
 * Input, output: 			windows event xml file, list of Windows Event objects 
 * Author: 					alperenp
 * e-mail:  				alperen.pulur@semper-tech.com
 * Date:					21.12.2015
 * Known missing features: Currently parser cannot parse the following (due to missing entries in xml samples):
  							- User (or username)
  							- Processor ID
  							- Session ID
  							- User Time
  							- Processor Time
  							- Relative Correlation ID
 * References: 				semper.gtarc.bdesoc.event.model.windowsEvent
 * Note: 					N/A
 * */

public class windowsEventParser {
	String filename;
	
	
	/**
	 * 
	 * 
	 * PUBLIC FUNCTIONS
	 * 
	 * */
	
	/*--- Constructor ---*/
	/* convert windows path to java compatible (linux-type) file path and sets filename*/
	public windowsEventParser(String absolutePath)
	{
		this.filename = absolutePath.replaceAll("\\\\", "/");
	}
	
	/*--- Output of List of Windows Event Objects ---*/	
	public static void PrintList(ArrayList<WindowsEventLog> eventList)
	{
		for (WindowsEventLog windowsEventLog : eventList) {
			System.out.println(windowsEventLog.toString());
		}
	}
	
	/*
	 * reads WindowsEvent file which is located in "filename"
	 * 
	 * returns List of WindowsEvent Objects
	 * */
	public ArrayList<WindowsEventLog> readWinEvent() throws XMLStreamException, FileNotFoundException, ParseException
	{
		XMLInputFactory factory = XMLInputFactory.newInstance();
		
		XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(filename));
		
		WindowsEventFactory wef = WindowsEventFactory.eINSTANCE;
		ArrayList<WindowsEventLog> eventList = null;
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{
				case XMLStreamConstants.START_ELEMENT:
					if("Events".equals(reader.getLocalName())){
						eventList = EventsTag(reader, wef);
					}
			}
			
		}		
		reader.close();
		return eventList;
	}
	
	/**
	 * 
	 * 
	 * PRIVATE FUNCTIONS
	 * 
	 * */
	
	//------------------------------------------------------------------\\
	//		reader.getAttributeValue(0) => <Tag=AttributeValue /Tag>	\\
	//		reader.getElementText()	  => <Tag>ElementText</Tag>			\\
	//------------------------------------------------------------------\\
	
	/*--- Iterates through Events Tag in WindowsEvent File ---*/
	private ArrayList<WindowsEventLog> EventsTag(XMLStreamReader reader,WindowsEventFactory wef ) throws XMLStreamException, ParseException
	{		
		ArrayList<WindowsEventLog> eventList = new ArrayList<WindowsEventLog>();
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{
				case XMLStreamConstants.START_ELEMENT:
					if("Event".equals(reader.getLocalName()))
					{
						WindowsEventLog we = wef.createWindowsEventLog();
						EventTag(reader, we);
						eventList.add(we);
					}
					break;
			}
		}
		return eventList;
	}
	
	/*--- Iterates through Event Tag in WindowsEvent File ---*/
	private void EventTag(XMLStreamReader reader, WindowsEventLog we) throws XMLStreamException, ParseException
	{
		//System.out.println("++++++++ EVENT ++++++++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{
				case XMLStreamConstants.START_ELEMENT:
					if("System".equals(reader.getLocalName()))
					{
						SystemTag(reader, we);
					}
					else if("EventData".equals(reader.getLocalName()))
					{
						EventDataTag(reader, we);
					}
					else if("UserData".equals(reader.getLocalName()))
					{
						UserDataTag(reader, we);
					}
					else if("RenderingInfo".equals(reader.getLocalName()))
					{
						RenderingInfoTag(reader, we);
					}	
					break;
				case XMLStreamConstants.END_ELEMENT:
					if("Event".equals(reader.getLocalName()))
					{						
						//System.out.println("-------- EVENT --------");
						return;
					}					
			}
		}
	}
	
	/*--- Iterates through System Tag in WindowsEvent File ---*/
	private void SystemTag(XMLStreamReader reader, WindowsEventLog we) throws XMLStreamException, ParseException
	{
		//System.out.println("+++SystemTag+++");
		while(reader.hasNext())
		{
			int event = reader.next();
			
			switch(event)
			{				
				case XMLStreamConstants.START_ELEMENT:
					if("TimeCreated".equals(reader.getLocalName()))
					{
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); //2014-10-29T13:26:18.000000000Z
						Date d = sdf.parse(reader.getAttributeValue(0));
						we.setDateAndTime(d);
						//fill dateAndTime here
					}
					else if("EventID".equals(reader.getLocalName()))
					{
						we.setEvent_Id(Integer.parseInt(reader.getElementText()));
						//fill eventID here
					}
					else if("Level".equals(reader.getLocalName()))
					{
						//System.err.println(reader.getElementText());
						Level current_level = Level.get(Integer.parseInt(reader.getElementText()));
						we.setLevel(current_level);
						//fill Level as int value here
					}
					
					else if("Computer".equals(reader.getLocalName()))
					{
						we.setComputer(reader.getElementText());
						//fill computer here
					}
					else if("Opcode".equals(reader.getLocalName()))
					{
						int code = Integer.parseInt(reader.getElementText());
						we.setOperational_Code(code);
						//fill Operational Code here
					}
					else if("Execution".equals(reader.getLocalName()))
					{
						String processID=reader.getAttributeValue(0);
						String threadID =reader.getAttributeValue(1);
						we.setProcess_Id(Integer.parseInt(processID));
						we.setThread_Id(Integer.parseInt(threadID));
						//fill process id & thread id here
					}
					else if("Channel".equals(reader.getLocalName()))
					{
						we.setLog(reader.getElementText());
						//fill Log name here
					}
					
					else if("Provider".equals(reader.getLocalName()))
					{
						we.setSource(reader.getAttributeValue(0));
						//fill Source here
					}
					else if("Correlation".equals(reader.getLocalName()))
					{
						we.setCorrelation_Id(reader.getAttributeValue(0));
						//fill correlation here
					}
					else if("Security".equals(reader.getLocalName()))
					{						
						we.setS_Id(reader.getAttributeValue(0));
						//fill security ID here
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					if("System".equals(reader.getLocalName()))
					{
						//System.out.println("---SystemTag---");
						return;
					}
					break;
			}
		}
	}
	
	/*--- Iterates through RenderingInfo Tag in WindowsEvent File ---*/
	private void RenderingInfoTag(XMLStreamReader reader, WindowsEventLog we) throws XMLStreamException
	{
		//System.out.println("+++RenderingInfo+++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{				
				case XMLStreamConstants.START_ELEMENT:
					if("Task".equals(reader.getLocalName()))
					{
						String task = reader.getElementText();
						if (task.equals("") == false) {
							we.setTask_Category(task);
						}
						//fill Task here
					}
					else if("Keywords".equals(reader.getLocalName()))
					{
						KeywordsTag(reader, we);
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					if("RenderingInfo".equals(reader.getLocalName()))
					{
						//System.out.println("---RenderingInfo---");
						return;
					}
					break;
			}
		}
	}
	
	/*--- Iterates through Keywords Tag in WindowsEvent File ---*/
	private void KeywordsTag(XMLStreamReader reader, WindowsEventLog we) throws XMLStreamException
	{
		//System.out.println("+++Keywords+++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{				
				case XMLStreamConstants.START_ELEMENT:
					if("Keyword".equals(reader.getLocalName()))
					{	
						String keywordsuptonow = we.getKeywords();
						if(keywordsuptonow != null)
						{
							we.setKeywords(keywordsuptonow + "," + reader.getElementText());
						}
						else
						{
							we.setKeywords(reader.getElementText());
						}
					}
					break;
				case XMLStreamConstants.END_ELEMENT:
					if("Keywords".equals(reader.getLocalName()))
					{
						//System.out.println("---Keywords---");
						return;
					}
					break;
			}
		}
	}
	
	/*--- Iterates through EventData Tag in WindowsEvent File ---*/
	private void EventDataTag(XMLStreamReader reader, WindowsEventLog we) throws XMLStreamException
	{
		//System.out.println("+++EventData+++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{	
				case XMLStreamConstants.END_ELEMENT:
					if("EventData".equals(reader.getLocalName()))
					{
						//System.out.println("---EventData---");
						return;
					}
					break;
			}
		}
	}
	
	/*--- Iterates through UserData Tag in WindowsEvent File ---*/
	private void UserDataTag(XMLStreamReader reader, WindowsEventLog we) throws XMLStreamException
	{
		//System.out.println("+++UserData+++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{	
				case XMLStreamConstants.END_ELEMENT:
					if("UserData".equals(reader.getLocalName()))
					{
						//System.out.println("---UserData---");
						return;
					}
					break;
			}
		}
	}
	
	
	
	
	
	/* --- Example to use WindowsEventParser ---*/
	
    public static void main(String[] args) {
    	
    	String filename = "sample2.xml";
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = workingDirectory + File.separator + filename;
		
		windowsEventParser parser = new windowsEventParser(absoluteFilePath); 
		ArrayList<WindowsEventLog> eventList = null;
    	try {
    		eventList = parser.readWinEvent();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	// outputs the list into command line
    	windowsEventParser.PrintList(eventList);
    }
    
}
