package awtDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyAPP_Count_Words_Characters extends Frame implements ActionListener {
	Label l1,l2;
	TextArea t;
	Button b;
	
	public MyAPP_Count_Words_Characters() {
		super("Word & Letters Count");
		setSize(1000, 600);// w,h
		setLayout(null);
		setVisible(true);
 
 
		l1=new Label("-------");
		l1.setBounds(20,30,200,20);
 
		l2=new Label("-------");
		l2.setBounds(20,60,200,20);
 
		t=new TextArea(10,30);//R C
		t.setBounds(20,100,300,200);
 
		b=new Button("Get Details");
		b.setBounds(20,320,100,30);
		b.addActionListener(this);
 
 
		add(l1);
		add(l2);
		add(t);
		add(b);
 
 
		// Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String text=t.getText();
		String words[]=text.split("\\s");
		l1.setText("Words : "+words.length);
		l2.setText("Characters : "+text.length());
	}
	

}
