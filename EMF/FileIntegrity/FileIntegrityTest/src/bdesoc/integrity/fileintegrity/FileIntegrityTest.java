package bdesoc.integrity.fileintegrity;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import FileIntegrityTest.FileIntegrityChecker;
import FileIntegrityTest.FileIntegrityTestFactory;
import HashFunctions.MessageDigestFooNames;

/**
 * Purpose: 		This module is designed for testing file integrity.
 * Usage: 			Function demo for future use
 * Input, output: 	File in byte array, true or false file integrity check
 * Author: 			alperenp
 * e-mail: 			alperen.pulur@semper-tech.com
 * Date: 			01.12.2015
 * Any known bugs: 	N/A  
 * References: 		bdesoc.FileIntegrity
 * Note:			Since all type of data can be converted into byte arrays, test is applied for byte arrays.
*/


public class FileIntegrityTest {	
	
    /* Given a byte array, this function checks whether integrity test works correctly with cryptographic hash functions */
	public static void HashTest(byte[] fileBytes) throws NoSuchAlgorithmException
	{
		FileIntegrityTestFactory factory = FileIntegrityTestFactory.eINSTANCE;
		FileIntegrityChecker tester = factory.createFileIntegrityChecker();
		byte[] integrityCode = tester.CalculateHash(fileBytes);
		
		if (tester.IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.SHA256)) {
			System.out.println("integrity code is in sha256");
		} else {
			System.err.println("invalid file with sha256 integrity check");
		}
		
		if (tester.IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.MD5)) {
			System.out.println("integrity code is in md5");
		} else {
			System.err.println("invalid file with md5 integrity check");
		}
	}
	
	/* Given a byte array and key, this function checks whether integrity test works correctly with HMAC function */
	public static void HMACTest(byte[] fileBytes, byte[] key) throws InvalidKeyException, NoSuchAlgorithmException
	{
		FileIntegrityTestFactory factory = FileIntegrityTestFactory.eINSTANCE;
		FileIntegrityChecker tester = factory.createFileIntegrityChecker();
		byte[] integrityCode = tester.CalculateHMAC(fileBytes, key);
		
		if (tester.IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.SHA256, key)) {
			System.out.println("integrity code is in hmac with sha256");
		} else {
			System.err.println("invalid file with hmac-sha256 integrity check");
		}
		
		if (tester.IsIntegrated(fileBytes, integrityCode, MessageDigestFooNames.MD5, key)) {
			System.out.println("integrity code is in hmac with md5");
		} else {
			System.err.println("invalid file with hmac-md5 integrity check");
		}
	}
	
	/* This function is used to test the hash functions and HMAC whether they work correctly or not */
	public static void oldmain()
	{
	    try {
            byte[] fileBytes = Files.readAllBytes(Paths.get("C:\\Program Files (x86)\\Java\\jre1.8.0_71\\README.txt"));
            
            // Test for basic file integirty with cryptograpih hash functions
            HashTest(fileBytes);
            
            System.out.println();
            System.out.println();
            
            // Test for integrity with HMAC         
            byte[] hmacKey ="This is hmac key for 256b hmac calculation".getBytes();
            HMACTest(fileBytes, hmacKey);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	/* Given a parent directory, function recursively (i.e files also in sub-directories) adds all file names to fileNames ArrayList */
	public static void listOfFilesInDirectory(File parentDirectory, ArrayList<String> fileNames)
	{
	    File [] fileList = parentDirectory.listFiles();	    
	    for (File file : fileList)
	    {
	        if (file.isDirectory()) {
                listOfFilesInDirectory(file, fileNames);
            } else {
                fileNames.add(file.getAbsolutePath());
            }
        }
	    
	}
	/* Given two file paths, this function checks whether those files are identical of not.
	 * To do that, it utilises FileIntegrityChecker class */
	public static void CheckFilesAreIdentical(String fileName1, String fileName2) throws IOException, NoSuchAlgorithmException
	{
	    FileIntegrityTestFactory factory = FileIntegrityTestFactory.eINSTANCE;
        FileIntegrityChecker tester = factory.createFileIntegrityChecker();
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        
        // Checks whether both files exist in different directories
        if (file1.exists() && file2.exists()) {
            byte[] fileBytes1 = Files.readAllBytes(Paths.get(fileName1));
            byte[] fileBytes2 = Files.readAllBytes(Paths.get(fileName2));
            
            //integrity Code of file1
            byte[] integrityCode = tester.CalculateHash(fileBytes1);
            
            //Checks whether file1 and file2 are same with respect to their integrity Code            
            System.out.println(fileName1 + " --- " + fileName2 + " ====> Are files same?: " + tester.IsIntegrated(fileBytes2, integrityCode));
        }
	}
	
	/* Given two directory paths, this function first gets list of files existing in dirName1 (including its subdirectories)
	 * Then compares whether those files exist in same sub directory in dirName2 and whether both files are identical or not.*/
	public static void GivenTwoFilePathsCheckFilesAreIdentical(String dirName1, String dirName2)
	{
	    File parentDirectory1 = new File(dirName1);        
        
        //Get List of files in parentDirectory1 and its subdirectories
        ArrayList<String> fileNames = new ArrayList<String>();
        listOfFilesInDirectory(parentDirectory1, fileNames);
        
        
        for (String fileName : fileNames) {
            //Right hand side of absolutepath. Non-common part of dirName1
            String RHS = fileName.substring(dirName1.length(), fileName.length());
            
            //Check same files in dirName1 and dirName2
            try {
                CheckFilesAreIdentical(dirName1+RHS, dirName2+RHS);
            } catch (NoSuchAlgorithmException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
	public static void main(String[] args) 
	{	
	    String dirName1 = "C:\\Program Files (x86)\\Notepad++";
	    String dirName2 = "C:\\Program Files (x86)\\Notepad++";
	    GivenTwoFilePathsCheckFilesAreIdentical(dirName1, dirName2);
	}
}
