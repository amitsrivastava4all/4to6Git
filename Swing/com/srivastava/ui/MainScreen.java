package com.srivastava.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainScreen extends JFrame {

	
	public static void main(String[] args) {
		
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu admin = new JMenu("Admin");
		menuBar.add(admin);
		JMenuItem login = new JMenuItem("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
			}
		});
		admin.add(login);
		JMenuItem exam = new JMenuItem("Exam");
		admin.add(exam);
		admin.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		admin.add(exit);
		setTitle("Test Engine -2015");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
