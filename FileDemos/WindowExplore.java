import java.awt.Button;
import java.awt.Choice;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.List;


public class WindowExplore extends JFrame {
private String path;
List list = new List();
	
	public static void main(String[] args) {
		
					WindowExplore frame = new WindowExplore();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public WindowExplore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 429);
		getContentPane().setLayout(null);
		
		Choice extensions = new Choice();
		extensions.add("select extension");
		extensions.add("*.txt");
		extensions.add("*.java");
		extensions.add("*.png");
		extensions.add("*.jpg");
		extensions.add("*.html");
		extensions.add("*.doc");
		
		extensions.setBounds(32, 38, 142, 20);
		getContentPane().add(extensions);
		
		Button button = new Button("BrowseForPath");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterPath();
			}
		});
		
		button.setBounds(194, 38, 90, 22);
		getContentPane().add(button);
		
		
		list.setBounds(29, 90, 200, 278);
		getContentPane().add(list);
	}
	private void enterPath(){
		File file = new File("c:");
		JFileChooser chooser = new JFileChooser(file);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.showOpenDialog(this);
		File path = chooser.getSelectedFile();
		System.out.println(path.getPath());
		scan(path);
		//chooser.setVisible(true);
		//Icon icon = new ImageIcon(WindowExplore.class.getResource("ask.jpg"));
		//Component parentComponent,
        /*this ,Object message, String title, int messageType, Icon icon,
        Object[] selectionValues, Object initialSelectionValue*/
		//path = (String) JOptionPane.showInputDialog(this,"Enter Your Path","",0,icon,null,null);
	}
	private void scan(File path){
		System.out.println("Path is "+path.getPath());
		File file = null;
		int counter = 1;
		File files[] = path.listFiles();
		for(File f : files){
			if(f.isFile()){
			//System.out.println(f.getAbsolutePath());
			file = new File(path.getPath()+"\\rahul"+counter+".fun");
			f.renameTo(file);
			counter++;
			}
			
			//f.delete();
		}
		/*String files[] = path.list();
		for(String f : files){
			list.add(f);
		}*/
	}
}
