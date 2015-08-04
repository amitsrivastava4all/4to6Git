package com.srivastava.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.srivastava.dto.UserDTO;
import com.srivastava.helper.UserHelper;

import java.awt.event.WindowEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	Icon loginIcon = new ImageIcon(Login.class.getResource("login.png"));

	
	public static void main(String[] args) {
		
					Login frame = new Login();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				loginWindowClosing();
			}
		});
		
		setTitle("Login Screen");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 321, 256);
		getContentPane().setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUserid.setBounds(23, 48, 71, 14);
		getContentPane().add(lblUserid);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			/*@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Key Typed "+e.getKeyCode()+" "+e.getKeyChar());
			}*/
			@Override
			public void keyPressed(KeyEvent e) {
				enterKey(e);
				//System.out.println("Key Press "+e.getKeyCode()+" "+e.getKeyChar());
			}
		});
		textField.setToolTipText("Enter the Userid");
		textField.setBounds(118, 47, 176, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(23, 103, 85, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter the Password");
		passwordField.setBounds(118, 102, 176, 20);
		getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(textField.getText());
				userDTO.setPassword(passwordField.getText());
				UserHelper helper = new UserHelper();
				if(helper.isUserExist(userDTO)){
					JOptionPane.showMessageDialog(Login.this, "Welcome "+userDTO.getUserId());
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this, "Invalid Userid and Password");
				}
			}
		});
		btnLogin.setIcon(loginIcon);
		btnLogin.setBounds(19, 171, 107, 44);
		getContentPane().add(btnLogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(150, 171, 89, 44);
		getContentPane().add(btnClear);
	}
	private void enterKey(KeyEvent e){
		final int ENTER = 10;
		if(e.getKeyCode()==ENTER){
			passwordField.requestFocus();
		}
	}
	private void loginWindowClosing(){
		if(textField.getText().trim().length()>0 || passwordField.getText().trim().length()>0){
		int choice = JOptionPane.showConfirmDialog(this, "Do u Really want to Close this Window","BMPL-2015",JOptionPane.YES_NO_OPTION);
		if(choice==JOptionPane.YES_OPTION){
			this.setVisible(false);
			this.dispose();
		}
		else
		{
			textField.requestFocus();
		}
		}
		else
		{
			this.setVisible(false);
			this.dispose();
	
		}
	}
	
}
