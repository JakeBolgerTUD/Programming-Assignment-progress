package com.assignment.oo;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
		 * Reading CSV file into the array list
		 */
		
		BufferedReader bufReader = new BufferedReader(new FileReader("MLdataCSVfile.csv")); 
		ArrayList<String> symptomsList = new ArrayList<>();
		
		String line = bufReader.readLine(); 
		while (line != null) { 
			symptomsList.add(line); 
			line = bufReader.readLine();
			}
		
		bufReader.close();
		
		System.out.println(symptomsList);
	}

		
	
}	
