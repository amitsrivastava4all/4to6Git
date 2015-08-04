package com.srivastava.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Choice;
import java.awt.List;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Panel;
import java.awt.Button;

public class RegForm extends JFrame {
	ButtonGroup bg = new ButtonGroup();
	private JTextField textField;
	Choice choice = new Choice();
	List list = new List();


	public static void main(String[] args) {
		
					RegForm frame = new RegForm();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public RegForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 446);
		getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 27, 473, 379);
		getContentPane().add(tabbedPane);
		
		JPanel personalDetailsPanel = new JPanel();
		personalDetailsPanel.setLayout(null);
		tabbedPane.addTab("Personal Details", null, personalDetailsPanel, null);
		
		textField = new JTextField();
		textField.setBounds(175, 11, 218, 20);
		personalDetailsPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(81, 14, 46, 14);
		personalDetailsPanel.add(lblName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(81, 58, 46, 14);
		personalDetailsPanel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(145, 54, 109, 23);
		personalDetailsPanel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("FeMale");
		rdbtnFemale.setBounds(269, 54, 124, 23);
		personalDetailsPanel.add(rdbtnFemale);
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JLabel lblHobbies = new JLabel("Hobbies");
		lblHobbies.setBounds(81, 107, 46, 14);
		personalDetailsPanel.add(lblHobbies);
		
		JCheckBox chckbxSports = new JCheckBox("Sports");
		chckbxSports.setBounds(133, 103, 97, 23);
		personalDetailsPanel.add(chckbxSports);
		
		JCheckBox chckbxReading = new JCheckBox("Reading");
		chckbxReading.setBounds(234, 103, 97, 23);
		personalDetailsPanel.add(chckbxReading);
		
		JCheckBox chckbxTravelling = new JCheckBox("Travelling");
		chckbxTravelling.setBounds(342, 103, 97, 23);
		personalDetailsPanel.add(chckbxTravelling);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(69, 155, 46, 14);
		personalDetailsPanel.add(lblAddress);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBounds(154, 155, 177, 81);
		//personalDetailsPanel.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		scrollPane.setBounds(154, 155, 177, 81);
		personalDetailsPanel.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				showCity();
			}
		});
		choice.add("Select");
		choice.add("India");
		choice.add("USA");
		choice.setBounds(154, 251, 145, 20);
		personalDetailsPanel.add(choice);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(55, 251, 46, 14);
		personalDetailsPanel.add(lblCountry);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(55, 291, 46, 14);
		personalDetailsPanel.add(lblCity);
		
		
		list.setBounds(152, 281, 134, 60);
		personalDetailsPanel.add(list);
		
		Panel eduDetails = new Panel();
		eduDetails.setLayout(null);
		tabbedPane.addTab("Edu Details", null, eduDetails, null);
		
		Button button = new Button("New button");
		button.setBounds(72, 76, 70, 22);
		eduDetails.add(button);
		
	}
	private void showCity(){
		if(choice.getSelectedItem().equals("India")){
			
			list.removeAll();
			list.add("Delhi");
			list.add("Mumbai");
		}
		else
		if(choice.getSelectedItem().equals("USA")){	
			list.removeAll();
			list.add("NY");
			list.add("LA");
		}
		else
			if(choice.getSelectedItem().equals("Select")){
				list.removeAll();
			}
	}
}
