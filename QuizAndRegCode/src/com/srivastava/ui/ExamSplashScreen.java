package com.srivastava.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

public class ExamSplashScreen extends JWindow {
	Timer progressTimer ;
	JProgressBar progressBar = new JProgressBar();
	int progressCounter = 1;
	Icon icon = new ImageIcon(ExamSplashScreen.class.getResource("giphy.gif"));
	
	public static void main(String[] args) {
		
					ExamSplashScreen frame = new ExamSplashScreen();
					frame.setVisible(true);
					frame.startProgress();
				
	}

	/**
	 * Create the frame.
	 */
	public ExamSplashScreen() {
		getContentPane().setBackground(new Color(221, 160, 221));
		
		setBounds(100, 100, 526, 418);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(10, 30, 490, 230);
		getContentPane().add(lblNewLabel);
		
		JLabel msg = new JLabel("Exam System -2015");
		msg.setFont(new Font("Tahoma", Font.BOLD, 18));
		msg.setBounds(294, 271, 216, 22);
		getContentPane().add(msg);
		
		
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 18));
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.GREEN);
		progressBar.setBackground(Color.CYAN);
		progressBar.setBounds(10, 304, 475, 45);
		getContentPane().add(progressBar);
	}
	
	private void startProgress(){
		 progressTimer = new Timer(50,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(progressCounter<=100){
					progressBar.setValue(progressCounter);
					progressCounter++;
					}
					else
					{
						progressTimer.stop();
						
						ExamSplashScreen.this.setVisible(false);
						ExamSplashScreen.this.dispose();
						MainScreen mainScreen = new MainScreen();
						mainScreen.setVisible(true);
					}
				
			}
		});
		progressTimer.start();
		
	}
}
