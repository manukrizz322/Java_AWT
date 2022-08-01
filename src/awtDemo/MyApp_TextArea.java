package awtDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp_TextArea extends Frame implements ActionListener {
	TextArea t;
	Label l;
	TextField tf;
	Button b;
	
	public MyApp_TextArea() {
		super("Tutor Joes");
		setSize(1000, 600);// w,h
		setLayout(null);
		setVisible(true);
		
		l=new Label("---");
		l.setBounds(20,50,250,30);
		
		t=new TextArea(10,30);//Row Column
		t.setBounds(20,100,300,200);
		
		tf=new TextField(20);
		tf.setBounds(20,350,300,30);
		
		b=new Button("Click");
		b.setBounds(20,400,100,30);
		b.addActionListener(this);
		
		add(l);
		add(t);
		add(tf);
		add(b);
		
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		l.setText(t.getSelectedText());
		t.append(tf.getText());
		t.insert(tf.getText(), t.getCaretPosition());
	}

}
