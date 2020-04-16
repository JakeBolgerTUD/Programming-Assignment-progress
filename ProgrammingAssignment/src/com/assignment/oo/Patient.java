package com.assignment.oo;

import java.util.ArrayList;

public class Patient extends NaiveBayes {
	
	/*
	 * Constructor that calls the NaiveBayes constructor
	 */
	public Patient(ArrayList<String> symptomsList, boolean haveCoronaVirus,  int amountHaveCorona, int amountWithoutCorona,
			int tempHotYes, int tempHotNo, int tempNormalYes, int tempNormalNo, 
			int tempCoolYes, int tempCoolNo, int tempColdYes, int tempColdNo,
			int achesYes, int achesNo, int noAchesYes, int noAchesNo, int coughYes,
			int coughNo, int noCoughYes, int noCoughNo, int soreThroatYes, int soreThroatNo,
			int noSoreThroatYes, int noSoreThroatNo, int dangerZoneYes, int dangerZoneNo,
			int noDangerZoneYes, int noDangerZoneNo) {
		
		/*
		 * From super class
		 */
		super(symptomsList, haveCoronaVirus, amountHaveCorona, amountWithoutCorona, 
				tempHotYes, tempHotNo, tempNormalYes, tempNormalNo, tempCoolYes,
				tempCoolNo, tempColdYes, tempColdNo, achesYes, achesNo, noAchesYes,
				noAchesNo,coughYes, coughNo, noCoughYes, noCoughNo, soreThroatYes, soreThroatNo,
				noSoreThroatYes, noSoreThroatNo, dangerZoneYes, dangerZoneNo, noDangerZoneYes,
				noDangerZoneNo);
		// TODO Auto-generated constructor stub
	}
}

	
