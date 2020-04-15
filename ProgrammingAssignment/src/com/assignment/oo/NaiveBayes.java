package com.assignment.oo;

import java.util.ArrayList;

public class NaiveBayes {
	
	
	/*
	 * ArrayList taken from FileMaster class
	 */
	ArrayList<String> symptomsList;
	 
	
	/*
	 * Attributes for: Amount with CoronaVirus + without CoronaVirus and
	 * boolean variable(have the virus or not).
	 *
	 */
	private boolean haveCoronaVirus;
	private int amountHaveCorona;
	private int amountWithoutCorona;
	
	/*
	 * Have a hot temperature and have/don't have the CoronaVirus
	 */
	private int tempHotYes;
	private int tempHotNo;
	
	/*
	 * Have a normal temperature and have/don't have the CoronaVirus
	 */
	private int tempNormalYes;
	private int tempNormalNo;
	
	/*
	 * Have a cool temperature and have/don't have the CoronaVirus
	 */
	private int tempCoolYes;
	private int tempCoolNo;
		
	/*
	 * Have a cold temperature and have/don't have the CoronaVirus
	 */
	private int tempColdYes;
	private int tempColdNo;
	
	/*
	 * Have aches and have/dont't have the Virus
	 */
	private int achesYes = 0;
	private int achesNo = 0;
	
	/*
	 * Don't have aches and have/don't have the Virus
	 */
	private int noAchesYes = 0;
	private int noAchesNo = 0;
	
	/*
	 * Have cough and have/don't have Virus
	 */
	private int coughYes;
	private int coughNo;
	
	/*
	 * Don't have the cough and have/don't have the virus
	 */
	private int noCoughYes;
	private int noCoughNo;
	
	/*
	 * Have sore throat and have/don't have the virus
	 */
	private int soreThroatYes;
	private int soreThroatNo;
	
	/*
	 * Don't have sore throat and have/don't have the virus
	 */
	private int noSoreThroatYes;
	private int noSoreThroatNo;
	
	/*
	 * Recently traveled to danger zone and have/don't have virus
	 */
	private int dangerZoneYes;
	private int dangerZoneNo;
	
	/*
	 * Havn't Recently traveled to danger zone and have/don't have virus
	 */
	private int noDangerZoneYes;
	private int noDangerZoneNo;
	
	
	/*
	 * Constructor
	 */
	public NaiveBayes(ArrayList <String> symptomsList) {
		
		this.setSymptomsList(symptomsList);
		this.dataSetWorkings(symptomsList);
		
		
	}
	
			
	

	/*
	 * Work out all the probabilities
	 */
	public void dataSetWorkings(ArrayList <String> symptomsList) {
		
		/*
		 * Splits each person into separate ArrayList so they can be accessed
		 */
		for(int i = 0; i < symptomsList.size(); i++) {
			
			String[] symptom = symptomsList.get(i).split(",");
			
			
			 /*
			  *  check if the patients have CoronaVirus by checking last element
			  */			
			if(symptom[5].equals("yes")) {
				
				/*
				 * set have CoronaVirus true if the last element is "yes"
				 */
				setHaveCoronaVirus(true);
				
				/*
				 * Count amountHaveCorona
				 */
				setAmountHaveCorona(getAmountHaveCorona() + 1); 				 								
			
			
			}
			else {
				
				/*
				 * set have CoronaVirus false if the last element is "no"
				 */
				setHaveCoronaVirus(false);
				
				/*
				 * Count amountWithoutCorona
				 */
				setAmountWithoutCorona(getAmountWithoutCorona() + 1);
								
				 	
			}
			
			/*
			 * If the person has CoronaVirus
			 */
			if(isHaveCoronaVirus()) {
				
				/*
				 * If the first element(temperature) is hot, count tempHotYes
				 */
				if(symptom[0].contentEquals("hot")) {
					setTempHotYes(getTempHotYes() + 1);
				}
				
				/*
				 * If the first element(temperature) is normal, count tempNormalYes
				 */
				else if(symptom[0].contentEquals("normal")) {
					
					setTempNormalYes(getTempNormalYes() + 1);
				}
				
				/*
				 * If the first element(temperature) is cool, count tempCoolYes
				 */
				else if(symptom[0].contentEquals("cool")) {
					
					setTempCoolYes(getTempCoolYes() + 1);
				}
				
				/*
				 * If the first element(temperature) is cold, count tempColdYes
				 */
				else if(symptom[0].contentEquals("cold")) {
					
					setTempColdYes(getTempColdYes() + 1);
				}
				
				/*
				 * If the second element(Aches) is yes, count achesYes
				 */
				if(symptom[1].contentEquals("yes")) {
					setAchesYes(getAchesYes() + 1);
				}
				
				/*
				 * If the second element(Aches) is no, count noAchesYes
				 */
				else {
					
					setNoAchesYes(getNoAchesYes() + 1);
				}
				
				/*
				 * If the third element(Cough) is yes, count coughYes
				 */
				if(symptom[2].contentEquals("yes")) {
					
					setCoughYes(getCoughYes() + 1);
				}
				
				/*
				 * If the third element(Cough) is no, count noCoughYes
				 */
				else {
					
					setNoCoughYes(getNoCoughYes() + 1);
				}
				
				/*
				 * If fourth element(sore throat) is yes, count sorethroatYes
				 */
				if(symptom[3].contentEquals("yes")) {
					
					setSoreThroatYes(getSoreThroatYes() + 1);
				}
				
				/*
				 * If fourth element(sore throat) is no, count NoSorethroatYes
				 */
				else {
					
					setNoSoreThroatYes(getNoSoreThroatYes() + 1);
				}
				
				/*
				 * If fifth element(Danger zone) is yes, count dangerZoneYes
				 */
				if(symptom[4].contentEquals("yes")) {
					
					setDangerZoneYes(getDangerZoneYes() + 1);
				}
				
				/*
				 * If fourth element(Danger zone) is no, count NoDangerZoneYes
				 */
				else {
					
					setNoDangerZoneYes(getNoDangerZoneYes() + 1);
				}
				
			}
			
			else if(isHaveCoronaVirus() == false) {
				
			}
		}
	}
	public ArrayList<String> symptomsList() {
		return symptomsList;
	}


	public void setSymptomsList(ArrayList<String> symptomsList) {
		this.symptomsList = symptomsList;
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





	/**
	 * @return the tempHotYes
	 */
	public int getTempHotYes() {
		return tempHotYes;
	}





	/**
	 * @param tempHotYes the tempHotYes to set
	 */
	public void setTempHotYes(int tempHotYes) {
		this.tempHotYes = tempHotYes;
	}





	/**
	 * @return the tempHotNo
	 */
	public int getTempHotNo() {
		return tempHotNo;
	}





	/**
	 * @param tempHotNo the tempHotNo to set
	 */
	public void setTempHotNo(int tempHotNo) {
		this.tempHotNo = tempHotNo;
	}





	/**
	 * @return the tempNormalYes
	 */
	public int getTempNormalYes() {
		return tempNormalYes;
	}





	/**
	 * @param tempNormalYes the tempNormalYes to set
	 */
	public void setTempNormalYes(int tempNormalYes) {
		this.tempNormalYes = tempNormalYes;
	}





	/**
	 * @return the tempNormalNo
	 */
	public int getTempNormalNo() {
		return tempNormalNo;
	}





	/**
	 * @param tempNormalNo the tempNormalNo to set
	 */
	public void setTempNormalNo(int tempNormalNo) {
		this.tempNormalNo = tempNormalNo;
	}





	/**
	 * @return the tempCoolYes
	 */
	public int getTempCoolYes() {
		return tempCoolYes;
	}





	/**
	 * @param tempCoolYes the tempCoolYes to set
	 */
	public void setTempCoolYes(int tempCoolYes) {
		this.tempCoolYes = tempCoolYes;
	}





	/**
	 * @return the tempCoolNo
	 */
	public int getTempCoolNo() {
		return tempCoolNo;
	}





	/**
	 * @param tempCoolNo the tempCoolNo to set
	 */
	public void setTempCoolNo(int tempCoolNo) {
		this.tempCoolNo = tempCoolNo;
	}





	/**
	 * @return the tempColdYes
	 */
	public int getTempColdYes() {
		return tempColdYes;
	}





	/**
	 * @param tempColdYes the tempColdYes to set
	 */
	public void setTempColdYes(int tempColdYes) {
		this.tempColdYes = tempColdYes;
	}





	/**
	 * @return the tempColdNo
	 */
	public int getTempColdNo() {
		return tempColdNo;
	}





	/**
	 * @param tempColdNo the tempColdNo to set
	 */
	public void setTempColdNo(int tempColdNo) {
		this.tempColdNo = tempColdNo;
	}





	/**
	 * @return the achesYes
	 */
	public int getAchesYes() {
		return achesYes;
	}





	/**
	 * @param achesYes the achesYes to set
	 */
	public void setAchesYes(int achesYes) {
		this.achesYes = achesYes;
	}





	/**
	 * @return the achesNo
	 */
	public int getAchesNo() {
		return achesNo;
	}





	/**
	 * @param achesNo the achesNo to set
	 */
	public void setAchesNo(int achesNo) {
		this.achesNo = achesNo;
	}





	/**
	 * @return the noAchesYes
	 */
	public int getNoAchesYes() {
		return noAchesYes;
	}





	/**
	 * @param noAchesYes the noAchesYes to set
	 */
	public void setNoAchesYes(int noAchesYes) {
		this.noAchesYes = noAchesYes;
	}





	/**
	 * @return the noAchesNo
	 */
	public int getNoAchesNo() {
		return noAchesNo;
	}





	/**
	 * @param noAchesNo the noAchesNo to set
	 */
	public void setNoAchesNo(int noAchesNo) {
		this.noAchesNo = noAchesNo;
	}





	/**
	 * @return the coughYes
	 */
	public int getCoughYes() {
		return coughYes;
	}





	/**
	 * @param coughYes the coughYes to set
	 */
	public void setCoughYes(int coughYes) {
		this.coughYes = coughYes;
	}





	/**
	 * @return the coughNo
	 */
	public int getCoughNo() {
		return coughNo;
	}





	/**
	 * @param coughNo the coughNo to set
	 */
	public void setCoughNo(int coughNo) {
		this.coughNo = coughNo;
	}





	/**
	 * @return the noCoughYes
	 */
	public int getNoCoughYes() {
		return noCoughYes;
	}





	/**
	 * @param noCoughYes the noCoughYes to set
	 */
	public void setNoCoughYes(int noCoughYes) {
		this.noCoughYes = noCoughYes;
	}





	/**
	 * @return the noCoughNo
	 */
	public int getNoCoughNo() {
		return noCoughNo;
	}





	/**
	 * @param noCoughNo the noCoughNo to set
	 */
	public void setNoCoughNo(int noCoughNo) {
		this.noCoughNo = noCoughNo;
	}





	/**
	 * @return the soreThroatYes
	 */
	public int getSoreThroatYes() {
		return soreThroatYes;
	}





	/**
	 * @param soreThroatYes the soreThroatYes to set
	 */
	public void setSoreThroatYes(int soreThroatYes) {
		this.soreThroatYes = soreThroatYes;
	}





	/**
	 * @return the soreThroatNo
	 */
	public int getSoreThroatNo() {
		return soreThroatNo;
	}





	/**
	 * @param soreThroatNo the soreThroatNo to set
	 */
	public void setSoreThroatNo(int soreThroatNo) {
		this.soreThroatNo = soreThroatNo;
	}





	/**
	 * @return the noSoreThroatYes
	 */
	public int getNoSoreThroatYes() {
		return noSoreThroatYes;
	}





	/**
	 * @param noSoreThroatYes the noSoreThroatYes to set
	 */
	public void setNoSoreThroatYes(int noSoreThroatYes) {
		this.noSoreThroatYes = noSoreThroatYes;
	}





	/**
	 * @return the noSoreThroatNo
	 */
	public int getNoSoreThroatNo() {
		return noSoreThroatNo;
	}





	/**
	 * @param noSoreThroatNo the noSoreThroatNo to set
	 */
	public void setNoSoreThroatNo(int noSoreThroatNo) {
		this.noSoreThroatNo = noSoreThroatNo;
	}





	/**
	 * @return the dangerZoneYes
	 */
	public int getDangerZoneYes() {
		return dangerZoneYes;
	}





	/**
	 * @param dangerZoneYes the dangerZoneYes to set
	 */
	public void setDangerZoneYes(int dangerZoneYes) {
		this.dangerZoneYes = dangerZoneYes;
	}





	/**
	 * @return the dangerZoneNo
	 */
	public int getDangerZoneNo() {
		return dangerZoneNo;
	}





	/**
	 * @param dangerZoneNo the dangerZoneNo to set
	 */
	public void setDangerZoneNo(int dangerZoneNo) {
		this.dangerZoneNo = dangerZoneNo;
	}





	/**
	 * @return the noDangerZoneYes
	 */
	public int getNoDangerZoneYes() {
		return noDangerZoneYes;
	}





	/**
	 * @param noDangerZoneYes the noDangerZoneYes to set
	 */
	public void setNoDangerZoneYes(int noDangerZoneYes) {
		this.noDangerZoneYes = noDangerZoneYes;
	}





	/**
	 * @return the noDangerZoneNo
	 */
	public int getNoDangerZoneNo() {
		return noDangerZoneNo;
	}





	/**
	 * @param noDangerZoneNo the noDangerZoneNo to set
	 */
	public void setNoDangerZoneNo(int noDangerZoneNo) {
		this.noDangerZoneNo = noDangerZoneNo;
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


