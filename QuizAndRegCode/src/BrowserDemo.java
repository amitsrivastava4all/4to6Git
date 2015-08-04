import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;


public class BrowserDemo extends JFrame {

	
	public static void main(String[] args) {
		
					BrowserDemo frame = new BrowserDemo();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public BrowserDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openBrowser();
			}
		});
		btnOpen.setBounds(79, 94, 89, 23);
		getContentPane().add(btnOpen);
	}
	private void openBrowser(){
		URI uri;
		try {
			File file = new File("E:\\MyMaterial\\E-Books\\Advance_JavaSL314_OH.pdf");
			uri = new URI("http://www.google.com");
			if(Desktop.isDesktopSupported()){
			Desktop.getDesktop().open(file);
			}
		//Desktop.getDesktop().browse(uri);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		/*Runtime r = Runtime.getRuntime();
		try {
			r.exec("start chrome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
