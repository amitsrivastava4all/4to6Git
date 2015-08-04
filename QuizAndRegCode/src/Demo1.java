import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


class Click implements ActionListener{
	MyScreen obj ; 
	Click(MyScreen obj ){
		this.obj = obj;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		/*System.out.println(e.getActionCommand());
		System.out.println(e.getSource());*/
		//System.out.println(ok);
		
		if(e.getActionCommand().equals("OK")){
			JOptionPane.showMessageDialog(obj, "U Click on OK");
		}
		else
		if(e.getActionCommand().equals("Cancel")){	
			JOptionPane.showMessageDialog(obj, "U Click on Cancel");
		}
	/*	if(ok==e.getSource()){
			JOptionPane.showMessageDialog(this, "U Click on OK");	
		}
		else
		if(cancel == e.getSource()){
			JOptionPane.showMessageDialog(this, "U Click on Cancel");
		}*/
		
		
	}
}

// Step - 1 Implements ActionListener
class MyScreen extends JFrame implements ActionListener
{
	
	JButton ok = new JButton("OK");
	JButton cancel = new JButton("Cancel");
	JButton clear = new JButton("Clear");
	JButton add = new JButton("Add");
	JButton del = new JButton("Delete");

	
	
	MyScreen(){
		
		this.setSize(300,300);
		this.setLocation(250, 250);
		this.setTitle("MyFrame-2015");
		/*Container container = this.getContentPane();
		container.add(ok);*/
		/*getContentPane().add(ok,BorderLayout.EAST);
		getContentPane().add(cancel,BorderLayout.WEST);
		getContentPane().add(clear,BorderLayout.NORTH);
		getContentPane().add(add,BorderLayout.SOUTH);
		getContentPane().add(del,BorderLayout.CENTER);*/
		getContentPane().setLayout(null);
		ok.setBounds(10,50,70,50);  //ok.setBounds(x,y,w,h);
		getContentPane().add(ok);
		cancel.setBounds(85,50,90,50);
		getContentPane().add(cancel);
		// register listener on button
		//ok.addActionListener(this);
		//cancel.addActionListener(this);
		/*Click click = new Click(this);
		ok.addActionListener(click);
		cancel.addActionListener(click);*/
		
		/*ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showMessage("U Click on OK");
				
			}
		});
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				showMessage("U Click on Cancel");
				
			}
		});*/
		ActionListener l = (q)->showMessage("U Click on Ok");
		ok.addActionListener(l);
		ActionListener l2 = (q)->showMessage("U Click on Cancel");
		cancel.addActionListener(l2);
		/*getContentPane().add(clear);
		getContentPane().add(add);
		getContentPane().add(del);*/
	}


	// Step - 2 Override ActionPerformed
	@Override
	public void actionPerformed(ActionEvent e) {
		/*System.out.println(e.getActionCommand());
		System.out.println(e.getSource());*/
		//System.out.println(ok);
		
		if(e.getActionCommand().equals("OK")){
			JOptionPane.showMessageDialog(this, "U Click on OK");
		}
		else
		if(e.getActionCommand().equals("Cancel")){	
			JOptionPane.showMessageDialog(this, "U Click on Cancel");
		}
	/*	if(ok==e.getSource()){
			JOptionPane.showMessageDialog(this, "U Click on OK");	
		}
		else
		if(cancel == e.getSource()){
			JOptionPane.showMessageDialog(this, "U Click on Cancel");
		}*/
		
		
	}
	private void showMessage(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		MyScreen obj = new MyScreen();
		
		obj.setVisible(true);

	}

}
