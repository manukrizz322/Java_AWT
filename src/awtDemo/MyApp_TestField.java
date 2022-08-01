package awtDemo;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp_TestField extends Frame implements TextListener,ActionListener {
	
	TextField txt;
	Label l1,l2;
	public MyApp_TestField() {
		super("Turor Joes");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		txt=new TextField();
		txt.setBounds(10,50,250,30);
		
		l1=new Label("----");
		l1.setBounds(300,50,250,30);
		txt.addTextListener(this);
		txt.addActionListener(this);
		
		l2=new Label("-----");
		l2.setBounds(10,100,250,30);
		
		add(txt);
		add(l1);
		add(l2);
		
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		
		});
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		l2.setText(txt.getText());
	}

	@Override
	public void textValueChanged(TextEvent e) {

		l1.setText(txt.getText());
	}

}
