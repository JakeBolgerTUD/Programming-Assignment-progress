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
		setTempLabel(new JLabel("Temperature:"));
		setTempBox1(new JCheckBox("Hot"));
		setTempBox2(new JCheckBox("Normal"));
		setTempBox3(new JCheckBox("Cool"));
		setAchesLabel(new JLabel("Aches:"));
		setAchesYes(new JCheckBox("Yes"));
		setAchesNo(new JCheckBox("No"));
		setCoughLabel(new JLabel("Cough:"));
		setCoughYes(new JCheckBox("Yes"));
		setCoughNo(new JCheckBox("No"));
		setSoreThroatLabel(new JLabel("Sore Throat:"));
		setThroatYes(new JCheckBox("Yes"));
		setThroatNo(new JCheckBox("No"));
		setDangerZoneLabel(new JLabel("Recently travelled to danger zone"));
		setDangerYes(new JCheckBox("Yes"));
		setDangerNo(new JCheckBox("No"));
		
		setNorthPanel(new JPanel());
		setCentrePanel(new JPanel());
		setNextPanel(new JPanel());
		setLastPanel(new JPanel());
		setFifthPanel(new JPanel());
		
		getTempBox1().addActionListener(this);
		getTempBox2().addActionListener(this);
		getTempBox3().addActionListener(this);
		
	
		getNorthPanel().add(getTempLabel());
		getNorthPanel().add(getTempBox1());
		getNorthPanel().add(getTempBox2());
		getNorthPanel().add(getTempBox3());
		getCentrePanel().add(getAchesLabel());
		getCentrePanel().add(getAchesYes());
		getCentrePanel().add(getAchesNo());
		getNextPanel().add(getCoughLabel());
		getNextPanel().add(getCoughYes());
		getNextPanel().add(getCoughNo());
		getLastPanel().add(getSoreThroatLabel());
		getLastPanel().add(getThroatYes());
		getLastPanel().add(getThroatNo());
		getFifthPanel().add(getDangerZoneLabel());
		getFifthPanel().add(getDangerYes());
		getFifthPanel().add(getDangerNo());
		
		add(getNorthPanel(), BorderLayout.NORTH);
		add(getCentrePanel(), BorderLayout.WEST);
		add(getNextPanel(), BorderLayout.CENTER);
		add(getLastPanel(), BorderLayout.EAST);
		add(getFifthPanel(), BorderLayout.SOUTH);
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	public JLabel getTempLabel() {
		return tempLabel;
	}


	public void setTempLabel(JLabel tempLabel) {
		this.tempLabel = tempLabel;
	}


	public JLabel getAchesLabel() {
		return achesLabel;
	}


	public void setAchesLabel(JLabel achesLabel) {
		this.achesLabel = achesLabel;
	}


	public JLabel getCoughLabel() {
		return coughLabel;
	}


	public void setCoughLabel(JLabel coughLabel) {
		this.coughLabel = coughLabel;
	}


	public JLabel getSoreThroatLabel() {
		return soreThroatLabel;
	}


	public void setSoreThroatLabel(JLabel soreThroatLabel) {
		this.soreThroatLabel = soreThroatLabel;
	}


	public JLabel getDangerZoneLabel() {
		return dangerZoneLabel;
	}


	public void setDangerZoneLabel(JLabel dangerZoneLabel) {
		this.dangerZoneLabel = dangerZoneLabel;
	}


	public JCheckBox getTempBox1() {
		return tempBox1;
	}


	public void setTempBox1(JCheckBox tempBox1) {
		this.tempBox1 = tempBox1;
	}


	public JCheckBox getTempBox2() {
		return tempBox2;
	}


	public void setTempBox2(JCheckBox tempBox2) {
		this.tempBox2 = tempBox2;
	}


	public JCheckBox getTempBox3() {
		return tempBox3;
	}


	public void setTempBox3(JCheckBox tempBox3) {
		this.tempBox3 = tempBox3;
	}


	public JCheckBox getAchesYes() {
		return achesYes;
	}


	public void setAchesYes(JCheckBox achesYes) {
		this.achesYes = achesYes;
	}


	public JCheckBox getAchesNo() {
		return achesNo;
	}


	public void setAchesNo(JCheckBox achesNo) {
		this.achesNo = achesNo;
	}


	public JCheckBox getCoughYes() {
		return coughYes;
	}


	public void setCoughYes(JCheckBox coughYes) {
		this.coughYes = coughYes;
	}


	public JCheckBox getCoughNo() {
		return coughNo;
	}


	public void setCoughNo(JCheckBox coughNo) {
		this.coughNo = coughNo;
	}


	public JCheckBox getThroatNo() {
		return throatNo;
	}


	public void setThroatNo(JCheckBox throatNo) {
		this.throatNo = throatNo;
	}


	public JCheckBox getThroatYes() {
		return throatYes;
	}


	public void setThroatYes(JCheckBox throatYes) {
		this.throatYes = throatYes;
	}


	public JCheckBox getDangerYes() {
		return dangerYes;
	}


	public void setDangerYes(JCheckBox dangerYes) {
		this.dangerYes = dangerYes;
	}


	public JCheckBox getDangerNo() {
		return dangerNo;
	}


	public void setDangerNo(JCheckBox dangerNo) {
		this.dangerNo = dangerNo;
	}


	public JPanel getCentrePanel() {
		return centrePanel;
	}


	public void setCentrePanel(JPanel centrePanel) {
		this.centrePanel = centrePanel;
	}


	public JPanel getNorthPanel() {
		return northPanel;
	}


	public void setNorthPanel(JPanel northPanel) {
		this.northPanel = northPanel;
	}


	public JPanel getNextPanel() {
		return nextPanel;
	}


	public void setNextPanel(JPanel nextPanel) {
		this.nextPanel = nextPanel;
	}


	public JPanel getLastPanel() {
		return lastPanel;
	}


	public void setLastPanel(JPanel lastPanel) {
		this.lastPanel = lastPanel;
	}


	public JPanel getFifthPanel() {
		return fifthPanel;
	}


	public void setFifthPanel(JPanel fifthPanel) {
		this.fifthPanel = fifthPanel;
	}
	

}
