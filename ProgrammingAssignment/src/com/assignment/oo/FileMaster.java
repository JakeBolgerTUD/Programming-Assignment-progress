package com.assignment.oo;

import java.io.PrintWriter;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;


/**************************************************
 * 
 * 
 *  This class provides file reading and writing functionality
 *  file processing is in its own class
 *  and then just call it (i.e. instantiate) it from the various classes that need it 
 *   Author: Jake Bolger
 *  2020
 *  
 ************************************************************************************/

public class FileMaster {
	
	String fileName;
	Scanner myScanner;
	PrintWriter pwInput;
	File fileExample;
	
	// Constructor
		FileMaster (String fileName)
		{
			
			this.fileName = fileName;
			
		}
		// get a connection to the file
		void connectToFile()
		{
			fileExample = new File(fileName);
		}
		
		// Read the file, returning a string of lines
	    String[] readFile()
	    {
	    
	    	String[] values = new String[6];
		    try
			{
		    	int i = 0;
		    	myScanner = new Scanner(fileExample); 
				 while (myScanner.hasNextLine())
				    {
				      
					 values[i] = myScanner.nextLine();
				      i++;
				    }
			}
			catch (FileNotFoundException e)
			{
				System.out.println("run time error " + e.getMessage());
			}
		    finally
		    {
		        return values;
		    }
	    }
	    
		// get hold of a Print writer object
	    void getFileWriter()
	    {
	    	try
	    	{
	    		pwInput = new PrintWriter(fileExample);
	    	}
	  		catch (FileNotFoundException e)
	  		{
	  			System.out.println("run time error " + e.getMessage());
	  		}
	    	
	    }	

		// write a string to the file
	    void writeLineToFile(String line)
	    {
	       System.out.println(line);
	  		pwInput.println(line);    	
	    }	

	    
	    
	    void closeReadFile()
	    {
			 myScanner.close();
	    }

	    void closeWriteFile()
	    {
			 pwInput.close();
	    }

	}

