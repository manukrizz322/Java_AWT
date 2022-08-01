package awtDemo;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class My_App_Choice_Java extends Frame {
	Choice c;
	Button btn;
	Label lbl;

	public My_App_Choice_Java() {
		super("Tutor Joes");
		setSize(1000, 600);
		setLayout(null);
		setVisible(true);

		c = new Choice();
		c.setBounds(10, 50, 100, 100);

		c.add("C");
		c.add("C++");
		c.add("Java");
		c.add("PHP");
		c.add("Android");

		btn = new Button("Show Details");
		btn.setBounds(120, 50, 100, 20);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String data = "Programming language Selected : " + c.getItem(c.getSelectedIndex());
				lbl.setText(data);
			}
		});
		
		lbl = new Label("Empty Label");
		lbl.setBounds(10, 70, 300, 30);
 
		add(c);
		add(btn);
		add(lbl);
		// Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

}
