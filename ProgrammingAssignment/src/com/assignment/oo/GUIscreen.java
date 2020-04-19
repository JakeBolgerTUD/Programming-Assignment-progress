package com.assignment.oo;



/*****************************************************************
*   CoronaVirus Diagnostic Tool
*   Assignment - Java
*   Author: Jake Bolger
*   March 2019
*
*****************************************************************/
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class GUIscreen extends JFrame implements ActionListener {
	
	//creating screen elements
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JPanel northPanel, southPanel, eastPanel, westPanel, centerPanel;
	
	JButton checkProbability;
	
	JRadioButton temperatureButtonHot, temperatureButtonNormal,temperatureButtonCool, temperatureButtonCold;
	JRadioButton achesButtonYes, achesButtonNo ;
	JRadioButton coughButtonYes, coughButtonNo ;
	JRadioButton soreThroatButtonYes, soreThroatButtonNo;
	JRadioButton dangerZoneButtonYes, dangerZoneButtonNo;
	
	ButtonGroup group1, group2, group3, group4, group5;
	
	JLabel symptomsLabel, label1, label2, label3, label4 ,label5;
	
	NaiveBayes fileData;
	
	public GUIscreen(String title) {
		
		//organising screen elements
		super("CoronaVirus Diagnostic Tool");
		setSize(600, 600);
		BorderLayout bl1 = new BorderLayout();
		
		
				
		checkProbability = new JButton("Check");
		
		temperatureButtonHot = new JRadioButton("hot");
		temperatureButtonNormal = new JRadioButton("normal");
		temperatureButtonCool = new JRadioButton("cool");
		temperatureButtonCold = new JRadioButton("cold");
		
		achesButtonYes = new JRadioButton("yes");
		achesButtonNo = new JRadioButton("no");
		
		coughButtonYes = new JRadioButton("yes");
		coughButtonNo = new JRadioButton("no");
		
		soreThroatButtonYes = new JRadioButton("yes");
		soreThroatButtonNo = new JRadioButton("no");
		
		dangerZoneButtonYes = new JRadioButton("yes");
		dangerZoneButtonNo = new JRadioButton("no");
		
		group1 = new ButtonGroup();
		group2 =new ButtonGroup();
		group3 = new ButtonGroup();
		group4 = new ButtonGroup();
		group5 = new ButtonGroup();
		
		symptomsLabel = new JLabel("*----------------------------------------Please select your symptoms----------------------------------------*");
		
		label1 = new JLabel("Temperature : ");
		label2 = new JLabel("Aches : ");
		label3 = new JLabel("Cough : ");
		label4 = new JLabel("Sore Throat : ");
		label5 = new JLabel("Recently Visited Danger Zone : ");
		
		group1.add(temperatureButtonHot);
		group1.add(temperatureButtonNormal);
		group1.add(temperatureButtonCool);
		group1.add(temperatureButtonCold);
		
		group2.add(achesButtonYes);
		group2.add(achesButtonNo);
		
		group3.add(coughButtonYes);
		group3.add(coughButtonNo);
		
		group4.add(soreThroatButtonYes);
		group4.add(soreThroatButtonNo);
		
		group5.add(dangerZoneButtonYes);
		group5.add(dangerZoneButtonNo);
		
		
		
		
		setLayout(bl1);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(20, 1));
		northPanel = new JPanel();
		southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,1));
		
		
		
		northPanel.add(symptomsLabel);
		
		centerPanel.add(label1);
		centerPanel.add(temperatureButtonHot);
		centerPanel.add(temperatureButtonNormal);
		centerPanel.add(temperatureButtonCool);
		centerPanel.add(temperatureButtonCold);
		
		centerPanel.add(label2); 
		centerPanel.add(achesButtonYes);
		centerPanel.add(achesButtonNo);
		
		centerPanel.add(label3);
		centerPanel.add(coughButtonYes);
		centerPanel.add(coughButtonNo);
		
		centerPanel.add(label4);
		centerPanel.add(soreThroatButtonYes);
		centerPanel.add(soreThroatButtonNo);
		
		centerPanel.add(label5);
		centerPanel.add(dangerZoneButtonYes);
		centerPanel.add(dangerZoneButtonNo);
		
		southPanel.add(checkProbability);
		
		
		add(centerPanel, BorderLayout.CENTER);
		add(northPanel, BorderLayout.NORTH);
		add(southPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	 
	
	
	
}