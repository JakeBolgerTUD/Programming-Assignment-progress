package com.assignment.oo;

import java.util.ArrayList;


public class NaiveBayes {
	
	
	/*
	 * ArrayList taken from FileMaster class
	 */
	ArrayList<String> symptomsList;
	
	/*
	 * Constructor
	 */
	public NaiveBayes(ArrayList <String> symptomsList) {
		// TODO Auto-generated constructor stub
	
		/*
		 * --Constructor variables
		 */
		this.setSymptomsList(symptomsList);
		
		
		this.dataSetWorkings(symptomsList);
		
		
	}
	 
	
	/*
	 * Attributes for: Amount with CoronaVirus + without CoronaVirus and
	 * boolean variable(have the virus or not).
	 *
	 */
	private boolean haveCoronaVirus;
	private int amountHaveCorona = 0;
	private int amountWithoutCorona = 0;
	
	/*
	 * Have a hot temperature and have/don't have the CoronaVirus
	 */
	private int tempHotYes = 0;
	private int tempHotNo = 0;
	
	/*
	 * Have a normal temperature and have/don't have the CoronaVirus
	 */
	private int tempNormalYes = 0;
	private int tempNormalNo = 0;
	
	/*
	 * Have a cool temperature and have/don't have the CoronaVirus
	 */
	private int tempCoolYes = 0;
	private int tempCoolNo= 0;
		
	/*
	 * Have a cold temperature and have/don't have the CoronaVirus
	 */
	private int tempColdYes = 0;
	private int tempColdNo = 0;
	
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
	private int coughYes = 0;
	private int coughNo = 0;
	
	/*
	 * Don't have the cough and have/don't have the virus
	 */
	private int noCoughYes = 0;
	private int noCoughNo = 0;
	
	/*
	 * Have sore throat and have/don't have the virus
	 */
	private int soreThroatYes = 0;
	private int soreThroatNo = 0;
	
	/*
	 * Don't have sore throat and have/don't have the virus
	 */
	private int noSoreThroatYes = 0;
	private int noSoreThroatNo = 0;
	
	/*
	 * Recently traveled to danger zone and have/don't have virus
	 */
	private int dangerZoneYes = 0;
	private int dangerZoneNo = 0;
	
	/*
	 * Havn't Recently traveled to danger zone and have/don't have virus
	 */
	private int noDangerZoneYes = 0;
	private int noDangerZoneNo = 0;
	
	
	
	/*
	 * Work out all the probabilities
	 */
	public void dataSetWorkings(ArrayList <String> symptomsList) {
		
		/*
		 * Splits each person into separate ArrayList so they can be accessed
		 *  I Learn't how to do this by looking online:
		 *  https://javadevnotes.com/java-split-string-into-arraylist-examples
		 *
		 */
		for(int i = 0; i < symptomsList.size(); i++) {
			
			/*
			 * splitting at " ".
			 */
			String[] symptom = symptomsList.get(i).split(" ");
			
			
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
				if(symptom[0].equals("hot")) {
					setTempHotYes(getTempHotYes() + 1);
				}
				
				/*
				 * If the first element(temperature) is normal, count tempNormalYes
				 */
				else if(symptom[0].equals("normal")) {
					
					setTempNormalYes(getTempNormalYes() + 1);
				}
				
				/*
				 * If the first element(temperature) is cool, count tempCoolYes
				 */
				else if(symptom[0].equals("cool")) {
					
					setTempCoolYes(getTempCoolYes() + 1);
				}
				
				/*
				 * If the first element(temperature) is cold, count tempColdYes
				 */
				else if(symptom[0].equals("cold")) {
					
					setTempColdYes(getTempColdYes() + 1);
				}
				
				/*
				 * If the second element(Aches) is yes, count achesYes
				 */
				if(symptom[1].equals("yes")) {
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
				if(symptom[2].equals("yes")) {
					
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
				if(symptom[3].equals("yes")) {
					
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
				if(symptom[4].equals("yes")) {
					
					setDangerZoneYes(getDangerZoneYes() + 1);
				}
				
				/*
				 * If fourth element(Danger zone) is no, count NoDangerZoneYes
				 */
				else {
					
					setNoDangerZoneYes(getNoDangerZoneYes() + 1);
				}
				
			}
			
			
			/*
			 * If they don't have the CoronaVirus..
			 */
			else if(isHaveCoronaVirus() == false) {
				
				/*
				 * If first element(temperature) is hot, count tempHotNo
				 */
				if(symptom[0].equals("hot")) {
					
					setTempHotNo(getTempHotNo() + 1);
				}
				
				/*
				 * If first element(temperature) is normal, count tempNormalNo
				 */
				else if(symptom[0].equals("normal")) {
					
					setTempNormalNo(getTempNormalNo() + 1);
				}
				
				/*
				 * If first element(temperature) is cool, count tempCoolNo
				 */
				else if(symptom[0].equals("cool")) {
					
					setTempCoolNo(getTempCoolNo() + 1);
				}
				
				/*
				 * If first element(temperature) is cold, count tempColdNo
				 */
				else if(symptom[0].equals("cold")) {
					
					setTempColdNo(getTempColdNo() + 1);
				}
				
				/*
				 * If second element(Aches) is yes, count acheNo
				 */
				if(symptom[1].equals("yes")) {
					
					setAchesNo(getAchesNo() + 1);
				}
				
				/*
				 * If second element(Aches) is no, count noAcheNo
				 */
				else {
					
					setNoAchesNo(getNoAchesNo() + 1);
				}
				
				/*
				 * If third element(Cough) is yes, count coughNo
				 */
				if(symptom[2].equals("yes")) {
					
					setCoughNo(getCoughNo() + 1);
				}
				
				/*
				 * If third element(Aches) is no, count noCoughNo
				 */
				else {
					
					setNoCoughNo(getNoCoughNo() + 1);
				}
				
				/*
				 * If fourth element(Sore throat) is yes, count soreThroatNo
				 */				
				 
				if(symptom[3].equals("yes")) {
					
					setSoreThroatNo(getSoreThroatNo() + 1);
				}
				
				/*
				 * If fourth element(sore throat) is no, count noSoreThroatNo
				 */
				else {
					
					setNoSoreThroatNo(getNoSoreThroatNo() + 1);
				}
				
				/*
				 * if the fifth element(danger zone) is yes, count dangerZoneNo
				 */
				if(symptom[4].equals("yes")) {
					
					setDangerZoneNo(getDangerZoneNo() + 1);
				}
				
				/*
				 * If the fifth element (danger zone) is no, count noDangerZoneNo 
				 */
				else {
					
					setNoDangerZoneNo(getNoDangerZoneNo() + 1);
				}
				
			}
		}
	}
	
	/*

	 * --Calculations to check if answers were right for Classifier--
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

	
	/*
	 * Method to be used in the GUIscreen.
	 * These are boolean as JRadioButtons are used in the GUI so when the are selected they are true and 
	 * when they are not selected they are false
	 */
	public String patientAccess(boolean tempButtonHot,boolean tempButtonNormal,boolean tempButtonCool, boolean tempButtonCold, boolean achesButtonYes,boolean achesButtonNo,
				boolean coughButtonYes,boolean coughButtonNo, boolean soreThroatButtonYes,boolean soreThroatButtonNo, boolean dangerZoneButtonYes, boolean dangerZoneButtonNo) {
		
		
		/*
		 * Variables for the Probability yes/no or with/Without CoronaVirus
		 */
		double probabilityYes;
		
		double probabilityNo;

		/*
		 * Created variables to store the Probabilities(values) when the if statements further down have executed. 
		 */
		
		int tempSelectedYes;
		tempSelectedYes = 0;
		
		int tempSelectedNo;
		tempSelectedNo = 0;
		
		/*
		 * Variables for the Patients selection 
		 */
		int achesSelectedYes;
		achesSelectedYes = 0;
		
		int achesSelectedNo;
		achesSelectedNo = 0;
		
		/*
		 * Variables for the Patients selection 
		 */
		int coughSelectedYes;
		coughSelectedYes = 0;
		
		int coughSelectedNo;
		coughSelectedNo = 0;
		
		/*
		 * Variables for the Patients selection 
		 */
		int soreThroatSelectedYes;	
		soreThroatSelectedYes = 0;
		
		int soreThroatSelectedNo;
		soreThroatSelectedNo = 0;
		
		/*
		 * Variables for the Patients selection 
		 */
		int dangerZoneSelectedYes;
		dangerZoneSelectedYes = 0;
		
		int dangerZoneSelectedNo;
		dangerZoneSelectedNo = 0;
		
				
		/*
		 * If button is true(hot) then store method in variable(do similar for all if statements)
		 */
		if (tempButtonHot == true) {
			
			tempSelectedYes = getTempHotYes(); //method for hot temperature and CoronaVirus
			
			tempSelectedNo = getTempHotNo(); //method for hot temperature and no CoronaVirus
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		else if (tempButtonNormal == true) {
			
			tempSelectedYes = getTempNormalYes(); //   "
			
			tempSelectedNo = getTempNormalNo();//   "
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		else if (tempButtonCool == true) {
			
			tempSelectedYes = getTempCoolYes();
			
			tempSelectedNo = getTempCoolNo();
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		else if (tempButtonCold == true) {
			
			tempSelectedYes = getTempColdYes();
			
			tempSelectedNo = getTempColdNo();
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		
		if (achesButtonYes == true) {
			
			achesSelectedYes = getAchesYes();
			
			achesSelectedNo = getAchesNo();
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		else if (achesButtonNo == true) {
			
			achesSelectedYes = getNoAchesYes();
			
			achesSelectedNo = getNoAchesNo();
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		if (coughButtonYes == true) {
			
			coughSelectedYes = getCoughYes();
			
			coughSelectedNo = getCoughNo();
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		else if (coughButtonNo == true)  {
			
			coughSelectedYes = getNoCoughYes();
			
			coughSelectedNo = getNoCoughNo();
		}
		
		/*
		 * Variables for the Patients selection 
		 */
		
		if (soreThroatButtonYes == true) {
			
			soreThroatSelectedYes = getSoreThroatYes();
			
			soreThroatSelectedNo = getSoreThroatNo();
			
			
		}
		/*
		 * Variables for the Patients selection 
		 */
		else if (soreThroatButtonNo == true) {
			
			soreThroatSelectedYes = getNoSoreThroatYes();
			
			soreThroatSelectedNo = getNoSoreThroatYes();
			
		}
		
		
		/*
		 * Variables for the Patients selection 
		 */
		if (dangerZoneButtonYes == true) {
			
			dangerZoneSelectedYes = getDangerZoneYes();
			
			dangerZoneSelectedNo = getDangerZoneNo();
		}
		
		
		/*
		 * Variables for the Patients selection 
		 */
		else if (dangerZoneButtonNo == true) {
			
			dangerZoneSelectedYes = getNoDangerZoneYes();
			
			dangerZoneSelectedNo = getNoDangerZoneNo();
		}
		
		/*
		* Variable to store naiveBayesProbability(var1)
		*/
		double var1 = naiveBayesProbability(tempSelectedYes, achesSelectedYes, coughSelectedYes, soreThroatSelectedYes, dangerZoneSelectedYes, getAmountHaveCorona());
		/*
		* Variable to store naiveBayesProbability(var1)
		*/
		double var2 = naiveBayesProbability(tempSelectedNo, achesSelectedNo, coughSelectedNo, soreThroatSelectedNo, dangerZoneSelectedNo, getAmountWithoutCorona());				
		
		/*
		 * probabilityYes is equal to the manageProbabilty Method with var1 and var2 acting as firstNum and secondNum
		 */
		probabilityYes = manageProbability(var1, var2);
		probabilityNo = manageProbability(var2, var1);
		/*
		 * If the yes is greater than no return yes
		 */
		/*
		 * returning the probability
		 */
		if (probabilityYes > probabilityNo) {
			String answer1 = "---" + probabilityYes + "% Chance";
			
			return answer1;
		}
		
		/*
		 *  If the no is greater than yes return no
		 */
		else {
			String answer2 = "--- " + probabilityNo + "% Chance";
			
			return answer2;
		}
	}
	
	
	
	
	
	
	/*
	 * Method for Final Calculations, Multiplying all the probabilities that have been counted
	 */
	public double naiveBayesProbability(int tempCounter, int achesCounter, int coughCounter, 
			int soreThroatCounter, int dangerZoneCounter, int patientCounter) {
		/*
		 * all Numbers are divided by the patient counter which should be either the number 17 or the number 59, except for 
		 * the last sum which is 17/59 divided by the amount with CoronaVirus + amount without CoronaVirus which is the whole data set (76)
		 */
		double finalProb;
		
		double sum1, sum2, sum3;
		
		/*
		 * splitting into three sums(easier to read)
		 */
		sum1 = 	( (double)tempCounter / (double)patientCounter ) * ( (double)achesCounter / (double)patientCounter );
							
		sum2 =	( (double)coughCounter / (double)patientCounter ) * ( (double)soreThroatCounter / (double)patientCounter ); 								
							
		sum3 = 	( (double)dangerZoneCounter / (double)patientCounter ) * ( (double)patientCounter / (double)(getAmountHaveCorona() + getAmountWithoutCorona() ));
																								//^this^ is "last sum".
		
		finalProb = sum1 * sum2 * sum3;
		/*
		 * Return answer to sum
		 */
		return finalProb;
	}
	
	
	/*
	 * 	Converts answer from to a more readable format.
	 *  Instead of a fraction it will be one number.
	 */
	public double manageProbability(double firstNum, double secondNum) {
		
		double finalProb;
		double sum4 = firstNum + secondNum;
		
		/*
		 * sum to divide(final calculations)
		 */
		finalProb = firstNum / sum4;
		
		return finalProb;
	}
	
	
	
	
	
	
	
	/*
	 * Getters and Setter methods for all attributes(Encapsulation)
	 */
	
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
	
	
		
	
	






