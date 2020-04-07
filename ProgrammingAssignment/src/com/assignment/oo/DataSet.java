package com.assignment.oo;

public class DataSet {
	// practicing the file processor
	private String tempA;
    private String achesA;
    private String coughA;
    private String soreThroat;
    private String dangerZone;
	
    public DataSet(String tempA, String achesA, String coughA, String soreThroat, String dangerZone)
    {
    	this.setTempA(tempA);
    	this.setAchesA(achesA);
    	this.setCoughA(coughA);
    	this.setSoreThroat(soreThroat);
    	this.setDangerZone(dangerZone);
    	
    	// Using the File Manager class to read in the roles. 
    	FileMaster fm = new FileMaster("Symptoms.txt");
    	fm.connectToFile();
    	String[] validSymptoms = fm.readFile();
    	fm.closeReadFile();
    	boolean validSymptom = false;
    	
    	// check if the role exists in the file values in the file. Note : you could have put this
    			// logic into the FileManager class if you chose to (if it was something reusable that other classes
    			// would use: i.e. a method that takes in a string, and return true or false if it exists in a file or not
    			
    	    	for (int i = 0; i< validSymptoms.length; i++)
    	    	{
    		    	 System.out.println(tempA);
    		    	 System.out.println("array contains " + validSymptoms[i]);
    	    		
    		    	 if (tempA.equals(validSymptoms[i]))
    	    	     {
    	    	    	 System.out.println("I got this part");
    	    	    	 validSymptom = true;
    	    	     }
    	    	}
    	    	if (validSymptom == false)
    	    	{
    	    		System.out.println("this is not a valid symptom!");
    	    	}
    	   	}

	private String getTempA() {
		return tempA;
	}

	private void setTempA(String tempA) {
		this.tempA = tempA;
	}

	private String getAchesA() {
		return achesA;
	}

	private void setAchesA(String achesA) {
		this.achesA = achesA;
	}

	private String getCoughA() {
		return coughA;
	}

	private void setCoughA(String coughA) {
		this.coughA = coughA;
	}

	private String getSoreThroat() {
		return soreThroat;
	}

	private void setSoreThroat(String soreThroat) {
		this.soreThroat = soreThroat;
	}

	private String getDangerZone() {
		return dangerZone;
	}

	private void setDangerZone(String dangerZone) {
		this.dangerZone = dangerZone;
	}
    	
       
    }

