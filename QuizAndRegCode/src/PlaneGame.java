import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PlaneGame extends JFrame {
	final int UP = 38;
	final int DOWN = 40;
	final int RIGHT = 39;
	final int LEFT = 37;
	Icon icon = new ImageIcon(PlaneGame.class.getResource("plane.png"));
	JLabel planelbl = new JLabel("");
	int X = 24;
	int Y = 143;
	
	public static void main(String[] args) {
		
					PlaneGame frame = new PlaneGame();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public PlaneGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		
		planelbl.setIcon(icon);
		planelbl.setBounds(X, Y, 61, 38);
		getContentPane().add(planelbl);
		this.addKeyListener(new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e){
			movePlane(e);
		}
		});
	}
	private void movePlane(KeyEvent e){
		if(e.getKeyCode()==UP && Y>10){
			Y--;
		}
		if(e.getKeyCode()==DOWN && Y<this.getHeight()-70){
			
			Y++;
		}
		if(e.getKeyCode()==RIGHT){
		
			X++;
		}
		if(e.getKeyCode()==LEFT){
			
			X--;
		}
		planelbl.setBounds(X, Y, 61, 38);
		System.out.println(e.getKeyCode());
		
	}

}
