package com.assignment.oo;
/**************************************************
 * 
 * 
 *  This class provides file reading and writing functionality
 *  file processing is in its own class
 *  and then just call it (i.e. instantiate) it from the various classes that need it (Job n Employee) 
 *   Author: Jake Bolger
 *  2020
 *  
 ************************************************************************************/

public class FileMaster {
	
	String fileName;
	
	// Constructor
		FileMaster (String fileName)
		{
			
			this.fileName = fileName;
			
		}

}
