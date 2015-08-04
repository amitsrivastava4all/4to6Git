import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Demo2 extends JFrame {
	Container ct ;
	//JButton magicbt = new JButton("Magic");
	JButton magicbt = null;
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Demo2() {
		getContentPane().setBackground(new Color(176, 224, 230));
		setTitle("MyFrame-2015");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 411);
		getContentPane().setLayout(null);
		
		JButton ok = new JButton("Ok");
		ok.setMnemonic('O');
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//magicbt.setVisible(true);
				showMsg("U Click on OK");
							}
		});
		ok.setFont(new Font("Tahoma", Font.BOLD, 16));
		ok.setBounds(92, 136, 89, 23);
		getContentPane().add(ok);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setMnemonic('C');
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//magicbt.setVisible(false);
				showMsg("U Click on Cancel");
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBounds(229, 138, 89, 23);
		ct = getContentPane();
		getContentPane().add(btnCancel);
		
		
		//magicbt.setBounds(145, 257, 89, 23);
		//magicbt.setVisible(false);
		//getContentPane().add(magicbt);
		
	}
	private void showMsg(String msg){
		magicbt = new JButton("Magic");
		magicbt.setBounds(145, 257, 89, 23);
		//magicbt.setVisible(false);
		//ct.add(magicbt);
		//JOptionPane.showMessageDialog(this, msg);

	}
}
