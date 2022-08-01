package awtDemo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyApp_Basic_Addition extends Frame implements ActionListener {
	Label l1,l2,l3;
	TextField txt1,txt2;
	Button b;
	
	
	public MyApp_Basic_Addition() {
		super("Totor Joes");
		setSize(1000,600);
		setLayout(null);
		setVisible(true);
		
		l1=new Label("Enter The value 1 : ");
		l1.setBounds(10,50,100,30);
		
		txt1=new TextField();
		txt1.setBounds(150,50,250,30);
		
		l2=new Label("Enter The Value 2 : ");
		l2.setBounds(10,100,100,30);
		
		txt2=new TextField();
		txt2.setBounds(150,100,250,30);
		
		b=new Button("Click Me ");
		b.setBounds(150,150,100,30);
		b.addActionListener(this);
		
		l3=new Label("--");
		l3.setBounds(10,200,300,30);
		
		add(l1);
		add(txt1);
		add(l2);
		add(txt2);
		add(b);
		add(l3);
		
		this.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		
		}
		});
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		String s1=txt1.getText();
		String s2=txt2.getText();
		if (s1.isEmpty()||s2.isEmpty()) {
			l3.setText("Please Enter The data");
		}else {
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=a+b;
			String result=String.valueOf(c);
			l3.setText("Total : "+result);
		}
	}
	

}
