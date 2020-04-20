package com.assignment.oo;


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;


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
	
	
	public static void main(String[] args) throws Exception{
		
		
		
		/*
		 * Reading CSV file into the array list using BufferedReader
		 * Found BufferedReader online
		 * https://www.guru99.com/buffered-reader-in-java.html
		 * (BufferedReader bufReader = new BufferedReader(new FileReader("MLdataCSVfile.csv"));)
		 */
		
		BufferedReader bufReader = new BufferedReader(new FileReader("MLdataCSVfile.csv")); 
		
		/*
		 * Creating ArrayList symptomsList
		 */
		ArrayList<String> symptomsList = new ArrayList<>();
		
		String line = bufReader.readLine(); 
		while (line != null) { 
			symptomsList.add(line); 
			line = bufReader.readLine();
			}
		
		bufReader.close();
		
		/*
		 * testing ArrayList to see if it works:
		 * 
		 * 
		 */
		 System.out.print(symptomsList);
		 
		
		  
		 
		
	}
}	
