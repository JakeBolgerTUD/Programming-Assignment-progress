package com.assignment.oo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*****************************************************************
*   CoronaVirus Diagnostic Tool
*   Assignment - Java
*   Author: Jake Bolger
*   March 2019
*
*****************************************************************/
public class GUIscreen extends JFrame implements ActionListener {
	
	
	/*attributes
	 * 
	 */
	private JLabel tempLabel, achesLabel, coughLabel, soreThroatLabel, dangerZoneLabel;
	private JCheckBox tempBox1, tempBox2, tempBox3, achesYes, achesNo, coughYes, coughNo, throatNo, throatYes, dangerYes, dangerNo;
	private JPanel centrePanel, northPanel, nextPanel, lastPanel, fifthPanel;
	
	
	/*Constructor
	 * 
	 */
	GUIscreen(String title)
	{
		super(title);
		setSize(300,300);
		
		BorderLayout bl1 = new BorderLayout();
		setLayout(bl1);
		
		/*Instantiating GUI components
		 * 
		 */
		tempLabel = new JLabel("Temperature:");
		tempBox1 = new JCheckBox("Hot");
		tempBox2 = new JCheckBox("Normal");
		tempBox3 = new JCheckBox("Cool");
		achesLabel = new JLabel("Aches:");
		achesYes = new JCheckBox("Yes");
		achesNo = new JCheckBox("No");
		coughLabel = new JLabel("Cough:");
		coughYes = new JCheckBox("Yes");
		coughNo = new JCheckBox("No");
		soreThroatLabel = new JLabel("Sore Throat:");
		throatYes = new JCheckBox("Yes");
		throatNo = new JCheckBox("No");
		dangerZoneLabel =new JLabel("Recently travelled to danger zone");
		dangerYes = new JCheckBox("Yes");
		dangerNo = new JCheckBox("No");
		
		northPanel = new JPanel();
		centrePanel = new JPanel();
		nextPanel = new JPanel();
		lastPanel = new JPanel();
		fifthPanel = new JPanel();
		
		tempBox1.addActionListener(this);
		tempBox2.addActionListener(this);
		tempBox3.addActionListener(this);
		
	
		northPanel.add(tempLabel);
		northPanel.add(tempBox1);
		northPanel.add(tempBox2);
		northPanel.add(tempBox3);
		centrePanel.add(achesLabel);
		centrePanel.add(achesYes);
		centrePanel.add(achesNo);
		nextPanel.add(coughLabel);
		nextPanel.add(coughYes);
		nextPanel.add(coughNo);
		lastPanel.add(soreThroatLabel);
		lastPanel.add(throatYes);
		lastPanel.add(throatNo);
		fifthPanel.add(dangerZoneLabel);
		fifthPanel.add(dangerYes);
		fifthPanel.add(dangerNo);
		
		add(northPanel, BorderLayout.NORTH);
		add(centrePanel, BorderLayout.WEST);
		add(nextPanel, BorderLayout.CENTER);
		add(lastPanel, BorderLayout.EAST);
		add(fifthPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
