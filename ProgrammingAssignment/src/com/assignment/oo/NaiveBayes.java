package com.assignment.oo;

import java.util.ArrayList;

public class NaiveBayes {
	
	ArrayList<String> symptomsList;
	
	private boolean haveCoronaVirus;
	private int amountHaveCorona;
	private int amountWithoutCorona;
	
	/*
	 * Constructors
	 */
	public NaiveBayes(ArrayList <String> symptomsList) {
		
		this.setSymptomsList(symptomsList);
		this.dataSetWorkings(symptomsList);
	}
	
	private void setSymptomsList(ArrayList<String> symptomsList2) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * Work out all the probabilities
	 */
	public void dataSetWorkings(ArrayList <String> symptomsList) {
		for(int i = 0; i < symptomsList.size(); i++) {
			
			String[] symptom = symptomsList.get(i).split(",");
			
			
			 /*
			  *  check if the patients have CoronaVirus by checking fifth element
			  */
			 
			
			if(symptom[5].equals("yes")) {
				setHaveCoronaVirus(true);
				setAmountHaveCorona(getAmountHaveCorona() + 1);
				
				System.out.println(getAmountHaveCorona()); 
				 
					
			}
			else {
				setHaveCoronaVirus(false);
				setAmountWithoutCorona(getAmountWithoutCorona() + 1);
				
				System.out.println(getAmountWithoutCorona());
				 	
			}
		}
	}

	/**
	 * @return the haveCoronaVirus
	 */
	public boolean isHaveCoronaVirus() {
		return haveCoronaVirus;
	}

	/**
	 * @param haveCoronaVirus the haveCoronaVirus to set
	 */
	public void setHaveCoronaVirus(boolean haveCoronaVirus) {
		this.haveCoronaVirus = haveCoronaVirus;
	}

	/**
	 * @return the amountHaveCorona
	 */
	public int getAmountHaveCorona() {
		return amountHaveCorona;
	}

	/**
	 * @param amountHaveCorona the amountHaveCorona to set
	 */
	public void setAmountHaveCorona(int amountHaveCorona) {
		this.amountHaveCorona = amountHaveCorona;
	}

	/**
	 * @return the amountWithoutCorona
	 */
	public int getAmountWithoutCorona() {
		return amountWithoutCorona;
	}

	/**
	 * @param amountWithoutCorona the amountWithoutCorona to set
	 */
	public void setAmountWithoutCorona(int amountWithoutCorona) {
		this.amountWithoutCorona = amountWithoutCorona;
	}
}
	
	
		
	
	

/*

 * --Pre-Computations for Classifier--
 * 
 * 
 * Have CoronaVirus: p(yes) = 17/76, p(no) = 59/76
 * 
 * temperatureHot: p(yes) = 8/17, p(no) = 11/59
 * temperatureNormal: p(yes) = 8/17, p(no) = 26/59
 * temperatureCool: p(yes) = 1/17, p(no) = 17/59
 * temperatureCold: p(yes) = 0/17, p(no) = 5/59
 * 
 * achesYes: p(yes) = 12/17, p(no) = 11/59
 * achesNo: p(yes) = 5/17, p(no) = 48/59
 * 
 * coughYes: p(yes) = 13/17, p(no) = 33/59
 * coughNo: p(yes) = 4/17, p(no) = 26/59
 * 
 * soreThroatYes: p(yes) = 12/17, p(no) = 22/59
 * soreThroatNo: p(yes) = 5/17, p(no) = 37/59
 * 
 * dangerZoneYes: p(yes) = 11/17, p(no) = 11/59
 * dangerZoneNo: p(yes) = 6/17, p(no) = 48/59
 * 
 * -- --
 * 
 * 
 * 
 */


