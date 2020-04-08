package com.assignment.oo;


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
	public static void main(String[] args) {
		String fileName = "MLdataCSVfile.csv";
		
		File file = new File(fileName);
		try {
			Scanner inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String MLdataCSVfile = inputStream.next();
				System.out.println(MLdataCSVfile);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}	
