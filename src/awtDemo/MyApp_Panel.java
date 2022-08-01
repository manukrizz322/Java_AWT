package awtDemo;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp_Panel extends Frame {
	public MyApp_Panel() {
	    	super("Tutor Joes");
	    	setSize(1000,600);
	    	setLayout(null);
	    	setVisible(true);
	    	
	    	Panel panel=new Panel();
	    	panel.setBounds(40,80,200,200);
	    	panel.setBackground(Color.gray);
	    	
	    	    Button b1=new Button("Button 1");     
		        b1.setBounds(50,100,80,30);   
		        b1.setBackground(Color.yellow); 
	 
		        Button b2=new Button("Button 2");   
		        b2.setBounds(100,100,80,30);    
		        b2.setBackground(Color.green);
	 
		        panel.add(b1); 
		        panel.add(b2);  
	 
		        add(panel);  
	 
			// Close Button Code
			this.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent we) {
					System.exit(0);
				}
			});
	    	
	}

}
