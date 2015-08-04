import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class TicTacToe extends JFrame {
	ImageIcon icon = new ImageIcon(TicTacToe.class.getResource("logo.jpg"));
	int colorCount = 1;
	boolean isVisible = false;
	JButton b1 = new JButton("");
	JButton b2 = new JButton("");
	JButton b3 = new JButton("");
	JButton b4 = new JButton("");
	JButton b5 = new JButton("");
	JButton b6 = new JButton("");
	JButton b7 = new JButton("");
	JButton b8 = new JButton("");
	JButton b9 = new JButton("");
	private boolean isX = true;
	private final JLabel lblTictactoe = new JLabel("TICTACTOE");
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
					frame.animation();
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		this.setIconImage(icon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 420);
		getContentPane().setLayout(null);
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b1);
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(32, 69, 123, 65);
		getContentPane().add(b1);
		
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b2);
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		b2.setBounds(185, 69, 123, 65);
		getContentPane().add(b2);
		
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b3);
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		b3.setBounds(342, 69, 123, 65);
		getContentPane().add(b3);
		
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b4);
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 18));
		b4.setBounds(32, 169, 123, 65);
		getContentPane().add(b4);
		
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b5);
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 18));
		b5.setBounds(185, 169, 123, 65);
		getContentPane().add(b5);
		
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b6);
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		b6.setBounds(342, 169, 123, 65);
		getContentPane().add(b6);
		
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b7);
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 18));
		b7.setBounds(32, 278, 123, 65);
		getContentPane().add(b7);
		
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b8);
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 18));
		b8.setBounds(185, 278, 123, 65);
		getContentPane().add(b8);
		
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isXorZero(b9);
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 18));
		b9.setBounds(342, 278, 123, 65);
		getContentPane().add(b9);
		lblTictactoe.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTictactoe.setBounds(168, 8, 123, 50);
		
		getContentPane().add(lblTictactoe);
	}
	
	private boolean isNotBlank(JButton button){
		return button.getText().trim().length()>0?true:false;
	}
	
	private boolean isGameOver(){
		boolean isOver = false;
		if(isNotBlank(b1) && isNotBlank(b2) && isNotBlank(b3)){
			if(b1.getText().equals(b2.getText()) && b1.getText().equals(b3.getText())){
				isOver = true;
			}
		}
		return isOver;
	}
	
	private void clear(){
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
	}
	
	private void gameOver(boolean isRestart){
		if(isRestart){
			clear();
			isX = true;
		}
		b1.setEnabled(isRestart);
		b2.setEnabled(isRestart);
		b3.setEnabled(isRestart);
		b4.setEnabled(isRestart);
		b5.setEnabled(isRestart);
		b6.setEnabled(isRestart);
		b7.setEnabled(isRestart);
		b8.setEnabled(isRestart);
		b9.setEnabled(isRestart);
	}
	
	private void isXorZero(JButton button){
		
	
		if(button.getText().trim().length()==0){
		if(isX){
			button.setText("X");
		}
		else
		{
			button.setText("0");
		}
		
		isX = !isX;
		}
		if(isGameOver()){
			isX = !isX;
			gameOver(false);
			String winnerName = isX?"X Wins ":"Zero Wins";
			//JOptionPane.showMessageDialog(this, "Game Over !"+winnerName);
			int choice = JOptionPane.showConfirmDialog(this, 
					"Game Over ! "+winnerName+" Do u want to Play Again"
					,"BMPL",JOptionPane.YES_NO_OPTION);
			if(choice == JOptionPane.YES_OPTION){
				gameOver(true);
			}
		}
	}
	private void animation(){
		Timer timer = new Timer(100,new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(colorCount){
				case 1:
					lblTictactoe.setForeground(Color.RED);
					break;
				case 2:
					lblTictactoe.setForeground(Color.YELLOW);
					break;
				case 3:
					lblTictactoe.setForeground(Color.GREEN);
					break;
				case 4:
					lblTictactoe.setForeground(Color.BLUE);
					break;
				case 5:
					lblTictactoe.setForeground(Color.MAGENTA);
					break;
				case 6:
					lblTictactoe.setForeground(Color.ORANGE);
					break;
				case 7:
					lblTictactoe.setForeground(Color.GRAY);
					break;	
				}
				if(colorCount>=7){
					colorCount = 1;
				}
				else
				{
					colorCount++;
				}
				lblTictactoe.setVisible(isVisible);
				isVisible = !isVisible;
				
			}
		});
		timer.start();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
