import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Demo3 extends JFrame {
	private JTextField txt;

	
	public static void main(String[] args) {
		
					Demo3 frame = new Demo3();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame design .
	 */
	public Demo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 415);
		getContentPane().setLayout(null);
		
		txt = new JTextField();
		txt.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt.setBounds(197, 30, 252, 50);
		getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton uppercasebt = new JButton("UpperCase");
		uppercasebt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convertIntoUpperCase();
			}
		});
		uppercasebt.setFont(new Font("Tahoma", Font.BOLD, 16));
		uppercasebt.setBounds(56, 172, 155, 23);
		getContentPane().add(uppercasebt);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(47, 27, 98, 50);
		getContentPane().add(lblName);
	}
	private void convertIntoUpperCase(){
		txt.setText(txt.getText().toUpperCase());
	}
}
