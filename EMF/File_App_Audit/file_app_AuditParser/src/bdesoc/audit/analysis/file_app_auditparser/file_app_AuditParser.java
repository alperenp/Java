package bdesoc.audit.analysis.file_app_auditparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import file_app_audit.File_App_Audit_Log;
import file_app_audit.File_app_auditFactory;

/**
 * Purpose: 		This module is designed for parsing file audit logs from windows and linux OS
 * Usage: 			Function demo for future use
 * Input, output: 	windows event xml file OR linux audit file, list of audit log objects
 * Author: 			alperenp
 * e-mail: 			alperen.pulur@semper-tech.com
 * Date: 			18.01.2016
 * Any known bugs: 	N/A  
 * References: 		bdesoc.audit.file_app_audit
*/
public class file_app_AuditParser {
	String filename;
	
	/*--- Constructor ---*/
	/* convert windows path to java compatible (linux-type) file path and sets filename*/
	file_app_AuditParser(String absolutePath)
	{
		this.filename = absolutePath.replaceAll("\\\\", "/");
	}
	/***********************************************************************************************************************/
	/***********************************************************************************************************************/
	/************************************************Windows File-App Parser************************************************/
	/***********************************************************************************************************************/
	/***********************************************************************************************************************/
	/*--- Iterates through Events Tag in WindowsEvent File ---*/
	private ArrayList<File_App_Audit_Log> EventsTag(XMLStreamReader reader, File_app_auditFactory auditFactory ) throws XMLStreamException, ParseException
	{
		ArrayList<File_App_Audit_Log> loglist = new ArrayList<File_App_Audit_Log>();
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{
				case XMLStreamConstants.START_ELEMENT:
					if("Event".equals(reader.getLocalName()))
					{
						File_App_Audit_Log auditLog = auditFactory.createFile_App_Audit_Log();						
						EventTag(reader, auditLog);
						if (auditLog.getFileName() != null) {
							loglist.add(auditLog);
						}
					}
					break;
			}
		}
		return loglist;
	}
	
	/*--- Iterates through Event Tag in WindowsEvent File ---*/
	private void EventTag(XMLStreamReader reader, File_App_Audit_Log auditLog) throws XMLStreamException, ParseException
	{
		boolean isAuditEvent = false;
		//System.out.println("++++++++ EVENT ++++++++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{
				case XMLStreamConstants.START_ELEMENT:
					if("System".equals(reader.getLocalName()))
					{
						//get time and date here
						isAuditEvent = SystemTag(reader, auditLog);
					}
					else if("EventData".equals(reader.getLocalName()) && isAuditEvent)
					{
						//get file and app relation here
						EventDataTag(reader, auditLog);
					}
					else if("UserData".equals(reader.getLocalName()))
					{
						//UserDataTag(reader/*, we*/);
					}
					else if("RenderingInfo".equals(reader.getLocalName()))
					{
						//RenderingInfoTag(reader/*, we*/);
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
	
	/*--- Iterates through EventData Tag in WindowsEvent File ---*/
	private void EventDataTag(XMLStreamReader reader, File_App_Audit_Log auditLog) throws XMLStreamException
	{
		//System.out.println("+++EventData+++");
		while(reader.hasNext())
		{
			int event = reader.next();
			switch(event)
			{	
				case XMLStreamConstants.START_ELEMENT:
					if (reader.getAttributeValue(0).equals("ObjectName"))
					{
						auditLog.setFileName(reader.getElementText());
						// set filename here
					}
					else if (reader.getAttributeValue(0).equals("ProcessName"))
					{
						auditLog.setProcessName(reader.getElementText());
						// set process name here						
					}
					else if(reader.getAttributeValue(0).equals("ProcessId"))
					{
						String pid = reader.getElementText();
						int pid_int = -1;
						try {
							pid_int = Integer.parseInt(pid);
						} catch (Exception e) {
							if (pid.startsWith("0x")) {
								pid_int = Integer.parseInt(pid.substring(2), 16);
							}
						}
						auditLog.setProcessId(pid_int);
					}
					else if (reader.getAttributeValue(0).equals("SubjectUserName"))
					{
						auditLog.setUserName(reader.getElementText());
						//set username here
					}
					else if (reader.getAttributeValue(0).equals("SubjectDomainName"))
					{
						auditLog.setDomainName(reader.getElementText());
						//set domeainname here
					}
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
	
	/*--- Iterates through System Tag in WindowsEvent File ---*/
	private boolean SystemTag(XMLStreamReader reader, File_App_Audit_Log auditLog) throws XMLStreamException, ParseException
	{
		boolean isAudit = false;
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
						auditLog.setTime(d);
						//fill dateAndTime here
					}
					
					else if("Provider".equals(reader.getLocalName()))
					{
						if ("Microsoft-Windows-Security-Auditing".equals(reader.getAttributeValue(0))) {
							isAudit = true;
						}
					}
					
					
					break;
				case XMLStreamConstants.END_ELEMENT:					
					if("System".equals(reader.getLocalName()))
					{
						//System.out.println("---SystemTag---");
						return isAudit;
					}
					break;
			}
		}
		return isAudit;
	}

	/* reads audit log file and generates List of File_App_Audit_Log objects according to data */
	public ArrayList<File_App_Audit_Log> ReadWindowsAudit() throws XMLStreamException, FileNotFoundException, ParseException
	{
		XMLInputFactory factory = XMLInputFactory.newInstance();		
		XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(filename));
		File_app_auditFactory auditFactory = File_app_auditFactory.eINSTANCE;
		ArrayList<File_App_Audit_Log> loglist = EventsTag(reader, auditFactory);
		return loglist;
		//Read filename and extract time, application, file triples
	}
	
	/***********************************************************************************************************************/
	/***********************************************************************************************************************/
	/**************************************************Linux File-App Parser************************************************/
	/***********************************************************************************************************************/
	/***********************************************************************************************************************/
	
	
	/*
	  	----
		time->Wed Jan  6 10:15:20 2016
		type=PROCTITLE msg=audit(1452068120.519:928): proctitle=2F7573722F6C69622F6A766D2F6A6176612D382D6F70656E6A646B2D616D6436342F62696E2F6A617661002D4466696C652E656E636F64696E673D5554462D38002D636C61737370617468002F686F6D652F616C706572656E2F776F726B73706163652F74656D702F62696E0074656D702E48656C6C6F576F726C64
		type=PATH msg=audit(1452068120.519:928): item=0 name="/home/alperen/Documents/alperen.txt" inode=1481641 dev=08:01 mode=0100664 ouid=1000 ogid=1000 rdev=00:00 nametype=NORMAL
		type=CWD msg=audit(1452068120.519:928):  cwd="/home/alperen/workspace/temp"
		type=SYSCALL msg=audit(1452068120.519:928): arch=c000003e syscall=2 success=yes exit=15 a0=7fba54122e30 a1=401 a2=1b6 a3=371 items=1 ppid=1663 pid=3111 auid=4294967295 uid=1000 gid=1000 euid=1000 suid=1000 fsuid=1000 egid=1000 sgid=1000 fsgid=1000 tty=(none) ses=4294967295 comm="java" exe="/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java" key=(null)
		----
	 */
	
	/* fill new File_App_Audit_Log object according to data read from audit log file */
	private void LineValuesArrayProcess(String[] lineValues, File_App_Audit_Log auditLog)
	{
		String type = lineValues[0].substring(lineValues[0].indexOf("=")+1);
		if (type.equals("PATH"))
		{
			//nameValue = "/path/to/that/file"";
			String nameValue = lineValues[3].substring(lineValues[3].indexOf('"')+1, lineValues[3].lastIndexOf('"'));
			auditLog.setFileName(nameValue);
			
			String timeValue = lineValues[1].substring(lineValues[1].indexOf("(")+1, lineValues[1].indexOf("."));
			long timeinmilisec = Long.parseLong(timeValue)*1000;
			auditLog.setTime(new Date(timeinmilisec));
		}
		else if(type.equals("CWD"))
		{
			//currentDirectory = "path/to/directory/which/source/of/modification";
			if (lineValues[3].equals("") == false) {
				String currentDirectory = lineValues[3].substring(lineValues[3].indexOf('"')+1, lineValues[3].length()-1);
				auditLog.setWorkingDirectory(currentDirectory);
			}			
		}
		else if(type.equals("SYSCALL"))
		{
			//processValue = "path/to/executable";
			String processValue = lineValues[25].substring(lineValues[25].indexOf('"')+1, lineValues[25].lastIndexOf('"'));
			auditLog.setProcessName(processValue);
			
			//syscall=86
			String syscallValue = lineValues[3].substring(lineValues[3].indexOf('=')+1);
			auditLog.setSyscall(Integer.parseInt(syscallValue));
			
			//pid=2562
			String pidValue = lineValues[12].substring(lineValues[12].indexOf('=')+1);
			auditLog.setProcessId(Integer.parseInt(pidValue));
			
			//ppid=1075
			String ppidValue = lineValues[11].substring(lineValues[11].indexOf('=')+1);
			auditLog.setPpid(Integer.parseInt(ppidValue));
		}
		
	}
	
	/* Selects the lines which are giving information about audit. */
	private void processLinuxAuditLine(String line, String delimiter, File_App_Audit_Log auditLog)
	{
		if (line.startsWith("time->") == false)
		{
			String[] lineValues = line.split(delimiter);
			LineValuesArrayProcess(lineValues, auditLog);		
		}		
	}
	
	/* reads audit file and generates List of File_App_Audit_Log objects */
	public ArrayList<File_App_Audit_Log> ReadLinuxAudit(String delimiter) throws FileNotFoundException, IOException
	{
		ArrayList<File_App_Audit_Log> loglist = new ArrayList<File_App_Audit_Log>();
		File_app_auditFactory auditFactory = File_app_auditFactory.eINSTANCE;
		try (BufferedReader br = new BufferedReader(new FileReader(filename)))
		{		    	    
			String line;		
			File_App_Audit_Log auditLog = null;
			while ((line = br.readLine()) != null)
			{
				if (line.equals("----"))
				{
					if (auditLog != null && auditLog.getFileName() != null) {						
						loglist.add(auditLog);
					}
					auditLog = auditFactory.createFile_App_Audit_Log();
				}
				else
				{
					processLinuxAuditLine(line, delimiter, auditLog);
					//fill auditclass here
				}
			}
			if (auditLog != null) {
				loglist.add(auditLog);
			}
			auditLog = auditFactory.createFile_App_Audit_Log();	
		}
		return loglist;
	}

	/*--- Output of List of File_App_Audit_Log Objects ---*/
	public static void PrintList(ArrayList<File_App_Audit_Log> loglist)
	{
		for (File_App_Audit_Log file_App_Audit_Log : loglist) {
			System.err.println(file_App_Audit_Log.toString());
		}
	}
	
	public static void main(String[] args)
	{		
		String filename = "windows_audit.xml";
		//String filename = "Linux_file_app_log.txt";
		String workingDirectory = System.getProperty("user.dir");
		String absoluteFilePath = workingDirectory + File.separator + filename;
		
		file_app_AuditParser parser = new file_app_AuditParser(absoluteFilePath);
		
		ArrayList<File_App_Audit_Log> loglist = null;
		try {
			loglist = parser.ReadWindowsAudit();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		/*try {
			loglist = parser.ReadLinuxAudit(" ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		file_app_AuditParser.PrintList(loglist);
	}
}
